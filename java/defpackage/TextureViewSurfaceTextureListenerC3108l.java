package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: renamed from: lؕؐۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC3108l implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C3608l yandex;

    public TextureViewSurfaceTextureListenerC3108l(C3608l c3608l) {
        this.yandex = c3608l;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC5088l.yandex("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
        C3608l c3608l = this.yandex;
        c3608l.billing = surfaceTexture;
        if (c3608l.mopub == null) {
            c3608l.admob();
            return;
        }
        c3608l.admob.getClass();
        AbstractC5088l.yandex("TextureViewImpl", "Surface invalidated " + c3608l.admob);
        c3608l.admob.remoteconfig.yandex();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C3608l c3608l = this.yandex;
        c3608l.billing = null;
        C16565l c16565l = c3608l.mopub;
        if (c16565l == null) {
            AbstractC5088l.yandex("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        C18396l c18396l = new C18396l(this, surfaceTexture, false, 25);
        c16565l.yandex(new RunnableC9929l(c16565l, c18396l, 0), AbstractC7720l.amazon(c3608l.purchase.getContext()));
        c3608l.isPro = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC5088l.yandex("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C5807l c5807l = (C5807l) this.yandex.firebase.getAndSet(null);
        if (c5807l != null) {
            c5807l.loadAd(null);
        }
    }
}
