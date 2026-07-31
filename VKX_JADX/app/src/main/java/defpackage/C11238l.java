package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًُۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11238l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f22618l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6843l f22619l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22620l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C15178l f22621l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f22622l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11238l(InterfaceC6843l interfaceC6843l, C15178l c15178l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f22620l = i;
        this.f22619l = interfaceC6843l;
        this.f22621l = c15178l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f22620l;
        C15178l c15178l = this.f22621l;
        InterfaceC6843l interfaceC6843l = this.f22619l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f22622l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C12002l c12002l = new C12002l((InterfaceC2262l) this.f22618l, c15178l, null);
                    this.f22622l = 1;
                    if (AbstractC11141l.crashlytics(interfaceC6843l, c12002l, this) == enumC9342l) {
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
                int i3 = this.f22622l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C3977l c3977l = new C3977l((InterfaceC2262l) this.f22618l, c15178l, interfaceC14029l, 0);
                    this.f22622l = 1;
                    if (((C4566l) interfaceC6843l).m1556l(c3977l, this) == enumC9342l) {
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
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f22620l) {
            case 0:
                C11238l c11238l = new C11238l(this.f22619l, this.f22621l, interfaceC14029l, 0);
                c11238l.f22618l = obj;
                return c11238l;
            default:
                C11238l c11238l2 = new C11238l(this.f22619l, this.f22621l, interfaceC14029l, 1);
                c11238l2.f22618l = obj;
                return c11238l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f22620l) {
            case 0:
                break;
        }
        return ((C11238l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
