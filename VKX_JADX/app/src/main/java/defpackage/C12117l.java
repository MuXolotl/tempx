package defpackage;

/* JADX INFO: renamed from: lِْۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12117l extends AbstractC5554l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f24096l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8250l f24097l;

    public C12117l(InterfaceC16805l interfaceC16805l, C8250l c8250l) {
        super(interfaceC16805l);
        this.f24097l = c8250l;
    }

    @Override // defpackage.AbstractC5554l, defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public final void mo390break(C0869l c0869l, long j) {
        super.mo390break(c0869l, j);
        long j2 = this.f24096l + j;
        this.f24096l = j2;
        this.f24097l.invoke(Long.valueOf(j2));
    }
}
