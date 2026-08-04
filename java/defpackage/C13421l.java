package defpackage;

/* JADX INFO: renamed from: lْٖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13421l implements InterfaceC11780l {
    public final InterfaceC13490l loadAd;
    public final InterfaceC10137l yandex;

    public C13421l(InterfaceC10137l interfaceC10137l, InterfaceC13490l interfaceC13490l) {
        this.yandex = interfaceC10137l;
        this.loadAd = interfaceC13490l;
    }

    @Override // defpackage.InterfaceC11780l
    public final float amazon() {
        InterfaceC10137l interfaceC10137l = this.yandex;
        InterfaceC13490l interfaceC13490l = this.loadAd;
        return interfaceC13490l.mo872static(interfaceC10137l.yandex(interfaceC13490l));
    }

    @Override // defpackage.InterfaceC11780l
    public final float crashlytics(EnumC9931l enumC9931l) {
        InterfaceC10137l interfaceC10137l = this.yandex;
        InterfaceC13490l interfaceC13490l = this.loadAd;
        return interfaceC13490l.mo872static(interfaceC10137l.loadAd(interfaceC13490l, enumC9931l));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13421l)) {
            return false;
        }
        C13421l c13421l = (C13421l) obj;
        return AbstractC8576l.yandex(this.yandex, c13421l.yandex) && AbstractC8576l.yandex(this.loadAd, c13421l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC11780l
    public final float loadAd(EnumC9931l enumC9931l) {
        InterfaceC10137l interfaceC10137l = this.yandex;
        InterfaceC13490l interfaceC13490l = this.loadAd;
        return interfaceC13490l.mo872static(interfaceC10137l.amazon(interfaceC13490l, enumC9931l));
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.yandex + ", density=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC11780l
    public final float yandex() {
        InterfaceC10137l interfaceC10137l = this.yandex;
        InterfaceC13490l interfaceC13490l = this.loadAd;
        return interfaceC13490l.mo872static(interfaceC10137l.crashlytics(interfaceC13490l));
    }
}
