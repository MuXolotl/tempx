package defpackage;

/* JADX INFO: renamed from: lٔۛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15168l {
    public final String amazon;
    public final int crashlytics;
    public final boolean loadAd;
    public final InterfaceC1286l yandex;

    public C15168l(InterfaceC1286l interfaceC1286l, boolean z, int i, String str) {
        this.yandex = interfaceC1286l;
        this.loadAd = z;
        this.crashlytics = i;
        this.amazon = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15168l)) {
            return false;
        }
        C15168l c15168l = (C15168l) obj;
        return AbstractC8576l.yandex(this.yandex, c15168l.yandex) && this.loadAd == c15168l.loadAd && this.crashlytics == c15168l.crashlytics && AbstractC8576l.yandex(this.amazon, c15168l.amazon);
    }

    public final int hashCode() {
        int iFirebase = AbstractC0653l.firebase(this.crashlytics, ((this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237)) * 31, 31);
        String str = this.amazon;
        return iFirebase + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.yandex + ", isSampled=" + this.loadAd + ", dataSource=" + AbstractC11043l.ad(this.crashlytics) + ", diskCacheKey=" + this.amazon + ")";
    }
}
