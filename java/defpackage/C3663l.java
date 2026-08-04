package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕۜٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3663l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12000l f7719l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7720l;

    public /* synthetic */ C3663l(C12000l c12000l, int i) {
        this.f7720l = 4;
        this.f7719l = c12000l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7720l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        C12000l c12000l = this.f7719l;
        boolean z = false;
        int i2 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    C14282l c14282lBilling = AbstractC0831l.billing(((C14370l) c6956l.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l, 60);
                    AbstractC18079l.amazon(AbstractC1760l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l.isPro(c10707l)).yandex.startapp, AbstractC16837l.yandex), AbstractC14566l.amazon(-250797745, new C3663l(c12000l, 5, z ? 1 : 0), c6956l), null, 0.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).purchase(c6956l), c14282lBilling, null, null, c6956l, 390, 408);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (c12000l.m3296import()) {
                        c6956l2.m2123default(177228006);
                    } else {
                        c6956l2.m2123default(183372330);
                        AbstractC4597l.yandex(AbstractC11356l.crashlytics(), null, null, 0L, c6956l2, 48, 12);
                    }
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (c12000l.m3296import()) {
                        c6956l3.m2123default(-2051678421);
                        AbstractC4597l.yandex(AbstractC11356l.crashlytics(), null, null, 0L, c6956l3, 48, 12);
                    } else {
                        c6956l3.m2123default(-2058854425);
                    }
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C0086l c0086l = C18450l.f36040l;
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC3605l.firebase(AbstractC0080l.amazon(c4346l, 1.0f), ((C15700l) c6956l4.isPro(AbstractC18678l.yandex)).loadAd(c6956l4)), 16.0f, 0.0f, 2);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, c0086l, c6956l4, 48);
                    long j = c6956l4.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l4, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling, C3438l.amazon);
                    C12000l c12000l2 = this.f7719l;
                    boolean zAdmob = c6956l4.admob(c12000l2);
                    Object objM2132native = c6956l4.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C2944l(0, c12000l2, C12000l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 16);
                        c6956l4.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC1760l.crashlytics, c6956l4, 805306368, 510);
                    AbstractC9383l.yandex(new C9247l(1.0f, true), c6956l4, 0);
                    boolean zAdmob2 = c6956l4.admob(c12000l2);
                    Object objM2132native2 = c6956l4.m2132native();
                    Object obj3 = objM2132native2;
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        C7436l c7436l = new C7436l(c12000l2, i2);
                        c6956l4.m2147try(c7436l);
                        obj3 = c7436l;
                    }
                    AbstractC17457l.loadAd((Function0) obj3, null, false, null, null, null, null, null, AbstractC1760l.amazon, c6956l4, 805306368, 510);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                c12000l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C12000l c12000l3 = this.f7719l;
                    boolean zAdmob3 = c6956l5.admob(c12000l3);
                    Object objM2132native3 = c6956l5.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        C2944l c2944l = new C2944l(0, c12000l3, C12000l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 15);
                        c6956l5.m2147try(c2944l);
                        objM2132native3 = c2944l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native3), null, false, null, null, null, AbstractC1760l.loadAd, c6956l5, 1572864, 62);
                } else {
                    c6956l5.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3663l(C12000l c12000l, int i, byte b) {
        this.f7720l = i;
        this.f7719l = c12000l;
    }
}
