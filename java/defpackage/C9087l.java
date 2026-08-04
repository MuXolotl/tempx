package defpackage;

import android.os.Looper;

/* JADX INFO: renamed from: lٌ۟۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9087l {
    public Object amazon;
    public boolean billing;
    public int crashlytics;
    public final C0477l loadAd;
    public final Looper purchase;
    public final InterfaceC3184l yandex;

    public C9087l(C0477l c0477l, InterfaceC3184l interfaceC3184l, AbstractC10759l abstractC10759l, int i, Looper looper) {
        this.loadAd = c0477l;
        this.yandex = interfaceC3184l;
        this.purchase = looper;
    }

    public final void loadAd() {
        AbstractC12442l.subscription(!this.billing);
        this.billing = true;
        C0477l c0477l = this.loadAd;
        if (!c0477l.f1767l && c0477l.f1766l.getThread().isAlive()) {
            c0477l.f1746l.loadAd(14, this).loadAd();
        } else {
            AbstractC6427l.vip("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            yandex(false);
        }
    }

    public final synchronized void yandex(boolean z) {
        notifyAll();
    }
}
