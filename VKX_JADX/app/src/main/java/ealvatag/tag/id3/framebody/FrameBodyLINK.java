package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.StringFixedLength;
import ealvatag.tag.datatype.StringNullTerminated;
import ealvatag.tag.datatype.StringSizeTerminated;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyLINK extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyLINK(String str, String str2, String str3) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
        setObjectValue(DataTypes.OBJ_URL, str2);
        setObjectValue(DataTypes.OBJ_ID, str3);
    }

    public String getAdditionalData() {
        return (String) getObjectValue(DataTypes.OBJ_ID);
    }

    public String getFrameIdentifier() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "LINK";
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new StringFixedLength(DataTypes.OBJ_DESCRIPTION, this, 4));
        addDataType(new StringNullTerminated(DataTypes.OBJ_URL, this));
        addDataType(new StringSizeTerminated(DataTypes.OBJ_ID, this));
    }

    public void getAdditionalData(String str) {
        setObjectValue(DataTypes.OBJ_ID, str);
    }

    public void getFrameIdentifier(String str) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
    }

    public FrameBodyLINK(FrameBodyLINK frameBodyLINK) {
        super(frameBodyLINK);
    }

    public FrameBodyLINK() {
    }

    public FrameBodyLINK(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyLINK(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
