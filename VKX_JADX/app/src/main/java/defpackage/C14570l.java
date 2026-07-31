package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٓۧٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14570l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f28532l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f28533l = 1;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f28534l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14570l(C0360l c0360l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f28532l = c0360l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f28533l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f28534l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C0360l c0360l = (C0360l) this.f28532l;
                    this.f28534l = 1;
                    if (C0360l.crashlytics(c0360l, this) == enumC9342l) {
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
                InterfaceC14978l interfaceC14978l = (InterfaceC14978l) this.f28532l;
                int i3 = this.f28534l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                this.f28532l = null;
                this.f28534l = 1;
                Object objPurchase = interfaceC14978l.purchase(this);
                return objPurchase == enumC9342l ? enumC9342l : objPurchase;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f28533l) {
            case 0:
                return new C14570l((C0360l) this.f28532l, (InterfaceC14029l) obj3).Signature(Unit.INSTANCE);
            default:
                ((Boolean) obj2).getClass();
                C14570l c14570l = new C14570l(3, (InterfaceC14029l) obj3);
                c14570l.f28532l = (InterfaceC14978l) obj;
                return c14570l.Signature(Unit.INSTANCE);
        }
    }

    public /* synthetic */ C14570l(int i, InterfaceC14029l interfaceC14029l) {
        super(i, interfaceC14029l);
    }
}
