package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lٖۥؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16759l {
    public static final C15578l yandex = new C15578l(1863131183, false, new C5974l(4));

    public static String amazon(int i) {
        if (i == 0) {
            return "Clear";
        }
        if (i == 1) {
            return "Src";
        }
        if (i == 2) {
            return "Dst";
        }
        if (i == 3) {
            return "SrcOver";
        }
        if (i == 4) {
            return "DstOver";
        }
        if (i == 5) {
            return "SrcIn";
        }
        if (i == 6) {
            return "DstIn";
        }
        if (i == 7) {
            return "SrcOut";
        }
        if (i == 8) {
            return "DstOut";
        }
        if (i == 9) {
            return "SrcAtop";
        }
        if (i == 10) {
            return "DstAtop";
        }
        if (i == 11) {
            return "Xor";
        }
        if (i == 12) {
            return "Plus";
        }
        if (i == 13) {
            return "Modulate";
        }
        if (i == 14) {
            return "Screen";
        }
        if (i == 15) {
            return "Overlay";
        }
        if (i == 16) {
            return "Darken";
        }
        if (i == 17) {
            return "Lighten";
        }
        if (i == 18) {
            return "ColorDodge";
        }
        if (i == 19) {
            return "ColorBurn";
        }
        if (i == 20) {
            return "HardLight";
        }
        if (i == 21) {
            return "Softlight";
        }
        if (i == 22) {
            return "Difference";
        }
        if (i == 23) {
            return "Exclusion";
        }
        if (i == 24) {
            return "Multiply";
        }
        if (i == 25) {
            return "Hue";
        }
        if (i == 26) {
            return "Saturation";
        }
        if (i == 27) {
            return "Color";
        }
        return i == 28 ? "Luminosity" : "Unknown";
    }

    public static final AbstractC14165l crashlytics(int i, int i2, C6956l c6956l) {
        TypedValue typedValue;
        boolean z;
        Context context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
        Resources resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
        C16321l c16321l = (C16321l) c6956l.isPro(AbstractC1242l.purchase);
        synchronized (c16321l) {
            typedValue = (TypedValue) c16321l.yandex.loadAd(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                C16977l c16977l = c16321l.yandex;
                int iAmazon = c16977l.amazon(i);
                Object[] objArr = c16977l.crashlytics;
                Object obj = objArr[iAmazon];
                c16977l.loadAd[iAmazon] = i;
                objArr[iAmazon] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !AbstractC12024l.m3341strictfp(charSequence, ".xml")) {
            c6956l.m2123default(-1771643000);
            Object theme = context.getTheme();
            boolean zBilling = c6956l.billing(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !c6956l.amazon(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean zBilling2 = zBilling | z | c6956l.billing(theme);
            Object objM2132native = c6956l.m2132native();
            if (zBilling2 || objM2132native == C1867l.yandex) {
                try {
                    objM2132native = new C14115l(((BitmapDrawable) resources.getDrawable(i, null)).getBitmap());
                    c6956l.m2147try(objM2132native);
                } catch (Exception e) {
                    throw new C6451l(13, "Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            C14115l c14115l = (C14115l) objM2132native;
            C7733l c7733l = new C7733l(c14115l, (((long) c14115l.yandex.getWidth()) << 32) | (((long) c14115l.yandex.getHeight()) & 4294967295L));
            c6956l.startapp(false);
            return c7733l;
        }
        c6956l.m2123default(-1771798434);
        Resources.Theme theme2 = context.getTheme();
        int i3 = typedValue.changingConfigurations;
        C16613l c16613l = (C16613l) c6956l.isPro(AbstractC1242l.amazon);
        C0300l c0300l = new C0300l(i, theme2);
        WeakReference weakReference = (WeakReference) c16613l.yandex.get(c0300l);
        C0269l c0269lIsPro = weakReference != null ? (C0269l) weakReference.get() : null;
        if (c0269lIsPro == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!AbstractC8576l.yandex(xml.getName(), "vector")) {
                C8339l.metrica("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            c0269lIsPro = AbstractC15960l.isPro(theme2, resources, xml, i3);
            c16613l.yandex.put(c0300l, new WeakReference(c0269lIsPro));
        }
        C3408l c3408lTapsense = AbstractC13041l.tapsense(c0269lIsPro.yandex, c6956l);
        c6956l.startapp(false);
        return c3408lTapsense;
    }

    public static void loadAd(Drawable drawable, Matrix matrix, int i, int i2, ImageView.ScaleType scaleType) {
        float f;
        float f2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        boolean z = (intrinsicWidth < 0 || i == intrinsicWidth) && (intrinsicHeight < 0 || i2 == intrinsicHeight);
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || ImageView.ScaleType.FIT_XY == scaleType) {
            drawable.setBounds(0, 0, i, i2);
            matrix.reset();
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        if (z) {
            matrix.reset();
            return;
        }
        if (ImageView.ScaleType.CENTER == scaleType) {
            matrix.reset();
            matrix.setTranslate(Math.round((i - intrinsicWidth) * 0.5f), Math.round((i2 - intrinsicHeight) * 0.5f));
            return;
        }
        if (ImageView.ScaleType.CENTER_CROP != scaleType) {
            if (ImageView.ScaleType.CENTER_INSIDE != scaleType) {
                C18353l.metrica(scaleType, "Scale type not supported: ");
                return;
            }
            matrix.reset();
            float fMin = (intrinsicWidth > i || intrinsicHeight > i2) ? Math.min(i / intrinsicWidth, i2 / intrinsicHeight) : 1.0f;
            matrix.setScale(fMin, fMin);
            matrix.postTranslate(Math.round((i - (intrinsicWidth * fMin)) * 0.5f), Math.round((i2 - (intrinsicHeight * fMin)) * 0.5f));
            return;
        }
        matrix.reset();
        float f3 = 0.0f;
        if (intrinsicWidth * i2 > i * intrinsicHeight) {
            f = i2 / intrinsicHeight;
            f3 = (i - (intrinsicWidth * f)) * 0.5f;
            f2 = 0.0f;
        } else {
            f = i / intrinsicWidth;
            f2 = (i2 - (intrinsicHeight * f)) * 0.5f;
        }
        matrix.setScale(f, f);
        matrix.postTranslate(Math.round(f3), Math.round(f2));
    }

    public static final void yandex(C16592l c16592l, C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(-1991437157);
        if (((i | 2) & 19) == 18 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                c16592l = (C16592l) c6956l.isPro(AbstractC9404l.purchase);
            } else {
                c6956l.m2124else();
            }
            c6956l.adcel();
            AbstractC10478l.yandex(AbstractC9404l.purchase.yandex(c16592l), c15578l, c6956l, 48);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14601l(c16592l, c15578l, i, 8);
        }
    }
}
