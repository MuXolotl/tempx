package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1803l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5616l f4212l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f4213l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f4214l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1803l(C5616l c5616l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f4213l = i;
        this.f4212l = c5616l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f4213l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f4214l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Float f = new Float(0.0f);
                    this.f4214l = 1;
                    if (C5616l.loadAd(this.f4212l, f, null, null, null, this, 14) == enumC9342l) {
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
                int i3 = this.f4214l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Float f2 = new Float(360.0f);
                    C4165l c4165lPurchase = AbstractC0532l.purchase(AbstractC0532l.subs(4666, 2, AbstractC5341l.amazon), 1, 0L, 4);
                    this.f4214l = 1;
                    if (C5616l.loadAd(this.f4212l, f2, c4165lPurchase, null, null, this, 12) == enumC9342l) {
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
        switch (this.f4213l) {
            case 0:
                return new C1803l(this.f4212l, interfaceC14029l, 0);
            default:
                return new C1803l(this.f4212l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f4213l) {
            case 0:
                break;
        }
        return ((C1803l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
