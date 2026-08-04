package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٌ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8857l implements InterfaceC13989l, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ScheduledExecutorServiceC10335l f18207l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final float[] f18208l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final LinkedHashMap f18209l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final HandlerThread f18210l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10628l f18211l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f18212l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final AtomicBoolean f18213l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Handler f18214l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f18215l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final float[] f18216l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final ArrayList f18217l;

    public C8857l(C15421l c15421l) {
        Map map = Collections.EMPTY_MAP;
        this.f18213l = new AtomicBoolean(false);
        this.f18216l = new float[16];
        this.f18208l = new float[16];
        this.f18209l = new LinkedHashMap();
        this.f18215l = 0;
        this.f18212l = false;
        this.f18217l = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f18210l = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f18214l = handler;
        this.f18207l = new ScheduledExecutorServiceC10335l(handler);
        this.f18211l = new C10628l();
        try {
            mopub(c15421l);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    public final void admob(C12823l c12823l) {
        ArrayList arrayList = this.f18217l;
        if (arrayList.isEmpty()) {
            return;
        }
        if (c12823l == null) {
            purchase(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    byteArrayOutputStream.close();
                    return;
                }
                ((AbstractC13477l) it.next()).getClass();
                Bitmap bitmapBilling = billing((Size) c12823l.f25199l, (float[]) c12823l.f25198l, 0);
                byteArrayOutputStream.reset();
                bitmapBilling.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Surface surface = (Surface) c12823l.f25200l;
                Objects.requireNonNull(byteArray);
                ImageProcessingUtil.admob(byteArray, surface);
                throw null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            purchase(e);
        }
        purchase(e);
    }

    public final void amazon(Runnable runnable, Runnable runnable2) {
        try {
            this.f18207l.execute(new RunnableC10613l(this, runnable2, runnable, 9));
        } catch (RejectedExecutionException e) {
            AbstractC5088l.Signature("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final Bitmap billing(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        AbstractC18648l.amazon(fArr2, i);
        AbstractC18648l.purchase(fArr2);
        Size sizeAdmob = AbstractC18611l.admob(i, size);
        C10628l c10628l = this.f18211l;
        c10628l.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeAdmob.getHeight() * sizeAdmob.getWidth() * 4);
        AbstractC5641l.loadAd(byteBufferAllocateDirect.capacity() == (sizeAdmob.getHeight() * sizeAdmob.getWidth()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        AbstractC5641l.loadAd(byteBufferAllocateDirect.isDirect(), "ByteBuffer is not direct.");
        int[] iArr = AbstractC6123l.yandex;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        AbstractC6123l.loadAd("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        AbstractC6123l.loadAd("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        AbstractC6123l.loadAd("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeAdmob.getWidth(), sizeAdmob.getHeight(), 0, 6407, 5121, null);
        AbstractC6123l.loadAd("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        AbstractC6123l.loadAd("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        AbstractC6123l.loadAd("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        AbstractC6123l.loadAd("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        AbstractC6123l.loadAd("glActiveTexture");
        GLES20.glBindTexture(36197, c10628l.f21567l);
        AbstractC6123l.loadAd("glBindTexture");
        c10628l.f21568l = null;
        GLES20.glViewport(0, 0, sizeAdmob.getWidth(), sizeAdmob.getHeight());
        GLES20.glScissor(0, 0, sizeAdmob.getWidth(), sizeAdmob.getHeight());
        AbstractC11825l abstractC11825l = (AbstractC11825l) c10628l.f21571l;
        abstractC11825l.getClass();
        if (abstractC11825l instanceof C11124l) {
            GLES20.glUniformMatrix4fv(((C11124l) abstractC11825l).billing, 1, false, fArr2, 0);
            AbstractC6123l.loadAd("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC6123l.loadAd("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeAdmob.getWidth(), sizeAdmob.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        AbstractC6123l.loadAd("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        AbstractC6123l.loadAd("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        AbstractC6123l.loadAd("glDeleteFramebuffers");
        int i4 = c10628l.f21567l;
        GLES20.glActiveTexture(33984);
        AbstractC6123l.loadAd("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        AbstractC6123l.loadAd("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeAdmob.getWidth(), sizeAdmob.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.crashlytics(bitmapCreateBitmap, byteBufferAllocateDirect, sizeAdmob.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void crashlytics() {
        if (this.f18212l && this.f18215l == 0) {
            LinkedHashMap linkedHashMap = this.f18209l;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((C3214l) it.next()).close();
            }
            Iterator it2 = this.f18217l.iterator();
            if (it2.hasNext()) {
                ((AbstractC13477l) it2.next()).getClass();
                new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
                throw null;
            }
            linkedHashMap.clear();
            C10628l c10628l = this.f18211l;
            if (((AtomicBoolean) c10628l.f21563l).getAndSet(false)) {
                AbstractC6123l.crashlytics((Thread) c10628l.f21569l);
                c10628l.smaato();
            }
            this.f18210l.quit();
        }
    }

    @Override // defpackage.InterfaceC13989l
    public final void loadAd(C3214l c3214l) {
        if (this.f18213l.get()) {
            c3214l.close();
            return;
        }
        RunnableC0336l runnableC0336l = new RunnableC0336l(this, c3214l, 5);
        Objects.requireNonNull(c3214l);
        amazon(runnableC0336l, new RunnableC16112l(27, c3214l));
    }

    public final void mopub(C15421l c15421l) {
        Map map = Collections.EMPTY_MAP;
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            amazon(new RunnableC10613l(this, c15421l, c5807l), new RunnableC15875l(5));
            c5807l.yandex = "Init GlRenderer";
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        try {
            c16565l.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            C4875l.remoteconfig("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f18213l.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f18216l;
        surfaceTexture.getTransformMatrix(fArr);
        C12823l c12823l = null;
        for (Map.Entry entry : this.f18209l.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            C3214l c3214l = (C3214l) entry.getKey();
            float[] fArr2 = c3214l.f6908l;
            float[] fArr3 = this.f18208l;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            int i = c3214l.f6902l;
            if (i == 34) {
                try {
                    this.f18211l.vip(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException e) {
                    AbstractC5088l.amazon("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                AbstractC5641l.purchase("Unsupported format: " + i, i == 256);
                AbstractC5641l.purchase("Only one JPEG output is supported.", c12823l == null);
                c12823l = new C12823l(surface, c3214l.f6909l, (float[]) fArr3.clone());
            }
        }
        try {
            admob(c12823l);
        } catch (RuntimeException e2) {
            purchase(e2);
        }
    }

    public final void purchase(Exception exc) {
        ArrayList arrayList = this.f18217l;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((AbstractC13477l) it.next()).getClass();
            throw null;
        }
        arrayList.clear();
    }

    @Override // defpackage.InterfaceC13989l
    public final void release() {
        if (this.f18213l.getAndSet(true)) {
            return;
        }
        amazon(new RunnableC16112l(28, this), new RunnableC15875l(5));
    }

    @Override // defpackage.InterfaceC13989l
    public final void yandex(C15691l c15691l) {
        if (this.f18213l.get()) {
            c15691l.crashlytics();
        } else {
            amazon(new RunnableC0336l(this, c15691l, 6), new RunnableC9179l(c15691l, 0));
        }
    }
}
