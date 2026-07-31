package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗۛۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5169l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C4240l f11224l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f11225l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f11226l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5169l(C4240l c4240l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f11225l = i;
        this.f11224l = c4240l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f11225l;
        int i2 = 18;
        C4240l c4240l = this.f11224l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i3 = this.f11226l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C12217l c12217l = c4240l.f8681l;
                    this.f11226l = 1;
                    if (c12217l.purchase(true, this) == enumC9342l) {
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
            case 1:
                int i4 = this.f11226l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C12217l c12217l2 = c4240l.f8681l;
                    this.f11226l = 1;
                    if (c12217l2.billing(this) == enumC9342l) {
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
            case 2:
                int i5 = this.f11226l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C12217l c12217l3 = c4240l.f8681l;
                    this.f11226l = 1;
                    if (c12217l3.subscription(this) == enumC9342l) {
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
            case 3:
                int i6 = this.f11226l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f11226l = 1;
                    Object objYandex = AbstractC0622l.adcel(new C10424l(AbstractC8020l.metrica(new C9495l(c4240l, 7)), 14), 1).yandex(new C2354l(18, c4240l), this);
                    if (objYandex != enumC9342l) {
                        objYandex = Unit.INSTANCE;
                    }
                    if (objYandex == enumC9342l) {
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
            case 4:
                int i7 = this.f11226l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C12217l c12217l4 = c4240l.f8681l;
                    this.f11226l = 1;
                    if (c12217l4.ad(this) == enumC9342l) {
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
            default:
                int i8 = this.f11226l;
                if (i8 != 0) {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC2829l.crashlytics(obj);
                        C17132l.firebase();
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C15352l c15352l = new C15352l(c4240l, interfaceC14029l, i2);
                this.f11226l = 1;
                AbstractC12769l.yandex(c4240l, c15352l, this);
                return enumC9342l;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f11225l;
        C4240l c4240l = this.f11224l;
        switch (i) {
            case 0:
                return new C5169l(c4240l, interfaceC14029l, 0);
            case 1:
                return new C5169l(c4240l, interfaceC14029l, 1);
            case 2:
                return new C5169l(c4240l, interfaceC14029l, 2);
            case 3:
                return new C5169l(c4240l, interfaceC14029l, 3);
            case 4:
                return new C5169l(c4240l, interfaceC14029l, 4);
            default:
                return new C5169l(c4240l, interfaceC14029l, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f11225l) {
            case 0:
                return ((C5169l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
            case 1:
                return ((C5169l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
            case 2:
                return ((C5169l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
            case 3:
                return ((C5169l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
            case 4:
                return ((C5169l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
            default:
                ((C5169l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
                return EnumC9342l.f19165l;
        }
    }
}
