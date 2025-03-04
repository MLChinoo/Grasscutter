// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeExchangeWoodRsp.proto

package emu.grasscutter.net.proto;

public final class HomeExchangeWoodRspOuterClass {
  private HomeExchangeWoodRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeExchangeWoodRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeExchangeWoodRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 DKKLDFNFCCG = 13;</code>
     * @return The dKKLDFNFCCG.
     */
    int getDKKLDFNFCCG();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 HMFHNIBDNOC = 14;</code>
     * @return The hMFHNIBDNOC.
     */
    int getHMFHNIBDNOC();

    /**
     * <code>uint32 wood_id = 12;</code>
     * @return The woodId.
     */
    int getWoodId();
  }
  /**
   * <pre>
   * CmdId: 4802
   * Obf: LDAKLIJFKLE
   * </pre>
   *
   * Protobuf type {@code HomeExchangeWoodRsp}
   */
  public static final class HomeExchangeWoodRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeExchangeWoodRsp)
      HomeExchangeWoodRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeExchangeWoodRsp.newBuilder() to construct.
    private HomeExchangeWoodRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeExchangeWoodRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeExchangeWoodRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeExchangeWoodRsp(
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
            case 32: {

              retcode_ = input.readInt32();
              break;
            }
            case 96: {

              woodId_ = input.readUInt32();
              break;
            }
            case 104: {

              dKKLDFNFCCG_ = input.readUInt32();
              break;
            }
            case 112: {

              hMFHNIBDNOC_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.internal_static_HomeExchangeWoodRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.internal_static_HomeExchangeWoodRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.class, emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.Builder.class);
    }

    public static final int DKKLDFNFCCG_FIELD_NUMBER = 13;
    private int dKKLDFNFCCG_;
    /**
     * <code>uint32 DKKLDFNFCCG = 13;</code>
     * @return The dKKLDFNFCCG.
     */
    @java.lang.Override
    public int getDKKLDFNFCCG() {
      return dKKLDFNFCCG_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int HMFHNIBDNOC_FIELD_NUMBER = 14;
    private int hMFHNIBDNOC_;
    /**
     * <code>uint32 HMFHNIBDNOC = 14;</code>
     * @return The hMFHNIBDNOC.
     */
    @java.lang.Override
    public int getHMFHNIBDNOC() {
      return hMFHNIBDNOC_;
    }

    public static final int WOOD_ID_FIELD_NUMBER = 12;
    private int woodId_;
    /**
     * <code>uint32 wood_id = 12;</code>
     * @return The woodId.
     */
    @java.lang.Override
    public int getWoodId() {
      return woodId_;
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
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (woodId_ != 0) {
        output.writeUInt32(12, woodId_);
      }
      if (dKKLDFNFCCG_ != 0) {
        output.writeUInt32(13, dKKLDFNFCCG_);
      }
      if (hMFHNIBDNOC_ != 0) {
        output.writeUInt32(14, hMFHNIBDNOC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      if (woodId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, woodId_);
      }
      if (dKKLDFNFCCG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, dKKLDFNFCCG_);
      }
      if (hMFHNIBDNOC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, hMFHNIBDNOC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp other = (emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp) obj;

      if (getDKKLDFNFCCG()
          != other.getDKKLDFNFCCG()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getHMFHNIBDNOC()
          != other.getHMFHNIBDNOC()) return false;
      if (getWoodId()
          != other.getWoodId()) return false;
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
      hash = (37 * hash) + DKKLDFNFCCG_FIELD_NUMBER;
      hash = (53 * hash) + getDKKLDFNFCCG();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + HMFHNIBDNOC_FIELD_NUMBER;
      hash = (53 * hash) + getHMFHNIBDNOC();
      hash = (37 * hash) + WOOD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWoodId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp prototype) {
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
     * CmdId: 4802
     * Obf: LDAKLIJFKLE
     * </pre>
     *
     * Protobuf type {@code HomeExchangeWoodRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeExchangeWoodRsp)
        emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.internal_static_HomeExchangeWoodRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.internal_static_HomeExchangeWoodRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.class, emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.newBuilder()
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
        dKKLDFNFCCG_ = 0;

        retcode_ = 0;

        hMFHNIBDNOC_ = 0;

        woodId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.internal_static_HomeExchangeWoodRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp build() {
        emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp buildPartial() {
        emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp result = new emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp(this);
        result.dKKLDFNFCCG_ = dKKLDFNFCCG_;
        result.retcode_ = retcode_;
        result.hMFHNIBDNOC_ = hMFHNIBDNOC_;
        result.woodId_ = woodId_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp other) {
        if (other == emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.getDefaultInstance()) return this;
        if (other.getDKKLDFNFCCG() != 0) {
          setDKKLDFNFCCG(other.getDKKLDFNFCCG());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getHMFHNIBDNOC() != 0) {
          setHMFHNIBDNOC(other.getHMFHNIBDNOC());
        }
        if (other.getWoodId() != 0) {
          setWoodId(other.getWoodId());
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
        emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dKKLDFNFCCG_ ;
      /**
       * <code>uint32 DKKLDFNFCCG = 13;</code>
       * @return The dKKLDFNFCCG.
       */
      @java.lang.Override
      public int getDKKLDFNFCCG() {
        return dKKLDFNFCCG_;
      }
      /**
       * <code>uint32 DKKLDFNFCCG = 13;</code>
       * @param value The dKKLDFNFCCG to set.
       * @return This builder for chaining.
       */
      public Builder setDKKLDFNFCCG(int value) {
        
        dKKLDFNFCCG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DKKLDFNFCCG = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearDKKLDFNFCCG() {
        
        dKKLDFNFCCG_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int hMFHNIBDNOC_ ;
      /**
       * <code>uint32 HMFHNIBDNOC = 14;</code>
       * @return The hMFHNIBDNOC.
       */
      @java.lang.Override
      public int getHMFHNIBDNOC() {
        return hMFHNIBDNOC_;
      }
      /**
       * <code>uint32 HMFHNIBDNOC = 14;</code>
       * @param value The hMFHNIBDNOC to set.
       * @return This builder for chaining.
       */
      public Builder setHMFHNIBDNOC(int value) {
        
        hMFHNIBDNOC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HMFHNIBDNOC = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearHMFHNIBDNOC() {
        
        hMFHNIBDNOC_ = 0;
        onChanged();
        return this;
      }

      private int woodId_ ;
      /**
       * <code>uint32 wood_id = 12;</code>
       * @return The woodId.
       */
      @java.lang.Override
      public int getWoodId() {
        return woodId_;
      }
      /**
       * <code>uint32 wood_id = 12;</code>
       * @param value The woodId to set.
       * @return This builder for chaining.
       */
      public Builder setWoodId(int value) {
        
        woodId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wood_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearWoodId() {
        
        woodId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeExchangeWoodRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeExchangeWoodRsp)
    private static final emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp();
    }

    public static emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeExchangeWoodRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeExchangeWoodRsp>() {
      @java.lang.Override
      public HomeExchangeWoodRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeExchangeWoodRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeExchangeWoodRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeExchangeWoodRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeExchangeWoodRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeExchangeWoodRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031HomeExchangeWoodRsp.proto\"a\n\023HomeExcha" +
      "ngeWoodRsp\022\023\n\013DKKLDFNFCCG\030\r \001(\r\022\017\n\007retco" +
      "de\030\004 \001(\005\022\023\n\013HMFHNIBDNOC\030\016 \001(\r\022\017\n\007wood_id" +
      "\030\014 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeExchangeWoodRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeExchangeWoodRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeExchangeWoodRsp_descriptor,
        new java.lang.String[] { "DKKLDFNFCCG", "Retcode", "HMFHNIBDNOC", "WoodId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
