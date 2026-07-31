package defpackage;

/* JADX INFO: renamed from: lَؘؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10025l {
    public float amazon;
    public EnumC9931l crashlytics;
    public long loadAd;
    public InterfaceC6347l yandex;

    public C10025l(InterfaceC6347l interfaceC6347l, long j, EnumC9931l enumC9931l, float f, AbstractC18072l abstractC18072l) {
        this.yandex = interfaceC6347l;
        this.loadAd = j;
        this.crashlytics = enumC9931l;
        this.amazon = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10025l)) {
            return false;
        }
        C10025l c10025l = (C10025l) obj;
        return AbstractC8576l.yandex(this.yandex, c10025l.yandex) && C14174l.loadAd(this.loadAd, c10025l.loadAd) && this.crashlytics == c10025l.crashlytics && Float.compare(this.amazon, c10025l.amazon) == 0 && AbstractC8576l.yandex(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        return AbstractC9029l.mopub((this.crashlytics.hashCode() + ((((int) (j ^ (j >>> 32))) + iHashCode) * 31)) * 31, this.amazon, 31);
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.yandex + ", size=" + C14174l.subs(this.loadAd) + ", layoutDirection=" + this.crashlytics + ", density=" + this.amazon + ", shadow=" + ((Object) null) + ")";
    }
}
