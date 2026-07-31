package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓۘؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2063l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f4596l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f4597l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2063l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f4596l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f4596l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f4597l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C8490l c8490l = AbstractC6025l.yandex;
                    this.f4597l = 1;
                    if (AbstractC6025l.yandex(C7649l.yandex, this) == enumC9342l) {
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
            default:
                int i3 = this.f4597l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C8490l c8490l2 = AbstractC6025l.yandex;
                    this.f4597l = 1;
                    if (AbstractC6025l.yandex(C15021l.yandex, this) == enumC9342l) {
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
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        switch (this.f4596l) {
            case 0:
                return new C2063l(1, interfaceC14029l, 0);
            default:
                return new C2063l(1, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f4596l) {
            case 0:
                break;
        }
        return ((C2063l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }
}
