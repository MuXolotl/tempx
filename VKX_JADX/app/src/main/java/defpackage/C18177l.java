package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: l٘ۚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18177l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f35619l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9430l f35620l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35621l;

    public /* synthetic */ C18177l(C9430l c9430l, InterfaceC12244l interfaceC12244l, int i) {
        this.f35621l = i;
        this.f35620l = c9430l;
        this.f35619l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f35621l;
        InterfaceC12244l interfaceC12244l = this.f35619l;
        C9430l c9430l = this.f35620l;
        int i2 = 1;
        switch (i) {
            case 0:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    AbstractC3274l.yandex(AbstractC3605l.firebase(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), interfaceC11780l), AbstractC7497l.loadAd(12), ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(1857381333, new C17950l(c9430l, interfaceC12244l, i2), c6956l), c6956l, 12582912, 120);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    c9430l.m2656try(((C16187l) interfaceC12244l.getValue()).crashlytics, c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
