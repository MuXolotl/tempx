package defpackage;

/* JADX INFO: renamed from: lؑؗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0128l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3726l f1028l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1029l;

    public /* synthetic */ RunnableC0128l(C3726l c3726l, int i) {
        this.f1029l = i;
        this.f1028l = c3726l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1029l;
        C3726l c3726l = this.f1028l;
        switch (i) {
            case 0:
                C7026l c7026l = c3726l.pro;
                if (c7026l != null) {
                    ((AbstractServiceC3639l) c7026l.f14720l).firebase(c3726l.firebase, false);
                }
                break;
            case 1:
                C3726l.yandex(c3726l);
                break;
            case 2:
                c3726l.m1416native();
                break;
            default:
                C9755l c9755l = c3726l.license;
                if (c9755l != null) {
                    c3726l.tapsense.mo2796l(c9755l);
                }
                break;
        }
    }
}
