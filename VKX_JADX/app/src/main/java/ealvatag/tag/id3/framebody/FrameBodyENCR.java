package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyENCR extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyENCR() {
        setObjectValue(DataTypes.OBJ_OWNER, "");
        setObjectValue(DataTypes.OBJ_METHOD_SYMBOL, (byte) 0);
        setObjectValue(DataTypes.OBJ_ENCRYPTION_INFO, new byte[0]);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "ENCR";
    }

    public String getOwner() {
        return (String) getObjectValue(DataTypes.OBJ_OWNER);
    }

    public void setOwner(String str) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_OWNER, this));
        addDataType(new NumberFixedLength(DataTypes.OBJ_METHOD_SYMBOL, this, 1));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_ENCRYPTION_INFO, this));
    }

    public FrameBodyENCR(FrameBodyENCR frameBodyENCR) {
        super(frameBodyENCR);
    }

    public FrameBodyENCR(String str, byte b, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
        setObjectValue(DataTypes.OBJ_METHOD_SYMBOL, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_ENCRYPTION_INFO, bArr);
    }

    public FrameBodyENCR(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyENCR(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
