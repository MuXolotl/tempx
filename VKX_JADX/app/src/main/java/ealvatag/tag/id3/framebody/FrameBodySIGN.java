package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodySIGN extends AbstractID3v2FrameBody implements ID3v24FrameBody {
    public FrameBodySIGN(byte b, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_GROUP_SYMBOL, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_SIGNATURE, bArr);
    }

    public byte getGroupSymbol() {
        if (getObjectValue(DataTypes.OBJ_GROUP_SYMBOL) != null) {
            return ((Byte) getObjectValue(DataTypes.OBJ_GROUP_SYMBOL)).byteValue();
        }
        return (byte) 0;
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "SIGN";
    }

    public byte[] getSignature() {
        return (byte[]) getObjectValue(DataTypes.OBJ_SIGNATURE);
    }

    public void setGroupSymbol(byte b) {
        setObjectValue(DataTypes.OBJ_GROUP_SYMBOL, Byte.valueOf(b));
    }

    public void setSignature(byte[] bArr) {
        setObjectValue(DataTypes.OBJ_SIGNATURE, bArr);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberFixedLength(DataTypes.OBJ_GROUP_SYMBOL, this, 1));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_SIGNATURE, this));
    }

    public FrameBodySIGN(FrameBodySIGN frameBodySIGN) {
        super(frameBodySIGN);
    }

    public FrameBodySIGN() {
    }

    public FrameBodySIGN(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
