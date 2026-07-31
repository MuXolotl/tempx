package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lؘِٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5669l extends AbstractC14278l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final PorterDuff.Mode f12063l = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public PorterDuffColorFilter f12064l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final float[] f12065l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Matrix f12066l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C2367l f12067l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f12068l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public ColorFilter f12069l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final Rect f12070l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f12071l;

    public C5669l() {
        this.f12071l = true;
        this.f12065l = new float[9];
        this.f12066l = new Matrix();
        this.f12070l = new Rect();
        C2367l c2367l = new C2367l();
        c2367l.crashlytics = null;
        c2367l.amazon = f12063l;
        c2367l.loadAd = new C10652l();
        this.f12067l = c2367l;
    }

    public static C5669l yandex(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C5669l c5669l = new C5669l();
            ThreadLocal threadLocal = AbstractC7525l.yandex;
            c5669l.f27961l = resources.getDrawable(i, theme);
            return c5669l;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            C5669l c5669l2 = new C5669l();
            c5669l2.inflate(resources, xml, attributeSetAsAttributeSet, theme);
            return c5669l2;
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f27961l;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f12070l;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f12069l;
        if (colorFilter == null) {
            colorFilter = this.f12064l;
        }
        Matrix matrix = this.f12066l;
        canvas.getMatrix(matrix);
        float[] fArr = this.f12065l;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C2367l c2367l = this.f12067l;
        Bitmap bitmap = c2367l.billing;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c2367l.billing.getHeight()) {
            c2367l.billing = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c2367l.firebase = true;
        }
        boolean z = this.f12071l;
        C2367l c2367l2 = this.f12067l;
        if (!z) {
            c2367l2.billing.eraseColor(0);
            Canvas canvas2 = new Canvas(c2367l2.billing);
            C10652l c10652l = c2367l2.loadAd;
            c10652l.yandex(c10652l.mopub, C10652l.startapp, canvas2, iMin, iMin2);
        } else if (c2367l2.firebase || c2367l2.mopub != c2367l2.crashlytics || c2367l2.admob != c2367l2.amazon || c2367l2.isPro != c2367l2.purchase || c2367l2.subs != c2367l2.loadAd.getRootAlpha()) {
            C2367l c2367l3 = this.f12067l;
            c2367l3.billing.eraseColor(0);
            Canvas canvas3 = new Canvas(c2367l3.billing);
            C10652l c10652l2 = c2367l3.loadAd;
            c10652l2.yandex(c10652l2.mopub, C10652l.startapp, canvas3, iMin, iMin2);
            C2367l c2367l4 = this.f12067l;
            c2367l4.mopub = c2367l4.crashlytics;
            c2367l4.admob = c2367l4.amazon;
            c2367l4.subs = c2367l4.loadAd.getRootAlpha();
            c2367l4.isPro = c2367l4.purchase;
            c2367l4.firebase = false;
        }
        C2367l c2367l5 = this.f12067l;
        if (c2367l5.loadAd.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c2367l5.smaato == null) {
                Paint paint2 = new Paint();
                c2367l5.smaato = paint2;
                paint2.setFilterBitmap(true);
            }
            c2367l5.smaato.setAlpha(c2367l5.loadAd.getRootAlpha());
            c2367l5.smaato.setColorFilter(colorFilter);
            paint = c2367l5.smaato;
        }
        canvas.drawBitmap(c2367l5.billing, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.getAlpha() : this.f12067l.loadAd.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f12067l.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.getColorFilter() : this.f12069l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f27961l != null && Build.VERSION.SDK_INT >= 24) {
            return new C12860l(this.f27961l.getConstantState());
        }
        this.f12067l.yandex = getChangingConfigurations();
        return this.f12067l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f12067l.loadAd.subs;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f12067l.loadAd.admob;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C2367l c2367l = this.f12067l;
        c2367l.loadAd = new C10652l();
        TypedArray typedArraySignature = AbstractC10310l.Signature(resources, theme, attributeSet, AbstractC14760l.yandex);
        C2367l c2367l2 = this.f12067l;
        C10652l c10652l = c2367l2.loadAd;
        int i5 = !AbstractC10310l.startapp(xmlPullParser, "tintMode") ? -1 : typedArraySignature.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c2367l2.amazon = mode;
        ColorStateList colorStateListRemoteconfig = AbstractC10310l.remoteconfig(typedArraySignature, xmlPullParser, theme);
        if (colorStateListRemoteconfig != null) {
            c2367l2.crashlytics = colorStateListRemoteconfig;
        }
        boolean z = c2367l2.purchase;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArraySignature.getBoolean(5, z);
        }
        c2367l2.purchase = z;
        float f = c10652l.isPro;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArraySignature.getFloat(7, f);
        }
        c10652l.isPro = f;
        float f2 = c10652l.firebase;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArraySignature.getFloat(8, f2);
        }
        c10652l.firebase = f2;
        if (c10652l.isPro <= 0.0f) {
            throw new XmlPullParserException(typedArraySignature.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArraySignature.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c10652l.admob = typedArraySignature.getDimension(3, c10652l.admob);
        int i7 = 2;
        float dimension = typedArraySignature.getDimension(2, c10652l.subs);
        c10652l.subs = dimension;
        if (c10652l.admob <= 0.0f) {
            throw new XmlPullParserException(typedArraySignature.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArraySignature.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c10652l.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArraySignature.getFloat(4, alpha);
        }
        c10652l.setAlpha(alpha);
        String string = typedArraySignature.getString(0);
        if (string != null) {
            c10652l.remoteconfig = string;
            c10652l.metrica.put(string, c10652l);
        }
        typedArraySignature.recycle();
        c2367l.yandex = getChangingConfigurations();
        int i8 = 1;
        c2367l.firebase = true;
        C2367l c2367l3 = this.f12067l;
        C10652l c10652l2 = c2367l3.loadAd;
        ArrayDeque arrayDeque = new ArrayDeque();
        C11347l c11347l = c10652l2.mopub;
        C11154l c11154l = c10652l2.metrica;
        arrayDeque.push(c11347l);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                C11347l c11347l2 = (C11347l) arrayDeque.peek();
                if (c11347l2 != null) {
                    ArrayList arrayList = c11347l2.loadAd;
                    i = depth;
                    if ("path".equals(name)) {
                        C3636l c3636l = new C3636l();
                        c3636l.purchase = 0.0f;
                        c3636l.mopub = 1.0f;
                        c3636l.admob = 1.0f;
                        c3636l.subs = 0.0f;
                        c3636l.isPro = 1.0f;
                        c3636l.firebase = 0.0f;
                        Paint.Cap cap2 = Paint.Cap.BUTT;
                        c3636l.smaato = cap2;
                        Paint.Join join2 = Paint.Join.MITER;
                        c3636l.remoteconfig = join2;
                        c3636l.vip = 4.0f;
                        TypedArray typedArraySignature2 = AbstractC10310l.Signature(resources, theme, attributeSet, AbstractC14760l.crashlytics);
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            String string2 = typedArraySignature2.getString(0);
                            if (string2 != null) {
                                c3636l.loadAd = string2;
                            }
                            String string3 = typedArraySignature2.getString(2);
                            if (string3 != null) {
                                c3636l.yandex = AbstractC15300l.mopub(string3);
                            }
                            c3636l.billing = AbstractC10310l.vip(typedArraySignature2, xmlPullParser, theme, "fillColor", 1);
                            float f3 = c3636l.admob;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                f3 = typedArraySignature2.getFloat(12, f3);
                            }
                            c3636l.admob = f3;
                            int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArraySignature2.getInt(8, -1) : -1;
                            Paint.Cap cap3 = c3636l.smaato;
                            if (i9 == 0) {
                                cap = cap2;
                            } else if (i9 != 1) {
                                cap = i9 != 2 ? cap3 : Paint.Cap.SQUARE;
                            } else {
                                cap = Paint.Cap.ROUND;
                            }
                            c3636l.smaato = cap;
                            int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArraySignature2.getInt(9, -1) : -1;
                            Paint.Join join3 = c3636l.remoteconfig;
                            if (i10 == 0) {
                                join = join2;
                            } else if (i10 != 1) {
                                join = i10 != 2 ? join3 : Paint.Join.BEVEL;
                            } else {
                                join = Paint.Join.ROUND;
                            }
                            c3636l.remoteconfig = join;
                            float f4 = c3636l.vip;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                f4 = typedArraySignature2.getFloat(10, f4);
                            }
                            c3636l.vip = f4;
                            c3636l.amazon = AbstractC10310l.vip(typedArraySignature2, xmlPullParser, theme, "strokeColor", 3);
                            float f5 = c3636l.mopub;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                f5 = typedArraySignature2.getFloat(11, f5);
                            }
                            c3636l.mopub = f5;
                            float f6 = c3636l.purchase;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                f6 = typedArraySignature2.getFloat(4, f6);
                            }
                            c3636l.purchase = f6;
                            float f7 = c3636l.isPro;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                f7 = typedArraySignature2.getFloat(6, f7);
                            }
                            c3636l.isPro = f7;
                            float f8 = c3636l.firebase;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                f8 = typedArraySignature2.getFloat(7, f8);
                            }
                            c3636l.firebase = f8;
                            float f9 = c3636l.subs;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                f9 = typedArraySignature2.getFloat(5, f9);
                            }
                            c3636l.subs = f9;
                            int i11 = c3636l.crashlytics;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                i11 = typedArraySignature2.getInt(13, i11);
                            }
                            c3636l.crashlytics = i11;
                        }
                        typedArraySignature2.recycle();
                        arrayList.add(c3636l);
                        if (c3636l.getPathName() != null) {
                            c11154l.put(c3636l.getPathName(), c3636l);
                        }
                        c2367l3.yandex = c2367l3.yandex;
                        i4 = 1;
                        z2 = false;
                    } else {
                        if ("clip-path".equals(name)) {
                            C6567l c6567l = new C6567l();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray typedArraySignature3 = AbstractC10310l.Signature(resources, theme, attributeSet, AbstractC14760l.amazon);
                                String string4 = typedArraySignature3.getString(0);
                                if (string4 != null) {
                                    c6567l.loadAd = string4;
                                }
                                String string5 = typedArraySignature3.getString(1);
                                if (string5 != null) {
                                    c6567l.yandex = AbstractC15300l.mopub(string5);
                                }
                                c6567l.crashlytics = !AbstractC10310l.startapp(xmlPullParser, "fillType") ? 0 : typedArraySignature3.getInt(2, 0);
                                typedArraySignature3.recycle();
                            }
                            arrayList.add(c6567l);
                            if (c6567l.getPathName() != null) {
                                c11154l.put(c6567l.getPathName(), c6567l);
                            }
                            c2367l3.yandex = c2367l3.yandex;
                        } else if ("group".equals(name)) {
                            C11347l c11347l3 = new C11347l();
                            TypedArray typedArraySignature4 = AbstractC10310l.Signature(resources, theme, attributeSet, AbstractC14760l.loadAd);
                            float f10 = c11347l3.crashlytics;
                            if (AbstractC10310l.startapp(xmlPullParser, "rotation")) {
                                f10 = typedArraySignature4.getFloat(5, f10);
                            }
                            c11347l3.crashlytics = f10;
                            i4 = 1;
                            c11347l3.amazon = typedArraySignature4.getFloat(1, c11347l3.amazon);
                            c11347l3.purchase = typedArraySignature4.getFloat(2, c11347l3.purchase);
                            float f11 = c11347l3.billing;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f11 = typedArraySignature4.getFloat(3, f11);
                            }
                            c11347l3.billing = f11;
                            float f12 = c11347l3.mopub;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f12 = typedArraySignature4.getFloat(4, f12);
                            }
                            c11347l3.mopub = f12;
                            float f13 = c11347l3.admob;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f13 = typedArraySignature4.getFloat(6, f13);
                            }
                            c11347l3.admob = f13;
                            float f14 = c11347l3.subs;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f14 = typedArraySignature4.getFloat(7, f14);
                            }
                            c11347l3.subs = f14;
                            String string6 = typedArraySignature4.getString(0);
                            if (string6 != null) {
                                c11347l3.firebase = string6;
                            }
                            c11347l3.crashlytics();
                            typedArraySignature4.recycle();
                            arrayList.add(c11347l3);
                            arrayDeque.push(c11347l3);
                            if (c11347l3.getGroupName() != null) {
                                c11154l.put(c11347l3.getGroupName(), c11347l3);
                            }
                            c2367l3.yandex = c2367l3.yandex;
                        }
                        i4 = 1;
                    }
                } else {
                    i = depth;
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i6;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i6 = i2;
            i8 = i3;
            depth = i;
            i7 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.f12064l = loadAd(c2367l.crashlytics, c2367l.amazon);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.isAutoMirrored() : this.f12067l.purchase;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C2367l c2367l = this.f12067l;
        if (c2367l == null) {
            return false;
        }
        C10652l c10652l = c2367l.loadAd;
        if (c10652l.vip == null) {
            c10652l.vip = Boolean.valueOf(c10652l.mopub.yandex());
        }
        if (c10652l.vip.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f12067l.crashlytics;
        return colorStateList != null && colorStateList.isStateful();
    }

    public final PorterDuffColorFilter loadAd(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f12068l && super.mutate() == this) {
            C2367l c2367l = this.f12067l;
            C2367l c2367l2 = new C2367l();
            c2367l2.crashlytics = null;
            c2367l2.amazon = f12063l;
            if (c2367l != null) {
                c2367l2.yandex = c2367l.yandex;
                C10652l c10652l = new C10652l(c2367l.loadAd);
                c2367l2.loadAd = c10652l;
                if (c2367l.loadAd.purchase != null) {
                    c10652l.purchase = new Paint(c2367l.loadAd.purchase);
                }
                if (c2367l.loadAd.amazon != null) {
                    c2367l2.loadAd.amazon = new Paint(c2367l.loadAd.amazon);
                }
                c2367l2.crashlytics = c2367l.crashlytics;
                c2367l2.amazon = c2367l.amazon;
                c2367l2.purchase = c2367l.purchase;
            }
            this.f12067l = c2367l2;
            this.f12068l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C2367l c2367l = this.f12067l;
        ColorStateList colorStateList = c2367l.crashlytics;
        if (colorStateList == null || (mode = c2367l.amazon) == null) {
            z = false;
        } else {
            this.f12064l = loadAd(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C10652l c10652l = c2367l.loadAd;
        if (c10652l.vip == null) {
            c10652l.vip = Boolean.valueOf(c10652l.mopub.yandex());
        }
        if (c10652l.vip.booleanValue()) {
            boolean zLoadAd = c2367l.loadAd.mopub.loadAd(iArr);
            c2367l.firebase |= zLoadAd;
            if (zLoadAd) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f12067l.loadAd.getRootAlpha() != i) {
            this.f12067l.loadAd.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f12067l.purchase = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f12069l = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C2367l c2367l = this.f12067l;
        if (c2367l.crashlytics != colorStateList) {
            c2367l.crashlytics = colorStateList;
            this.f12064l = loadAd(colorStateList, c2367l.amazon);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C2367l c2367l = this.f12067l;
        if (c2367l.amazon != mode) {
            c2367l.amazon = mode;
            this.f12064l = loadAd(c2367l.crashlytics, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public C5669l(C2367l c2367l) {
        this.f12071l = true;
        this.f12065l = new float[9];
        this.f12066l = new Matrix();
        this.f12070l = new Rect();
        this.f12067l = c2367l;
        this.f12064l = loadAd(c2367l.crashlytics, c2367l.amazon);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
