package defpackage;

import android.os.Handler;

/* JADX INFO: renamed from: lٟؔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2815l {
    public final /* synthetic */ C4636l crashlytics;
    public final C16427l loadAd;
    public final Handler yandex;

    public C2815l(C4636l c4636l) {
        this.crashlytics = c4636l;
        Handler handlerAds = AbstractC15323l.ads(null);
        this.yandex = handlerAds;
        C16427l c16427l = new C16427l(this);
        this.loadAd = c16427l;
        c4636l.yandex.registerStreamEventCallback(new ExecutorC10366l(handlerAds, 0), c16427l);
    }

    public static void yandex(C2815l c2815l) {
        c2815l.crashlytics.yandex.unregisterStreamEventCallback(c2815l.loadAd);
        c2815l.yandex.removeCallbacksAndMessages(null);
    }
}
