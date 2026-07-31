package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lٖٟؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16137l {
    public boolean amazon;
    public final AtomicInteger crashlytics = new AtomicInteger(-256);
    public final WorkerParameters loadAd;
    public final Context yandex;

    public AbstractC16137l(Context context, WorkerParameters workerParameters) {
        this.yandex = context;
        this.loadAd = workerParameters;
    }

    public abstract C16565l loadAd();

    public abstract C16565l yandex();
}
