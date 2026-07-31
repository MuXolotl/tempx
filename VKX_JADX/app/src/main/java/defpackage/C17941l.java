package defpackage;

/* JADX INFO: renamed from: lٍٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17941l {
    public final long crashlytics;
    public final long loadAd;
    public final long yandex;

    public C17941l() {
        long jLoadAd = AbstractC10565l.loadAd();
        long jLoadAd2 = AbstractC10565l.loadAd();
        long jLoadAd3 = AbstractC10565l.loadAd();
        this.yandex = jLoadAd;
        this.loadAd = jLoadAd2;
        this.crashlytics = jLoadAd3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17941l)) {
            return false;
        }
        C17941l c17941l = (C17941l) obj;
        return C9735l.crashlytics(this.yandex, c17941l.yandex) && C9735l.crashlytics(this.loadAd, c17941l.loadAd) && C9735l.crashlytics(this.crashlytics, c17941l.crashlytics);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.crashlytics) + AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorContainer(colorOne=");
        AbstractC11043l.smaato(this.yandex, ", colorTwo=", sb);
        AbstractC11043l.smaato(this.loadAd, ", colorThree=", sb);
        sb.append((Object) C9735l.subs(this.crashlytics));
        sb.append(')');
        return sb.toString();
    }
}
