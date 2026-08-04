package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؙۛۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6755l {
    public static final C6755l amazon = new C6755l(null, null);
    public C6755l crashlytics;
    public final Executor loadAd;
    public final Runnable yandex;

    public C6755l(Runnable runnable, Executor executor) {
        this.yandex = runnable;
        this.loadAd = executor;
    }
}
