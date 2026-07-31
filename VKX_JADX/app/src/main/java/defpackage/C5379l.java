package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lؘٖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5379l {
    public static final Logger billing = Logger.getLogger(C4225l.class.getName());
    public final C16163l amazon;
    public final C2690l crashlytics;
    public final Executor loadAd;
    public final C16163l purchase;
    public final C10111l yandex;

    public C5379l(Executor executor, C2690l c2690l, C10111l c10111l, C16163l c16163l, C16163l c16163l2) {
        this.loadAd = executor;
        this.crashlytics = c2690l;
        this.yandex = c10111l;
        this.amazon = c16163l;
        this.purchase = c16163l2;
    }
}
