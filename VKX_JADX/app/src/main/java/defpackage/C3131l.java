package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3131l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f6721l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ float f6722l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Object f6723l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f6724l = 0;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1555l f6725l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C13250l f6726l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f6727l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3131l(C16290l c16290l, float f, Function1 function1, InterfaceC1555l interfaceC1555l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f6723l = c16290l;
        this.f6722l = f;
        this.f6727l = function1;
        this.f6725l = interfaceC1555l;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [lؗۨٓ] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C13250l c13250l;
        C6570l c6570l;
        final C13250l c13250l2;
        Object objLoadAd;
        int i = this.f6724l;
        final int i2 = 0;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        float f = this.f6722l;
        Object obj2 = this.f6727l;
        final int i3 = 1;
        switch (i) {
            case 0:
                int i4 = this.f6721l;
                if (i4 != 0) {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c6570l = (C6570l) this.f6723l;
                    c13250l = this.f6726l;
                    try {
                        AbstractC2829l.crashlytics(obj);
                    } catch (CancellationException unused) {
                        c13250l.f26029l = ((Number) c6570l.crashlytics()).floatValue();
                    }
                    f = c13250l.f26029l;
                    break;
                } else {
                    AbstractC2829l.crashlytics(obj);
                    if (Math.abs(f) > 1.0f) {
                        C13250l c13250l3 = new C13250l();
                        c13250l3.f26029l = f;
                        C13250l c13250l4 = new C13250l();
                        C6570l c6570lYandex = AbstractC15042l.yandex(0.0f, f, 28);
                        try {
                            C1192l c1192l = (C1192l) obj2;
                            C17308l c17308l = c1192l.yandex;
                            Ctransient ctransient = new Ctransient(c13250l4, this.f6725l, c13250l3, c1192l);
                            this.f6726l = c13250l3;
                            this.f6723l = c6570lYandex;
                            this.f6721l = 1;
                            if (AbstractC18719l.purchase(c6570lYandex, c17308l, false, ctransient, this) == enumC9342l) {
                                return enumC9342l;
                            }
                            c13250l = c13250l3;
                            f = c13250l.f26029l;
                        } catch (CancellationException unused2) {
                            c13250l = c13250l3;
                            c6570l = c6570lYandex;
                            c13250l.f26029l = ((Number) c6570l.crashlytics()).floatValue();
                        }
                    }
                }
                return new Float(f);
            default:
                final Function1 function1 = (Function1) obj2;
                C16290l c16290l = (C16290l) this.f6723l;
                InterfaceC10727l interfaceC10727l = c16290l.yandex;
                int i5 = this.f6721l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    float fPurchase = interfaceC10727l.purchase(f, AbstractC6660l.yandex(c16290l.loadAd, 0.0f, f));
                    if (Float.isNaN(fPurchase)) {
                        AbstractC14825l.crashlytics("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    c13250l2 = new C13250l();
                    float fSignum = Math.signum(f) * Math.abs(fPurchase);
                    c13250l2.f26029l = fSignum;
                    function1.invoke(new Float(fSignum));
                    float f2 = c13250l2.f26029l;
                    ?? r4 = new Function1() { // from class: lؗۨٓ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i6 = i2;
                            Function1 function2 = function1;
                            C13250l c13250l5 = c13250l2;
                            float fFloatValue = ((Float) obj3).floatValue();
                            switch (i6) {
                                case 0:
                                    float f3 = c13250l5.f26029l - fFloatValue;
                                    c13250l5.f26029l = f3;
                                    function2.invoke(Float.valueOf(f3));
                                    break;
                                default:
                                    float f4 = c13250l5.f26029l - fFloatValue;
                                    c13250l5.f26029l = f4;
                                    function2.invoke(Float.valueOf(f4));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.f6726l = c13250l2;
                    this.f6721l = 1;
                    objLoadAd = C16290l.loadAd(c16290l, this.f6725l, f2, this.f6722l, r4, this);
                    if (objLoadAd != enumC9342l) {
                    }
                    return enumC9342l;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C13250l c13250l5 = this.f6726l;
                AbstractC2829l.crashlytics(obj);
                c13250l2 = c13250l5;
                objLoadAd = obj;
                C6570l c6570l2 = (C6570l) objLoadAd;
                float fIsPro = interfaceC10727l.isPro(((Number) c6570l2.crashlytics()).floatValue());
                if (Float.isNaN(fIsPro)) {
                    AbstractC14825l.crashlytics("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                c13250l2.f26029l = fIsPro;
                C6570l c6570lMetrica = AbstractC15042l.metrica(c6570l2, 0.0f, 0.0f, 30);
                InterfaceC1489l interfaceC1489l = c16290l.crashlytics;
                Function1 function2 = new Function1() { // from class: lؗۨٓ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i6 = i3;
                        Function1 function3 = function1;
                        C13250l c13250l6 = c13250l2;
                        float fFloatValue = ((Float) obj3).floatValue();
                        switch (i6) {
                            case 0:
                                float f3 = c13250l6.f26029l - fFloatValue;
                                c13250l6.f26029l = f3;
                                function3.invoke(Float.valueOf(f3));
                                break;
                            default:
                                float f4 = c13250l6.f26029l - fFloatValue;
                                c13250l6.f26029l = f4;
                                function3.invoke(Float.valueOf(f4));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.f6726l = null;
                this.f6721l = 2;
                Object objCrashlytics = AbstractC12811l.crashlytics(this.f6725l, fIsPro, fIsPro, c6570lMetrica, interfaceC1489l, function2, this);
                if (objCrashlytics != enumC9342l) {
                    return objCrashlytics;
                }
                return enumC9342l;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f6724l;
        Object obj2 = this.f6727l;
        switch (i) {
            case 0:
                InterfaceC1555l interfaceC1555l = this.f6725l;
                return new C3131l(this.f6722l, (C1192l) obj2, interfaceC1555l, interfaceC14029l);
            default:
                InterfaceC1555l interfaceC1555l2 = this.f6725l;
                return new C3131l((C16290l) this.f6723l, this.f6722l, (Function1) obj2, interfaceC1555l2, interfaceC14029l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f6724l) {
            case 0:
                break;
        }
        return ((C3131l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3131l(float f, C1192l c1192l, InterfaceC1555l interfaceC1555l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f6722l = f;
        this.f6727l = c1192l;
        this.f6725l = interfaceC1555l;
    }
}
