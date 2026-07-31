package defpackage;

/* JADX INFO: renamed from: lْۦؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13797l extends AbstractC11801l {
    public C13797l() {
        super(0);
        ((Boolean) AbstractC8619l.remoteconfig.yandex()).getClass();
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(1925126178);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3605l).yandex();
            Object obj = AbstractC16584l.crashlytics().f3605l;
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd(interfaceC6942lYandex, (C4700l) ((AbstractC11904l) C7445l.f15420l.f33214l), c6956l, 0);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            boolean zAmazon = c6956l.amazon(((C4700l) interfaceC8714lLoadAd.getValue()).f9549l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAmazon || objM2132native2 == c13863l) {
                objM2132native2 = new C13765l(((C4700l) interfaceC8714lLoadAd.getValue()).f9549l);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-560581922, new C9772l(c13072lYandex, this, 20), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(685371571, new C11223l(c13072lYandex, interfaceC8714lLoadAd, interfaceC2262l, (C13765l) objM2132native2), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11216l(this, i);
        }
    }

    @Override // defpackage.AbstractC17777l
    public final boolean signatures() {
        return true;
    }
}
