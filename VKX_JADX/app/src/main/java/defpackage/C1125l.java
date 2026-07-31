package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؒ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1125l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f3078l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C1304l f3079l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f3080l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C15730l f3081l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f3082l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1125l(Function3 function3, C1304l c1304l, C15730l c15730l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f3080l = i;
        this.f3078l = function3;
        this.f3079l = c1304l;
        this.f3081l = c15730l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f3080l;
        C15730l c15730l = this.f3081l;
        C1304l c1304l = this.f3079l;
        Function3 function3 = this.f3078l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f3082l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C1187l c1187l = new C1187l(c15730l.crashlytics);
                    this.f3082l = 1;
                    if (function3.invoke(c1304l, c1187l, this) == enumC9342l) {
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
                int i3 = this.f3082l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C1187l c1187l2 = new C1187l(c15730l.crashlytics);
                    this.f3082l = 1;
                    if (function3.invoke(c1304l, c1187l2, this) == enumC9342l) {
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
                int i4 = this.f3082l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C1187l c1187l3 = new C1187l(c15730l.crashlytics);
                    this.f3082l = 1;
                    if (function3.invoke(c1304l, c1187l3, this) == enumC9342l) {
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
        switch (this.f3080l) {
            case 0:
                return new C1125l(this.f3078l, this.f3079l, this.f3081l, interfaceC14029l, 0);
            case 1:
                return new C1125l(this.f3078l, this.f3079l, this.f3081l, interfaceC14029l, 1);
            default:
                return new C1125l(this.f3078l, this.f3079l, this.f3081l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f3080l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C1125l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
