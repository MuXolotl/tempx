package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.NumberFixedLength;
import ealvatag.tag.datatype.NumberVariableLength;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyASPI extends AbstractID3v2FrameBody implements ID3v24FrameBody {
    private static final String BITS_PER_INDEX_POINT = "BitsPerIndexPoint";
    private static final int BITS_PER_INDEX_POINTS_FIELD_SIZE = 1;
    private static final int DATA_LENGTH_FIELD_SIZE = 4;
    private static final int DATA_START_FIELD_SIZE = 4;
    private static final String FRACTION_AT_INDEX = "FractionAtIndex";
    private static final int FRACTION_AT_INDEX_MINIMUM_FIELD_SIZE = 1;
    private static final String INDEXED_DATA_LENGTH = "IndexedDataLength";
    private static final String INDEXED_DATA_START = "IndexedDataStart";
    private static final int NO_OF_INDEX_POINTS_FIELD_SIZE = 2;
    private static final String NUMBER_OF_INDEX_POINTS = "NumberOfIndexPoints";

    public FrameBodyASPI() {
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "ASPI";
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberFixedLength(INDEXED_DATA_START, this, 4));
        addDataType(new NumberFixedLength(INDEXED_DATA_LENGTH, this, 4));
        addDataType(new NumberFixedLength(NUMBER_OF_INDEX_POINTS, this, 2));
        addDataType(new NumberFixedLength(BITS_PER_INDEX_POINT, this, 1));
        addDataType(new NumberVariableLength(FRACTION_AT_INDEX, this, 1));
    }

    public FrameBodyASPI(FrameBodyASPI frameBodyASPI) {
        super(frameBodyASPI);
    }

    public FrameBodyASPI(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyASPI(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
