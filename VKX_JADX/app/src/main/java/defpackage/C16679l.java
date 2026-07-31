package defpackage;

/* JADX INFO: renamed from: lًٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16679l extends AbstractC6897l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C4568l f32699l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC6897l f32700l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C1503l f32701l;

    public C16679l(AbstractC6897l abstractC6897l, C4568l c4568l) {
        this.f32700l = abstractC6897l;
        this.f32699l = c4568l;
    }

    @Override // defpackage.AbstractC6897l
    public final long billing() {
        return this.f32700l.billing();
    }

    @Override // defpackage.AbstractC6897l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final InterfaceC9473l mo1516l() {
        if (this.f32701l == null) {
            this.f32701l = new C1503l(new C5508l(this.f32700l.mo1516l(), this));
        }
        return this.f32701l;
    }

    @Override // defpackage.AbstractC6897l
    public final C12105l mopub() {
        return this.f32700l.mopub();
    }
}
