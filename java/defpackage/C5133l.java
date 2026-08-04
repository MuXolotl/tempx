package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lؗۙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5133l extends C10628l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C0458l f11167l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C0458l f11168l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f11170l = -1;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f11169l = -1;

    public C5133l(C0458l c0458l, C0458l c0458l2) {
        this.f11167l = c0458l;
        this.f11168l = c0458l2;
    }

    public final void adcel(C8744l c8744l, C3214l c3214l, SurfaceTexture surfaceTexture, C0458l c0458l, int i, boolean z) {
        metrica(i);
        int i2 = c8744l.loadAd;
        int i3 = c8744l.crashlytics;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, z ? c3214l.f6908l : c3214l.f6912l, 0);
        AbstractC11825l abstractC11825l = (AbstractC11825l) this.f21571l;
        abstractC11825l.getClass();
        if (abstractC11825l instanceof C11124l) {
            GLES20.glUniformMatrix4fv(((C11124l) abstractC11825l).billing, 1, false, fArr2, 0);
            AbstractC6123l.loadAd("glUniformMatrix4fv");
        }
        C17879l c17879l = (C17879l) c0458l.f1690l;
        Object obj = c17879l.yandex;
        Object obj2 = c17879l.loadAd;
        Size size = new Size((int) (((Float) c17879l.yandex).floatValue() * i2), (int) (((Float) obj2).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        C17879l c17879l2 = (C17879l) c0458l.f1691l;
        if (((Float) obj).floatValue() != 0.0f || ((Float) obj2).floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, ((Float) c17879l2.yandex).floatValue() / ((Float) obj).floatValue(), ((Float) c17879l2.loadAd).floatValue() / ((Float) obj2).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(abstractC11825l.loadAd, 1, false, fArr5, 0);
        AbstractC6123l.loadAd("glUniformMatrix4fv");
        GLES20.glUniform1f(abstractC11825l.crashlytics, 1.0f);
        AbstractC6123l.loadAd("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC6123l.loadAd("glDrawArrays");
        GLES20.glDisable(3042);
    }

    @Override // defpackage.C10628l
    public final C8433l admob(C15421l c15421l) {
        Map map = Collections.EMPTY_MAP;
        C8433l c8433lAdmob = super.admob(c15421l);
        this.f11170l = AbstractC6123l.admob();
        this.f11169l = AbstractC6123l.admob();
        return c8433lAdmob;
    }

    public final void startapp(long j, Surface surface, C3214l c3214l, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        AbstractC6123l.amazon((AtomicBoolean) this.f21563l, true);
        AbstractC6123l.crashlytics((Thread) this.f21569l);
        HashMap map = (HashMap) this.f21570l;
        AbstractC5641l.purchase("The surface is not registered.", map.containsKey(surface));
        C8744l c8744lCrashlytics = (C8744l) map.get(surface);
        Objects.requireNonNull(c8744lCrashlytics);
        if (c8744lCrashlytics == AbstractC6123l.isPro) {
            c8744lCrashlytics = crashlytics(surface);
            if (c8744lCrashlytics == null) {
                return;
            } else {
                map.put(surface, c8744lCrashlytics);
            }
        }
        C8744l c8744l = c8744lCrashlytics;
        EGLSurface eGLSurface = c8744l.yandex;
        if (surface != ((Surface) this.f21568l)) {
            isPro(eGLSurface);
            this.f21568l = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        adcel(c8744l, c3214l, surfaceTexture, this.f11167l, this.f11170l, true);
        adcel(c8744l, c3214l, surfaceTexture2, this.f11168l, this.f11169l, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f21573l, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f21573l, eGLSurface)) {
            return;
        }
        AbstractC5088l.tapsense("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        remoteconfig(surface, false);
    }
}
