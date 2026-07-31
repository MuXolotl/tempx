package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؗ۟ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5189l {
    public final C7992l yandex;

    public AbstractC5189l(Function0 function0) {
        this.yandex = new C7992l(function0);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[PHI: r4
  0x0034: PHI (r4v2 lؓۡۙ) = (r4v6 lؓۡۙ), (r4v7 lؓۡۙ) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final InterfaceC2180l amazon(C10092l c10092l, InterfaceC2180l interfaceC2180l) {
        C3993l c3993l;
        InterfaceC2180l interfaceC2180l2;
        C3482l c3482l;
        C12508l c12508l;
        InterfaceC2180l interfaceC2180l3 = null;
        interfaceC2180l3 = null;
        interfaceC2180l3 = null;
        interfaceC2180l3 = null;
        interfaceC2180l3 = null;
        interfaceC2180l3 = null;
        if (interfaceC2180l instanceof C12508l) {
            if (c10092l.purchase) {
                c12508l = (C12508l) interfaceC2180l;
                c12508l.yandex.setValue(c10092l.yandex());
            }
        } else if (interfaceC2180l instanceof C3482l) {
            if ((c10092l.loadAd || c10092l.billing != null) && !c10092l.purchase) {
                c3482l = (C3482l) interfaceC2180l;
                if (AbstractC8576l.yandex(c10092l.yandex(), c3482l.yandex)) {
                    interfaceC2180l2 = c3993l;
                    interfaceC2180l2 = c3482l;
                    interfaceC2180l3 = interfaceC2180l2;
                }
            }
        } else if (interfaceC2180l instanceof C3993l) {
            c3993l = (C3993l) interfaceC2180l;
            if (c10092l.amazon == c3993l.yandex) {
                interfaceC2180l2 = c3993l;
                interfaceC2180l2 = c3482l;
                interfaceC2180l3 = interfaceC2180l2;
            }
        }
        if (interfaceC2180l3 != null) {
            interfaceC2180l3 = c12508l;
            return interfaceC2180l3;
        }
        if (!c10092l.purchase) {
            Function1 function1 = c10092l.amazon;
            if (function1 != null) {
                interfaceC2180l3 = c12508l;
                return new C3993l(function1);
            }
            interfaceC2180l3 = c12508l;
            return new C3482l(c10092l.yandex());
        }
        Object obj = c10092l.billing;
        InterfaceC6642l interfaceC6642l = c10092l.crashlytics;
        if (interfaceC6642l == null) {
            interfaceC2180l3 = c12508l;
            interfaceC6642l = C7472l.f15463l;
        }
        interfaceC2180l3 = c12508l;
        return new C12508l(new C10086l(obj, interfaceC6642l));
    }

    public final C10092l crashlytics(Function1 function1) {
        return new C10092l(this, null, false, null, function1, false);
    }

    public InterfaceC2180l loadAd() {
        return this.yandex;
    }

    public abstract C10092l yandex(Object obj);
}
