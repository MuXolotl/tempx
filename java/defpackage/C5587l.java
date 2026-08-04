package defpackage;

/* JADX INFO: renamed from: lؘَّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5587l implements InterfaceC10137l {
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C5587l(float f, float f2, float f3) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
    }

    @Override // defpackage.InterfaceC10137l
    public final int amazon(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return interfaceC13490l.mo870l(this.yandex);
    }

    @Override // defpackage.InterfaceC10137l
    public final int crashlytics(InterfaceC13490l interfaceC13490l) {
        return interfaceC13490l.mo870l(this.crashlytics);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5587l)) {
            return false;
        }
        C5587l c5587l = (C5587l) obj;
        return C14467l.loadAd(this.yandex, c5587l.yandex) && C14467l.loadAd(this.loadAd, c5587l.loadAd) && C14467l.loadAd(0.0f, 0.0f) && C14467l.loadAd(this.crashlytics, c5587l.crashlytics);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.crashlytics) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), 0.0f, 31);
    }

    @Override // defpackage.InterfaceC10137l
    public final int loadAd(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return interfaceC13490l.mo870l(0.0f);
    }

    public final String toString() {
        String strCrashlytics = C14467l.crashlytics(this.yandex);
        String strCrashlytics2 = C14467l.crashlytics(this.loadAd);
        return AbstractC9361l.advert(AbstractC14814l.license("Insets(left=", strCrashlytics, ", top=", strCrashlytics2, ", right="), C14467l.crashlytics(0.0f), ", bottom=", C14467l.crashlytics(this.crashlytics), ")");
    }

    @Override // defpackage.InterfaceC10137l
    public final int yandex(InterfaceC13490l interfaceC13490l) {
        return interfaceC13490l.mo870l(this.loadAd);
    }
}
