package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌْؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3998l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1930l f8211l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8212l;

    public /* synthetic */ C3998l(C1930l c1930l, int i) {
        this.f8212l = i;
        this.f8211l = c1930l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String strMopub;
        String strMopub2;
        int i = this.f8212l;
        C13863l c13863l = C1867l.yandex;
        C1930l c1930l = this.f8211l;
        byte b = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1930l c1930l2 = this.f8211l;
                    boolean zAdmob = c6956l.admob(c1930l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C6814l c6814l = new C6814l(0, c1930l2, C1930l.class, "dismiss", "dismiss()V", 0, 0, 24);
                        c6956l.m2147try(c6814l);
                        objM2132native = c6814l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC4596l.mopub, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (c1930l.ad() != null) {
                        c6956l2.m2123default(578527354);
                        c6956l2.startapp(false);
                        strMopub = (String) c1930l.f4399l.getValue();
                    } else {
                        strMopub = AbstractC12900l.mopub(c6956l2, 578638365, R.string.upload_track_no_title, c6956l2, false);
                    }
                    AbstractC0133l.purchase(strMopub, null, 0L, 0L, null, c6956l2, 48, 28);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (c1930l.ad() != null) {
                        c6956l3.m2123default(-822377992);
                        c6956l3.startapp(false);
                        strMopub2 = (String) c1930l.f4397l.getValue();
                    } else {
                        strMopub2 = AbstractC12900l.mopub(c6956l3, -822266051, R.string.upload_track_no_data, c6956l3, false);
                    }
                    AbstractC13010l.loadAd(strMopub2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    long j = AbstractC13106l.purchase(c6956l4).startapp;
                    C9946l c9946l = AbstractC16837l.yandex;
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC4927l.amazon(c4346l, j, c9946l), 0.0f, 0.0f, 0.0f, ((C15700l) c6956l4.isPro(AbstractC18678l.yandex)).yandex(c6956l4), 7);
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    C15089l c15089l = C18450l.f36046l;
                    C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l4, 6);
                    long j2 = c6956l4.f14595continue;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l4, interfaceC17242lStartapp);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l);
                    } else {
                        c6956l4.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l4, c1853lYandex, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i2);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l4, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l4, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling, c6415l4);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(AbstractC8313l.crashlytics, c15089l, c6956l4, 0);
                    long j3 = c6956l4.f14595continue;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l4, c4346l);
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, c1853lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i3, c6956l4, c6415l3, c6956l4, c11192l);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling2, c6415l4);
                    AbstractC18079l.amazon(AbstractC4596l.billing, null, AbstractC14566l.amazon(-1128922028, new C3998l(c1930l, b == true ? 1 : 0), c6956l4), AbstractC14566l.amazon(21562301, new C15197l(c1930l, 3), c6956l4), 0.0f, AbstractC10439l.yandex, null, null, null, c6956l4, 200070, 466);
                    AbstractC0555l.loadAd(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0L, c6956l4, 6, 6);
                    C6956l c6956l5 = c6956l4;
                    c6956l5.startapp(true);
                    AbstractC3383l.yandex(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), null, null, null, null, AbstractC14566l.amazon(-1722030702, new C15197l(c1930l, 4), c6956l5), c6956l5, 196614, 30);
                    if (((Boolean) c1930l.f4398l.getValue()).booleanValue()) {
                        c6956l5.m2123default(-2119146297);
                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, R.string.error_not_mp3_info), null, AbstractC13106l.purchase(c6956l5).ad, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l5).vip, c6956l5, 0, 0, 131066);
                        c6956l5 = c6956l5;
                        c6956l5.startapp(false);
                    } else {
                        if (((Boolean) c1930l.f4401l.getValue()).booleanValue()) {
                            c6956l5.m2123default(-2118839893);
                            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, R.string.error_270_info), null, AbstractC13106l.purchase(c6956l5).ad, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l5).vip, c6956l5, 0, 0, 131066);
                            c6956l5 = c6956l5;
                        } else {
                            c6956l5.m2123default(-2134817634);
                        }
                        c6956l5.startapp(false);
                    }
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2);
                    C17253l c17253l = C12719l.yandex;
                    C6956l c6956l6 = c6956l5;
                    C13412l c13412lYandex = C12719l.yandex(AbstractC13106l.purchase(c6956l5).adcel, AbstractC13106l.purchase(c6956l5).license, 0L, 0L, c6956l6, 12);
                    C6839l c6839l = AbstractC13106l.billing(c6956l6).crashlytics;
                    C17253l c17253l2 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    boolean zAdmob2 = c6956l6.admob(c1930l);
                    Object objM2132native2 = c6956l6.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C17829l(c1930l, 2);
                        c6956l6.m2147try(objM2132native2);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native2, interfaceC17242lVip, false, c6839l, c13412lYandex, null, null, c17253l2, AbstractC4596l.isPro, c6956l6, 817889328, 356);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, R.string.upload_track_info), AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 48, 0, 262140);
                    c6956l6.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                c1930l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 5:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zAdmob3 = c6956l7.admob(c1930l);
                    Object objM2132native3 = c6956l7.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C17829l(c1930l, 0);
                        c6956l7.m2147try(objM2132native3);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native3, null, false, null, null, null, AbstractC4596l.loadAd, c6956l7, 805306368, 510);
                } else {
                    c6956l7.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c1930l.pro((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3998l(C1930l c1930l, int i, int i2) {
        this.f8212l = i2;
        this.f8211l = c1930l;
    }
}
