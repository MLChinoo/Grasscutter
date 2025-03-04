// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DraftGuestReplyTwiceConfirmReq.proto

package emu.grasscutter.net.proto;

public final class DraftGuestReplyTwiceConfirmReqOuterClass {
  private DraftGuestReplyTwiceConfirmReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DraftGuestReplyTwiceConfirmReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DraftGuestReplyTwiceConfirmReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_agree = 1;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();

    /**
     * <code>uint32 draft_id = 5;</code>
     * @return The draftId.
     */
    int getDraftId();
  }
  /**
   * <pre>
   * CmdId: 5484
   * Obf: OBCCLMGMPGJ
   * </pre>
   *
   * Protobuf type {@code DraftGuestReplyTwiceConfirmReq}
   */
  public static final class DraftGuestReplyTwiceConfirmReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DraftGuestReplyTwiceConfirmReq)
      DraftGuestReplyTwiceConfirmReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DraftGuestReplyTwiceConfirmReq.newBuilder() to construct.
    private DraftGuestReplyTwiceConfirmReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DraftGuestReplyTwiceConfirmReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DraftGuestReplyTwiceConfirmReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DraftGuestReplyTwiceConfirmReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              isAgree_ = input.readBool();
              break;
            }
            case 40: {

              draftId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.internal_static_DraftGuestReplyTwiceConfirmReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.internal_static_DraftGuestReplyTwiceConfirmReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq.class, emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq.Builder.class);
    }

    public static final int IS_AGREE_FIELD_NUMBER = 1;
    private boolean isAgree_;
    /**
     * <code>bool is_agree = 1;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
    }

    public static final int DRAFT_ID_FIELD_NUMBER = 5;
    private int draftId_;
    /**
     * <code>uint32 draft_id = 5;</code>
     * @return The draftId.
     */
    @java.lang.Override
    public int getDraftId() {
      return draftId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (isAgree_ != false) {
        output.writeBool(1, isAgree_);
      }
      if (draftId_ != 0) {
        output.writeUInt32(5, draftId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isAgree_);
      }
      if (draftId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, draftId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq other = (emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq) obj;

      if (getIsAgree()
          != other.getIsAgree()) return false;
      if (getDraftId()
          != other.getDraftId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (37 * hash) + DRAFT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDraftId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 5484
     * Obf: OBCCLMGMPGJ
     * </pre>
     *
     * Protobuf type {@code DraftGuestReplyTwiceConfirmReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DraftGuestReplyTwiceConfirmReq)
        emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.internal_static_DraftGuestReplyTwiceConfirmReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.internal_static_DraftGuestReplyTwiceConfirmReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq.class, emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isAgree_ = false;

        draftId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.internal_static_DraftGuestReplyTwiceConfirmReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq build() {
        emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq buildPartial() {
        emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq result = new emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq(this);
        result.isAgree_ = isAgree_;
        result.draftId_ = draftId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq) {
          return mergeFrom((emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq other) {
        if (other == emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq.getDefaultInstance()) return this;
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
        }
        if (other.getDraftId() != 0) {
          setDraftId(other.getDraftId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isAgree_ ;
      /**
       * <code>bool is_agree = 1;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool is_agree = 1;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agree = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        
        isAgree_ = false;
        onChanged();
        return this;
      }

      private int draftId_ ;
      /**
       * <code>uint32 draft_id = 5;</code>
       * @return The draftId.
       */
      @java.lang.Override
      public int getDraftId() {
        return draftId_;
      }
      /**
       * <code>uint32 draft_id = 5;</code>
       * @param value The draftId to set.
       * @return This builder for chaining.
       */
      public Builder setDraftId(int value) {
        
        draftId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 draft_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDraftId() {
        
        draftId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DraftGuestReplyTwiceConfirmReq)
    }

    // @@protoc_insertion_point(class_scope:DraftGuestReplyTwiceConfirmReq)
    private static final emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq();
    }

    public static emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DraftGuestReplyTwiceConfirmReq>
        PARSER = new com.google.protobuf.AbstractParser<DraftGuestReplyTwiceConfirmReq>() {
      @java.lang.Override
      public DraftGuestReplyTwiceConfirmReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DraftGuestReplyTwiceConfirmReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DraftGuestReplyTwiceConfirmReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DraftGuestReplyTwiceConfirmReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DraftGuestReplyTwiceConfirmReqOuterClass.DraftGuestReplyTwiceConfirmReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DraftGuestReplyTwiceConfirmReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DraftGuestReplyTwiceConfirmReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$DraftGuestReplyTwiceConfirmReq.proto\"D" +
      "\n\036DraftGuestReplyTwiceConfirmReq\022\020\n\010is_a" +
      "gree\030\001 \001(\010\022\020\n\010draft_id\030\005 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DraftGuestReplyTwiceConfirmReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DraftGuestReplyTwiceConfirmReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DraftGuestReplyTwiceConfirmReq_descriptor,
        new java.lang.String[] { "IsAgree", "DraftId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
