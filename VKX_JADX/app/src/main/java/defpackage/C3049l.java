package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;

/* JADX INFO: renamed from: lؔۦٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3049l {
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public volatile C15053l loadAd;
    public final Matrix mopub;
    public final int purchase;
    public volatile Bitmap yandex;

    public C3049l(Bitmap bitmap) {
        AbstractC1051l.subs(bitmap);
        this.yandex = bitmap;
        this.crashlytics = bitmap.getWidth();
        this.amazon = bitmap.getHeight();
        loadAd(0);
        this.purchase = 0;
        this.billing = -1;
        this.mopub = null;
    }

    public static void loadAd(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        AbstractC1051l.crashlytics(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
    }

    public final Image.Plane[] yandex() {
        if (this.loadAd == null) {
            return null;
        }
        return ((Image) this.loadAd.f29576l).getPlanes();
    }

    public C3049l(Image image, int i, int i2, int i3, Matrix matrix) {
        this.loadAd = new C15053l(image);
        this.crashlytics = i;
        this.amazon = i2;
        loadAd(i3);
        this.purchase = i3;
        this.billing = 35;
        this.mopub = matrix;
    }
}
