package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lّؐؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12286l extends AbstractC1872l implements InterfaceC8680l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24352l = AtomicIntegerFieldUpdater.newUpdater(C12286l.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8680l f24353l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Object f24354l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f24355l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC1872l f24356l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C0794l f24357l;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C12286l(AbstractC1872l abstractC1872l, int i) {
        InterfaceC8680l interfaceC8680l = abstractC1872l instanceof InterfaceC8680l ? (InterfaceC8680l) abstractC1872l : null;
        this.f24353l = interfaceC8680l == null ? AbstractC3357l.yandex : interfaceC8680l;
        this.f24356l = abstractC1872l;
        this.f24355l = i;
        this.f24357l = new C0794l();
        this.f24354l = new Object();
    }

    @Override // defpackage.AbstractC1872l
    public final void adcel(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        Runnable runnableM3371l;
        this.f24357l.yandex(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24352l;
        if (atomicIntegerFieldUpdater.get(this) >= this.f24355l || !m3370l() || (runnableM3371l = m3371l()) == null) {
            return;
        }
        try {
            this.f24356l.adcel(this, new RunnableC9929l(this, runnableM3371l, false, 11));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC8680l
    public final void billing(long j, C2397l c2397l) {
        this.f24353l.billing(j, c2397l);
    }

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public final boolean m3370l() {
        synchronized (this.f24354l) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24352l;
            if (atomicIntegerFieldUpdater.get(this) >= this.f24355l) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final Runnable m3371l() {
        while (true) {
            Runnable runnable = (Runnable) this.f24357l.amazon();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f24354l) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24352l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f24357l.crashlytics() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.AbstractC1872l
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24356l);
        sb.append(".limitedParallelism(");
        return AbstractC0653l.adcel(sb, this.f24355l, ')');
    }

    @Override // defpackage.AbstractC1872l
    public final void vip(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        Runnable runnableM3371l;
        this.f24357l.yandex(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24352l;
        if (atomicIntegerFieldUpdater.get(this) >= this.f24355l || !m3370l() || (runnableM3371l = m3371l()) == null) {
            return;
        }
        try {
            AbstractC9853l.loadAd(this.f24356l, this, new RunnableC9929l(this, runnableM3371l, false, 11));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.AbstractC1872l
    /* JADX INFO: renamed from: while */
    public final AbstractC1872l mo1066while(int i) {
        AbstractC7798l.loadAd(i);
        return i >= this.f24355l ? this : super.mo1066while(i);
    }

    @Override // defpackage.InterfaceC8680l
    public final InterfaceC11791l yandex(long j, Runnable runnable, InterfaceC12932l interfaceC12932l) {
        return this.f24353l.yandex(j, runnable, interfaceC12932l);
    }
}
