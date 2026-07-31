package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lٖٟۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16653l extends AbstractC6369l implements InterfaceC12370l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32619l = AtomicIntegerFieldUpdater.newUpdater(AbstractC16653l.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f32620l;

    public AbstractC16653l(long j, AbstractC16653l abstractC16653l, int i) {
        super(abstractC16653l);
        this.f32620l = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public abstract void admob(int i, InterfaceC12932l interfaceC12932l);

    @Override // defpackage.AbstractC6369l
    public final boolean amazon() {
        return f32619l.get(this) == mopub() && crashlytics() != null;
    }

    public final boolean billing() {
        return f32619l.addAndGet(this, -65536) == mopub() && crashlytics() != null;
    }

    public final boolean isPro() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f32619l;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mopub() && crashlytics() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public abstract int mopub();

    public final void subs() {
        if (f32619l.incrementAndGet(this) == mopub()) {
            purchase();
        }
    }
}
