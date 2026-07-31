package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌٍؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3289l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f7036l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f7037l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7038l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3289l(int i, InterfaceC14029l interfaceC14029l, Function1 function1) {
        super(2, interfaceC14029l);
        this.f7037l = i;
        this.f7036l = function1;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f7037l;
        Function1 function1 = this.f7036l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f7038l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f7038l = 1;
                    Object objInvoke = function1.invoke(this);
                    return objInvoke == enumC9342l ? enumC9342l : objInvoke;
                }
                if (i2 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f7038l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f7038l = 1;
                    if (function1.invoke(this) == enumC9342l) {
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
            case 2:
                int i4 = this.f7038l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f7038l = 1;
                    if (function1.invoke(this) == enumC9342l) {
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
            case 3:
                int i5 = this.f7038l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f7038l = 1;
                    Object objInvoke2 = function1.invoke(this);
                    return objInvoke2 == enumC9342l ? enumC9342l : objInvoke2;
                }
                if (i5 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i6 = this.f7038l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C11644l c11644l = C6336l.loadAd;
                    this.f7038l = 1;
                    obj = c11644l.m3168l(this);
                    if (obj != enumC9342l) {
                    }
                    return enumC9342l;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                this.f7038l = 2;
                Object objM1734l = ((C5198l) obj).m1734l(function1, this);
                if (objM1734l != enumC9342l) {
                    return objM1734l;
                }
                return enumC9342l;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f7037l;
        Function1 function1 = this.f7036l;
        switch (i) {
            case 0:
                return new C3289l(0, interfaceC14029l, function1);
            case 1:
                return new C3289l(1, interfaceC14029l, function1);
            case 2:
                return new C3289l(2, interfaceC14029l, function1);
            case 3:
                return new C3289l(3, interfaceC14029l, function1);
            default:
                return new C3289l(4, interfaceC14029l, function1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f7037l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((C3289l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
