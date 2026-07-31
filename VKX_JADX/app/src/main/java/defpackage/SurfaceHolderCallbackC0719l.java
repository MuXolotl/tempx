package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: renamed from: lؘؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceHolderCallbackC0719l implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ C13208l yandex;

    public SurfaceHolderCallbackC0719l(C13208l c13208l) {
        this.yandex = c13208l;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C13208l c13208l = this.yandex;
        if (c13208l.premium == surfaceHolder && c13208l.mo319l()) {
            if (c13208l.m3611l() >= 8) {
                c13208l.m3599l(new C5015l(this, i2, i3));
            }
            c13208l.m3604l(i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C13208l c13208l = this.yandex;
        if (c13208l.premium != surfaceHolder) {
            return;
        }
        c13208l.signatures = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        c13208l.m3605l(c13208l.signatures, surfaceFrame.width(), surfaceFrame.height());
        c13208l.m3604l(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C13208l c13208l = this.yandex;
        if (c13208l.premium != surfaceHolder) {
            return;
        }
        c13208l.signatures = null;
        c13208l.m3605l(null, 0, 0);
        c13208l.m3604l(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
