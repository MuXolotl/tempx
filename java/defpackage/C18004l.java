package defpackage;

/* JADX INFO: renamed from: l٘ٙٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18004l implements InterfaceC10137l {
    public final InterfaceC10137l loadAd;
    public final InterfaceC10137l yandex;

    public C18004l(InterfaceC10137l interfaceC10137l, InterfaceC10137l interfaceC10137l2) {
        this.yandex = interfaceC10137l;
        this.loadAd = interfaceC10137l2;
    }

    @Override // defpackage.InterfaceC10137l
    public final int amazon(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return Math.max(this.yandex.amazon(interfaceC13490l, enumC9931l), this.loadAd.amazon(interfaceC13490l, enumC9931l));
    }

    @Override // defpackage.InterfaceC10137l
    public final int crashlytics(InterfaceC13490l interfaceC13490l) {
        return Math.max(this.yandex.crashlytics(interfaceC13490l), this.loadAd.crashlytics(interfaceC13490l));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18004l)) {
            return false;
        }
        C18004l c18004l = (C18004l) obj;
        return AbstractC8576l.yandex(c18004l.yandex, this.yandex) && AbstractC8576l.yandex(c18004l.loadAd, this.loadAd);
    }

    public final int hashCode() {
        return (this.loadAd.hashCode() * 31) + this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC10137l
    public final int loadAd(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return Math.max(this.yandex.loadAd(interfaceC13490l, enumC9931l), this.loadAd.loadAd(interfaceC13490l, enumC9931l));
    }

    public final String toString() {
        return "(" + this.yandex + " ∪ " + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC10137l
    public final int yandex(InterfaceC13490l interfaceC13490l) {
        return Math.max(this.yandex.yandex(interfaceC13490l), this.loadAd.yandex(interfaceC13490l));
    }
}
