package defpackage;

/* JADX INFO: renamed from: lّٟۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12763l extends AbstractC7581l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10157l f25144l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Object f25145l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C14750l f25146l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C2073l f25147l;

    public C12763l(C14750l c14750l, C2073l c2073l, C10157l c10157l, Object obj) {
        this.f25146l = c14750l;
        this.f25147l = c2073l;
        this.f25144l = c10157l;
        this.f25145l = obj;
    }

    @Override // defpackage.AbstractC7581l
    public final void isPro(Throwable th) {
        C10157l c10157l = this.f25144l;
        C10157l c10157lM3875public = C14750l.m3875public(c10157l);
        C14750l c14750l = this.f25146l;
        C2073l c2073l = this.f25147l;
        Object obj = this.f25145l;
        if (c10157lM3875public == null || !c14750l.m3887return(c2073l, c10157lM3875public, obj)) {
            c2073l.f4651l.crashlytics(new C5324l(2), 2);
            C10157l c10157lM3875public2 = C14750l.m3875public(c10157l);
            if (c10157lM3875public2 == null || !c14750l.m3887return(c2073l, c10157lM3875public2, obj)) {
                c14750l.purchase(c14750l.m3889strictfp(c2073l, obj));
            }
        }
    }

    @Override // defpackage.AbstractC7581l
    public final boolean subs() {
        return false;
    }
}
