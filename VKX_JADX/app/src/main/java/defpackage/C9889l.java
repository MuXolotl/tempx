package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lٍٕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9889l implements InterfaceC17020l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final char[] f20116l = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f20117l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f20118l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f20119l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f20120l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f20121l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final float f20122l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f20123l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f20124l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final ByteBuffer f20125l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f20126l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f20127l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final String f20128l;

    public C9889l(C8662l c8662l, FileChannel fileChannel) throws IOException {
        int i = c8662l.loadAd;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        this.f20125l = byteBufferAllocate;
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        int i2 = fileChannel.read(byteBufferAllocate);
        if (i2 < i) {
            C18262l.metrica(AbstractC12589l.premium(i2, i, "Unable to read required number of bytes, read:", ":required:"));
            throw null;
        }
        byteBufferAllocate.flip();
        short s = byteBufferAllocate.getShort();
        C13975l c13975l = AbstractC14375l.yandex;
        this.f20121l = s & 65535;
        this.f20120l = byteBufferAllocate.getShort() & 65535;
        this.f20117l = ((byteBufferAllocate.get() & 255) << 16) + ((byteBufferAllocate.get() & 255) << 8) + (byteBufferAllocate.get() & 255);
        this.f20124l = ((byteBufferAllocate.get() & 255) << 16) + ((byteBufferAllocate.get() & 255) << 8) + (byteBufferAllocate.get() & 255);
        this.f20123l = ((byteBufferAllocate.get(10) & 255) << 12) + ((byteBufferAllocate.get(11) & 255) << 4) + ((byteBufferAllocate.get(12) & 240) >>> 4);
        this.f20119l = ((byteBufferAllocate.get(12) & 14) >>> 1) + 1;
        this.f20118l = ((byteBufferAllocate.get(12) & 1) << 4) + ((byteBufferAllocate.get(13) & 240) >>> 4) + 1;
        this.f20126l = (byteBufferAllocate.get(17) & 255) + ((byteBufferAllocate.get(16) & 255) << 8) + ((byteBufferAllocate.get(15) & 255) << 16) + ((byteBufferAllocate.get(14) & 255) << 24) + ((byteBufferAllocate.get(13) & 15) << 32);
        char[] cArr = new char[32];
        if (byteBufferAllocate.limit() >= 34) {
            for (int i3 = 0; i3 < 16; i3++) {
                byte b = byteBufferAllocate.get(i3 + 18);
                int i4 = i3 * 2;
                char[] cArr2 = f20116l;
                cArr[i4] = cArr2[(b & 255) >>> 4];
                cArr[i4 + 1] = cArr2[b & 15];
            }
        }
        this.f20128l = new String(cArr);
        double d = this.f20126l;
        int i5 = this.f20123l;
        this.f20122l = (float) (d / ((double) i5));
        this.f20127l = i5 / this.f20119l;
        this.f20125l.rewind();
    }

    @Override // defpackage.InterfaceC17020l
    public final ByteBuffer loadAd() {
        return this.f20125l;
    }

    public final String toString() {
        return "MinBlockSize:" + this.f20121l + "MaxBlockSize:" + this.f20120l + "MinFrameSize:" + this.f20117l + "MaxFrameSize:" + this.f20124l + "SampleRateTotal:" + this.f20123l + "SampleRatePerChannel:" + this.f20127l + ":Channel number:" + this.f20119l + ":Bits per sample: " + this.f20118l + ":TotalNumberOfSamples: " + this.f20126l + ":Length: " + this.f20122l;
    }
}
