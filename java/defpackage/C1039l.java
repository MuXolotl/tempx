package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1039l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11655l f2879l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2880l;

    public /* synthetic */ C1039l(C11655l c11655l, int i) {
        this.f2880l = i;
        this.f2879l = c11655l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2880l;
        C13863l c13863l = C1867l.yandex;
        C11655l c11655l = this.f2879l;
        boolean z = false;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zAdmob = c6956l.admob(c11655l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C5865l(c11655l, 2);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, false, null, null, null, AbstractC7039l.yandex, c6956l, 805306368, 510);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zAdmob2 = c6956l2.admob(c11655l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C5865l(c11655l, 0);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native2, null, false, null, null, null, AbstractC7039l.loadAd, c6956l2, 805306368, 510);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC8532l.loadAd(c4346l, null, 3);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l3, 0);
                    long j = c6956l3.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lLoadAd);
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
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC18079l.amazon(AbstractC7039l.billing, null, AbstractC14566l.amazon(-800725931, new C1039l(c11655l, 4), c6956l3), AbstractC14566l.amazon(26230220, new C9565l(c11655l, z ? 1 : 0), c6956l3), 0.0f, ((C15700l) c6956l3.isPro(AbstractC18678l.yandex)).purchase(c6956l3), null, null, null, c6956l3, 3462, 466);
                    if (((Boolean) c11655l.f23371l.getValue()).booleanValue()) {
                        c6956l3.m2123default(527164999);
                        c11655l.m3181public(AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), c6956l3, 6);
                    } else {
                        c6956l3.m2123default(518306439);
                    }
                    c6956l3.startapp(false);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                c11655l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 4:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C11655l c11655l2 = this.f2879l;
                    boolean zAdmob3 = c6956l4.admob(c11655l2);
                    Object objM2132native3 = c6956l4.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        C5735l c5735l = new C5735l(0, c11655l2, C11655l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 11);
                        c6956l4.m2147try(c5735l);
                        objM2132native3 = c5735l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native3), null, false, null, null, null, AbstractC7039l.mopub, c6956l4, 1572864, 62);
                } else {
                    c6956l4.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c11655l.m3180finally((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1039l(C11655l c11655l, int i, int i2) {
        this.f2880l = i2;
        this.f2879l = c11655l;
    }
}
