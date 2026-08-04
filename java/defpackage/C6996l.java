package defpackage;

import android.content.ComponentName;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؚؓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6996l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18159l f14658l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14659l;

    public /* synthetic */ C6996l(C18159l c18159l, int i) {
        this.f14659l = i;
        this.f14658l = c18159l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        EnumC0442l enumC0442l;
        Object obj4;
        long jLoadAd;
        long j;
        int i = this.f14659l;
        int i2 = 4;
        int i3 = 6;
        C13863l c13863l = C1867l.yandex;
        float f = 1.0f;
        C4346l c4346l = C4346l.f8873l;
        C18159l c18159l = this.f14658l;
        boolean z = false;
        boolean z2 = true;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zBilling = c6956l.billing((Configuration) c6956l.isPro(AbstractC1242l.yandex));
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        obj4 = objM2132native;
                        Iterator it = EnumC0442l.f1616l.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            EnumC0442l enumC0442l2 = EnumC0442l.Default;
                            if (zHasNext) {
                                enumC0442l = (EnumC0442l) it.next();
                                VKXApplication vKXApplication = VKXApplication.f36631l;
                                if (vKXApplication == null) {
                                    vKXApplication = null;
                                }
                                int componentEnabledSetting = vKXApplication.getPackageManager().getComponentEnabledSetting(new ComponentName(vKXApplication.getPackageName(), "ua.itaysonlab.vkx.VkxIcon" + enumC0442l.f1621l));
                                if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && enumC0442l == enumC0442l2)) {
                                }
                            } else {
                                enumC0442l = enumC0442l2;
                            }
                        }
                        c6956l.m2147try(enumC0442l);
                        obj4 = enumC0442l;
                    }
                    EnumC0442l enumC0442l3 = (EnumC0442l) obj4;
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob = c6956l.admob(c18159l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob || objM2132native2 == c13863l) {
                        objM2132native2 = new C0705l(c18159l, 2);
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC13319l.yandex(AbstractC0837l.remoteconfig, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native2, 15), null, AbstractC14566l.amazon(-781295834, new C15707l(i2, enumC0442l3), c6956l), null, AbstractC14566l.amazon(727804644, new Cpublic(c18159l, enumC0442l3, i3), c6956l), null, c6956l, 199686, 468);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(AbstractC3605l.remoteconfig(c4346l, 16.0f, 8.0f), 1.0f);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC3383l.yandex(interfaceC17242lAmazon2, ((C14370l) c6956l2.isPro(c10707l)).crashlytics.purchase, AbstractC13880l.yandex(((C14370l) c6956l2.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l2, 0, 14), null, null, AbstractC14566l.amazon(2056878387, new C6996l(c18159l, i2), c6956l2), c6956l2, 196614, 24);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AppActivity appActivity = (AppActivity) c18159l.isVip();
                    boolean zAdmob2 = c6956l3.admob(appActivity);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        C2176l c2176l = new C2176l(1, appActivity, AppActivity.class, "setLegacyMode", "setLegacyMode(Z)V", 0, 0, 16);
                        c6956l3.m2147try(c2176l);
                        objM2132native3 = c2176l;
                    }
                    AbstractC2991l.crashlytics("nd_legacy", R.string.nd_legacy, 0, false, false, (Function1) ((InterfaceC5059l) objM2132native3), c6956l3, 3078, 20);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zBilling2 = c6956l4.billing((Configuration) c6956l4.isPro(AbstractC1242l.yandex));
                    Object objM2132native4 = c6956l4.m2132native();
                    if (zBilling2 || objM2132native4 == c13863l) {
                        Map map = C12221l.f24278l;
                        objM2132native4 = AbstractC16358l.amazon();
                        c6956l4.m2147try(objM2132native4);
                    }
                    String str = (String) objM2132native4;
                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob3 = c6956l4.admob(c18159l);
                    Object objM2132native5 = c6956l4.m2132native();
                    if (zAdmob3 || objM2132native5 == c13863l) {
                        objM2132native5 = new C0705l(c18159l, i3);
                        c6956l4.m2147try(objM2132native5);
                    }
                    AbstractC13319l.yandex(AbstractC0837l.subscription, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native5, 15), null, AbstractC14566l.amazon(1801446695, new C4210l(str, 0), c6956l4), null, null, null, c6956l4, 3078, 500);
                } else {
                    c6956l4.m2124else();
                }
                break;
            default:
                C15308l c15308l = c18159l.f35557l;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 0.0f, 16.0f, 1);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l5, 0);
                    long j2 = c6956l5.f14595continue;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l5, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l5, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling, C3438l.amazon);
                    c6956l5.m2123default(-854826227);
                    EnumC12111l[] enumC12111lArr = (EnumC12111l[]) C11538l.f23209l.f833l;
                    int length = enumC12111lArr.length;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length) {
                        EnumC12111l enumC12111l = enumC12111lArr[i5];
                        int i7 = i6 + 1;
                        C9247l c9247l = new C9247l(f, z2);
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, z);
                        long j3 = c6956l5.f14595continue;
                        int i8 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l5.smaato();
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l5, c9247l);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l2 = C3438l.loadAd;
                        c6956l5.m2140super();
                        if (c6956l5.f14603switch) {
                            c6956l5.firebase(c16395l2);
                        } else {
                            c6956l5.m2136protected();
                        }
                        C6415l c6415l = C3438l.mopub;
                        AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon, c6415l);
                        C6415l c6415l2 = C3438l.billing;
                        AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato2, c6415l2);
                        Integer numValueOf = Integer.valueOf(i8);
                        C6415l c6415l3 = C3438l.isPro;
                        AbstractC8182l.billing(c6956l5, numValueOf, c6415l3);
                        C11192l c11192l = C3438l.firebase;
                        AbstractC8182l.purchase(c6956l5, c11192l);
                        C15308l c15308l2 = c15308l;
                        C6415l c6415l4 = C3438l.amazon;
                        AbstractC8182l.billing(c6956l5, interfaceC17242lBilling2, c6415l4);
                        C10707l c10707l2 = AbstractC16964l.yandex;
                        EnumC12111l[] enumC12111lArr2 = enumC12111lArr;
                        InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(c4346l, ((C14370l) c6956l5.isPro(c10707l2)).crashlytics.crashlytics);
                        int i9 = length;
                        if (i6 == c15308l2.admob()) {
                            c6956l5.m2123default(-1098625793);
                            jLoadAd = C9735l.loadAd(0.25f, ((C14370l) c6956l5.isPro(c10707l2)).yandex.yandex);
                            c6956l5.startapp(false);
                        } else {
                            c6956l5.m2123default(-1098621647);
                            c6956l5.startapp(false);
                            jLoadAd = C9735l.isPro;
                        }
                        InterfaceC17242l interfaceC17242lAmazon4 = AbstractC4927l.amazon(interfaceC17242lCrashlytics, jLoadAd, AbstractC16837l.yandex);
                        boolean zAdmob4 = c6956l5.admob(c18159l) | c6956l5.amazon(i6);
                        Object objM2132native6 = c6956l5.m2132native();
                        if (zAdmob4 || objM2132native6 == c13863l) {
                            objM2132native6 = new C8803l(c18159l, i6, 1);
                            c6956l5.m2147try(objM2132native6);
                        }
                        C18159l c18159l2 = c18159l;
                        InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) objM2132native6, 15);
                        InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
                        int i10 = i6;
                        long j4 = c6956l5.f14595continue;
                        int i11 = (int) (j4 ^ (j4 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l5.smaato();
                        InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l5, interfaceC17242lLoadAd);
                        c6956l5.m2140super();
                        if (c6956l5.f14603switch) {
                            c6956l5.firebase(c16395l2);
                        } else {
                            c6956l5.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon2, c6415l);
                        AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato3, c6415l2);
                        AbstractC11043l.isPro(i11, c6956l5, c6415l3, c6956l5, c11192l);
                        AbstractC8182l.billing(c6956l5, interfaceC17242lBilling3, c6415l4);
                        AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(enumC12111l.f24086l, 0, c6956l5);
                        if (i10 == c15308l2.admob()) {
                            c6956l5.m2123default(-1253995033);
                            j = ((C14370l) c6956l5.isPro(c10707l2)).yandex.yandex;
                        } else {
                            c6956l5.m2123default(-1253993776);
                            j = ((C14370l) c6956l5.isPro(c10707l2)).yandex.subscription;
                        }
                        c6956l5.startapp(false);
                        C4346l c4346l2 = c4346l;
                        C6956l c6956l6 = c6956l5;
                        AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC0080l.isPro(AbstractC3605l.smaato(c4346l2, 8.0f), 24.0f), j, c6956l6, 440, 0);
                        c6956l6.startapp(true);
                        c6956l6.startapp(true);
                        i5++;
                        enumC12111lArr = enumC12111lArr2;
                        c6956l5 = c6956l6;
                        c4346l = c4346l2;
                        z2 = true;
                        i6 = i7;
                        c15308l = c15308l2;
                        c18159l = c18159l2;
                        f = 1.0f;
                        z = false;
                        length = i9;
                    }
                    C6956l c6956l7 = c6956l5;
                    c6956l7.startapp(z);
                    c6956l7.startapp(z2);
                } else {
                    c6956l5.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
