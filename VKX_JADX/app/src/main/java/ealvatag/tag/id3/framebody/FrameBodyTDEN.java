package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTDEN extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
    public FrameBodyTDEN() {
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TDEN";
    }

    public FrameBodyTDEN(FrameBodyTDEN frameBodyTDEN) {
        super(frameBodyTDEN);
    }

    public FrameBodyTDEN(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTDEN(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTDEN(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
