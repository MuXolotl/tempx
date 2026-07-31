package defpackage;

/* JADX INFO: renamed from: lؗۖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5086l {
    public final InterfaceC13238l crashlytics;
    public final boolean loadAd;
    public final boolean yandex;

    public C5086l(boolean z, boolean z2, InterfaceC13238l interfaceC13238l) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = interfaceC13238l;
    }

    public static C5086l yandex(C5086l c5086l, InterfaceC13238l interfaceC13238l) {
        boolean z = c5086l.yandex;
        boolean z2 = c5086l.loadAd;
        c5086l.getClass();
        return new C5086l(z, z2, interfaceC13238l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5086l)) {
            return false;
        }
        C5086l c5086l = (C5086l) obj;
        return this.yandex == c5086l.yandex && this.loadAd == c5086l.loadAd && AbstractC8576l.yandex(this.crashlytics, c5086l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((((this.yandex ? 1231 : 1237) * 31) + (this.loadAd ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "OrionResponse(isLoading=" + this.yandex + ", isEmpty=" + this.loadAd + ", data=" + this.crashlytics + ')';
    }

    public /* synthetic */ C5086l() {
        this(true, true, C11507l.f23131l);
    }
}
