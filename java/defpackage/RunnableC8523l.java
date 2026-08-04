package defpackage;

/* JADX INFO: renamed from: lٌؓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8523l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0958l f17617l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17618l;

    public /* synthetic */ RunnableC8523l(AbstractC0958l abstractC0958l, int i) {
        this.f17618l = i;
        this.f17617l = abstractC0958l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17618l;
        AbstractC0958l abstractC0958l = this.f17617l;
        switch (i) {
            case 0:
                abstractC0958l.yandex();
                break;
            default:
                abstractC0958l.loadAd();
                break;
        }
    }
}
