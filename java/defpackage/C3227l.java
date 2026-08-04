package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘؕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3227l {
    public static final C3227l billing = new C3227l(C9735l.firebase, C2580l.f5619l, Float.NaN, -1.0f, C12870l.amazon);
    public final float amazon;
    public final float crashlytics;
    public final List loadAd;
    public final C12870l purchase;
    public final long yandex;

    public C3227l(long j, List list, float f, float f2, C12870l c12870l) {
        this.yandex = j;
        this.loadAd = list;
        this.crashlytics = f;
        this.amazon = f2;
        this.purchase = c12870l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3227l)) {
            return false;
        }
        C3227l c3227l = (C3227l) obj;
        return C9735l.crashlytics(this.yandex, c3227l.yandex) && AbstractC8576l.yandex(this.loadAd, c3227l.loadAd) && C14467l.loadAd(this.crashlytics, c3227l.crashlytics) && Float.compare(this.amazon, c3227l.amazon) == 0 && AbstractC8576l.yandex(this.purchase, c3227l.purchase);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return this.purchase.hashCode() + AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC14814l.admob(C10882l.yandex(this.yandex) * 31, 31, this.loadAd), this.crashlytics, 31), this.amazon, 31);
    }

    public final String toString() {
        return "HazeStyle(backgroundColor=" + C9735l.subs(this.yandex) + ", tints=" + this.loadAd + ", blurRadius=" + C14467l.crashlytics(this.crashlytics) + ", noiseFactor=" + this.amazon + ", fallbackTint=" + this.purchase + ")";
    }
}
