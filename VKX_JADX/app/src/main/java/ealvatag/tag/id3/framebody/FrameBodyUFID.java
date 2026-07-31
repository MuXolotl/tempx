package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyUFID extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public static final String UFID_ID3TEST = "http://www.id3.com/dummy/ufid.html";
    public static final String UFID_MUSICBRAINZ = "http://musicbrainz.com";

    public FrameBodyUFID() {
        setOwner("");
        setUniqueIdentifier(new byte[0]);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "UFID";
    }

    public String getOwner() {
        return (String) getObjectValue(DataTypes.OBJ_OWNER);
    }

    public byte[] getUniqueIdentifier() {
        return (byte[]) getObjectValue(DataTypes.OBJ_DATA);
    }

    public void setOwner(String str) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
    }

    public void setUniqueIdentifier(byte[] bArr) {
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_OWNER, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }

    public FrameBodyUFID(FrameBodyUFID frameBodyUFID) {
        super(frameBodyUFID);
    }

    public FrameBodyUFID(String str, byte[] bArr) {
        setOwner(str);
        setUniqueIdentifier(bArr);
    }

    public FrameBodyUFID(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyUFID(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
