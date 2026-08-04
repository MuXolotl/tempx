package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍّٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9692l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0324l f19764l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f19765l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f19766l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9692l(C0324l c0324l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f19765l = i;
        this.f19764l = c0324l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f19765l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C0324l c0324l = this.f19764l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f19766l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    c0324l.subs.subscription(C11507l.f23131l);
                    this.f19766l = 1;
                    if (c0324l.yandex(this) == enumC9342l) {
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
                int i3 = this.f19766l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lIsPro = AbstractC0622l.isPro(AbstractC0622l.subs(new C9125l(c0324l.admob), 300L));
                    C9692l c9692l = new C9692l(c0324l, interfaceC14029l, 0);
                    this.f19766l = 1;
                    if (AbstractC0622l.billing(interfaceC6942lIsPro, c9692l, this) == enumC9342l) {
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
            default:
                int i4 = this.f19766l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (((Boolean) c0324l.billing.admob()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    this.f19766l = 1;
                    if (c0324l.yandex(this) == enumC9342l) {
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
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f19765l;
        C0324l c0324l = this.f19764l;
        switch (i) {
            case 0:
                return new C9692l(c0324l, interfaceC14029l, 0);
            case 1:
                return new C9692l(c0324l, interfaceC14029l, 1);
            default:
                return new C9692l(c0324l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19765l) {
            case 0:
                return ((C9692l) ads((InterfaceC14029l) obj2, (String) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C9692l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C9692l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
