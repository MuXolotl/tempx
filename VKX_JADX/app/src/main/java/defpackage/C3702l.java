package defpackage;

import androidx.glance.session.SessionWorker;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕۡٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3702l implements InterfaceC15745l {
    public final C4910l amazon;
    public final C4269l crashlytics;
    public final C14813l loadAd;
    public final C2319l purchase;
    public final Class yandex;

    public C3702l() {
        C14813l c14813l = new C14813l((byte) 0, 2);
        this.yandex = SessionWorker.class;
        this.loadAd = c14813l;
        this.crashlytics = C15935l.yandex;
        this.amazon = AbstractC8618l.yandex();
        this.purchase = new C2319l(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object yandex(C3702l c3702l, Function2 function2, AbstractC0283l abstractC0283l) throws Throwable {
        C16139l c16139l;
        C4910l c4910l;
        Function2 function3;
        InterfaceC1601l interfaceC1601l;
        if (abstractC0283l instanceof C16139l) {
            c16139l = (C16139l) abstractC0283l;
            int i = c16139l.f31601l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16139l.f31601l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16139l = new C16139l(c3702l, abstractC0283l);
            }
        } else {
            c16139l = new C16139l(c3702l, abstractC0283l);
        }
        Object obj = c16139l.f31597l;
        int i2 = c16139l.f31601l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                c4910l = c3702l.amazon;
                c16139l.f31600l = c3702l;
                c16139l.f31599l = (AbstractC5563l) function2;
                c16139l.f31602l = c4910l;
                c16139l.f31601l = 1;
                if (c4910l.yandex(c16139l) != enumC9342l) {
                }
                function3 = function2;
                return enumC9342l;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC1601l = (InterfaceC1601l) c16139l.f31600l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    interfaceC1601l.billing(null);
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    interfaceC1601l.billing(null);
                    throw th;
                }
            }
            C4910l c4910l2 = c16139l.f31602l;
            Function2 function4 = (Function2) c16139l.f31599l;
            C3702l c3702l2 = (C3702l) c16139l.f31600l;
            AbstractC2829l.crashlytics(obj);
            c4910l = c4910l2;
            c3702l = c3702l2;
            function3 = function4;
            function3 = function2;
            C2319l c2319l = c3702l.purchase;
            c16139l.f31600l = c4910l;
            c16139l.f31599l = null;
            c16139l.f31602l = null;
            c16139l.f31601l = 2;
            Object objInvoke = function3.invoke(c2319l, c16139l);
            if (objInvoke != enumC9342l) {
                C4910l c4910l3 = c4910l;
                obj = objInvoke;
                interfaceC1601l = c4910l3;
                interfaceC1601l.billing(null);
                return obj;
            }
            function3 = function2;
            return enumC9342l;
        } catch (Throwable th2) {
            th = th2;
            interfaceC1601l = c4910l;
            interfaceC1601l.billing(null);
            throw th;
        }
    }
}
