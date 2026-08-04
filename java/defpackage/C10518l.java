package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lَۘٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10518l extends LinearLayout {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f21400l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public ValueAnimator f21401l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f21402l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Paint f21403l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f21404l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Rect f21405l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f21406l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public float f21407l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f21408l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f21409l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C1194l f21410l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10518l(C1194l c1194l, Context context) {
        super(context);
        this.f21410l = c1194l;
        this.f21400l = -1;
        this.f21406l = -1;
        this.f21409l = -1;
        this.f21402l = -1;
        this.f21408l = -1;
        this.f21405l = new Rect();
        setWillNotDraw(false);
        this.f21403l = new Paint();
        new GradientDrawable();
    }

    public final void amazon(int i, int i2, boolean z) {
        C1194l c1194l = this.f21410l;
        RectF rectF = c1194l.f3223l;
        View childAt = getChildAt(i);
        if (childAt == null) {
            crashlytics();
            return;
        }
        int left = childAt.getLeft();
        int right = childAt.getRight();
        if (!c1194l.f3186l && (childAt instanceof C0282l)) {
            yandex((C0282l) childAt, rectF);
            left = (int) rectF.left;
            right = (int) rectF.right;
        }
        int i3 = this.f21406l;
        int i4 = this.f21409l;
        if (i3 == left && i4 == right) {
            return;
        }
        if (z) {
            this.f21402l = i3;
            this.f21408l = i4;
        }
        C2458l c2458l = new C2458l(this, left, right);
        if (!z) {
            this.f21401l.removeAllUpdateListeners();
            this.f21401l.addUpdateListener(c2458l);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f21401l = valueAnimator;
        valueAnimator.setInterpolator(AbstractC0926l.loadAd);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c2458l);
        valueAnimator.addListener(new C8537l(this, i));
        valueAnimator.start();
    }

    public final void crashlytics() {
        int left;
        int right;
        C1194l c1194l = this.f21410l;
        RectF rectF = c1194l.f3223l;
        View childAt = getChildAt(this.f21400l);
        if (childAt == null || childAt.getWidth() <= 0) {
            left = -1;
            right = -1;
        } else {
            left = childAt.getLeft();
            right = childAt.getRight();
            if (!c1194l.f3186l && (childAt instanceof C0282l)) {
                yandex((C0282l) childAt, rectF);
                left = (int) rectF.left;
                right = (int) rectF.right;
            }
            if (this.f21407l > 0.0f && this.f21400l < getChildCount() - 1) {
                View childAt2 = getChildAt(this.f21400l + 1);
                int left2 = childAt2.getLeft();
                int right2 = childAt2.getRight();
                if (!c1194l.f3186l && (childAt2 instanceof C0282l)) {
                    yandex((C0282l) childAt2, rectF);
                    left2 = (int) rectF.left;
                    right2 = (int) rectF.right;
                }
                float f = this.f21407l;
                float f2 = 1.0f - f;
                left = (int) ((left * f2) + (left2 * f));
                right = (int) ((f2 * right) + (f * right2));
            }
        }
        if (left == this.f21406l && right == this.f21409l) {
            return;
        }
        this.f21406l = left;
        this.f21409l = right;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        C1194l c1194l = this.f21410l;
        int i = c1194l.f3216l;
        TextPaint textPaint = c1194l.f3192l;
        Paint paint = c1194l.f3205l;
        Path path = c1194l.f3224l;
        Drawable drawable = c1194l.f3206l;
        if (drawable != null) {
            drawable.getIntrinsicHeight();
        }
        int i2 = c1194l.f3228l;
        if (i2 == 0 || i2 == 1) {
            getHeight();
            getHeight();
        } else if (i2 == 3) {
            getHeight();
        }
        int strokeWidth = (int) (paint.getStrokeWidth() / 2.0f);
        int i3 = this.f21406l;
        if (i3 < 0 || this.f21409l <= i3) {
            canvas2 = canvas;
        } else {
            float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f) + c1194l.f3215l;
            canvas2 = canvas;
            canvas2.drawLine(this.f21406l + strokeWidth + i, textSize, (this.f21409l - strokeWidth) - i, textSize, paint);
        }
        path.rewind();
        path.addRect(this.f21406l + strokeWidth + i, 0.0f, (this.f21409l - strokeWidth) - i, getHeight(), Path.Direction.CW);
        int iSave = canvas2.save();
        canvas2.clipPath(path);
        loadAd(canvas2, c1194l.f3204l);
        canvas2.restoreToCount(iSave);
        int iSave2 = canvas2.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas2.clipOutPath(path);
        } else {
            canvas2.clipPath(path, Region.Op.DIFFERENCE);
        }
        loadAd(canvas2, textPaint);
        canvas2.restoreToCount(iSave2);
    }

    public final void loadAd(Canvas canvas, TextPaint textPaint) {
        C15037l c15037l = new C15037l(0, this);
        while (c15037l.hasNext()) {
            View view = (View) c15037l.next();
            TextView textView = ((C0282l) view).f1286l;
            textPaint.setTextSize(textView.getTextSize());
            CharSequence text = textView.getText();
            if (text != null) {
                String string = text.toString();
                int length = text.length();
                Rect rect = this.f21405l;
                textPaint.getTextBounds(string, 0, length, rect);
                canvas.drawText(text, 0, text.length(), ((view.getWidth() - rect.width()) / 2.0f) + view.getX(), this.f21410l.getHeight() / 2.0f, textPaint);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f21401l;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            crashlytics();
        } else {
            amazon(this.f21400l, -1, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        C1194l c1194l = this.f21410l;
        boolean z = true;
        if (c1194l.f3210l == 1 || c1194l.f3208l == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) AbstractC0545l.loadAd(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                c1194l.f3210l = 0;
                c1194l.isPro(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    public final void yandex(C0282l c0282l, RectF rectF) {
        int contentWidth = c0282l.getContentWidth();
        int iLoadAd = (int) AbstractC0545l.loadAd(getContext(), 24);
        if (contentWidth < iLoadAd) {
            contentWidth = iLoadAd;
        }
        int right = (c0282l.getRight() + c0282l.getLeft()) / 2;
        int i = contentWidth / 2;
        rectF.set(right - i, 0.0f, right + i, 0.0f);
    }
}
