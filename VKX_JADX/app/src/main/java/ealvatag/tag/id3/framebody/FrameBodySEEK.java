package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodySEEK extends AbstractID3v2FrameBody implements ID3v24FrameBody {
    public FrameBodySEEK(int i) {
        setObjectValue(DataTypes.OBJ_OFFSET, Integer.valueOf(i));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "SEEK";
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberFixedLength(DataTypes.OBJ_OFFSET, this, 4));
    }

    public FrameBodySEEK() {
    }

    public FrameBodySEEK(FrameBodySEEK frameBodySEEK) {
        super(frameBodySEEK);
    }

    public FrameBodySEEK(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodySEEK(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
