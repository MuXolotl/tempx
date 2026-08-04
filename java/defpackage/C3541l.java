package defpackage;

/* JADX INFO: renamed from: lٟؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3541l {
    public final long amazon;
    public final long crashlytics;
    public final long loadAd;
    public final long purchase;
    public final long yandex;

    public C3541l(long j, long j2, long j3, long j4, long j5) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3541l)) {
            return false;
        }
        C3541l c3541l = (C3541l) obj;
        return C9735l.crashlytics(this.yandex, c3541l.yandex) && C9735l.crashlytics(this.loadAd, c3541l.loadAd) && C9735l.crashlytics(this.crashlytics, c3541l.crashlytics) && C9735l.crashlytics(this.amazon, c3541l.amazon) && C9735l.crashlytics(this.purchase, c3541l.purchase);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.purchase) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31);
    }

    public final String toString() {
        String strSubs = C9735l.subs(this.yandex);
        String strSubs2 = C9735l.subs(this.loadAd);
        String strSubs3 = C9735l.subs(this.crashlytics);
        String strSubs4 = C9735l.subs(this.amazon);
        String strSubs5 = C9735l.subs(this.purchase);
        StringBuilder sbLicense = AbstractC14814l.license("ContextMenuColors(backgroundColor=", strSubs, ", textColor=", strSubs2, ", iconColor=");
        AbstractC9361l.appmetrica(sbLicense, strSubs3, ", disabledTextColor=", strSubs4, ", disabledIconColor=");
        return AbstractC0653l.ads(sbLicense, strSubs5, ")");
    }
}
