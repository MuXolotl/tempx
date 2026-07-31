package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؔؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C2397l extends AbstractC6691l implements InterfaceC4305l, InterfaceC1840l, InterfaceC15894l {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC12932l f5166l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC14029l f5167l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5165l = AtomicIntegerFieldUpdater.newUpdater(C2397l.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5163l = AtomicReferenceFieldUpdater.newUpdater(C2397l.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5164l = AtomicReferenceFieldUpdater.newUpdater(C2397l.class, Object.class, "_parentHandle$volatile");

    public C2397l(int i, InterfaceC14029l interfaceC14029l) {
        super(i);
        this.f5167l = interfaceC14029l;
        this.f5166l = interfaceC14029l.metrica();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C18265l.f35766l;
    }

    public static void appmetrica(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static Object m1130strictfp(InterfaceC12370l interfaceC12370l, Object obj, int i, Function3 function3) {
        if (obj instanceof C2175l) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (function3 != null || (interfaceC12370l instanceof InterfaceC11295l)) {
            return new C0782l(obj, interfaceC12370l instanceof InterfaceC11295l ? (InterfaceC11295l) interfaceC12370l : null, function3, (Throwable) null, 16);
        }
        return obj;
    }

    public final Object Signature() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC7042l interfaceC7042l;
        boolean zApplovin = applovin();
        do {
            atomicIntegerFieldUpdater = f5165l;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    C8339l.smaato("Already suspended");
                    return null;
                }
                if (zApplovin) {
                    m1133throws();
                }
                Object obj = f5163l.get(this);
                if (obj instanceof C2175l) {
                    throw ((C2175l) obj).yandex;
                }
                int i3 = this.f14041l;
                if ((i3 != 1 && i3 != 2) || (interfaceC7042l = (InterfaceC7042l) this.f5166l.mo245l(C1083l.f2996l)) == null || interfaceC7042l.mopub()) {
                    return billing(obj);
                }
                CancellationException cancellationExceptionMo2153default = interfaceC7042l.mo2153default();
                crashlytics(cancellationExceptionMo2153default);
                throw cancellationExceptionMo2153default;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC11791l) f5164l.get(this)) == null) {
            pro();
        }
        if (zApplovin) {
            m1133throws();
        }
        return EnumC9342l.f19165l;
    }

    public final void ad(Function1 function1) {
        advert(new C0667l(1, function1));
    }

    public final void adcel(AbstractC16653l abstractC16653l, Throwable th) {
        InterfaceC12932l interfaceC12932l = this.f5166l;
        int i = f5165l.get(this) & 536870911;
        if (i == 536870911) {
            C8339l.smaato("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            abstractC16653l.admob(i, interfaceC12932l);
        } catch (Throwable th2) {
            AbstractC11738l.loadAd(interfaceC12932l, new C6451l(0, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.InterfaceC1840l
    public final InterfaceC1840l admob() {
        InterfaceC14029l interfaceC14029l = this.f5167l;
        if (interfaceC14029l instanceof InterfaceC1840l) {
            return (InterfaceC1840l) interfaceC14029l;
        }
        return null;
    }

    public final void ads() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5164l;
        InterfaceC11791l interfaceC11791l = (InterfaceC11791l) atomicReferenceFieldUpdater.get(this);
        if (interfaceC11791l == null) {
            return;
        }
        interfaceC11791l.yandex();
        atomicReferenceFieldUpdater.set(this, C2114l.f4745l);
    }

    public final void advert(InterfaceC12370l interfaceC12370l) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5163l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C18265l) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, interfaceC12370l)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof InterfaceC11295l) || (obj instanceof AbstractC16653l)) {
                appmetrica(interfaceC12370l, obj);
                throw null;
            }
            if (obj instanceof C2175l) {
                C2175l c2175l = (C2175l) obj;
                if (!C2175l.loadAd.compareAndSet(c2175l, 0, 1)) {
                    appmetrica(interfaceC12370l, obj);
                    throw null;
                }
                if (obj instanceof C10763l) {
                    Throwable th = c2175l.yandex;
                    if (interfaceC12370l instanceof InterfaceC11295l) {
                        firebase((InterfaceC11295l) interfaceC12370l, th);
                        return;
                    } else {
                        adcel((AbstractC16653l) interfaceC12370l, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0782l)) {
                if (interfaceC12370l instanceof AbstractC16653l) {
                    return;
                }
                C0782l c0782l = new C0782l(obj, (InterfaceC11295l) interfaceC12370l, (Function3) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0782l)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0782l c0782l2 = (C0782l) obj;
            if (c0782l2.loadAd != null) {
                appmetrica(interfaceC12370l, obj);
                throw null;
            }
            if (interfaceC12370l instanceof AbstractC16653l) {
                return;
            }
            InterfaceC11295l interfaceC11295l = (InterfaceC11295l) interfaceC12370l;
            Throwable th2 = c0782l2.purchase;
            if (th2 != null) {
                firebase(interfaceC11295l, th2);
                return;
            }
            C0782l c0782lYandex = C0782l.yandex(c0782l2, interfaceC11295l, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0782lYandex)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    @Override // defpackage.AbstractC6691l
    public final InterfaceC14029l amazon() {
        return this.f5167l;
    }

    public final boolean applovin() {
        if (this.f14041l == 2) {
            return C16477l.f32207l.get((C16477l) this.f5167l) != null;
        }
        return false;
    }

    @Override // defpackage.AbstractC6691l
    public final Object billing(Object obj) {
        return obj instanceof C0782l ? ((C0782l) obj).yandex : obj;
    }

    @Override // defpackage.AbstractC6691l
    public final void crashlytics(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5163l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC12370l) {
                C8339l.smaato("Not completed");
                return;
            }
            if (obj instanceof C2175l) {
                return;
            }
            if (!(obj instanceof C0782l)) {
                cancellationException2 = cancellationException;
                C0782l c0782l = new C0782l(obj, (InterfaceC11295l) null, (Function3) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0782l)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0782l c0782l2 = (C0782l) obj;
            if (c0782l2.purchase != null) {
                C8339l.smaato("Must be called at most once");
                return;
            }
            C0782l c0782lYandex = C0782l.yandex(c0782l2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0782lYandex)) {
                    InterfaceC11295l interfaceC11295l = c0782l2.loadAd;
                    if (interfaceC11295l != null) {
                        firebase(interfaceC11295l, cancellationException);
                    }
                    Function3 function3 = c0782l2.crashlytics;
                    if (function3 != null) {
                        vip(function3, cancellationException, c0782l2.yandex);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    public final void firebase(InterfaceC11295l interfaceC11295l, Throwable th) {
        try {
            interfaceC11295l.yandex(th);
        } catch (Throwable th2) {
            AbstractC11738l.loadAd(this.f5166l, new C6451l(0, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public String inmobi() {
        return "CancellableContinuation";
    }

    @Override // defpackage.AbstractC6691l
    public final Object isPro() {
        return f5163l.get(this);
    }

    public final boolean isVip() {
        return f5163l.get(this) instanceof InterfaceC12370l;
    }

    public final void license() {
        InterfaceC11791l interfaceC11791lPro = pro();
        if (interfaceC11791lPro != null && premium()) {
            interfaceC11791lPro.yandex();
            f5164l.set(this, C2114l.f4745l);
        }
    }

    @Override // defpackage.InterfaceC15894l
    public final void loadAd(AbstractC16653l abstractC16653l, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f5165l;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                C8339l.smaato("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        advert(abstractC16653l);
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        return this.f5166l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m1131package(Object obj, int i, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5163l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC12370l)) {
                if (obj2 instanceof C10763l) {
                    C10763l c10763l = (C10763l) obj2;
                    if (C10763l.crashlytics.compareAndSet(c10763l, 0, 1)) {
                        if (function3 != null) {
                            vip(function3, c10763l.yandex, obj);
                            return;
                        }
                        return;
                    }
                }
                C17132l.metrica(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objM1130strictfp = m1130strictfp((InterfaceC12370l) obj2, obj, i, function3);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM1130strictfp)) {
                    if (!applovin()) {
                        ads();
                    }
                    subscription(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final boolean premium() {
        return !(f5163l.get(this) instanceof InterfaceC12370l);
    }

    public final InterfaceC11791l pro() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC7042l interfaceC7042l = (InterfaceC7042l) this.f5166l.mo245l(C1083l.f2996l);
        if (interfaceC7042l == null) {
            return null;
        }
        InterfaceC11791l interfaceC11791lSubs = AbstractC11174l.subs(interfaceC7042l, true, new C13039l(this, 0));
        do {
            atomicReferenceFieldUpdater = f5164l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC11791lSubs)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC11791lSubs;
    }

    @Override // defpackage.AbstractC6691l
    public final Throwable purchase(Object obj) {
        Throwable thPurchase = super.purchase(obj);
        if (thPurchase != null) {
            return thPurchase;
        }
        return null;
    }

    @Override // defpackage.InterfaceC4305l
    public final void remoteconfig(Object obj, Function3 function3) {
        m1131package(obj, this.f14041l, function3);
    }

    public final boolean signatures() {
        return f5163l.get(this) instanceof C10763l;
    }

    @Override // defpackage.InterfaceC4305l
    public final C9676l smaato(Object obj, Function3 function3) {
        return m1134volatile(obj, function3);
    }

    @Override // defpackage.InterfaceC4305l
    public final void startapp(Object obj) {
        subscription(this.f14041l);
    }

    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        Throwable thYandex = C1171l.yandex(obj);
        if (thYandex != null) {
            obj = new C2175l(thYandex, false);
        }
        m1131package(obj, this.f14041l, null);
    }

    public final void subscription(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f5165l;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    C8339l.smaato("Already resumed");
                    return;
                }
                boolean z = i == 4;
                InterfaceC14029l interfaceC14029l = this.f5167l;
                if (!z && (interfaceC14029l instanceof C16477l)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f14041l;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C16477l c16477l = (C16477l) interfaceC14029l;
                        AbstractC1872l abstractC1872l = c16477l.f32210l;
                        InterfaceC12932l interfaceC12932lMetrica = c16477l.f32209l.metrica();
                        if (AbstractC9853l.crashlytics(abstractC1872l, interfaceC12932lMetrica)) {
                            AbstractC9853l.loadAd(abstractC1872l, interfaceC12932lMetrica, this);
                            return;
                        }
                        AbstractC14868l abstractC14868lYandex = AbstractC12706l.yandex();
                        if (abstractC14868lYandex.f29099l >= 4294967296L) {
                            abstractC14868lYandex.m3899l(this);
                            return;
                        }
                        abstractC14868lYandex.m3898l(true);
                        try {
                            AbstractC12446l.billing(this, interfaceC14029l, true);
                            do {
                            } while (abstractC14868lYandex.m3901l());
                        } catch (Throwable th) {
                            try {
                                mopub(th);
                            } finally {
                                abstractC14868lYandex.m3900l(true);
                            }
                        }
                        return;
                    }
                }
                AbstractC12446l.billing(this, interfaceC14029l, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m1132synchronized(AbstractC1872l abstractC1872l, Unit unit) {
        InterfaceC14029l interfaceC14029l = this.f5167l;
        C16477l c16477l = interfaceC14029l instanceof C16477l ? (C16477l) interfaceC14029l : null;
        m1131package(unit, (c16477l != null ? c16477l.f32210l : null) == abstractC1872l ? 4 : this.f14041l, null);
    }

    public Throwable tapsense(C14750l c14750l) {
        return c14750l.mo2153default();
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m1133throws() {
        InterfaceC14029l interfaceC14029l = this.f5167l;
        Throwable th = null;
        C16477l c16477l = interfaceC14029l instanceof C16477l ? (C16477l) interfaceC14029l : null;
        if (c16477l != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C16477l.f32207l;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c16477l);
                C9676l c9676l = AbstractC9853l.loadAd;
                if (obj != c9676l) {
                    if (!(obj instanceof Throwable)) {
                        C17132l.metrica(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c16477l, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c16477l) != obj) {
                            C8339l.metrica("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c16477l, c9676l, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c16477l) == c9676l);
            }
            if (th == null) {
                return;
            }
            ads();
            yandex(th);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(inmobi());
        sb.append('(');
        sb.append(AbstractC17549l.mopub(this.f5167l));
        sb.append("){");
        Object obj = f5163l.get(this);
        if (obj instanceof InterfaceC12370l) {
            str = "Active";
        } else {
            str = obj instanceof C10763l ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC17549l.purchase(this));
        return sb.toString();
    }

    public final void vip(Function3 function3, Throwable th, Object obj) {
        InterfaceC12932l interfaceC12932l = this.f5166l;
        try {
            function3.invoke(th, obj, interfaceC12932l);
        } catch (Throwable th2) {
            AbstractC11738l.loadAd(interfaceC12932l, new C6451l(0, "Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final C9676l m1134volatile(Object obj, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5163l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC12370l)) {
                return null;
            }
            Object objM1130strictfp = m1130strictfp((InterfaceC12370l) obj2, obj, this.f14041l, function3);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM1130strictfp)) {
                    boolean zApplovin = applovin();
                    C9676l c9676l = AbstractC3421l.yandex;
                    if (!zApplovin) {
                        ads();
                    }
                    return c9676l;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // defpackage.InterfaceC4305l
    public final boolean yandex(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5163l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC12370l)) {
                return false;
            }
            boolean z = (obj instanceof InterfaceC11295l) || (obj instanceof AbstractC16653l);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C10763l c10763l = new C10763l(cancellationException, z);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c10763l)) {
                    InterfaceC12370l interfaceC12370l = (InterfaceC12370l) obj;
                    if (interfaceC12370l instanceof InterfaceC11295l) {
                        firebase((InterfaceC11295l) obj, th);
                    } else if (interfaceC12370l instanceof AbstractC16653l) {
                        adcel((AbstractC16653l) obj, th);
                    }
                    if (!applovin()) {
                        ads();
                    }
                    subscription(this.f14041l);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }
}
