package defpackage;

/* JADX INFO: renamed from: lؖۜۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4415l {
    public byte loadAd;
    public byte yandex;

    public C4415l(C6364l c6364l, byte b) {
        this.yandex = b;
        this.loadAd = b;
        boolean zLoadAd = C5566l.admob().loadAd(c6364l.f1216l);
        byte b2 = this.loadAd;
        if (zLoadAd) {
            this.loadAd = (byte) (((byte) (b2 | 64)) & 127);
        } else {
            this.loadAd = (byte) (((byte) (b2 & (-65))) & 127);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4415l)) {
            return false;
        }
        C4415l c4415l = (C4415l) obj;
        return ((long) this.yandex) == ((long) c4415l.yandex) && ((long) this.loadAd) == ((long) c4415l.loadAd);
    }

    public C4415l(C11204l c11204l, byte b) {
        this.yandex = b;
        this.loadAd = b;
        boolean zLoadAd = C6647l.subs().loadAd(c11204l.f1216l);
        byte b2 = this.loadAd;
        if (zLoadAd) {
            this.loadAd = (byte) (((byte) (b2 | 32)) & (-65));
        } else {
            this.loadAd = (byte) (((byte) (b2 & (-33))) & (-65));
        }
    }
}
