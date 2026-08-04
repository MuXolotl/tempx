package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٓؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13926l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ float f27213l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f27214l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C13250l f27215l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13926l(C13250l c13250l, float f, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f27215l = c13250l;
        this.f27213l = f;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        this.f27215l.f26029l = ((InterfaceC1555l) this.f27214l).yandex(this.f27213l);
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C13926l c13926l = new C13926l(this.f27215l, this.f27213l, interfaceC14029l);
        c13926l.f27214l = obj;
        return c13926l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C13926l) ads((InterfaceC14029l) obj2, (InterfaceC1555l) obj)).Signature(Unit.INSTANCE);
    }
}
