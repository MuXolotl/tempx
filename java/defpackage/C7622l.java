package defpackage;

/* JADX INFO: renamed from: lؚۤٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7622l {
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C7622l(float f, float f2, float f3) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7622l)) {
            return false;
        }
        C7622l c7622l = (C7622l) obj;
        return C14467l.loadAd(this.yandex, c7622l.yandex) && C14467l.loadAd(this.loadAd, c7622l.loadAd) && C14467l.loadAd(this.crashlytics, c7622l.crashlytics);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.crashlytics) + AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.yandex;
        sb.append((Object) C14467l.crashlytics(f));
        sb.append(", right=");
        float f2 = this.loadAd;
        sb.append((Object) C14467l.crashlytics(f + f2));
        sb.append(", width=");
        sb.append((Object) C14467l.crashlytics(f2));
        sb.append(", contentWidth=");
        sb.append((Object) C14467l.crashlytics(this.crashlytics));
        sb.append(')');
        return sb.toString();
    }
}
