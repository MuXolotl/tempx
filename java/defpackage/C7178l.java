package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَؚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7178l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f15014l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f15015l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f15016l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f15017l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7178l(Function2 function2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f15016l = i;
        this.f15015l = function2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f15016l;
        Function2 function2 = this.f15015l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f15014l;
                int i2 = this.f15017l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f15014l = null;
                    this.f15017l = 1;
                    if (function2.invoke(interfaceC2262l, this) == enumC9342l) {
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
                int i3 = this.f15017l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f15014l;
                    this.f15017l = 1;
                    if (function2.invoke(interfaceC2262l2, this) == enumC9342l) {
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
                C16221l c16221l = (C16221l) this.f15014l;
                int i4 = this.f15017l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f15014l = null;
                    this.f15017l = 1;
                    obj = function2.invoke(c16221l, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C16221l c16221l2 = (C16221l) obj;
                ((AtomicBoolean) c16221l2.loadAd.f11181l).set(true);
                return c16221l2;
            case 3:
                int i5 = this.f15017l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC2262l interfaceC2262l3 = (InterfaceC2262l) this.f15014l;
                    this.f15017l = 1;
                    if (function2.invoke(interfaceC2262l3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 4:
                int i6 = this.f15017l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6843l interfaceC6843l = (InterfaceC6843l) this.f15014l;
                    C2057l c2057l = new C2057l(function2, interfaceC14029l, 2);
                    this.f15017l = 1;
                    if (((C4566l) interfaceC6843l).m1556l(c2057l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i7 = this.f15017l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6843l interfaceC6843l2 = (InterfaceC6843l) this.f15014l;
                    C7178l c7178l = new C7178l(function2, interfaceC14029l, 4);
                    this.f15017l = 1;
                    if (AbstractC11141l.billing(interfaceC6843l2, c7178l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i7 != 1) {
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
        int i = this.f15016l;
        Function2 function2 = this.f15015l;
        switch (i) {
            case 0:
                C7178l c7178l = new C7178l(function2, interfaceC14029l, 0);
                c7178l.f15014l = obj;
                return c7178l;
            case 1:
                C7178l c7178l2 = new C7178l(function2, interfaceC14029l, 1);
                c7178l2.f15014l = obj;
                return c7178l2;
            case 2:
                C7178l c7178l3 = new C7178l(function2, interfaceC14029l, 2);
                c7178l3.f15014l = obj;
                return c7178l3;
            case 3:
                C7178l c7178l4 = new C7178l(function2, interfaceC14029l, 3);
                c7178l4.f15014l = obj;
                return c7178l4;
            case 4:
                C7178l c7178l5 = new C7178l(function2, interfaceC14029l, 4);
                c7178l5.f15014l = obj;
                return c7178l5;
            default:
                C7178l c7178l6 = new C7178l(function2, interfaceC14029l, 5);
                c7178l6.f15014l = obj;
                return c7178l6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15016l) {
            case 0:
                return ((C7178l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C7178l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C7178l) ads((InterfaceC14029l) obj2, (C16221l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C7178l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C7178l) ads((InterfaceC14029l) obj2, (InterfaceC6843l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C7178l) ads((InterfaceC14029l) obj2, (InterfaceC6843l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
