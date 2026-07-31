package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؚِٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7201l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1026l f15038l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15039l;

    public /* synthetic */ C7201l(C1026l c1026l, int i) {
        this.f15039l = i;
        this.f15038l = c1026l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15039l;
        int i2 = 2;
        C1026l c1026l = this.f15038l;
        int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC0133l.amazon(AbstractC14566l.amazon(-2030958445, new C7201l(c1026l, i3), c6956l), AbstractC14566l.amazon(660004978, new C7201l(c1026l, i2), c6956l), AbstractC3605l.smaato(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f), null, c6956l, 438, 8);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC17307l.billing(c1026l.f2853l, 0, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.startapp, 0L, 0, 0.0f, false, null, null, null, c6956l2, 0, 1018);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l3.billing(interfaceC15451l) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    AbstractC0133l.loadAd(interfaceC15451l, AbstractC14566l.amazon(343003058, new C17956l(c1026l, 0), c6956l3), AbstractC14566l.amazon(189230003, new C17956l(c1026l, 1), c6956l3), c6956l3, (iIntValue3 & 14) | 432);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
