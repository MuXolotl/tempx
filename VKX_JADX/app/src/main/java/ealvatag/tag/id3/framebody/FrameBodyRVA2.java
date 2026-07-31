package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyRVA2 extends AbstractID3v2FrameBody implements ID3v24FrameBody {
    public FrameBodyRVA2(FrameBodyRVAD frameBodyRVAD) {
        setObjectValue(DataTypes.OBJ_DATA, frameBodyRVAD.getObjectValue(DataTypes.OBJ_DATA));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "RVA2";
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }

    public FrameBodyRVA2(FrameBodyRVA2 frameBodyRVA2) {
        super(frameBodyRVA2);
    }

    public FrameBodyRVA2() {
    }

    public FrameBodyRVA2(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyRVA2(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
