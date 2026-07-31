package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyPRIV extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyPRIV() {
        setObjectValue(DataTypes.OBJ_OWNER, "");
        setObjectValue(DataTypes.OBJ_DATA, new byte[0]);
    }

    public byte[] getData() {
        return (byte[]) getObjectValue(DataTypes.OBJ_DATA);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "PRIV";
    }

    public String getOwner() {
        return (String) getObjectValue(DataTypes.OBJ_OWNER);
    }

    public void setData(byte[] bArr) {
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    public void setOwner(String str) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_OWNER, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }

    public FrameBodyPRIV(FrameBodyPRIV frameBodyPRIV) {
        super(frameBodyPRIV);
    }

    public FrameBodyPRIV(String str, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    public FrameBodyPRIV(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyPRIV(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
