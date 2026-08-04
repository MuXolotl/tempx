package defpackage;

import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُۖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11249l extends AbstractC5097l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ int f22670l = 0;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f22671l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final AbstractC18643l f22672l;

    public C11249l(AbstractC18643l abstractC18643l, InterfaceC0582l interfaceC0582l) {
        super(false, 3);
        this.f22672l = abstractC18643l;
        this.f22671l = AbstractC8020l.smaato(interfaceC0582l);
    }

    public final void ad(InterfaceC17242l interfaceC17242l, AbstractC14165l abstractC14165l, String str, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-229475852);
        int i2 = i | (c6956l2.admob(abstractC14165l) ? 32 : 16) | (c6956l2.billing(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C16170l c16170l = C16170l.yandex;
            C14855l c14855l = C18450l.f36043l;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c16170l.yandex(c4346l, c14855l), 16.0f, 0.0f, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC4597l.loadAd(abstractC14165l, null, AbstractC0080l.isPro(c4346l, 36.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, c6956l2, 440 | ((i2 >> 3) & 14), 0);
            AbstractC13010l.loadAd(str, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, AbstractC7039l.isPro(15), null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l, ((i2 >> 6) & 14) | 24576, 0, 261098);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(this, interfaceC17242l, abstractC14165l, str, i, 8);
        }
    }

    public final void advert(C16016l c16016l, C9247l c9247l, C6956l c6956l, int i) {
        c6956l.m2133new(1226223252);
        int i2 = i | (c6956l.billing(c16016l) ? 4 : 2) | (c6956l.billing(c9247l) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C17253l c17253lAmazon = AbstractC3605l.amazon(0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean z = (i2 & 14) == 4;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C17015l(29, c16016l);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(c9247l, null, c17253lAmazon, null, null, null, false, null, (Function1) objM2132native, c6956l, ((i2 >> 3) & 14) | 384, 506);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l((Object) this, (Object) c16016l, (Object) c9247l, i, 19);
        }
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(1150249944);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC11028l.billing(c6956l, 0);
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-672282147, new C11798l(this), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11798l(this, i);
        }
    }

    public final void pro(C6143l c6143l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-1690460445);
        int i2 = i | (c6956l.billing(c6143l) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
            boolean z = (i2 & 14) == 4;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C8250l(0, c6143l);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(interfaceC17242l, null, c17253l, null, null, null, false, null, (Function1) objM2132native, c6956l, 390, 506);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l((Object) this, (Object) c6143l, interfaceC17242l, i, 20);
        }
    }
}
