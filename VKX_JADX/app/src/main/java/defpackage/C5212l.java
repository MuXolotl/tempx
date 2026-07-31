package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٜؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5212l {
    public final AtomicBoolean crashlytics = new AtomicBoolean(true);
    public final Executor loadAd;
    public final C4568l yandex;

    public C5212l(C4568l c4568l, Executor executor) {
        this.yandex = c4568l;
        this.loadAd = executor;
    }

    public final void yandex(int i) {
        if (this.crashlytics.get()) {
            try {
                this.loadAd.execute(new RunnableC9534l(this, i, 11));
            } catch (RejectedExecutionException unused) {
                AbstractC5088l.tapsense("RotationProvider", "Failed to execute the command. Maybe the executor has been shutdown.");
            }
        }
    }
}
