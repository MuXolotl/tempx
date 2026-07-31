package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِْۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13741l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f26820l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f26821l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f26822l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f26823l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13741l(InterfaceC17242l interfaceC17242l, Function2 function2, int i, int i2) {
        super(2);
        this.f26821l = interfaceC17242l;
        this.f26820l = function2;
        this.f26823l = i;
        this.f26822l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iPurchase = AbstractC0545l.purchase(this.f26823l | 1);
        int i = this.f26822l;
        AbstractC4333l.yandex(this.f26821l, this.f26820l, (C6956l) obj, iPurchase, i);
        return Unit.INSTANCE;
    }
}
