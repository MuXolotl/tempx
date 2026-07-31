package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌٚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8898l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f18283l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ EnumC13846l f18284l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2186l f18285l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f18286l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C6402l f18287l;

    public C8898l(InterfaceC2186l interfaceC2186l, EnumC13846l enumC13846l, boolean z, C6402l c6402l, Function0 function0) {
        this.f18285l = interfaceC2186l;
        this.f18284l = enumC13846l;
        this.f18283l = z;
        this.f18287l = c6402l;
        this.f18286l = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6956l c6956l = (C6956l) obj2;
        ((Number) obj3).intValue();
        c6956l.m2123default(-1525724089);
        Object objM2132native = c6956l.m2132native();
        if (objM2132native == C1867l.yandex) {
            objM2132native = AbstractC14814l.isPro(c6956l);
        }
        C2403l c2403l = (C2403l) objM2132native;
        InterfaceC17242l interfaceC17242lPremium = AbstractC14631l.yandex(C4346l.f8873l, c2403l, this.f18285l).premium(new C10171l(this.f18284l, c2403l, null, this.f18283l, this.f18287l, this.f18286l));
        c6956l.startapp(false);
        return interfaceC17242lPremium;
    }
}
