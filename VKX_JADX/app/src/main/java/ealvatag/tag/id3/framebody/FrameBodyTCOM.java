package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTCOM extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyTCOM() {
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TCOM";
    }

    public FrameBodyTCOM(FrameBodyTCOM frameBodyTCOM) {
        super(frameBodyTCOM);
    }

    public FrameBodyTCOM(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTCOM(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTCOM(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
