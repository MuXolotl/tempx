package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: lٖۣؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16722l {
    public final C9902l crashlytics;
    public final C16876l loadAd;
    public final C9902l yandex;

    public C16722l() {
        C9902l c9902lYandex = AbstractC3478l.yandex();
        C16876l c16876l = new C16876l(new PathMeasure());
        C9902l c9902lYandex2 = AbstractC3478l.yandex();
        this.yandex = c9902lYandex;
        this.loadAd = c16876l;
        this.crashlytics = c9902lYandex2;
    }
}
