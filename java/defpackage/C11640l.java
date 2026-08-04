package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11640l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f23353l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f23354l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C5866l f23355l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11640l(C5866l c5866l, int i, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f23354l = 1;
        this.f23355l = c5866l;
        this.f23353l = i;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f23354l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = 2;
        C5866l c5866l = this.f23355l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i3 = this.f23353l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C0071l c0071l = new C0071l(i2, interfaceC14029l, 5);
                    this.f23353l = 1;
                    if (c5866l.loadAd(EnumC11011l.f22182l, c0071l, this) == enumC9342l) {
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
                AbstractC2829l.crashlytics(obj);
                c5866l.firebase(this.f23353l, 0, true);
                return Unit.INSTANCE;
            default:
                int i4 = this.f23353l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
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
                C1490l c1490l = C1490l.f3731l;
                this.f23353l = 1;
                if (AbstractC1789l.purchase(c1490l, this) == enumC9342l) {
                    return enumC9342l;
                }
                this.f23353l = 2;
                if (C5866l.isPro(c5866l, 0, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f23354l) {
            case 0:
                return new C11640l(this.f23355l, interfaceC14029l, 0);
            case 1:
                return new C11640l(this.f23355l, this.f23353l, interfaceC14029l);
            default:
                return new C11640l(this.f23355l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23354l) {
            case 0:
                return ((C11640l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C11640l) ads((InterfaceC14029l) obj2, (InterfaceC1555l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C11640l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11640l(C5866l c5866l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f23354l = i;
        this.f23355l = c5866l;
    }
}
