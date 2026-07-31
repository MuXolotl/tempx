package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٍؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7885l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13242l f16449l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16450l;

    public /* synthetic */ C7885l(C13242l c13242l, int i) {
        this.f16450l = i;
        this.f16449l = c13242l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16450l;
        C13242l c13242l = this.f16449l;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
                    C9946l c9946l = AbstractC16837l.yandex;
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(c4346l, j, c9946l);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
                    long j2 = c6956l.f14595continue;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC18079l.amazon(AbstractC14566l.amazon(-1675783099, new C7885l(c13242l, i3), c6956l), null, AbstractC14566l.amazon(1933416579, new C7885l(c13242l, i2), c6956l), null, 0.0f, AbstractC10439l.yandex, null, null, null, c6956l, 196998, 474);
                    AbstractC0555l.loadAd(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0L, c6956l, 6, 6);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(c13242l.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C13242l c13242l2 = this.f16449l;
                    boolean zAdmob = c6956l3.admob(c13242l2);
                    Object objM2132native = c6956l3.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C4936l c4936l = new C4936l(0, c13242l2, C13242l.class, "onDismissClicked", "onDismissClicked()V", 0, 0, 7);
                        c6956l3.m2147try(c4936l);
                        objM2132native = c4936l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC7837l.yandex, c6956l3, 1572864, 62);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
