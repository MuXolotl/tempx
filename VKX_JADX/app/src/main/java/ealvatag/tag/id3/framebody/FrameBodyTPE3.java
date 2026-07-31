package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTPE3 extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyTPE3() {
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TPE3";
    }

    public FrameBodyTPE3(FrameBodyTPE3 frameBodyTPE3) {
        super(frameBodyTPE3);
    }

    public FrameBodyTPE3(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTPE3(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTPE3(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
