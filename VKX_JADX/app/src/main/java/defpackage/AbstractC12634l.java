package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lّٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12634l {
    public static final C5192l crashlytics;
    public static final C5192l loadAd;
    public static final C5192l yandex;

    static {
        HashMap map = C5192l.crashlytics;
        C2336l c2336l = AbstractC18202l.yandex;
        yandex = AbstractC8265l.loadAd(c2336l.loadAd(Integer.class), "androidx.camera.camera2.pipe.extensionMode");
        loadAd = AbstractC8265l.loadAd(c2336l.loadAd(Object.class), "androidx.camera.camera2.pipe.captureRequestTag");
        crashlytics = AbstractC8265l.loadAd(c2336l.loadAd(Boolean.class), "androidx.camera.camera2.pipe.ignore3ARequiredParameters");
    }
}
