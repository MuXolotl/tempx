package defpackage;

import java.io.Closeable;

/* JADX INFO: renamed from: lٍؘٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9543l implements Runnable, Closeable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f19449l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f19450l = AbstractC12704l.amazon(Thread.currentThread());

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC14094l f19451l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f19452l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f19453l;

    public RunnableC9543l(InterfaceC14094l interfaceC14094l, boolean z) {
        this.f19452l = false;
        this.f19451l = interfaceC14094l;
        this.f19452l = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC14094l interfaceC14094l = this.f19451l;
        try {
            this.f19451l = null;
            boolean z = this.f19453l;
            if (!z) {
                if (this.f19449l) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.f19449l = true;
                if (this.f19450l && !z) {
                    AbstractC12704l.amazon(Thread.currentThread());
                }
            }
            if (interfaceC14094l != null) {
                ((AbstractC17970l) interfaceC14094l).close();
            }
            if (this.f19452l) {
                AbstractC10540l.yandex(AbstractC10540l.loadAd(), C4933l.f10053l);
            }
        } catch (Throwable th) {
            if (interfaceC14094l != null) {
                try {
                    ((AbstractC17970l) interfaceC14094l).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.f19449l || !(z = this.f19453l)) {
            AbstractC12704l.purchase().post(RunnableC10253l.f20877l);
            return;
        }
        this.f19449l = true;
        if (!this.f19450l || z) {
            return;
        }
        AbstractC12704l.amazon(Thread.currentThread());
    }

    public final void yandex(AbstractC2722l abstractC2722l) {
        if (this.f19449l) {
            C8339l.smaato("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (this.f19453l) {
            C8339l.smaato("Signal is already attached to future");
        } else {
            this.f19453l = true;
            abstractC2722l.yandex(this, EnumC1535l.f3808l);
        }
    }
}
