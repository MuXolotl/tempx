package defpackage;

/* JADX INFO: renamed from: lٖۢۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16721l implements InterfaceC10137l {
    public final C10086l yandex;

    public C16721l(InterfaceC10137l interfaceC10137l) {
        this.yandex = AbstractC8020l.smaato(interfaceC10137l);
    }

    @Override // defpackage.InterfaceC10137l
    public final int amazon(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return ((InterfaceC10137l) this.yandex.getValue()).amazon(interfaceC13490l, enumC9931l);
    }

    @Override // defpackage.InterfaceC10137l
    public final int crashlytics(InterfaceC13490l interfaceC13490l) {
        return ((InterfaceC10137l) this.yandex.getValue()).crashlytics(interfaceC13490l);
    }

    @Override // defpackage.InterfaceC10137l
    public final int loadAd(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return ((InterfaceC10137l) this.yandex.getValue()).loadAd(interfaceC13490l, enumC9931l);
    }

    @Override // defpackage.InterfaceC10137l
    public final int yandex(InterfaceC13490l interfaceC13490l) {
        return ((InterfaceC10137l) this.yandex.getValue()).yandex(interfaceC13490l);
    }
}
