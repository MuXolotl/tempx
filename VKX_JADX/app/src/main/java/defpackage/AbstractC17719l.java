package defpackage;

/* JADX INFO: renamed from: lؘ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17719l extends AbstractC3376l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC15211l f34537l;

    public AbstractC17719l(AbstractC15211l abstractC15211l) {
        this.f34537l = abstractC15211l;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: implements */
    public final AbstractC15211l mo8static(boolean z) {
        return z == mo1342throw() ? this : this.f34537l.mo8static(z).mo686abstract(mo1340package());
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final AbstractC15211l mo3l() {
        return this.f34537l;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final AbstractC15211l mo686abstract(C16017l c16017l) {
        return c16017l != mo1340package() ? new C13764l(this, c16017l) : this;
    }
}
