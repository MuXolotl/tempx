package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lِؓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2049l {
    public static final ThreadLocal amazon = new ThreadLocal();
    public volatile int crashlytics = 0;
    public final C12014l loadAd;
    public final int yandex;

    public C2049l(C12014l c12014l, int i) {
        this.loadAd = c12014l;
        this.yandex = i;
    }

    public final C0680l loadAd() {
        ThreadLocal threadLocal = amazon;
        C0680l c0680l = (C0680l) threadLocal.get();
        if (c0680l == null) {
            c0680l = new C0680l();
            threadLocal.set(c0680l);
        }
        C3746l c3746l = (C3746l) this.loadAd.f23941l;
        int iYandex = c3746l.yandex(6);
        if (iYandex != 0) {
            int i = iYandex + c3746l.f31319l;
            int i2 = (this.yandex * 4) + ((ByteBuffer) c3746l.f31320l).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c3746l.f31320l).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c3746l.f31320l;
            c0680l.f31320l = byteBuffer;
            if (byteBuffer != null) {
                c0680l.f31319l = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c0680l.f31318l = i4;
                c0680l.f31317l = ((ByteBuffer) c0680l.f31320l).getShort(i4);
                return c0680l;
            }
            c0680l.f31319l = 0;
            c0680l.f31318l = 0;
            c0680l.f31317l = 0;
        }
        return c0680l;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0680l c0680lLoadAd = loadAd();
        int iYandex = c0680lLoadAd.yandex(4);
        sb.append(Integer.toHexString(iYandex != 0 ? ((ByteBuffer) c0680lLoadAd.f31320l).getInt(iYandex + c0680lLoadAd.f31319l) : 0));
        sb.append(", codepoints:");
        C0680l c0680lLoadAd2 = loadAd();
        int iYandex2 = c0680lLoadAd2.yandex(16);
        if (iYandex2 != 0) {
            int i2 = iYandex2 + c0680lLoadAd2.f31319l;
            i = ((ByteBuffer) c0680lLoadAd2.f31320l).getInt(((ByteBuffer) c0680lLoadAd2.f31320l).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(yandex(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public final int yandex(int i) {
        C0680l c0680lLoadAd = loadAd();
        int iYandex = c0680lLoadAd.yandex(16);
        if (iYandex == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0680lLoadAd.f31320l;
        int i2 = iYandex + c0680lLoadAd.f31319l;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }
}
