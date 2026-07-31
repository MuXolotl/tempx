package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyCHAP extends AbstractID3v2FrameBody implements ID3v2ChapterFrameBody, ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyCHAP(String str, int i, int i2, int i3, int i4) {
        setObjectValue(DataTypes.OBJ_ELEMENT_ID, str);
        setObjectValue(DataTypes.OBJ_START_TIME, Integer.valueOf(i));
        setObjectValue(DataTypes.OBJ_END_TIME, Integer.valueOf(i2));
        setObjectValue(DataTypes.OBJ_START_OFFSET, Integer.valueOf(i3));
        setObjectValue(DataTypes.OBJ_END_OFFSET, Integer.valueOf(i4));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "CHAP";
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_ELEMENT_ID, this));
        addDataType(new NumberFixedLength(DataTypes.OBJ_START_TIME, this, 4));
        addDataType(new NumberFixedLength(DataTypes.OBJ_END_TIME, this, 4));
        addDataType(new NumberFixedLength(DataTypes.OBJ_START_OFFSET, this, 4));
        addDataType(new NumberFixedLength(DataTypes.OBJ_END_OFFSET, this, 4));
    }

    public FrameBodyCHAP(FrameBodyCHAP frameBodyCHAP) {
        super(frameBodyCHAP);
    }

    public FrameBodyCHAP() {
    }

    public FrameBodyCHAP(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyCHAP(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
