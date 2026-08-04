package defpackage;

/* JADX INFO: renamed from: lّۜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12870l {
    public static final C12870l amazon = new C12870l(C9735l.firebase, 3, null);
    public static final int purchase = 3;
    public final AbstractC9544l crashlytics;
    public final int loadAd;
    public final long yandex;

    public C12870l(long j, int i, AbstractC9544l abstractC9544l) {
        this.yandex = j;
        this.loadAd = i;
        this.crashlytics = abstractC9544l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12870l)) {
            return false;
        }
        C12870l c12870l = (C12870l) obj;
        return C9735l.crashlytics(this.yandex, c12870l.yandex) && this.loadAd == c12870l.loadAd && AbstractC8576l.yandex(this.crashlytics, c12870l.crashlytics);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        int iYandex = ((C10882l.yandex(this.yandex) * 31) + this.loadAd) * 31;
        AbstractC9544l abstractC9544l = this.crashlytics;
        return iYandex + (abstractC9544l == null ? 0 : abstractC9544l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLicense = AbstractC14814l.license("HazeTint(color=", C9735l.subs(this.yandex), ", blendMode=", AbstractC16759l.amazon(this.loadAd), ", brush=");
        sbLicense.append(this.crashlytics);
        sbLicense.append(")");
        return sbLicense.toString();
    }

    public final boolean yandex() {
        return (this.yandex == 16 && this.crashlytics == null) ? false : true;
    }

    public C12870l(long j) {
        this(j, purchase, null);
    }
}
