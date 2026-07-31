package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lّٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17437l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ C3554l f33985l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f33986l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ C3597l f33987l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17437l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f33986l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        switch (this.f33986l) {
            case 0:
                C3597l c3597l = this.f33987l;
                C3554l c3554l = this.f33985l;
                AbstractC2829l.crashlytics(obj);
                return C3597l.loadAd(c3597l, c3554l, null, null, null, null, null, null, null, 131070);
            default:
                C3597l c3597l2 = this.f33987l;
                C3554l c3554l2 = this.f33985l;
                AbstractC2829l.crashlytics(obj);
                return C3597l.loadAd(c3597l2, c3554l2, null, null, null, null, null, null, null, 131070);
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        C3597l c3597l = (C3597l) obj;
        C3554l c3554l = (C3554l) obj2;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
        switch (this.f33986l) {
            case 0:
                C17437l c17437l = new C17437l(i, interfaceC14029l, 0);
                c17437l.f33987l = c3597l;
                c17437l.f33985l = c3554l;
                return c17437l.Signature(Unit.INSTANCE);
            default:
                C17437l c17437l2 = new C17437l(i, interfaceC14029l, 1);
                c17437l2.f33987l = c3597l;
                c17437l2.f33985l = c3554l;
                return c17437l2.Signature(Unit.INSTANCE);
        }
    }
}
