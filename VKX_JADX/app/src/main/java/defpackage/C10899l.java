package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: lًُؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10899l {
    public C1298l admob;
    public C1298l amazon;
    public C1298l billing;
    public C1298l crashlytics;
    public C1298l loadAd;
    public C1298l mopub;
    public C1298l purchase;
    public boolean remoteconfig;
    public Typeface smaato;
    public final C2970l subs;
    public final TextView yandex;
    public int isPro = 0;
    public int firebase = -1;

    public C10899l(TextView textView) {
        this.yandex = textView;
        this.subs = new C2970l(textView);
    }

    public static C1298l crashlytics(Context context, C7862l c7862l, int i) {
        ColorStateList colorStateListSubs;
        synchronized (c7862l) {
            colorStateListSubs = c7862l.yandex.subs(context, i);
        }
        if (colorStateListSubs == null) {
            return null;
        }
        C1298l c1298l = new C1298l();
        c1298l.f3347l = true;
        c1298l.f3346l = colorStateListSubs;
        return c1298l;
    }

    public final void admob(int i, int i2, int i3, int i4) {
        C2970l c2970l = this.subs;
        if (c2970l.isPro()) {
            DisplayMetrics displayMetrics = c2970l.isPro.getResources().getDisplayMetrics();
            c2970l.firebase(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c2970l.admob()) {
                c2970l.yandex();
            }
        }
    }

    public final ColorStateList amazon() {
        C1298l c1298l = this.admob;
        if (c1298l != null) {
            return (ColorStateList) c1298l.f3346l;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:239:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:241:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:244:0x03d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:247:0x03de  */
    /* JADX WARN: Code duplicated, block: B:249:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:251:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void billing(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        float dimensionPixelSize;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        TextView textView = this.yandex;
        Context context = textView.getContext();
        C7862l c7862lYandex = C7862l.yandex();
        int[] iArr = AbstractC14657l.admob;
        C12418l c12418lPro = C12418l.pro(context, attributeSet, iArr, i);
        AbstractC15872l.remoteconfig(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c12418lPro.f24518l, i);
        TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.loadAd = crashlytics(context, c7862lYandex, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.crashlytics = crashlytics(context, c7862lYandex, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.amazon = crashlytics(context, c7862lYandex, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.purchase = crashlytics(context, c7862lYandex, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.billing = crashlytics(context, c7862lYandex, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.mopub = crashlytics(context, c7862lYandex, typedArray.getResourceId(6, 0));
        }
        c12418lPro.advert();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC14657l.pro;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C12418l c12418l = new C12418l(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            remoteconfig(context, c12418l);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (Build.VERSION.SDK_INT < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            c12418l.advert();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C12418l c12418l2 = new C12418l(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        remoteconfig(context, c12418l2);
        c12418l2.advert();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.smaato;
        if (typeface != null) {
            if (this.firebase == -1) {
                textView.setTypeface(typeface, this.isPro);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC16618l.amazon(textView, string);
        }
        if (str != null) {
            if (i5 >= 24) {
                AbstractC11092l.loadAd(textView, AbstractC11092l.yandex(str));
            } else {
                textView.setTextLocale(AbstractC0410l.yandex(str.split(",")[0]));
            }
        }
        C2970l c2970l = this.subs;
        Context context2 = c2970l.isPro;
        int[] iArr3 = AbstractC14657l.subs;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c2970l.subs;
        AbstractC15872l.remoteconfig(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c2970l.yandex = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = typedArrayObtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                c2970l.billing = C2970l.loadAd(iArr4);
                c2970l.subs();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c2970l.isPro()) {
            c2970l.yandex = 0;
        } else if (c2970l.yandex == 1) {
            if (!c2970l.mopub) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c2970l.firebase(dimension2, f, dimension);
            }
            c2970l.admob();
        }
        if (AbstractC15958l.crashlytics && c2970l.yandex != 0) {
            int[] iArr5 = c2970l.billing;
            if (iArr5.length > 0) {
                if (AbstractC16618l.yandex(textView) != -1.0f) {
                    AbstractC16618l.loadAd(textView, Math.round(c2970l.amazon), Math.round(c2970l.purchase), Math.round(c2970l.crashlytics), 0);
                } else {
                    AbstractC16618l.crashlytics(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableLoadAd = resourceId4 != -1 ? c7862lYandex.loadAd(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableLoadAd2 = resourceId5 != -1 ? c7862lYandex.loadAd(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableLoadAd3 = resourceId6 != -1 ? c7862lYandex.loadAd(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableLoadAd4 = resourceId7 != -1 ? c7862lYandex.loadAd(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableLoadAd5 = resourceId8 != -1 ? c7862lYandex.loadAd(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableLoadAd6 = resourceId9 != -1 ? c7862lYandex.loadAd(context, resourceId9) : null;
        if (drawableLoadAd5 != null || drawableLoadAd6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableLoadAd5 == null) {
                drawableLoadAd5 = compoundDrawablesRelative[0];
            }
            if (drawableLoadAd2 == null) {
                drawableLoadAd2 = compoundDrawablesRelative[1];
            }
            if (drawableLoadAd6 == null) {
                drawableLoadAd6 = compoundDrawablesRelative[2];
            }
            if (drawableLoadAd4 == null) {
                drawableLoadAd4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableLoadAd5, drawableLoadAd2, drawableLoadAd6, drawableLoadAd4);
        } else if (drawableLoadAd != null || drawableLoadAd2 != null || drawableLoadAd3 != null || drawableLoadAd4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableLoadAd == null) {
                    drawableLoadAd = compoundDrawables[0];
                }
                if (drawableLoadAd2 == null) {
                    drawableLoadAd2 = compoundDrawables[1];
                }
                if (drawableLoadAd3 == null) {
                    drawableLoadAd3 = compoundDrawables[2];
                }
                if (drawableLoadAd4 == null) {
                    drawableLoadAd4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableLoadAd, drawableLoadAd2, drawableLoadAd3, drawableLoadAd4);
            } else {
                if (drawableLoadAd2 == null) {
                    drawableLoadAd2 = compoundDrawablesRelative2[1];
                }
                if (drawableLoadAd4 == null) {
                    drawableLoadAd4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableLoadAd2, compoundDrawablesRelative2[2], drawableLoadAd4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC7720l.crashlytics(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            AbstractC11452l.amazon(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeCrashlytics = AbstractC2341l.crashlytics(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(modeCrashlytics);
            } else if (textView instanceof InterfaceC14106l) {
                ((InterfaceC14106l) textView).setSupportCompoundDrawablesTintMode(modeCrashlytics);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i7 = typedValuePeekValue.data;
                int i8 = i7 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i7);
                i3 = i8;
                i2 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i2) {
                AbstractC11452l.purchase(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i2) {
                AbstractC11452l.billing(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i3 == i2) {
                    AbstractC11452l.mopub(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC5917l.m1868native(textView, i3, dimensionPixelSize);
                } else {
                    AbstractC11452l.mopub(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i2 = -1;
        dimensionPixelSize = -1.0f;
        i3 = i2;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i2) {
            AbstractC11452l.purchase(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            AbstractC11452l.billing(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == i2) {
                AbstractC11452l.mopub(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC5917l.m1868native(textView, i3, dimensionPixelSize);
            } else {
                AbstractC11452l.mopub(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void firebase(ColorStateList colorStateList) {
        if (this.admob == null) {
            this.admob = new C1298l();
        }
        C1298l c1298l = this.admob;
        c1298l.f3346l = colorStateList;
        c1298l.f3347l = colorStateList != null;
        this.loadAd = c1298l;
        this.crashlytics = c1298l;
        this.amazon = c1298l;
        this.purchase = c1298l;
        this.billing = c1298l;
        this.mopub = c1298l;
    }

    public final void isPro(int i) {
        C2970l c2970l = this.subs;
        if (c2970l.isPro()) {
            if (i == 0) {
                c2970l.yandex = 0;
                c2970l.amazon = -1.0f;
                c2970l.purchase = -1.0f;
                c2970l.crashlytics = -1.0f;
                c2970l.billing = new int[0];
                c2970l.loadAd = false;
                return;
            }
            if (i != 1) {
                C8339l.metrica(AbstractC0653l.vip(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = c2970l.isPro.getResources().getDisplayMetrics();
            c2970l.firebase(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c2970l.admob()) {
                c2970l.yandex();
            }
        }
    }

    public final void loadAd() {
        C1298l c1298l = this.loadAd;
        TextView textView = this.yandex;
        if (c1298l != null || this.crashlytics != null || this.amazon != null || this.purchase != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            yandex(compoundDrawables[0], this.loadAd);
            yandex(compoundDrawables[1], this.crashlytics);
            yandex(compoundDrawables[2], this.amazon);
            yandex(compoundDrawables[3], this.purchase);
        }
        if (this.billing == null && this.mopub == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        yandex(compoundDrawablesRelative[0], this.billing);
        yandex(compoundDrawablesRelative[2], this.mopub);
    }

    public final void mopub(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC14657l.pro);
        C12418l c12418l = new C12418l(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.yandex;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        remoteconfig(context, c12418l);
        if (Build.VERSION.SDK_INT >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC16618l.amazon(textView, string);
        }
        c12418l.advert();
        Typeface typeface = this.smaato;
        if (typeface != null) {
            textView.setTypeface(typeface, this.isPro);
        }
    }

    public final PorterDuff.Mode purchase() {
        C1298l c1298l = this.admob;
        if (c1298l != null) {
            return (PorterDuff.Mode) c1298l.f3349l;
        }
        return null;
    }

    public final void remoteconfig(Context context, C12418l c12418l) {
        String string;
        int i = this.isPro;
        TypedArray typedArray = (TypedArray) c12418l.f24518l;
        this.isPro = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.firebase = i3;
            if (i3 != -1) {
                this.isPro &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.remoteconfig = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.smaato = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.smaato = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.smaato = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.smaato = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.firebase;
        int i7 = this.isPro;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceSignature = c12418l.Signature(i5, this.isPro, new C8818l(this, i6, i7, new WeakReference(this.yandex)));
                if (typefaceSignature != null) {
                    if (i2 < 28 || this.firebase == -1) {
                        this.smaato = typefaceSignature;
                    } else {
                        this.smaato = AbstractC10615l.yandex(Typeface.create(typefaceSignature, 0), this.firebase, (this.isPro & 2) != 0);
                    }
                }
                this.remoteconfig = this.smaato == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.smaato != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.firebase == -1) {
            this.smaato = Typeface.create(string, this.isPro);
        } else {
            this.smaato = AbstractC10615l.yandex(Typeface.create(string, 0), this.firebase, (this.isPro & 2) != 0);
        }
    }

    public final void smaato(PorterDuff.Mode mode) {
        if (this.admob == null) {
            this.admob = new C1298l();
        }
        C1298l c1298l = this.admob;
        c1298l.f3349l = mode;
        c1298l.f3348l = mode != null;
        this.loadAd = c1298l;
        this.crashlytics = c1298l;
        this.amazon = c1298l;
        this.purchase = c1298l;
        this.billing = c1298l;
        this.mopub = c1298l;
    }

    public final void subs(int[] iArr, int i) {
        C2970l c2970l = this.subs;
        if (c2970l.isPro()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c2970l.isPro.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c2970l.billing = C2970l.loadAd(iArrCopyOf);
                if (!c2970l.subs()) {
                    C18262l.startapp(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                c2970l.mopub = false;
            }
            if (c2970l.admob()) {
                c2970l.yandex();
            }
        }
    }

    public final void yandex(Drawable drawable, C1298l c1298l) {
        if (drawable == null || c1298l == null) {
            return;
        }
        C7862l.purchase(drawable, c1298l, this.yandex.getDrawableState());
    }
}
