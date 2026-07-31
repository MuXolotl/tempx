package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyCRM extends AbstractID3v2FrameBody implements ID3v22FrameBody {
    public FrameBodyCRM(String str, String str2, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str2);
        setObjectValue(DataTypes.OBJ_ENCRYPTED_DATABLOCK, bArr);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "CRM";
    }

    public String getOwner() {
        return (String) getObjectValue(DataTypes.OBJ_OWNER);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_OWNER, this));
        addDataType(new StringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_ENCRYPTED_DATABLOCK, this));
    }

    public void getOwner(String str) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
    }

    public FrameBodyCRM(FrameBodyCRM frameBodyCRM) {
        super(frameBodyCRM);
    }

    public FrameBodyCRM() {
    }

    public FrameBodyCRM(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyCRM(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
