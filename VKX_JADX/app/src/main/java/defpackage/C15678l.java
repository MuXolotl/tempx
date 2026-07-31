package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٕٔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15678l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ C4043l f30805l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ boolean f30806l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f30807l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f30808l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15678l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f30807l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f30807l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f30808l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4043l c4043l = this.f30805l;
                    if (this.f30806l) {
                        this.f30808l = 1;
                        Object objBilling = c4043l.billing(C12549l.yandex, this);
                        if (objBilling != enumC9342l) {
                            objBilling = Unit.INSTANCE;
                        }
                        if (objBilling == enumC9342l) {
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
            default:
                int i3 = this.f30808l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4043l c4043l2 = this.f30805l;
                    if (!this.f30806l) {
                        this.f30808l = 1;
                        Object objMopub = c4043l2.mopub(this);
                        return objMopub == enumC9342l ? enumC9342l : objMopub;
                    }
                } else {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C4043l c4043l = (C4043l) obj2;
        Boolean bool = (Boolean) obj3;
        switch (this.f30807l) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                C15678l c15678l = new C15678l(4, (InterfaceC14029l) obj4, 0);
                c15678l.f30805l = c4043l;
                c15678l.f30806l = zBooleanValue;
                return c15678l.Signature(Unit.INSTANCE);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                C15678l c15678l2 = new C15678l(4, (InterfaceC14029l) obj4, 1);
                c15678l2.f30805l = c4043l;
                c15678l2.f30806l = zBooleanValue2;
                return c15678l2.Signature(Unit.INSTANCE);
        }
    }
}
