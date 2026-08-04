package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

/* JADX INFO: renamed from: lّٚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceHolderC12693l implements SurfaceHolder {
    public SurfaceHolder.Callback crashlytics;
    public final Rect loadAd;
    public final Surface yandex;

    public SurfaceHolderC12693l(Surface surface, int i, int i2) {
        Rect rect = new Rect();
        this.loadAd = rect;
        this.yandex = surface;
        rect.set(0, 0, i, i2);
    }

    @Override // android.view.SurfaceHolder
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.crashlytics = callback;
    }

    @Override // android.view.SurfaceHolder
    public final Surface getSurface() {
        return this.yandex;
    }

    @Override // android.view.SurfaceHolder
    public final Rect getSurfaceFrame() {
        return this.loadAd;
    }

    @Override // android.view.SurfaceHolder
    public final boolean isCreating() {
        return false;
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.SurfaceHolder
    public final void removeCallback(SurfaceHolder.Callback callback) {
        if (this.crashlytics == callback) {
            this.crashlytics = null;
        }
    }

    @Override // android.view.SurfaceHolder
    public final void setFixedSize(int i, int i2) {
        this.loadAd.set(0, 0, i, i2);
        SurfaceHolder.Callback callback = this.crashlytics;
        if (callback != null) {
            callback.surfaceChanged(this, 1, i, i2);
        }
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    public SurfaceHolderC12693l(Surface surface) {
        this.loadAd = new Rect();
        this.yandex = surface;
    }

    @Override // android.view.SurfaceHolder
    public final void setSizeFromLayout() {
    }

    @Override // android.view.SurfaceHolder
    public final void setFormat(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void setKeepScreenOn(boolean z) {
    }

    @Override // android.view.SurfaceHolder
    public final void setType(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void unlockCanvasAndPost(Canvas canvas) {
    }
}
