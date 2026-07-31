package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11290l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f22742l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C12951l f22743l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22744l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f22745l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11290l(C12951l c12951l, C2403l c2403l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f22744l = 0;
        this.f22743l = c12951l;
        this.f22742l = c2403l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f22744l;
        C12951l c12951l = this.f22743l;
        C2403l c2403l = this.f22742l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f22745l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C3426l c3426l = new C3426l(c12951l);
                    this.f22745l = 1;
                    if (c2403l.yandex(c3426l, this) == enumC9342l) {
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
                int i3 = this.f22745l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f22745l = 1;
                    if (c2403l.yandex(c12951l, this) == enumC9342l) {
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
                int i4 = this.f22745l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f22745l = 1;
                    if (c2403l.yandex(c12951l, this) == enumC9342l) {
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
                int i5 = this.f22745l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C3426l c3426l2 = new C3426l(c12951l);
                    this.f22745l = 1;
                    if (c2403l.yandex(c3426l2, this) == enumC9342l) {
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
                int i6 = this.f22745l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f22745l = 1;
                    if (c2403l.yandex(c12951l, this) == enumC9342l) {
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
                int i7 = this.f22745l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C3426l c3426l3 = new C3426l(c12951l);
                    this.f22745l = 1;
                    if (c2403l.yandex(c3426l3, this) == enumC9342l) {
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
        int i = this.f22744l;
        C12951l c12951l = this.f22743l;
        C2403l c2403l = this.f22742l;
        switch (i) {
            case 0:
                return new C11290l(c12951l, c2403l, interfaceC14029l);
            case 1:
                return new C11290l(c2403l, c12951l, interfaceC14029l, 1);
            case 2:
                return new C11290l(c2403l, c12951l, interfaceC14029l, 2);
            case 3:
                return new C11290l(c2403l, c12951l, interfaceC14029l, 3);
            case 4:
                return new C11290l(c2403l, c12951l, interfaceC14029l, 4);
            default:
                return new C11290l(c2403l, c12951l, interfaceC14029l, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f22744l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((C11290l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11290l(C2403l c2403l, C12951l c12951l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f22744l = i;
        this.f22742l = c2403l;
        this.f22743l = c12951l;
    }
}
