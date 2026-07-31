package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: lۡ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerThreadC18641l extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Error f36427l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Handler f36428l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public RunnableC4260l f36429l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C2119l f36430l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public RuntimeException f36431l;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    yandex(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e) {
                    AbstractC6427l.subs("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f36427l = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    AbstractC6427l.subs("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f36431l = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (C9373l e3) {
                    AbstractC6427l.subs("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f36431l = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    loadAd();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        AbstractC6427l.subs("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final void loadAd() {
        this.f36429l.getClass();
        RunnableC4260l runnableC4260l = this.f36429l;
        runnableC4260l.f8741l.removeCallbacks(runnableC4260l);
        try {
            SurfaceTexture surfaceTexture = runnableC4260l.f8744l;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC4260l.f8740l, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC4260l.f8739l;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC4260l.f8739l;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC4260l.f8742l;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC4260l.f8739l, runnableC4260l.f8742l);
            }
            EGLContext eGLContext = runnableC4260l.f8743l;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC4260l.f8739l, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = runnableC4260l.f8739l;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC4260l.f8739l);
            }
            runnableC4260l.f8739l = null;
            runnableC4260l.f8743l = null;
            runnableC4260l.f8742l = null;
            runnableC4260l.f8744l = null;
        }
    }

    public final void yandex(int i) throws C9373l {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f36429l.getClass();
        RunnableC4260l runnableC4260l = this.f36429l;
        int[] iArr = runnableC4260l.f8740l;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC15235l.yandex("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        AbstractC15235l.yandex("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        runnableC4260l.f8739l = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC4260l.f8738l, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = AbstractC15323l.yandex;
        AbstractC15235l.yandex(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC4260l.f8739l, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC15235l.yandex("eglCreateContext failed", eGLContextEglCreateContext != null);
        runnableC4260l.f8743l = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = runnableC4260l.f8739l;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC15235l.yandex("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        AbstractC15235l.yandex("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        runnableC4260l.f8742l = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb = new StringBuilder();
        AbstractC12832l.loadAd(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z2) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i3 = i2 + 1;
            int iLoadAd = AbstractC3594l.loadAd(objArrCopyOf.length, i3);
            if (iLoadAd > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd);
            }
            objArrCopyOf[i2] = numValueOf;
            i2 = i3;
            z2 = true;
        }
        if (z2) {
            throw new C9373l(sb.toString(), AbstractC1186l.vip(i2, objArrCopyOf));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        runnableC4260l.f8744l = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC4260l);
        SurfaceTexture surfaceTexture2 = this.f36429l.f8744l;
        surfaceTexture2.getClass();
        this.f36430l = new C2119l(this, surfaceTexture2, i != 0);
    }
}
