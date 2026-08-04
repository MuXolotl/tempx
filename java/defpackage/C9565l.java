package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٍٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9565l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11655l f19490l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19491l;

    public /* synthetic */ C9565l(C11655l c11655l, int i) {
        this.f19491l = i;
        this.f19490l = c11655l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19491l;
        C13863l c13863l = C1867l.yandex;
        int i2 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, C4346l.f8873l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    C11655l c11655l = this.f19490l;
                    boolean zAdmob = c6956l.admob(c11655l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C5735l c5735l = new C5735l(0, c11655l, C11655l.class, "openPopup", "openPopup()V", 0, 0, 12);
                        c6956l.m2147try(c5735l);
                        objM2132native = c5735l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC7039l.admob, c6956l, 1572864, 62);
                    boolean zBooleanValue = ((Boolean) c11655l.f23368l.getValue()).booleanValue();
                    boolean zAdmob2 = c6956l.admob(c11655l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        C5735l c5735l2 = new C5735l(0, c11655l, C11655l.class, "closePopup", "closePopup()V", 0, 0, 13);
                        c6956l.m2147try(c5735l2);
                        objM2132native2 = c5735l2;
                    }
                    AbstractC16727l.yandex(zBooleanValue, (Function0) ((InterfaceC5059l) objM2132native2), null, 0L, null, null, null, 0L, 0.0f, AbstractC14566l.amazon(-1025474377, new C9565l(c11655l, i2), c6956l), c6956l, 0, 2044);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C11655l c11655l2 = this.f19490l;
                    boolean zAdmob3 = c6956l2.admob(c11655l2);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        C5735l c5735l3 = new C5735l(0, c11655l2, C11655l.class, "callRedownloadAlert", "callRedownloadAlert()V", 0, 0, 14);
                        c6956l2.m2147try(c5735l3);
                        objM2132native3 = c5735l3;
                    }
                    AbstractC16727l.loadAd(AbstractC7039l.subs, (Function0) ((InterfaceC5059l) objM2132native3), null, AbstractC7039l.isPro, null, false, null, null, c6956l2, 3078, 500);
                    boolean zAdmob4 = c6956l2.admob(c11655l2);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        C5735l c5735l4 = new C5735l(0, c11655l2, C11655l.class, "showLibraryRemovalAlert", "showLibraryRemovalAlert()V", 0, 0, 15);
                        c6956l2.m2147try(c5735l4);
                        objM2132native4 = c5735l4;
                    }
                    AbstractC16727l.loadAd(AbstractC7039l.firebase, (Function0) ((InterfaceC5059l) objM2132native4), null, AbstractC7039l.smaato, null, false, null, null, c6956l2, 3078, 500);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    C11655l c11655l3 = this.f19490l;
                    boolean zAdmob5 = c6956l3.admob(c11655l3);
                    Object objM2132native5 = c6956l3.m2132native();
                    if (zAdmob5 || objM2132native5 == c13863l) {
                        C10239l c10239l = new C10239l(0, c11655l3, C11655l.class, "playFullList", "playFullList(Z)V", 0, 3);
                        c6956l3.m2147try(c10239l);
                        objM2132native5 = c10239l;
                    }
                    Function0 function0 = (Function0) objM2132native5;
                    boolean zAdmob6 = c6956l3.admob(c11655l3);
                    Object objM2132native6 = c6956l3.m2132native();
                    if (zAdmob6 || objM2132native6 == c13863l) {
                        objM2132native6 = new C5735l(0, c11655l3, C11655l.class, "playFullListShuffled", "playFullListShuffled()V", 0, 0, 16);
                        c6956l3.m2147try(objM2132native6);
                    }
                    AbstractC5170l.yandex(0, c6956l3, null, function0, (Function0) ((InterfaceC5059l) objM2132native6));
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
