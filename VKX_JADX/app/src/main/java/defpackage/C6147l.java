package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؘۨۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6147l {
    public static final C6147l yandex = new C6147l();

    public final void yandex(C10809l c10809l, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l;
        C6935l c6935lYandex;
        InterfaceC17242l interfaceC17242lPurchase;
        C6956l c6956l2 = c6956l;
        float f = c10809l.admob;
        c6956l2.m2133new(2137486921);
        int i2 = i | (c6956l2.billing(c10809l) ? 4 : 2);
        int i3 = 0;
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C14282l c14282l = c10809l.firebase;
            InterfaceC3102l interfaceC3102l = c10809l.smaato;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                C8339l.metrica("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zBilling = c6956l2.billing(c14282l) | c6956l2.billing(interfaceC3102l);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                objM2132native = AbstractC8020l.mopub(new C7646l(8, c10809l));
                c6956l2.m2147try(objM2132native);
            }
            InterfaceC12244l interfaceC12244lYandex = AbstractC0703l.yandex(((C9735l) ((InterfaceC12244l) objM2132native).getValue()).yandex, C17423l.remoteconfig(c6956l2, 4), null, null, c6956l2, 0, 12);
            C15578l c15578lAmazon = AbstractC14566l.amazon(-1658896622, new C15707l(21, c10809l), c6956l2);
            C4346l c4346l = C4346l.f8873l;
            if (interfaceC3102l == null || interfaceC3102l.purchase()) {
                c6956l2.m2123default(690075377);
                c6956l2.startapp(false);
                interfaceC17242l = c4346l;
            } else {
                c6956l2.m2123default(689460399);
                int i4 = i2 & 14;
                boolean z = i4 == 4;
                Object objM2132native2 = c6956l2.m2132native();
                if (z || objM2132native2 == c13863l) {
                    objM2132native2 = new C15079l(11, c10809l);
                    c6956l2.m2147try(objM2132native2);
                }
                InterfaceC6940l interfaceC6940lLoadAd = AbstractC16318l.loadAd(c6956l2, (Function1) objM2132native2);
                boolean z2 = i4 == 4;
                Object objM2132native3 = c6956l2.m2132native();
                if (z2 || objM2132native3 == c13863l) {
                    objM2132native3 = new C7145l(c10809l, null, i3);
                    c6956l2.m2147try(objM2132native3);
                }
                C18422l c18422l = new C18422l(interfaceC6940lLoadAd, EnumC7283l.f15126l, true, null, false, AbstractC16318l.yandex, (Function3) objM2132native3, false);
                c6956l2.startapp(false);
                interfaceC17242l = c18422l;
            }
            InterfaceC17242l interfaceC17242lPremium = c10809l.yandex.premium(interfaceC17242l);
            boolean zBilling2 = c6956l2.billing(interfaceC12244lYandex);
            Object objM2132native4 = c6956l2.m2132native();
            if (zBilling2 || objM2132native4 == c13863l) {
                objM2132native4 = new C2116l(interfaceC12244lYandex, 2);
                c6956l2.m2147try(objM2132native4);
            }
            InterfaceC17242l interfaceC17242lIsPro = AbstractC14289l.isPro(interfaceC17242lPremium, (Function1) objM2132native4);
            Object objM2132native5 = c6956l2.m2132native();
            if (objM2132native5 == c13863l) {
                objM2132native5 = new C4741l(9);
                c6956l2.m2147try(objM2132native5);
            }
            InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242lIsPro, false, (Function1) objM2132native5);
            Unit unit = Unit.INSTANCE;
            Object objM2132native6 = c6956l2.m2132native();
            if (objM2132native6 == c13863l) {
                objM2132native6 = C9523l.f19421l;
                c6956l2.m2147try(objM2132native6);
            }
            InterfaceC17242l interfaceC17242lYandex2 = AbstractC1782l.yandex(interfaceC17242lYandex, unit, (PointerInputEventHandler) objM2132native6);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l2.f14595continue;
            int i5 = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i5), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0019l.amazon(AbstractC17549l.admob(c4346l, c10809l.isPro));
            C8540l c8540l = AbstractC18079l.yandex;
            if (interfaceC3102l != null && (c6935lYandex = interfaceC3102l.yandex()) != null && (interfaceC17242lPurchase = AbstractC4107l.purchase(interfaceC17242lAmazon, new C11670l(c6935lYandex, 0))) != null) {
                interfaceC17242lAmazon = interfaceC17242lPurchase;
            }
            boolean z3 = (i2 & 14) == 4;
            Object objM2132native7 = c6956l2.m2132native();
            if (z3 || objM2132native7 == c13863l) {
                objM2132native7 = new C13443l(0, c10809l);
                c6956l2.m2147try(objM2132native7);
            }
            InterfaceC6477l interfaceC6477l = (InterfaceC6477l) objM2132native7;
            long j2 = c14282l.crashlytics;
            long j3 = c14282l.amazon;
            long j4 = c14282l.purchase;
            long j5 = c14282l.billing;
            Function2 function2 = c10809l.loadAd;
            C11090l c11090l = c10809l.crashlytics;
            C11090l c11090l2 = c10809l.amazon;
            C15089l c15089l = c10809l.purchase;
            Function2 function3 = c10809l.billing;
            InterfaceC17242l interfaceC17242l2 = interfaceC17242lAmazon;
            float f2 = c10809l.admob;
            InterfaceC11780l interfaceC11780l = c10809l.subs;
            Object objM2132native8 = c6956l2.m2132native();
            if (objM2132native8 == c13863l) {
                objM2132native8 = new C3321l(14);
                c6956l2.m2147try(objM2132native8);
            }
            AbstractC18079l.purchase(interfaceC17242l2, interfaceC6477l, j2, j3, j5, j4, function2, c11090l, null, c11090l2, (Function0) objM2132native8, AbstractC8313l.purchase, c15089l, 0, false, function3, c15578lAmazon, f2, interfaceC11780l, c6956l, 0, 1600566);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, c10809l, i, 25);
        }
    }
}
