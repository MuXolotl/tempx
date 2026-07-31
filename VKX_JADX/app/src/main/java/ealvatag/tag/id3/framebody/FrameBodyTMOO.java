package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTMOO extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
    public FrameBodyTMOO(FrameBodyTXXX frameBodyTXXX) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyTXXX.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyTXXX.getText());
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TMOO";
    }

    public FrameBodyTMOO(FrameBodyTMOO frameBodyTMOO) {
        super(frameBodyTMOO);
    }

    public FrameBodyTMOO(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTMOO() {
    }

    public FrameBodyTMOO(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTMOO(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
