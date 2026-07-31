package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lَّۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C10628l implements InterfaceC12145l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public Object f21562l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f21563l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f21564l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f21565l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int[] f21566l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f21567l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Object f21568l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f21569l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f21570l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public Object f21571l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f21572l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f21573l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Object f21574l;

    public C10628l() {
        this.f21563l = new AtomicBoolean(false);
        this.f21570l = new HashMap();
        this.f21573l = EGL14.EGL_NO_DISPLAY;
        this.f21564l = EGL14.EGL_NO_CONTEXT;
        this.f21566l = AbstractC6123l.yandex;
        this.f21572l = EGL14.EGL_NO_SURFACE;
        this.f21574l = Collections.EMPTY_MAP;
        this.f21571l = null;
        this.f21562l = EnumC15109l.f29641l;
        this.f21567l = -1;
    }

    public C8433l admob(C15421l c15421l) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f21563l;
        AbstractC6123l.amazon(atomicBoolean, false);
        C12014l c12014l = new C12014l(4, false);
        c12014l.f23941l = "0.0";
        c12014l.f23940l = "0.0";
        c12014l.f23944l = "";
        c12014l.f23943l = "";
        try {
            if (c15421l.yandex()) {
                C17879l c17879lMopub = mopub(c15421l);
                String str = (String) c17879lMopub.yandex;
                str.getClass();
                String str2 = (String) c17879lMopub.loadAd;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    AbstractC5088l.tapsense("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    c15421l = C15421l.amazon;
                }
                this.f21566l = AbstractC6123l.billing(str2, c15421l);
                c12014l.f23944l = str;
                c12014l.f23943l = str2;
            }
            loadAd(c15421l, c12014l);
            amazon();
            isPro((EGLSurface) this.f21572l);
            c12014l.f23941l = AbstractC6123l.isPro();
            this.f21574l = AbstractC6123l.mopub(c15421l);
            int iAdmob = AbstractC6123l.admob();
            this.f21567l = iAdmob;
            metrica(iAdmob);
            this.f21569l = Thread.currentThread();
            atomicBoolean.set(true);
            String strConcat = ((String) c12014l.f23944l) == null ? "".concat(" glExtensions") : "";
            if (((String) c12014l.f23943l) == null) {
                strConcat = strConcat.concat(" eglExtensions");
            }
            if (strConcat.isEmpty()) {
                return new C8433l((String) c12014l.f23941l, (String) c12014l.f23940l, (String) c12014l.f23944l, (String) c12014l.f23943l);
            }
            C8339l.smaato("Missing required properties:".concat(strConcat));
            return null;
        } catch (IllegalArgumentException e) {
            e = e;
            smaato();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            smaato();
            throw e;
        }
    }

    public void amazon() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f21573l;
        EGLConfig eGLConfig = (EGLConfig) this.f21565l;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = AbstractC6123l.yandex;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        AbstractC6123l.yandex("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            this.f21572l = eGLSurfaceEglCreatePbufferSurface;
        } else {
            C8339l.smaato("surface was null");
        }
    }

    public float billing(int i, int i2, boolean z) {
        InterfaceC8097l interfaceC8097l;
        float f;
        C16761l c16761l = (C16761l) this.f21563l;
        if (i >= c16761l.loadAd - 1) {
            f = i2;
        } else {
            int iCrashlytics = c16761l.crashlytics(i);
            int iCrashlytics2 = c16761l.crashlytics(i + 1);
            if (i2 != iCrashlytics) {
                int i3 = iCrashlytics2 - iCrashlytics;
                C2469l c2469l = (C2469l) ((C16977l) this.f21570l).loadAd(iCrashlytics);
                if (c2469l == null || (interfaceC8097l = c2469l.loadAd) == null) {
                    interfaceC8097l = (InterfaceC8097l) this.f21569l;
                }
                float f2 = i3;
                float fYandex = interfaceC8097l.yandex((i2 - iCrashlytics) / f2);
                return z ? fYandex : ((f2 * fYandex) + iCrashlytics) / 1000.0f;
            }
            f = iCrashlytics;
        }
        return f / 1000.0f;
    }

    public C8744l crashlytics(Surface surface) {
        try {
            try {
                EGLDisplay eGLDisplay = (EGLDisplay) this.f21573l;
                EGLConfig eGLConfig = (EGLConfig) this.f21565l;
                Objects.requireNonNull(eGLConfig);
                EGLSurface eGLSurfaceSubs = AbstractC6123l.subs(eGLDisplay, eGLConfig, surface, this.f21566l);
                EGLDisplay eGLDisplay2 = (EGLDisplay) this.f21573l;
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceSubs, 12375, iArr, 0);
                int i = iArr[0];
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceSubs, 12374, iArr2, 0);
                Size size = new Size(i, iArr2[0]);
                return new C8744l(eGLSurfaceSubs, size.getWidth(), size.getHeight());
            } catch (IllegalArgumentException e) {
                e = e;
                AbstractC5088l.Signature("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
                return null;
            }
        } catch (IllegalArgumentException | IllegalStateException e2) {
            e = e2;
            AbstractC5088l.Signature("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public void firebase(Surface surface) {
        AbstractC6123l.amazon((AtomicBoolean) this.f21563l, true);
        AbstractC6123l.crashlytics((Thread) this.f21569l);
        HashMap map = (HashMap) this.f21570l;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, AbstractC6123l.isPro);
    }

    @Override // defpackage.InterfaceC12145l
    public int inmobi() {
        return this.f21567l;
    }

    public void isPro(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f21573l).getClass();
        ((EGLContext) this.f21564l).getClass();
        if (EGL14.eglMakeCurrent((EGLDisplay) this.f21573l, eGLSurface, eGLSurface, (EGLContext) this.f21564l)) {
            return;
        }
        C8339l.smaato("eglMakeCurrent failed");
    }

    public void loadAd(C15421l c15421l, C12014l c12014l) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f21573l = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            C8339l.smaato("Unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f21573l, iArr, 0, iArr, 1)) {
            this.f21573l = EGL14.EGL_NO_DISPLAY;
            C8339l.smaato("Unable to initialize EGL14");
            return;
        }
        if (c12014l != null) {
            c12014l.f23940l = iArr[0] + "." + iArr[1];
        }
        int i = c15421l.yandex() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f21573l, new int[]{12324, i, 12323, i, 12322, i, 12321, c15421l.yandex() ? 2 : 8, 12325, 0, 12326, 0, 12352, c15421l.yandex() ? 64 : 4, 12610, c15421l.yandex() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            C8339l.smaato("Unable to find a suitable EGLConfig");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f21573l, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c15421l.yandex() ? 3 : 2, 12344}, 0);
        AbstractC6123l.yandex("eglCreateContext");
        this.f21565l = eGLConfig;
        this.f21564l = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext((EGLDisplay) this.f21573l, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public void metrica(int i) {
        AbstractC11825l abstractC11825l = (AbstractC11825l) ((Map) this.f21574l).get((EnumC15109l) this.f21562l);
        if (abstractC11825l == null) {
            C1759l.isPro((EnumC15109l) this.f21562l, "Unable to configure program for input format: ");
            return;
        }
        if (((AbstractC11825l) this.f21571l) != abstractC11825l) {
            this.f21571l = abstractC11825l;
            abstractC11825l.loadAd();
            Log.d("OpenGlRenderer", "Using program for input format " + ((EnumC15109l) this.f21562l) + ": " + ((AbstractC11825l) this.f21571l));
        }
        GLES20.glActiveTexture(33984);
        AbstractC6123l.loadAd("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        AbstractC6123l.loadAd("glBindTexture");
    }

    public C17879l mopub(C15421l c15421l) {
        AbstractC6123l.amazon((AtomicBoolean) this.f21563l, false);
        try {
            loadAd(c15421l, null);
            amazon();
            isPro((EGLSurface) this.f21572l);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.f21573l, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new C17879l(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            AbstractC5088l.Signature("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new C17879l("", "");
        } finally {
            smaato();
        }
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: package */
    public AbstractC2249l mo1830package(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return subscription(mo1832volatile(abstractC2249l, abstractC2249l2, abstractC2249l3), abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    public int purchase(int i) {
        int i2;
        C16761l c16761l = (C16761l) this.f21563l;
        int i3 = c16761l.loadAd;
        if (i3 <= 0) {
            AbstractC13082l.amazon("");
            throw null;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = c16761l.yandex[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public void remoteconfig(Surface surface, boolean z) {
        if (((Surface) this.f21568l) == surface) {
            this.f21568l = null;
            isPro((EGLSurface) this.f21572l);
        }
        HashMap map = (HashMap) this.f21570l;
        C8744l c8744l = z ? (C8744l) map.remove(surface) : (C8744l) map.put(surface, AbstractC6123l.isPro);
        if (c8744l == null || c8744l == AbstractC6123l.isPro) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f21573l, c8744l.yandex);
        } catch (RuntimeException e) {
            AbstractC5088l.Signature("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    @Override // defpackage.InterfaceC12145l
    public int signatures() {
        return 0;
    }

    public void smaato() {
        HashMap map = (HashMap) this.f21570l;
        Iterator it = ((Map) this.f21574l).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((AbstractC11825l) it.next()).yandex);
        }
        this.f21574l = Collections.EMPTY_MAP;
        this.f21571l = null;
        if (!Objects.equals((EGLDisplay) this.f21573l, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f21573l;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (C8744l c8744l : map.values()) {
                if (!Objects.equals(c8744l.yandex, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f21573l, c8744l.yandex)) {
                    try {
                        AbstractC6123l.yandex("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        AbstractC5088l.amazon("GLUtils", e.toString(), e);
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.f21572l, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f21573l, (EGLSurface) this.f21572l);
                this.f21572l = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.f21564l, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f21573l, (EGLContext) this.f21564l);
                this.f21564l = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f21573l);
            this.f21573l = EGL14.EGL_NO_DISPLAY;
        }
        this.f21565l = null;
        this.f21567l = -1;
        this.f21562l = EnumC15109l.f29641l;
        this.f21568l = null;
        this.f21569l = null;
    }

    public void subs(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        float[] fArr;
        C16977l c16977l = (C16977l) this.f21570l;
        C16761l c16761l = (C16761l) this.f21563l;
        boolean z = ((C14965l) this.f21562l) != AbstractC6503l.crashlytics;
        if (((AbstractC2249l) this.f21564l) == null) {
            this.f21564l = abstractC2249l.crashlytics();
            this.f21565l = abstractC2249l3.crashlytics();
            int i = c16761l.loadAd;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = c16761l.crashlytics(i2) / 1000.0f;
            }
            this.f21573l = fArr2;
            int i3 = c16761l.loadAd;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.f21566l = iArr;
        }
        if (z) {
            if (((C14965l) this.f21562l) != AbstractC6503l.crashlytics && AbstractC8576l.yandex((AbstractC2249l) this.f21572l, abstractC2249l) && AbstractC8576l.yandex((AbstractC2249l) this.f21568l, abstractC2249l2)) {
                return;
            }
            this.f21572l = abstractC2249l;
            this.f21568l = abstractC2249l2;
            int iLoadAd = abstractC2249l.loadAd() + (abstractC2249l.loadAd() % 2);
            this.f21574l = new float[iLoadAd];
            this.f21571l = new float[iLoadAd];
            int i5 = c16761l.loadAd;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iCrashlytics = c16761l.crashlytics(i6);
                C2469l c2469l = (C2469l) c16977l.loadAd(iCrashlytics);
                if (iCrashlytics == 0 && c2469l == null) {
                    fArr = new float[iLoadAd];
                    for (int i7 = 0; i7 < iLoadAd; i7++) {
                        fArr[i7] = abstractC2249l.yandex(i7);
                    }
                } else if (iCrashlytics == this.f21567l && c2469l == null) {
                    fArr = new float[iLoadAd];
                    for (int i8 = 0; i8 < iLoadAd; i8++) {
                        fArr[i8] = abstractC2249l2.yandex(i8);
                    }
                } else {
                    AbstractC2249l abstractC2249l4 = c2469l.yandex;
                    float[] fArr4 = new float[iLoadAd];
                    for (int i9 = 0; i9 < iLoadAd; i9++) {
                        fArr4[i9] = abstractC2249l4.yandex(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.f21562l = new C14965l(this.f21566l, (float[]) this.f21573l, fArr3);
        }
    }

    @Override // defpackage.InterfaceC15930l
    public AbstractC2249l subscription(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        long j2 = j / 1000000;
        int[] iArr = AbstractC6503l.yandex;
        long j3 = this.f21567l;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return abstractC2249l3;
        }
        subs(abstractC2249l, abstractC2249l2, abstractC2249l3);
        AbstractC2249l abstractC2249l4 = (AbstractC2249l) this.f21565l;
        int i = 0;
        if (((C14965l) this.f21562l) != AbstractC6503l.crashlytics) {
            int i2 = (int) j4;
            float fBilling = billing(purchase(i2), i2, false);
            float[] fArr = (float[]) this.f21571l;
            C0425l[][] c0425lArr = (C0425l[][]) ((C14965l) this.f21562l).f29441l;
            float f = c0425lArr[0][0].yandex;
            float f2 = c0425lArr[c0425lArr.length - 1][0].loadAd;
            if (fBilling < f) {
                fBilling = f;
            }
            if (fBilling <= f2) {
                f2 = fBilling;
            }
            int length = fArr.length;
            boolean z = false;
            for (C0425l[] c0425lArr2 : c0425lArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    C0425l c0425l = c0425lArr2[i4];
                    if (f2 <= c0425l.loadAd) {
                        if (c0425l.startapp) {
                            fArr[i3] = c0425l.adcel;
                            fArr[i3 + 1] = c0425l.ads;
                        } else {
                            c0425l.crashlytics(f2);
                            fArr[i3] = c0425l.yandex();
                            fArr[i3 + 1] = c0425l.loadAd();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                abstractC2249l4.purchase(i, fArr[i]);
                i++;
            }
        } else {
            AbstractC2249l abstractC2249lMo1831throws = mo1831throws((j4 - 1) * 1000000, abstractC2249l, abstractC2249l2, abstractC2249l3);
            AbstractC2249l abstractC2249lMo1831throws2 = mo1831throws(j4 * 1000000, abstractC2249l, abstractC2249l2, abstractC2249l3);
            int iLoadAd = abstractC2249lMo1831throws.loadAd();
            while (i < iLoadAd) {
                abstractC2249l4.purchase(i, (abstractC2249lMo1831throws.yandex(i) - abstractC2249lMo1831throws2.yandex(i)) * 1000.0f);
                i++;
            }
        }
        return abstractC2249l4;
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: throws */
    public AbstractC2249l mo1831throws(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        AbstractC2249l abstractC2249l4;
        AbstractC2249l abstractC2249l5;
        AbstractC2249l abstractC2249l6 = abstractC2249l;
        AbstractC2249l abstractC2249l7 = abstractC2249l2;
        C16761l c16761l = (C16761l) this.f21563l;
        long j2 = j / 1000000;
        int[] iArr = AbstractC6503l.yandex;
        int i = this.f21567l;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        C16977l c16977l = (C16977l) this.f21570l;
        C2469l c2469l = (C2469l) c16977l.loadAd(i2);
        if (c2469l != null) {
            return c2469l.yandex;
        }
        if (i2 >= i) {
            return abstractC2249l7;
        }
        if (i2 <= 0) {
            return abstractC2249l6;
        }
        subs(abstractC2249l6, abstractC2249l7, abstractC2249l3);
        AbstractC2249l abstractC2249l8 = (AbstractC2249l) this.f21564l;
        int i3 = 0;
        if (((C14965l) this.f21562l) == AbstractC6503l.crashlytics) {
            int iPurchase = purchase(i2);
            float fBilling = billing(iPurchase, i2, true);
            C2469l c2469l2 = (C2469l) c16977l.loadAd(c16761l.crashlytics(iPurchase));
            if (c2469l2 != null && (abstractC2249l5 = c2469l2.yandex) != null) {
                abstractC2249l6 = abstractC2249l5;
            }
            C2469l c2469l3 = (C2469l) c16977l.loadAd(c16761l.crashlytics(iPurchase + 1));
            if (c2469l3 != null && (abstractC2249l4 = c2469l3.yandex) != null) {
                abstractC2249l7 = abstractC2249l4;
            }
            int iLoadAd = abstractC2249l8.loadAd();
            for (int i4 = 0; i4 < iLoadAd; i4++) {
                abstractC2249l8.purchase(i4, (abstractC2249l7.yandex(i4) * fBilling) + ((1.0f - fBilling) * abstractC2249l6.yandex(i4)));
            }
            return abstractC2249l8;
        }
        float fBilling2 = billing(purchase(i2), i2, false);
        float[] fArr = (float[]) this.f21574l;
        C0425l[][] c0425lArr = (C0425l[][]) ((C14965l) this.f21562l).f29441l;
        int length = c0425lArr.length - 1;
        float f = c0425lArr[0][0].yandex;
        float f2 = c0425lArr[length][0].loadAd;
        int length2 = fArr.length;
        if (fBilling2 < f || fBilling2 > f2) {
            if (fBilling2 > f2) {
                f = f2;
            } else {
                length = 0;
            }
            float f3 = fBilling2 - f;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length2 - 1) {
                C0425l c0425l = c0425lArr[length][i6];
                boolean z = c0425l.startapp;
                float f4 = c0425l.ads;
                float f5 = c0425l.adcel;
                if (z) {
                    float f6 = c0425l.yandex;
                    float f7 = c0425l.firebase;
                    float f8 = c0425l.crashlytics;
                    fArr[i5] = (f5 * f3) + AbstractC4338l.Signature(c0425l.purchase, f8, (f - f6) * f7, f8);
                    float f9 = (f - f6) * f7;
                    float f10 = c0425l.amazon;
                    fArr[i5 + 1] = (f4 * f3) + AbstractC4338l.Signature(c0425l.billing, f10, f9, f10);
                } else {
                    c0425l.crashlytics(f);
                    fArr[i5] = (c0425l.yandex() * f3) + (c0425l.vip * c0425l.admob) + f5;
                    fArr[i5 + 1] = (c0425l.loadAd() * f3) + (c0425l.metrica * c0425l.subs) + f4;
                }
                i5 += 2;
                i6++;
                c0425lArr = c0425lArr;
            }
        } else {
            int length3 = c0425lArr.length;
            int i7 = 0;
            boolean z2 = false;
            while (i7 < length3) {
                int i8 = i3;
                int i9 = i8;
                while (i8 < length2 - 1) {
                    C0425l c0425l2 = c0425lArr[i7][i9];
                    if (fBilling2 <= c0425l2.loadAd) {
                        if (c0425l2.startapp) {
                            float f11 = c0425l2.yandex;
                            float f12 = c0425l2.firebase;
                            float f13 = c0425l2.crashlytics;
                            fArr[i8] = AbstractC4338l.Signature(c0425l2.purchase, f13, (fBilling2 - f11) * f12, f13);
                            float f14 = c0425l2.amazon;
                            fArr[i8 + 1] = AbstractC4338l.Signature(c0425l2.billing, f14, (fBilling2 - f11) * f12, f14);
                        } else {
                            c0425l2.crashlytics(fBilling2);
                            fArr[i8] = (c0425l2.vip * c0425l2.admob) + c0425l2.adcel;
                            fArr[i8 + 1] = (c0425l2.metrica * c0425l2.subs) + c0425l2.ads;
                        }
                        z2 = true;
                    }
                    i8 += 2;
                    i9++;
                }
                if (z2) {
                    break;
                }
                i7++;
                i3 = 0;
            }
        }
        int length4 = fArr.length;
        for (int i10 = 0; i10 < length4; i10++) {
            abstractC2249l8.purchase(i10, fArr[i10]);
        }
        return abstractC2249l8;
    }

    public void vip(long j, float[] fArr, Surface surface) {
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
        int i = c8744lCrashlytics.crashlytics;
        int i2 = c8744lCrashlytics.loadAd;
        EGLSurface eGLSurface = c8744lCrashlytics.yandex;
        if (surface != ((Surface) this.f21568l)) {
            isPro(eGLSurface);
            this.f21568l = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        AbstractC11825l abstractC11825l = (AbstractC11825l) this.f21571l;
        abstractC11825l.getClass();
        if (abstractC11825l instanceof C11124l) {
            GLES20.glUniformMatrix4fv(((C11124l) abstractC11825l).billing, 1, false, fArr, 0);
            AbstractC6123l.loadAd("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC6123l.loadAd("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f21573l, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f21573l, eGLSurface)) {
            return;
        }
        AbstractC5088l.tapsense("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        remoteconfig(surface, false);
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: volatile */
    public long mo1832volatile(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return ((long) inmobi()) * 1000000;
    }

    @Override // defpackage.InterfaceC15930l
    public /* synthetic */ boolean yandex() {
        return false;
    }

    public C10628l(C16761l c16761l, C16977l c16977l, int i, InterfaceC8097l interfaceC8097l) {
        this.f21563l = c16761l;
        this.f21570l = c16977l;
        this.f21567l = i;
        this.f21569l = interfaceC8097l;
        this.f21566l = AbstractC6503l.yandex;
        float[] fArr = AbstractC6503l.loadAd;
        this.f21573l = fArr;
        this.f21574l = fArr;
        this.f21571l = fArr;
        this.f21562l = AbstractC6503l.crashlytics;
    }
}
