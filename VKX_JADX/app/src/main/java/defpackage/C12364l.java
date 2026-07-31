package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّؔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12364l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f24457l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2768l f24458l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f24459l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f24460l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12364l(C2768l c2768l, InterfaceC17242l interfaceC17242l, Function2 function2, int i) {
        super(2);
        this.f24458l = c2768l;
        this.f24457l = interfaceC17242l;
        this.f24460l = function2;
        this.f24459l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iPurchase = AbstractC0545l.purchase(this.f24459l | 1);
        AbstractC4333l.loadAd(this.f24458l, this.f24457l, this.f24460l, (C6956l) obj, iPurchase);
        return Unit.INSTANCE;
    }
}
