package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C14750l implements InterfaceC7042l {
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28822l = AtomicReferenceFieldUpdater.newUpdater(C14750l.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28821l = AtomicReferenceFieldUpdater.newUpdater(C14750l.class, Object.class, "_parentHandle$volatile");

    public C14750l(boolean z) {
        this._state$volatile = z ? AbstractC7114l.mopub : AbstractC7114l.billing;
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public static String m3874implements(Object obj) {
        if (!(obj instanceof C2073l)) {
            if (obj instanceof InterfaceC2541l) {
                return ((InterfaceC2541l) obj).mopub() ? "Active" : "New";
            }
            return obj instanceof C2175l ? "Cancelled" : "Completed";
        }
        C2073l c2073l = (C2073l) obj;
        if (c2073l.amazon()) {
            return "Cancelling";
        }
        return C2073l.f4649l.get(c2073l) == 1 ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static C10157l m3875public(C17559l c17559l) {
        while (c17559l.admob()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C17559l.f34184l;
            C17559l c17559lAmazon = c17559l.amazon();
            if (c17559lAmazon == null) {
                Object obj = atomicReferenceFieldUpdater.get(c17559l);
                while (true) {
                    c17559l = (C17559l) obj;
                    if (!c17559l.admob()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c17559l);
                }
            } else {
                c17559l = c17559lAmazon;
            }
        }
        while (true) {
            c17559l = c17559l.billing();
            if (!c17559l.admob()) {
                if (c17559l instanceof C10157l) {
                    return (C10157l) c17559l;
                }
                if (c17559l instanceof C1038l) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: abstract */
    public String mo1268abstract() {
        return getClass().getSimpleName();
    }

    public void ad(Throwable th) {
        pro(th);
    }

    @Override // defpackage.InterfaceC7042l
    public void ads(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0390l(premium(), null, this);
        }
        ad(cancellationException);
    }

    public final boolean advert(Throwable th) {
        if (mo3846final()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC4367l interfaceC4367l = (InterfaceC4367l) f28821l.get(this);
        if (interfaceC4367l == null || interfaceC4367l == C2114l.f4745l) {
            return z;
        }
        return interfaceC4367l.isVip(th) || z;
    }

    public boolean applovin(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return pro(th) && mo559for();
    }

    public final void appmetrica(InterfaceC2541l interfaceC2541l, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28821l;
        InterfaceC4367l interfaceC4367l = (InterfaceC4367l) atomicReferenceFieldUpdater.get(this);
        if (interfaceC4367l != null) {
            interfaceC4367l.yandex();
            atomicReferenceFieldUpdater.set(this, C2114l.f4745l);
        }
        C6451l c6451l = null;
        C2175l c2175l = obj instanceof C2175l ? (C2175l) obj : null;
        Throwable th = c2175l != null ? c2175l.yandex : null;
        if (interfaceC2541l instanceof AbstractC7581l) {
            try {
                ((AbstractC7581l) interfaceC2541l).isPro(th);
                return;
            } catch (Throwable th2) {
                mo3750class(new C6451l(0, "Exception in completion handler " + interfaceC2541l + " for " + this, th2));
                return;
            }
        }
        C1038l c1038lLoadAd = interfaceC2541l.loadAd();
        if (c1038lLoadAd != null) {
            c1038lLoadAd.crashlytics(new C5324l(1), 1);
            for (C17559l c17559lBilling = (C17559l) C17559l.f34185l.get(c1038lLoadAd); !AbstractC8576l.yandex(c17559lBilling, c1038lLoadAd); c17559lBilling = c17559lBilling.billing()) {
                if (c17559lBilling instanceof AbstractC7581l) {
                    try {
                        ((AbstractC7581l) c17559lBilling).isPro(th);
                    } catch (Throwable th3) {
                        if (c6451l != null) {
                            AbstractC11718l.yandex(c6451l, th3);
                        } else {
                            c6451l = new C6451l(0, "Exception in completion handler " + c17559lBilling + " for " + this, th3);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
            }
            if (c6451l != null) {
                mo3750class(c6451l);
            }
        }
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void m3876break(C18124l c18124l) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1038l c1038l = new C1038l();
        Object c18255l = c1038l;
        if (!c18124l.f35413l) {
            c18255l = new C18255l(c1038l);
        }
        do {
            atomicReferenceFieldUpdater = f28822l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c18124l, c18255l)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c18124l);
    }

    /* JADX INFO: renamed from: case */
    public boolean mo2189case(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: catch */
    public boolean mo558catch() {
        return this instanceof C9426l;
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final Object m3877const(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC2541l)) {
            return AbstractC7114l.yandex;
        }
        if (((obj instanceof C18124l) || (obj instanceof AbstractC7581l)) && !(obj instanceof C10157l) && !(obj2 instanceof C2175l)) {
            InterfaceC2541l interfaceC2541l = (InterfaceC2541l) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28822l;
            Object c13133l = obj2 instanceof InterfaceC2541l ? new C13133l((InterfaceC2541l) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2541l, c13133l)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC2541l) {
                    return AbstractC7114l.crashlytics;
                }
            }
            mo3752this(obj2);
            appmetrica(interfaceC2541l, obj2);
            return obj2;
        }
        InterfaceC2541l interfaceC2541l2 = (InterfaceC2541l) obj;
        C1038l c1038lM3878else = m3878else(interfaceC2541l2);
        if (c1038lM3878else == null) {
            return AbstractC7114l.crashlytics;
        }
        C2073l c2073l = interfaceC2541l2 instanceof C2073l ? (C2073l) interfaceC2541l2 : null;
        if (c2073l == null) {
            c2073l = new C2073l(c1038lM3878else, null);
        }
        synchronized (c2073l) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2073l.f4649l;
            if (atomicIntegerFieldUpdater.get(c2073l) == 1) {
                return AbstractC7114l.yandex;
            }
            atomicIntegerFieldUpdater.set(c2073l, 1);
            if (c2073l != interfaceC2541l2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28822l;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC2541l2, c2073l)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC2541l2) {
                        return AbstractC7114l.crashlytics;
                    }
                }
            }
            boolean zAmazon = c2073l.amazon();
            C2175l c2175l = obj2 instanceof C2175l ? (C2175l) obj2 : null;
            if (c2175l != null) {
                c2073l.yandex(c2175l.yandex);
            }
            Throwable thCrashlytics = zAmazon ? null : c2073l.crashlytics();
            Unit unit = Unit.INSTANCE;
            if (thCrashlytics != null) {
                m3880finally(c1038lM3878else, thCrashlytics);
            }
            C10157l c10157lM3875public = m3875public(c1038lM3878else);
            if (c10157lM3875public != null && m3887return(c2073l, c10157lM3875public, obj2)) {
                return AbstractC7114l.loadAd;
            }
            c1038lM3878else.crashlytics(new C5324l(2), 2);
            C10157l c10157lM3875public2 = m3875public(c1038lM3878else);
            return (c10157lM3875public2 == null || !m3887return(c2073l, c10157lM3875public2, obj2)) ? m3889strictfp(c2073l, obj2) : AbstractC7114l.loadAd;
        }
    }

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: default */
    public final CancellationException mo2153default() {
        CancellationException cancellationException;
        Object obj = f28822l.get(this);
        if (obj instanceof C2073l) {
            Throwable thCrashlytics = ((C2073l) obj).crashlytics();
            if (thCrashlytics == null) {
                C17132l.metrica(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thCrashlytics instanceof CancellationException ? (CancellationException) thCrashlytics : null;
            return cancellationException == null ? new C0390l(strConcat, thCrashlytics, this) : cancellationException;
        }
        if (obj instanceof InterfaceC2541l) {
            C17132l.metrica(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof C2175l)) {
            return new C0390l(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((C2175l) obj).yandex;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new C0390l(premium(), th, this) : cancellationException;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final C1038l m3878else(InterfaceC2541l interfaceC2541l) {
        C1038l c1038lLoadAd = interfaceC2541l.loadAd();
        if (c1038lLoadAd != null) {
            return c1038lLoadAd;
        }
        if (interfaceC2541l instanceof C18124l) {
            return new C1038l();
        }
        if (interfaceC2541l instanceof AbstractC7581l) {
            m3891transient((AbstractC7581l) interfaceC2541l);
            return null;
        }
        C17132l.metrica(interfaceC2541l, "State should have list: ");
        return null;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final Throwable m3879extends(C2073l c2073l, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c2073l.amazon()) {
                return new C0390l(premium(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof C14749l) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof C14749l)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX INFO: renamed from: final */
    public boolean mo3846final() {
        return this instanceof C17903l;
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m3880finally(C1038l c1038l, Throwable th) {
        c1038l.crashlytics(new C5324l(4), 4);
        C6451l c6451l = null;
        for (C17559l c17559lBilling = (C17559l) C17559l.f34185l.get(c1038l); !AbstractC8576l.yandex(c17559lBilling, c1038l); c17559lBilling = c17559lBilling.billing()) {
            if ((c17559lBilling instanceof AbstractC7581l) && ((AbstractC7581l) c17559lBilling).subs()) {
                try {
                    ((AbstractC7581l) c17559lBilling).isPro(th);
                } catch (Throwable th2) {
                    if (c6451l != null) {
                        AbstractC11718l.yandex(c6451l, th2);
                    } else {
                        c6451l = new C6451l(0, "Exception in completion handler " + c17559lBilling + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (c6451l != null) {
            mo3750class(c6451l);
        }
        advert(th);
    }

    public final Object firebase(InterfaceC14029l interfaceC14029l) {
        Object obj;
        do {
            obj = f28822l.get(this);
            if (!(obj instanceof InterfaceC2541l)) {
                if (obj instanceof C2175l) {
                    throw ((C2175l) obj).yandex;
                }
                return AbstractC7114l.yandex(obj);
            }
        } while (m3886protected(obj) < 0);
        C15431l c15431l = new C15431l(AbstractC17082l.billing(interfaceC14029l), this);
        c15431l.license();
        int i = 2;
        c15431l.advert(new C0667l(i, AbstractC11174l.subs(this, true, new C13288l(i, c15431l))));
        return c15431l.Signature();
    }

    /* JADX INFO: renamed from: for */
    public boolean mo559for() {
        return true;
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        return C1083l.f2996l;
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final Object m3881goto(Object obj) {
        Object objM3877const;
        do {
            objM3877const = m3877const(f28822l.get(this), obj);
            if (objM3877const == AbstractC7114l.yandex) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C2175l c2175l = obj instanceof C2175l ? (C2175l) obj : null;
                throw new IllegalStateException(str, c2175l != null ? c2175l.yandex : null);
            }
        } while (objM3877const == AbstractC7114l.crashlytics);
        return objM3877const;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.mopub(this, interfaceC15446l);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final void m3882interface(InterfaceC7042l interfaceC7042l) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28821l;
        C2114l c2114l = C2114l.f4745l;
        if (interfaceC7042l == null) {
            atomicReferenceFieldUpdater.set(this, c2114l);
            return;
        }
        interfaceC7042l.start();
        InterfaceC4367l interfaceC4367lMo2157private = interfaceC7042l.mo2157private(this);
        atomicReferenceFieldUpdater.set(this, interfaceC4367lMo2157private);
        if (mo2155l()) {
            interfaceC4367lMo2157private.yandex();
            atomicReferenceFieldUpdater.set(this, c2114l);
        }
    }

    @Override // defpackage.InterfaceC7042l
    public final boolean isCancelled() {
        Object obj = f28822l.get(this);
        if (obj instanceof C2175l) {
            return true;
        }
        return (obj instanceof C2073l) && ((C2073l) obj).amazon();
    }

    public void isPro(Object obj) {
        purchase(obj);
    }

    public Object isVip() {
        return m3884native();
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.crashlytics(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        return AbstractC10586l.billing(this, interfaceC12932l);
    }

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final InterfaceC11791l mo2154l(Function1 function1) {
        return m3888static(true, new C13288l(1, function1));
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ */
    public final Object mo247l(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: lْۥٞ */
    public final boolean mo2155l() {
        return !(f28822l.get(this) instanceof InterfaceC2541l);
    }

    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public Object m3883l(InterfaceC14029l interfaceC14029l) {
        return firebase(interfaceC14029l);
    }

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: lَٖؕ */
    public final C5991l mo2156l() {
        C14343l c14343l = C14343l.f28088l;
        AbstractC9464l.purchase(3, c14343l);
        return new C5991l(this, c14343l);
    }

    @Override // defpackage.InterfaceC7042l
    public boolean mopub() {
        Object obj = f28822l.get(this);
        return (obj instanceof InterfaceC2541l) && ((InterfaceC2541l) obj).mopub();
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final Object m3884native() throws Throwable {
        Object obj = f28822l.get(this);
        if (obj instanceof InterfaceC2541l) {
            C8339l.smaato("This job has not completed yet");
            return null;
        }
        if (obj instanceof C2175l) {
            throw ((C2175l) obj).yandex;
        }
        return AbstractC7114l.yandex(obj);
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final boolean m3885new(Object obj) {
        Object objM3877const;
        do {
            objM3877const = m3877const(f28822l.get(this), obj);
            if (objM3877const == AbstractC7114l.yandex) {
                return false;
            }
            if (objM3877const == AbstractC7114l.loadAd) {
                return true;
            }
        } while (objM3877const == AbstractC7114l.crashlytics);
        purchase(objM3877const);
        return true;
    }

    public String premium() {
        return "Job was cancelled";
    }

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: private */
    public final InterfaceC4367l mo2157private(C14750l c14750l) {
        C10157l c10157l = new C10157l(c14750l);
        c10157l.f15589l = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28822l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C18124l) {
                C18124l c18124l = (C18124l) obj;
                if (c18124l.f35413l) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10157l)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                m3876break(c18124l);
            } else {
                boolean z = obj instanceof InterfaceC2541l;
                C2114l c2114l = C2114l.f4745l;
                Throwable thCrashlytics = null;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C2175l c2175l = obj2 instanceof C2175l ? (C2175l) obj2 : null;
                    c10157l.isPro(c2175l != null ? c2175l.yandex : null);
                    return c2114l;
                }
                C1038l c1038lLoadAd = ((InterfaceC2541l) obj).loadAd();
                if (c1038lLoadAd != null) {
                    if (c1038lLoadAd.crashlytics(c10157l, 7)) {
                        break;
                    }
                    boolean zCrashlytics = c1038lLoadAd.crashlytics(c10157l, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C2073l) {
                        thCrashlytics = ((C2073l) obj3).crashlytics();
                    } else {
                        C2175l c2175l2 = obj3 instanceof C2175l ? (C2175l) obj3 : null;
                        if (c2175l2 != null) {
                            thCrashlytics = c2175l2.yandex;
                        }
                    }
                    c10157l.isPro(thCrashlytics);
                    if (zCrashlytics) {
                        break;
                    }
                    return c2114l;
                }
                m3891transient((AbstractC7581l) obj);
            }
        }
        return c10157l;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004f, B:26:0x005c, B:31:0x0064, B:37:0x007b, B:35:0x0071, B:36:0x0075), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0064 A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004f, B:26:0x005c, B:31:0x0064, B:37:0x007b, B:35:0x0071, B:36:0x0075), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0071 A[Catch: all -> 0x0062, TryCatch #0 {, blocks: (B:24:0x004f, B:26:0x005c, B:31:0x0064, B:37:0x007b, B:35:0x0071, B:36:0x0075), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00b3->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0042, please report this as an issue */
    public final boolean pro(Object obj) {
        Throwable thM3890throws;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        Throwable thCrashlytics;
        C9676l c9676l;
        InterfaceC2541l interfaceC2541l;
        C1038l c1038lM3878else;
        C2073l c2073l;
        Object objM3877const;
        Object objM3877const2 = AbstractC7114l.yandex;
        if (mo558catch()) {
            do {
                Object obj3 = f28822l.get(this);
                if (obj3 instanceof InterfaceC2541l) {
                    if (obj3 instanceof C2073l) {
                        if (C2073l.f4649l.get((C2073l) obj3) == 1) {
                        }
                    }
                    objM3877const2 = m3877const(obj3, new C2175l(m3890throws(obj), false));
                }
                objM3877const2 = AbstractC7114l.yandex;
                break;
            } while (objM3877const2 == AbstractC7114l.crashlytics);
            if (objM3877const2 != AbstractC7114l.loadAd) {
                if (objM3877const2 == AbstractC7114l.yandex) {
                    thM3890throws = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f28822l;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof C2073l) {
                            synchronized (obj2) {
                                if (C2073l.f4650l.get((C2073l) obj2) == AbstractC7114l.purchase) {
                                    c9676l = AbstractC7114l.amazon;
                                } else {
                                    boolean zAmazon = ((C2073l) obj2).amazon();
                                    if (obj == null || !zAmazon) {
                                        if (thM3890throws == null) {
                                            thM3890throws = m3890throws(obj);
                                        }
                                        ((C2073l) obj2).yandex(thM3890throws);
                                    }
                                    thCrashlytics = zAmazon ? null : ((C2073l) obj2).crashlytics();
                                    if (thCrashlytics != null) {
                                        m3880finally(((C2073l) obj2).f4651l, thCrashlytics);
                                    }
                                    c9676l = AbstractC7114l.yandex;
                                }
                            }
                        } else if (obj2 instanceof InterfaceC2541l) {
                            if (thM3890throws == null) {
                                thM3890throws = m3890throws(obj);
                            }
                            interfaceC2541l = (InterfaceC2541l) obj2;
                            if (interfaceC2541l.mopub()) {
                                c1038lM3878else = m3878else(interfaceC2541l);
                                if (c1038lM3878else == null) {
                                    continue;
                                } else {
                                    c2073l = new C2073l(c1038lM3878else, thM3890throws);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2541l, c2073l)) {
                                            m3880finally(c1038lM3878else, thM3890throws);
                                            c9676l = AbstractC7114l.yandex;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC2541l) {
                                        }
                                    }
                                }
                            } else {
                                objM3877const = m3877const(obj2, new C2175l(thM3890throws, false));
                                if (objM3877const != AbstractC7114l.yandex) {
                                    C17132l.metrica(obj2, "Cannot happen in ");
                                    return false;
                                }
                                if (objM3877const != AbstractC7114l.crashlytics) {
                                    objM3877const2 = objM3877const;
                                    break;
                                }
                            }
                        } else {
                            c9676l = AbstractC7114l.amazon;
                        }
                        objM3877const2 = c9676l;
                        break;
                    }
                }
                if (objM3877const2 != AbstractC7114l.yandex && objM3877const2 != AbstractC7114l.loadAd) {
                    if (objM3877const2 == AbstractC7114l.amazon) {
                        return false;
                    }
                    purchase(objM3877const2);
                    return true;
                }
            }
        } else {
            if (objM3877const2 == AbstractC7114l.yandex) {
                thM3890throws = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f28822l;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof C2073l) {
                        synchronized (obj2) {
                            if (C2073l.f4650l.get((C2073l) obj2) == AbstractC7114l.purchase) {
                                c9676l = AbstractC7114l.amazon;
                            } else {
                                boolean zAmazon2 = ((C2073l) obj2).amazon();
                                if (obj == null) {
                                    if (thM3890throws == null) {
                                        thM3890throws = m3890throws(obj);
                                    }
                                    ((C2073l) obj2).yandex(thM3890throws);
                                } else {
                                    if (thM3890throws == null) {
                                        thM3890throws = m3890throws(obj);
                                    }
                                    ((C2073l) obj2).yandex(thM3890throws);
                                }
                                if (zAmazon2) {
                                }
                                if (thCrashlytics != null) {
                                    m3880finally(((C2073l) obj2).f4651l, thCrashlytics);
                                }
                                c9676l = AbstractC7114l.yandex;
                            }
                        }
                    } else if (obj2 instanceof InterfaceC2541l) {
                        if (thM3890throws == null) {
                            thM3890throws = m3890throws(obj);
                        }
                        interfaceC2541l = (InterfaceC2541l) obj2;
                        if (interfaceC2541l.mopub()) {
                            c1038lM3878else = m3878else(interfaceC2541l);
                            if (c1038lM3878else == null) {
                                continue;
                            } else {
                                c2073l = new C2073l(c1038lM3878else, thM3890throws);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2541l, c2073l)) {
                                        m3880finally(c1038lM3878else, thM3890throws);
                                        c9676l = AbstractC7114l.yandex;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC2541l) {
                                    }
                                }
                            }
                        } else {
                            objM3877const = m3877const(obj2, new C2175l(thM3890throws, false));
                            if (objM3877const != AbstractC7114l.yandex) {
                                C17132l.metrica(obj2, "Cannot happen in ");
                                return false;
                            }
                            if (objM3877const != AbstractC7114l.crashlytics) {
                                objM3877const2 = objM3877const;
                                break;
                            }
                        }
                    } else {
                        c9676l = AbstractC7114l.amazon;
                    }
                    objM3877const2 = c9676l;
                    break;
                }
            }
            if (objM3877const2 != AbstractC7114l.yandex) {
                if (objM3877const2 == AbstractC7114l.amazon) {
                    return false;
                }
                purchase(objM3877const2);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final int m3886protected(Object obj) {
        boolean z = obj instanceof C18124l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28822l;
        if (z) {
            if (((C18124l) obj).f35413l) {
                return 0;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, AbstractC7114l.mopub)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo2299try();
            return 1;
        }
        if (!(obj instanceof C18255l)) {
            return 0;
        }
        C1038l c1038l = ((C18255l) obj).f35764l;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1038l)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo2299try();
        return 1;
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final boolean m3887return(C2073l c2073l, C10157l c10157l, Object obj) {
        while (AbstractC11174l.subs(c10157l.f20673l, false, new C12763l(this, c2073l, c10157l, obj)) == C2114l.f4745l) {
            c10157l = m3875public(c10157l);
            if (c10157l == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC7042l
    public final InterfaceC11791l signatures(boolean z, Function1 function1, boolean z2) {
        return m3888static(z2, z ? new C14390l(function1) : new C13288l(1, function1));
    }

    @Override // defpackage.InterfaceC7042l
    public final boolean start() {
        int iM3886protected;
        do {
            iM3886protected = m3886protected(f28822l.get(this));
            if (iM3886protected == 0) {
                return false;
            }
        } while (iM3886protected != 1);
        return true;
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final InterfaceC11791l m3888static(boolean z, AbstractC7581l abstractC7581l) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        boolean zCrashlytics;
        abstractC7581l.f15589l = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f28822l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C18124l;
            C2114l c2114l = C2114l.f4745l;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC2541l)) {
                    z2 = false;
                    break;
                }
                InterfaceC2541l interfaceC2541l = (InterfaceC2541l) obj;
                C1038l c1038lLoadAd = interfaceC2541l.loadAd();
                if (c1038lLoadAd == null) {
                    m3891transient((AbstractC7581l) obj);
                } else {
                    if (abstractC7581l.subs()) {
                        C2073l c2073l = interfaceC2541l instanceof C2073l ? (C2073l) interfaceC2541l : null;
                        Throwable thCrashlytics = c2073l != null ? c2073l.crashlytics() : null;
                        if (thCrashlytics == null) {
                            zCrashlytics = c1038lLoadAd.crashlytics(abstractC7581l, 5);
                        } else if (z) {
                            abstractC7581l.isPro(thCrashlytics);
                            return c2114l;
                        }
                    } else {
                        zCrashlytics = c1038lLoadAd.crashlytics(abstractC7581l, 1);
                    }
                    if (zCrashlytics) {
                        break;
                    }
                }
            } else {
                C18124l c18124l = (C18124l) obj;
                if (c18124l.f35413l) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC7581l)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    m3876break(c18124l);
                }
            }
            return c2114l;
        }
        if (z2) {
            return abstractC7581l;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C2175l c2175l = obj2 instanceof C2175l ? (C2175l) obj2 : null;
            abstractC7581l.isPro(c2175l != null ? c2175l.yandex : null);
        }
        return c2114l;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final Object m3889strictfp(C2073l c2073l, Object obj) {
        Throwable thM3879extends;
        C2175l c2175l = obj instanceof C2175l ? (C2175l) obj : null;
        Throwable th = c2175l != null ? c2175l.yandex : null;
        synchronized (c2073l) {
            c2073l.amazon();
            ArrayList<Throwable> arrayListPurchase = c2073l.purchase(th);
            thM3879extends = m3879extends(c2073l, arrayListPurchase);
            if (thM3879extends != null && arrayListPurchase.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListPurchase.size()));
                for (Throwable th2 : arrayListPurchase) {
                    if (th2 != thM3879extends && th2 != thM3879extends && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC11718l.yandex(thM3879extends, th2);
                    }
                }
            }
        }
        if (thM3879extends != null && thM3879extends != th) {
            obj = new C2175l(thM3879extends, false);
        }
        if (thM3879extends != null && (advert(thM3879extends) || mo2189case(thM3879extends))) {
            C2175l c2175l2 = (C2175l) obj;
            c2175l2.getClass();
            C2175l.loadAd.compareAndSet(c2175l2, 0, 1);
        }
        mo3752this(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28822l;
        Object c13133l = obj instanceof InterfaceC2541l ? new C13133l((InterfaceC2541l) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c2073l, c13133l) && atomicReferenceFieldUpdater.get(this) == c2073l) {
        }
        appmetrica(c2073l, obj);
        return obj;
    }

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: switch */
    public final Object mo2158switch(InterfaceC14029l interfaceC14029l) {
        Object obj;
        do {
            obj = f28822l.get(this);
            if (!(obj instanceof InterfaceC2541l)) {
                AbstractC11174l.billing(interfaceC14029l.metrica());
                return Unit.INSTANCE;
            }
        } while (m3886protected(obj) < 0);
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(interfaceC14029l));
        c2397l.license();
        c2397l.advert(new C0667l(2, AbstractC11174l.subs(this, true, new C13039l(c2397l, 1))));
        Object objSignature = c2397l.Signature();
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objSignature != enumC9342l) {
            objSignature = Unit.INSTANCE;
        }
        return objSignature == enumC9342l ? objSignature : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final Throwable m3890throws(Object obj) {
        Throwable thCrashlytics;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C0390l(premium(), null, this) : th;
        }
        C14750l c14750l = (C14750l) obj;
        c14750l.getClass();
        Object obj2 = f28822l.get(c14750l);
        if (obj2 instanceof C2073l) {
            thCrashlytics = ((C2073l) obj2).crashlytics();
        } else if (obj2 instanceof C2175l) {
            thCrashlytics = ((C2175l) obj2).yandex;
        } else {
            if (obj2 instanceof InterfaceC2541l) {
                C17132l.metrica(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            thCrashlytics = null;
        }
        CancellationException cancellationException = thCrashlytics instanceof CancellationException ? (CancellationException) thCrashlytics : null;
        return cancellationException == null ? new C0390l("Parent job is ".concat(m3874implements(obj2)), thCrashlytics, c14750l) : cancellationException;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo1268abstract() + '{' + m3874implements(f28822l.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC17549l.purchase(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final void m3891transient(AbstractC7581l abstractC7581l) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1038l c1038l = new C1038l();
        abstractC7581l.getClass();
        C17559l.f34184l.set(c1038l, abstractC7581l);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C17559l.f34185l;
        atomicReferenceFieldUpdater2.set(c1038l, abstractC7581l);
        loop0: while (atomicReferenceFieldUpdater2.get(abstractC7581l) == abstractC7581l) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC7581l, abstractC7581l, c1038l)) {
                    c1038l.purchase(abstractC7581l);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(abstractC7581l) == abstractC7581l);
        }
        C17559l c17559lBilling = abstractC7581l.billing();
        do {
            atomicReferenceFieldUpdater = f28822l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC7581l, c17559lBilling)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC7581l);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final InterfaceC11075l m3892volatile() {
        return new C17798l(4, new C3375l(this, null, 1));
    }

    /* JADX INFO: renamed from: try */
    public void mo2299try() {
    }

    /* JADX INFO: renamed from: class */
    public void mo3750class(C6451l c6451l) {
        throw c6451l;
    }

    public void purchase(Object obj) {
    }

    /* JADX INFO: renamed from: this */
    public void mo3752this(Object obj) {
    }
}
