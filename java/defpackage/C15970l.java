package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٍٕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15970l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7652l f31345l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31346l;

    public /* synthetic */ C15970l(C7652l c7652l, int i) {
        this.f31346l = i;
        this.f31345l = c7652l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C8206l c8206l;
        int i = this.f31346l;
        C7652l c7652l = this.f31345l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 17) != 16)) {
                    C12787l c12787l = c7652l.yandex.adcel;
                    AbstractC17307l.billing((c12787l == null || (c8206l = c12787l.purchase) == null) ? null : c8206l.billing, 0, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp, 0L, 0, 0.0f, false, null, null, null, c6956l, 0, 1018);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC15451l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    AbstractC0133l.loadAd(interfaceC15451l, AbstractC14566l.amazon(-156241087, new C14976l(c7652l, 0), c6956l2), AbstractC14566l.amazon(1643584898, new C14976l(c7652l, 1), c6956l2), c6956l2, (iIntValue2 & 14) | 432);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
