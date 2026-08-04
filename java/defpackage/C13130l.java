package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَْؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13130l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C18014l f25677l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14598l f25678l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25679l;

    public /* synthetic */ C13130l(C14598l c14598l, C18014l c18014l, int i) {
        this.f25679l = i;
        this.f25678l = c14598l;
        this.f25677l = c18014l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f25679l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        C18014l c18014l = this.f25677l;
        C14598l c14598l = this.f25678l;
        switch (i) {
            case 0:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC3605l.firebase(c4346l, interfaceC11780l), 16.0f, 0.0f, 2);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l, 6);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
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
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.cdcm_wizard_err_space);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.purchase, c6956l, 0, 0, 131066);
                    long j2 = c14598l.crashlytics;
                    long j3 = c14598l.yandex;
                    boolean zPurchase = c6956l.purchase(j2) | c6956l.purchase(j3);
                    Object objM2132native = c6956l.m2132native();
                    if (zPurchase || objM2132native == c13863l) {
                        Context context = c18014l.f34617l;
                        long j4 = c14598l.crashlytics - j3;
                        if (j4 < 0) {
                            j4 = 0;
                        }
                        objM2132native = Formatter.formatFileSize(context, j4);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.cdcm_wizard_err_space_on_receiver, new Object[]{(String) objM2132native}, c6956l), null, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 0, 0, 131066);
                    AbstractC3383l.amazon(AbstractC0080l.amazon(c4346l, 1.0f), null, AbstractC13880l.yandex(((C14370l) c6956l.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l, 0, 14), null, null, AbstractC14566l.amazon(1542088476, new C13130l(c14598l, c18014l, 1), c6956l), c6956l, 196614, 26);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
                    long j5 = c6956l2.f14595continue;
                    int i3 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                    Integer numValueOf = Integer.valueOf(i3);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                    C8688l c8688l = AbstractC0085l.yandex;
                    String strPurchase2 = AbstractC11999l.purchase(c6956l2, AbstractC8182l.loadAd().amazon());
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase2, null, ((C14370l) c6956l2.isPro(c10707l2)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l2)).loadAd.purchase, c6956l2, 0, 0, 131066);
                    boolean zBilling = c6956l2.billing(c14598l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zBilling || objM2132native2 == c13863l) {
                        objM2132native2 = new C13802l(4, c14598l);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC15831l.yandex((Function0) objM2132native2, AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, null, null, 0.0f, 0.0f, null, 0.0f, 0.0f, c6956l2, 48);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l2, 48);
                    long j6 = c6956l2.f14595continue;
                    int i4 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, c4346l);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
                    AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
                    long j7 = c14598l.yandex;
                    long j8 = c14598l.loadAd;
                    boolean zPurchase2 = c6956l2.purchase(j7) | c6956l2.purchase(j8);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zPurchase2 || objM2132native3 == c13863l) {
                        Context context2 = c18014l.f34617l;
                        long j9 = j8 - c14598l.yandex;
                        if (j9 < 0) {
                            j9 = 0;
                        }
                        objM2132native3 = Formatter.formatFileSize(context2, j9);
                        c6956l2.m2147try(objM2132native3);
                    }
                    AbstractC13010l.loadAd((String) objM2132native3, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l2)).loadAd.vip, c6956l2, 0, 0, 131070);
                    AbstractC9383l.yandex(new C9247l(1.0f, true), c6956l2, 0);
                    boolean zPurchase3 = c6956l2.purchase(j8);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zPurchase3 || objM2132native4 == c13863l) {
                        objM2132native4 = Formatter.formatFileSize(c18014l.f34617l, j8);
                        c6956l2.m2147try(objM2132native4);
                    }
                    AbstractC13010l.loadAd((String) objM2132native4, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l2)).loadAd.vip, c6956l2, 0, 0, 131070);
                    c6956l2.startapp(true);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
