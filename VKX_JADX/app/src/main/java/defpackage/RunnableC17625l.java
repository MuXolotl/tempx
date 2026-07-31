package defpackage;

/* JADX INFO: renamed from: l٘ؒٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC17625l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18449l f34295l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34296l;

    public /* synthetic */ RunnableC17625l(C18449l c18449l, int i) {
        this.f34296l = i;
        this.f34295l = c18449l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34296l;
        C18449l c18449l = this.f34295l;
        switch (i) {
            case 0:
                C11564l c11564l = (C11564l) c18449l.f36012l;
                if (c11564l != null) {
                    ((C13716l) c18449l.f36010l).admob(c11564l);
                }
                break;
            default:
                if (((C11564l) c18449l.f36012l) == null) {
                    c18449l.f36012l = new C11564l(1, c18449l);
                }
                ((C13716l) c18449l.f36010l).purchase((C11564l) c18449l.f36012l);
                break;
        }
    }
}
