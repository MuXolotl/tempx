package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؚّؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6939l {
    public final /* synthetic */ C1196l crashlytics;
    public final Executor loadAd;
    public final WeakReference yandex;

    public C6939l(C1196l c1196l, C18516l c18516l, Executor executor) {
        this.crashlytics = c1196l;
        this.yandex = new WeakReference(c18516l);
        this.loadAd = executor;
    }
}
