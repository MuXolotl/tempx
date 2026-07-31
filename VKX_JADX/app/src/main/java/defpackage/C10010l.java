package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَِؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10010l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C4456l f20404l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f20405l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20406l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10010l(C4456l c4456l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f20405l = i;
        this.f20404l = c4456l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f20405l;
        Object obj2 = EnumC9342l.f19165l;
        C4456l c4456l = this.f20404l;
        int i2 = 1;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i3 = this.f20406l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f20406l = 1;
                    int i4 = C4456l.f9065l;
                    C16552l c16552l = AbstractC11463l.yandex;
                    Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C8971l(c4456l, interfaceC14029l, i2), this);
                    if (objFirebase != obj2) {
                        objFirebase = Unit.INSTANCE;
                    }
                    if (objFirebase == obj2) {
                        return obj2;
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
                int i5 = this.f20406l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f20406l = 1;
                    int i6 = C4456l.f9065l;
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    Object objFirebase2 = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C10010l(c4456l, interfaceC14029l, 3), this);
                    if (objFirebase2 != obj2) {
                        objFirebase2 = Unit.INSTANCE;
                    }
                    if (objFirebase2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c4456l.purchase();
                return Unit.INSTANCE;
            case 2:
                int i7 = this.f20406l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC13508l interfaceC13508l = c4456l.f9075l;
                    this.f20406l = 1;
                    if (interfaceC13508l.startapp(this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c4456l.purchase();
                return Unit.INSTANCE;
            default:
                int i8 = this.f20406l;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i8 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                int i9 = C4456l.f9065l;
                c4456l.m1549synchronized(EnumC16462l.f32185l);
                InterfaceC13508l interfaceC13508l2 = c4456l.f9075l;
                boolean zBooleanValue = ((Boolean) c4456l.f9074l.getValue()).booleanValue();
                this.f20406l = 1;
                if (interfaceC13508l2.purchase(zBooleanValue, this) == obj2) {
                    return obj2;
                }
                C16552l c16552l3 = AbstractC11463l.yandex;
                C2975l c2975l = AbstractC17278l.yandex;
                C14951l c14951l = new C14951l(c4456l, interfaceC14029l, 13);
                this.f20406l = 2;
                if (AbstractC10999l.firebase(c2975l, c14951l, this) == obj2) {
                    return obj2;
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f20405l;
        C4456l c4456l = this.f20404l;
        switch (i) {
            case 0:
                return new C10010l(c4456l, interfaceC14029l, 0);
            case 1:
                return new C10010l(c4456l, interfaceC14029l, 1);
            case 2:
                return new C10010l(c4456l, interfaceC14029l, 2);
            default:
                return new C10010l(c4456l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f20405l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C10010l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
