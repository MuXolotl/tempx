package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍِٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16290l implements InterfaceC14745l {
    public final InterfaceC1489l crashlytics;
    public final C17308l loadAd;
    public final InterfaceC10727l yandex;

    public C16290l(InterfaceC10727l interfaceC10727l, C17308l c17308l, InterfaceC1489l interfaceC1489l) {
        this.yandex = interfaceC10727l;
        this.loadAd = c17308l;
        this.crashlytics = interfaceC1489l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object loadAd(C16290l c16290l, InterfaceC1555l interfaceC1555l, float f, float f2, C5317l c5317l, AbstractC0283l abstractC0283l) {
        C13597l c13597l;
        InterfaceC15838l c10975l;
        if (abstractC0283l instanceof C13597l) {
            c13597l = (C13597l) abstractC0283l;
            int i = c13597l.f26618l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13597l.f26618l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13597l = new C13597l(c16290l, abstractC0283l);
            }
        } else {
            c13597l = new C13597l(c16290l, abstractC0283l);
        }
        C13597l c13597l2 = c13597l;
        Object objRemoteconfig = c13597l2.f26617l;
        int i2 = c13597l2.f26618l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objRemoteconfig);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return AbstractC15042l.yandex(f, f2, 28);
            }
            c13597l2.f26618l = 1;
            C17308l c17308l = c16290l.loadAd;
            if (Math.abs(AbstractC6660l.yandex(c17308l, 0.0f, f2)) >= Math.abs(f)) {
                c10975l = new C13161l(c17308l);
            } else {
                c10975l = new C10975l(27, c16290l.crashlytics);
            }
            objRemoteconfig = c10975l.remoteconfig(interfaceC1555l, new Float(f), new Float(f2), c5317l, c13597l2);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objRemoteconfig == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objRemoteconfig);
        }
        return ((C16483l) objRemoteconfig).loadAd;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(InterfaceC1555l interfaceC1555l, float f, Function1 function1, AbstractC0283l abstractC0283l) throws Throwable {
        C18481l c18481l;
        if (abstractC0283l instanceof C18481l) {
            c18481l = (C18481l) abstractC0283l;
            int i = c18481l.f36092l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18481l.f36092l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18481l = new C18481l(this, abstractC0283l);
            }
        } else {
            c18481l = new C18481l(this, abstractC0283l);
        }
        Object objCrashlytics = c18481l.f36091l;
        int i2 = c18481l.f36092l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            c18481l.f36092l = 1;
            objCrashlytics = crashlytics(interfaceC1555l, f, function1, c18481l);
            Object obj = EnumC9342l.f19165l;
            if (objCrashlytics == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objCrashlytics);
        }
        C16483l c16483l = (C16483l) objCrashlytics;
        return new Float(c16483l.yandex.floatValue() != 0.0f ? ((Number) c16483l.loadAd.crashlytics()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(InterfaceC1555l interfaceC1555l, float f, Function1 function1, AbstractC0283l abstractC0283l) throws Throwable {
        C12622l c12622l;
        Function1 function2;
        if (abstractC0283l instanceof C12622l) {
            c12622l = (C12622l) abstractC0283l;
            int i = c12622l.f24845l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12622l.f24845l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12622l = new C12622l(this, abstractC0283l);
            }
        } else {
            c12622l = new C12622l(this, abstractC0283l);
        }
        Object objFirebase = c12622l.f24846l;
        int i2 = c12622l.f24845l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            C3131l c3131l = new C3131l(this, f, function1, interfaceC1555l, null);
            c12622l.f24847l = function1;
            c12622l.f24845l = 1;
            objFirebase = AbstractC10999l.firebase(AbstractC13611l.crashlytics, c3131l, c12622l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
            function2 = function1;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function2 = c12622l.f24847l;
            AbstractC2829l.crashlytics(objFirebase);
        }
        C16483l c16483l = (C16483l) objFirebase;
        function2.invoke(new Float(0.0f));
        return c16483l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16290l)) {
            return false;
        }
        C16290l c16290l = (C16290l) obj;
        return AbstractC8576l.yandex(c16290l.crashlytics, this.crashlytics) && AbstractC8576l.yandex(c16290l.loadAd, this.loadAd) && c16290l.yandex.equals(this.yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() + ((this.loadAd.hashCode() + (this.crashlytics.hashCode() * 31)) * 31);
    }

    @Override // defpackage.InterfaceC14745l
    public final Object yandex(InterfaceC1555l interfaceC1555l, float f, InterfaceC14029l interfaceC14029l) {
        return amazon(interfaceC1555l, f, AbstractC16840l.yandex, (AbstractC0283l) interfaceC14029l);
    }
}
