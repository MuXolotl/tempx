package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1596l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5056l f3920l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f3921l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f3922l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1596l(C5056l c5056l, InterfaceC14029l interfaceC14029l, int i) {
        super(1, interfaceC14029l);
        this.f3921l = i;
        this.f3920l = c5056l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f3921l;
        C5056l c5056l = this.f3920l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f3922l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f3922l = 1;
                    if (C5056l.yandex(c5056l, EnumC18610l.f36364l, this) == enumC9342l) {
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
                int i3 = this.f3922l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f3922l = 1;
                    if (C5056l.yandex(c5056l, EnumC18610l.f36363l, this) == enumC9342l) {
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
        switch (this.f3921l) {
            case 0:
                return new C1596l(this.f3920l, interfaceC14029l, 0);
            default:
                return new C1596l(this.f3920l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f3921l) {
            case 0:
                break;
        }
        return ((C1596l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }
}
