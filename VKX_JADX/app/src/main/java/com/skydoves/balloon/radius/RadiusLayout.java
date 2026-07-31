package com.skydoves.balloon.radius;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.AbstractC15684l;
import defpackage.AbstractC1753l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC8576l;
import defpackage.C0114l;
import defpackage.C13568l;
import defpackage.C18725l;
import defpackage.EnumC6748l;
import defpackage.InterfaceC13922l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR.\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010,\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R*\u00100\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R*\u00104\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010)\u001a\u0004\b2\u0010$\"\u0004\b3\u0010&R*\u0010<\u001a\u0002052\u0006\u0010\u000f\u001a\u0002058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010$¨\u0006?"}, d2 = {"Lcom/skydoves/balloon/radius/RadiusLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "", "setFillColor", "(I)V", "Landroid/graphics/drawable/Drawable;", "value", "lٍۥۗ", "Landroid/graphics/drawable/Drawable;", "getCustomShapeBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "setCustomShapeBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "customShapeBackgroundDrawable", "", "lٍۣۢ", "Z", "getDrawCustomShape", "()Z", "setDrawCustomShape", "(Z)V", "drawCustomShape", "", "<set-?>", "lٍَؑ", "Llْۖؓ;", "getRadius", "()F", "setRadius", "(F)V", "radius", "lٕۛۨ", "F", "getArrowHeight", "setArrowHeight", "arrowHeight", "lُٓٚ", "getArrowWidth", "setArrowWidth", "arrowWidth", "lؒٝؖ", "getArrowPositionRatio", "setArrowPositionRatio", "arrowPositionRatio", "Llؙۛ٘;", "lُٗۜ", "Llؙۛ٘;", "getArrowOrientation", "()Llؙۛ٘;", "setArrowOrientation", "(Llؙۛ٘;)V", "arrowOrientation", "getHalfStroke", "halfStroke", "balloon_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RadiusLayout extends FrameLayout {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f794l = {AbstractC18202l.yandex.billing(new C0114l(RadiusLayout.class, "radius", "getRadius()F", 0))};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters and from kotlin metadata */
    public float arrowPositionRatio;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Paint f796l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f797l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f798l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Paint f799l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Path f800l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters and from kotlin metadata */
    public final C13568l radius;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters and from kotlin metadata */
    public boolean drawCustomShape;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters and from kotlin metadata */
    public Drawable customShapeBackgroundDrawable;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters and from kotlin metadata */
    public float arrowWidth;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f805l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f806l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters and from kotlin metadata */
    public float arrowHeight;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters and from kotlin metadata */
    public EnumC6748l arrowOrientation;

    public RadiusLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.f800l = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f799l = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.MITER);
        this.f796l = paint2;
        this.radius = AbstractC15684l.mopub(this, Float.valueOf(0.0f));
        this.arrowPositionRatio = 0.5f;
        this.arrowOrientation = EnumC6748l.f14149l;
    }

    private final float getHalfStroke() {
        Paint paint = this.f796l;
        if (paint.getStrokeWidth() > 0.0f) {
            return paint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.drawCustomShape) {
            Path path = this.f800l;
            if (!path.isEmpty()) {
                int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                Paint paint = this.f796l;
                if (paint.getStrokeWidth() > 0.0f) {
                    canvas.drawPath(path, paint);
                }
                canvas.clipPath(path);
                Drawable drawable = this.customShapeBackgroundDrawable;
                if (drawable == null) {
                    canvas.drawPath(path, this.f799l);
                } else if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                canvas.restoreToCount(iSaveLayer);
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    public final float getArrowHeight() {
        return this.arrowHeight;
    }

    public final EnumC6748l getArrowOrientation() {
        return this.arrowOrientation;
    }

    public final float getArrowPositionRatio() {
        return this.arrowPositionRatio;
    }

    public final float getArrowWidth() {
        return this.arrowWidth;
    }

    public final Drawable getCustomShapeBackgroundDrawable() {
        return this.customShapeBackgroundDrawable;
    }

    public final boolean getDrawCustomShape() {
        return this.drawCustomShape;
    }

    public final float getRadius() {
        InterfaceC13922l interfaceC13922l = f794l[0];
        return ((Number) this.radius.f26580l).floatValue();
    }

    public final void loadAd() {
        if (this.drawCustomShape) {
            float halfStroke = (this.arrowHeight * 0.5f) + getHalfStroke();
            int i = this.f806l;
            EnumC6748l enumC6748l = this.arrowOrientation;
            super.setPadding(i + (enumC6748l == EnumC6748l.f14147l ? (int) halfStroke : 0), this.f797l + (enumC6748l == EnumC6748l.f14148l ? (int) halfStroke : 0), this.f798l + (enumC6748l == EnumC6748l.f14151l ? (int) halfStroke : 0), this.f805l + (enumC6748l == EnumC6748l.f14149l ? (int) halfStroke : 0));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.f800l;
        path.rewind();
        path.addRoundRect(new RectF(0.0f, 0.0f, i, i2), getRadius(), getRadius(), Path.Direction.CW);
        if (this.drawCustomShape) {
            yandex();
            loadAd();
            Drawable drawable = this.customShapeBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, i, i2);
            }
            requestLayout();
        }
    }

    public final void setArrowHeight(float f) {
        if (this.arrowHeight == f) {
            return;
        }
        this.arrowHeight = f;
        if (this.drawCustomShape) {
            yandex();
        }
        if (this.drawCustomShape) {
            loadAd();
        }
    }

    public final void setArrowOrientation(EnumC6748l enumC6748l) {
        if (this.arrowOrientation != enumC6748l) {
            this.arrowOrientation = enumC6748l;
            if (this.drawCustomShape) {
                yandex();
            }
            if (this.drawCustomShape) {
                loadAd();
            }
        }
    }

    public final void setArrowPositionRatio(float f) {
        if (this.arrowPositionRatio == f) {
            return;
        }
        this.arrowPositionRatio = f;
        if (this.drawCustomShape) {
            yandex();
        }
    }

    public final void setArrowWidth(float f) {
        if (this.arrowWidth == f) {
            return;
        }
        this.arrowWidth = f;
        if (this.drawCustomShape) {
            yandex();
        }
    }

    public final void setCustomShapeBackgroundDrawable(Drawable drawable) {
        if (AbstractC8576l.yandex(this.customShapeBackgroundDrawable, drawable)) {
            return;
        }
        this.customShapeBackgroundDrawable = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        invalidate();
    }

    public final void setDrawCustomShape(boolean z) {
        if (this.drawCustomShape != z) {
            this.drawCustomShape = z;
            setWillNotDraw(!z);
            invalidate();
        }
    }

    public final void setFillColor(int color) {
        this.f799l.setColor(color);
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f806l = i;
        this.f797l = i2;
        this.f798l = i3;
        this.f805l = i4;
        if (this.drawCustomShape) {
            loadAd();
        } else {
            super.setPadding(i, i2, i3, i4);
        }
    }

    public final void setRadius(float f) {
        this.radius.tapsense(f794l[0], Float.valueOf(f));
    }

    public final void yandex() {
        Path path = this.f800l;
        path.reset();
        if (!this.drawCustomShape || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float f = this.arrowHeight * 0.5f;
        float halfStroke = getHalfStroke() + f;
        float halfStroke2 = this.arrowOrientation == EnumC6748l.f14147l ? halfStroke : getHalfStroke();
        float halfStroke3 = this.arrowOrientation == EnumC6748l.f14148l ? halfStroke : getHalfStroke();
        float width = this.arrowOrientation == EnumC6748l.f14151l ? getWidth() - halfStroke : getWidth() - getHalfStroke();
        float height = this.arrowOrientation == EnumC6748l.f14149l ? getHeight() - halfStroke : getHeight() - getHalfStroke();
        float fAmazon = AbstractC8576l.amazon(getWidth() * this.arrowPositionRatio, (this.arrowWidth / 2.0f) + getHalfStroke(), (getWidth() - (this.arrowWidth / 2.0f)) - getHalfStroke());
        float fAmazon2 = AbstractC8576l.amazon(getHeight() * this.arrowPositionRatio, (this.arrowWidth / 2.0f) + getHalfStroke(), (getHeight() - (this.arrowWidth / 2.0f)) - getHalfStroke());
        int iOrdinal = this.arrowOrientation.ordinal();
        if (iOrdinal == 0) {
            path.moveTo(getRadius() + halfStroke2, halfStroke3);
            path.lineTo(width - getRadius(), halfStroke3);
            path.quadTo(width, halfStroke3, width, getRadius() + halfStroke3);
            path.lineTo(width, height - getRadius());
            path.quadTo(width, height, width - getRadius(), height);
            path.lineTo((this.arrowWidth / 2.0f) + fAmazon, height);
            path.lineTo(fAmazon, f + height);
            path.lineTo(fAmazon - (this.arrowWidth / 2.0f), height);
            path.lineTo(getRadius() + halfStroke2, height);
            path.quadTo(halfStroke2, height, halfStroke2, height - getRadius());
            path.lineTo(halfStroke2, getRadius() + halfStroke3);
            path.quadTo(halfStroke2, halfStroke3, getRadius() + halfStroke2, halfStroke3);
        } else if (iOrdinal == 1) {
            path.moveTo(getRadius() + halfStroke2, height);
            path.lineTo(width - getRadius(), height);
            path.quadTo(width, height, width, height - getRadius());
            path.lineTo(width, getRadius() + halfStroke3);
            path.quadTo(width, halfStroke3, width - getRadius(), halfStroke3);
            path.lineTo((this.arrowWidth / 2.0f) + fAmazon, halfStroke3);
            path.lineTo(fAmazon, halfStroke3 - f);
            path.lineTo(fAmazon - (this.arrowWidth / 2.0f), halfStroke3);
            path.lineTo(getRadius() + halfStroke2, halfStroke3);
            path.quadTo(halfStroke2, halfStroke3, halfStroke2, getRadius() + halfStroke3);
            path.lineTo(halfStroke2, height - getRadius());
            path.quadTo(halfStroke2, height, getRadius() + halfStroke2, height);
        } else if (iOrdinal == 2) {
            path.moveTo(getRadius() + halfStroke2, halfStroke3);
            path.lineTo(width - getRadius(), halfStroke3);
            path.quadTo(width, halfStroke3, width, getRadius() + halfStroke3);
            path.lineTo(width, height - getRadius());
            path.quadTo(width, height, width - getRadius(), height);
            path.lineTo(getRadius() + halfStroke2, height);
            path.quadTo(halfStroke2, height, halfStroke2, height - getRadius());
            path.lineTo(halfStroke2, (this.arrowWidth / 2.0f) + fAmazon2);
            path.lineTo(halfStroke2 - f, fAmazon2);
            path.lineTo(halfStroke2, fAmazon2 - (this.arrowWidth / 2.0f));
            path.lineTo(halfStroke2, getRadius() + halfStroke3);
            path.quadTo(halfStroke2, halfStroke3, getRadius() + halfStroke2, halfStroke3);
        } else {
            if (iOrdinal != 3) {
                C18725l.billing();
                return;
            }
            path.moveTo(getRadius() + halfStroke2, halfStroke3);
            path.lineTo(width - getRadius(), halfStroke3);
            path.quadTo(width, halfStroke3, width, getRadius() + halfStroke3);
            path.lineTo(width, fAmazon2 - (this.arrowWidth / 2.0f));
            path.lineTo(f + width, fAmazon2);
            path.lineTo(width, (this.arrowWidth / 2.0f) + fAmazon2);
            path.lineTo(width, height - getRadius());
            path.quadTo(width, height, width - getRadius(), height);
            path.lineTo(getRadius() + halfStroke2, height);
            path.quadTo(halfStroke2, height, halfStroke2, height - getRadius());
            path.lineTo(halfStroke2, getRadius() + halfStroke3);
            path.quadTo(halfStroke2, halfStroke3, getRadius() + halfStroke2, halfStroke3);
        }
        path.close();
        invalidate();
    }

    public RadiusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RadiusLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RadiusLayout(Context context, AttributeSet attributeSet, int i, int i2, AbstractC1753l abstractC1753l) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
