package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕۙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15908l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f31225l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f31226l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f31227l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f31228l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15908l(int i, InterfaceC14029l interfaceC14029l, Function1 function1) {
        super(2, interfaceC14029l);
        this.f31227l = i;
        this.f31226l = function1;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f31227l;
        int i2 = 0;
        Function1 function1 = this.f31226l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i3 = 1;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i4 = this.f31228l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6843l interfaceC6843l = (InterfaceC6843l) this.f31225l;
                    C12607l c12607l = new C12607l(i2, interfaceC14029l, function1);
                    this.f31228l = 1;
                    if (((C4566l) interfaceC6843l).m1556l(c12607l, this) == enumC9342l) {
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
            case 1:
                int i5 = this.f31228l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6843l interfaceC6843l2 = (InterfaceC6843l) this.f31225l;
                    C15908l c15908l = new C15908l(i2, interfaceC14029l, function1);
                    this.f31228l = 1;
                    if (AbstractC11141l.billing(interfaceC6843l2, c15908l, this) == enumC9342l) {
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
            case 2:
                int i6 = this.f31228l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6843l interfaceC6843l3 = (InterfaceC6843l) this.f31225l;
                    C12607l c12607l2 = new C12607l(i3, interfaceC14029l, function1);
                    this.f31228l = 1;
                    if (((C4566l) interfaceC6843l3).m1556l(c12607l2, this) == enumC9342l) {
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
                int i7 = this.f31228l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6843l interfaceC6843l4 = (InterfaceC6843l) this.f31225l;
                    C15908l c15908l2 = new C15908l(2, interfaceC14029l, function1);
                    this.f31228l = 1;
                    if (AbstractC11141l.billing(interfaceC6843l4, c15908l2, this) == enumC9342l) {
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
        switch (this.f31227l) {
            case 0:
                C15908l c15908l = new C15908l(0, interfaceC14029l, this.f31226l);
                c15908l.f31225l = obj;
                return c15908l;
            case 1:
                C15908l c15908l2 = new C15908l(1, interfaceC14029l, this.f31226l);
                c15908l2.f31225l = obj;
                return c15908l2;
            case 2:
                C15908l c15908l3 = new C15908l(2, interfaceC14029l, this.f31226l);
                c15908l3.f31225l = obj;
                return c15908l3;
            default:
                C15908l c15908l4 = new C15908l(3, interfaceC14029l, this.f31226l);
                c15908l4.f31225l = obj;
                return c15908l4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC6843l interfaceC6843l = (InterfaceC6843l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f31227l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C15908l) ads(interfaceC14029l, interfaceC6843l)).Signature(Unit.INSTANCE);
    }
}
