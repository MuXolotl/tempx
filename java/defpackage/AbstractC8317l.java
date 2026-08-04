package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًّۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8317l {
    public static boolean startapp;
    public static final C15578l yandex = new C15578l(-2034081849, false, new C4076l(6));
    public static final C15578l loadAd = new C15578l(1493565113, false, new C3817l(20));
    public static final C15578l crashlytics = new C15578l(2122645538, false, new C3817l(21));
    public static final C15578l amazon = new C15578l(-1018142321, false, new C4076l(12));
    public static final C15578l purchase = new C15578l(1775152123, false, new C4076l(13));
    public static final C15578l billing = new C15578l(-626299271, false, new C3817l(15));
    public static final C15578l mopub = new C15578l(-1996232038, false, new C3817l(16));
    public static final C15578l admob = new C15578l(-622147005, false, new C3817l(17));
    public static final C15578l subs = new C15578l(1452405000, false, new C3817l(18));
    public static final C15578l isPro = new C15578l(-662175963, false, new C3817l(19));
    public static final C15578l firebase = new C15578l(-57308887, false, new C4076l(7));
    public static final C15578l smaato = new C15578l(-1749190078, false, new C4076l(8));
    public static final C15578l remoteconfig = new C15578l(1565861254, false, new C4076l(9));
    public static final C15578l vip = new C15578l(1082466628, false, new C4076l(10));
    public static final C15578l metrica = new C15578l(290185458, false, new C4076l(11));

    public static final InterfaceC8714l loadAd(C2403l c2403l, C6956l c6956l, int i) {
        Object objM2132native = c6956l.m2132native();
        C13863l c13863l = C1867l.yandex;
        if (objM2132native == c13863l) {
            objM2132native = AbstractC8020l.smaato(Boolean.FALSE);
            c6956l.m2147try(objM2132native);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
        boolean z = (((i & 14) ^ 6) > 4 && c6956l.billing(c2403l)) || (i & 6) == 4;
        Object objM2132native2 = c6956l.m2132native();
        if (z || objM2132native2 == c13863l) {
            objM2132native2 = new C15416l(c2403l, interfaceC8714l, null, 2);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.amazon(c6956l, c2403l, (Function2) objM2132native2);
        return interfaceC8714l;
    }

    public static final void yandex(final C11804l c11804l, final String str, final InterfaceC17242l interfaceC17242l, final Function1 function1, final Function1 function2, final InterfaceC13460l interfaceC13460l, final InterfaceC17030l interfaceC17030l, final AbstractC8939l abstractC8939l, C6956l c6956l, final int i, final int i2) {
        int i3;
        Function1 function3;
        Function1 function4;
        InterfaceC13460l interfaceC13460l2;
        int i4;
        C7819l c7819l;
        c6956l.m2133new(1236588022);
        if ((i & 6) == 0) {
            i3 = (c6956l.billing(c11804l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.billing(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            function3 = function1;
            i3 |= c6956l.admob(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i & 24576) == 0) {
            function4 = function2;
            i3 |= c6956l.admob(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if ((196608 & i) == 0) {
            interfaceC13460l2 = interfaceC13460l;
            i3 |= c6956l.billing(interfaceC13460l2) ? 131072 : 65536;
        } else {
            interfaceC13460l2 = interfaceC13460l;
        }
        if ((1572864 & i) == 0) {
            i3 |= c6956l.billing(interfaceC17030l) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= c6956l.crashlytics(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= c6956l.billing(abstractC8939l) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= c6956l.amazon(1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c6956l.mopub(true) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (c6956l.m2127for(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            Object obj = c11804l.yandex;
            int i5 = AbstractC1924l.loadAd;
            c6956l.m2123default(-329318062);
            boolean z = obj instanceof C7819l;
            Object obj2 = C1867l.yandex;
            if (z) {
                c6956l.m2123default(-1008942344);
                c7819l = (C7819l) obj;
                if (c7819l.license.admob != null) {
                    c6956l.m2123default(-1008902292);
                    c6956l.startapp(false);
                    c6956l.startapp(false);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-1008854118);
                    InterfaceC0476l interfaceC0476lYandex = AbstractC1924l.yandex(interfaceC17030l, c6956l);
                    boolean zBilling = c6956l.billing(obj) | c6956l.billing(interfaceC0476lYandex);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == obj2) {
                        C9477l c9477lYandex = C7819l.yandex(c7819l);
                        c9477lYandex.adcel = interfaceC0476lYandex;
                        objM2132native = c9477lYandex.yandex();
                        c6956l.m2147try(objM2132native);
                    }
                    c7819l = (C7819l) objM2132native;
                    AbstractC12900l.ads(c6956l, false, false, false);
                }
            } else {
                c6956l.m2123default(-1008595950);
                Context context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
                InterfaceC0476l interfaceC0476lYandex2 = AbstractC1924l.yandex(interfaceC17030l, c6956l);
                boolean zBilling2 = c6956l.billing(context) | c6956l.billing(obj) | c6956l.billing(interfaceC0476lYandex2);
                Object objM2132native2 = c6956l.m2132native();
                if (zBilling2 || objM2132native2 == obj2) {
                    C9477l c9477l = new C9477l(context);
                    c9477l.crashlytics = obj;
                    c9477l.adcel = interfaceC0476lYandex2;
                    objM2132native2 = c9477l.yandex();
                    c6956l.m2147try(objM2132native2);
                }
                c7819l = (C7819l) objM2132native2;
                c6956l.startapp(false);
                c6956l.startapp(false);
            }
            Object obj3 = c7819l.loadAd;
            if (obj3 instanceof C9477l) {
                C8339l.metrica("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
                return;
            }
            C13204l c13204l = null;
            if (obj3 instanceof C14115l) {
                AbstractC1924l.crashlytics("ImageBitmap");
                throw null;
            }
            if (obj3 instanceof C5197l) {
                AbstractC1924l.crashlytics("ImageVector");
                throw null;
            }
            if (obj3 instanceof AbstractC14165l) {
                AbstractC1924l.crashlytics("Painter");
                throw null;
            }
            if (c7819l.crashlytics != null) {
                C8339l.metrica("request.target must be null.");
                return;
            }
            if (((AbstractC6475l) AbstractC0532l.crashlytics(c7819l, AbstractC10413l.purchase)) != null) {
                C8339l.metrica("request.lifecycle must be null.");
                return;
            }
            C13177l c13177l = c11804l.crashlytics;
            C7190l c7190l = c11804l.loadAd;
            if (((Boolean) c6956l.isPro(AbstractC13622l.yandex)).booleanValue()) {
                c6956l.m2123default(2019030948);
                c13204l = (C13204l) c6956l.isPro(AbstractC1716l.yandex);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(2019088453);
                c6956l.startapp(false);
            }
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242l.premium(new C13792l(c7819l, c13177l, c7190l, function3, function4, interfaceC13460l2, interfaceC17030l, abstractC8939l, c13204l, str));
            C10327l c10327l = C10327l.firebase;
            long j = c6956l.f14595continue;
            int i6 = (int) (j ^ (j >>> 32));
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lPremium);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c10327l, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            Function2 function5 = C3438l.isPro;
            if (c6956l.f14603switch || !AbstractC8576l.yandex(c6956l.m2132native(), Integer.valueOf(i6))) {
                c6956l.m2147try(Integer.valueOf(i6));
                c6956l.loadAd(Integer.valueOf(i6), function5);
            }
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٌۨۘ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    AbstractC8317l.yandex(c11804l, str, interfaceC17242l, function1, function2, interfaceC13460l, interfaceC17030l, abstractC8939l, (C6956l) obj4, AbstractC0545l.purchase(i | 1), AbstractC0545l.purchase(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
