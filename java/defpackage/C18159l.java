package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: l٘ۘۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18159l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C15308l f35557l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f35558l;

    public C18159l() {
        super(0);
        this.f35557l = new C15308l(C2491l.yandex.yandex());
        this.f35558l = AbstractC8020l.smaato(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final void m4497import(InterfaceC8714l interfaceC8714l, InterfaceC2262l interfaceC2262l) {
        Integer numSignatures = AbstractC16648l.signatures(((C0639l) interfaceC8714l.getValue()).yandex.f7563l);
        if (numSignatures != null) {
            AbstractC10999l.mopub(interfaceC2262l, null, 0, new C11554l(Math.abs(numSignatures.intValue()), null), 3);
        }
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m4498abstract(boolean z) {
        this.f35558l.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        C13072l c13072l;
        boolean z;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1701043719);
        int i2 = 4;
        int i3 = i | (c6956l2.admob(this) ? 4 : 2);
        byte b = 0;
        int i4 = 1;
        if (c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l2);
                c6956l2.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3601l).yandex();
            Object obj = AbstractC16584l.crashlytics().f3601l;
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd(interfaceC6942lYandex, (C15343l) ((AbstractC11904l) C6546l.f13666l.f33214l), c6956l2, 0);
            boolean zAmazon = c6956l2.amazon(((C15343l) interfaceC8714lLoadAd.getValue()).f29996l);
            Object objM2132native2 = c6956l2.m2132native();
            if (zAmazon || objM2132native2 == c13863l) {
                C12463l c12463l = AbstractC6145l.yandex;
                int i5 = ((C15343l) interfaceC8714lLoadAd.getValue()).f29996l;
                C13660l c13660l = AbstractC6145l.crashlytics;
                C6417l c6417l = (C6417l) c13660l.mopub(Integer.valueOf(i5));
                if (c6417l == null) {
                    c6417l = (C6417l) c13660l.mopub(0);
                }
                objM2132native2 = c6417l;
                c6956l2.m2147try(objM2132native2);
            }
            C6417l c6417l2 = (C6417l) objM2132native2;
            boolean zAmazon2 = c6956l2.amazon(((C15343l) interfaceC8714lLoadAd.getValue()).f29995l);
            Object objM2132native3 = c6956l2.m2132native();
            if (zAmazon2 || objM2132native3 == c13863l) {
                C12463l c12463l2 = AbstractC6145l.yandex;
                objM2132native3 = AbstractC6145l.yandex(((C15343l) interfaceC8714lLoadAd.getValue()).f29995l);
                c6956l2.m2147try(objM2132native3);
            }
            C9894l c9894l = (C9894l) objM2132native3;
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l2);
            InterfaceC8714l interfaceC8714lAmazon = AbstractC3700l.amazon((C7549l) AbstractC16584l.yandex().billing.admob, c6956l2, 0);
            if (((Boolean) this.f35558l.getValue()).booleanValue()) {
                c6956l2.m2123default(-524806669);
                boolean zAmazon3 = c6956l2.amazon(((C15343l) interfaceC8714lLoadAd.getValue()).f30001l);
                Object objM2132native4 = c6956l2.m2132native();
                if (zAmazon3 || objM2132native4 == c13863l) {
                    objM2132native4 = AbstractC8020l.smaato(new C0639l(0L, 6, String.valueOf(((C15343l) interfaceC8714lLoadAd.getValue()).f30001l)));
                    c6956l2.m2147try(objM2132native4);
                }
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native4;
                boolean zAdmob = c6956l2.admob(this);
                Object objM2132native5 = c6956l2.m2132native();
                if (zAdmob || objM2132native5 == c13863l) {
                    objM2132native5 = new C0705l(this, i2);
                    c6956l2.m2147try(objM2132native5);
                }
                Function0 function0 = (Function0) objM2132native5;
                C15578l c15578lAmazon = AbstractC14566l.amazon(-1876665446, new C13148l(this, interfaceC8714l, interfaceC2262l), c6956l2);
                C15578l c15578lAmazon2 = AbstractC14566l.amazon(1070168280, new C14260l(this, i4, b), c6956l2);
                C15578l c15578lAmazon3 = AbstractC14566l.amazon(-952032075, new C13148l(interfaceC8714l, this, interfaceC2262l), c6956l2);
                c13072l = c13072lYandex;
                z = false;
                AbstractC16291l.yandex(function0, c15578lAmazon, null, c15578lAmazon2, null, AbstractC0837l.crashlytics, c15578lAmazon3, null, 0L, 0L, 0L, 0L, null, c6956l, 1772592, 0, 16276);
                c6956l2 = c6956l;
            } else {
                c13072l = c13072lYandex;
                z = false;
                c6956l2.m2123default(-530376997);
            }
            c6956l2.startapp(z);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(348989131, new Cpublic(c13072l, this, 8), c6956l2), null, null, null, 0, 0L, 0L, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).amazon(c6956l2), AbstractC14566l.amazon(1349194902, new C11237l(c13072l, this, interfaceC8714lLoadAd, c6417l2, c9894l, interfaceC8714lAmazon, interfaceC2262l), c6956l2), c6956l2, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14260l(this, i);
        }
    }
}
