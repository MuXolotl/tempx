package defpackage;

/* JADX INFO: renamed from: lٕٚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15779l {
    public final C6295l amazon;
    public final C6295l crashlytics;
    public final ViewTreeObserverOnGlobalLayoutListenerC13840l loadAd;
    public boolean purchase;
    public final C15552l yandex;

    public C15779l(C15552l c15552l, ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l) {
        this.yandex = c15552l;
        this.loadAd = viewTreeObserverOnGlobalLayoutListenerC13840l;
        C6295l c6295l = AbstractC13087l.yandex;
        this.crashlytics = new C6295l();
        this.amazon = new C6295l();
    }

    public final void yandex() {
        if (this.purchase) {
            return;
        }
        C13246l c13246l = new C13246l(0, this, C15779l.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 9);
        C12463l c12463l = this.loadAd.f27049l;
        if (c12463l.subs(c13246l) < 0) {
            c12463l.yandex(c13246l);
        }
        this.purchase = true;
    }
}
