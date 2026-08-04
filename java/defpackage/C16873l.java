package defpackage;

/* JADX INFO: renamed from: lّٗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16873l extends AbstractC14971l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final /* synthetic */ C3877l f32928l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C6606l f32929l;

    public C16873l(C3877l c3877l) {
        this.f32928l = c3877l;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        C3877l c3877l = this.f32928l;
        if (c3877l.f8011l == this) {
            c3877l.f8011l = null;
        }
        C6606l c6606l = this.f32929l;
        if (c6606l != null) {
            c6606l.loadAd();
        }
        this.f32929l = null;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        C3877l c3877l = this.f32928l;
        c3877l.f8011l = this;
        if (c3877l.f8010l != null) {
            this.f32929l = AbstractC9498l.mopub(this, 0L, 0L, new C0464l(this, c3877l, 12));
        }
    }
}
