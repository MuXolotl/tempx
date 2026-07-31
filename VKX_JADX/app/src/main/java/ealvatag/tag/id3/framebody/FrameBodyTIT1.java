package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTIT1 extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyTIT1() {
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TIT1";
    }

    public FrameBodyTIT1(FrameBodyTIT1 frameBodyTIT1) {
        super(frameBodyTIT1);
    }

    public FrameBodyTIT1(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTIT1(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTIT1(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
