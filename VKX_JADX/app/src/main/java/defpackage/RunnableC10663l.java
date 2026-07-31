package defpackage;

/* JADX INFO: renamed from: lَۢۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10663l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0188l f21631l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21632l;

    public /* synthetic */ RunnableC10663l(C0188l c0188l, int i) {
        this.f21632l = i;
        this.f21631l = c0188l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f21632l;
        C0188l c0188l = this.f21631l;
        switch (i) {
            case 0:
                if (!c0188l.firebase && ((C10730l) c0188l.subs.f35934l).purchase.yandex() == null) {
                    c0188l.m343l();
                    break;
                }
                break;
            default:
                C5138l c5138l = new C5138l(c0188l.yandex, c0188l.crashlytics.yandex.crashlytics(), new C18449l(c0188l), c0188l.loadAd.f32834l.mo341l());
                c0188l.isPro = c5138l;
                AbstractC6427l.billing("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
                ((C9557l) c5138l.f11181l).loadAd.connect();
                break;
        }
    }
}
