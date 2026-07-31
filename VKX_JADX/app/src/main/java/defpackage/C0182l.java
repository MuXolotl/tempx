package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًؑؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0182l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5039l f1132l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1133l;

    public /* synthetic */ C0182l(C5039l c5039l, int i) {
        this.f1133l = 2;
        this.f1132l = c5039l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1133l;
        C4346l c4346l = C4346l.f8873l;
        C5039l c5039l = this.f1132l;
        C13863l c13863l = C1867l.yandex;
        byte b = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    C14282l c14282lBilling = AbstractC0831l.billing(((C14370l) c6956l.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l, 60);
                    AbstractC18079l.amazon(AbstractC11999l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l.isPro(c10707l)).yandex.startapp, AbstractC16837l.yandex), AbstractC14566l.amazon(-2044280821, new C0182l(c5039l, 3, b == true ? 1 : 0), c6956l), null, 0.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).purchase(c6956l), c14282lBilling, null, null, c6956l, 390, 408);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0086l c0086l = C18450l.f36040l;
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC3605l.firebase(AbstractC0080l.amazon(c4346l, 1.0f), ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).loadAd(c6956l2)), 16.0f, 0.0f, 2);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, c0086l, c6956l2, 48);
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
                    C5039l c5039l2 = this.f1132l;
                    boolean zAdmob = c6956l2.admob(c5039l2);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C2944l(0, c5039l2, C5039l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 18);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC11999l.crashlytics, c6956l2, 805306368, 510);
                    AbstractC9383l.yandex(new C9247l(1.0f, true), c6956l2, 0);
                    boolean zAdmob2 = c6956l2.admob(c5039l2);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C13802l(2, c5039l2);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native2, null, false, null, null, null, null, null, AbstractC11999l.amazon, c6956l2, 805306368, 510);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                c5039l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C5039l c5039l3 = this.f1132l;
                    boolean zAdmob3 = c6956l3.admob(c5039l3);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        C2944l c2944l = new C2944l(0, c5039l3, C5039l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 17);
                        c6956l3.m2147try(c2944l);
                        objM2132native3 = c2944l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native3), null, false, null, null, null, AbstractC11999l.loadAd, c6956l3, 1572864, 62);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0182l(C5039l c5039l, int i, byte b) {
        this.f1133l = i;
        this.f1132l = c5039l;
    }
}
