package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘَؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5463l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15068l f11702l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11703l;

    public /* synthetic */ C5463l(C15068l c15068l, int i) {
        this.f11703l = i;
        this.f11702l = c15068l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f11703l;
        C13863l c13863l = C1867l.yandex;
        C15068l c15068l = this.f11702l;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c15068l.m3922public((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd((String) c15068l.f29598l.getValue(), null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, 0, 24960, 241662);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 2:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zAdmob = c6956l2.admob(c15068l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C13462l(c15068l, 2);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, false, null, null, null, AbstractC2426l.f5201l, c6956l2, 805306368, 510);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 3:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zAdmob2 = c6956l3.admob(c15068l);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C13462l(c15068l, 0);
                        c6956l3.m2147try(objM2132native2);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native2, null, false, null, null, null, AbstractC2426l.f5198l, c6956l3, 805306368, 510);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 4:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC8532l.loadAd(C4346l.f8873l, null, 3);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l4, 0);
                    long j = c6956l4.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l4, interfaceC17242lLoadAd);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC18079l.amazon(AbstractC14566l.amazon(841797549, new C5463l(c15068l, i2), c6956l4), null, AbstractC14566l.amazon(1342000107, new C5463l(c15068l, 6), c6956l4), AbstractC14566l.amazon(1702851426, new C4360l(c15068l, i2), c6956l4), 0.0f, ((C15700l) c6956l4.isPro(AbstractC18678l.yandex)).purchase(c6956l4), null, null, null, c6956l4, 3462, 466);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                c15068l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C15068l c15068l2 = this.f11702l;
                    boolean zAdmob3 = c6956l5.admob(c15068l2);
                    Object objM2132native3 = c6956l5.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        C2944l c2944l = new C2944l(0, c15068l2, C15068l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 9);
                        c6956l5.m2147try(c2944l);
                        objM2132native3 = c2944l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native3), null, false, null, null, null, AbstractC2426l.f5199l, c6956l5, 1572864, 62);
                } else {
                    c6956l5.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C5463l(C15068l c15068l, int i, int i2) {
        this.f11703l = i2;
        this.f11702l = c15068l;
    }
}
