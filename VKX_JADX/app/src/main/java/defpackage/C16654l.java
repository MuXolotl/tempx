package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖۜۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16654l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f32621l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C0324l f32622l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16654l(C0324l c0324l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f32621l = i;
        this.f32622l = c0324l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f32621l;
        C0324l c0324l = this.f32622l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                AbstractC10999l.mopub(c0324l.purchase, null, 0, new C9692l(c0324l, null, 2), 3);
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                AbstractC10999l.mopub(c0324l.purchase, null, 0, new C9692l(c0324l, null, 2), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f32621l;
        C0324l c0324l = this.f32622l;
        switch (i) {
            case 0:
                return new C16654l(c0324l, interfaceC14029l, 0);
            default:
                return new C16654l(c0324l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f32621l) {
            case 0:
                break;
        }
        return ((C16654l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
