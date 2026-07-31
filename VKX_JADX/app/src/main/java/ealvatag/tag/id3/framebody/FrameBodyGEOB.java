package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringNullTerminated;
import ealvatag.tag.datatype.TextEncodedStringNullTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyGEOB extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyGEOB() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_MIME_TYPE, "");
        setObjectValue(DataTypes.OBJ_FILENAME, "");
        setObjectValue(DataTypes.OBJ_DESCRIPTION, "");
        setObjectValue(DataTypes.OBJ_DATA, new byte[0]);
    }

    public String getDescription() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "GEOB";
    }

    public void setDescription(String str) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringNullTerminated(DataTypes.OBJ_MIME_TYPE, this));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_FILENAME, this));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((AbstractString) getObject(DataTypes.OBJ_FILENAME)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        if (!((AbstractString) getObject(DataTypes.OBJ_DESCRIPTION)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        super.write(byteArrayOutputStream);
    }

    public FrameBodyGEOB(FrameBodyGEOB frameBodyGEOB) {
        super(frameBodyGEOB);
    }

    public FrameBodyGEOB(byte b, String str, String str2, String str3, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_MIME_TYPE, str);
        setObjectValue(DataTypes.OBJ_FILENAME, str2);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str3);
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    public FrameBodyGEOB(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyGEOB(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
