package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: protected, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Cprotected implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f36545l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f36546l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36547l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f36548l;

    public /* synthetic */ Cprotected(Object obj, Object obj2, Object obj3, int i) {
        this.f36547l = i;
        this.f36546l = obj;
        this.f36545l = obj2;
        this.f36548l = obj3;
    }

    private final Object adcel(Object obj, Object obj2, Object obj3) {
        InterfaceC16088l interfaceC16088l = (InterfaceC16088l) this.f36546l;
        C8583l c8583l = (C8583l) this.f36545l;
        InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f36548l;
        InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            AbstractC5833l.yandex(((C10610l) interfaceC16088l).admob, AbstractC3605l.firebase(C4346l.f8873l, interfaceC11780l), AbstractC14566l.amazon(-358414524, new C0541l(c8583l, interfaceC12244l, 26), c6956l), c6956l, 3072, 4);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object admob(Object obj, Object obj2, Object obj3) {
        List list = (List) this.f36546l;
        C17984l c17984l = (C17984l) this.f36545l;
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f36548l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zAdmob = c6956l.admob(list) | c6956l.admob(c17984l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new Ctransient(list, c17984l, interfaceC8714l, 22);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(null, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 511);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object ads(Object obj, Object obj2, Object obj3) {
        C4261l c4261l = (C4261l) this.f36546l;
        InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f36545l;
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f36548l;
        InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) c4261l.f8745l.getValue()).booleanValue();
            C13863l c13863l = C1867l.yandex;
            C4346l c4346l = C4346l.f8873l;
            if (zBooleanValue) {
                c6956l.m2123default(-1139120237);
                InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(AbstractC3605l.firebase(c4346l, interfaceC11780l), 1.0f);
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                long j = c6956l.f14595continue;
                int i = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i), C3438l.isPro);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC13841l.crashlytics(c6956l), true);
                Throwable exc = c4261l.f8749l;
                if (exc == null) {
                    exc = new Exception();
                }
                InterfaceC5475l interfaceC5475lMetrica = C6168l.metrica(exc);
                boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.admob(c4261l) | c6956l.billing(interfaceC12244l);
                Object objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == c13863l) {
                    objM2132native = new Cfinally(interfaceC2262l, c4261l, interfaceC12244l, 25);
                    c6956l.m2147try(objM2132native);
                }
                AbstractC0124l.loadAd(interfaceC5475lMetrica, (Function0) objM2132native, interfaceC17242lPurchase, false, c6956l, 0, 8);
                c6956l.startapp(true);
                c6956l.startapp(false);
            } else if (((Boolean) c4261l.f8747l.getValue()).booleanValue()) {
                c6956l.m2123default(-1138454109);
                AbstractC7209l.yandex(AbstractC0080l.crashlytics(c4346l, 1.0f), true, 0L, c6956l, 54, 4);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1138164414);
                InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0080l.crashlytics(c4346l, 1.0f);
                boolean zAdmob2 = c6956l.admob(c4261l) | c6956l.billing(interfaceC12244l);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob2 || objM2132native2 == c13863l) {
                    objM2132native2 = new C8854l(c4261l, interfaceC12244l, 26);
                    c6956l.m2147try(objM2132native2);
                }
                AbstractC16336l.yandex(interfaceC17242lCrashlytics2, null, interfaceC11780l, null, null, null, false, null, (Function1) objM2132native2, c6956l, ((iIntValue << 6) & 896) | 6, 506);
                c6956l.startapp(false);
            }
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object billing(Object obj, Object obj2, Object obj3) {
        InterfaceC3102l interfaceC3102l = (InterfaceC3102l) this.f36546l;
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f36545l;
        C2994l c2994l = (C2994l) this.f36548l;
        InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), interfaceC11780l), interfaceC3102l.loadAd(), null);
            C17253l c17253lAmazon = AbstractC3605l.amazon(24.0f, 0.0f, 24.0f, 88.0f, 2);
            boolean zBilling = c6956l.billing(interfaceC8714l) | c6956l.admob(c2994l);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C3005l(interfaceC8714l, c2994l, 10);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(interfaceC17242lMopub, null, c17253lAmazon, null, null, null, false, null, (Function1) objM2132native, c6956l, 384, 506);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object isPro(Object obj, Object obj2, Object obj3) {
        EnumC12999l enumC12999l = (EnumC12999l) this.f36546l;
        Function1 function1 = (Function1) this.f36545l;
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f36548l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean z = enumC12999l == null;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zBilling = c6956l.billing(function1);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C13023l(function1, interfaceC8714l, 1);
                c6956l.m2147try(objM2132native);
            }
            AbstractC8007l.loadAd(null, z, false, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), c6956l, 390);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object metrica(Object obj, Object obj2, Object obj3) {
        C11749l c11749l = (C11749l) this.f36546l;
        C6001l c6001l = (C6001l) this.f36545l;
        C15578l c15578l = (C15578l) this.f36548l;
        C6956l c6956l = (C6956l) obj2;
        ((Integer) obj3).getClass();
        InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 0.0f, 16.0f, 1);
        C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36034l, c6956l, 54);
        long j = c6956l.f14595continue;
        int i = (int) (j ^ (j >>> 32));
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
        AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
        AbstractC8182l.billing(c6956l, Integer.valueOf(i), C3438l.isPro);
        AbstractC8182l.purchase(c6956l, C3438l.firebase);
        AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
        c11749l.isVip(c6001l, c6956l, 0);
        c15578l.invoke(C0397l.yandex, c6956l, 6);
        c11749l.signatures(c6001l, c6956l, 0);
        c6956l.startapp(true);
        return Unit.INSTANCE;
    }

    private final Object mopub(Object obj, Object obj2, Object obj3) {
        C16911l c16911l = (C16911l) this.f36546l;
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f36545l;
        InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f36548l;
        C7091l c7091l = (C7091l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(c7091l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean z = ((C3278l) interfaceC12244l.getValue()).f7020l;
            InterfaceC17242l interfaceC17242lSmaato = AbstractC5020l.smaato(c7091l, C4346l.f8873l);
            boolean zAdmob = c6956l.admob(interfaceC2262l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C15299l(interfaceC2262l, i);
                c6956l.m2147try(objM2132native);
            }
            c16911l.m4250import(z, (Function1) objM2132native, interfaceC17242lSmaato, Integer.valueOf(R.string.settings_experimental_vkru_desc), false, c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object remoteconfig(Object obj, Object obj2, Object obj3) {
        boolean z;
        C11749l c11749l = (C11749l) this.f36546l;
        C18113l c18113l = (C18113l) this.f36545l;
        AbstractC13264l abstractC13264l = (AbstractC13264l) this.f36548l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            InterfaceC4944l interfaceC4944l = (InterfaceC4944l) c11749l.f23530l.getValue();
            boolean z2 = interfaceC4944l instanceof C9424l;
            C4346l c4346l = C4346l.f8873l;
            if (z2) {
                c6956l.m2123default(2083874809);
                C9424l c9424l = (C9424l) interfaceC4944l;
                if (c9424l.yandex.isEmpty()) {
                    c6956l.m2123default(2083882559);
                    c11749l.ad(R.string.ny26_error_empty, 0, c6956l);
                    c6956l.startapp(false);
                    z = false;
                } else {
                    c6956l.m2123default(2084006869);
                    InterfaceC17242l interfaceC17242lPremium = AbstractC0080l.crashlytics(c4346l, 1.0f).premium(new C15850l(c18113l));
                    WeakHashMap weakHashMap = C12923l.pro;
                    C9297l c9297l = C6760l.smaato(c6956l).purchase;
                    z = false;
                    AbstractC7252l.crashlytics(abstractC13264l, interfaceC17242lPremium, null, new C14513l(c9297l.purchase().amazon, 14, (byte) 0), 16.0f, null, null, false, null, null, null, AbstractC14566l.amazon(1025898400, new C15881l(c9424l, abstractC13264l, c11749l, 3), c6956l), c6956l, 196608);
                    c6956l.startapp(false);
                }
                c6956l.startapp(z);
            } else if (AbstractC8576l.yandex(interfaceC4944l, C1813l.yandex)) {
                c6956l.m2123default(2085121288);
                c11749l.ad(R.string.ny24_error_data, 0, c6956l);
                c6956l.startapp(false);
            } else if (AbstractC8576l.yandex(interfaceC4944l, C11997l.yandex)) {
                c6956l.m2123default(2085247303);
                c11749l.ad(R.string.ny24_error_token, 0, c6956l);
                c6956l.startapp(false);
            } else {
                if (!AbstractC8576l.yandex(interfaceC4944l, C13415l.yandex)) {
                    throw AbstractC12900l.billing(1175598930, c6956l, false);
                }
                c6956l.m2123default(2085363708);
                AbstractC7209l.yandex(AbstractC0080l.crashlytics(c4346l, 1.0f), false, C9735l.purchase, c6956l, 390, 2);
                c6956l.startapp(false);
            }
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object smaato(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f36546l;
        C10507l c10507l = (C10507l) this.f36545l;
        Function0 function1 = (Function0) this.f36548l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = 0;
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            C2287l.loadAd(((Boolean) function0.invoke()).booleanValue(), c10507l.yandex.equals(function1.invoke()), AbstractC14566l.amazon(1159574521, new C7897l(c10507l, i), c6956l), c6956l, 384);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object startapp(Object obj, Object obj2, Object obj3) {
        InterfaceC3102l interfaceC3102l = (InterfaceC3102l) this.f36546l;
        C18306l c18306l = (C18306l) this.f36545l;
        C12708l c12708l = (C12708l) this.f36548l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = 16;
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), interfaceC3102l.loadAd(), null);
            C17253l c17253lLoadAd = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).loadAd(c6956l);
            boolean zAdmob = c6956l.admob(c18306l) | c6956l.admob(c12708l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C8854l(c12708l, c18306l, i);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(interfaceC17242lMopub, null, c17253lLoadAd, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 506);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object subs(Object obj, Object obj2, Object obj3) {
        InterfaceC3102l interfaceC3102l = (InterfaceC3102l) this.f36546l;
        C5073l c5073l = (C5073l) this.f36545l;
        C13765l c13765l = (C13765l) this.f36548l;
        InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), interfaceC11780l), interfaceC3102l.loadAd(), null);
            boolean zBilling = c6956l.billing(c5073l) | c6956l.billing(c13765l);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C3005l(c5073l, c13765l, 27);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 510);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0373  */
    /* JADX WARN: Code duplicated, block: B:59:0x037b  */
    /* JADX WARN: Code duplicated, block: B:63:0x039f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0400  */
    private final Object yandex(Object obj, Object obj2, Object obj3) {
        C15578l c15578lAmazon;
        EnumC3830l enumC3830l;
        C13863l c13863l;
        boolean zAdmob;
        Object objM2132native;
        C13863l c13863l2;
        C11562l c11562l;
        boolean zAdmob2;
        Object objM2132native2;
        final C10178l c10178l = (C10178l) this.f36546l;
        final C11562l c11562l2 = (C11562l) this.f36545l;
        C10086l c10086l = c11562l2.f23237l;
        C6523l c6523l = (C6523l) this.f36548l;
        InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC0080l.crashlytics(AbstractC3605l.vip(AbstractC3605l.firebase(c4346l, interfaceC11780l), 16.0f, 0.0f, 2), 1.0f), AbstractC13841l.crashlytics(c6956l), true);
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
            C15089l c15089l = C18450l.f36046l;
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l, 6);
            long j = c6956l.f14595continue;
            int i = (int) (j ^ (j >>> 32));
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
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c15089l, c6956l, 6);
            long j2 = c6956l.f14595continue;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i2, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.auth2_username_title), AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).purchase, c6956l, 48, 0, 130044);
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.auth2_username_text), AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).isPro, c6956l, 48, 0, 130040);
            c6956l.startapp(true);
            C11485l c11485l = C11485l.f23084l;
            C3790l c3790l = new C3790l(6, 7, 115);
            boolean zBilling = c6956l.billing(c10178l) | c6956l.admob(c11562l2);
            Object objM2132native3 = c6956l.m2132native();
            C13863l c13863l3 = C1867l.yandex;
            if (zBilling || objM2132native3 == c13863l3) {
                objM2132native3 = new InterfaceC11381l() { // from class: lؙٔۜ
                    @Override // defpackage.InterfaceC11381l
                    public final void yandex(C15803l c15803l) {
                        c15803l.invoke();
                        C10178l c10178l2 = c10178l;
                        if (c10178l2.loadAd().f12057l.length() > 0) {
                            String string = c10178l2.loadAd().f12057l.toString();
                            C11562l c11562l3 = c11562l2;
                            c11562l3.f23237l.setValue("");
                            c11562l3.f23236l.setValue(Boolean.TRUE);
                            AbstractC10999l.mopub(AbstractC11990l.firebase(c11562l3), null, 0, new C18731l(string, c11562l3, null, 22), 3);
                        }
                    }
                };
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC11381l interfaceC11381l = (InterfaceC11381l) objM2132native3;
            C1351l c1351lSubs = C11140l.subs(AbstractC13106l.purchase(c6956l).ads, AbstractC13106l.purchase(c6956l).ads, AbstractC13106l.purchase(c6956l).ads, AbstractC13106l.purchase(c6956l).ads, c6956l, 2147483407);
            if (((String) c10086l.getValue()).length() > 0) {
                c6956l.m2123default(848575938);
                c15578lAmazon = AbstractC14566l.amazon(261972594, new C1321l(c11562l2, 2, (byte) 0), c6956l);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(848692528);
                c6956l.startapp(false);
                c15578lAmazon = null;
            }
            C15578l c15578l = c15578lAmazon;
            boolean z = ((String) c10086l.getValue()).length() > 0;
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC9966l.billing(AbstractC0080l.amazon(c4346l, 1.0f).premium(C14786l.f28910l), c6523l);
            Object objM2132native4 = c6956l.m2132native();
            if (objM2132native4 == c13863l3) {
                objM2132native4 = new C4741l(19);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC2130l.loadAd(c10178l, AbstractC4962l.yandex(interfaceC17242lBilling3, false, (Function1) objM2132native4), false, null, null, AbstractC4311l.crashlytics, c15578l, z, null, c3790l, interfaceC11381l, c11485l, null, null, c1351lSubs, null, c6956l, 12582912, 102236160, 28888956);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
            String strPurchase = AbstractC11999l.purchase(c6956l, R.string.auth2_username_action);
            if (((Boolean) c11562l2.f23236l.getValue()).booleanValue()) {
                enumC3830l = EnumC3830l.f7941l;
            } else {
                enumC3830l = c10178l.loadAd().f12057l.length() > 0 ? EnumC3830l.f7942l : EnumC3830l.f7943l;
            }
            EnumC3830l enumC3830l2 = enumC3830l;
            boolean zAdmob3 = c6956l.admob(c11562l2) | c6956l.billing(c10178l);
            Object objM2132native5 = c6956l.m2132native();
            if (zAdmob3) {
                c13863l = c13863l3;
            } else {
                c13863l = c13863l3;
                if (objM2132native5 == c13863l) {
                }
                AbstractC18219l.adcel(strPurchase, enumC3830l2, (Function0) objM2132native5, interfaceC17242lAmazon, 0L, 0L, 0L, 0L, c6956l, 3072);
                int i3 = AbstractC15548l.yandex;
                AbstractC13319l.yandex(AbstractC4311l.amazon, AbstractC0019l.crashlytics(AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.billing(c6956l).crashlytics), null, AbstractC4311l.purchase, AbstractC4311l.billing, null, AbstractC15548l.yandex(AbstractC12953l.firebase(C9735l.loadAd(0.05f, AbstractC13106l.purchase(c6956l).yandex), AbstractC13106l.purchase(c6956l).ads), 0L, 0L, 0L, c6956l, 510), c6956l, 27654, 420);
                AbstractC9334l.yandex(c6956l, new C9247l(1.0f, true));
                InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 0.0f, 8.0f, 1);
                C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c15089l, c6956l, 6);
                long j3 = c6956l.f14595continue;
                int i4 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, c1853lYandex3, c6415l);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
                AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, c6415l4);
                zAdmob = c6956l.admob(c11562l2);
                objM2132native = c6956l.m2132native();
                if (!zAdmob || objM2132native == c13863l) {
                    c13863l2 = c13863l;
                    C13246l c13246l = new C13246l(0, c11562l2, C11562l.class, "showLicense", "showLicense()V", 0, 0, 2);
                    c11562l = c11562l2;
                    c6956l.m2147try(c13246l);
                    objM2132native = c13246l;
                } else {
                    c13863l2 = c13863l;
                    c11562l = c11562l2;
                }
                InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native;
                InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                C17253l c17253l = C12719l.yandex;
                AbstractC17457l.mopub((Function0) interfaceC5059l, interfaceC17242lAmazon2, false, AbstractC16837l.yandex, C12719l.subs(AbstractC13106l.purchase(c6956l).adcel, 0L, c6956l, 13), AbstractC3605l.loadAd(0.0f, 8.0f, 1), AbstractC4311l.mopub, c6956l, 817892400, 356);
                AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                zAdmob2 = c6956l.admob(c11562l);
                objM2132native2 = c6956l.m2132native();
                if (zAdmob2 || objM2132native2 == c13863l2) {
                    C13246l c13246l2 = new C13246l(0, c11562l, C11562l.class, "showProxy", "showProxy()V", 0, 0, 3);
                    c6956l.m2147try(c13246l2);
                    objM2132native2 = c13246l2;
                }
                AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native2), AbstractC0080l.amazon(c4346l, 1.0f), false, null, null, null, AbstractC4311l.admob, c6956l, 805306416, 508);
                c6956l.startapp(true);
                c6956l.startapp(true);
            }
            objM2132native5 = new C12242l(c11562l2, c10178l, 14);
            c6956l.m2147try(objM2132native5);
            AbstractC18219l.adcel(strPurchase, enumC3830l2, (Function0) objM2132native5, interfaceC17242lAmazon, 0L, 0L, 0L, 0L, c6956l, 3072);
            int i5 = AbstractC15548l.yandex;
            AbstractC13319l.yandex(AbstractC4311l.amazon, AbstractC0019l.crashlytics(AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.billing(c6956l).crashlytics), null, AbstractC4311l.purchase, AbstractC4311l.billing, null, AbstractC15548l.yandex(AbstractC12953l.firebase(C9735l.loadAd(0.05f, AbstractC13106l.purchase(c6956l).yandex), AbstractC13106l.purchase(c6956l).ads), 0L, 0L, 0L, c6956l, 510), c6956l, 27654, 420);
            AbstractC9334l.yandex(c6956l, new C9247l(1.0f, true));
            InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 0.0f, 8.0f, 1);
            C1853l c1853lYandex4 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c15089l, c6956l, 6);
            long j4 = c6956l.f14595continue;
            int i6 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato4 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l, interfaceC17242lVip2);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex4, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato4, c6415l2);
            AbstractC11043l.isPro(i6, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling5, c6415l4);
            zAdmob = c6956l.admob(c11562l2);
            objM2132native = c6956l.m2132native();
            if (zAdmob) {
                c13863l2 = c13863l;
                C13246l c13246l3 = new C13246l(0, c11562l2, C11562l.class, "showLicense", "showLicense()V", 0, 0, 2);
                c11562l = c11562l2;
                c6956l.m2147try(c13246l3);
                objM2132native = c13246l3;
            } else {
                c13863l2 = c13863l;
                C13246l c13246l4 = new C13246l(0, c11562l2, C11562l.class, "showLicense", "showLicense()V", 0, 0, 2);
                c11562l = c11562l2;
                c6956l.m2147try(c13246l4);
                objM2132native = c13246l4;
            }
            InterfaceC5059l interfaceC5059l2 = (InterfaceC5059l) objM2132native;
            InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
            C17253l c17253l2 = C12719l.yandex;
            AbstractC17457l.mopub((Function0) interfaceC5059l2, interfaceC17242lAmazon3, false, AbstractC16837l.yandex, C12719l.subs(AbstractC13106l.purchase(c6956l).adcel, 0L, c6956l, 13), AbstractC3605l.loadAd(0.0f, 8.0f, 1), AbstractC4311l.mopub, c6956l, 817892400, 356);
            AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
            zAdmob2 = c6956l.admob(c11562l);
            objM2132native2 = c6956l.m2132native();
            if (zAdmob2) {
                C13246l c13246l5 = new C13246l(0, c11562l, C11562l.class, "showProxy", "showProxy()V", 0, 0, 3);
                c6956l.m2147try(c13246l5);
                objM2132native2 = c13246l5;
            } else {
                C13246l c13246l6 = new C13246l(0, c11562l, C11562l.class, "showProxy", "showProxy()V", 0, 0, 3);
                c6956l.m2147try(c13246l6);
                objM2132native2 = c13246l6;
            }
            AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native2), AbstractC0080l.amazon(c4346l, 1.0f), false, null, null, null, AbstractC4311l.admob, c6956l, 805306416, 508);
            c6956l.startapp(true);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws IOException {
        final int i;
        int i2 = this.f36547l;
        C11485l c11485l = AbstractC8313l.crashlytics;
        int i3 = 2;
        Object obj4 = C1867l.yandex;
        InterfaceC17242l interfaceC17242lPro = C4346l.f8873l;
        Object obj5 = this.f36548l;
        Object obj6 = this.f36545l;
        Object obj7 = this.f36546l;
        int i4 = 1;
        switch (i2) {
            case 0:
                C7659l c7659l = (C7659l) obj7;
                C15308l c15308l = (C15308l) obj6;
                EnumC0442l enumC0442l = (EnumC0442l) obj5;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zAdmob = c6956l.admob(c7659l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == obj4) {
                        objM2132native = new Ctry(c7659l, c15308l, false ? 1 : 0);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC3383l.purchase((Function0) objM2132native, AbstractC3605l.vip(interfaceC17242lPro, 16.0f, 0.0f, 2), false, null, AbstractC13880l.purchase(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads, 0L, c6956l, 0, 14), null, null, AbstractC14566l.amazon(-1900519908, new C7442l(c7659l, enumC0442l, 1), c6956l), c6956l, 100663344, 236);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C0483l c0483l = (C0483l) obj7;
                C9879l c9879l = c0483l.yandex;
                C14632l c14632l = (C14632l) obj6;
                InterfaceC9085l interfaceC9085l = (InterfaceC9085l) obj5;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C10507l c10507lIsPro = c9879l.isPro();
                    if (c14632l != null) {
                        c6956l2.m2123default(346126634);
                        interfaceC17242lPro = AbstractC0653l.pro(c14632l, interfaceC17242lPro, c14632l.amazon("artwork:".concat(c10507lIsPro.yandex), c6956l2), interfaceC9085l);
                        c6956l2.startapp(false);
                    } else {
                        c6956l2.m2123default(346504586);
                        c6956l2.startapp(false);
                    }
                    AbstractC18643l abstractC18643l = c9879l.isPro().loadAd;
                    C10707l c10707l = AbstractC5992l.yandex;
                    long j = ((C18718l) c6956l2.isPro(c10707l)).amazon;
                    String str = "np_" + c10507lIsPro.loadAd.startapp();
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC17551l.loadAd(interfaceC17242lPro, 1.0f, ((C18718l) c6956l2.isPro(c10707l)).amazon, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics);
                    boolean zAdmob2 = c6956l2.admob(c0483l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == obj4) {
                        objM2132native2 = new C1657l(c0483l, 1);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC17307l.billing(abstractC18643l, 5, j, 0L, 0, 0.0f, true, null, str, AbstractC9151l.yandex(interfaceC17242lLoadAd, null, null, false, null, (Function0) objM2132native2, 28), c6956l2, 1572912, 184);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C18159l c18159l = (C18159l) obj7;
                final C6417l c6417l = (C6417l) obj6;
                final InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj5;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(interfaceC17242lPro, 1.0f);
                    boolean zAdmob3 = c6956l3.admob(c18159l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob3 || objM2132native3 == obj4) {
                        objM2132native3 = new C0705l(c18159l, 3);
                        c6956l3.m2147try(objM2132native3);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native3, 15);
                    final int i5 = false ? 1 : 0;
                    final int i6 = 1;
                    AbstractC13319l.yandex(AbstractC0837l.mopub, interfaceC17242lLoadAd2, null, AbstractC14566l.amazon(-55486880, new Function2() { // from class: lؒ۠ٓ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            String strMopub;
                            int i7 = i5;
                            InterfaceC8714l interfaceC8714l2 = interfaceC8714l;
                            C6417l c6417l2 = c6417l;
                            switch (i7) {
                                case 0:
                                    C6956l c6956l4 = (C6956l) obj8;
                                    int iIntValue4 = ((Integer) obj9).intValue();
                                    if (c6956l4.m2127for(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                        if (((C15343l) interfaceC8714l2.getValue()).f30000l) {
                                            strMopub = AbstractC12900l.mopub(c6956l4, 552885767, R.string.themes_category_monet, c6956l4, false);
                                        } else {
                                            c6956l4.m2123default(553012681);
                                            c6956l4.startapp(false);
                                            strMopub = c6417l2.loadAd;
                                        }
                                        AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                                    } else {
                                        c6956l4.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l5 = (C6956l) obj8;
                                    int iIntValue5 = ((Integer) obj9).intValue();
                                    if (!c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        c6956l5.m2124else();
                                    } else if (((C15343l) interfaceC8714l2.getValue()).f30000l && AbstractC11173l.crashlytics()) {
                                        c6956l5.m2123default(90329329);
                                        AbstractC4111l.amazon(0, 1, c6956l5, null);
                                        c6956l5.startapp(false);
                                    } else {
                                        c6956l5.m2123default(90417834);
                                        AbstractC4111l.purchase(c6417l2, null, c6956l5, 0, 2);
                                        c6956l5.startapp(false);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l3), null, AbstractC14566l.amazon(1657813406, new Function2() { // from class: lؒ۠ٓ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            String strMopub;
                            int i7 = i6;
                            InterfaceC8714l interfaceC8714l2 = interfaceC8714l;
                            C6417l c6417l2 = c6417l;
                            switch (i7) {
                                case 0:
                                    C6956l c6956l4 = (C6956l) obj8;
                                    int iIntValue4 = ((Integer) obj9).intValue();
                                    if (c6956l4.m2127for(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                        if (((C15343l) interfaceC8714l2.getValue()).f30000l) {
                                            strMopub = AbstractC12900l.mopub(c6956l4, 552885767, R.string.themes_category_monet, c6956l4, false);
                                        } else {
                                            c6956l4.m2123default(553012681);
                                            c6956l4.startapp(false);
                                            strMopub = c6417l2.loadAd;
                                        }
                                        AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                                    } else {
                                        c6956l4.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l5 = (C6956l) obj8;
                                    int iIntValue5 = ((Integer) obj9).intValue();
                                    if (!c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        c6956l5.m2124else();
                                    } else if (((C15343l) interfaceC8714l2.getValue()).f30000l && AbstractC11173l.crashlytics()) {
                                        c6956l5.m2123default(90329329);
                                        AbstractC4111l.amazon(0, 1, c6956l5, null);
                                        c6956l5.startapp(false);
                                    } else {
                                        c6956l5.m2123default(90417834);
                                        AbstractC4111l.purchase(c6417l2, null, c6956l5, 0, 2);
                                        c6956l5.startapp(false);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l3), null, c6956l3, 199686, 468);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C18159l c18159l2 = (C18159l) obj7;
                final C9894l c9894l = (C9894l) obj6;
                final InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj5;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(interfaceC17242lPro, 1.0f);
                    boolean zAdmob4 = c6956l4.admob(c18159l2);
                    Object objM2132native4 = c6956l4.m2132native();
                    if (zAdmob4 || objM2132native4 == obj4) {
                        i = 1;
                        objM2132native4 = new C0705l(c18159l2, i);
                        c6956l4.m2147try(objM2132native4);
                    } else {
                        i = 1;
                    }
                    InterfaceC17242l interfaceC17242lLoadAd3 = AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native4, 15);
                    final int i7 = false ? 1 : 0;
                    AbstractC13319l.yandex(AbstractC0837l.admob, interfaceC17242lLoadAd3, null, AbstractC14566l.amazon(-501805303, new Function2() { // from class: lؖۚؗ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            String strMopub;
                            int i8 = i7;
                            InterfaceC8714l interfaceC8714l3 = interfaceC8714l2;
                            C9894l c9894l2 = c9894l;
                            switch (i8) {
                                case 0:
                                    C6956l c6956l5 = (C6956l) obj8;
                                    int iIntValue5 = ((Integer) obj9).intValue();
                                    if (c6956l5.m2127for(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                                        if (((C15343l) interfaceC8714l3.getValue()).f29997l) {
                                            strMopub = AbstractC12900l.mopub(c6956l5, 1499495582, R.string.themes_category_monet, c6956l5, false);
                                        } else {
                                            c6956l5.m2123default(1499622527);
                                            c6956l5.startapp(false);
                                            strMopub = c9894l2.loadAd;
                                        }
                                        AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                                    } else {
                                        c6956l5.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l6 = (C6956l) obj8;
                                    int iIntValue6 = ((Integer) obj9).intValue();
                                    if (!c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        c6956l6.m2124else();
                                    } else if (((C15343l) interfaceC8714l3.getValue()).f29997l && AbstractC11173l.crashlytics()) {
                                        c6956l6.m2123default(-605849817);
                                        AbstractC4111l.crashlytics(0, 1, c6956l6, null);
                                        c6956l6.startapp(false);
                                    } else {
                                        c6956l6.m2123default(-605760289);
                                        AbstractC4111l.yandex(c9894l2, null, c6956l6, 0, 2);
                                        c6956l6.startapp(false);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l4), null, AbstractC14566l.amazon(1007295175, new Function2() { // from class: lؖۚؗ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            String strMopub;
                            int i8 = i;
                            InterfaceC8714l interfaceC8714l3 = interfaceC8714l2;
                            C9894l c9894l2 = c9894l;
                            switch (i8) {
                                case 0:
                                    C6956l c6956l5 = (C6956l) obj8;
                                    int iIntValue5 = ((Integer) obj9).intValue();
                                    if (c6956l5.m2127for(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                                        if (((C15343l) interfaceC8714l3.getValue()).f29997l) {
                                            strMopub = AbstractC12900l.mopub(c6956l5, 1499495582, R.string.themes_category_monet, c6956l5, false);
                                        } else {
                                            c6956l5.m2123default(1499622527);
                                            c6956l5.startapp(false);
                                            strMopub = c9894l2.loadAd;
                                        }
                                        AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                                    } else {
                                        c6956l5.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l6 = (C6956l) obj8;
                                    int iIntValue6 = ((Integer) obj9).intValue();
                                    if (!c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        c6956l6.m2124else();
                                    } else if (((C15343l) interfaceC8714l3.getValue()).f29997l && AbstractC11173l.crashlytics()) {
                                        c6956l6.m2123default(-605849817);
                                        AbstractC4111l.crashlytics(0, 1, c6956l6, null);
                                        c6956l6.startapp(false);
                                    } else {
                                        c6956l6.m2123default(-605760289);
                                        AbstractC4111l.yandex(c9894l2, null, c6956l6, 0, 2);
                                        c6956l6.startapp(false);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l4), null, c6956l4, 199686, 468);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj7;
                InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) obj6;
                C18159l c18159l3 = (C18159l) obj5;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(interfaceC17242lPro, 1.0f);
                    boolean zAdmob5 = c6956l5.admob(interfaceC2262l) | c6956l5.billing(interfaceC8714l3) | c6956l5.admob(c18159l3);
                    Object objM2132native5 = c6956l5.m2132native();
                    if (zAdmob5 || objM2132native5 == obj4) {
                        objM2132native5 = new C6957l(interfaceC2262l, c18159l3, interfaceC8714l3);
                        c6956l5.m2147try(objM2132native5);
                    }
                    AbstractC13319l.yandex(AbstractC0837l.Signature, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native5, 15), null, null, null, AbstractC14566l.amazon(-279061529, new C13148l(interfaceC2262l, c18159l3, interfaceC8714l3), c6956l5), null, c6956l5, 196614, 476);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                String str2 = (String) obj7;
                Function0 function0 = (Function0) obj6;
                C7946l c7946l = (C7946l) obj5;
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(interfaceC17242lPro, 1.0f);
                    C14855l c14855l = C18450l.f36026l;
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
                    long j2 = c6956l6.f14595continue;
                    int i8 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l6.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l6, interfaceC17242lCrashlytics);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l6.m2140super();
                    if (c6956l6.f14603switch) {
                        c6956l6.firebase(c16395l);
                    } else {
                        c6956l6.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l6, interfaceC10835lAmazon, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i8);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l6, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l6, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling, c6415l4);
                    C9477l c9477l = new C9477l((Context) c6956l6.isPro(AbstractC1242l.loadAd));
                    c9477l.crashlytics = str2;
                    Object objM2132native6 = c6956l6.m2132native();
                    if (objM2132native6 == obj4) {
                        objM2132native6 = Boolean.valueOf(AbstractC13209l.purchase.crashlytics);
                        c6956l6.m2147try(objM2132native6);
                    }
                    AbstractC12872l.crashlytics(c9477l, new C5739l(((Boolean) objM2132native6).booleanValue() ? C14473l.billing : C14473l.smaato));
                    AbstractC7741l.amazon(c9477l.yandex(), null, AbstractC0080l.crashlytics(interfaceC17242lPro, 1.0f), C4176l.yandex, null, c6956l6, 1573296, 1976);
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(interfaceC17242lPro, 16.0f);
                    C16170l c16170l = C16170l.yandex;
                    InterfaceC17242l interfaceC17242lYandex = c16170l.yandex(interfaceC17242lSmaato, c14855l);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), C18450l.f36046l, c6956l6, 6);
                    long j3 = c6956l6.f14595continue;
                    int i9 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l6.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l6, interfaceC17242lYandex);
                    c6956l6.m2140super();
                    if (c6956l6.f14603switch) {
                        c6956l6.firebase(c16395l);
                    } else {
                        c6956l6.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l6, c1853lYandex, c6415l);
                    AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i9, c6956l6, c6415l3, c6956l6, c11192l);
                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling2, c6415l4);
                    String str3 = c7946l.yandex.mopub;
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(str3, null, ((C14370l) c6956l6.isPro(c10707l2)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l6.isPro(c10707l2)).loadAd.billing, c6956l6, 0, 0, 131066);
                    String str4 = c7946l.yandex.advert;
                    if (str4 == null) {
                        c6956l6.m2123default(-1626851671);
                    } else {
                        c6956l6.m2123default(-1626851670);
                        AbstractC13010l.loadAd(str4, null, ((C14370l) c6956l6.isPro(c10707l2)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l6.isPro(c10707l2)).loadAd.firebase, c6956l6, 0, 0, 131066);
                    }
                    c6956l6.startapp(false);
                    c6956l6.startapp(true);
                    AbstractC11184l.crashlytics(function0, AbstractC3605l.smaato(c16170l.yandex(interfaceC17242lPro, C18450l.f36032l), 16.0f), AbstractC7497l.yandex, C9735l.purchase, C9735l.loadAd, null, AbstractC12754l.yandex, c6956l6, 12610560);
                    c6956l6.startapp(true);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 6:
                String str5 = (String) obj7;
                String str6 = (String) obj6;
                String str7 = (String) obj5;
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0080l.crashlytics(interfaceC17242lPro, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j4 = c6956l7.f14595continue;
                    int i10 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l7, interfaceC17242lCrashlytics2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l2);
                    } else {
                        c6956l7.m2136protected();
                    }
                    C6415l c6415l5 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l7, interfaceC10835lAmazon2, c6415l5);
                    C6415l c6415l6 = C3438l.billing;
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato3, c6415l6);
                    Integer numValueOf2 = Integer.valueOf(i10);
                    C6415l c6415l7 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l7, numValueOf2, c6415l7);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l7, c11192l2);
                    C6415l c6415l8 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling3, c6415l8);
                    InterfaceC17242l interfaceC17242lSmaato2 = AbstractC3605l.smaato(interfaceC17242lPro, 16.0f);
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    C15089l c15089l = C18450l.f36034l;
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c7537l, c15089l, c6956l7, 54);
                    long j5 = c6956l7.f14595continue;
                    int i11 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l7, interfaceC17242lSmaato2);
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l2);
                    } else {
                        c6956l7.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l7, c1853lYandex2, c6415l5);
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato4, c6415l6);
                    AbstractC11043l.isPro(i11, c6956l7, c6415l7, c6956l7, c11192l2);
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling4, c6415l8);
                    AbstractC7741l.purchase(str5, str6, AbstractC0019l.crashlytics(AbstractC0080l.isPro(interfaceC17242lPro, 96.0f), AbstractC13106l.billing(c6956l7).crashlytics), new C18627l(AbstractC13106l.purchase(c6956l7).premium), null, null, c6956l7, 4096, 0, 32752);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(c11485l, c15089l, c6956l7, 48);
                    long j6 = c6956l7.f14595continue;
                    int i12 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l7, interfaceC17242lPro);
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l2);
                    } else {
                        c6956l7.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l7, c1853lYandex3, c6415l5);
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato5, c6415l6);
                    AbstractC11043l.isPro(i12, c6956l7, c6415l7, c6956l7, c11192l2);
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling5, c6415l8);
                    AbstractC13010l.loadAd(str6, null, AbstractC13106l.purchase(c6956l7).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l7).admob, c6956l7, 0, 0, 130042);
                    AbstractC13010l.loadAd(str7, null, AbstractC13106l.purchase(c6956l7).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l7).firebase, c6956l7, 0, 0, 130042);
                    AbstractC12900l.ads(c6956l7, true, true, true);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                Function1 function1 = (Function1) obj7;
                InterfaceC8714l interfaceC8714l4 = (InterfaceC8714l) obj6;
                InterfaceC8714l interfaceC8714l5 = (InterfaceC8714l) obj5;
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l8, R.string.as2_bt_device);
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC3605l.startapp(AbstractC0080l.amazon(interfaceC17242lPro, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), ((C14370l) c6956l8.isPro(c10707l3)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l8.isPro(c10707l3)).loadAd.purchase, c6956l8, 48, 0, 130040);
                    boolean zBilling = c6956l8.billing(function1);
                    Object objM2132native7 = c6956l8.m2132native();
                    if (zBilling || objM2132native7 == obj4) {
                        objM2132native7 = new C11537l(interfaceC8714l4, function1, interfaceC8714l5);
                        c6956l8.m2147try(objM2132native7);
                    }
                    AbstractC16336l.yandex(null, null, null, null, null, null, false, null, (Function1) objM2132native7, c6956l8, 0, 511);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C5766l c5766l = (C5766l) obj7;
                Object obj8 = (InterfaceC2262l) obj6;
                Object obj9 = (Context) obj5;
                C7091l c7091l = (C7091l) obj;
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= c6956l9.billing(c7091l) ? 4 : 2;
                }
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    String strPurchase2 = AbstractC11999l.purchase(c6956l9, R.string.as2_setup_power_save);
                    String strPurchase3 = AbstractC11999l.purchase(c6956l9, R.string.as2_setup_power_save_text);
                    boolean zAdmob6 = c6956l9.admob(obj8) | c6956l9.admob(obj9);
                    Object objM2132native8 = c6956l9.m2132native();
                    if (zAdmob6 || objM2132native8 == obj4) {
                        objM2132native8 = new Ctry(obj8, obj9, 14);
                        c6956l9.m2147try(objM2132native8);
                    }
                    c5766l.m1852instanceof(strPurchase2, strPurchase3, (Function0) objM2132native8, AbstractC3605l.vip(AbstractC5020l.smaato(c7091l, interfaceC17242lPro), 16.0f, 0.0f, 2), c6956l9, 0);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                String str8 = (String) obj7;
                String str9 = (String) obj6;
                Function0 function2 = (Function0) obj5;
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lSmaato3 = AbstractC3605l.smaato(c4346l, 16.0f);
                    C1853l c1853lYandex4 = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l10, 0);
                    long j7 = c6956l10.f14595continue;
                    int i13 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l10.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l10, interfaceC17242lSmaato3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l10.m2140super();
                    if (c6956l10.f14603switch) {
                        c6956l10.firebase(c16395l3);
                    } else {
                        c6956l10.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l10, c1853lYandex4, C3438l.mopub);
                    AbstractC8182l.billing(c6956l10, interfaceC18556lSmaato6, C3438l.billing);
                    AbstractC8182l.billing(c6956l10, Integer.valueOf(i13), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l10, C3438l.firebase);
                    AbstractC8182l.billing(c6956l10, interfaceC17242lBilling6, C3438l.amazon);
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(str8, null, ((C14370l) c6956l10.isPro(c10707l4)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l10.isPro(c10707l4)).loadAd.admob, c6956l10, 0, 0, 131066);
                    AbstractC13010l.loadAd(str9, null, ((C14370l) c6956l10.isPro(c10707l4)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l10.isPro(c10707l4)).loadAd.firebase, c6956l10, 0, 0, 131066);
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    C17253l c17253l = C12719l.yandex;
                    AbstractC17457l.purchase(function2, interfaceC17242lStartapp, false, null, C12719l.mopub(0L, ((C14370l) c6956l10.isPro(c10707l4)).yandex.yandex, c6956l10, 13), null, null, AbstractC17860l.remoteconfig, c6956l10, 805306416, 492);
                    c6956l10.startapp(true);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                Function0 function3 = (Function0) obj7;
                Function1 function4 = (Function1) obj6;
                C7968l c7968l = (C7968l) obj5;
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    String strPurchase4 = AbstractC11999l.purchase(c6956l11, R.string.as2_pick_source);
                    C10707l c10707l5 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase4, AbstractC3605l.startapp(AbstractC0080l.amazon(interfaceC17242lPro, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), ((C14370l) c6956l11.isPro(c10707l5)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l11.isPro(c10707l5)).loadAd.purchase, c6956l11, 48, 0, 130040);
                    C5766l.m1848this(function3, function4, c7968l, AbstractC11999l.purchase(c6956l11, R.string.as2_pick_source_library), EnumC1518l.LIBRARY, c6956l11);
                    C5766l.m1848this(function3, function4, c7968l, AbstractC11999l.purchase(c6956l11, R.string.as2_pick_source_mix), EnumC1518l.VK_MIX, c6956l11);
                    C5766l.m1848this(function3, function4, c7968l, AbstractC11999l.purchase(c6956l11, R.string.as2_pick_source_cache_library), EnumC1518l.CACHE_MY_TRACKS, c6956l11);
                    C5766l.m1848this(function3, function4, c7968l, AbstractC11999l.purchase(c6956l11, R.string.as2_pick_source_cache_manual), EnumC1518l.CACHE_MANUAL_DOWNLOADED, c6956l11);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj7;
                C5866l c5866l = (C5866l) obj6;
                Function1 function5 = (Function1) obj5;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= c6956l12.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    AbstractC16336l.yandex(AbstractC16422l.mopub(AbstractC3605l.firebase(interfaceC17242lPro, interfaceC11780l), interfaceC3102l.loadAd(), null), c5866l, null, null, null, null, false, null, function5, c6956l12, 0, 508);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                C7119l c7119l = (C7119l) obj6;
                C2671l c2671l = (C2671l) obj5;
                if (obj7 != AbstractC14503l.smaato) {
                    AbstractC16829l.loadAd(c7119l.f14924l, obj7, c2671l.f5801l);
                }
                return Unit.INSTANCE;
            case 13:
                C3713l c3713l = (C3713l) obj7;
                C18014l c18014l = (C18014l) obj6;
                String str10 = (String) obj5;
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    boolean zAdmob7 = c6956l13.admob(c18014l) | c6956l13.billing(str10);
                    Object objM2132native9 = c6956l13.m2132native();
                    if (zAdmob7 || objM2132native9 == obj4) {
                        objM2132native9 = new C3192l(c18014l, str10, false ? 1 : 0);
                        c6956l13.m2147try(objM2132native9);
                    }
                    Function0 function6 = (Function0) objM2132native9;
                    boolean zAdmob8 = c6956l13.admob(c18014l) | c6956l13.billing(str10);
                    Object objM2132native10 = c6956l13.m2132native();
                    if (zAdmob8 || objM2132native10 == obj4) {
                        objM2132native10 = new C3192l(c18014l, str10, i4);
                        c6956l13.m2147try(objM2132native10);
                    }
                    AbstractC14289l.yandex(c3713l, function6, (Function0) objM2132native10, c6956l13, 0);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case 14:
                C3713l c3713l2 = (C3713l) obj7;
                C7044l c7044l = (C7044l) obj6;
                String str11 = (String) obj5;
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    boolean zAdmob9 = c6956l14.admob(c7044l) | c6956l14.billing(str11);
                    Object objM2132native11 = c6956l14.m2132native();
                    if (zAdmob9 || objM2132native11 == obj4) {
                        objM2132native11 = new C17592l(c7044l, str11, i4);
                        c6956l14.m2147try(objM2132native11);
                    }
                    Function0 function7 = (Function0) objM2132native11;
                    boolean zAdmob10 = c6956l14.admob(c7044l) | c6956l14.billing(str11);
                    Object objM2132native12 = c6956l14.m2132native();
                    if (zAdmob10 || objM2132native12 == obj4) {
                        objM2132native12 = new C17592l(c7044l, str11, i3);
                        c6956l14.m2147try(objM2132native12);
                    }
                    AbstractC14289l.yandex(c3713l2, function7, (Function0) objM2132native12, c6956l14, 0);
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
            case 15:
                InterfaceC3102l interfaceC3102l2 = (InterfaceC3102l) obj7;
                C1050l c1050l = (C1050l) obj6;
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) obj5;
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l15 = (C6956l) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= c6956l15.billing(interfaceC11780l2) ? 4 : 2;
                }
                if (c6956l15.m2127for(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(interfaceC17242lPro, 1.0f), interfaceC11780l2), interfaceC3102l2.loadAd(), null);
                    boolean zAdmob11 = c6956l15.admob(c1050l) | c6956l15.admob(interfaceC2262l2);
                    Object objM2132native13 = c6956l15.m2132native();
                    if (zAdmob11 || objM2132native13 == obj4) {
                        objM2132native13 = new C3005l(c1050l, interfaceC2262l2, 7);
                        c6956l15.m2147try(objM2132native13);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native13, c6956l15, 0, 510);
                } else {
                    c6956l15.m2124else();
                }
                return Unit.INSTANCE;
            case 16:
                return yandex(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C15578l c15578l = (C15578l) obj7;
                Function2 function8 = (Function2) obj6;
                C15578l c15578l2 = (C15578l) obj5;
                C6956l c6956l16 = (C6956l) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if (c6956l16.m2127for(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC10409l.purchase(interfaceC17242lPro);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l16, 48);
                    long j8 = c6956l16.f14595continue;
                    int i14 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l16.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l16, interfaceC17242lPurchase);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l16.m2140super();
                    if (c6956l16.f14603switch) {
                        c6956l16.firebase(c16395l4);
                    } else {
                        c6956l16.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l16, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l16, interfaceC18556lSmaato7, C3438l.billing);
                    AbstractC8182l.billing(c6956l16, Integer.valueOf(i14), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l16, C3438l.firebase);
                    AbstractC8182l.billing(c6956l16, interfaceC17242lBilling7, C3438l.amazon);
                    c15578l.invoke(C18295l.yandex, c6956l16, 6);
                    function8.invoke(c6956l16, 0);
                    AbstractC0555l.crashlytics(null, 1.5f, ((C14370l) c6956l16.isPro(AbstractC16964l.yandex)).yandex.ads, c6956l16, 48, 1);
                    c15578l2.invoke(c6956l16, 0);
                    c6956l16.startapp(true);
                } else {
                    c6956l16.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return billing(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return mopub(obj, obj2, obj3);
            case 20:
                return admob(obj, obj2, obj3);
            case 21:
                return subs(obj, obj2, obj3);
            case 22:
                return isPro(obj, obj2, obj3);
            case 23:
                return smaato(obj, obj2, obj3);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return remoteconfig(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return metrica(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return startapp(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return adcel(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ads(obj, obj2, obj3);
            default:
                C0130l c0130l = (C0130l) obj7;
                C9894l c9894l2 = (C9894l) obj6;
                InterfaceC8714l interfaceC8714l6 = (InterfaceC8714l) obj5;
                C6956l c6956l17 = (C6956l) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if (c6956l17.m2127for(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(interfaceC17242lPro, 1.0f);
                    int i15 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC2576l.yandex, interfaceC17242lAmazon4, null, AbstractC14566l.amazon(2141009191, new C10848l(c0130l, c9894l2, 21), c6956l17), null, AbstractC14566l.amazon(1343583657, new C7605l(interfaceC8714l6, 9), c6956l17), AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l17, 510), c6956l17, 199734, 404);
                } else {
                    c6956l17.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
