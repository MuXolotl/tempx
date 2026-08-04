package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٟٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14317l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f28042l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6843l f28043l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f28044l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f28045l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14317l(InterfaceC6843l interfaceC6843l, C12217l c12217l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f28044l = 3;
        this.f28043l = interfaceC6843l;
        this.f28042l = c12217l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f28044l;
        InterfaceC6843l interfaceC6843l = this.f28043l;
        C12217l c12217l = this.f28042l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f28045l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f28045l = 1;
                    if (c12217l.subs(interfaceC6843l, this) == enumC9342l) {
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
                int i3 = this.f28045l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f28045l = 1;
                    if (c12217l.subs(interfaceC6843l, this) == enumC9342l) {
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
                int i4 = this.f28045l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f28045l = 1;
                    if (C12217l.yandex(c12217l, interfaceC6843l, this) == enumC9342l) {
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
                int i5 = this.f28045l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C15419l c15419l = new C15419l(c12217l, 1);
                    this.f28045l = 1;
                    if (AbstractC18112l.purchase(interfaceC6843l, null, c15419l, this, 7) == enumC9342l) {
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
            default:
                int i6 = this.f28045l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f28045l = 1;
                    if (c12217l.subs(interfaceC6843l, this) == enumC9342l) {
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
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f28044l;
        InterfaceC6843l interfaceC6843l = this.f28043l;
        C12217l c12217l = this.f28042l;
        switch (i) {
            case 0:
                return new C14317l(c12217l, interfaceC6843l, interfaceC14029l, 0);
            case 1:
                return new C14317l(c12217l, interfaceC6843l, interfaceC14029l, 1);
            case 2:
                return new C14317l(c12217l, interfaceC6843l, interfaceC14029l, 2);
            case 3:
                return new C14317l(interfaceC6843l, c12217l, interfaceC14029l);
            default:
                return new C14317l(c12217l, interfaceC6843l, interfaceC14029l, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f28044l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((C14317l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14317l(C12217l c12217l, InterfaceC6843l interfaceC6843l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f28044l = i;
        this.f28042l = c12217l;
        this.f28043l = interfaceC6843l;
    }
}
