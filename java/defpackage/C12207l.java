package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؙِۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12207l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f24257l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f24258l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f24259l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f24260l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ Object f24261l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f24262l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12207l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f24260l = i;
        this.f24261l = obj;
        this.f24259l = obj2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objInvoke;
        Object objInvoke2;
        Object objInvoke3;
        Object objInvoke4;
        Object objYandex;
        C2993l c2993l;
        int i = this.f24260l;
        Object obj2 = this.f24259l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                C14187l c14187l = (C14187l) this.f24257l;
                ClassLoader classLoader = (ClassLoader) this.f24258l;
                int i2 = this.f24262l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C13046l c13046l = (C13046l) this.f24261l;
                    String str = (String) obj2;
                    this.f24257l = null;
                    this.f24258l = null;
                    this.f24262l = 1;
                    Object objLoadAd = c13046l.loadAd(str, new C7045l(classLoader, str, c14187l, c13046l, null), this);
                    if (objLoadAd != enumC9342l) {
                        objLoadAd = Unit.INSTANCE;
                    }
                    if (objLoadAd == enumC9342l) {
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
                InterfaceC9427l interfaceC9427l = (InterfaceC9427l) this.f24258l;
                Object obj3 = this.f24261l;
                int i3 = this.f24262l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        interfaceC9427l = (InterfaceC9427l) this.f24257l;
                        AbstractC2829l.crashlytics(obj);
                        objInvoke = obj;
                    } else {
                        if (i3 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                this.f24258l = null;
                this.f24261l = null;
                this.f24257l = interfaceC9427l;
                this.f24262l = 1;
                objInvoke = ((Function2) obj2).invoke(obj3, this);
                if (objInvoke == enumC9342l) {
                    return enumC9342l;
                }
                this.f24258l = null;
                this.f24261l = null;
                this.f24257l = null;
                this.f24262l = 2;
                if (interfaceC9427l.isPro(objInvoke, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC9427l interfaceC9427l2 = (InterfaceC9427l) this.f24258l;
                Object[] objArr = (Object[]) this.f24261l;
                int i4 = this.f24262l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        interfaceC9427l2 = (InterfaceC9427l) this.f24257l;
                        AbstractC2829l.crashlytics(obj);
                        objInvoke2 = obj;
                    } else {
                        if (i4 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                Object obj4 = objArr[0];
                Object obj5 = objArr[1];
                Object obj6 = objArr[2];
                this.f24258l = null;
                this.f24261l = null;
                this.f24257l = interfaceC9427l2;
                this.f24262l = 1;
                objInvoke2 = ((C5752l) obj2).invoke(obj4, obj5, obj6, this);
                if (objInvoke2 == enumC9342l) {
                    return enumC9342l;
                }
                this.f24258l = null;
                this.f24261l = null;
                this.f24257l = null;
                this.f24262l = 2;
                if (interfaceC9427l2.isPro(objInvoke2, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC9427l interfaceC9427l3 = (InterfaceC9427l) this.f24258l;
                Object[] objArr2 = (Object[]) this.f24261l;
                int i5 = this.f24262l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        interfaceC9427l3 = (InterfaceC9427l) this.f24257l;
                        AbstractC2829l.crashlytics(obj);
                        objInvoke3 = obj;
                    } else {
                        if (i5 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C13262l c13262l = (C13262l) obj2;
                Object obj7 = objArr2[0];
                Object obj8 = objArr2[1];
                Object obj9 = objArr2[2];
                Object obj10 = objArr2[3];
                this.f24258l = null;
                this.f24261l = null;
                this.f24257l = interfaceC9427l3;
                this.f24262l = 1;
                objInvoke3 = c13262l.invoke(obj7, obj8, obj9, obj10, this);
                if (objInvoke3 == enumC9342l) {
                    return enumC9342l;
                }
                this.f24258l = null;
                this.f24261l = null;
                this.f24257l = null;
                this.f24262l = 2;
                if (interfaceC9427l3.isPro(objInvoke3, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC9427l interfaceC9427l4 = (InterfaceC9427l) this.f24258l;
                Object[] objArr3 = (Object[]) this.f24261l;
                int i6 = this.f24262l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        interfaceC9427l4 = (InterfaceC9427l) this.f24257l;
                        AbstractC2829l.crashlytics(obj);
                        objInvoke4 = obj;
                    } else {
                        if (i6 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                Object obj11 = objArr3[0];
                Object obj12 = objArr3[1];
                this.f24258l = null;
                this.f24261l = null;
                this.f24257l = interfaceC9427l4;
                this.f24262l = 1;
                objInvoke4 = ((Function3) obj2).invoke(obj11, obj12, this);
                if (objInvoke4 == enumC9342l) {
                    return enumC9342l;
                }
                this.f24258l = null;
                this.f24261l = null;
                this.f24257l = null;
                this.f24262l = 2;
                if (interfaceC9427l4.isPro(objInvoke4, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 5:
                C3235l c3235l = (C3235l) this.f24258l;
                C6806l c6806l = (C6806l) this.f24261l;
                int i7 = this.f24262l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f24258l = null;
                    this.f24261l = null;
                    this.f24262l = 1;
                    objYandex = c3235l.f6929l.yandex(c6806l, this);
                    if (objYandex == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        C14249l c14249l = (C14249l) this.f24257l;
                        AbstractC2829l.crashlytics(obj);
                        return c14249l;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objYandex = obj;
                }
                C14249l c14249l2 = (C14249l) objYandex;
                List list = (List) obj2;
                AbstractC10022l abstractC10022l = c14249l2.f27845l;
                if (abstractC10022l == null) {
                    abstractC10022l = null;
                }
                this.f24258l = null;
                this.f24261l = null;
                this.f24257l = c14249l2;
                this.f24262l = 2;
                return AbstractC8486l.loadAd(list, abstractC10022l, this) == enumC9342l ? enumC9342l : c14249l2;
            case 6:
                C6806l c6806l2 = (C6806l) this.f24258l;
                Function1 function1 = (Function1) this.f24261l;
                int i8 = this.f24262l;
                if (i8 != 0) {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c2993l = (C2993l) this.f24257l;
                    try {
                        AbstractC2829l.crashlytics(obj);
                        c2993l.m561l();
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            c2993l.m560l(th);
                            throw th;
                        } catch (Throwable th2) {
                            c2993l.m561l();
                            throw th2;
                        }
                    }
                }
                AbstractC2829l.crashlytics(obj);
                C2993l c2993l2 = new C2993l(c6806l2.purchase);
                InterfaceC7042l interfaceC7042l = (InterfaceC7042l) ((C12825l) obj2).yandex.f32918l.mo245l(C1083l.f2996l);
                InterfaceC6272l interfaceC6272l = AbstractC13424l.yandex;
                c2993l2.mo2154l(new C17015l(5, interfaceC7042l.mo2154l(new C17015l(4, c2993l2))));
                try {
                    c6806l2.purchase = c2993l2;
                    this.f24258l = null;
                    this.f24261l = null;
                    this.f24257l = c2993l2;
                    this.f24262l = 1;
                    if (function1.invoke(this) == enumC9342l) {
                        return enumC9342l;
                    }
                    c2993l = c2993l2;
                    c2993l.m561l();
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    c2993l = c2993l2;
                    c2993l.m560l(th);
                    throw th;
                }
            default:
                InterfaceC14961l interfaceC14961l = (InterfaceC14961l) this.f24257l;
                C6806l c6806l3 = (C6806l) this.f24258l;
                int i9 = this.f24262l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                Function3 function3 = (Function3) this.f24261l;
                C3235l c3235l2 = new C3235l(interfaceC14961l, ((C16864l) obj2).f32918l);
                this.f24257l = null;
                this.f24258l = null;
                this.f24262l = 1;
                Object objInvoke5 = function3.invoke(c3235l2, c6806l3, this);
                return objInvoke5 == enumC9342l ? enumC9342l : objInvoke5;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f24260l;
        Object obj4 = this.f24259l;
        switch (i) {
            case 0:
                C12207l c12207l = new C12207l((C13046l) this.f24261l, (String) obj4, (InterfaceC14029l) obj3, 0);
                c12207l.f24257l = (C14187l) obj;
                c12207l.f24258l = (ClassLoader) obj2;
                return c12207l.Signature(Unit.INSTANCE);
            case 1:
                C12207l c12207l2 = new C12207l((Function2) obj4, (InterfaceC14029l) obj3, 1);
                c12207l2.f24258l = (InterfaceC9427l) obj;
                c12207l2.f24261l = obj2;
                return c12207l2.Signature(Unit.INSTANCE);
            case 2:
                C12207l c12207l3 = new C12207l((InterfaceC14029l) obj3, (AbstractC5563l) obj4, 2);
                c12207l3.f24258l = (InterfaceC9427l) obj;
                c12207l3.f24261l = (Object[]) obj2;
                return c12207l3.Signature(Unit.INSTANCE);
            case 3:
                C12207l c12207l4 = new C12207l((InterfaceC14029l) obj3, (AbstractC5563l) obj4, 3);
                c12207l4.f24258l = (InterfaceC9427l) obj;
                c12207l4.f24261l = (Object[]) obj2;
                return c12207l4.Signature(Unit.INSTANCE);
            case 4:
                C12207l c12207l5 = new C12207l((Function3) obj4, (InterfaceC14029l) obj3, 4);
                c12207l5.f24258l = (InterfaceC9427l) obj;
                c12207l5.f24261l = (Object[]) obj2;
                return c12207l5.Signature(Unit.INSTANCE);
            case 5:
                C12207l c12207l6 = new C12207l((List) obj4, (InterfaceC14029l) obj3, 5);
                c12207l6.f24258l = (C3235l) obj;
                c12207l6.f24261l = (C6806l) obj2;
                return c12207l6.Signature(Unit.INSTANCE);
            case 6:
                C12207l c12207l7 = new C12207l((C12825l) obj4, (InterfaceC14029l) obj3, 6);
                c12207l7.f24258l = (C6806l) obj;
                c12207l7.f24261l = (Function1) obj2;
                return c12207l7.Signature(Unit.INSTANCE);
            default:
                C12207l c12207l8 = new C12207l((Function3) this.f24261l, (C16864l) obj4, (InterfaceC14029l) obj3, 7);
                c12207l8.f24257l = (InterfaceC14961l) obj;
                c12207l8.f24258l = (C6806l) obj2;
                return c12207l8.Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12207l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f24260l = i;
        this.f24259l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12207l(InterfaceC14029l interfaceC14029l, AbstractC5563l abstractC5563l, int i) {
        super(3, interfaceC14029l);
        this.f24260l = i;
        this.f24259l = abstractC5563l;
    }
}
