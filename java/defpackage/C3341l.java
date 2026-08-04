package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lِؕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3341l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ AbstractC12074l f7120l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f7121l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f7122l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7123l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3341l(Function3 function3, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f7122l = i;
        this.f7121l = function3;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        Object objInvoke;
        Object objInvoke2;
        Object objInvoke3;
        int i = this.f7122l;
        Function3 function3 = this.f7121l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                AbstractC12074l abstractC12074l = this.f7120l;
                int i2 = this.f7123l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        objInvoke = obj;
                    } else {
                        if (i2 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                Object obj2 = abstractC12074l.f24000l;
                AbstractC8870l abstractC8870l = (AbstractC8870l) abstractC12074l.crashlytics();
                this.f7120l = abstractC12074l;
                this.f7123l = 1;
                objInvoke = function3.invoke(obj2, abstractC8870l, this);
                if (objInvoke == enumC9342l) {
                    return enumC9342l;
                }
                AbstractC8870l abstractC8870l2 = (AbstractC8870l) objInvoke;
                if (abstractC8870l2 != null) {
                    this.f7120l = null;
                    this.f7123l = 2;
                    if (abstractC12074l.purchase(this, abstractC8870l2) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC12074l abstractC12074l2 = this.f7120l;
                int i3 = this.f7123l;
                try {
                    if (i3 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        this.f7120l = abstractC12074l2;
                        this.f7123l = 1;
                        if (abstractC12074l2.amazon(this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AbstractC2829l.crashlytics(obj);
                            objInvoke2 = obj;
                            Throwable th = (Throwable) objInvoke2;
                            if (th != null) {
                                throw th;
                            }
                            return Unit.INSTANCE;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    break;
                } catch (Throwable th2) {
                    InterfaceC1814l interfaceC1814l = ((C14249l) abstractC12074l2.f24000l).f27846l;
                    if (interfaceC1814l == null) {
                        interfaceC1814l = null;
                    }
                    this.f7120l = null;
                    this.f7123l = 2;
                    objInvoke2 = function3.invoke(interfaceC1814l, th2, this);
                    if (objInvoke2 == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC12074l abstractC12074l3 = this.f7120l;
                int i4 = this.f7123l;
                try {
                    if (i4 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        this.f7120l = abstractC12074l3;
                        this.f7123l = 1;
                        if (abstractC12074l3.amazon(this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AbstractC2829l.crashlytics(obj);
                            objInvoke3 = obj;
                            Throwable th3 = (Throwable) objInvoke3;
                            if (th3 != null) {
                                throw th3;
                            }
                            return Unit.INSTANCE;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    break;
                } catch (Throwable th4) {
                    C6806l c6806l = (C6806l) abstractC12074l3.f24000l;
                    InterfaceC6272l interfaceC6272l = AbstractC8486l.yandex;
                    C10953l c10953l = new C10953l(c6806l);
                    this.f7120l = null;
                    this.f7123l = 2;
                    objInvoke3 = function3.invoke(c10953l, th4, this);
                    if (objInvoke3 == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC12074l abstractC12074l4 = this.f7120l;
                int i5 = this.f7123l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Object obj3 = abstractC12074l4.f24000l;
                    C0382l c0382l = new C0382l(1, abstractC12074l4, AbstractC12074l.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 3);
                    this.f7120l = null;
                    this.f7123l = 1;
                    if (function3.invoke(obj3, c0382l, this) == enumC9342l) {
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
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f7122l;
        Function3 function3 = this.f7121l;
        AbstractC12074l abstractC12074l = (AbstractC12074l) obj;
        switch (i) {
            case 0:
                C3341l c3341l = new C3341l(function3, (InterfaceC14029l) obj3, 0);
                c3341l.f7120l = abstractC12074l;
                return c3341l.Signature(Unit.INSTANCE);
            case 1:
                C3341l c3341l2 = new C3341l(function3, (InterfaceC14029l) obj3, 1);
                c3341l2.f7120l = abstractC12074l;
                return c3341l2.Signature(Unit.INSTANCE);
            case 2:
                C3341l c3341l3 = new C3341l(function3, (InterfaceC14029l) obj3, 2);
                c3341l3.f7120l = abstractC12074l;
                return c3341l3.Signature(Unit.INSTANCE);
            default:
                C3341l c3341l4 = new C3341l(function3, (InterfaceC14029l) obj3, 3);
                c3341l4.f7120l = abstractC12074l;
                return c3341l4.Signature(Unit.INSTANCE);
        }
    }
}
