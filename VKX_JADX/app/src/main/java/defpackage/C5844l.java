package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lؘٞؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5844l {
    public Typeface Signature;
    public Typeface ad;
    public float adcel;
    public Typeface ads;
    public C17357l advert;
    public final Rect amazon;
    public boolean applovin;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public float f12306case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public TimeInterpolator f12307catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public ColorStateList f12308class;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public float f12309continue;
    public final Rect crashlytics;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public float f12310default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public TimeInterpolator f12311else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public boolean f12312extends;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public StaticLayout f12313final;
    public ColorStateList firebase;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final TextPaint f12314for;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public float f12315goto;

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public CharSequence f12316import;
    public Bitmap inmobi;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public float f12318interface;
    public ColorStateList isPro;
    public Typeface license;
    public float loadAd;
    public float metrica;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public int f12319native;

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public float f12320new;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public float f12321package;
    public CharSequence premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public int[] f12322private;
    public Typeface pro;
    public final RectF purchase;
    public float remoteconfig;
    public CharSequence signatures;
    public float smaato;
    public float startapp;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public float f12324static;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public float f12325strictfp;
    public Typeface subscription;

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public float f12326super;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public float f12327switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public float f12328synchronized;
    public Typeface tapsense;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final TextPaint f12329throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public float f12330throws;
    public float vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public float f12331volatile;
    public final TextInputLayout yandex;
    public int billing = 16;
    public int mopub = 16;
    public float admob = 15.0f;
    public float subs = 15.0f;
    public final TextUtils.TruncateAt isVip = TextUtils.TruncateAt.END;
    public final boolean appmetrica = true;

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final int f12305abstract = 1;

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final float f12317instanceof = 1.0f;

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final int f12323public = 1;

    public C5844l(TextInputLayout textInputLayout) {
        this.yandex = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f12314for = textPaint;
        this.f12329throw = new TextPaint(textPaint);
        this.amazon = new Rect();
        this.crashlytics = new Rect();
        this.purchase = new RectF();
        mopub(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static float billing(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC0926l.yandex(f, f2, f3);
    }

    public static int yandex(int i, float f, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public final void admob(boolean z) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.yandex;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        crashlytics(1.0f, z);
        CharSequence charSequence = this.premium;
        TextPaint textPaint = this.f12314for;
        if (charSequence != null && (staticLayout = this.f12313final) != null) {
            this.f12316import = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.isVip);
        }
        CharSequence charSequence2 = this.f12316import;
        if (charSequence2 != null) {
            this.f12320new = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f12320new = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.mopub, this.applovin ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.amazon;
        if (i == 48) {
            this.remoteconfig = rect.top;
        } else if (i != 80) {
            this.remoteconfig = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.remoteconfig = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.metrica = rect.centerX() - (this.f12320new / 2.0f);
        } else if (i2 != 5) {
            this.metrica = rect.left;
        } else {
            this.metrica = rect.right - this.f12320new;
        }
        crashlytics(0.0f, z);
        StaticLayout staticLayout2 = this.f12313final;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f12313final;
        if (staticLayout3 == null || this.f12305abstract <= 1) {
            CharSequence charSequence3 = this.premium;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f12313final;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.billing, this.applovin ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.crashlytics;
        if (i3 == 48) {
            this.smaato = rect2.top;
        } else if (i3 != 80) {
            this.smaato = rect2.centerY() - (height / 2.0f);
        } else {
            this.smaato = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.vip = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.vip = rect2.left;
        } else {
            this.vip = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.inmobi;
        if (bitmap != null) {
            bitmap.recycle();
            this.inmobi = null;
        }
        smaato(this.loadAd);
        float f = this.loadAd;
        float fBilling = billing(rect2.left, rect.left, f, this.f12307catch);
        RectF rectF = this.purchase;
        rectF.left = fBilling;
        rectF.top = billing(this.smaato, this.remoteconfig, f, this.f12307catch);
        rectF.right = billing(rect2.right, rect.right, f, this.f12307catch);
        rectF.bottom = billing(rect2.bottom, rect.bottom, f, this.f12307catch);
        this.startapp = billing(this.vip, this.metrica, f, this.f12307catch);
        this.adcel = billing(this.smaato, this.remoteconfig, f, this.f12307catch);
        smaato(f);
        InterpolatorC3577l interpolatorC3577l = AbstractC0926l.loadAd;
        this.f12315goto = 1.0f - billing(0.0f, 1.0f, 1.0f - f, interpolatorC3577l);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        textInputLayout.postInvalidateOnAnimation();
        this.f12326super = billing(1.0f, 0.0f, f, interpolatorC3577l);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.firebase;
        ColorStateList colorStateList2 = this.isPro;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(yandex(purchase(colorStateList2), f, purchase(this.firebase)));
        } else {
            textPaint.setColor(purchase(colorStateList));
        }
        float f2 = this.f12318interface;
        float f3 = this.f12324static;
        if (f2 != f3) {
            textPaint.setLetterSpacing(billing(f3, f2, f, interpolatorC3577l));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f12328synchronized = AbstractC0926l.yandex(0.0f, this.f12306case, f);
        this.f12325strictfp = AbstractC0926l.yandex(0.0f, this.f12327switch, f);
        this.f12331volatile = AbstractC0926l.yandex(0.0f, this.f12309continue, f);
        int iYandex = yandex(0, f, purchase(this.f12308class));
        this.f12319native = iYandex;
        textPaint.setShadowLayer(this.f12328synchronized, this.f12325strictfp, this.f12331volatile, iYandex);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final float amazon() {
        float f = this.subs;
        TextPaint textPaint = this.f12329throw;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.ads);
        textPaint.setLetterSpacing(this.f12318interface);
        return -textPaint.ascent();
    }

    public final void crashlytics(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.signatures == null) {
            return;
        }
        float fWidth = this.amazon.width();
        float fWidth2 = this.crashlytics.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.subs;
            f3 = this.f12318interface;
            this.f12330throws = 1.0f;
            typeface = this.ads;
        } else {
            float f4 = this.admob;
            float f5 = this.f12324static;
            Typeface typeface2 = this.Signature;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f12330throws = 1.0f;
            } else {
                this.f12330throws = billing(this.admob, this.subs, f, this.f12311else) / this.admob;
            }
            float f6 = this.subs / this.admob;
            fWidth = (z || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f12314for;
        if (fWidth > 0.0f) {
            boolean z3 = this.f12321package != f2;
            boolean z4 = this.f12310default != f3;
            boolean z5 = this.ad != typeface;
            StaticLayout staticLayout = this.f12313final;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f12312extends;
            this.f12321package = f2;
            this.f12310default = f3;
            this.ad = typeface;
            this.f12312extends = false;
            textPaint.setLinearText(this.f12330throws != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.premium == null || z2) {
            textPaint.setTextSize(this.f12321package);
            textPaint.setTypeface(this.ad);
            textPaint.setLetterSpacing(this.f12310default);
            boolean zLoadAd = loadAd(this.signatures);
            this.applovin = zLoadAd;
            int i = this.f12305abstract;
            if (i <= 1 || zLoadAd) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.billing, zLoadAd ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z7 = this.applovin;
                    if (absoluteGravity != 5) {
                        alignment = z7 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = z7 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            CharSequence charSequenceEllipsize = this.signatures;
            int i2 = (int) fWidth;
            int length = charSequenceEllipsize.length();
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            if (charSequenceEllipsize == null) {
                charSequenceEllipsize = "";
            }
            int iMax = Math.max(0, i2);
            TextUtils.TruncateAt truncateAt = this.isVip;
            if (i == 1) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, truncateAt);
            }
            int iMin = Math.min(charSequenceEllipsize.length(), length);
            if (zLoadAd && i == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
            builderObtain.setAlignment(alignment);
            builderObtain.setIncludePad(false);
            builderObtain.setTextDirection(zLoadAd ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (truncateAt != null) {
                builderObtain.setEllipsize(truncateAt);
            }
            builderObtain.setMaxLines(i);
            float f7 = this.f12317instanceof;
            if (f7 != 1.0f) {
                builderObtain.setLineSpacing(0.0f, f7);
            }
            if (i > 1) {
                builderObtain.setHyphenationFrequency(this.f12323public);
            }
            StaticLayout staticLayoutBuild = builderObtain.build();
            staticLayoutBuild.getClass();
            this.f12313final = staticLayoutBuild;
            this.premium = staticLayoutBuild.getText();
        }
    }

    public final void firebase(float f) {
        float fLoadAd = AbstractC12704l.loadAd(f, 0.0f, 1.0f);
        if (fLoadAd != this.loadAd) {
            this.loadAd = fLoadAd;
            Rect rect = this.crashlytics;
            float f2 = rect.left;
            Rect rect2 = this.amazon;
            float fBilling = billing(f2, rect2.left, fLoadAd, this.f12307catch);
            RectF rectF = this.purchase;
            rectF.left = fBilling;
            rectF.top = billing(this.smaato, this.remoteconfig, fLoadAd, this.f12307catch);
            rectF.right = billing(rect.right, rect2.right, fLoadAd, this.f12307catch);
            rectF.bottom = billing(rect.bottom, rect2.bottom, fLoadAd, this.f12307catch);
            this.startapp = billing(this.vip, this.metrica, fLoadAd, this.f12307catch);
            this.adcel = billing(this.smaato, this.remoteconfig, fLoadAd, this.f12307catch);
            smaato(fLoadAd);
            InterpolatorC3577l interpolatorC3577l = AbstractC0926l.loadAd;
            this.f12315goto = 1.0f - billing(0.0f, 1.0f, 1.0f - fLoadAd, interpolatorC3577l);
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            TextInputLayout textInputLayout = this.yandex;
            textInputLayout.postInvalidateOnAnimation();
            this.f12326super = billing(1.0f, 0.0f, fLoadAd, interpolatorC3577l);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.firebase;
            ColorStateList colorStateList2 = this.isPro;
            TextPaint textPaint = this.f12314for;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(yandex(purchase(colorStateList2), fLoadAd, purchase(this.firebase)));
            } else {
                textPaint.setColor(purchase(colorStateList));
            }
            float f3 = this.f12318interface;
            float f4 = this.f12324static;
            if (f3 != f4) {
                textPaint.setLetterSpacing(billing(f4, f3, fLoadAd, interpolatorC3577l));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f12328synchronized = AbstractC0926l.yandex(0.0f, this.f12306case, fLoadAd);
            this.f12325strictfp = AbstractC0926l.yandex(0.0f, this.f12327switch, fLoadAd);
            this.f12331volatile = AbstractC0926l.yandex(0.0f, this.f12309continue, fLoadAd);
            int iYandex = yandex(0, fLoadAd, purchase(this.f12308class));
            this.f12319native = iYandex;
            textPaint.setShadowLayer(this.f12328synchronized, this.f12325strictfp, this.f12331volatile, iYandex);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final boolean isPro(Typeface typeface) {
        C17357l c17357l = this.advert;
        if (c17357l != null) {
            c17357l.amazon = true;
        }
        if (this.tapsense == typeface) {
            return false;
        }
        this.tapsense = typeface;
        Typeface typefaceAd = AbstractC12148l.ad(this.yandex.getContext().getResources().getConfiguration(), typeface);
        this.subscription = typefaceAd;
        if (typefaceAd == null) {
            typefaceAd = this.tapsense;
        }
        this.ads = typefaceAd;
        return true;
    }

    public final boolean loadAd(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        boolean z = this.yandex.getLayoutDirection() == 1;
        if (this.appmetrica) {
            return (z ? AbstractC11407l.amazon : AbstractC11407l.crashlytics).remoteconfig(charSequence, charSequence.length());
        }
        return z;
    }

    public final void mopub(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.tapsense;
            if (typeface != null) {
                this.subscription = AbstractC12148l.ad(configuration, typeface);
            }
            Typeface typeface2 = this.pro;
            if (typeface2 != null) {
                this.license = AbstractC12148l.ad(configuration, typeface2);
            }
            Typeface typeface3 = this.subscription;
            if (typeface3 == null) {
                typeface3 = this.tapsense;
            }
            this.ads = typeface3;
            Typeface typeface4 = this.license;
            if (typeface4 == null) {
                typeface4 = this.pro;
            }
            this.Signature = typeface4;
            admob(true);
        }
    }

    public final int purchase(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f12322private;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void remoteconfig(Typeface typeface) {
        boolean z;
        boolean zIsPro = isPro(typeface);
        if (this.pro != typeface) {
            this.pro = typeface;
            Typeface typefaceAd = AbstractC12148l.ad(this.yandex.getContext().getResources().getConfiguration(), typeface);
            this.license = typefaceAd;
            if (typefaceAd == null) {
                typefaceAd = this.pro;
            }
            this.Signature = typefaceAd;
            z = true;
        } else {
            z = false;
        }
        if (zIsPro || z) {
            admob(false);
        }
    }

    public final void smaato(float f) {
        crashlytics(f, false);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        this.yandex.postInvalidateOnAnimation();
    }

    public final void subs(ColorStateList colorStateList) {
        if (this.firebase == colorStateList && this.isPro == colorStateList) {
            return;
        }
        this.firebase = colorStateList;
        this.isPro = colorStateList;
        admob(false);
    }
}
