package defpackage;

/* JADX INFO: renamed from: lؙ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17916l extends AbstractRunnableC18269l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Runnable f34877l;

    public C17916l(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f34877l = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34877l.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f34877l;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC17549l.purchase(runnable));
        sb.append(", ");
        sb.append(this.f35768l);
        sb.append(", ");
        return AbstractC2812l.tapsense(sb, this.f35767l ? "Blocking" : "Non-blocking", ']');
    }
}
