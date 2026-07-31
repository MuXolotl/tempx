package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٓۖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14338l {
    public final ExecutorC12010l amazon;
    public final ThreadLocal crashlytics;
    public final ExecutorC7870l loadAd;
    public final C18662l purchase;
    public final C18662l yandex;

    public C14338l(C18662l c18662l, Executor executor) {
        this.yandex = c18662l;
        new Handler(Looper.getMainLooper());
        this.loadAd = new ExecutorC7870l(executor);
        this.crashlytics = new ThreadLocal();
        ExecutorC12010l executorC12010l = new ExecutorC12010l(5, this);
        this.amazon = executorC12010l;
        this.purchase = AbstractC11990l.yandex(c18662l.f36440l.mo246l(AbstractC1295l.crashlytics()).mo246l(AbstractC5103l.billing(executorC12010l)));
    }
}
