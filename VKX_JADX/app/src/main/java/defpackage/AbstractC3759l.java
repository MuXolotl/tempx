package defpackage;

import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؕۥؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3759l {
    public static final /* synthetic */ int yandex = 0;

    static {
        C3498l.purchase("value");
    }

    public static final void admob(InterfaceC11865l interfaceC11865l) {
        if (interfaceC11865l.mo2272switch(AbstractC11278l.yandex) == null) {
            return;
        }
        C18725l.loadAd();
    }

    public static final InterfaceC17477l amazon(InterfaceC1910l interfaceC1910l) {
        InterfaceC15234l interfaceC15234lPro = interfaceC1910l.yandex().mo1339native().pro();
        if (interfaceC15234lPro instanceof InterfaceC17477l) {
            return (InterfaceC17477l) interfaceC15234lPro;
        }
        return null;
    }

    public static final C3624l billing(InterfaceC15234l interfaceC15234l) {
        InterfaceC8371l interfaceC8371lSignature;
        C3624l c3624lBilling;
        if (interfaceC15234l == null || (interfaceC8371lSignature = interfaceC15234l.Signature()) == null) {
            return null;
        }
        if (interfaceC8371lSignature instanceof InterfaceC9921l) {
            return new C3624l(((AbstractC3740l) ((InterfaceC9921l) interfaceC8371lSignature)).f7826l, interfaceC15234l.getName());
        }
        if (!(interfaceC8371lSignature instanceof InterfaceC10607l) || (c3624lBilling = billing((InterfaceC15234l) interfaceC8371lSignature)) == null) {
            return null;
        }
        return c3624lBilling.amazon(interfaceC15234l.getName());
    }

    public static final C2312l crashlytics(InterfaceC10233l interfaceC10233l) {
        C16781l c16781lBilling = AbstractC11125l.billing(interfaceC10233l);
        if (!c16781lBilling.amazon()) {
            c16781lBilling = null;
        }
        if (c16781lBilling != null) {
            return c16781lBilling.subs();
        }
        return null;
    }

    public static InterfaceC0207l loadAd(InterfaceC0207l interfaceC0207l, Function1 function1) {
        return (InterfaceC0207l) AbstractC3739l.crashlytics(Collections.singletonList(interfaceC0207l), new C15617l((byte) 0, 29), new C1470l(new C10700l(), function1));
    }

    public static final C2312l mopub(InterfaceC8371l interfaceC8371l) {
        C2312l c2312lMopub = AbstractC11125l.mopub(interfaceC8371l);
        return c2312lMopub != null ? c2312lMopub : AbstractC11125l.billing(interfaceC8371l.Signature()).yandex(interfaceC8371l.getName()).subs();
    }

    public static final AbstractC16860l purchase(InterfaceC8371l interfaceC8371l) {
        return AbstractC11125l.crashlytics(interfaceC8371l).subs();
    }

    public static final InterfaceC0207l subs(InterfaceC0207l interfaceC0207l) {
        return interfaceC0207l instanceof InterfaceC10138l ? ((AbstractC4042l) ((InterfaceC10138l) interfaceC0207l)).m1477l() : interfaceC0207l;
    }

    public static final boolean yandex(C17538l c17538l) {
        return AbstractC3739l.purchase(Collections.singletonList(c17538l), C1461l.f3662l, C13876l.f27148l).booleanValue();
    }
}
