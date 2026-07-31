package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lّۦٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12996l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ float f25464l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f25465l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12996l(InterfaceC8714l interfaceC8714l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f25465l = interfaceC8714l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        ((Function1) this.f25465l.getValue()).invoke(new Float(this.f25464l));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C12996l c12996l = new C12996l(this.f25465l, (InterfaceC14029l) obj3);
        c12996l.f25464l = fFloatValue;
        return c12996l.Signature(Unit.INSTANCE);
    }
}
