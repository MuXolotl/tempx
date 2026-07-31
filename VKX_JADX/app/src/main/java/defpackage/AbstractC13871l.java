package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٓؑۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13871l implements InterfaceC5755l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public volatile int f27127l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Executor f27128l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C6344l f27131l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public ByteBuffer f27132l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile int f27133l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC10782l f27134l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public ByteBuffer f27135l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public ByteBuffer f27136l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public ByteBuffer f27138l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile boolean f27139l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public ImageWriter f27142l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public volatile boolean f27143l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public ByteBuffer f27145l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public ByteBuffer f27146l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public volatile int f27140l = 1;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Rect f27137l = new Rect();

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Rect f27144l = new Rect();

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public Matrix f27141l = new Matrix();

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public Matrix f27126l = new Matrix();

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final Object f27130l = new Object();

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public boolean f27129l = true;

    public final void admob(Executor executor, InterfaceC10782l interfaceC10782l) {
        if (interfaceC10782l == null) {
            crashlytics();
        }
        synchronized (this.f27130l) {
            this.f27134l = interfaceC10782l;
            this.f27128l = executor;
        }
    }

    public final void amazon(InterfaceC11792l interfaceC11792l) {
        if (this.f27140l != 1 && this.f27140l != 3) {
            if (this.f27140l == 2 && this.f27145l == null) {
                this.f27145l = ByteBuffer.allocateDirect(interfaceC11792l.loadAd() * interfaceC11792l.purchase() * 4);
                return;
            }
            return;
        }
        if (this.f27138l == null) {
            this.f27138l = ByteBuffer.allocateDirect(interfaceC11792l.loadAd() * interfaceC11792l.purchase());
        }
        this.f27138l.position(0);
        if (this.f27132l == null) {
            this.f27132l = ByteBuffer.allocateDirect((interfaceC11792l.loadAd() * interfaceC11792l.purchase()) / 4);
        }
        this.f27132l.position(0);
        if (this.f27136l == null) {
            this.f27136l = ByteBuffer.allocateDirect((interfaceC11792l.loadAd() * interfaceC11792l.purchase()) / 4);
        }
        this.f27136l.position(0);
        if (this.f27140l == 3) {
            if (this.f27146l == null) {
                this.f27146l = ByteBuffer.allocateDirect(interfaceC11792l.loadAd() * interfaceC11792l.purchase());
            }
            this.f27146l.position(0);
            if (this.f27135l == null) {
                this.f27135l = ByteBuffer.allocateDirect((interfaceC11792l.loadAd() * interfaceC11792l.purchase()) / 2);
            }
            this.f27135l.position(0);
        }
    }

    public final void billing(int i, int i2, int i3, int i4) {
        int i5 = this.f27133l;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = AbstractC18611l.yandex;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f27137l);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f27144l = rect;
        this.f27126l.setConcat(this.f27141l, matrix);
    }

    public abstract void crashlytics();

    public final void firebase(Matrix matrix) {
        synchronized (this.f27130l) {
            this.f27141l = matrix;
            this.f27126l = new Matrix(this.f27141l);
        }
    }

    public final void isPro(C6344l c6344l) {
        synchronized (this.f27130l) {
            this.f27131l = c6344l;
        }
    }

    public final ListenableFuture loadAd(final InterfaceC11792l interfaceC11792l) throws Throwable {
        Object obj;
        Executor executor;
        final InterfaceC10782l interfaceC10782l;
        boolean z;
        C6344l c6344l;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        C1282l c1282lMopub;
        C1282l c1282l;
        int i = this.f27139l ? this.f27133l : 0;
        Object obj2 = this.f27130l;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f27128l;
                    interfaceC10782l = this.f27134l;
                    z = this.f27139l && i != this.f27127l;
                    if (z) {
                        mopub(interfaceC11792l, i);
                    }
                    if (this.f27139l || this.f27140l == 3) {
                        amazon(interfaceC11792l);
                    }
                    try {
                        c6344l = this.f27131l;
                        try {
                            imageWriter = this.f27142l;
                            byteBuffer = this.f27145l;
                            byteBuffer2 = this.f27138l;
                            byteBuffer3 = this.f27132l;
                            byteBuffer4 = this.f27136l;
                            byteBuffer5 = this.f27146l;
                            byteBuffer6 = this.f27135l;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        if (interfaceC10782l == null || executor == null || !this.f27129l) {
            return new C11077l(1, new C6451l("No analyzer or executor currently set."));
        }
        int i2 = this.f27140l;
        if (c6344l != null) {
            if (i2 == 2) {
                c1282lMopub = ImageProcessingUtil.loadAd(interfaceC11792l, c6344l, byteBuffer, i, this.f27143l);
            } else {
                if (this.f27140l == 1) {
                    if (this.f27143l) {
                        ImageProcessingUtil.yandex(interfaceC11792l);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        c1282lMopub = ImageProcessingUtil.billing(interfaceC11792l, c6344l, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                c1282l = null;
            }
            c1282l = c1282lMopub;
        } else {
            if (i2 == 3) {
                if (this.f27143l) {
                    ImageProcessingUtil.yandex(interfaceC11792l);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    c1282lMopub = ImageProcessingUtil.mopub(interfaceC11792l, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                    c1282l = c1282lMopub;
                }
            }
            c1282l = null;
        }
        boolean z2 = c1282l == null;
        final InterfaceC11792l interfaceC11792l2 = z2 ? interfaceC11792l : c1282l;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f27130l) {
            if (z && !z2) {
                try {
                    billing(interfaceC11792l.purchase(), interfaceC11792l.loadAd(), interfaceC11792l2.purchase(), interfaceC11792l2.loadAd());
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            this.f27127l = i;
            rect.set(this.f27144l);
            matrix.set(this.f27126l);
        }
        final C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            executor.execute(new Runnable() { // from class: lؚۧۧ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC13871l abstractC13871l = this.f16091l;
                    InterfaceC11792l interfaceC11792l3 = interfaceC11792l;
                    Matrix matrix2 = matrix;
                    InterfaceC11792l interfaceC11792l4 = interfaceC11792l2;
                    Rect rect2 = rect;
                    InterfaceC10782l interfaceC10782l2 = interfaceC10782l;
                    C5807l c5807l2 = c5807l;
                    if (!abstractC13871l.f27129l) {
                        c5807l2.amazon(new C6451l("ImageAnalysis is detached"));
                        return;
                    }
                    C15607l c15607l = new C15607l(interfaceC11792l4, null, new C2817l(interfaceC11792l3.mo1829const().yandex(), interfaceC11792l3.mo1829const().crashlytics(), abstractC13871l.f27139l ? 0 : abstractC13871l.f27133l, matrix2, interfaceC11792l3.mo1829const().loadAd()));
                    if (!rect2.isEmpty()) {
                        Rect rect3 = new Rect(rect2);
                        if (!rect3.intersect(0, 0, c15607l.f30463l, c15607l.f30460l)) {
                            rect3.setEmpty();
                        }
                        synchronized (c15607l.f30462l) {
                        }
                    }
                    interfaceC10782l2.isPro(c15607l);
                    c5807l2.loadAd(null);
                }
            });
            c5807l.yandex = "analyzeImage";
            return c16565l;
        } catch (Exception e) {
            c16565l.loadAd(e);
            return c16565l;
        }
    }

    public final void mopub(InterfaceC11792l interfaceC11792l, int i) {
        C6344l c6344l = this.f27131l;
        if (c6344l == null) {
            return;
        }
        c6344l.subs();
        int iPurchase = interfaceC11792l.purchase();
        int iLoadAd = interfaceC11792l.loadAd();
        int iMetrica = this.f27131l.metrica();
        int iMo1997strictfp = this.f27131l.mo1997strictfp();
        boolean z = i == 90 || i == 270;
        int i2 = z ? iLoadAd : iPurchase;
        if (!z) {
            iPurchase = iLoadAd;
        }
        this.f27131l = new C6344l(AbstractC6159l.yandex(i2, iPurchase, iMetrica, iMo1997strictfp));
        if (this.f27140l == 1) {
            ImageWriter imageWriter = this.f27142l;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.f27142l = ImageWriter.newInstance(this.f27131l.getSurface(), this.f27131l.mo1997strictfp());
        }
    }

    public abstract void purchase(InterfaceC11792l interfaceC11792l);

    public final void smaato(Rect rect) {
        synchronized (this.f27130l) {
            this.f27137l = rect;
            this.f27144l = new Rect(this.f27137l);
        }
    }

    @Override // defpackage.InterfaceC5755l
    public final void subs(InterfaceC12679l interfaceC12679l) {
        try {
            InterfaceC11792l interfaceC11792lYandex = yandex(interfaceC12679l);
            if (interfaceC11792lYandex != null) {
                purchase(interfaceC11792lYandex);
            }
        } catch (IllegalStateException e) {
            AbstractC5088l.amazon("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public abstract InterfaceC11792l yandex(InterfaceC12679l interfaceC12679l);
}
