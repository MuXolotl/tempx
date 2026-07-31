package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberVariableLength;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyPCNT extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private static final int COUNTER_MINIMUM_FIELD_SIZE = 4;

    public FrameBodyPCNT() {
        setObjectValue(DataTypes.OBJ_NUMBER, 0L);
    }

    public long getCounter() {
        return ((Number) getObjectValue(DataTypes.OBJ_NUMBER)).longValue();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "PCNT";
    }

    public void setCounter(long j) {
        setObjectValue(DataTypes.OBJ_NUMBER, Long.valueOf(j));
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberVariableLength(DataTypes.OBJ_NUMBER, this, 4));
    }

    public FrameBodyPCNT(FrameBodyPCNT frameBodyPCNT) {
        super(frameBodyPCNT);
    }

    public FrameBodyPCNT(long j) {
        setObjectValue(DataTypes.OBJ_NUMBER, Long.valueOf(j));
    }

    public FrameBodyPCNT(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyPCNT(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
