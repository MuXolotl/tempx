package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyEQUA extends AbstractID3v2FrameBody implements ID3v23FrameBody {
    public FrameBodyEQUA() {
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "EQUA";
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }

    public FrameBodyEQUA(FrameBodyEQUA frameBodyEQUA) {
        super(frameBodyEQUA);
    }

    public FrameBodyEQUA(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
