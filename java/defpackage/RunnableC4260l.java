package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: renamed from: lٜؖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4260l implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final int[] f8738l = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public EGLDisplay f8739l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int[] f8740l = new int[1];

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Handler f8741l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public EGLSurface f8742l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public EGLContext f8743l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public SurfaceTexture f8744l;

    public RunnableC4260l(Handler handler) {
        this.f8741l = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f8741l.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f8744l;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
