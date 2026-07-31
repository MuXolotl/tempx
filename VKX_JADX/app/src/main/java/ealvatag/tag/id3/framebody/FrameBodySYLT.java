package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringHashMap;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodySYLT extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodySYLT(int i, String str, int i2, int i3, String str2, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Integer.valueOf(i));
        setObjectValue(DataTypes.OBJ_LANGUAGE, str);
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, Integer.valueOf(i2));
        setObjectValue(DataTypes.OBJ_CONTENT_TYPE, Integer.valueOf(i3));
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str2);
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    public int getContentType() {
        return ((Number) getObjectValue(DataTypes.OBJ_CONTENT_TYPE)).intValue();
    }

    public String getDescription() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "SYLT";
    }

    public String getLanguage() {
        return (String) getObjectValue(DataTypes.OBJ_LANGUAGE);
    }

    public byte[] getLyrics() {
        return (byte[]) getObjectValue(DataTypes.OBJ_DATA);
    }

    public int getTimeStampFormat() {
        return ((Number) getObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT)).intValue();
    }

    public void setLyrics(byte[] bArr) {
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringHashMap(DataTypes.OBJ_LANGUAGE, this, 3));
        addDataType(new NumberHashMap(DataTypes.OBJ_TIME_STAMP_FORMAT, this, 1));
        addDataType(new NumberHashMap(DataTypes.OBJ_CONTENT_TYPE, this, 1));
        addDataType(new StringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }

    public FrameBodySYLT(FrameBodySYLT frameBodySYLT) {
        super(frameBodySYLT);
    }

    public FrameBodySYLT() {
    }

    public FrameBodySYLT(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodySYLT(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
