package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lْٗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17095l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f33264l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f33265l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17095l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f33264l = i;
        this.f33265l = obj;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        switch (this.f33264l) {
            case 0:
                C3597l c3597l = (C3597l) this.f33265l;
                AbstractC2829l.crashlytics(obj);
                return c3597l;
            case 1:
                C6806l c6806l = (C6806l) this.f33265l;
                AbstractC2829l.crashlytics(obj);
                if (c6806l.billing.billing(AbstractC0105l.yandex) == null) {
                    return null;
                }
                C18725l.loadAd();
                return null;
            case 2:
                AbstractC2829l.crashlytics(obj);
                ((C9122l) this.f33265l).f18750l = true;
                return Unit.INSTANCE;
            default:
                AbstractC2829l.crashlytics(obj);
                ((C11625l) this.f33265l).firebase.invoke();
                return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.f33264l) {
            case 0:
                C3597l c3597l = (C3597l) obj2;
                new C17095l(i, (InterfaceC14029l) obj3, 0).f33265l = c3597l;
                AbstractC2829l.crashlytics(Unit.INSTANCE);
                return c3597l;
            case 1:
                C17095l c17095l = new C17095l(i, (InterfaceC14029l) obj3, 1);
                c17095l.f33265l = (C6806l) obj;
                c17095l.Signature(Unit.INSTANCE);
                return null;
            case 2:
                return new C17095l((C9122l) this.f33265l, (InterfaceC14029l) obj3, 2).Signature(Unit.INSTANCE);
            default:
                ((Number) obj2).floatValue();
                return new C17095l((C11625l) this.f33265l, (InterfaceC14029l) obj3, i).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17095l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f33264l = i2;
    }
}
