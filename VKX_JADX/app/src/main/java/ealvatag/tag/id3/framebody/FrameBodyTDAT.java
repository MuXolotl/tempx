package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTDAT extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
    public static final int DATA_SIZE = 4;
    public static final int DAY_END = 2;
    public static final int DAY_START = 0;
    public static final int MONTH_END = 4;
    public static final int MONTH_START = 2;
    private boolean monthOnly;

    public FrameBodyTDAT() {
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TDAT";
    }

    public boolean isMonthOnly() {
        return this.monthOnly;
    }

    public void setMonthOnly(boolean z) {
        this.monthOnly = z;
    }

    public FrameBodyTDAT(FrameBodyTDAT frameBodyTDAT) {
        super(frameBodyTDAT);
    }

    public FrameBodyTDAT(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTDAT(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTDAT(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
