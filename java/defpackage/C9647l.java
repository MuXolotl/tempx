package defpackage;

/* JADX INFO: renamed from: lٍٙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9647l {
    public final float loadAd;
    public final float yandex;

    public C9647l(float f, float f2) {
        this.yandex = f;
        this.loadAd = f2;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd) + (Float.floatToIntBits(this.yandex) * 31);
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
        sb.append(')');
        return sb.toString();
    }
}
