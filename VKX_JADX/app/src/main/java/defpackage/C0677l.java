package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lۣؑ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0677l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C1254l f2154l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f2155l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f2156l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0677l(C1254l c1254l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f2155l = i;
        this.f2154l = c1254l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f2155l;
        C1254l c1254l = this.f2154l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f2156l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f2156l = 1;
                    if (C1254l.ad(c1254l, this) == enumC9342l) {
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
                int i3 = this.f2156l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C8490l c8490l = AbstractC6025l.yandex;
                    this.f2156l = 1;
                    if (AbstractC6025l.yandex(C3689l.yandex, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c1254l.purchase();
                return Unit.INSTANCE;
            default:
                int i4 = this.f2156l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f2156l = 1;
                    if (C1254l.pro(c1254l, this) == enumC9342l) {
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
        int i = this.f2155l;
        C1254l c1254l = this.f2154l;
        switch (i) {
            case 0:
                return new C0677l(c1254l, interfaceC14029l, 0);
            case 1:
                return new C0677l(c1254l, interfaceC14029l, 1);
            default:
                return new C0677l(c1254l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f2155l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C0677l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
