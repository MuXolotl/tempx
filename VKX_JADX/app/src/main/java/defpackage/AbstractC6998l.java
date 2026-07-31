package defpackage;

/* JADX INFO: renamed from: lؚؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6998l implements InterfaceC2763l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C12633l f14660l = new C12633l(0);

    @Override // defpackage.InterfaceC2763l
    public /* synthetic */ AbstractC7498l billing(AbstractC7498l abstractC7498l, AbstractC7498l abstractC7498l2, AbstractC7498l abstractC7498l3) {
        return null;
    }

    public final boolean crashlytics(int i) {
        return (this.f14660l.get() & i) != 0;
    }

    public final void purchase(int i) {
        C12633l c12633l;
        int i2;
        do {
            c12633l = this.f14660l;
            i2 = c12633l.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!c12633l.compareAndSet(i2, i2 | i));
    }
}
