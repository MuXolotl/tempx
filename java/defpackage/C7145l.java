package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7145l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ float f14959l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f14960l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f14961l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f14962l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7145l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f14961l = i;
        this.f14960l = obj;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f14961l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj2 = this.f14960l;
        switch (i) {
            case 0:
                InterfaceC3102l interfaceC3102l = ((C10809l) obj2).smaato;
                int i2 = this.f14962l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    float f = this.f14959l;
                    C6935l c6935lYandex = interfaceC3102l.yandex();
                    C17308l c17308lCrashlytics = interfaceC3102l.crashlytics();
                    InterfaceC1489l interfaceC1489lAmazon = interfaceC3102l.amazon();
                    this.f14962l = 1;
                    if (AbstractC18079l.mopub(c6935lYandex, f, c17308lCrashlytics, interfaceC1489lAmazon, this) == enumC9342l) {
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
                InterfaceC3102l interfaceC3102l2 = ((C15351l) obj2).ads;
                int i3 = this.f14962l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    float f2 = this.f14959l;
                    C6935l c6935lYandex2 = interfaceC3102l2.yandex();
                    C17308l c17308lCrashlytics2 = interfaceC3102l2.crashlytics();
                    InterfaceC1489l interfaceC1489lAmazon2 = interfaceC3102l2.amazon();
                    this.f14962l = 1;
                    if (AbstractC18079l.mopub(c6935lYandex2, f2, c17308lCrashlytics2, interfaceC1489lAmazon2, this) == enumC9342l) {
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

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f14961l;
        Object obj4 = this.f14960l;
        float fFloatValue = ((Number) obj2).floatValue();
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
        switch (i) {
            case 0:
                C7145l c7145l = new C7145l((C10809l) obj4, interfaceC14029l, 0);
                c7145l.f14959l = fFloatValue;
                return c7145l.Signature(Unit.INSTANCE);
            default:
                C7145l c7145l2 = new C7145l((C15351l) obj4, interfaceC14029l, 1);
                c7145l2.f14959l = fFloatValue;
                return c7145l2.Signature(Unit.INSTANCE);
        }
    }
}
