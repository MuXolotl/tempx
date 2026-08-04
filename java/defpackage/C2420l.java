package defpackage;

/* JADX INFO: renamed from: lؔؗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2420l {
    public final int crashlytics;
    public final int loadAd;
    public final EnumC18024l yandex;

    public C2420l(EnumC18024l enumC18024l, int i, int i2) {
        this.yandex = enumC18024l;
        this.loadAd = i;
        this.crashlytics = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2420l)) {
            return false;
        }
        C2420l c2420l = (C2420l) obj;
        return this.yandex == c2420l.yandex && this.loadAd == c2420l.loadAd && this.crashlytics == c2420l.crashlytics;
    }

    public final int hashCode() {
        return (((this.yandex.hashCode() * 31) + this.loadAd) * 31) + this.crashlytics;
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.yandex + ", horizontalAlignment=" + ((Object) C12347l.loadAd(this.loadAd)) + ", verticalAlignment=" + ((Object) C15667l.loadAd(this.crashlytics)) + ')';
    }
}
