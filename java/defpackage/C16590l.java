package defpackage;

/* JADX INFO: renamed from: lَٖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16590l {
    public final C16390l loadAd;
    public final C1527l yandex;

    public C16590l(C1527l c1527l, C16390l c16390l) {
        this.yandex = c1527l;
        this.loadAd = c16390l;
        if ((c1527l == null ? c16390l : c1527l) != null) {
            return;
        }
        C8339l.metrica("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void loadAd(AbstractC17054l abstractC17054l) {
        if (this.yandex != null) {
            ((C11541l) abstractC17054l.f33214l).billing();
        } else if (this.loadAd != null) {
            ((C4983l) abstractC17054l.f33215l).amazon();
        } else {
            C8339l.smaato("Unreachable");
        }
    }

    public final void yandex(AbstractC17054l abstractC17054l) {
        C1527l c1527l = this.yandex;
        if (c1527l != null) {
            C1527l.yandex(c1527l, (C11541l) abstractC17054l.f33214l);
            return;
        }
        C16390l c16390l = this.loadAd;
        if (c16390l == null) {
            C8339l.smaato("Unreachable");
            return;
        }
        C4983l c4983l = (C4983l) abstractC17054l.f33215l;
        C0760l c0760l = new C0760l(c4983l, new C9282l(c4983l, null));
        c4983l.yandex.add(c0760l);
        C1527l.yandex(c16390l.loadAd().crashlytics, c0760l);
    }
}
