package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: renamed from: l٘ۥٌ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceHolderCallbackC18330l implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ C17804l yandex;

    public SurfaceHolderCallbackC18330l(C17804l c17804l) {
        this.yandex = c17804l;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        C17804l c17804l = this.yandex;
        c17804l.m4423l(surface);
        c17804l.f34733l = surface;
        c17804l.m4433l(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C17804l c17804l = this.yandex;
        c17804l.m4423l(null);
        c17804l.m4433l(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.yandex.m4433l(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.yandex.m4433l(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C17804l c17804l = this.yandex;
        if (c17804l.f34689l) {
            c17804l.m4423l(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C17804l c17804l = this.yandex;
        if (c17804l.f34689l) {
            c17804l.m4423l(null);
        }
        c17804l.m4433l(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
