package defpackage;

/* JADX INFO: renamed from: lّٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15428l {
    public final C1759l amazon;
    public final long crashlytics;
    public final long loadAd;
    public final long yandex;

    public C15428l() {
        C6760l c6760l = C9658l.f19699l;
        EnumC16636l enumC16636l = EnumC16636l.SECONDS;
        long jTapsense = AbstractC15918l.tapsense(45, enumC16636l);
        long jTapsense2 = AbstractC15918l.tapsense(5, enumC16636l);
        long jTapsense3 = AbstractC15918l.tapsense(5, enumC16636l);
        C1759l c1759l = C13863l.f27101l;
        this.yandex = jTapsense;
        this.loadAd = jTapsense2;
        this.crashlytics = jTapsense3;
        this.amazon = c1759l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15428l) {
            C15428l c15428l = (C15428l) obj;
            long j = c15428l.yandex;
            C6760l c6760l = C9658l.f19699l;
            if (this.yandex == j && this.loadAd == c15428l.loadAd && this.crashlytics == c15428l.crashlytics && AbstractC8576l.yandex(this.amazon, c15428l.amazon)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C6760l c6760l = C9658l.f19699l;
        long j = this.yandex;
        long j2 = this.loadAd;
        int i = (((int) (j2 ^ (j2 >>> 32))) + (((int) (j ^ (j >>> 32))) * 31)) * 31;
        long j3 = this.crashlytics;
        return this.amazon.hashCode() + ((((int) (j3 ^ (j3 >>> 32))) + i) * 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) C9658l.subs(this.yandex)) + ", additionalTime=" + ((Object) C9658l.subs(this.loadAd)) + ", idleTimeout=" + ((Object) C9658l.subs(this.crashlytics)) + ", timeSource=" + this.amazon + ')';
    }
}
