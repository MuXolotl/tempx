package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؔۗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2848l {
    public static final String admob;
    public static final String billing;
    public static final String mopub;
    public static final C2848l purchase = new C12676l(0).purchase();
    public static final String subs;
    public final String amazon;
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        billing = Integer.toString(0, 36);
        mopub = Integer.toString(1, 36);
        admob = Integer.toString(2, 36);
        subs = Integer.toString(3, 36);
    }

    public C2848l(C12676l c12676l) {
        this.yandex = c12676l.loadAd;
        this.loadAd = c12676l.crashlytics;
        this.crashlytics = c12676l.amazon;
        this.amazon = (String) c12676l.purchase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2848l)) {
            return false;
        }
        C2848l c2848l = (C2848l) obj;
        return this.yandex == c2848l.yandex && this.loadAd == c2848l.loadAd && this.crashlytics == c2848l.crashlytics && Objects.equals(this.amazon, c2848l.amazon);
    }

    public final int hashCode() {
        int i = (((((527 + this.yandex) * 31) + this.loadAd) * 31) + this.crashlytics) * 31;
        String str = this.amazon;
        return i + (str == null ? 0 : str.hashCode());
    }
}
