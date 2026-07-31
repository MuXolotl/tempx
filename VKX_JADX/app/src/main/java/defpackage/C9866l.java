package defpackage;

import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lٍ۠٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9866l {
    public static final AtomicInteger amazon = new AtomicInteger(5);
    public int crashlytics;
    public HandlerThread loadAd;
    public final ArrayDeque yandex = new ArrayDeque();

    public final synchronized void loadAd() {
        try {
            int i = this.crashlytics - 1;
            this.crashlytics = i;
            if (i == 0) {
                HandlerThread handlerThread = this.loadAd;
                handlerThread.getClass();
                handlerThread.quit();
                this.loadAd = null;
                this.yandex.clear();
            } else {
                yandex();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void yandex() {
        ArrayDeque arrayDeque = this.yandex;
        if (!arrayDeque.isEmpty() && this.crashlytics - arrayDeque.size() < amazon.get()) {
            C17954l c17954l = (C17954l) arrayDeque.removeFirst();
            c17954l.crashlytics.loadAd(1, c17954l.loadAd).loadAd();
        }
    }
}
