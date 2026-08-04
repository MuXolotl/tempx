package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import j$.util.Objects;
import java.util.BitSet;

/* JADX INFO: renamed from: lٜٟؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C5022l extends Drawable implements InterfaceC15751l {

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final Paint f10252l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final RectF f10253l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C12564l f10254l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC17546l[] f10255l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Path f10256l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public int f10257l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public PorterDuffColorFilter f10258l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Path f10259l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C17724l f10260l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC17546l[] f10261l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C18309l f10262l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public PorterDuffColorFilter f10263l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C1770l f10264l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final RectF f10265l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final Paint f10266l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f10267l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final BitSet f10268l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final Region f10269l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final RectF f10270l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Matrix f10271l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final Region f10272l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final Paint f10273l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C5044l f10274l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f10275l;

    static {
        Paint paint = new Paint(1);
        f10252l = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C5022l(C18309l c18309l) {
        this.f10261l = new AbstractC17546l[4];
        this.f10255l = new AbstractC17546l[4];
        this.f10268l = new BitSet(8);
        this.f10271l = new Matrix();
        this.f10256l = new Path();
        this.f10259l = new Path();
        this.f10270l = new RectF();
        this.f10265l = new RectF();
        this.f10272l = new Region();
        this.f10269l = new Region();
        Paint paint = new Paint(1);
        this.f10273l = paint;
        Paint paint2 = new Paint(1);
        this.f10266l = paint2;
        this.f10260l = new C17724l();
        this.f10274l = Looper.getMainLooper().getThread() == Thread.currentThread() ? AbstractC5764l.yandex : new C5044l();
        this.f10253l = new RectF();
        this.f10275l = true;
        this.f10262l = c18309l;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        vip();
        remoteconfig(getState());
        this.f10264l = new C1770l(18, this);
    }

    public final boolean admob() {
        return this.f10262l.yandex.amazon(amazon());
    }

    public final RectF amazon() {
        Rect bounds = getBounds();
        RectF rectF = this.f10270l;
        rectF.set(bounds);
        return rectF;
    }

    public final boolean billing() {
        Paint.Style style = this.f10262l.startapp;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f10266l.getStrokeWidth() > 0.0f;
    }

    public void crashlytics(Canvas canvas) {
        C12564l c12564l = this.f10254l;
        RectF rectFAmazon = amazon();
        RectF rectF = this.f10265l;
        rectF.set(rectFAmazon);
        boolean zBilling = billing();
        Paint paint = this.f10266l;
        float strokeWidth = zBilling ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        if (!c12564l.amazon(rectF)) {
            canvas.drawPath(this.f10259l, paint);
        } else {
            float fYandex = c12564l.billing.yandex(rectF) * this.f10262l.subs;
            canvas.drawRoundRect(rectF, fYandex, fYandex, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.f10263l;
        Paint paint = this.f10273l;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f10262l.firebase;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f10258l;
        Paint paint2 = this.f10266l;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f10262l.isPro);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f10262l.firebase;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f10267l;
        Path path = this.f10256l;
        if (z) {
            float f = -(billing() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C12564l c12564l = this.f10262l.yandex;
            C4968l c4968lPurchase = c12564l.purchase();
            InterfaceC13600l c16323l = c12564l.purchase;
            if (!(c16323l instanceof C1255l)) {
                c16323l = new C16323l(f, c16323l);
            }
            c4968lPurchase.purchase = c16323l;
            InterfaceC13600l c16323l2 = c12564l.billing;
            if (!(c16323l2 instanceof C1255l)) {
                c16323l2 = new C16323l(f, c16323l2);
            }
            c4968lPurchase.billing = c16323l2;
            InterfaceC13600l c16323l3 = c12564l.admob;
            if (!(c16323l3 instanceof C1255l)) {
                c16323l3 = new C16323l(f, c16323l3);
            }
            c4968lPurchase.admob = c16323l3;
            InterfaceC13600l c16323l4 = c12564l.mopub;
            if (!(c16323l4 instanceof C1255l)) {
                c16323l4 = new C16323l(f, c16323l4);
            }
            c4968lPurchase.mopub = c16323l4;
            C12564l c12564lYandex = c4968lPurchase.yandex();
            this.f10254l = c12564lYandex;
            float f2 = this.f10262l.subs;
            RectF rectFAmazon = amazon();
            RectF rectF = this.f10265l;
            rectF.set(rectFAmazon);
            float strokeWidth = billing() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f10274l.loadAd(c12564lYandex, f2, rectF, null, this.f10259l);
            yandex(amazon(), path);
            this.f10267l = false;
        }
        C18309l c18309l = this.f10262l;
        c18309l.getClass();
        if (c18309l.vip > 0 && !admob() && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.f10262l.metrica)), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f10262l.metrica)));
            if (this.f10275l) {
                RectF rectF2 = this.f10253l;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    C8339l.smaato("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f10262l.vip * 2) + ((int) rectF2.width()) + iWidth, (this.f10262l.vip * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f3 = (getBounds().left - this.f10262l.vip) - iWidth;
                float f4 = (getBounds().top - this.f10262l.vip) - iHeight;
                canvas2.translate(-f3, -f4);
                loadAd(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                loadAd(canvas);
                canvas.restore();
            }
        }
        C18309l c18309l2 = this.f10262l;
        Paint.Style style = c18309l2.startapp;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            C12564l c12564l2 = c18309l2.yandex;
            RectF rectFAmazon2 = amazon();
            if (c12564l2.amazon(rectFAmazon2)) {
                float fYandex = c12564l2.billing.yandex(rectFAmazon2) * this.f10262l.subs;
                canvas.drawRoundRect(rectFAmazon2, fYandex, fYandex, paint);
            } else {
                canvas.drawPath(path, paint);
            }
        }
        if (billing()) {
            crashlytics(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void firebase(float f) {
        C18309l c18309l = this.f10262l;
        if (c18309l.subs != f) {
            c18309l.subs = f;
            this.f10267l = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f10262l.firebase;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f10262l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f10262l.getClass();
        if (admob()) {
            outline.setRoundRect(getBounds(), purchase() * this.f10262l.subs);
            return;
        }
        RectF rectFAmazon = amazon();
        Path path = this.f10256l;
        yandex(rectFAmazon, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC7336l.yandex(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC17298l.yandex(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC17298l.yandex(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f10262l.mopub;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f10272l;
        region.set(bounds);
        RectF rectFAmazon = amazon();
        Path path = this.f10256l;
        yandex(rectFAmazon, path);
        Region region2 = this.f10269l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f10267l = true;
        super.invalidateSelf();
    }

    public final void isPro(ColorStateList colorStateList) {
        C18309l c18309l = this.f10262l;
        if (c18309l.crashlytics != colorStateList) {
            c18309l.crashlytics = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f10262l.purchase;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f10262l.getClass();
        ColorStateList colorStateList2 = this.f10262l.amazon;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f10262l.crashlytics;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void loadAd(Canvas canvas) {
        if (this.f10268l.cardinality() > 0) {
            Log.w("lٜٟؗ", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f10262l.metrica;
        Path path = this.f10256l;
        C17724l c17724l = this.f10260l;
        if (i != 0) {
            canvas.drawPath(path, (Paint) c17724l.amazon);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC17546l abstractC17546l = this.f10261l[i2];
            int i3 = this.f10262l.vip;
            Matrix matrix = AbstractC17546l.loadAd;
            abstractC17546l.yandex(matrix, c17724l, i3, canvas);
            this.f10255l[i2].yandex(matrix, c17724l, this.f10262l.vip, canvas);
        }
        if (this.f10275l) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.f10262l.metrica));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f10262l.metrica));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f10252l);
            canvas.translate(iSin, iCos);
        }
    }

    public final void metrica() {
        C18309l c18309l = this.f10262l;
        float f = c18309l.remoteconfig + 0.0f;
        c18309l.vip = (int) Math.ceil(0.75f * f);
        this.f10262l.metrica = (int) Math.ceil(f * 0.25f);
        vip();
        super.invalidateSelf();
    }

    public final void mopub(Context context) {
        this.f10262l.loadAd = new C4079l(context);
        metrica();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f10262l = new C18309l(this.f10262l);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f10267l = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = remoteconfig(iArr) || vip();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final float purchase() {
        return this.f10262l.yandex.purchase.yandex(amazon());
    }

    public final boolean remoteconfig(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f10262l.crashlytics == null || color2 == (colorForState2 = this.f10262l.crashlytics.getColorForState(iArr, (color2 = (paint2 = this.f10273l).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f10262l.amazon == null || color == (colorForState = this.f10262l.amazon.getColorForState(iArr, (color = (paint = this.f10266l).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C18309l c18309l = this.f10262l;
        if (c18309l.firebase != i) {
            c18309l.firebase = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10262l.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.InterfaceC15751l
    public final void setShapeAppearanceModel(C12564l c12564l) {
        this.f10262l.yandex = c12564l;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f10262l.purchase = colorStateList;
        vip();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C18309l c18309l = this.f10262l;
        if (c18309l.billing != mode) {
            c18309l.billing = mode;
            vip();
            super.invalidateSelf();
        }
    }

    public final void smaato() {
        this.f10260l.pro(-12303292);
        this.f10262l.getClass();
        super.invalidateSelf();
    }

    public final void subs(float f) {
        C18309l c18309l = this.f10262l;
        if (c18309l.remoteconfig != f) {
            c18309l.remoteconfig = f;
            metrica();
        }
    }

    public final boolean vip() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f10263l;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f10258l;
        C18309l c18309l = this.f10262l;
        ColorStateList colorStateList = c18309l.purchase;
        PorterDuff.Mode mode = c18309l.billing;
        if (colorStateList == null || mode == null) {
            int color = this.f10273l.getColor();
            C18309l c18309l2 = this.f10262l;
            float f = c18309l2.remoteconfig + 0.0f + c18309l2.smaato;
            C4079l c4079l = c18309l2.loadAd;
            int iYandex = c4079l != null ? c4079l.yandex(color, f) : color;
            this.f10257l = iYandex;
            porterDuffColorFilter = iYandex != color ? new PorterDuffColorFilter(iYandex, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            C18309l c18309l3 = this.f10262l;
            float f2 = c18309l3.remoteconfig + 0.0f + c18309l3.smaato;
            C4079l c4079l2 = c18309l3.loadAd;
            if (c4079l2 != null) {
                colorForState = c4079l2.yandex(colorForState, f2);
            }
            this.f10257l = colorForState;
            porterDuffColorFilter = new PorterDuffColorFilter(colorForState, mode);
        }
        this.f10263l = porterDuffColorFilter;
        this.f10262l.getClass();
        this.f10258l = null;
        this.f10262l.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f10263l) && Objects.equals(porterDuffColorFilter3, this.f10258l)) ? false : true;
    }

    public final void yandex(RectF rectF, Path path) {
        C18309l c18309l = this.f10262l;
        this.f10274l.loadAd(c18309l.yandex, c18309l.subs, rectF, this.f10264l, path);
        if (this.f10262l.admob != 1.0f) {
            Matrix matrix = this.f10271l;
            matrix.reset();
            float f = this.f10262l.admob;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f10253l, true);
    }

    public C5022l(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C12564l.loadAd(context, attributeSet, i, i2).yandex());
    }

    public C5022l(C12564l c12564l) {
        this(new C18309l(c12564l));
    }

    public C5022l() {
        this(new C12564l());
    }
}
