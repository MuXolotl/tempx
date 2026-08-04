package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2519l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3102l f5314l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0471l f5315l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5316l = 1;

    public /* synthetic */ C2519l(C2663l c2663l, C0471l c0471l) {
        this.f5314l = c2663l;
        this.f5315l = c0471l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5316l;
        C0471l c0471l = this.f5315l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C14282l c14282lBilling = AbstractC0831l.billing(C9735l.isPro, 0L, 0L, 0L, 0L, c6956l, 62);
                    InterfaceC3102l interfaceC3102l = this.f5314l;
                    AbstractC18079l.amazon(AbstractC14566l.amazon(958024512, new C2519l(c0471l, interfaceC3102l), c6956l), null, AbstractC14566l.amazon(2115556802, new C15864l(c0471l), c6956l), null, 0.0f, null, c14282lBilling, interfaceC3102l, null, c6956l, 390, 314);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(c0471l.m566public().yandex.amazon, AbstractC15788l.yandex(C4346l.f8873l, this.f5314l.yandex().loadAd()), 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l2, 0, 24960, 241660);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C2519l(C0471l c0471l, InterfaceC3102l interfaceC3102l) {
        this.f5315l = c0471l;
        this.f5314l = interfaceC3102l;
    }
}
