package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؘؕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3214l implements Closeable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f6902l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC13241l f6903l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Executor f6904l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Surface f6905l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float[] f6908l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Size f6909l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C5807l f6910l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final float[] f6912l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C16565l f6913l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f6906l = new Object();

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f6911l = false;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f6907l = false;

    public C3214l(Surface surface, int i, Size size, C2005l c2005l, C2005l c2005l2) {
        float[] fArr = new float[16];
        this.f6908l = fArr;
        float[] fArr2 = new float[16];
        this.f6912l = fArr2;
        this.f6905l = surface;
        this.f6902l = i;
        this.f6909l = size;
        yandex(fArr, new float[16], c2005l);
        yandex(fArr2, new float[16], c2005l2);
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        try {
            this.f6910l = c5807l;
            c5807l.yandex = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        this.f6913l = c16565l;
    }

    public static void yandex(float[] fArr, float[] fArr2, C2005l c2005l) {
        Matrix.setIdentityM(fArr, 0);
        if (c2005l == null) {
            return;
        }
        Size size = c2005l.yandex;
        boolean z = c2005l.purchase;
        int i = c2005l.amazon;
        AbstractC18648l.purchase(fArr);
        AbstractC18648l.amazon(fArr, i);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeAdmob = AbstractC18611l.admob(i, size);
        android.graphics.Matrix matrixYandex = AbstractC18611l.yandex(AbstractC18611l.subs(size), AbstractC18611l.subs(sizeAdmob), i, z);
        RectF rectF = new RectF(c2005l.loadAd);
        matrixYandex.mapRect(rectF);
        float width = rectF.left / sizeAdmob.getWidth();
        float height = ((sizeAdmob.getHeight() - rectF.height()) - rectF.top) / sizeAdmob.getHeight();
        float fWidth = rectF.width() / sizeAdmob.getWidth();
        float fHeight = rectF.height() / sizeAdmob.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        InterfaceC18690l interfaceC18690l = c2005l.crashlytics;
        Matrix.setIdentityM(fArr2, 0);
        AbstractC18648l.purchase(fArr2);
        if (interfaceC18690l != null) {
            AbstractC5641l.purchase("Camera has no transform.", interfaceC18690l.metrica());
            AbstractC18648l.amazon(fArr2, interfaceC18690l.loadAd().crashlytics());
            if (interfaceC18690l.amazon()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public final Surface billing(ScheduledExecutorServiceC10335l scheduledExecutorServiceC10335l, InterfaceC13241l interfaceC13241l) {
        boolean z;
        synchronized (this.f6906l) {
            this.f6904l = scheduledExecutorServiceC10335l;
            this.f6903l = interfaceC13241l;
            z = this.f6911l;
        }
        if (z) {
            mopub();
        }
        return this.f6905l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f6906l) {
            try {
                if (!this.f6907l) {
                    this.f6907l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6910l.loadAd(null);
    }

    public final void mopub() {
        Executor executor;
        InterfaceC13241l interfaceC13241l;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f6906l) {
            try {
                if (this.f6904l == null || (interfaceC13241l = this.f6903l) == null) {
                    this.f6911l = true;
                } else if (!this.f6907l) {
                    atomicReference.set(interfaceC13241l);
                    executor = this.f6904l;
                    this.f6911l = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new RunnableC10311l(this, atomicReference, 11));
            } catch (RejectedExecutionException e) {
                AbstractC5088l.loadAd("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
            }
        }
    }
}
