package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؘۧٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6123l {
    public static final FloatBuffer admob;
    public static final String amazon;
    public static final C6743l billing;
    public static final String crashlytics;
    public static final C8744l isPro;
    public static final C6743l mopub;
    public static final C6743l purchase;
    public static final FloatBuffer subs;
    public static final int[] yandex = {12344};
    public static final int[] loadAd = {12445, 13632, 12344};

    static {
        Locale locale = Locale.US;
        crashlytics = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        amazon = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        purchase = new C6743l(0);
        billing = new C6743l(1);
        mopub = new C6743l(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        admob = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        subs = floatBufferAsFloatBuffer2;
        isPro = new C8744l(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static int admob() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        loadAd("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        loadAd("glBindTexture " + i);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        loadAd("glTexParameter");
        return i;
    }

    public static void amazon(AtomicBoolean atomicBoolean, boolean z) {
        AbstractC5641l.purchase(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
    }

    public static int[] billing(String str, C15421l c15421l) {
        int i = c15421l.yandex;
        int[] iArr = yandex;
        if (i == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return loadAd;
            }
            AbstractC5088l.tapsense("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static void crashlytics(Thread thread) {
        AbstractC5641l.purchase("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static int firebase(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        loadAd("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        AbstractC5088l.tapsense("GLUtils", "Could not compile shader: " + str);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i + ":" + strGlGetShaderInfoLog);
    }

    public static String isPro() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return AbstractC9361l.pro(strGroup, ".", strGroup2);
    }

    public static void loadAd(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        C10754l.tapsense(AbstractC5020l.advert(str, ": GL error 0x"), Integer.toHexString(iGlGetError));
    }

    public static HashMap mopub(C15421l c15421l) {
        Object c11124l;
        EnumC15109l enumC15109l;
        Map map = Collections.EMPTY_MAP;
        HashMap map2 = new HashMap();
        EnumC15109l[] enumC15109lArrValues = EnumC15109l.values();
        int length = enumC15109lArrValues.length;
        for (int i = 0; i < length; i++) {
            EnumC15109l enumC15109l2 = enumC15109lArrValues[i];
            C6743l c6743l = (C6743l) map.get(enumC15109l2);
            if (c6743l != null) {
                c11124l = new C11124l(c15421l, c6743l);
            } else if (enumC15109l2 == EnumC15109l.f29639l || enumC15109l2 == (enumC15109l = EnumC15109l.f29640l)) {
                c11124l = new C11124l(c15421l, enumC15109l2);
            } else {
                AbstractC5641l.purchase("Unhandled input format: " + enumC15109l2, enumC15109l2 == EnumC15109l.f29641l);
                if (c15421l.yandex()) {
                    c11124l = new C15844l("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    C6743l c6743l2 = (C6743l) map.get(enumC15109l);
                    c11124l = c6743l2 != null ? new C11124l(c15421l, c6743l2) : new C11124l(c15421l, enumC15109l);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + enumC15109l2 + " created: " + c11124l);
            map2.put(enumC15109l2, c11124l);
        }
        return map2;
    }

    public static void purchase(int i, String str) {
        if (i >= 0) {
            return;
        }
        C8339l.smaato(AbstractC15560l.Signature("Unable to locate '", str, "' in program"));
    }

    public static EGLSurface subs(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        yandex("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        C8339l.smaato("surface was null");
        return null;
    }

    public static void yandex(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        C10754l.tapsense(AbstractC5020l.advert(str, ": EGL error: 0x"), Integer.toHexString(iEglGetError));
    }
}
