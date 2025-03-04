// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldGalleryChallengeInfoNotify.proto

package emu.grasscutter.net.proto;

public final class WindFieldGalleryChallengeInfoNotifyOuterClass {
  private WindFieldGalleryChallengeInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindFieldGalleryChallengeInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindFieldGalleryChallengeInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 CNLIBIEBLKC = 15;</code>
     * @return The cNLIBIEBLKC.
     */
    int getCNLIBIEBLKC();

    /**
     * <code>uint32 JGDMJDMFAAE = 13;</code>
     * @return The jGDMJDMFAAE.
     */
    int getJGDMJDMFAAE();

    /**
     * <code>bool is_start = 5;</code>
     * @return The isStart.
     */
    boolean getIsStart();

    /**
     * <code>uint32 JBMNGNMJHME = 1;</code>
     * @return The jBMNGNMJHME.
     */
    int getJBMNGNMJHME();

    /**
     * <code>uint32 MAAGMCEBIDE = 9;</code>
     * @return The mAAGMCEBIDE.
     */
    int getMAAGMCEBIDE();

    /**
     * <code>uint32 FAKKJNHNFIO = 14;</code>
     * @return The fAKKJNHNFIO.
     */
    int getFAKKJNHNFIO();
  }
  /**
   * <pre>
   * CmdId: 5536
   * Obf: FBDCHCNNNMC
   * </pre>
   *
   * Protobuf type {@code WindFieldGalleryChallengeInfoNotify}
   */
  public static final class WindFieldGalleryChallengeInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindFieldGalleryChallengeInfoNotify)
      WindFieldGalleryChallengeInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindFieldGalleryChallengeInfoNotify.newBuilder() to construct.
    private WindFieldGalleryChallengeInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindFieldGalleryChallengeInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindFieldGalleryChallengeInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WindFieldGalleryChallengeInfoNotify(
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

              jBMNGNMJHME_ = input.readUInt32();
              break;
            }
            case 40: {

              isStart_ = input.readBool();
              break;
            }
            case 72: {

              mAAGMCEBIDE_ = input.readUInt32();
              break;
            }
            case 96: {

              isSuccess_ = input.readBool();
              break;
            }
            case 104: {

              jGDMJDMFAAE_ = input.readUInt32();
              break;
            }
            case 112: {

              fAKKJNHNFIO_ = input.readUInt32();
              break;
            }
            case 120: {

              cNLIBIEBLKC_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.class, emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 12;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int CNLIBIEBLKC_FIELD_NUMBER = 15;
    private int cNLIBIEBLKC_;
    /**
     * <code>uint32 CNLIBIEBLKC = 15;</code>
     * @return The cNLIBIEBLKC.
     */
    @java.lang.Override
    public int getCNLIBIEBLKC() {
      return cNLIBIEBLKC_;
    }

    public static final int JGDMJDMFAAE_FIELD_NUMBER = 13;
    private int jGDMJDMFAAE_;
    /**
     * <code>uint32 JGDMJDMFAAE = 13;</code>
     * @return The jGDMJDMFAAE.
     */
    @java.lang.Override
    public int getJGDMJDMFAAE() {
      return jGDMJDMFAAE_;
    }

    public static final int IS_START_FIELD_NUMBER = 5;
    private boolean isStart_;
    /**
     * <code>bool is_start = 5;</code>
     * @return The isStart.
     */
    @java.lang.Override
    public boolean getIsStart() {
      return isStart_;
    }

    public static final int JBMNGNMJHME_FIELD_NUMBER = 1;
    private int jBMNGNMJHME_;
    /**
     * <code>uint32 JBMNGNMJHME = 1;</code>
     * @return The jBMNGNMJHME.
     */
    @java.lang.Override
    public int getJBMNGNMJHME() {
      return jBMNGNMJHME_;
    }

    public static final int MAAGMCEBIDE_FIELD_NUMBER = 9;
    private int mAAGMCEBIDE_;
    /**
     * <code>uint32 MAAGMCEBIDE = 9;</code>
     * @return The mAAGMCEBIDE.
     */
    @java.lang.Override
    public int getMAAGMCEBIDE() {
      return mAAGMCEBIDE_;
    }

    public static final int FAKKJNHNFIO_FIELD_NUMBER = 14;
    private int fAKKJNHNFIO_;
    /**
     * <code>uint32 FAKKJNHNFIO = 14;</code>
     * @return The fAKKJNHNFIO.
     */
    @java.lang.Override
    public int getFAKKJNHNFIO() {
      return fAKKJNHNFIO_;
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
      if (jBMNGNMJHME_ != 0) {
        output.writeUInt32(1, jBMNGNMJHME_);
      }
      if (isStart_ != false) {
        output.writeBool(5, isStart_);
      }
      if (mAAGMCEBIDE_ != 0) {
        output.writeUInt32(9, mAAGMCEBIDE_);
      }
      if (isSuccess_ != false) {
        output.writeBool(12, isSuccess_);
      }
      if (jGDMJDMFAAE_ != 0) {
        output.writeUInt32(13, jGDMJDMFAAE_);
      }
      if (fAKKJNHNFIO_ != 0) {
        output.writeUInt32(14, fAKKJNHNFIO_);
      }
      if (cNLIBIEBLKC_ != 0) {
        output.writeUInt32(15, cNLIBIEBLKC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jBMNGNMJHME_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, jBMNGNMJHME_);
      }
      if (isStart_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isStart_);
      }
      if (mAAGMCEBIDE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, mAAGMCEBIDE_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isSuccess_);
      }
      if (jGDMJDMFAAE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, jGDMJDMFAAE_);
      }
      if (fAKKJNHNFIO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, fAKKJNHNFIO_);
      }
      if (cNLIBIEBLKC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, cNLIBIEBLKC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify other = (emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify) obj;

      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getCNLIBIEBLKC()
          != other.getCNLIBIEBLKC()) return false;
      if (getJGDMJDMFAAE()
          != other.getJGDMJDMFAAE()) return false;
      if (getIsStart()
          != other.getIsStart()) return false;
      if (getJBMNGNMJHME()
          != other.getJBMNGNMJHME()) return false;
      if (getMAAGMCEBIDE()
          != other.getMAAGMCEBIDE()) return false;
      if (getFAKKJNHNFIO()
          != other.getFAKKJNHNFIO()) return false;
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
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + CNLIBIEBLKC_FIELD_NUMBER;
      hash = (53 * hash) + getCNLIBIEBLKC();
      hash = (37 * hash) + JGDMJDMFAAE_FIELD_NUMBER;
      hash = (53 * hash) + getJGDMJDMFAAE();
      hash = (37 * hash) + IS_START_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStart());
      hash = (37 * hash) + JBMNGNMJHME_FIELD_NUMBER;
      hash = (53 * hash) + getJBMNGNMJHME();
      hash = (37 * hash) + MAAGMCEBIDE_FIELD_NUMBER;
      hash = (53 * hash) + getMAAGMCEBIDE();
      hash = (37 * hash) + FAKKJNHNFIO_FIELD_NUMBER;
      hash = (53 * hash) + getFAKKJNHNFIO();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify prototype) {
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
     * CmdId: 5536
     * Obf: FBDCHCNNNMC
     * </pre>
     *
     * Protobuf type {@code WindFieldGalleryChallengeInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindFieldGalleryChallengeInfoNotify)
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.class, emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.newBuilder()
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
        isSuccess_ = false;

        cNLIBIEBLKC_ = 0;

        jGDMJDMFAAE_ = 0;

        isStart_ = false;

        jBMNGNMJHME_ = 0;

        mAAGMCEBIDE_ = 0;

        fAKKJNHNFIO_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify build() {
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify buildPartial() {
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify result = new emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify(this);
        result.isSuccess_ = isSuccess_;
        result.cNLIBIEBLKC_ = cNLIBIEBLKC_;
        result.jGDMJDMFAAE_ = jGDMJDMFAAE_;
        result.isStart_ = isStart_;
        result.jBMNGNMJHME_ = jBMNGNMJHME_;
        result.mAAGMCEBIDE_ = mAAGMCEBIDE_;
        result.fAKKJNHNFIO_ = fAKKJNHNFIO_;
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
        if (other instanceof emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify other) {
        if (other == emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.getDefaultInstance()) return this;
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getCNLIBIEBLKC() != 0) {
          setCNLIBIEBLKC(other.getCNLIBIEBLKC());
        }
        if (other.getJGDMJDMFAAE() != 0) {
          setJGDMJDMFAAE(other.getJGDMJDMFAAE());
        }
        if (other.getIsStart() != false) {
          setIsStart(other.getIsStart());
        }
        if (other.getJBMNGNMJHME() != 0) {
          setJBMNGNMJHME(other.getJBMNGNMJHME());
        }
        if (other.getMAAGMCEBIDE() != 0) {
          setMAAGMCEBIDE(other.getMAAGMCEBIDE());
        }
        if (other.getFAKKJNHNFIO() != 0) {
          setFAKKJNHNFIO(other.getFAKKJNHNFIO());
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
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 12;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int cNLIBIEBLKC_ ;
      /**
       * <code>uint32 CNLIBIEBLKC = 15;</code>
       * @return The cNLIBIEBLKC.
       */
      @java.lang.Override
      public int getCNLIBIEBLKC() {
        return cNLIBIEBLKC_;
      }
      /**
       * <code>uint32 CNLIBIEBLKC = 15;</code>
       * @param value The cNLIBIEBLKC to set.
       * @return This builder for chaining.
       */
      public Builder setCNLIBIEBLKC(int value) {
        
        cNLIBIEBLKC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CNLIBIEBLKC = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCNLIBIEBLKC() {
        
        cNLIBIEBLKC_ = 0;
        onChanged();
        return this;
      }

      private int jGDMJDMFAAE_ ;
      /**
       * <code>uint32 JGDMJDMFAAE = 13;</code>
       * @return The jGDMJDMFAAE.
       */
      @java.lang.Override
      public int getJGDMJDMFAAE() {
        return jGDMJDMFAAE_;
      }
      /**
       * <code>uint32 JGDMJDMFAAE = 13;</code>
       * @param value The jGDMJDMFAAE to set.
       * @return This builder for chaining.
       */
      public Builder setJGDMJDMFAAE(int value) {
        
        jGDMJDMFAAE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JGDMJDMFAAE = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearJGDMJDMFAAE() {
        
        jGDMJDMFAAE_ = 0;
        onChanged();
        return this;
      }

      private boolean isStart_ ;
      /**
       * <code>bool is_start = 5;</code>
       * @return The isStart.
       */
      @java.lang.Override
      public boolean getIsStart() {
        return isStart_;
      }
      /**
       * <code>bool is_start = 5;</code>
       * @param value The isStart to set.
       * @return This builder for chaining.
       */
      public Builder setIsStart(boolean value) {
        
        isStart_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_start = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsStart() {
        
        isStart_ = false;
        onChanged();
        return this;
      }

      private int jBMNGNMJHME_ ;
      /**
       * <code>uint32 JBMNGNMJHME = 1;</code>
       * @return The jBMNGNMJHME.
       */
      @java.lang.Override
      public int getJBMNGNMJHME() {
        return jBMNGNMJHME_;
      }
      /**
       * <code>uint32 JBMNGNMJHME = 1;</code>
       * @param value The jBMNGNMJHME to set.
       * @return This builder for chaining.
       */
      public Builder setJBMNGNMJHME(int value) {
        
        jBMNGNMJHME_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JBMNGNMJHME = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearJBMNGNMJHME() {
        
        jBMNGNMJHME_ = 0;
        onChanged();
        return this;
      }

      private int mAAGMCEBIDE_ ;
      /**
       * <code>uint32 MAAGMCEBIDE = 9;</code>
       * @return The mAAGMCEBIDE.
       */
      @java.lang.Override
      public int getMAAGMCEBIDE() {
        return mAAGMCEBIDE_;
      }
      /**
       * <code>uint32 MAAGMCEBIDE = 9;</code>
       * @param value The mAAGMCEBIDE to set.
       * @return This builder for chaining.
       */
      public Builder setMAAGMCEBIDE(int value) {
        
        mAAGMCEBIDE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MAAGMCEBIDE = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMAAGMCEBIDE() {
        
        mAAGMCEBIDE_ = 0;
        onChanged();
        return this;
      }

      private int fAKKJNHNFIO_ ;
      /**
       * <code>uint32 FAKKJNHNFIO = 14;</code>
       * @return The fAKKJNHNFIO.
       */
      @java.lang.Override
      public int getFAKKJNHNFIO() {
        return fAKKJNHNFIO_;
      }
      /**
       * <code>uint32 FAKKJNHNFIO = 14;</code>
       * @param value The fAKKJNHNFIO to set.
       * @return This builder for chaining.
       */
      public Builder setFAKKJNHNFIO(int value) {
        
        fAKKJNHNFIO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FAKKJNHNFIO = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFAKKJNHNFIO() {
        
        fAKKJNHNFIO_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WindFieldGalleryChallengeInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:WindFieldGalleryChallengeInfoNotify)
    private static final emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify();
    }

    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindFieldGalleryChallengeInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<WindFieldGalleryChallengeInfoNotify>() {
      @java.lang.Override
      public WindFieldGalleryChallengeInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WindFieldGalleryChallengeInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WindFieldGalleryChallengeInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindFieldGalleryChallengeInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)WindFieldGalleryChallengeInfoNotify.pr" +
      "oto\"\264\001\n#WindFieldGalleryChallengeInfoNot" +
      "ify\022\022\n\nis_success\030\014 \001(\010\022\023\n\013CNLIBIEBLKC\030\017" +
      " \001(\r\022\023\n\013JGDMJDMFAAE\030\r \001(\r\022\020\n\010is_start\030\005 " +
      "\001(\010\022\023\n\013JBMNGNMJHME\030\001 \001(\r\022\023\n\013MAAGMCEBIDE\030" +
      "\t \001(\r\022\023\n\013FAKKJNHNFIO\030\016 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WindFieldGalleryChallengeInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindFieldGalleryChallengeInfoNotify_descriptor,
        new java.lang.String[] { "IsSuccess", "CNLIBIEBLKC", "JGDMJDMFAAE", "IsStart", "JBMNGNMJHME", "MAAGMCEBIDE", "FAKKJNHNFIO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
