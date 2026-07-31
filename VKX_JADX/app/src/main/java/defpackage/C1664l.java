package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘؓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1664l extends Drawable {
    public final int admob;
    public final Rect amazon;
    public float billing;
    public final C1505l crashlytics;
    public float firebase;
    public float isPro;
    public final C5022l loadAd;
    public float mopub;
    public final C12199l purchase;
    public WeakReference remoteconfig;
    public WeakReference smaato;
    public float subs;
    public final WeakReference yandex;

    public C1664l(Context context) {
        C1085l c1085l;
        C1085l c1085l2;
        WeakReference weakReference = new WeakReference(context);
        this.yandex = weakReference;
        AbstractC8960l.billing(context, AbstractC8960l.loadAd, "Theme.MaterialComponents");
        this.amazon = new Rect();
        C1505l c1505l = new C1505l(this);
        this.crashlytics = c1505l;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = c1505l.yandex;
        textPaint.setTextAlign(align);
        C12199l c12199l = new C12199l(context);
        this.purchase = c12199l;
        boolean zAmazon = amazon();
        C14434l c14434l = c12199l.loadAd;
        C5022l c5022l = new C5022l(C12564l.yandex(context, zAmazon ? c14434l.f28248l.intValue() : c14434l.f28262l.intValue(), amazon() ? c14434l.f28251l.intValue() : c14434l.f28268l.intValue(), new C16304l(0.0f)).yandex());
        this.loadAd = c5022l;
        billing();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && (c1085l2 = c1505l.mopub) != (c1085l = new C1085l(context2, c14434l.f28263l.intValue()))) {
            if (c1085l2 != c1085l) {
                c1505l.mopub = c1085l;
                C6325l c6325l = c1505l.loadAd;
                c1085l.purchase(context2, textPaint, c6325l);
                WeakReference weakReference2 = c1505l.billing;
                C1664l c1664l = (C1664l) weakReference2.get();
                if (c1664l != null) {
                    textPaint.drawableState = c1664l.getState();
                }
                c1085l.purchase(context2, textPaint, c6325l);
                ColorStateList colorStateList = c1085l.isPro;
                textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
                ColorStateList colorStateList2 = c1085l.yandex;
                textPaint.setShadowLayer(c1085l.mopub, c1085l.purchase, c1085l.billing, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
                c1505l.purchase = true;
                C1664l c1664l2 = (C1664l) weakReference2.get();
                if (c1664l2 != null) {
                    c1664l2.invalidateSelf();
                    super.onStateChange(c1664l2.getState());
                }
            }
            textPaint.setColor(c14434l.f28247l.intValue());
            invalidateSelf();
            admob();
            invalidateSelf();
        }
        int i = c14434l.f28266l;
        if (i != -2) {
            this.admob = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.admob = c14434l.f28246l;
        }
        c1505l.purchase = true;
        admob();
        invalidateSelf();
        c1505l.purchase = true;
        billing();
        admob();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(c14434l.f28254l.intValue());
        if (c5022l.f10262l.crashlytics != colorStateListValueOf) {
            c5022l.isPro(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(c14434l.f28247l.intValue());
        invalidateSelf();
        WeakReference weakReference3 = this.smaato;
        if (weakReference3 != null && weakReference3.get() != null) {
            View view = (View) this.smaato.get();
            WeakReference weakReference4 = this.remoteconfig;
            mopub(view, weakReference4 != null ? (FrameLayout) weakReference4.get() : null);
        }
        admob();
        setVisible(c14434l.f28250l.booleanValue(), false);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0236  */
    /* JADX WARN: Code duplicated, block: B:104:0x023f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0257  */
    /* JADX WARN: Code duplicated, block: B:108:0x025c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0269  */
    /* JADX WARN: Code duplicated, block: B:114:0x0276  */
    /* JADX WARN: Code duplicated, block: B:117:0x0283  */
    public final void admob() {
        float y;
        float x;
        float y2;
        float x2;
        float height;
        float width;
        float f;
        WeakReference weakReference = this.yandex;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.smaato;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.amazon;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.remoteconfig;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zAmazon = amazon();
        C12199l c12199l = this.purchase;
        float f2 = zAmazon ? c12199l.amazon : c12199l.crashlytics;
        this.subs = f2;
        if (f2 != -1.0f) {
            this.isPro = f2;
            this.firebase = f2;
        } else {
            this.isPro = Math.round((amazon() ? c12199l.mopub : c12199l.purchase) / 2.0f);
            this.firebase = Math.round((amazon() ? c12199l.admob : c12199l.billing) / 2.0f);
        }
        if (amazon()) {
            String strYandex = yandex();
            float f3 = this.isPro;
            C1505l c1505l = this.crashlytics;
            if (c1505l.purchase) {
                c1505l.yandex(strYandex);
                f = c1505l.crashlytics;
            } else {
                f = c1505l.crashlytics;
            }
            this.isPro = Math.max(f3, (f / 2.0f) + c12199l.loadAd.f28249l.intValue());
            float f4 = this.firebase;
            if (c1505l.purchase) {
                c1505l.yandex(strYandex);
            }
            float fMax = Math.max(f4, (c1505l.amazon / 2.0f) + c12199l.loadAd.f28245l.intValue());
            this.firebase = fMax;
            this.isPro = Math.max(this.isPro, fMax);
        }
        C14434l c14434l = c12199l.loadAd;
        C14434l c14434l2 = c12199l.loadAd;
        int i = c12199l.firebase;
        int iIntValue = c14434l.f28253l.intValue();
        if (amazon()) {
            iIntValue = c14434l.f28265l.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = AbstractC0926l.crashlytics(iIntValue, AbstractC0926l.loadAd(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue - c14434l.f28264l.intValue());
            }
        }
        if (i == 0) {
            iIntValue -= Math.round(this.firebase);
        }
        int iIntValue2 = c14434l.f28258l.intValue() + iIntValue;
        int iIntValue3 = c14434l2.f28256l.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.mopub = rect3.bottom - iIntValue2;
        } else {
            this.mopub = rect3.top + iIntValue2;
        }
        int iIntValue4 = amazon() ? c14434l.f28259l.intValue() : c14434l.f28273l.intValue();
        if (i == 1) {
            iIntValue4 += amazon() ? c12199l.isPro : c12199l.subs;
        }
        int iIntValue5 = c14434l.f28244l.intValue() + iIntValue4;
        int iIntValue6 = c14434l2.f28256l.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            this.billing = view.getLayoutDirection() == 0 ? (rect3.left - this.isPro) + iIntValue5 : (rect3.right + this.isPro) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
            this.billing = view.getLayoutDirection() == 0 ? (rect3.right + this.isPro) - iIntValue5 : (rect3.left - this.isPro) + iIntValue5;
        }
        if (c14434l.f28271l.booleanValue()) {
            View viewLoadAd = loadAd();
            if (viewLoadAd != null) {
                FrameLayout frameLayoutLoadAd = loadAd();
                if (frameLayoutLoadAd == null || frameLayoutLoadAd.getId() != R.id.mtrl_anchor_parent) {
                    y = 0.0f;
                    x = 0.0f;
                } else if (viewLoadAd.getParent() instanceof View) {
                    y = viewLoadAd.getY();
                    x = viewLoadAd.getX();
                    viewLoadAd = (View) viewLoadAd.getParent();
                }
                y2 = viewLoadAd.getY() + (this.mopub - this.firebase) + y;
                x2 = viewLoadAd.getX() + (this.billing - this.isPro) + x;
                if (viewLoadAd.getParent() instanceof View) {
                    height = ((this.mopub + this.firebase) - (((View) viewLoadAd.getParent()).getHeight() - viewLoadAd.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewLoadAd.getParent() instanceof View) {
                    width = ((this.billing + this.isPro) - (((View) viewLoadAd.getParent()).getWidth() - viewLoadAd.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.mopub = Math.abs(y2) + this.mopub;
                }
                if (x2 < 0.0f) {
                    this.billing = Math.abs(x2) + this.billing;
                }
                if (height > 0.0f) {
                    this.mopub -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.billing -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                x = view.getX();
                View view2 = (View) view.getParent();
                y = y3;
                viewLoadAd = view2;
                y2 = viewLoadAd.getY() + (this.mopub - this.firebase) + y;
                x2 = viewLoadAd.getX() + (this.billing - this.isPro) + x;
                if (viewLoadAd.getParent() instanceof View) {
                    height = ((this.mopub + this.firebase) - (((View) viewLoadAd.getParent()).getHeight() - viewLoadAd.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewLoadAd.getParent() instanceof View) {
                    width = ((this.billing + this.isPro) - (((View) viewLoadAd.getParent()).getWidth() - viewLoadAd.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.mopub = Math.abs(y2) + this.mopub;
                }
                if (x2 < 0.0f) {
                    this.billing = Math.abs(x2) + this.billing;
                }
                if (height > 0.0f) {
                    this.mopub -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.billing -= Math.abs(width);
                }
            }
        }
        float f5 = this.billing;
        float f6 = this.mopub;
        float f7 = this.isPro;
        float f8 = this.firebase;
        rect2.set((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
        float f9 = this.subs;
        C5022l c5022l = this.loadAd;
        if (f9 != -1.0f) {
            C4968l c4968lPurchase = c5022l.f10262l.yandex.purchase();
            c4968lPurchase.purchase = new C16304l(f9);
            c4968lPurchase.billing = new C16304l(f9);
            c4968lPurchase.mopub = new C16304l(f9);
            c4968lPurchase.admob = new C16304l(f9);
            c5022l.setShapeAppearanceModel(c4968lPurchase.yandex());
        }
        if (rect.equals(rect2)) {
            return;
        }
        c5022l.setBounds(rect2);
    }

    public final boolean amazon() {
        return this.purchase.loadAd.f28260l != null || purchase();
    }

    public final void billing() {
        Context context = (Context) this.yandex.get();
        if (context == null) {
            return;
        }
        boolean zAmazon = amazon();
        C12199l c12199l = this.purchase;
        this.loadAd.setShapeAppearanceModel(C12564l.yandex(context, zAmazon ? c12199l.loadAd.f28248l.intValue() : c12199l.loadAd.f28262l.intValue(), amazon() ? c12199l.loadAd.f28251l.intValue() : c12199l.loadAd.f28268l.intValue(), new C16304l(0.0f)).yandex());
        invalidateSelf();
    }

    public final int crashlytics() {
        int i = this.purchase.loadAd.f28269l;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strYandex;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.loadAd.draw(canvas);
        if (!amazon() || (strYandex = yandex()) == null) {
            return;
        }
        Rect rect = new Rect();
        C1505l c1505l = this.crashlytics;
        c1505l.yandex.getTextBounds(strYandex, 0, strYandex.length(), rect);
        float fExactCenterY = this.mopub - rect.exactCenterY();
        canvas.drawText(strYandex, this.billing, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), c1505l.yandex);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.purchase.loadAd.f28267l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.amazon.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.amazon.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final FrameLayout loadAd() {
        WeakReference weakReference = this.remoteconfig;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final void mopub(View view, FrameLayout frameLayout) {
        this.smaato = new WeakReference(view);
        this.remoteconfig = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        admob();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final boolean purchase() {
        C14434l c14434l = this.purchase.loadAd;
        return c14434l.f28260l == null && c14434l.f28269l != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C12199l c12199l = this.purchase;
        c12199l.yandex.f28267l = i;
        c12199l.loadAd.f28267l = i;
        this.crashlytics.yandex.setAlpha(getAlpha());
        invalidateSelf();
    }

    public final String yandex() {
        C12199l c12199l = this.purchase;
        C14434l c14434l = c12199l.loadAd;
        C14434l c14434l2 = c12199l.loadAd;
        String str = c14434l.f28260l;
        WeakReference weakReference = this.yandex;
        if (str == null) {
            if (!purchase()) {
                return null;
            }
            int i = this.admob;
            if (i == -2 || crashlytics() <= i) {
                return NumberFormat.getInstance(c14434l2.f28270l).format(crashlytics());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(c14434l2.f28270l, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i2 = c14434l.f28266l;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
