package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٓۜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14439l extends AbstractC12694l {
    public final SurfaceHolderCallbackC17042l billing;
    public SurfaceView purchase;

    public C14439l(FrameLayout frameLayout, C8788l c8788l) {
        super(frameLayout, c8788l);
        this.billing = new SurfaceHolderCallbackC17042l(this);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [lٌَٝ] */
    @Override // defpackage.AbstractC12694l
    public final Bitmap loadAd() {
        SurfaceView surfaceView = this.purchase;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.purchase.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.purchase.getWidth(), this.purchase.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        AbstractC11965l.Signature(this.purchase, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: lٌَٝ
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                Semaphore semaphore2 = semaphore;
                if (i == 0) {
                    AbstractC5088l.yandex("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    AbstractC5088l.crashlytics("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                }
                semaphore2.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                AbstractC5088l.crashlytics("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e) {
            AbstractC5088l.amazon("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // defpackage.AbstractC12694l
    public final ListenableFuture mopub() {
        return C11077l.f22285l;
    }

    @Override // defpackage.AbstractC12694l
    public final void purchase(C15691l c15691l, C17706l c17706l) {
        SurfaceView surfaceView = this.purchase;
        boolean zEquals = Objects.equals(this.yandex, c15691l.loadAd);
        if (surfaceView == null || !zEquals) {
            Size size = c15691l.loadAd;
            this.yandex = size;
            size.getClass();
            FrameLayout frameLayout = this.loadAd;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.purchase = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.yandex.getWidth(), this.yandex.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.purchase);
            this.purchase.getHolder().addCallback(this.billing);
        }
        Executor executorAmazon = AbstractC7720l.amazon(this.purchase.getContext());
        c15691l.smaato.yandex(new RunnableC6665l(6, c17706l), executorAmazon);
        this.purchase.post(new RunnableC15278l(this, c15691l, c17706l, 7));
    }

    @Override // defpackage.AbstractC12694l
    public final View yandex() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC12694l
    public final void amazon() {
    }

    @Override // defpackage.AbstractC12694l
    public final void crashlytics() {
    }
}
