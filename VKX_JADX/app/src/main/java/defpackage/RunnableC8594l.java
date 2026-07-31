package defpackage;

/* JADX INFO: renamed from: lٌؘّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8594l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10500l f17715l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17716l;

    public /* synthetic */ RunnableC8594l(C10500l c10500l, int i) {
        this.f17716l = i;
        this.f17715l = c10500l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17716l;
        C10500l c10500l = this.f17715l;
        switch (i) {
            case 0:
                c10500l.yandex();
                break;
            case 1:
                c10500l.loadAd();
                break;
            default:
                C3214l c3214l = c10500l.adcel;
                if (c3214l != null) {
                    c3214l.mopub();
                }
                if (c10500l.startapp == null) {
                    c10500l.metrica.crashlytics();
                }
                c10500l.startapp = null;
                break;
        }
    }
}
