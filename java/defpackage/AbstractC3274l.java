package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌؕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3274l {
    public static final C8540l yandex = new C8540l(new C5146l(29));

    public static final InterfaceC17242l amazon(InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l, long j, C5028l c5028l, float f) {
        InterfaceC6347l interfaceC6347l2;
        InterfaceC17242l interfaceC17242lCrashlytics;
        InterfaceC17242l c14895l = C4346l.f8873l;
        if (f > 0.0f) {
            interfaceC6347l2 = interfaceC6347l;
            interfaceC17242lCrashlytics = AbstractC7477l.crashlytics(c14895l, 0.0f, 0.0f, 0.0f, f, 0.0f, interfaceC6347l2, false, 1042399);
        } else {
            interfaceC6347l2 = interfaceC6347l;
            interfaceC17242lCrashlytics = c14895l;
        }
        InterfaceC17242l interfaceC17242lPremium = interfaceC17242l.premium(interfaceC17242lCrashlytics);
        if (c5028l != null) {
            c14895l = new C14895l(c5028l.yandex, c5028l.loadAd, interfaceC6347l2);
        }
        return AbstractC0019l.crashlytics(AbstractC4927l.amazon(interfaceC17242lPremium.premium(c14895l), j, interfaceC6347l2), interfaceC6347l2);
    }

    public static final void crashlytics(final Function0 function0, final InterfaceC17242l interfaceC17242l, boolean z, InterfaceC6347l interfaceC6347l, final long j, long j2, float f, float f2, C5028l c5028l, C2403l c2403l, final C15578l c15578l, C6956l c6956l, int i, int i2) {
        final boolean z2 = (i2 & 4) != 0 ? true : z;
        final InterfaceC6347l interfaceC6347l2 = (i2 & 8) != 0 ? AbstractC16837l.yandex : interfaceC6347l;
        long jLoadAd = (i2 & 32) != 0 ? AbstractC15038l.loadAd(j, c6956l) : j2;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        final float f4 = (i2 & 128) != 0 ? 0.0f : f2;
        final C5028l c5028l2 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : c5028l;
        C2403l c2403l2 = (i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c2403l : null;
        if (c2403l2 == null) {
            c6956l.m2123default(-1701074900);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            c2403l2 = (C2403l) objM2132native;
        } else {
            c6956l.m2123default(2023335947);
        }
        c6956l.startapp(false);
        final C2403l c2403l3 = c2403l2;
        C8540l c8540l = yandex;
        final float f5 = ((C14467l) c6956l.isPro(c8540l)).f28331l + f3;
        AbstractC10478l.loadAd(new C10092l[]{AbstractC5020l.startapp(jLoadAd, AbstractC12502l.yandex), c8540l.yandex(new C14467l(f5))}, AbstractC14566l.amazon(849208527, new Function2() { // from class: l۟ؗ
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17857l c17857l = AbstractC16434l.yandex;
                    InterfaceC17242l interfaceC17242lPremium = interfaceC17242l.premium(C18158l.f35556l);
                    C8540l c8540l2 = AbstractC10493l.yandex;
                    C2109l c2109l = ((C1504l) c6956l2.isPro(c8540l2)).yandex;
                    InterfaceC17242l interfaceC17242lPremium2 = interfaceC17242lPremium.premium(C4346l.f8873l);
                    long jPurchase = AbstractC3274l.purchase(j, f5, c6956l2);
                    float fMo868instanceof = ((InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob)).mo868instanceof(f4);
                    InterfaceC6347l interfaceC6347l3 = interfaceC6347l2;
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC3274l.amazon(interfaceC17242lPremium2, interfaceC6347l3, jPurchase, c5028l2, fMo868instanceof);
                    C2109l c2109l2 = ((C1504l) c6956l2.isPro(c8540l2)).yandex;
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC1135l.loadAd(AbstractC9151l.yandex(interfaceC17242lAmazon, c2403l3, AbstractC10493l.yandex(false, 0.0f, 0L, interfaceC6347l3, 215), z2, null, function0, 24));
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, true);
                    long j3 = c6956l2.f14595continue;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC2812l.pro(0, c15578l, c6956l2, true);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            }
        }, c6956l), c6956l, 56);
    }

    public static final void loadAd(final boolean z, final Function0 function0, final InterfaceC17242l interfaceC17242l, final boolean z2, final InterfaceC6347l interfaceC6347l, final long j, long j2, float f, final C5028l c5028l, C2403l c2403l, final C15578l c15578l, C6956l c6956l, int i, int i2) {
        final C2403l c2403l2;
        long jLoadAd = (i2 & 64) != 0 ? AbstractC15038l.loadAd(j, c6956l) : j2;
        final float f2 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0.0f : f;
        if (c2403l == null) {
            c6956l.m2123default(1528105640);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            c2403l2 = (C2403l) objM2132native;
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(-227801585);
            c6956l.startapp(false);
            c2403l2 = c2403l;
        }
        C8540l c8540l = yandex;
        final float f3 = ((C14467l) c6956l.isPro(c8540l)).f28331l + 0.0f;
        AbstractC10478l.loadAd(new C10092l[]{AbstractC5020l.startapp(jLoadAd, AbstractC12502l.yandex), c8540l.yandex(new C14467l(f3))}, AbstractC14566l.amazon(1508735219, new Function2() { // from class: lٌِؕ
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17857l c17857l = AbstractC16434l.yandex;
                    InterfaceC17242l interfaceC17242lPremium = interfaceC17242l.premium(C18158l.f35556l);
                    C8540l c8540l2 = AbstractC10493l.yandex;
                    C2109l c2109l = ((C1504l) c6956l2.isPro(c8540l2)).yandex;
                    InterfaceC17242l interfaceC17242lPremium2 = interfaceC17242lPremium.premium(C4346l.f8873l);
                    long jPurchase = AbstractC3274l.purchase(j, f3, c6956l2);
                    float fMo868instanceof = ((InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob)).mo868instanceof(f2);
                    InterfaceC6347l interfaceC6347l2 = interfaceC6347l;
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC3274l.amazon(interfaceC17242lPremium2, interfaceC6347l2, jPurchase, c5028l, fMo868instanceof);
                    C2109l c2109l2 = ((C1504l) c6956l2.isPro(c8540l2)).yandex;
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC1135l.loadAd(AbstractC10586l.admob(interfaceC17242lAmazon, z, c2403l2, AbstractC10493l.yandex(false, 0.0f, 0L, interfaceC6347l2, 215), z2, null, function0));
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, true);
                    long j3 = c6956l2.f14595continue;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC2812l.pro(0, c15578l, c6956l2, true);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            }
        }, c6956l), c6956l, 56);
    }

    public static final long purchase(long j, float f, C6956l c6956l) {
        C0764l c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
        return (C9735l.crashlytics(j, c0764l.startapp) && ((Boolean) c6956l.isPro(AbstractC15038l.yandex)).booleanValue()) ? AbstractC15038l.mopub(c0764l, f) : j;
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l, long j, long j2, float f, float f2, C5028l c5028l, final C15578l c15578l, C6956l c6956l, int i, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC17242l = C4346l.f8873l;
        }
        if ((i2 & 2) != 0) {
            interfaceC6347l = AbstractC16837l.yandex;
        }
        if ((i2 & 4) != 0) {
            j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
        }
        if ((i2 & 8) != 0) {
            j2 = AbstractC15038l.loadAd(j, c6956l);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            c5028l = null;
        }
        C8540l c8540l = yandex;
        final float f3 = f + ((C14467l) c6956l.isPro(c8540l)).f28331l;
        C10092l[] c10092lArr = {AbstractC5020l.startapp(j2, AbstractC12502l.yandex), c8540l.yandex(new C14467l(f3))};
        final long j3 = j;
        final InterfaceC6347l interfaceC6347l2 = interfaceC6347l;
        final C5028l c5028l2 = c5028l;
        final float f4 = f2;
        final InterfaceC17242l interfaceC17242l2 = interfaceC17242l;
        AbstractC10478l.loadAd(c10092lArr, AbstractC14566l.amazon(421772006, new Function2() { // from class: lْؕۖ
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC3274l.amazon(interfaceC17242l2, interfaceC6347l2, AbstractC3274l.purchase(j3, f3, c6956l2), c5028l2, ((InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob)).mo868instanceof(f4));
                    Object objM2132native = c6956l2.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (objM2132native == c13863l) {
                        objM2132native = new C1698l(21);
                        c6956l2.m2147try(objM2132native);
                    }
                    InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242lAmazon, false, (Function1) objM2132native);
                    Unit unit = Unit.INSTANCE;
                    Object objM2132native2 = c6956l2.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = C9523l.f19422l;
                        c6956l2.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lYandex2 = AbstractC1782l.yandex(interfaceC17242lYandex, unit, (PointerInputEventHandler) objM2132native2);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, true);
                    long j4 = c6956l2.f14595continue;
                    int i3 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lYandex2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC2812l.pro(0, c15578l, c6956l2, true);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            }
        }, c6956l), c6956l, 56);
    }
}
