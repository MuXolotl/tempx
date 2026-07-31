package defpackage;

import android.util.Size;

/* JADX INFO: renamed from: lؘؙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5513l {
    public static final Size yandex = new Size(0, 0);
    public static final Size loadAd = new Size(320, 240);
    public static final Size crashlytics = new Size(640, 480);
    public static final Size amazon = new Size(720, 480);
    public static final Size purchase = new Size(1280, 720);
    public static final Size billing = new Size(1920, 1080);
    public static final Size mopub = new Size(1920, 1440);

    static {
        new Size(2560, 1440);
        new Size(3840, 2160);
    }

    public static int yandex(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
