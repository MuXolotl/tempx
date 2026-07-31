package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lِؗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4830l {
    public static final C3541l yandex;

    static {
        C8540l c8540l = AbstractC3017l.yandex;
        long j = C9735l.purchase;
        long j2 = C9735l.loadAd;
        yandex = new C3541l(j, j2, j2, C9735l.loadAd(0.38f, j2), C9735l.loadAd(0.38f, j2));
    }

    public static final void crashlytics(String str, boolean z, C3541l c3541l, InterfaceC17242l interfaceC17242l, Function3 function3, Function0 function0, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-2001167027);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(c3541l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.admob(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.admob(function0) ? 131072 : 65536;
        }
        if (c6956l.m2127for(i2 & 1, (74899 & i2) != 74898)) {
            C0086l c0086l = AbstractC12259l.yandex;
            float f = AbstractC12259l.crashlytics;
            C7537l c7537l = new C7537l(f, true, new C8339l(12));
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 458752) == 131072);
            Object objM2132native = c6956l.m2132native();
            if (z2 || objM2132native == C1867l.yandex) {
                objM2132native = new C5023l(z, function0, 2);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.smaato(AbstractC0080l.amazon(AbstractC9151l.loadAd(interfaceC17242l, z, str, (Function0) objM2132native, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            C5062l c5062lYandex = AbstractC7001l.yandex(c7537l, c0086l, c6956l, 54);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            if (function3 == null) {
                c6956l.m2123default(-1597947094);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1597947093);
                float f2 = AbstractC12259l.purchase;
                InterfaceC17242l interfaceC17242lSubs = AbstractC0080l.subs(C4346l.f8873l, f2, 0.0f, f2, f2, 2);
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                long j2 = c6956l.f14595continue;
                int i4 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lSubs);
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
                AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                function3.invoke(new C9735l(z ? c3541l.crashlytics : c3541l.purchase), c6956l, 0);
                c6956l.startapp(true);
                c6956l.startapp(false);
            }
            long j3 = z ? c3541l.loadAd : c3541l.amazon;
            AbstractC17307l.loadAd(str, new C9247l(1.0f, true), new C11090l(j3, AbstractC12259l.admob, AbstractC12259l.subs, null, AbstractC12259l.firebase, 0L, AbstractC12259l.loadAd, 0, AbstractC12259l.isPro, 16613240), null, 0, false, 1, 0, c6956l, (i2 & 14) | 1572864, 952);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4186l(str, z, c3541l, interfaceC17242l, function3, function0, i);
        }
    }

    public static final void loadAd(InterfaceC17242l interfaceC17242l, C3541l c3541l, Function1 function1, C6956l c6956l, int i, int i2) {
        int i3;
        int i4;
        c6956l.m2133new(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (c6956l.billing(c3541l) ? 32 : 16);
        }
        int i7 = i4 | (c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                interfaceC17242l = C4346l.f8873l;
            }
            if (i6 != 0) {
                c3541l = yandex;
            }
            yandex(c3541l, interfaceC17242l, AbstractC14566l.amazon(-250345048, new C7442l(function1, c3541l, 27), c6956l), c6956l, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            c6956l.m2124else();
        }
        InterfaceC17242l interfaceC17242l2 = interfaceC17242l;
        C3541l c3541l2 = c3541l;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(i, i2, 9, interfaceC17242l2, c3541l2, function1);
        }
    }

    public static final void yandex(C3541l c3541l, InterfaceC17242l interfaceC17242l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-527864079);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(c3541l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C0086l c0086l = AbstractC12259l.yandex;
            InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC3605l.vip(AbstractC10409l.admob(AbstractC4927l.amazon(AbstractC6660l.subs(interfaceC17242l, 3.0f, AbstractC7497l.yandex(4.0f), false, 28), c3541l.yandex, AbstractC16837l.yandex), 2), 0.0f, AbstractC12259l.amazon, 1), AbstractC13841l.crashlytics(c6956l), true);
            int i3 = (i2 << 3) & 7168;
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lPurchase);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c15578l.invoke(C0397l.yandex, c6956l, Integer.valueOf(((i3 >> 6) & 112) | 6));
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(c3541l, interfaceC17242l, c15578l, i, 10);
        }
    }
}
