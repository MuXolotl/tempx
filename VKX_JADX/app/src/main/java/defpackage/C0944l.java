package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0944l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f2624l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Exception f2625l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2626l = 1;

    public /* synthetic */ C0944l(Exception exc, Function0 function0) {
        this.f2625l = exc;
        this.f2624l = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2626l;
        Exception exc = this.f2625l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC14289l.crashlytics(exc, this.f2624l, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0086l c0086l = C18450l.f36040l;
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f, 0.0f, 2);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, c0086l, c6956l, 48);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    boolean zAdmob = c6956l.admob(exc);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C13802l(5, exc);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, false, null, null, null, AbstractC15422l.crashlytics, c6956l, 805306368, 510);
                    AbstractC9383l.yandex(new C9247l(1.0f, true), c6956l, 0);
                    AbstractC17457l.loadAd(this.f2624l, null, false, null, null, null, null, null, AbstractC15422l.amazon, c6956l, 805306368, 510);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0944l(Exception exc, Function0 function0, int i) {
        this.f2625l = exc;
        this.f2624l = function0;
    }
}
