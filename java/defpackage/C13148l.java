package defpackage;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْٖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13148l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f25745l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18159l f25746l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25747l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f25748l;

    public /* synthetic */ C13148l(C18159l c18159l, InterfaceC8714l interfaceC8714l, InterfaceC2262l interfaceC2262l) {
        this.f25746l = c18159l;
        this.f25745l = interfaceC8714l;
        this.f25748l = interfaceC2262l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25747l;
        int i2 = 6;
        C13863l c13863l = C1867l.yandex;
        InterfaceC2262l interfaceC2262l = this.f25748l;
        C18159l c18159l = this.f25746l;
        InterfaceC8714l interfaceC8714l = this.f25745l;
        int i3 = 2;
        switch (i) {
            case 0:
                boolean z = false;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    z = true;
                }
                if (c6956l.m2127for(iIntValue & 1, z)) {
                    boolean z2 = ((C15343l) interfaceC8714l.getValue()).f29994l;
                    boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.admob(c18159l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C0464l(interfaceC2262l, c18159l, i2);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC2021l.yandex(z2, (Function1) objM2132native, null, false, null, c6956l, 0, 124);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zAdmob2 = c6956l2.admob(c18159l) | c6956l2.billing(interfaceC8714l) | c6956l2.admob(interfaceC2262l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C6957l(c18159l, interfaceC8714l, interfaceC2262l);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native2, null, ((C0639l) interfaceC8714l.getValue()).yandex.f7563l.length() > 0, null, null, null, AbstractC0837l.yandex, c6956l2, 805306368, 506);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l3, 6);
                    long j = c6956l3.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (objM2132native3 == c13863l) {
                        objM2132native3 = Integer.valueOf(Resources.getSystem().getDisplayMetrics().densityDpi);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.settings_appearance_dpi_override_hint, new Object[]{Integer.valueOf(((Number) objM2132native3).intValue())}, c6956l3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                    C0639l c0639l = (C0639l) interfaceC8714l.getValue();
                    int i5 = 3;
                    C3790l c3790l = new C3790l(3, 7, 83);
                    boolean zBilling = c6956l3.billing(interfaceC8714l) | c6956l3.admob(c18159l) | c6956l3.admob(interfaceC2262l);
                    Object objM2132native4 = c6956l3.m2132native();
                    if (zBilling || objM2132native4 == c13863l) {
                        objM2132native4 = new Ctransient(c18159l, interfaceC8714l, interfaceC2262l, i5);
                        c6956l3.m2147try(objM2132native4);
                    }
                    C6973l c6973l = new C6973l((Function1) objM2132native4, null, 62);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling2 = c6956l3.billing(interfaceC8714l);
                    Object objM2132native5 = c6956l3.m2132native();
                    if (zBilling2 || objM2132native5 == c13863l) {
                        objM2132native5 = new C9922l(interfaceC8714l, i3);
                        c6956l3.m2147try(objM2132native5);
                    }
                    AbstractC2130l.crashlytics(c0639l, (Function1) objM2132native5, interfaceC17242lAmazon, false, null, AbstractC0837l.amazon, null, null, c3790l, c6973l, false, 0, 0, null, null, c6956l3, 12583296, 196608, 8290168);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C13148l(InterfaceC2262l interfaceC2262l, C18159l c18159l, InterfaceC8714l interfaceC8714l) {
        this.f25748l = interfaceC2262l;
        this.f25746l = c18159l;
        this.f25745l = interfaceC8714l;
    }

    public /* synthetic */ C13148l(InterfaceC8714l interfaceC8714l, C18159l c18159l, InterfaceC2262l interfaceC2262l) {
        this.f25745l = interfaceC8714l;
        this.f25746l = c18159l;
        this.f25748l = interfaceC2262l;
    }
}
