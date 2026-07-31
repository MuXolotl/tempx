package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؕٙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3469l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC9955l f7349l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f7350l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Function4 f7351l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f7352l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ AbstractC7481l f7353l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7354l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3469l(Function4 function4, InterfaceC14029l interfaceC14029l, int i) {
        super(4, interfaceC14029l);
        this.f7352l = i;
        this.f7351l = function4;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f7352l;
        Function4 function4 = this.f7351l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                C5771l c5771l = (C5771l) this.f7353l;
                InterfaceC9955l interfaceC9955l = this.f7349l;
                Object obj2 = this.f7350l;
                int i2 = this.f7354l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f7353l = null;
                    this.f7349l = null;
                    this.f7350l = null;
                    this.f7354l = 1;
                    if (((C12337l) function4).invoke(c5771l, interfaceC9955l, obj2, this) == enumC9342l) {
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
                AbstractC7481l abstractC7481l = this.f7353l;
                InterfaceC9955l interfaceC9955l2 = this.f7349l;
                Object obj3 = this.f7350l;
                int i3 = this.f7354l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f7353l = null;
                    this.f7349l = null;
                    this.f7350l = null;
                    this.f7354l = 1;
                    if (function4.invoke(abstractC7481l, interfaceC9955l2, obj3, this) == enumC9342l) {
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

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f7352l;
        Function4 function4 = this.f7351l;
        switch (i) {
            case 0:
                C3469l c3469l = new C3469l((C12337l) function4, (InterfaceC14029l) obj4, 0);
                c3469l.f7353l = (C5771l) obj;
                c3469l.f7349l = (InterfaceC9955l) obj2;
                c3469l.f7350l = obj3;
                return c3469l.Signature(Unit.INSTANCE);
            default:
                C3469l c3469l2 = new C3469l(function4, (InterfaceC14029l) obj4, 1);
                c3469l2.f7353l = (AbstractC7481l) obj;
                c3469l2.f7349l = (InterfaceC9955l) obj2;
                c3469l2.f7350l = obj3;
                return c3469l2.Signature(Unit.INSTANCE);
        }
    }
}
