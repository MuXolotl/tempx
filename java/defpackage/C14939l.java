package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٔٗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14939l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ long f29403l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f29404l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f29405l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f29406l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ float f29407l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ C1304l f29408l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f29409l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14939l(boolean z, float f, InterfaceC8714l interfaceC8714l, InterfaceC12244l interfaceC12244l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f29404l = z;
        this.f29407l = f;
        this.f29405l = interfaceC8714l;
        this.f29409l = interfaceC12244l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        float fIntBitsToFloat;
        int i = this.f29406l;
        InterfaceC8714l interfaceC8714l = this.f29405l;
        try {
            if (i == 0) {
                AbstractC2829l.crashlytics(obj);
                C1304l c1304l = this.f29408l;
                long j = this.f29403l;
                if (this.f29404l) {
                    fIntBitsToFloat = this.f29407l - Float.intBitsToFloat((int) (j >> 32));
                } else {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                }
                interfaceC8714l.setValue(new Float(fIntBitsToFloat - ((Number) this.f29409l.getValue()).floatValue()));
                this.f29406l = 1;
                Object objYandex = c1304l.yandex(this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
        } catch (C10528l unused) {
            interfaceC8714l.setValue(new Float(0.0f));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C1187l) obj2).yandex;
        InterfaceC8714l interfaceC8714l = this.f29405l;
        InterfaceC12244l interfaceC12244l = this.f29409l;
        C14939l c14939l = new C14939l(this.f29404l, this.f29407l, interfaceC8714l, interfaceC12244l, (InterfaceC14029l) obj3);
        c14939l.f29408l = (C1304l) obj;
        c14939l.f29403l = j;
        return c14939l.Signature(Unit.INSTANCE);
    }
}
