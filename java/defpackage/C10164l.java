package defpackage;

/* JADX INFO: renamed from: lًَٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10164l {
    public final long admob;
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final long isPro;
    public final long loadAd;
    public final long mopub;
    public final long purchase;
    public final long subs;
    public final long yandex;

    public C10164l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = j5;
        this.billing = j6;
        this.mopub = j7;
        this.admob = j8;
        this.subs = j9;
        this.isPro = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10164l.class != obj.getClass()) {
            return false;
        }
        C10164l c10164l = (C10164l) obj;
        return C9735l.crashlytics(this.yandex, c10164l.yandex) && C9735l.crashlytics(this.loadAd, c10164l.loadAd) && C9735l.crashlytics(this.crashlytics, c10164l.crashlytics) && C9735l.crashlytics(this.amazon, c10164l.amazon) && C9735l.crashlytics(this.purchase, c10164l.purchase) && C9735l.crashlytics(this.billing, c10164l.billing) && C9735l.crashlytics(this.mopub, c10164l.mopub) && C9735l.crashlytics(this.admob, c10164l.admob) && C9735l.crashlytics(this.subs, c10164l.subs) && C9735l.crashlytics(this.isPro, c10164l.isPro);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.isPro) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31), this.purchase, 31), this.billing, 31), this.mopub, 31), this.admob, 31), this.subs, 31);
    }

    public final InterfaceC8714l loadAd(boolean z, boolean z2, C6956l c6956l) {
        long j;
        c6956l.m2123default(1575395620);
        if (z) {
            j = z2 ? this.crashlytics : this.amazon;
        } else {
            j = z2 ? this.purchase : this.billing;
        }
        InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(new C9735l(j), c6956l);
        c6956l.startapp(false);
        return interfaceC8714lVip;
    }

    public final InterfaceC8714l yandex(boolean z, boolean z2, C6956l c6956l) {
        long j;
        c6956l.m2123default(-1491563694);
        if (z) {
            j = z2 ? this.mopub : this.admob;
        } else {
            j = z2 ? this.subs : this.isPro;
        }
        InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(new C9735l(j), c6956l);
        c6956l.startapp(false);
        return interfaceC8714lVip;
    }
}
