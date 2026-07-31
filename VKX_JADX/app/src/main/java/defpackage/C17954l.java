package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: renamed from: lٖ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17954l {
    public static final C9866l mopub = new C9866l();
    public final C8797l amazon;
    public boolean billing;
    public final C14500l crashlytics;
    public final C2427l loadAd;
    public final C8797l purchase;
    public final C15291l yandex;

    public C17954l(C15291l c15291l, C2427l c2427l, C8797l c8797l, C8797l c8797l2) {
        Looper looper;
        this.yandex = c15291l;
        this.loadAd = c2427l;
        this.amazon = c8797l;
        this.purchase = c8797l2;
        C9866l c9866l = mopub;
        synchronized (c9866l) {
            try {
                if (c9866l.loadAd == null) {
                    AbstractC12442l.subscription(c9866l.crashlytics == 0);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
                    c9866l.loadAd = handlerThread;
                    handlerThread.start();
                }
                c9866l.crashlytics++;
                HandlerThread handlerThread2 = c9866l.loadAd;
                handlerThread2.getClass();
                looper = handlerThread2.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.crashlytics = new C14500l(new Handler(looper, new C6215l(this)));
    }

    public final synchronized void yandex() {
        if (!this.billing) {
            this.billing = true;
            this.crashlytics.yandex(4).loadAd();
        }
    }
}
