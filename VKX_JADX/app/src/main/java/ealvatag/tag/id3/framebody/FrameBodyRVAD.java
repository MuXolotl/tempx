package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyRVAD extends AbstractID3v2FrameBody implements ID3v23FrameBody {
    public FrameBodyRVAD(FrameBodyRVA2 frameBodyRVA2) {
        setObjectValue(DataTypes.OBJ_DATA, frameBodyRVA2.getObjectValue(DataTypes.OBJ_DATA));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "RVAD";
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }

    public FrameBodyRVAD(FrameBodyRVAD frameBodyRVAD) {
        super(frameBodyRVAD);
    }

    public FrameBodyRVAD() {
    }

    public FrameBodyRVAD(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyRVAD(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
