package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lْؔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2600l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18306l f5658l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5659l;

    public /* synthetic */ C2600l(C18306l c18306l, int i) {
        this.f5659l = i;
        this.f5658l = c18306l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f5659l;
        C13863l c13863l = C1867l.yandex;
        boolean z = false;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C18306l c18306l = this.f5658l;
                    boolean zAdmob = c6956l.admob(c18306l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C5735l c5735l = new C5735l(0, c18306l, C18306l.class, "recachePlaylist", "recachePlaylist()V", 0, 0, 29);
                        c6956l.m2147try(c5735l);
                        objM2132native = c5735l;
                    }
                    AbstractC16727l.loadAd(AbstractC10851l.f21930l, (Function0) ((InterfaceC5059l) objM2132native), null, AbstractC10851l.f21917l, null, false, null, null, c6956l, 3078, 500);
                    boolean zAdmob2 = c6956l.admob(c18306l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        C4936l c4936l = new C4936l(0, c18306l, C18306l.class, "openOnlinePlaylist", "openOnlinePlaylist()V", 0, 0, 0);
                        c6956l.m2147try(c4936l);
                        objM2132native2 = c4936l;
                    }
                    AbstractC16727l.loadAd(AbstractC10851l.f21919l, (Function0) ((InterfaceC5059l) objM2132native2), null, AbstractC10851l.f21929l, null, false, null, null, c6956l, 3078, 500);
                    boolean zAdmob3 = c6956l.admob(c18306l);
                    Object objM2132native3 = c6956l.m2132native();
                    Object obj4 = objM2132native3;
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        C12478l c12478l = new C12478l(c18306l, 5);
                        c6956l.m2147try(c12478l);
                        obj4 = c12478l;
                    }
                    AbstractC16727l.loadAd(AbstractC10851l.f21924l, (Function0) obj4, null, AbstractC10851l.f21931l, null, false, null, null, c6956l, 3078, 500);
                    boolean zAdmob4 = c6956l.admob(c18306l);
                    Object objM2132native4 = c6956l.m2132native();
                    Object obj5 = objM2132native4;
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        C12478l c12478l2 = new C12478l(c18306l, 6);
                        c6956l.m2147try(c12478l2);
                        obj5 = c12478l2;
                    }
                    AbstractC16727l.loadAd(AbstractC10851l.f21928l, (Function0) obj5, null, AbstractC10851l.f21915l, null, false, null, null, c6956l, 3078, 500);
                    boolean zAdmob5 = c6956l.admob(c18306l);
                    Object objM2132native5 = c6956l.m2132native();
                    if (zAdmob5 || objM2132native5 == c13863l) {
                        C4936l c4936l2 = new C4936l(0, c18306l, C18306l.class, "deleteCachedPlaylist", "deleteCachedPlaylist()V", 0, 0, 1);
                        c6956l.m2147try(c4936l2);
                        objM2132native5 = c4936l2;
                    }
                    AbstractC16727l.loadAd(AbstractC10851l.f21932l, (Function0) ((InterfaceC5059l) objM2132native5), null, AbstractC10851l.f21925l, null, false, null, null, c6956l, 3078, 500);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
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
                    C18306l c18306l2 = this.f5658l;
                    boolean zAdmob6 = c6956l2.admob(c18306l2);
                    Object objM2132native6 = c6956l2.m2132native();
                    if (zAdmob6 || objM2132native6 == c13863l) {
                        objM2132native6 = new C12478l(c18306l2, z ? 1 : 0);
                        c6956l2.m2147try(objM2132native6);
                    }
                    AbstractC7470l.billing((Function0) objM2132native6, null, false, null, null, null, AbstractC10851l.f21916l, c6956l2, 1572864, 62);
                    c18306l2.m4512implements(c6956l2, 0);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
