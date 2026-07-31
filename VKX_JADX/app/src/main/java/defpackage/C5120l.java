package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؗۘۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5120l {
    public static final C5120l yandex = new C5120l();

    public final void yandex(C15351l c15351l, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l;
        boolean z;
        C15351l c15351l2;
        C6935l c6935lYandex;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1640665680);
        int i2 = i | (c6956l2.billing(c15351l) ? 4 : 2);
        boolean z2 = false;
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            float f = c15351l.vip;
            C14282l c14282l = c15351l.adcel;
            InterfaceC10137l interfaceC10137l = c15351l.startapp;
            InterfaceC3102l interfaceC3102l = c15351l.ads;
            float f2 = c15351l.metrica;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                C8339l.metrica("The collapsedHeight is expected to be specified and finite");
                return;
            }
            if (Float.isNaN(f2) || (Float.floatToRawIntBits(f2) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                C8339l.metrica("The expandedHeight is expected to be specified and finite");
                return;
            }
            if (C14467l.yandex(f2, f) < 0) {
                C8339l.metrica("The expandedHeight is expected to be greater or equal to the collapsedHeight");
                return;
            }
            int iMo870l = ((InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob)).mo870l(c15351l.amazon);
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (z3 || objM2132native == c13863l) {
                objM2132native = new C13802l(25, c15351l);
                c6956l2.m2147try(objM2132native);
            }
            Function0 function0 = (Function0) objM2132native;
            boolean zBilling = (i3 == 4) | c6956l2.billing(function0);
            Object objM2132native2 = c6956l2.m2132native();
            if (zBilling || objM2132native2 == c13863l) {
                objM2132native2 = new C0340l(c15351l, function0, z2, 12);
                c6956l2.m2147try(objM2132native2);
            }
            Function0 function1 = (Function0) objM2132native2;
            C15578l c15578lAmazon = AbstractC14566l.amazon(-1333673671, new C15707l(23, c15351l), c6956l2);
            boolean zBilling2 = c6956l2.billing(function0);
            Object objM2132native3 = c6956l2.m2132native();
            if (zBilling2 || objM2132native3 == c13863l) {
                objM2132native3 = new C5583l(2, function0);
                c6956l2.m2147try(objM2132native3);
            }
            Function0 function2 = (Function0) objM2132native3;
            boolean zBilling3 = c6956l2.billing(function0);
            Object objM2132native4 = c6956l2.m2132native();
            if (zBilling3 || objM2132native4 == c13863l) {
                objM2132native4 = new C5583l(3, function0);
                c6956l2.m2147try(objM2132native4);
            }
            Function0 function3 = (Function0) objM2132native4;
            boolean zBilling4 = c6956l2.billing(function0);
            Object objM2132native5 = c6956l2.m2132native();
            if (zBilling4 || objM2132native5 == c13863l) {
                objM2132native5 = AbstractC8020l.mopub(new C5583l(4, function0));
                c6956l2.m2147try(objM2132native5);
            }
            InterfaceC12244l interfaceC12244l = (InterfaceC12244l) objM2132native5;
            boolean z4 = !((Boolean) interfaceC12244l.getValue()).booleanValue();
            C4346l c4346l = C4346l.f8873l;
            if (interfaceC3102l == null || interfaceC3102l.purchase()) {
                c6956l2.m2123default(-340524694);
                c6956l2.startapp(false);
                interfaceC17242l = c4346l;
            } else {
                c6956l2.m2123default(-341139672);
                boolean z5 = i3 == 4;
                Object objM2132native6 = c6956l2.m2132native();
                if (z5 || objM2132native6 == c13863l) {
                    objM2132native6 = new C15079l(13, c15351l);
                    c6956l2.m2147try(objM2132native6);
                }
                InterfaceC6940l interfaceC6940lLoadAd = AbstractC16318l.loadAd(c6956l2, (Function1) objM2132native6);
                boolean z6 = i3 == 4;
                Object objM2132native7 = c6956l2.m2132native();
                if (z6 || objM2132native7 == c13863l) {
                    objM2132native7 = new C7145l(c15351l, null, 1);
                    c6956l2.m2147try(objM2132native7);
                }
                C18422l c18422l = new C18422l(interfaceC6940lLoadAd, EnumC7283l.f15126l, true, null, false, AbstractC16318l.yandex, (Function3) objM2132native7, false);
                c6956l2.startapp(false);
                interfaceC17242l = c18422l;
            }
            InterfaceC17242l interfaceC17242lPremium = c15351l.yandex.premium(interfaceC17242l);
            boolean zBilling5 = c6956l2.billing(function1);
            Object objM2132native8 = c6956l2.m2132native();
            if (zBilling5 || objM2132native8 == c13863l) {
                objM2132native8 = new C6199l(4, function1);
                c6956l2.m2147try(objM2132native8);
            }
            InterfaceC17242l interfaceC17242lIsPro = AbstractC14289l.isPro(interfaceC17242lPremium, (Function1) objM2132native8);
            Object objM2132native9 = c6956l2.m2132native();
            if (objM2132native9 == c13863l) {
                objM2132native9 = new C4741l(10);
                c6956l2.m2147try(objM2132native9);
            }
            InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242lIsPro, false, (Function1) objM2132native9);
            Unit unit = Unit.INSTANCE;
            Object objM2132native10 = c6956l2.m2132native();
            if (objM2132native10 == c13863l) {
                objM2132native10 = C9523l.f19420l;
                c6956l2.m2147try(objM2132native10);
            }
            InterfaceC17242l interfaceC17242lYandex2 = AbstractC1782l.yandex(interfaceC17242lYandex, unit, (PointerInputEventHandler) objM2132native10);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
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
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
            long j2 = c6956l2.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c4346l);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0019l.amazon(AbstractC17549l.admob(c4346l, interfaceC10137l));
            Object objM2132native11 = c6956l2.m2132native();
            if (objM2132native11 == c13863l) {
                objM2132native11 = new C6101l();
                c6956l2.m2147try(objM2132native11);
            }
            long j3 = c14282l.crashlytics;
            long j4 = c14282l.amazon;
            long j5 = c14282l.purchase;
            long j6 = c14282l.billing;
            Function2 function4 = c15351l.purchase;
            C11090l c11090l = c15351l.billing;
            Function2 function5 = c15351l.subs;
            C11090l c11090l2 = c15351l.isPro;
            InterfaceC6947l interfaceC6947l = c15351l.firebase;
            boolean zBooleanValue = ((Boolean) interfaceC12244l.getValue()).booleanValue();
            C15578l c15578l = c15351l.smaato;
            float f3 = c15351l.vip;
            C17253l c17253l = AbstractC0831l.yandex;
            AbstractC18079l.purchase(interfaceC17242lAmazon, (InterfaceC6477l) objM2132native11, j3, j4, j6, j5, function4, c11090l, function5, c11090l2, function2, AbstractC8313l.purchase, interfaceC6947l, 0, zBooleanValue, c15578l, c15578lAmazon, f3, c17253l, c6956l, 0, 102239280);
            InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0019l.amazon(AbstractC17549l.admob(c4346l, new C1628l(interfaceC10137l, AbstractC15929l.mopub)));
            if (interfaceC3102l == null || (c6935lYandex = interfaceC3102l.yandex()) == null) {
                z = false;
            } else {
                z = false;
                InterfaceC17242l interfaceC17242lPurchase = AbstractC4107l.purchase(interfaceC17242lAmazon2, new C11670l(c6935lYandex, 0));
                if (interfaceC17242lPurchase != null) {
                    interfaceC17242lAmazon2 = interfaceC17242lPurchase;
                }
            }
            boolean z7 = i3 == 4 ? true : z;
            Object objM2132native12 = c6956l.m2132native();
            if (z7 || objM2132native12 == c13863l) {
                c15351l2 = c15351l;
                objM2132native12 = new C13443l(1, c15351l2);
                c6956l.m2147try(objM2132native12);
            } else {
                c15351l2 = c15351l;
            }
            AbstractC18079l.purchase(interfaceC17242lAmazon2, (InterfaceC6477l) objM2132native12, c14282l.crashlytics, c14282l.amazon, c14282l.billing, c14282l.purchase, c15351l2.loadAd, c15351l2.crashlytics, c15351l2.mopub, c15351l2.admob, function3, AbstractC8313l.amazon, c15351l2.firebase, iMo870l, z4, AbstractC6616l.mopub, AbstractC6616l.admob, f2 - f, c17253l, c6956l, 0, 102432816);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, c15351l, i, 28);
        }
    }
}
