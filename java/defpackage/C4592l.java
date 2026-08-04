package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗؒؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4592l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f9325l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f9326l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f9327l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f9328l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f9329l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4592l(Function2 function2, InterfaceC8714l interfaceC8714l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f9327l = i;
        this.f9326l = function2;
        this.f9328l = interfaceC8714l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f9327l;
        InterfaceC8714l interfaceC8714l = this.f9328l;
        Function2 function2 = this.f9326l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f9329l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5655l c5655l = new C5655l(interfaceC8714l, ((InterfaceC2262l) this.f9325l).vip());
                    this.f9329l = 1;
                    if (function2.invoke(c5655l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f9329l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5655l c5655l2 = new C5655l(interfaceC8714l, ((InterfaceC2262l) this.f9325l).vip());
                    this.f9329l = 1;
                    if (function2.invoke(c5655l2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i4 = this.f9329l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5655l c5655l3 = new C5655l(interfaceC8714l, ((InterfaceC2262l) this.f9325l).vip());
                    this.f9329l = 1;
                    if (function2.invoke(c5655l3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f9327l) {
            case 0:
                C4592l c4592l = new C4592l(this.f9326l, this.f9328l, interfaceC14029l, 0);
                c4592l.f9325l = obj;
                return c4592l;
            case 1:
                C4592l c4592l2 = new C4592l(this.f9326l, this.f9328l, interfaceC14029l, 1);
                c4592l2.f9325l = obj;
                return c4592l2;
            default:
                C4592l c4592l3 = new C4592l(this.f9326l, this.f9328l, interfaceC14029l, 2);
                c4592l3.f9325l = obj;
                return c4592l3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f9327l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C4592l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
