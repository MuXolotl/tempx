package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ٛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18030l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC14569l f35310l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C12951l f35311l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f35312l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f35313l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18030l(AbstractC14569l abstractC14569l, C12951l c12951l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f35312l = i;
        this.f35310l = abstractC14569l;
        this.f35311l = c12951l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f35312l;
        C12951l c12951l = this.f35311l;
        AbstractC14569l abstractC14569l = this.f35310l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f35313l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C2403l c2403l = abstractC14569l.f28520l;
                    if (c2403l != null) {
                        C10129l c10129l = new C10129l(c12951l);
                        this.f35313l = 1;
                        if (c2403l.yandex(c10129l, this) == enumC9342l) {
                            return enumC9342l;
                        }
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
                int i3 = this.f35313l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C2403l c2403l2 = abstractC14569l.f28520l;
                    if (c2403l2 != null) {
                        C10129l c10129l2 = new C10129l(c12951l);
                        this.f35313l = 1;
                        if (c2403l2.yandex(c10129l2, this) == enumC9342l) {
                            return enumC9342l;
                        }
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
                int i4 = this.f35313l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C2403l c2403l3 = abstractC14569l.f28520l;
                    if (c2403l3 != null) {
                        this.f35313l = 1;
                        if (c2403l3.yandex(c12951l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i5 = this.f35313l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C2403l c2403l4 = abstractC14569l.f28520l;
                    if (c2403l4 != null) {
                        C3426l c3426l = new C3426l(c12951l);
                        this.f35313l = 1;
                        if (c2403l4.yandex(c3426l, this) == enumC9342l) {
                            return enumC9342l;
                        }
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

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f35312l;
        C12951l c12951l = this.f35311l;
        AbstractC14569l abstractC14569l = this.f35310l;
        switch (i) {
            case 0:
                return new C18030l(abstractC14569l, c12951l, interfaceC14029l, 0);
            case 1:
                return new C18030l(abstractC14569l, c12951l, interfaceC14029l, 1);
            case 2:
                return new C18030l(abstractC14569l, c12951l, interfaceC14029l, 2);
            default:
                return new C18030l(abstractC14569l, c12951l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f35312l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C18030l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
