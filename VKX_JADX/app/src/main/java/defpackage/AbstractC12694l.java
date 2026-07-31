package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lّٚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12694l {
    public boolean amazon = false;
    public final C8788l crashlytics;
    public final FrameLayout loadAd;
    public Size yandex;

    public AbstractC12694l(FrameLayout frameLayout, C8788l c8788l) {
        this.loadAd = frameLayout;
        this.crashlytics = c8788l;
    }

    public abstract void amazon();

    public final void billing() {
        View viewYandex = yandex();
        if (viewYandex == null || !this.amazon) {
            return;
        }
        FrameLayout frameLayout = this.loadAd;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        C8788l c8788l = this.crashlytics;
        c8788l.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            AbstractC5088l.tapsense("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (c8788l.admob()) {
            if (viewYandex instanceof TextureView) {
                ((TextureView) viewYandex).setTransform(c8788l.billing());
            } else {
                Display display = viewYandex.getDisplay();
                boolean z = false;
                boolean z2 = (!c8788l.amazon || display == null || display.getRotation() == c8788l.loadAd) ? false : true;
                boolean z3 = c8788l.amazon;
                if (!z3) {
                    if ((!z3 ? c8788l.yandex : -AbstractC7799l.purchase(c8788l.loadAd)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    AbstractC5088l.crashlytics("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFMopub = c8788l.mopub(layoutDirection, size);
            viewYandex.setPivotX(0.0f);
            viewYandex.setPivotY(0.0f);
            viewYandex.setScaleX(rectFMopub.width() / ((Size) c8788l.purchase).getWidth());
            viewYandex.setScaleY(rectFMopub.height() / ((Size) c8788l.purchase).getHeight());
            viewYandex.setTranslationX(rectFMopub.left - viewYandex.getLeft());
            viewYandex.setTranslationY(rectFMopub.top - viewYandex.getTop());
        }
    }

    public abstract void crashlytics();

    public abstract Bitmap loadAd();

    public abstract ListenableFuture mopub();

    public abstract void purchase(C15691l c15691l, C17706l c17706l);

    public abstract View yandex();
}
