package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖٝؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16510l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f32279l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C7883l f32280l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16510l(C7883l c7883l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f32279l = i;
        this.f32280l = c7883l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object c12407l;
        int i = this.f32279l;
        C7883l c7883l = this.f32280l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                c7883l.purchase();
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                int i2 = C7883l.f16437l;
                InterfaceC0038l interfaceC0038l = (InterfaceC0038l) c7883l.f16439l.getValue();
                int i3 = AbstractC17966l.yandex[c7883l.inmobi().ordinal()];
                if (i3 == 1 && (interfaceC0038l instanceof C7719l)) {
                    c12407l = new C12407l(((C7719l) interfaceC0038l).yandex);
                } else {
                    c12407l = i3 == 2 ? C12279l.yandex : C15166l.yandex;
                }
                c7883l.f16438l.setValue(c12407l);
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f32279l;
        C7883l c7883l = this.f32280l;
        switch (i) {
            case 0:
                return new C16510l(c7883l, interfaceC14029l, 0);
            default:
                return new C16510l(c7883l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f32279l) {
            case 0:
                break;
        }
        return ((C16510l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
