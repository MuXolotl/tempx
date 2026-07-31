package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: lٖٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16390l {
    public final C8688l loadAd = new C8688l(new C10740l(14, this));
    public final Runnable yandex;

    public C16390l(Runnable runnable) {
        this.yandex = runnable;
    }

    public final void crashlytics(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        loadAd().crashlytics.crashlytics(new C6395l(onBackInvokedDispatcher, 0), 1);
        loadAd().crashlytics.crashlytics(new C0616l(onBackInvokedDispatcher), 0);
    }

    public final C4912l loadAd() {
        return (C4912l) this.loadAd.getValue();
    }

    public final void yandex(C4983l c4983l, InterfaceC3177l interfaceC3177l) {
        final AbstractC6475l abstractC6475lLoadAd = interfaceC3177l.loadAd();
        if (((C5268l) abstractC6475lLoadAd).subs == EnumC8981l.f18522l) {
            return;
        }
        C0760l c0760l = new C0760l(c4983l, new C9282l(c4983l, interfaceC3177l));
        c4983l.yandex.add(c0760l);
        c0760l.admob(false);
        C1527l.yandex(loadAd().crashlytics, c0760l);
        final C14852l c14852l = new C14852l(c0760l, this, abstractC6475lLoadAd);
        abstractC6475lLoadAd.yandex(c14852l);
        c4983l.crashlytics.add(new AutoCloseable() { // from class: lؔؓۚ
            @Override // java.lang.AutoCloseable
            public final void close() {
                abstractC6475lLoadAd.loadAd(c14852l);
            }
        });
    }
}
