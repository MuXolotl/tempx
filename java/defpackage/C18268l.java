package defpackage;

/* JADX INFO: renamed from: lؚ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18268l implements InterfaceC10137l {
    public final InterfaceC10137l loadAd;
    public final InterfaceC10137l yandex;

    public C18268l(InterfaceC10137l interfaceC10137l, InterfaceC10137l interfaceC10137l2) {
        this.yandex = interfaceC10137l;
        this.loadAd = interfaceC10137l2;
    }

    @Override // defpackage.InterfaceC10137l
    public final int amazon(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        int iAmazon = this.yandex.amazon(interfaceC13490l, enumC9931l) - this.loadAd.amazon(interfaceC13490l, enumC9931l);
        if (iAmazon < 0) {
            return 0;
        }
        return iAmazon;
    }

    @Override // defpackage.InterfaceC10137l
    public final int crashlytics(InterfaceC13490l interfaceC13490l) {
        int iCrashlytics = this.yandex.crashlytics(interfaceC13490l) - this.loadAd.crashlytics(interfaceC13490l);
        if (iCrashlytics < 0) {
            return 0;
        }
        return iCrashlytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18268l)) {
            return false;
        }
        C18268l c18268l = (C18268l) obj;
        return AbstractC8576l.yandex(c18268l.yandex, this.yandex) && AbstractC8576l.yandex(c18268l.loadAd, this.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC10137l
    public final int loadAd(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        int iLoadAd = this.yandex.loadAd(interfaceC13490l, enumC9931l) - this.loadAd.loadAd(interfaceC13490l, enumC9931l);
        if (iLoadAd < 0) {
            return 0;
        }
        return iLoadAd;
    }

    public final String toString() {
        return "(" + this.yandex + " - " + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC10137l
    public final int yandex(InterfaceC13490l interfaceC13490l) {
        int iYandex = this.yandex.yandex(interfaceC13490l) - this.loadAd.yandex(interfaceC13490l);
        if (iYandex < 0) {
            return 0;
        }
        return iYandex;
    }
}
