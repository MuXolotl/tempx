package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًؕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7785l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C6206l f16310l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f16311l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f16312l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7785l(C6206l c6206l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f16311l = i;
        this.f16310l = c6206l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f16311l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C6206l c6206l = this.f16310l;
        switch (i) {
            case 0:
                int i2 = this.f16312l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    long jLoadAd = ((InterfaceC3114l) AbstractC13402l.loadAd(c6206l, AbstractC4751l.tapsense)).loadAd();
                    this.f16312l = 1;
                    if (AbstractC8532l.purchase(jLoadAd, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                Function0 function0 = c6206l.f13106l;
                if (function0 != null) {
                    function0.invoke();
                }
                if (c6206l.f13100l) {
                    ((C9421l) ((InterfaceC1234l) AbstractC13402l.loadAd(c6206l, AbstractC4751l.smaato))).yandex(0);
                }
                c6206l.f13102l = true;
                C7504l c7504l = c6206l.f13112l;
                if (c7504l != null) {
                    c7504l.ads(null);
                }
                c6206l.f13112l = null;
                c6206l.f13108l = null;
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f16312l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    long jLoadAd2 = ((InterfaceC3114l) AbstractC13402l.loadAd(c6206l, AbstractC4751l.tapsense)).loadAd();
                    this.f16312l = 1;
                    if (AbstractC8532l.purchase(jLoadAd2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                Function0 function1 = c6206l.f13106l;
                if (function1 != null) {
                    function1.invoke();
                }
                if (c6206l.f13100l) {
                    ((C9421l) ((InterfaceC1234l) AbstractC13402l.loadAd(c6206l, AbstractC4751l.smaato))).yandex(0);
                }
                c6206l.f13109l = true;
                C7504l c7504l2 = c6206l.f13111l;
                if (c7504l2 != null) {
                    c7504l2.ads(null);
                }
                c6206l.f13111l = null;
                c6206l.f13103l = null;
                return Unit.INSTANCE;
            default:
                int i4 = this.f16312l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    long jLoadAd3 = ((InterfaceC3114l) AbstractC13402l.loadAd(c6206l, AbstractC4751l.tapsense)).loadAd();
                    this.f16312l = 1;
                    if (AbstractC8532l.purchase(jLoadAd3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                Function0 function2 = c6206l.f13106l;
                if (function2 != null) {
                    function2.invoke();
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f16311l;
        C6206l c6206l = this.f16310l;
        switch (i) {
            case 0:
                return new C7785l(c6206l, interfaceC14029l, 0);
            case 1:
                return new C7785l(c6206l, interfaceC14029l, 1);
            default:
                return new C7785l(c6206l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f16311l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C7785l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
