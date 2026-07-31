package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؖۚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4385l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0471l f8918l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8919l;

    public /* synthetic */ C4385l(C0471l c0471l, int i) {
        this.f8919l = i;
        this.f8918l = c0471l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f8919l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        C0471l c0471l = this.f8918l;
        boolean z = false;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.lyrics_podcast);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    AbstractC13010l.loadAd(c0471l.m566public().yandex.crashlytics, AbstractC13841l.purchase(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), AbstractC13841l.crashlytics(c6956l), true), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.isPro, c6956l, 0, 0, 131064);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l2, 0);
                    long j = c6956l2.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    C0471l c0471l2 = this.f8918l;
                    boolean zAdmob = c6956l2.admob(c0471l2);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C4936l c4936l = new C4936l(0, c0471l2, C0471l.class, "playTrailer", "playTrailer()V", 0, 0, 18);
                        c6956l2.m2147try(c4936l);
                        objM2132native = c4936l;
                    }
                    C17253l c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                    C17253l c17253l2 = C12719l.yandex;
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC17457l.loadAd((Function0) ((InterfaceC5059l) objM2132native), null, false, AbstractC7497l.yandex(8.0f), C12719l.yandex(((C14370l) c6956l2.isPro(c10707l2)).yandex.ads, ((C14370l) c6956l2.isPro(c10707l2)).yandex.adcel, 0L, 0L, c6956l2, 12), null, null, c17253l, C2287l.purchase, c6956l2, 817889280, 358);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String str = c0471l.m566public().yandex.loadAd;
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(str, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), ((C14370l) c6956l3.isPro(c10707l3)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l3.isPro(c10707l3)).loadAd.vip, c6956l3, 48, 0, 131064);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String str2 = c0471l.m566public().yandex.crashlytics;
                    long j2 = ((C14370l) c6956l4.isPro(AbstractC16964l.yandex)).yandex.adcel;
                    InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2);
                    boolean zAdmob2 = c6956l4.admob(c0471l);
                    Object objM2132native2 = c6956l4.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C16439l(c0471l, z ? 1 : 0);
                        c6956l4.m2147try(objM2132native2);
                    }
                    AbstractC13010l.loadAd(str2, AbstractC9151l.loadAd(interfaceC17242lVip2, false, null, (Function0) objM2132native2, 15), j2, 0L, null, null, null, 0L, null, 0L, 2, false, 4, 0, null, c6956l4, 0, 24960, 241656);
                } else {
                    c6956l4.m2124else();
                }
                break;
            default:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    Integer num = c0471l.m566public().crashlytics.loadAd;
                    c0471l.m565import(String.valueOf(num != null ? num.intValue() : 0), c6956l5, 6);
                } else {
                    c6956l5.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
