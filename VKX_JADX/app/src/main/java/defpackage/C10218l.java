package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Pair;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.Transformation;
import com.google.android.renderscript.Toolkit;
import java.util.HashMap;
import java.util.Random;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lَُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10218l extends View {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final float f20809l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final Bitmap f20810l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final float f20811l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public float[] f20812l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Bitmap f20813l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public BitmapShader f20814l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public float f20815l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int f20816l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Paint f20817l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final ValueAnimator f20818l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f20819l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public float f20820l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f20821l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final ValueAnimator f20822l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Paint f20823l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final Transformation f20824l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final HashMap f20825l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Bitmap f20826l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public Path f20827l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public BitmapShader f20828l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Bitmap f20829l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final Matrix f20830l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final AlphaAnimation f20831l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final ValueAnimator f20832l;

    static {
        int i = VKXApplication.f36631l.getResources().getConfiguration().densityDpi;
        f20809l = i >= 420 ? 24.0f : 16.0f;
        f20811l = i >= 420 ? 72.0f : 48.0f;
        f20810l = Bitmap.createBitmap(new int[]{-16777216}, 1, 1, Bitmap.Config.ARGB_8888);
    }

    public C10218l(Context context) {
        super(context, null, 0, 0);
        C14473l c14473l = C14473l.purchase;
        int i = 2;
        this.f20819l = getContext().getResources().getConfiguration().orientation == 2 ? 0.0f : getContext().getResources().getDimension(R.dimen.player_sheet_corner_radius);
        this.f20825l = new HashMap();
        this.f20821l = false;
        this.f20816l = 0;
        float f = f20809l;
        this.f20815l = f;
        this.f20820l = 2.5f;
        Matrix matrix = new Matrix();
        this.f20830l = matrix;
        matrix.setScale(f, f);
        Paint paint = new Paint(7);
        this.f20817l = paint;
        Paint paint2 = new Paint(7);
        this.f20823l = paint2;
        paint.setAlpha(0);
        paint2.setAlpha(255);
        this.f20824l = new Transformation();
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f20831l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.3f, 1.0f));
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC6605l(this, i));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -360.0f);
        this.f20818l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(120000L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f20822l = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(90000L);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.setRepeatCount(-1);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f20832l = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(70000L);
        valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat3.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(Math.round(120000.0f));
        valueAnimatorOfFloat2.setDuration(Math.round(90000.0f));
        valueAnimatorOfFloat3.setDuration(Math.round(70000.0f));
    }

    private int getFpsDelta() {
        return 42;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        HashMap map = this.f20825l;
        for (Pair pair : map.values()) {
            ((Bitmap) pair.first).recycle();
            ((Bitmap) pair.second).recycle();
        }
        map.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmapYandex;
        Bitmap bitmap3 = this.f20813l;
        AlphaAnimation alphaAnimation = this.f20831l;
        ValueAnimator valueAnimator2 = this.f20832l;
        ValueAnimator valueAnimator3 = this.f20822l;
        ValueAnimator valueAnimator4 = this.f20818l;
        if (bitmap3 == null || bitmap3.isRecycled() || getWidth() == 0 || getHeight() == 0) {
            alphaAnimation.cancel();
            alphaAnimation.reset();
            valueAnimator4.cancel();
            valueAnimator3.cancel();
            valueAnimator2.cancel();
            return;
        }
        BitmapShader bitmapShader = this.f20814l;
        Bitmap bitmap4 = f20810l;
        Paint paint = this.f20817l;
        if (bitmapShader == null || (valueAnimator4.isStarted() && !valueAnimator4.isPaused())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Bitmap bitmap5 = this.f20813l;
            float f = this.f20820l;
            float f2 = this.f20815l;
            int iRound = Math.round((getWidth() * 1.3f) / f2);
            int iRound2 = Math.round((getHeight() * 1.3f) / f2);
            valueAnimator = valueAnimator2;
            Pair pair = new Pair(Integer.valueOf(iRound), Integer.valueOf(iRound2));
            HashMap map = this.f20825l;
            if (map.containsKey(pair)) {
                Pair pair2 = (Pair) map.get(pair);
                bitmap2 = (Bitmap) pair2.first;
                bitmap = (Bitmap) pair2.second;
            } else {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, config);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iRound, iRound2, config);
                map.put(pair, new Pair(bitmapCreateBitmap, bitmapCreateBitmap2));
                bitmap = bitmapCreateBitmap2;
                bitmap2 = bitmapCreateBitmap;
            }
            if (this.f20829l != bitmap2) {
                bitmap = bitmap2;
            }
            this.f20829l = bitmap;
            Canvas canvas2 = new Canvas(this.f20829l);
            float fRound = Math.round(Math.max(iRound, iRound2) * 1.3f);
            float height = fRound / bitmap5.getHeight();
            float f3 = iRound;
            float f4 = (-(fRound - f3)) / 2.0f;
            float f5 = iRound2;
            float f6 = (-(fRound - f5)) / 2.0f;
            float fFloatValue = valueAnimator4.isStarted() ? ((Float) valueAnimator4.getAnimatedValue()).floatValue() : 0.0f;
            Matrix matrix = new Matrix();
            matrix.setScale(height, height);
            float f7 = fRound / 2.0f;
            matrix.postRotate(fFloatValue, f7, f7);
            matrix.postTranslate(f4, f6);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(f);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            Paint paint2 = new Paint(7);
            paint2.setColorFilter(colorMatrixColorFilter);
            canvas2.drawBitmap(bitmap5, matrix, paint2);
            float fFloatValue2 = valueAnimator3.isStarted() ? ((Float) valueAnimator3.getAnimatedValue()).floatValue() : 0.0f;
            Matrix matrix2 = new Matrix();
            matrix2.setScale(height, height);
            matrix2.postRotate(fFloatValue2, f7, f7);
            matrix2.postTranslate(f4, f6);
            matrix2.postTranslate((-0.95f) * f3, f5 * (-0.7f));
            canvas2.drawBitmap(bitmap5, matrix2, paint2);
            float fFloatValue3 = valueAnimator.isStarted() ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : 0.0f;
            Matrix matrix3 = new Matrix();
            matrix3.setScale(height, height);
            matrix3.postRotate(fFloatValue3, f7, f7);
            matrix3.postTranslate(f4, f6);
            matrix3.postTranslate((-0.5f) * f3, f5 * 0.7f);
            matrix3.postRotate(fFloatValue3, f3 / 2.0f, f5 / 2.0f);
            canvas2.drawBitmap(bitmap5, matrix3, paint2);
            Pair pair3 = new Pair(this.f20829l, canvas2);
            if (this.f20821l) {
                Bitmap bitmap6 = (Bitmap) pair3.first;
                Canvas canvas3 = (Canvas) pair3.second;
                float[] fArr = this.f20812l;
                int width = bitmap6.getWidth();
                int height2 = bitmap6.getHeight();
                float[] fArr2 = new float[72];
                int i = 0;
                while (true) {
                    if (i > 5) {
                        break;
                    }
                    float[] fArr3 = fArr2;
                    Canvas canvas4 = canvas3;
                    Bitmap bitmap7 = bitmap6;
                    int i2 = 0;
                    for (int i3 = 5; i2 <= i3; i3 = 5) {
                        int i4 = (i * 12) + (i2 * 2);
                        int i5 = i4 + 1;
                        fArr3[i4] = fArr[i4] * width;
                        fArr3[i5] = fArr[i5] * height2;
                        float f8 = fArr[i4];
                        float f9 = fArr3[i4];
                        float f10 = fArr[i5];
                        i2++;
                    }
                    i++;
                    bitmap6 = bitmap7;
                    canvas3 = canvas4;
                    fArr2 = fArr3;
                }
                canvas3.drawBitmapMesh(bitmap6, 5, 5, fArr2, 0, null, 0, null);
                pair3 = new Pair(bitmap6, canvas3);
            }
            Bitmap bitmap8 = this.f20813l;
            Object obj = pair3.first;
            if (bitmap8 != bitmap4) {
                Bitmap bitmap9 = (Bitmap) obj;
                Canvas canvas5 = (Canvas) pair3.second;
                int[] iArr = {getContext().getColor(R.color.lyrics_bg_layer_black_scrim), getContext().getColor(R.color.lyrics_bg_layer_white_scrim)};
                for (int i6 = 0; i6 < 2; i6++) {
                    int i7 = iArr[i6];
                    Paint paint3 = new Paint(7);
                    paint3.setStyle(Paint.Style.FILL);
                    paint3.setColor(i7);
                    canvas5.drawPaint(paint3);
                }
                Bitmap bitmap10 = (Bitmap) new Pair(bitmap9, canvas5).first;
                Toolkit toolkit = Toolkit.yandex;
                bitmapYandex = Toolkit.yandex(bitmap10, 25);
            } else {
                bitmapYandex = (Bitmap) obj;
            }
            float width2 = bitmapYandex.getWidth();
            float height3 = bitmapYandex.getHeight();
            Matrix matrix4 = new Matrix(this.f20830l);
            matrix4.preTranslate((-(width2 - (width2 / 1.3f))) / 2.0f, (-(height3 - (height3 / 1.3f))) / 2.0f);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            BitmapShader bitmapShader2 = new BitmapShader(bitmapYandex, tileMode, tileMode);
            bitmapShader2.setLocalMatrix(matrix4);
            this.f20814l = bitmapShader2;
            if (!this.f20821l && valueAnimator4.isStarted() && !valueAnimator4.isPaused()) {
                if (System.currentTimeMillis() - jCurrentTimeMillis > 15) {
                    this.f20816l++;
                } else {
                    this.f20816l = 0;
                }
                if (this.f20816l > 3) {
                    post(new RunnableC11297l(17, this));
                }
            }
            paint.setShader(this.f20814l);
        } else {
            valueAnimator = valueAnimator2;
            valueAnimator3 = valueAnimator3;
            valueAnimator4 = valueAnimator4;
        }
        BitmapShader bitmapShader3 = this.f20828l;
        Paint paint4 = this.f20823l;
        if (bitmapShader3 != null) {
            canvas.drawPath(this.f20827l, paint4);
        }
        canvas.drawPath(this.f20827l, paint);
        if (alphaAnimation.hasStarted() && !alphaAnimation.hasEnded()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Transformation transformation = this.f20824l;
            alphaAnimation.getTransformation(jCurrentTimeMillis2, transformation);
            paint.setAlpha((int) ((1.0f - transformation.getAlpha()) * 255.0f));
            postInvalidateDelayed(getFpsDelta());
            return;
        }
        if (valueAnimator4.isStarted()) {
            if (valueAnimator4.isPaused()) {
                return;
            }
            postInvalidateDelayed(getFpsDelta());
            return;
        }
        paint4.setAlpha(255);
        paint.setAlpha(255);
        Bitmap bitmap11 = this.f20826l;
        if (bitmap11 != null) {
            this.f20826l = null;
            setArtwork(bitmap11);
        } else {
            if (this.f20821l || this.f20813l == bitmap4) {
                return;
            }
            valueAnimator4.end();
            valueAnimator3.end();
            valueAnimator.end();
            valueAnimator4.start();
            valueAnimator3.start();
            valueAnimator.start();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = new Path();
        this.f20827l = path;
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float f = this.f20819l;
        path.addRoundRect(rectF, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        Bitmap bitmap = this.f20826l;
        if (bitmap != null) {
            this.f20826l = null;
            setArtwork(bitmap);
        } else {
            Bitmap bitmap2 = this.f20813l;
            if (bitmap2 != null) {
                setArtwork(bitmap2);
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        ValueAnimator valueAnimator = this.f20832l;
        ValueAnimator valueAnimator2 = this.f20822l;
        ValueAnimator valueAnimator3 = this.f20818l;
        if (i != 0) {
            if (valueAnimator3.isStarted()) {
                valueAnimator3.pause();
                valueAnimator2.pause();
                valueAnimator.pause();
                return;
            }
            return;
        }
        if (valueAnimator3.isStarted() && valueAnimator3.isPaused()) {
            valueAnimator3.resume();
            valueAnimator2.resume();
            valueAnimator.resume();
        }
        invalidate();
    }

    public void setArtwork(Bitmap bitmap) {
        ads adsVar;
        Bitmap bitmap2 = this.f20813l;
        if (bitmap == bitmap2 || bitmap == null || !bitmap.sameAs(bitmap2)) {
            AlphaAnimation alphaAnimation = this.f20831l;
            if (alphaAnimation.hasStarted() && !alphaAnimation.hasEnded()) {
                this.f20826l = bitmap;
                return;
            }
            alphaAnimation.cancel();
            alphaAnimation.reset();
            this.f20818l.cancel();
            this.f20822l.cancel();
            this.f20832l.cancel();
            this.f20813l = bitmap;
            BitmapShader bitmapShader = this.f20814l;
            this.f20828l = bitmapShader;
            this.f20823l.setShader(bitmapShader);
            this.f20814l = null;
            ads[] adsVarArrValues = ads.values();
            int iOrdinal = adsVarArrValues[0].ordinal();
            int iNextInt = new Random().nextInt((adsVarArrValues[adsVarArrValues.length - 1].ordinal() - iOrdinal) + 1) + iOrdinal;
            for (ads adsVar2 : adsVarArrValues) {
                if (iNextInt == adsVar2.ordinal()) {
                    adsVar = adsVar2;
                    this.f20812l = adsVar.f7l;
                    alphaAnimation.start();
                    alphaAnimation.getTransformation(System.currentTimeMillis(), this.f20824l);
                    this.f20817l.setAlpha(0);
                    this.f20816l = 0;
                    this.f20821l = false;
                    invalidate();
                }
            }
            adsVar = ads.M1;
            this.f20812l = adsVar.f7l;
            alphaAnimation.start();
            alphaAnimation.getTransformation(System.currentTimeMillis(), this.f20824l);
            this.f20817l.setAlpha(0);
            this.f20816l = 0;
            this.f20821l = false;
            invalidate();
        }
    }

    public void setReducedEffects(boolean z) {
        float f;
        float f2;
        if (z) {
            f = f20811l;
            f2 = 3.5f;
        } else {
            f = f20809l;
            f2 = 2.5f;
        }
        if (f == this.f20815l && f2 == this.f20820l) {
            return;
        }
        ValueAnimator valueAnimator = this.f20818l;
        if (valueAnimator.isStarted()) {
            valueAnimator.pause();
            this.f20822l.pause();
            this.f20832l.pause();
        }
        this.f20815l = f;
        this.f20820l = f2;
        Matrix matrix = this.f20830l;
        matrix.reset();
        float f3 = this.f20815l;
        matrix.setScale(f3, f3);
        setArtwork(this.f20813l);
    }
}
