package emu.grasscutter.command.commands;

import static emu.grasscutter.utils.Language.translate;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.GameQuest;

import java.util.List;

@Command(
        label = "quest",
        aliases = {"q"},
        usage = {"(add|finish) [<questId>]"},
        permission = "player.quest",
        permissionTargeted = "player.quest.others")
public final class QuestCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.size() != 2) {
            sendUsageMessage(sender);
            return;
        }

        String cmd = args.get(0).toLowerCase();
        int questId;

        try {
            questId = Integer.parseInt(args.get(1));
        } catch (Exception e) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.quest.invalid_id"));
            return;
        }

        switch (cmd) {
            case "add" -> {
                GameQuest quest = targetPlayer.getQuestManager().addQuest(questId);

                if (quest != null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.quest.added", questId));
                    return;
                }

                CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
            }
            case "finish" -> {
                GameQuest quest = targetPlayer.getQuestManager().getQuestById(questId);

                if (quest == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
                    return;
                }

                quest.finish();

                CommandHandler.sendMessage(sender, translate(sender, "commands.quest.finished", questId));
            }
            case "running" -> {
                var quest = targetPlayer.getQuestManager().getQuestById(questId);
                if (quest == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
                    return;
                }

                CommandHandler.sendMessage(sender, translate(sender, "commands.quest.running",
                    questId, translate(sender, switch(quest.state) {
                        case QUEST_STATE_NONE, NONE -> "commands.quest.state.none";
                        case QUEST_STATE_UNSTARTED, UNSTARTED -> "commands.quest.state.unstarted";
                        case QUEST_STATE_UNFINISHED, UNFINISHED -> "commands.quest.state.unfinished";
                        case QUEST_STATE_FINISHED, FINISHED -> "commands.quest.state.finished";
                        case QUEST_STATE_FAILED, FAILED -> "commands.quest.state.failed";
                    }), quest.getState().getValue())
                );
            }
            case "talking" -> {
                var mainQuest = targetPlayer.getQuestManager().getMainQuestByTalkId(questId);
                if (mainQuest == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
                    return;
                }

                var talk = mainQuest.getTalks().get(questId);
                CommandHandler.sendMessage(sender, translate(sender, "commands.quest.talking",
                    questId, translate(sender, "commands.quest.state." + (talk == null ? "not_exists" : "exists")),
                    mainQuest.getParentQuestId(), mainQuest.getState().getValue()));
            }
            default -> this.sendUsageMessage(sender);
        }
    }
}
