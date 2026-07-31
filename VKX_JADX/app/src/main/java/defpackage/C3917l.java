package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؖؖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3917l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f8085l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f8086l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3917l(InterfaceC8714l interfaceC8714l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f8085l = i;
        this.f8086l = interfaceC8714l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f8085l;
        InterfaceC8714l interfaceC8714l = this.f8086l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                interfaceC8714l.setValue(Boolean.TRUE);
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                interfaceC8714l.setValue(new C17941l());
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f8085l;
        InterfaceC8714l interfaceC8714l = this.f8086l;
        switch (i) {
            case 0:
                return new C3917l(interfaceC8714l, interfaceC14029l, 0);
            default:
                return new C3917l(interfaceC8714l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f8085l) {
            case 0:
                break;
        }
        return ((C3917l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
