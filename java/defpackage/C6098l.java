package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؘۦؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6098l extends AbstractRunnableC7736l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2397l f12884l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11705l f12885l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6098l(AbstractC11705l abstractC11705l, long j, C2397l c2397l) {
        super(j);
        this.f12885l = abstractC11705l;
        this.f12884l = c2397l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12884l.m1132synchronized(this.f12885l, Unit.INSTANCE);
    }

    @Override // defpackage.AbstractRunnableC7736l
    public final String toString() {
        return super.toString() + this.f12884l;
    }
}
