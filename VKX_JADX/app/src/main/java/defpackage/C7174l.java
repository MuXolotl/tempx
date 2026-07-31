package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَؚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7174l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C13220l f15009l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f15010l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f15011l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7174l(C13220l c13220l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f15010l = i;
        this.f15009l = c13220l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f15010l;
        C13220l c13220l = this.f15009l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f15011l;
                if (i2 != 0) {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC2829l.crashlytics(obj);
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C1008l c1008l = c13220l.f25999l;
                C7226l c7226l = new C7226l(c13220l, interfaceC14029l, 18);
                this.f15011l = 1;
                if (AbstractC0622l.billing(c1008l, c7226l, this) == enumC9342l) {
                    return enumC9342l;
                }
                C8339l.smaato("SharedFlow never completes, this call should never return.");
                return null;
            default:
                int i3 = this.f15011l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5268l c5268l = c13220l.f34614l;
                    C7174l c7174l = new C7174l(c13220l, interfaceC14029l, 0);
                    this.f15011l = 1;
                    if (AbstractC9843l.isPro(c5268l, EnumC8981l.f18520l, c7174l, this) == enumC9342l) {
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
        int i = this.f15010l;
        C13220l c13220l = this.f15009l;
        switch (i) {
            case 0:
                return new C7174l(c13220l, interfaceC14029l, 0);
            default:
                return new C7174l(c13220l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f15010l) {
            case 0:
                ((C7174l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
                return EnumC9342l.f19165l;
            default:
                return ((C7174l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
        }
    }
}
