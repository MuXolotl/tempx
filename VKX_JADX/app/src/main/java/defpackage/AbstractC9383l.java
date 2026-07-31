package defpackage;

/* JADX INFO: renamed from: lٍؚؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9383l {
    public static final C13660l yandex = crashlytics(true);
    public static final C13660l loadAd = crashlytics(false);
    public static final C10327l crashlytics = C10327l.purchase;

    public static final InterfaceC10835l amazon(InterfaceC13460l interfaceC13460l, boolean z) {
        InterfaceC10835l interfaceC10835l = (InterfaceC10835l) (z ? yandex : loadAd).mopub(interfaceC13460l);
        return interfaceC10835l == null ? new C13538l(interfaceC13460l, z) : interfaceC10835l;
    }

    public static final C13660l crashlytics(boolean z) {
        C13660l c13660l = new C13660l(9);
        C14855l c14855l = C18450l.f36026l;
        c13660l.vip(c14855l, new C13538l(c14855l, z));
        C14855l c14855l2 = C18450l.f36017l;
        c13660l.vip(c14855l2, new C13538l(c14855l2, z));
        C14855l c14855l3 = C18450l.f36036l;
        c13660l.vip(c14855l3, new C13538l(c14855l3, z));
        C14855l c14855l4 = C18450l.f36035l;
        c13660l.vip(c14855l4, new C13538l(c14855l4, z));
        C14855l c14855l5 = C18450l.f36043l;
        c13660l.vip(c14855l5, new C13538l(c14855l5, z));
        C14855l c14855l6 = C18450l.f36018l;
        c13660l.vip(c14855l6, new C13538l(c14855l6, z));
        C14855l c14855l7 = C18450l.f36021l;
        c13660l.vip(c14855l7, new C13538l(c14855l7, z));
        C14855l c14855l8 = C18450l.f36042l;
        c13660l.vip(c14855l8, new C13538l(c14855l8, z));
        C14855l c14855l9 = C18450l.f36032l;
        c13660l.vip(c14855l9, new C13538l(c14855l9, z));
        return c13660l;
    }

    public static final void loadAd(AbstractC9601l abstractC9601l, AbstractC10113l abstractC10113l, InterfaceC6357l interfaceC6357l, EnumC9931l enumC9931l, int i, int i2, InterfaceC13460l interfaceC13460l) {
        C14855l c14855l;
        Object objSignature = interfaceC6357l.Signature();
        C18619l c18619l = objSignature instanceof C18619l ? (C18619l) objSignature : null;
        AbstractC9601l.isPro(abstractC9601l, abstractC10113l, ((c18619l == null || (c14855l = c18619l.f36377l) == null) ? interfaceC13460l : c14855l).yandex((((long) abstractC10113l.f20592l) << 32) | (((long) abstractC10113l.f20591l) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), enumC9931l));
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-211209833);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, crashlytics, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17292l(interfaceC17242l, i);
        }
    }
}
