package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.NumberVariableLength;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyPOSS extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyPOSS(byte b, long j) {
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_POSITION, Long.valueOf(j));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "POSS";
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TIME_STAMP_FORMAT, this, 1));
        addDataType(new NumberVariableLength(DataTypes.OBJ_POSITION, this, 1));
    }

    public FrameBodyPOSS(FrameBodyPOSS frameBodyPOSS) {
        super(frameBodyPOSS);
    }

    public FrameBodyPOSS() {
    }

    public FrameBodyPOSS(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyPOSS(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
