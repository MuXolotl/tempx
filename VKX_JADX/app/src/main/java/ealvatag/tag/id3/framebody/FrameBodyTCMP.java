package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTCMP extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
    static String IS_COMPILATION = "1\u0000";

    public FrameBodyTCMP() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, IS_COMPILATION);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TCMP";
    }

    public boolean isCompilation() {
        return getText().equals(IS_COMPILATION);
    }

    public FrameBodyTCMP(FrameBodyTCMP frameBodyTCMP) {
        super(frameBodyTCMP);
    }

    public FrameBodyTCMP(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTCMP(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTCMP(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
