package defpackage;

/* JADX INFO: renamed from: lٍؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0936l extends AbstractC11801l {
    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(497331294);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3603l).yandex();
            Object obj = AbstractC16584l.crashlytics().f3603l;
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd(interfaceC6942lYandex, (C7814l) ((AbstractC11904l) C3078l.f6613l.f33214l), c6956l, 0);
            boolean zAmazon = c6956l.amazon(((C7814l) interfaceC8714lLoadAd.getValue()).f16334l.ordinal());
            Object objM2132native = c6956l.m2132native();
            if (zAmazon || objM2132native == C1867l.yandex) {
                objM2132native = AbstractC8020l.smaato(((C7814l) interfaceC8714lLoadAd.getValue()).f16334l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(592263962, new C14601l(c13072lYandex, this, 10), c6956l), null, null, AbstractC14566l.amazon(-442483273, new C14601l(this, interfaceC8714l, 11), c6956l), 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-760944657, new C0822l(c13072lYandex, interfaceC8714l, i3), c6956l), c6956l, 805330992, 237);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13928l(this, i);
        }
    }
}
