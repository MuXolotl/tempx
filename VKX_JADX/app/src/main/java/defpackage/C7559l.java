package defpackage;

/* JADX INFO: renamed from: lؚ۠ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7559l extends AbstractC14971l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C1739l f15557l;

    public C7559l(C1739l c1739l) {
        this.f15557l = c1739l;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        C1739l c1739l = this.f15557l;
        if (c1739l instanceof C1739l) {
            c1739l.yandex.remoteconfig(this);
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        m2190l(this.f15557l);
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m2190l(C1739l c1739l) {
        C1739l c1739l2 = this.f15557l;
        if (c1739l2 instanceof C1739l) {
            c1739l2.yandex.remoteconfig(this);
        }
        if (c1739l instanceof C1739l) {
            c1739l.yandex.crashlytics(this);
        }
        this.f15557l = c1739l;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }
}
