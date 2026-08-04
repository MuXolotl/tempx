package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lّؐۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12295l extends AbstractC4820l implements Csuper, InterfaceC2262l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24365l = AtomicIntegerFieldUpdater.newUpdater(AbstractC12295l.class, "closeFlag");

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24362l = AtomicIntegerFieldUpdater.newUpdater(AbstractC12295l.class, "actualCloseFlag");

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24363l = AtomicReferenceFieldUpdater.newUpdater(AbstractC12295l.class, Object.class, "readerJob");

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24364l = AtomicReferenceFieldUpdater.newUpdater(AbstractC12295l.class, Object.class, "writerJob");
    private volatile /* synthetic */ int closeFlag = 0;
    private volatile /* synthetic */ int actualCloseFlag = 0;
    volatile /* synthetic */ Object readerJob = null;
    volatile /* synthetic */ Object writerJob = null;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C16931l f24367l = new C16931l(29, this);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C0462l f24366l = new C0462l(null);

    @Override // defpackage.AbstractC4820l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f24365l.compareAndSet(this, 0, 1)) {
            AbstractC10999l.mopub(this, new C0499l("socket-close"), 0, new C11039l(this, null, 0), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m3372continue() {
        Throwable cause;
        CancellationException cancellationExceptionMo2153default;
        CancellationException cancellationExceptionMo2153default2;
        if (this.closeFlag != 0) {
            InterfaceC11164l interfaceC11164l = (InterfaceC11164l) this.readerJob;
            if (interfaceC11164l == null || interfaceC11164l.crashlytics().mo2155l()) {
                InterfaceC11164l interfaceC11164l2 = (InterfaceC11164l) this.writerJob;
                if ((interfaceC11164l2 == null || interfaceC11164l2.crashlytics().mo2155l()) && f24362l.compareAndSet(this, 0, 1)) {
                    InterfaceC11164l interfaceC11164l3 = (InterfaceC11164l) this.readerJob;
                    Throwable cause2 = null;
                    if (interfaceC11164l3 == null) {
                        cause = null;
                    } else {
                        if (!interfaceC11164l3.crashlytics().isCancelled()) {
                            interfaceC11164l3 = null;
                        }
                        if (interfaceC11164l3 == null || (cancellationExceptionMo2153default2 = interfaceC11164l3.crashlytics().mo2153default()) == null) {
                            cause = null;
                        } else {
                            cause = cancellationExceptionMo2153default2.getCause();
                        }
                    }
                    InterfaceC11164l interfaceC11164l4 = (InterfaceC11164l) this.writerJob;
                    if (interfaceC11164l4 != null) {
                        if (!interfaceC11164l4.crashlytics().isCancelled()) {
                            interfaceC11164l4 = null;
                        }
                        if (interfaceC11164l4 != null && (cancellationExceptionMo2153default = interfaceC11164l4.crashlytics().mo2153default()) != null) {
                            cause2 = cancellationExceptionMo2153default.getCause();
                        }
                    }
                    Throwable thInmobi = inmobi();
                    if (cause == null) {
                        cause = cause2;
                    } else if (cause2 != null && cause != cause2) {
                        AbstractC11718l.yandex(cause, cause2);
                    }
                    if (cause != null) {
                        if (thInmobi != null && cause != thInmobi) {
                            AbstractC11718l.yandex(cause, thInmobi);
                        }
                        thInmobi = cause;
                    }
                    C0462l c0462l = this.f24366l;
                    if (thInmobi == null) {
                        c0462l.m561l();
                    } else {
                        c0462l.m560l(thInmobi);
                    }
                }
            }
        }
    }

    public abstract Throwable inmobi();

    @Override // defpackage.Csuper
    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public final C0462l mo3373l() {
        return this.f24366l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C13400l m3374package(C4993l c4993l) throws IOException {
        if (this.closeFlag != 0) {
            IOException iOException = new IOException("Socket closed");
            c4993l.yandex(iOException);
            throw iOException;
        }
        C13400l c13400lMo690synchronized = mo690synchronized(c4993l);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24364l;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c13400lMo690synchronized)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                IllegalStateException illegalStateException = new IllegalStateException("reading channel has already been set");
                ((C14750l) c13400lMo690synchronized.crashlytics()).ads(null);
                throw illegalStateException;
            }
        }
        if (this.closeFlag != 0) {
            IOException iOException2 = new IOException("Socket closed");
            ((C14750l) c13400lMo690synchronized.crashlytics()).ads(null);
            c4993l.yandex(iOException2);
            throw iOException2;
        }
        ((C14750l) c13400lMo690synchronized.crashlytics()).signatures(true, new C6383l(c4993l, 0), true);
        ((C14750l) c13400lMo690synchronized.crashlytics()).mo2154l(this.f24367l);
        return c13400lMo690synchronized;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final C12034l m3375private(C4993l c4993l) throws IOException {
        if (this.closeFlag != 0) {
            IOException iOException = new IOException("Socket closed");
            c4993l.yandex(iOException);
            throw iOException;
        }
        C12034l c12034lMo689switch = mo689switch(c4993l);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24363l;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c12034lMo689switch)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                IllegalStateException illegalStateException = new IllegalStateException("writing channel has already been set");
                ((C14750l) c12034lMo689switch.crashlytics()).ads(null);
                throw illegalStateException;
            }
        }
        if (this.closeFlag != 0) {
            IOException iOException2 = new IOException("Socket closed");
            ((C14750l) c12034lMo689switch.crashlytics()).ads(null);
            c4993l.yandex(iOException2);
            throw iOException2;
        }
        ((C14750l) c12034lMo689switch.crashlytics()).signatures(true, new C6383l(c4993l, 0), true);
        ((C14750l) c12034lMo689switch.crashlytics()).mo2154l(this.f24367l);
        return c12034lMo689switch;
    }

    /* JADX INFO: renamed from: switch */
    public abstract C12034l mo689switch(C4993l c4993l);

    /* JADX INFO: renamed from: synchronized */
    public abstract C13400l mo690synchronized(C4993l c4993l);

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f24366l;
    }
}
