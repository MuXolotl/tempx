package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕۜۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15956l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0228l f31329l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31330l;

    public /* synthetic */ C15956l(C0228l c0228l, int i) {
        this.f31330l = 4;
        this.f31329l = c0228l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31330l;
        int i2 = 5;
        C11485l c11485l = AbstractC8313l.crashlytics;
        C9946l c9946l = AbstractC16837l.yandex;
        C4346l c4346l = C4346l.f8873l;
        int i3 = 6;
        C13863l c13863l = C1867l.yandex;
        C0228l c0228l = this.f31329l;
        boolean z = false;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zAdmob = c6956l.admob(c0228l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C6303l(c0228l, 4);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, false, null, null, null, AbstractC11184l.yandex, c6956l, 805306368, 510);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zAdmob2 = c6956l2.admob(c0228l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C6303l(c0228l, i2);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native2, null, false, null, null, null, AbstractC11184l.loadAd, c6956l2, 805306368, 510);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(c4346l, ((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).yandex.startapp, c9946l);
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l3, 0);
                    long j = c6956l3.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lAmazon);
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
                    AbstractC18079l.amazon(AbstractC14566l.amazon(-1582468708, new C15956l(c0228l, i2, z ? (byte) 1 : (byte) 0), c6956l3), null, AbstractC14566l.amazon(1038908702, new C15956l(c0228l, i3, z ? (byte) 1 : (byte) 0), c6956l3), null, 0.0f, AbstractC10439l.yandex, null, null, null, c6956l3, 196998, 474);
                    AbstractC0555l.loadAd(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0L, c6956l3, 6, 6);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C10707l c10707l = AbstractC16964l.yandex;
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC4927l.amazon(c4346l, ((C14370l) c6956l4.isPro(c10707l)).yandex.startapp, c9946l);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l4, 0);
                    long j2 = c6956l4.f14595continue;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l4, interfaceC17242lAmazon2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l2);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, c1853lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l4, 0, 7);
                    boolean zBooleanValue = ((Boolean) c0228l.f1202l.getValue()).booleanValue();
                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f), 0.0f, 0.0f, 0.0f, ((C15700l) c6956l4.isPro(AbstractC18678l.yandex)).yandex(c6956l4), 7);
                    C6839l c6839l = ((C14370l) c6956l4.isPro(c10707l)).crashlytics.crashlytics;
                    boolean zAdmob3 = c6956l4.admob(c0228l);
                    Object objM2132native3 = c6956l4.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C6303l(c0228l, 3);
                        c6956l4.m2147try(objM2132native3);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native3, interfaceC17242lStartapp, zBooleanValue, c6839l, null, null, null, c17253l, AbstractC11184l.billing, c6956l4, 817889280, 368);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                c0228l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 5:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, c0228l.f1204l != null ? R.string.edit_playlist_dialog : R.string.create_playlist_dialog), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 6:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zAdmob4 = c6956l6.admob(c0228l);
                    Object objM2132native4 = c6956l6.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C6303l(c0228l, i3);
                        c6956l6.m2147try(objM2132native4);
                    }
                    AbstractC7470l.billing((Function0) objM2132native4, null, false, null, null, null, AbstractC11184l.purchase, c6956l6, 1572864, 62);
                } else {
                    c6956l6.m2124else();
                }
                break;
            default:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zPremium = c0228l.premium();
                    boolean zAdmob5 = c6956l7.admob(c0228l);
                    Object objM2132native5 = c6956l7.m2132native();
                    if (zAdmob5 || objM2132native5 == c13863l) {
                        objM2132native5 = new C8946l(c0228l, z ? 1 : 0);
                        c6956l7.m2147try(objM2132native5);
                    }
                    AbstractC2021l.yandex(zPremium, (Function1) objM2132native5, null, false, null, c6956l7, 0, 124);
                } else {
                    c6956l7.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15956l(C0228l c0228l, int i, byte b) {
        this.f31330l = i;
        this.f31329l = c0228l;
    }
}
