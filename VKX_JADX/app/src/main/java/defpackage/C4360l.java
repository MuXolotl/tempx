package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؖۙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4360l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15068l f8896l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8897l;

    public /* synthetic */ C4360l(C15068l c15068l, int i) {
        this.f8897l = i;
        this.f8896l = c15068l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f8897l;
        C13863l c13863l = C1867l.yandex;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 17) != 16)) {
                    C15068l c15068l = this.f8896l;
                    boolean zAdmob = c6956l.admob(c15068l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C10239l c10239l = new C10239l(0, c15068l, C15068l.class, "playFullList", "playFullList(Z)V", 0, 0);
                        c6956l.m2147try(c10239l);
                        objM2132native = c10239l;
                    }
                    Function0 function0 = (Function0) objM2132native;
                    boolean zAdmob2 = c6956l.admob(c15068l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        C2944l c2944l = new C2944l(0, c15068l, C15068l.class, "playFullListShuffled", "playFullListShuffled()V", 0, 0, 12);
                        c6956l.m2147try(c2944l);
                        objM2132native2 = c2944l;
                    }
                    AbstractC5170l.yandex(0, c6956l, null, function0, (Function0) ((InterfaceC5059l) objM2132native2));
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l2.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, C4346l.f8873l);
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
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    C15068l c15068l2 = this.f8896l;
                    boolean zAdmob3 = c6956l2.admob(c15068l2);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C13462l(c15068l2, 3);
                        c6956l2.m2147try(objM2132native3);
                    }
                    AbstractC7470l.billing((Function0) objM2132native3, null, false, null, null, null, AbstractC2426l.f5200l, c6956l2, 1572864, 62);
                    boolean zBooleanValue = ((Boolean) c15068l2.f29600l.getValue()).booleanValue();
                    boolean zAdmob4 = c6956l2.admob(c15068l2);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C13462l(c15068l2, 4);
                        c6956l2.m2147try(objM2132native4);
                    }
                    AbstractC16727l.yandex(zBooleanValue, (Function0) objM2132native4, null, 0L, null, null, null, 0L, 0.0f, AbstractC14566l.amazon(1020324941, new C4360l(c15068l2, 2), c6956l2), c6956l2, 0, 2044);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    C15068l c15068l3 = this.f8896l;
                    if (c15068l3.f29595l != null) {
                        c6956l3.m2123default(1016841599);
                        boolean zAdmob5 = c6956l3.admob(c15068l3);
                        Object objM2132native5 = c6956l3.m2132native();
                        if (zAdmob5 || objM2132native5 == c13863l) {
                            C2944l c2944l2 = new C2944l(0, c15068l3, C15068l.class, "openOnlinePlaylist", "openOnlinePlaylist()V", 0, 0, 10);
                            c6956l3.m2147try(c2944l2);
                            objM2132native5 = c2944l2;
                        }
                        AbstractC16727l.loadAd(AbstractC2426l.f5206l, (Function0) ((InterfaceC5059l) objM2132native5), null, AbstractC2426l.f5202l, null, false, null, null, c6956l3, 3078, 500);
                    } else {
                        c6956l3.m2123default(1009874101);
                    }
                    c6956l3.startapp(false);
                    boolean zAdmob6 = c6956l3.admob(c15068l3);
                    Object objM2132native6 = c6956l3.m2132native();
                    if (zAdmob6 || objM2132native6 == c13863l) {
                        C2944l c2944l3 = new C2944l(0, c15068l3, C15068l.class, "showLibraryRemovalAlert", "showLibraryRemovalAlert()V", 0, 0, 11);
                        c6956l3.m2147try(c2944l3);
                        objM2132native6 = c2944l3;
                    }
                    AbstractC16727l.loadAd(AbstractC2426l.f5208l, (Function0) ((InterfaceC5059l) objM2132native6), null, AbstractC2426l.f5205l, null, false, null, null, c6956l3, 3078, 500);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
