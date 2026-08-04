package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* JADX INFO: renamed from: lٖؒۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1085l {
    public final boolean admob;
    public final int amazon;
    public final float billing;
    public final int crashlytics;
    public final float firebase;
    public final ColorStateList isPro;
    public final String loadAd;
    public final float mopub;
    public final float purchase;
    public boolean remoteconfig = false;
    public final int smaato;
    public final float subs;
    public Typeface vip;
    public final ColorStateList yandex;

    public C1085l(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC4548l.isVip);
        this.firebase = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.isPro = AbstractC4927l.subs(context, typedArrayObtainStyledAttributes, 3);
        AbstractC4927l.subs(context, typedArrayObtainStyledAttributes, 4);
        AbstractC4927l.subs(context, typedArrayObtainStyledAttributes, 5);
        this.crashlytics = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.amazon = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.smaato = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.loadAd = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.yandex = AbstractC4927l.subs(context, typedArrayObtainStyledAttributes, 6);
        this.purchase = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.billing = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.mopub = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC4548l.ads);
        this.admob = typedArrayObtainStyledAttributes2.hasValue(0);
        this.subs = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final boolean amazon(Context context) {
        Typeface typefaceCrashlytics = null;
        int i = this.smaato;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC7525l.yandex;
            if (!context.isRestricted()) {
                typefaceCrashlytics = AbstractC7525l.crashlytics(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceCrashlytics != null;
    }

    public final void billing(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceAd = AbstractC12148l.ad(context.getResources().getConfiguration(), typeface);
        if (typefaceAd != null) {
            typeface = typefaceAd;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.crashlytics;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.firebase);
        if (this.admob) {
            textPaint.setLetterSpacing(this.subs);
        }
    }

    public final void crashlytics(Context context, AbstractC8016l abstractC8016l) {
        if (amazon(context)) {
            loadAd(context);
        } else {
            yandex();
        }
        int i = this.smaato;
        if (i == 0) {
            this.remoteconfig = true;
        }
        if (this.remoteconfig) {
            abstractC8016l.purchase(this.vip, true);
            return;
        }
        try {
            C3215l c3215l = new C3215l(this, abstractC8016l);
            ThreadLocal threadLocal = AbstractC7525l.yandex;
            if (context.isRestricted()) {
                c3215l.amazon(-4);
            } else {
                AbstractC7525l.crashlytics(context, i, new TypedValue(), 0, c3215l, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.remoteconfig = true;
            abstractC8016l.amazon(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.loadAd, e);
            this.remoteconfig = true;
            abstractC8016l.amazon(-3);
        }
    }

    public final Typeface loadAd(Context context) {
        if (this.remoteconfig) {
            return this.vip;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceLoadAd = AbstractC7525l.loadAd(context, this.smaato);
                this.vip = typefaceLoadAd;
                if (typefaceLoadAd != null) {
                    this.vip = Typeface.create(typefaceLoadAd, this.crashlytics);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.loadAd, e);
            }
        }
        yandex();
        this.remoteconfig = true;
        return this.vip;
    }

    public final void purchase(Context context, TextPaint textPaint, AbstractC8016l abstractC8016l) {
        if (amazon(context)) {
            billing(context, textPaint, loadAd(context));
            return;
        }
        yandex();
        billing(context, textPaint, this.vip);
        crashlytics(context, new C16862l(this, context, textPaint, abstractC8016l));
    }

    public final void yandex() {
        String str;
        Typeface typeface = this.vip;
        int i = this.crashlytics;
        if (typeface == null && (str = this.loadAd) != null) {
            this.vip = Typeface.create(str, i);
        }
        if (this.vip == null) {
            int i2 = this.amazon;
            if (i2 == 1) {
                this.vip = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.vip = Typeface.SERIF;
            } else if (i2 != 3) {
                this.vip = Typeface.DEFAULT;
            } else {
                this.vip = Typeface.MONOSPACE;
            }
            this.vip = Typeface.create(this.vip, i);
        }
    }
}
