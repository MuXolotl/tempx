package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3081l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0675l f6615l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6616l;

    public /* synthetic */ C3081l(C0675l c0675l, int i) {
        this.f6616l = 0;
        this.f6615l = c0675l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6616l;
        String fileSize = null;
        C13863l c13863l = C1867l.yandex;
        C0675l c0675l = this.f6615l;
        byte b = 0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c0675l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                boolean z = false;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    z = true;
                }
                if (c6956l.m2127for(iIntValue & 1, z)) {
                    boolean zAdmob = c6956l.admob(c0675l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C2579l(c0675l, 4);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, false, null, null, null, AbstractC1383l.yandex, c6956l, 805306368, 510);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 2:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C10707l c10707l = AbstractC16964l.yandex;
                    C6839l c6839l = ((C14370l) c6956l2.isPro(c10707l)).crashlytics.amazon;
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC4927l.amazon(AbstractC0019l.crashlytics(c4346l, c6839l), ((C14370l) c6956l2.isPro(c10707l)).yandex.vip, AbstractC16837l.yandex), AbstractC13841l.crashlytics(c6956l2), true);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
                    long j = c6956l2.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lPurchase);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    C0675l c0675l2 = this.f6615l;
                    boolean zAdmob2 = c6956l2.admob(c0675l2);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C6814l(0, c0675l2, C0675l.class, "clearAppCache", "clearAppCache()V", 0, 0, 5);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC13319l.yandex(AbstractC1383l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native2), 15), null, AbstractC14566l.amazon(1576172132, new C3081l(c0675l2, 8, b), c6956l2), null, null, null, c6956l2, 3078, 500);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l2, 0, 7);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob3 = c6956l2.admob(c0675l2);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C6814l(0, c0675l2, C0675l.class, "clearTrackCacheUi", "clearTrackCacheUi()V", 0, 0, 6);
                        c6956l2.m2147try(objM2132native3);
                    }
                    AbstractC13319l.yandex(AbstractC1383l.purchase, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) ((InterfaceC5059l) objM2132native3), 15), null, AbstractC14566l.amazon(-261219251, new C3081l(c0675l2, 9, b), c6956l2), null, null, null, c6956l2, 3078, 500);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l2, 0, 7);
                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob4 = c6956l2.admob(c0675l2);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C6814l(0, c0675l2, C0675l.class, "clearLyricsCache", "clearLyricsCache()V", 0, 0, 7);
                        c6956l2.m2147try(objM2132native4);
                    }
                    AbstractC13319l.yandex(AbstractC1383l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, null, null, null, null, c6956l2, 6, 508);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l2, 0, 7);
                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob5 = c6956l2.admob(c0675l2);
                    Object objM2132native5 = c6956l2.m2132native();
                    if (zAdmob5 || objM2132native5 == c13863l) {
                        objM2132native5 = new C6814l(0, c0675l2, C0675l.class, "launchCleanup", "launchCleanup()V", 0, 0, 8);
                        c6956l2.m2147try(objM2132native5);
                    }
                    AbstractC13319l.yandex(AbstractC1383l.mopub, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native5), 15), null, AbstractC1383l.admob, null, null, null, c6956l2, 3078, 500);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 3:
                boolean z2 = false;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if ((iIntValue3 & 3) != 2) {
                    z2 = true;
                }
                if (c6956l3.m2127for(iIntValue3 & 1, z2)) {
                    C0675l c0675l3 = this.f6615l;
                    boolean zAdmob6 = c6956l3.admob(c0675l3);
                    Object objM2132native6 = c6956l3.m2132native();
                    if (zAdmob6 || objM2132native6 == c13863l) {
                        C6814l c6814l = new C6814l(0, c0675l3, C0675l.class, "initCacheMigration", "initCacheMigration()V", 0, 0, 9);
                        c6956l3.m2147try(c6814l);
                        objM2132native6 = c6814l;
                    }
                    AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native6), null, false, null, null, null, AbstractC1383l.subs, c6956l3, 805306368, 510);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 4:
                boolean z3 = false;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if ((iIntValue4 & 3) != 2) {
                    z3 = true;
                }
                if (c6956l4.m2127for(iIntValue4 & 1, z3)) {
                    boolean zAdmob7 = c6956l4.admob(c0675l);
                    Object objM2132native7 = c6956l4.m2132native();
                    if (zAdmob7 || objM2132native7 == c13863l) {
                        objM2132native7 = new C2579l(c0675l, 3);
                        c6956l4.m2147try(objM2132native7);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native7, null, false, null, null, null, AbstractC1383l.isPro, c6956l4, 805306368, 510);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 5:
                boolean z4 = false;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if ((iIntValue5 & 3) != 2) {
                    z4 = true;
                }
                if (c6956l5.m2127for(iIntValue5 & 1, z4)) {
                    C0675l c0675l4 = this.f6615l;
                    boolean zAdmob8 = c6956l5.admob(c0675l4);
                    Object objM2132native8 = c6956l5.m2132native();
                    if (zAdmob8 || objM2132native8 == c13863l) {
                        C10832l c10832l = new C10832l(0, c0675l4, C0675l.class, "clearTrackCache", "clearTrackCache()V", 0, 0, 27);
                        c6956l5.m2147try(c10832l);
                        objM2132native8 = c10832l;
                    }
                    AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native8), null, false, null, null, null, AbstractC1383l.remoteconfig, c6956l5, 805306368, 510);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 6:
                boolean z5 = false;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if ((iIntValue6 & 3) != 2) {
                    z5 = true;
                }
                if (c6956l6.m2127for(iIntValue6 & 1, z5)) {
                    boolean zAdmob9 = c6956l6.admob(c0675l);
                    Object objM2132native9 = c6956l6.m2132native();
                    if (zAdmob9 || objM2132native9 == c13863l) {
                        objM2132native9 = new C2579l(c0675l, 2);
                        c6956l6.m2147try(objM2132native9);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native9, null, false, null, null, null, AbstractC1383l.vip, c6956l6, 805306368, 510);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 7:
                boolean z6 = false;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if ((iIntValue7 & 3) != 2) {
                    z6 = true;
                }
                if (c6956l7.m2127for(iIntValue7 & 1, z6)) {
                    C0675l c0675l5 = this.f6615l;
                    boolean zAdmob10 = c6956l7.admob(c0675l5);
                    Object objM2132native10 = c6956l7.m2132native();
                    if (zAdmob10 || objM2132native10 == c13863l) {
                        C10832l c10832l2 = new C10832l(0, c0675l5, C0675l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 28);
                        c6956l7.m2147try(c10832l2);
                        objM2132native10 = c10832l2;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native10), null, false, null, null, null, AbstractC1383l.subscription, c6956l7, 1572864, 62);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 8:
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    C8147l c8147l = (C8147l) c0675l.f2152l.getValue();
                    if (c8147l == null) {
                        c6956l8.m2123default(-1133398058);
                    } else {
                        c6956l8.m2123default(-1422034549);
                        fileSize = Formatter.formatFileSize((Context) c6956l8.isPro(AbstractC1242l.loadAd), c8147l.loadAd);
                    }
                    c6956l8.startapp(false);
                    if (fileSize == null) {
                        fileSize = AbstractC12900l.mopub(c6956l8, -1422033144, R.string.library_remove_cache_toggle_processing, c6956l8, false);
                    } else {
                        c6956l8.m2123default(-1422035035);
                        c6956l8.startapp(false);
                    }
                    AbstractC13010l.loadAd(fileSize, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l8, 0, 0, 262142);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 9:
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    C8147l c8147l2 = (C8147l) c0675l.f2152l.getValue();
                    if (c8147l2 == null) {
                        c6956l9.m2123default(498098602);
                    } else {
                        c6956l9.m2123default(-1923594953);
                        fileSize = Formatter.formatFileSize((Context) c6956l9.isPro(AbstractC1242l.loadAd), c8147l2.crashlytics);
                    }
                    c6956l9.startapp(false);
                    if (fileSize == null) {
                        fileSize = AbstractC12900l.mopub(c6956l9, -1923593455, R.string.library_remove_cache_toggle_processing, c6956l9, false);
                    } else {
                        c6956l9.m2123default(-1923595439);
                        c6956l9.startapp(false);
                    }
                    AbstractC13010l.loadAd(fileSize, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l9, 0, 0, 262142);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 10:
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    c6956l10.m2123default(522591559);
                    String strPurchase = (String) c0675l.f2149l.getValue();
                    if (strPurchase.length() == 0) {
                        strPurchase = AbstractC11999l.purchase(c6956l10, R.string.storage_not_set);
                    }
                    c6956l10.startapp(false);
                    AbstractC13010l.loadAd(strPurchase, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l10, 0, 0, 262142);
                } else {
                    c6956l10.m2124else();
                }
                break;
            default:
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    C16275l c16275l = (C16275l) c0675l.f2150l.getValue();
                    if (c16275l == null) {
                        c6956l11.m2123default(-763356650);
                    } else {
                        c6956l11.m2123default(-994455733);
                        Context context = (Context) c6956l11.isPro(AbstractC1242l.loadAd);
                        fileSize = context.getString(c16275l.yandex) + " (" + Formatter.formatFileSize(context, ((Number) c16275l.loadAd.f17097l).longValue()) + ')';
                    }
                    c6956l11.startapp(false);
                    if (fileSize == null) {
                        fileSize = "...";
                    }
                    AbstractC13010l.loadAd(fileSize, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l11, 0, 0, 262142);
                } else {
                    c6956l11.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3081l(C0675l c0675l, int i, byte b) {
        this.f6616l = i;
        this.f6615l = c0675l;
    }
}
