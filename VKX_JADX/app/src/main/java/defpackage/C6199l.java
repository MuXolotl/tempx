package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙۣؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6199l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f13073l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13074l;

    public /* synthetic */ C6199l(int i, Function0 function0) {
        this.f13074l = i;
        this.f13073l = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f13074l;
        Function0 function0 = this.f13073l;
        switch (i) {
            case 0:
                ((C6148l) obj).crashlytics(((Number) function0.invoke()).floatValue());
                return Unit.INSTANCE;
            case 1:
                ((C6148l) obj).crashlytics(((Number) function0.invoke()).floatValue());
                return Unit.INSTANCE;
            case 2:
                return function0.invoke();
            case 3:
                return function0.invoke();
            case 4:
                AbstractC9361l.metrica((InterfaceC13349l) obj, ((C9735l) function0.invoke()).yandex, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
            case 5:
                function0.invoke();
                return Unit.INSTANCE;
            case 6:
                ((InterfaceC1982l) function0.invoke()).Signature(new C11827l(((C7946l) obj).yandex), false);
                return Unit.INSTANCE;
            case 7:
                function0.invoke();
                return Unit.INSTANCE;
            case 8:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return Unit.INSTANCE;
            case 9:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return Unit.INSTANCE;
            case 10:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return Unit.INSTANCE;
            case 11:
                InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj;
                Object objInvoke = function0.invoke();
                Float f = (Float) (Float.isNaN(((Number) objInvoke).floatValue()) ? null : objInvoke);
                AbstractC3668l.smaato(interfaceC17593l, new C14519l(f != null ? f.floatValue() : 0.0f, new C12015l(0.0f, 1.0f), 0));
                return Unit.INSTANCE;
            case 12:
                function0.invoke();
                return Unit.INSTANCE;
            case 13:
                return (C1187l) function0.invoke();
            case 14:
                return function0.invoke();
            case 15:
                if (((EnumC11822l) obj).loadAd()) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 16:
                return (C1187l) function0.invoke();
            default:
                InterfaceC17593l interfaceC17593l2 = (InterfaceC17593l) obj;
                Object objInvoke2 = function0.invoke();
                Float f2 = (Float) (Float.isNaN(((Number) objInvoke2).floatValue()) ? null : objInvoke2);
                float fFloatValue = f2 != null ? f2.floatValue() : 0.0f;
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                AbstractC3668l.smaato(interfaceC17593l2, new C14519l(fFloatValue, new C12015l(0.0f, 1.0f), 0));
                return Unit.INSTANCE;
        }
    }
}
