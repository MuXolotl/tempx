package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lۣٓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14266l {
    public static final C14266l amazon = new C14266l();
    public C14266l crashlytics;
    public final Executor loadAd;
    public final Runnable yandex;

    public C14266l() {
        this.yandex = null;
        this.loadAd = null;
    }

    public C14266l(Runnable runnable, Executor executor) {
        this.yandex = runnable;
        this.loadAd = executor;
    }
}
