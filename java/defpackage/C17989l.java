package defpackage;

/* JADX INFO: renamed from: lَ٘٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17989l implements InterfaceC6347l {
    public final long yandex;

    public C17989l(long j) {
        this.yandex = j;
    }

    @Override // defpackage.InterfaceC6347l
    public final AbstractC15342l yandex(long j, EnumC9931l enumC9931l, InterfaceC13490l interfaceC13490l) {
        C9902l c9902lYandex = AbstractC3478l.yandex();
        long j2 = this.yandex;
        float fMo868instanceof = interfaceC13490l.mo868instanceof(C2261l.loadAd(j2));
        float fMo868instanceof2 = interfaceC13490l.mo868instanceof(C2261l.yandex(j2));
        c9902lYandex.billing(0.0f, 0.0f);
        c9902lYandex.purchase(fMo868instanceof / 2.0f, 0.0f);
        c9902lYandex.purchase(0.0f, fMo868instanceof2);
        c9902lYandex.purchase((-fMo868instanceof) / 2.0f, 0.0f);
        c9902lYandex.loadAd();
        return new C13616l(c9902lYandex);
    }
}
