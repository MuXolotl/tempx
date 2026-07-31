package defpackage;

/* JADX INFO: renamed from: lؖۜۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4417l {
    public long amazon;
    public InterfaceC14859l crashlytics;
    public EnumC9931l loadAd;
    public InterfaceC13490l yandex;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4417l)) {
            return false;
        }
        C4417l c4417l = (C4417l) obj;
        return AbstractC8576l.yandex(this.yandex, c4417l.yandex) && this.loadAd == c4417l.loadAd && AbstractC8576l.yandex(this.crashlytics, c4417l.crashlytics) && C14174l.loadAd(this.amazon, c4417l.amazon);
    }

    public final int hashCode() {
        int iHashCode = (this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31;
        long j = this.amazon;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.yandex + ", layoutDirection=" + this.loadAd + ", canvas=" + this.crashlytics + ", size=" + C14174l.subs(this.amazon) + ")";
    }
}
