package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10355l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C16248l f21146l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f21147l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f21148l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10355l(C16248l c16248l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f21147l = i;
        this.f21146l = c16248l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        InterfaceC14029l interfaceC14029l = null;
        switch (this.f21147l) {
            case 0:
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                int i = this.f21148l;
                if (i == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f21146l.loadAd();
                    C16248l c16248l = this.f21146l;
                    this.f21148l = 1;
                    C2397l c2397l = new C2397l(1, AbstractC17082l.billing(this));
                    c2397l.license();
                    synchronized (c16248l.f31801l) {
                        c16248l.f31800l = 20;
                        c16248l.f31797l = c2397l;
                        Unit unit = Unit.INSTANCE;
                    }
                    c2397l.ad(new C6238l(16, c16248l));
                    if (c2397l.Signature() == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                EnumC9342l enumC9342l2 = EnumC9342l.f19165l;
                int i2 = this.f21148l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C16248l c16248l2 = this.f21146l;
                    this.f21148l = 1;
                    c16248l2.getClass();
                    if (AbstractC15342l.admob(5000L, new C10355l(c16248l2, interfaceC14029l, 0), this) == enumC9342l2) {
                        return enumC9342l2;
                    }
                } else {
                    if (i2 != 1) {
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
        switch (this.f21147l) {
            case 0:
                return new C10355l(this.f21146l, interfaceC14029l, 0);
            default:
                return new C10355l(this.f21146l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f21147l) {
            case 0:
                break;
        }
        return ((C10355l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
