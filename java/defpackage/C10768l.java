package defpackage;

/* JADX INFO: renamed from: lُؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10768l implements InterfaceC13321l, InterfaceC9234l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C0059l f21794l;

    public C10768l(C0059l c0059l) {
        this.f21794l = c0059l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC13321l) || !(obj instanceof InterfaceC9234l)) {
            return false;
        }
        return this.f21794l.equals(((InterfaceC9234l) obj).loadAd());
    }

    public final int hashCode() {
        return this.f21794l.hashCode();
    }

    @Override // defpackage.InterfaceC9234l
    public final InterfaceC14328l loadAd() {
        return this.f21794l;
    }

    @Override // defpackage.InterfaceC13321l
    public final long yandex() {
        return ((C9735l) this.f21794l.get()).yandex;
    }
}
