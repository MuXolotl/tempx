package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16203l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f31700l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f31701l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f31702l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16203l(C12217l c12217l, InterfaceC14029l interfaceC14029l, int i) {
        super(1, interfaceC14029l);
        this.f31701l = i;
        this.f31700l = c12217l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f31701l;
        C12217l c12217l = this.f31700l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f31702l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f31702l = 1;
                    if (c12217l.billing(this) == enumC9342l) {
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
                int i3 = this.f31702l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    boolean zBooleanValue = ((Boolean) c12217l.Signature.getValue()).booleanValue();
                    this.f31702l = 1;
                    if (c12217l.purchase(zBooleanValue, this) == enumC9342l) {
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
                int i4 = this.f31702l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f31702l = 1;
                    if (c12217l.subscription(this) == enumC9342l) {
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
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        int i = this.f31701l;
        C12217l c12217l = this.f31700l;
        switch (i) {
            case 0:
                return new C16203l(c12217l, interfaceC14029l, 0);
            case 1:
                return new C16203l(c12217l, interfaceC14029l, 1);
            default:
                return new C16203l(c12217l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f31701l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C16203l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }
}
