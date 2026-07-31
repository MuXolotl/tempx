package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙْۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6832l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0360l f14276l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C1162l f14277l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Throwable f14278l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f14279l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f14280l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6832l(C0360l c0360l, C1162l c1162l, boolean z, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f14276l = c0360l;
        this.f14277l = c1162l;
        this.f14279l = z;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Throwable th;
        AbstractC12669l c1046l;
        int i = this.f14280l;
        C1162l c1162l = this.f14277l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i == 0) {
                AbstractC2829l.crashlytics(obj);
                C0360l c0360l = this.f14276l;
                this.f14280l = 1;
                obj = C0360l.purchase(c0360l, true, c1162l, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = this.f14278l;
                    AbstractC2829l.crashlytics(obj);
                    c1046l = new C1046l(((Number) obj).intValue(), th);
                    return new C8195l(c1046l, Boolean.TRUE);
                }
                AbstractC2829l.crashlytics(obj);
            }
            c1046l = (AbstractC12669l) obj;
        } catch (Throwable th2) {
            Boolean boolValueOf = Boolean.valueOf(this.f14279l);
            this.f14278l = th2;
            this.f14280l = 2;
            Object objInvoke = c1162l.invoke(boolValueOf, this);
            if (objInvoke != enumC9342l) {
                obj = objInvoke;
                th = th2;
            }
            return enumC9342l;
        }
        return new C8195l(c1046l, Boolean.TRUE);
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C6832l(this.f14276l, this.f14277l, this.f14279l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C6832l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
