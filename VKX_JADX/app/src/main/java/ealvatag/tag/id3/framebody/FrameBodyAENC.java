package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyAENC extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyAENC() {
        setObjectValue(DataTypes.OBJ_OWNER, "");
        setObjectValue(DataTypes.OBJ_PREVIEW_START, (short) 0);
        setObjectValue(DataTypes.OBJ_PREVIEW_LENGTH, (short) 0);
        setObjectValue(DataTypes.OBJ_ENCRYPTION_INFO, new byte[0]);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "AENC";
    }

    public String getOwner() {
        return (String) getObjectValue(DataTypes.OBJ_OWNER);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_OWNER, this));
        addDataType(new NumberFixedLength(DataTypes.OBJ_PREVIEW_START, this, 2));
        addDataType(new NumberFixedLength(DataTypes.OBJ_PREVIEW_LENGTH, this, 2));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_ENCRYPTION_INFO, this));
    }

    public void getOwner(String str) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
    }

    public FrameBodyAENC(FrameBodyAENC frameBodyAENC) {
        super(frameBodyAENC);
    }

    public FrameBodyAENC(String str, short s, short s2, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
        setObjectValue(DataTypes.OBJ_PREVIEW_START, Short.valueOf(s));
        setObjectValue(DataTypes.OBJ_PREVIEW_LENGTH, Short.valueOf(s2));
        setObjectValue(DataTypes.OBJ_ENCRYPTION_INFO, bArr);
    }

    public FrameBodyAENC(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyAENC(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
