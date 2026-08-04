package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٍۦّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9950l extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public static final ThreadPoolExecutor f20271l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public static final boolean f20272l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public static final List f20273l;

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public int f20274l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public boolean f20275l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public RectF f20276l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f20277l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f20278l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C11644l f20279l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public Rect f20280l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public Rect f20281l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C15053l f20282l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public Canvas f20283l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public int f20284l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public Matrix f20285l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ChoreographerFrameCallbackC7080l f20286l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10712l f20287l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C13957l f20288l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public Rect f20289l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final RunnableC10838l f20290l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final Semaphore f20291l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final float[] f20292l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C13156l f20293l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public Bitmap f20294l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ArrayList f20295l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f20296l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public Handler f20297l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public Matrix f20298l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f20299l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public float f20300l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f20301l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C10111l f20302l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f20303l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public int f20304l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final Matrix f20305l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public RunnableC10838l f20306l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public RectF f20307l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public RectF f20308l;

    static {
        f20272l = Build.VERSION.SDK_INT <= 25;
        f20273l = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f20271l = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0862l());
    }

    public C9950l() {
        ChoreographerFrameCallbackC7080l choreographerFrameCallbackC7080l = new ChoreographerFrameCallbackC7080l();
        choreographerFrameCallbackC7080l.f14837l = 1.0f;
        choreographerFrameCallbackC7080l.f14836l = false;
        choreographerFrameCallbackC7080l.f14840l = 0L;
        choreographerFrameCallbackC7080l.f14833l = 0.0f;
        choreographerFrameCallbackC7080l.f14834l = 0.0f;
        choreographerFrameCallbackC7080l.f14839l = 0;
        choreographerFrameCallbackC7080l.f14835l = -2.1474836E9f;
        choreographerFrameCallbackC7080l.f14841l = 2.1474836E9f;
        choreographerFrameCallbackC7080l.f14832l = false;
        this.f20286l = choreographerFrameCallbackC7080l;
        this.f20278l = true;
        this.f20296l = false;
        this.f20274l = 1;
        this.f20295l = new ArrayList();
        this.f20282l = new C15053l(14);
        this.f20301l = true;
        this.f20303l = 255;
        this.f20304l = 1;
        this.f20277l = false;
        this.f20305l = new Matrix();
        this.f20292l = new float[9];
        this.f20275l = false;
        C14131l c14131l = new C14131l(3, this);
        this.f20291l = new Semaphore(1);
        this.f20290l = new RunnableC10838l(this, 0);
        this.f20300l = -3.4028235E38f;
        choreographerFrameCallbackC7080l.addUpdateListener(c14131l);
    }

    public static boolean admob(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public static void amazon(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final Context billing() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final void crashlytics() {
        C10712l c10712l = this.f20287l;
        if (c10712l == null) {
            return;
        }
        int i = this.f20304l;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = c10712l.metrica;
        int i3 = c10712l.startapp;
        int iInmobi = AbstractC5020l.inmobi(i);
        boolean z2 = false;
        if (iInmobi != 1 && (iInmobi == 2 || ((z && i2 < 28) || i3 > 4 || i2 <= 25))) {
            z2 = true;
        }
        this.f20277l = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C13156l c13156l = this.f20293l;
        if (c13156l == null) {
            return;
        }
        int i = this.f20284l;
        if (i == 0) {
            i = 1;
        }
        boolean z = i == 2;
        RunnableC10838l runnableC10838l = this.f20290l;
        ThreadPoolExecutor threadPoolExecutor = f20271l;
        ChoreographerFrameCallbackC7080l choreographerFrameCallbackC7080l = this.f20286l;
        Semaphore semaphore = this.f20291l;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (c13156l.f25764strictfp == choreographerFrameCallbackC7080l.amazon()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (c13156l.f25764strictfp != choreographerFrameCallbackC7080l.amazon()) {
                        threadPoolExecutor.execute(runnableC10838l);
                    }
                }
                throw th;
            }
        }
        if (z && vip()) {
            remoteconfig(choreographerFrameCallbackC7080l.amazon());
        }
        boolean z2 = this.f20296l;
        boolean z3 = this.f20277l;
        if (z2) {
            try {
                if (z3) {
                    isPro(canvas, c13156l);
                } else {
                    purchase(canvas);
                }
            } catch (Throwable unused2) {
                AbstractC17968l.yandex.getClass();
            }
        } else if (z3) {
            isPro(canvas, c13156l);
        } else {
            purchase(canvas);
        }
        this.f20275l = false;
        if (z) {
            semaphore.release();
            if (c13156l.f25764strictfp == choreographerFrameCallbackC7080l.amazon()) {
                return;
            }
            threadPoolExecutor.execute(runnableC10838l);
        }
    }

    public final void firebase() {
        if (this.f20293l == null) {
            this.f20295l.add(new C16677l(this, 0));
            return;
        }
        crashlytics();
        boolean zYandex = yandex(billing());
        ChoreographerFrameCallbackC7080l choreographerFrameCallbackC7080l = this.f20286l;
        if (zYandex || choreographerFrameCallbackC7080l.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC7080l.f14832l = true;
                choreographerFrameCallbackC7080l.subs(false);
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC7080l);
                choreographerFrameCallbackC7080l.f14840l = 0L;
                if (choreographerFrameCallbackC7080l.admob() && choreographerFrameCallbackC7080l.f14834l == choreographerFrameCallbackC7080l.billing()) {
                    choreographerFrameCallbackC7080l.isPro(choreographerFrameCallbackC7080l.purchase());
                } else if (!choreographerFrameCallbackC7080l.admob() && choreographerFrameCallbackC7080l.f14834l == choreographerFrameCallbackC7080l.purchase()) {
                    choreographerFrameCallbackC7080l.isPro(choreographerFrameCallbackC7080l.billing());
                }
                Iterator it = choreographerFrameCallbackC7080l.f24071l.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(choreographerFrameCallbackC7080l);
                }
                this.f20274l = 1;
            } else {
                this.f20274l = 3;
            }
        }
        if (yandex(billing())) {
            return;
        }
        smaato((int) (choreographerFrameCallbackC7080l.f14837l < 0.0f ? choreographerFrameCallbackC7080l.billing() : choreographerFrameCallbackC7080l.purchase()));
        choreographerFrameCallbackC7080l.subs(true);
        choreographerFrameCallbackC7080l.yandex(choreographerFrameCallbackC7080l.admob());
        if (isVisible()) {
            return;
        }
        this.f20274l = 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f20303l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C10712l c10712l = this.f20287l;
        if (c10712l == null) {
            return -1;
        }
        return c10712l.firebase.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C10712l c10712l = this.f20287l;
        if (c10712l == null) {
            return -1;
        }
        return c10712l.firebase.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f20275l) {
            return;
        }
        this.f20275l = true;
        if ((!f20272l || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d3  */
    public final void isPro(Canvas canvas, C13156l c13156l) {
        boolean z;
        if (this.f20287l == null || c13156l == null) {
            return;
        }
        if (this.f20283l == null) {
            this.f20283l = new Canvas();
            this.f20308l = new RectF();
            this.f20285l = new Matrix();
            this.f20298l = new Matrix();
            this.f20289l = new Rect();
            this.f20307l = new RectF();
            this.f20288l = new C13957l();
            this.f20281l = new Rect();
            this.f20280l = new Rect();
            this.f20276l = new RectF();
        }
        canvas.getMatrix(this.f20285l);
        canvas.getClipBounds(this.f20289l);
        Rect rect = this.f20289l;
        this.f20307l.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f20285l.mapRect(this.f20307l);
        amazon(this.f20307l, this.f20289l);
        boolean z2 = this.f20301l;
        RectF rectF = this.f20308l;
        if (z2) {
            rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c13156l.crashlytics(rectF, null, false);
        }
        this.f20285l.mapRect(this.f20308l);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.f20308l;
        rectF2.set(rectF2.left * fWidth, rectF2.top * fHeight, rectF2.right * fWidth, rectF2.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF3 = this.f20308l;
            Rect rect2 = this.f20289l;
            rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        RectF rectF4 = this.f20308l;
        if (!(admob(rectF4.left) && admob(rectF4.top) && admob(rectF4.right) && admob(rectF4.bottom))) {
            AbstractC17968l.loadAd("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int iCeil = (int) Math.ceil(this.f20308l.width());
        int iCeil2 = (int) Math.ceil(this.f20308l.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            AbstractC17968l.loadAd("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j = ((long) iCeil) * ((long) iCeil2);
        if (j > 50000000) {
            AbstractC17968l.loadAd("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + ")");
            return;
        }
        Bitmap bitmap = this.f20294l;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.f20294l.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.f20294l = bitmapCreateBitmap;
            this.f20283l.setBitmap(bitmapCreateBitmap);
            this.f20275l = true;
        } else if (this.f20294l.getWidth() > iCeil || this.f20294l.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f20294l, 0, 0, iCeil, iCeil2);
            this.f20294l = bitmapCreateBitmap2;
            this.f20283l.setBitmap(bitmapCreateBitmap2);
            this.f20275l = true;
        }
        if (this.f20275l) {
            Matrix matrix = this.f20285l;
            float[] fArr = this.f20292l;
            matrix.getValues(fArr);
            float f = fArr[0];
            float f2 = fArr[4];
            Matrix matrix2 = this.f20285l;
            Matrix matrix3 = this.f20305l;
            matrix3.set(matrix2);
            matrix3.preScale(fWidth, fHeight);
            RectF rectF5 = this.f20308l;
            matrix3.postTranslate(-rectF5.left, -rectF5.top);
            matrix3.postScale(1.0f / f, 1.0f / f2);
            this.f20294l.eraseColor(0);
            this.f20283l.setMatrix(AbstractC4218l.yandex);
            this.f20283l.scale(f, f2);
            c13156l.billing(this.f20283l, matrix3, this.f20303l, null);
            this.f20285l.invert(this.f20298l);
            this.f20298l.mapRect(this.f20276l, this.f20308l);
            amazon(this.f20276l, this.f20280l);
        }
        this.f20281l.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f20294l, this.f20281l, this.f20280l, this.f20288l);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ChoreographerFrameCallbackC7080l choreographerFrameCallbackC7080l = this.f20286l;
        if (choreographerFrameCallbackC7080l == null) {
            return false;
        }
        return choreographerFrameCallbackC7080l.f14832l;
    }

    public final void loadAd() {
        C10712l c10712l = this.f20287l;
        if (c10712l == null) {
            return;
        }
        C3797l c3797l = AbstractC2751l.yandex;
        Rect rect = c10712l.firebase;
        List list = Collections.EMPTY_LIST;
        C13156l c13156l = new C13156l(this, new C4913l(list, c10712l, "__container", -1L, 1, -1L, null, list, new C1406l(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), c10712l.isPro, c10712l);
        this.f20293l = c13156l;
        c13156l.f25767volatile = this.f20301l;
    }

    public final C13714l mopub() {
        C13714l c13714l = null;
        for (String str : f20273l) {
            C10712l c10712l = this.f20287l;
            int size = c10712l.mopub.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    c13714l = null;
                    break;
                }
                C13714l c13714l2 = (C13714l) c10712l.mopub.get(i);
                String str2 = c13714l2.yandex;
                if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                    c13714l = c13714l2;
                    break;
                }
                i++;
            }
            if (c13714l != null) {
                break;
            }
        }
        return c13714l;
    }

    public final void purchase(Canvas canvas) {
        C13156l c13156l = this.f20293l;
        C10712l c10712l = this.f20287l;
        if (c13156l == null || c10712l == null) {
            return;
        }
        Matrix matrix = this.f20305l;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / c10712l.firebase.width();
            float fHeight = bounds.height() / c10712l.firebase.height();
            matrix.preTranslate(bounds.left, bounds.top);
            matrix.preScale(fWidth, fHeight);
        }
        c13156l.billing(canvas, matrix, this.f20303l, null);
    }

    public final void remoteconfig(final float f) {
        C10712l c10712l = this.f20287l;
        if (c10712l == null) {
            this.f20295l.add(new InterfaceC16652l() { // from class: lٗٚ
                @Override // defpackage.InterfaceC16652l
                public final void run() {
                    this.yandex.remoteconfig(f);
                }
            });
        } else {
            this.f20286l.isPro(AbstractC7484l.purchase(c10712l.smaato, c10712l.remoteconfig, f));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f20303l = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC17968l.loadAd("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.f20274l;
            if (i == 2) {
                subs();
                return visible;
            }
            if (i == 3) {
                firebase();
                return visible;
            }
        } else {
            ChoreographerFrameCallbackC7080l choreographerFrameCallbackC7080l = this.f20286l;
            if (choreographerFrameCallbackC7080l.f14832l) {
                this.f20295l.clear();
                choreographerFrameCallbackC7080l.subs(true);
                Iterator it = choreographerFrameCallbackC7080l.f24071l.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(choreographerFrameCallbackC7080l);
                }
                if (!isVisible()) {
                    this.f20274l = 1;
                }
                this.f20274l = 3;
                return visible;
            }
            if (zIsVisible) {
                this.f20274l = 1;
            }
        }
        return visible;
    }

    public final void smaato(final int i) {
        if (this.f20287l != null) {
            this.f20286l.isPro(i);
        } else {
            this.f20295l.add(new InterfaceC16652l() { // from class: lؔؗٗ
                @Override // defpackage.InterfaceC16652l
                public final void run() {
                    this.yandex.smaato(i);
                }
            });
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        subs();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f20295l.clear();
        ChoreographerFrameCallbackC7080l choreographerFrameCallbackC7080l = this.f20286l;
        choreographerFrameCallbackC7080l.subs(true);
        choreographerFrameCallbackC7080l.yandex(choreographerFrameCallbackC7080l.admob());
        if (isVisible()) {
            return;
        }
        this.f20274l = 1;
    }

    public final void subs() {
        if (this.f20293l == null) {
            this.f20295l.add(new C16677l(this, 1));
            return;
        }
        crashlytics();
        boolean zYandex = yandex(billing());
        ChoreographerFrameCallbackC7080l choreographerFrameCallbackC7080l = this.f20286l;
        if (zYandex || choreographerFrameCallbackC7080l.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC7080l.f14832l = true;
                choreographerFrameCallbackC7080l.loadAd(choreographerFrameCallbackC7080l.admob());
                choreographerFrameCallbackC7080l.isPro((int) (choreographerFrameCallbackC7080l.admob() ? choreographerFrameCallbackC7080l.purchase() : choreographerFrameCallbackC7080l.billing()));
                choreographerFrameCallbackC7080l.f14840l = 0L;
                choreographerFrameCallbackC7080l.f14839l = 0;
                if (choreographerFrameCallbackC7080l.f14832l) {
                    choreographerFrameCallbackC7080l.subs(false);
                    Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC7080l);
                }
                this.f20274l = 1;
            } else {
                this.f20274l = 2;
            }
        }
        if (yandex(billing())) {
            return;
        }
        C13714l c13714lMopub = mopub();
        if (c13714lMopub != null) {
            smaato((int) c13714lMopub.loadAd);
        } else {
            smaato((int) (choreographerFrameCallbackC7080l.f14837l < 0.0f ? choreographerFrameCallbackC7080l.billing() : choreographerFrameCallbackC7080l.purchase()));
        }
        choreographerFrameCallbackC7080l.subs(true);
        choreographerFrameCallbackC7080l.yandex(choreographerFrameCallbackC7080l.admob());
        if (isVisible()) {
            return;
        }
        this.f20274l = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final boolean vip() {
        C10712l c10712l = this.f20287l;
        if (c10712l == null) {
            return false;
        }
        float f = this.f20300l;
        float fAmazon = this.f20286l.amazon();
        this.f20300l = fAmazon;
        return Math.abs(fAmazon - f) * c10712l.loadAd() >= 50.0f;
    }

    public final boolean yandex(Context context) {
        if (!this.f20278l) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = AbstractC4218l.yandex;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }
}
