package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTDOR extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
    public FrameBodyTDOR(FrameBodyTORY frameBodyTORY) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyTORY.getText());
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TDOR";
    }

    public FrameBodyTDOR(FrameBodyTDOR frameBodyTDOR) {
        super(frameBodyTDOR);
    }

    public FrameBodyTDOR() {
    }

    public FrameBodyTDOR(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTDOR(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTDOR(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
