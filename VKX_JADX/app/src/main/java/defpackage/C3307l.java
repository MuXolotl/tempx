package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: lَؕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3307l {
    public final AbstractC1872l loadAd;
    public final ExecutorC8064l yandex;
    public final Handler crashlytics = new Handler(Looper.getMainLooper());
    public final ExecutorC0877l amazon = new ExecutorC0877l(2, this);

    public C3307l(ExecutorService executorService) {
        ExecutorC8064l executorC8064l = new ExecutorC8064l(0, executorService);
        this.yandex = executorC8064l;
        this.loadAd = AbstractC5103l.billing(executorC8064l);
    }
}
