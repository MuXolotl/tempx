package defpackage;

/* JADX INFO: renamed from: lُؒٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10791l implements InterfaceC14029l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ClassLoader f21820l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0283l f21821l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12932l f21822l;

    public C10791l(AbstractC0283l abstractC0283l, ClassLoader classLoader) {
        this.f21821l = abstractC0283l;
        this.f21820l = classLoader;
        this.f21822l = abstractC0283l.metrica();
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        return this.f21822l;
    }

    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        Thread.currentThread().setContextClassLoader(this.f21820l);
        this.f21821l.subs(obj);
    }
}
