package defpackage;

/* JADX INFO: renamed from: lًؚۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7853l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13208l f16387l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16388l;

    public /* synthetic */ RunnableC7853l(C13208l c13208l, int i) {
        this.f16388l = i;
        this.f16387l = c13208l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16388l;
        C13208l c13208l = this.f16387l;
        switch (i) {
            case 0:
                C1908l c1908l = c13208l.f25988synchronized;
                if (c1908l != null) {
                    c13208l.m3610l(c1908l, C3508l.crashlytics);
                }
                break;
            default:
                ServiceConnectionC5994l serviceConnectionC5994l = c13208l.metrica;
                if (serviceConnectionC5994l != null) {
                    c13208l.amazon.unbindService(serviceConnectionC5994l);
                    c13208l.metrica = null;
                }
                c13208l.crashlytics.purchase.clear();
                break;
        }
    }
}
