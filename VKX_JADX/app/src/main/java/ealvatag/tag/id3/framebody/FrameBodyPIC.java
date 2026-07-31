package ealvatag.tag.id3.framebody;

import defpackage.AbstractC12379l;
import defpackage.AbstractC5484l;
import defpackage.C0869l;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringFixedLength;
import ealvatag.tag.datatype.StringNullTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyPIC extends AbstractArtworkFrameBody implements ID3v22FrameBody {
    public static final String IMAGE_IS_URL = "-->";

    public FrameBodyPIC(FrameBodyAPIC frameBodyAPIC) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyAPIC.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_IMAGE_FORMAT, (String) AbstractC5484l.loadAd.get((String) frameBodyAPIC.getObjectValue(DataTypes.OBJ_MIME_TYPE)));
        setObjectValue(DataTypes.OBJ_PICTURE_DATA, frameBodyAPIC.getObjectValue(DataTypes.OBJ_PICTURE_DATA));
        setDescription(frameBodyAPIC.getDescription());
        setImageData(frameBodyAPIC.getImageData());
    }

    public String getDescription() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    public String getFormatType() {
        return (String) getObjectValue(DataTypes.OBJ_IMAGE_FORMAT);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "PIC";
    }

    @Override // ealvatag.tag.id3.framebody.AbstractArtworkFrameBody
    public byte[] getImageData() {
        return (byte[]) getObjectValue(DataTypes.OBJ_PICTURE_DATA);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractArtworkFrameBody
    public String getImageUrl() {
        return isImageUrl() ? new String((byte[]) getObjectValue(DataTypes.OBJ_PICTURE_DATA), 0, ((byte[]) getObjectValue(DataTypes.OBJ_PICTURE_DATA)).length, AbstractC12379l.loadAd) : "";
    }

    @Override // ealvatag.tag.id3.framebody.AbstractArtworkFrameBody
    public String getMimeType() {
        return (String) AbstractC5484l.yandex.get(getFormatType());
    }

    @Override // ealvatag.tag.id3.framebody.AbstractArtworkFrameBody
    public boolean isImageUrl() {
        return getFormatType() != null && getFormatType().equals("-->");
    }

    public void setDescription(String str) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
    }

    public void setImageData(byte[] bArr) {
        setObjectValue(DataTypes.OBJ_PICTURE_DATA, bArr);
    }

    public void setPictureType(byte b) {
        setObjectValue(DataTypes.OBJ_PICTURE_TYPE, Byte.valueOf(b));
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringFixedLength(DataTypes.OBJ_IMAGE_FORMAT, this, 3));
        addDataType(new NumberHashMap(DataTypes.OBJ_PICTURE_TYPE, this, 1));
        addDataType(new StringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_PICTURE_DATA, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((AbstractString) getObject(DataTypes.OBJ_DESCRIPTION)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        super.write(byteArrayOutputStream);
    }

    public FrameBodyPIC(FrameBodyPIC frameBodyPIC) {
        super(frameBodyPIC);
    }

    public FrameBodyPIC(byte b, String str, byte b2, String str2, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_IMAGE_FORMAT, str);
        setPictureType(b2);
        setDescription(str2);
        setImageData(bArr);
    }

    public FrameBodyPIC() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
    }

    public FrameBodyPIC(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyPIC(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
