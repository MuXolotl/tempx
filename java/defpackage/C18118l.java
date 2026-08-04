package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: l٘ۖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18118l {
    public C11644l adcel;
    public final int admob;
    public final boolean amazon;
    public final Layout billing;
    public final boolean crashlytics;
    public final float firebase;
    public final float isPro;
    public final TextUtils.TruncateAt loadAd;
    public final C9877l[] metrica;
    public final int mopub;
    public C11522l purchase;
    public final Paint.FontMetricsInt remoteconfig;
    public final boolean smaato;
    public final Rect startapp = new Rect();
    public final int subs;
    public final int vip;
    public final TextPaint yandex;

    /* JADX WARN: Code duplicated, block: B:91:0x0199 A[PHI: r14
  0x0199: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:96:0x01ab, B:89:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    public C18118l(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, C17909l c17909l) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutPurchase;
        C9877l[] c9877lArr;
        int i10;
        int i11;
        int i12;
        char c;
        long j;
        int i13;
        int i14;
        int i15;
        long jYandex;
        ?? r8;
        boolean zSignature;
        int topPadding;
        boolean zTapsense;
        long jYandex2;
        int i16;
        Paint.FontMetricsInt fontMetricsInt;
        C9877l c9877l;
        C9877l c9877l2;
        int i17;
        this.yandex = textPaint;
        this.loadAd = truncateAt;
        this.crashlytics = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicLoadAd = AbstractC6290l.loadAd(i2);
        Layout.Alignment alignment = AbstractC15426l.yandex;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : AbstractC15426l.loadAd : AbstractC15426l.yandex : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C0537l.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsYandex = c17909l.yandex();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsYandex == null || c17909l.crashlytics() > f || z2) {
                this.smaato = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicLoadAd;
                layoutPurchase = AbstractC4603l.purchase(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.smaato = true;
                if (iCeil < 0) {
                    AbstractC1786l.yandex("negative width");
                }
                if (iCeil < 0) {
                    AbstractC1786l.yandex("negative ellipsized width");
                }
                layoutPurchase = Build.VERSION.SDK_INT >= 33 ? AbstractC8613l.yandex(charSequence, textPaint, iCeil, alignment2, metricsYandex, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsYandex, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicLoadAd;
            }
            this.billing = layoutPurchase;
            Trace.endSection();
            int iMin = Math.min(layoutPurchase.getLineCount(), i9);
            this.mopub = iMin;
            int i18 = iMin - 1;
            this.amazon = iMin >= i9 && (layoutPurchase.getEllipsisCount(i18) > 0 || layoutPurchase.getLineEnd(i18) != charSequence.length());
            if ((layoutPurchase.getText() instanceof Spanned) && (AbstractC6616l.crashlytics((Spanned) layoutPurchase.getText(), C9877l.class) || layoutPurchase.getText().length() <= 0)) {
                i10 = 0;
                c9877lArr = (C9877l[]) ((Spanned) layoutPurchase.getText()).getSpans(0, layoutPurchase.getText().length(), C9877l.class);
            } else {
                c9877lArr = null;
                i10 = 0;
            }
            this.metrica = c9877lArr;
            if (c9877lArr == null || (c9877l2 = (C9877l) AbstractC8669l.m2412private(c9877lArr)) == null) {
                i11 = 2;
                i12 = i10;
            } else {
                if (c9877l2.f20088l) {
                    i11 = 2;
                    i17 = c9877l2.f20098l == 2 ? 1 : i17;
                    i12 = i17;
                } else {
                    i11 = 2;
                }
                i17 = i10;
                i12 = i17;
            }
            int i19 = (c9877lArr == null || (c9877l = (C9877l) AbstractC8669l.m2412private(c9877lArr)) == null || !c9877l.f20095l || c9877l.f20098l != i11) ? i10 : 1;
            if (i12 == 0 || i19 == 0) {
                long jYandex3 = AbstractC6290l.loadAd;
                if (z) {
                    c = ' ';
                    j = 4294967295L;
                    i13 = 1;
                    i14 = 33;
                } else {
                    if (this.smaato) {
                        BoringLayout boringLayout = (BoringLayout) layoutPurchase;
                        i14 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zTapsense = AbstractC2847l.tapsense(boringLayout);
                        } else {
                            r8 = i10;
                        }
                    } else {
                        i14 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutPurchase;
                        int i20 = Build.VERSION.SDK_INT;
                        if (i20 >= 33) {
                            zSignature = AbstractC2847l.Signature(staticLayout);
                        } else if (i20 >= 28) {
                            r8 = 1;
                        } else {
                            r8 = i10;
                        }
                    }
                    if (r8 != 0) {
                        r8 = zSignature;
                        c = ' ';
                        j = 4294967295L;
                        i13 = 1;
                    } else {
                        r8 = zSignature;
                        TextPaint paint = layoutPurchase.getPaint();
                        CharSequence text = layoutPurchase.getText();
                        c = ' ';
                        Rect rectMopub = AbstractC2438l.mopub(paint, text, layoutPurchase.getLineStart(i10), layoutPurchase.getLineEnd(i10));
                        int lineAscent = layoutPurchase.getLineAscent(i10);
                        j = 4294967295L;
                        int i21 = rectMopub.top;
                        if (i21 < lineAscent) {
                            r8 = zTapsense;
                            topPadding = lineAscent - i21;
                        } else {
                            r8 = zTapsense;
                            topPadding = layoutPurchase.getTopPadding();
                        }
                        i13 = 1;
                        rectMopub = iMin != 1 ? AbstractC2438l.mopub(paint, text, layoutPurchase.getLineStart(i18), layoutPurchase.getLineEnd(i18)) : rectMopub;
                        int lineDescent = layoutPurchase.getLineDescent(i18);
                        int i22 = rectMopub.bottom;
                        int bottomPadding = i22 > lineDescent ? i22 - lineDescent : layoutPurchase.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jYandex3 = AbstractC6290l.yandex(topPadding, bottomPadding);
                        }
                    }
                }
                int i23 = i12 != 0 ? i10 : (int) (jYandex3 >> c);
                if (i19 != 0) {
                    r8 = zTapsense;
                    r8 = zTapsense;
                    i15 = i10;
                } else {
                    r8 = zTapsense;
                    r8 = zTapsense;
                    i15 = (int) (jYandex3 & j);
                }
                jYandex = AbstractC6290l.yandex(i23, i15);
            } else {
                jYandex = AbstractC6290l.loadAd;
                c = ' ';
                j = 4294967295L;
                i13 = 1;
                i14 = 33;
            }
            if (c9877lArr != null) {
                int length2 = c9877lArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i24 = iMax2; i24 < length2; i24++) {
                    C9877l c9877l3 = c9877lArr[i24];
                    int i25 = c9877l3.f20099l;
                    iMax = i25 < 0 ? Math.max(iMax, Math.abs(i25)) : iMax;
                    int i26 = c9877l3.f20096l;
                    if (i26 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i26));
                    }
                }
                jYandex2 = (iMax == 0 && iMax2 == 0) ? AbstractC6290l.loadAd : AbstractC6290l.yandex(iMax, iMax2);
            } else {
                jYandex2 = AbstractC6290l.loadAd;
            }
            this.admob = Math.max((int) (jYandex >> c), (int) (jYandex2 >> c));
            this.subs = Math.max((int) (jYandex & j), (int) (jYandex2 & j));
            TextPaint textPaint2 = this.yandex;
            C9877l[] c9877lArr2 = this.metrica;
            int i27 = this.mopub - i13;
            Layout layout = this.billing;
            if (layout.getLineStart(i27) != layout.getLineEnd(i27) || c9877lArr2 == null || c9877lArr2.length == 0) {
                i16 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                C9877l c9877l4 = (C9877l) AbstractC8669l.m2409native(c9877lArr2);
                spannableString.setSpan(new C9877l(c9877l4.f20092l, spannableString.length(), (i27 == 0 || !c9877l4.f20095l) ? c9877l4.f20095l : i10, c9877l4.f20095l, c9877l4.f20094l, c9877l4.f20098l), i10, spannableString.length(), i14);
                i16 = i10;
                StaticLayout staticLayoutPurchase = AbstractC4603l.purchase(spannableString, textPaint2, Alert.DURATION_SHOW_INDEFINITELY, spannableString.length(), textDirectionHeuristic, AbstractC6213l.yandex, Alert.DURATION_SHOW_INDEFINITELY, null, Alert.DURATION_SHOW_INDEFINITELY, 0, this.crashlytics, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutPurchase.getLineAscent(i16);
                fontMetricsInt.descent = staticLayoutPurchase.getLineDescent(i16);
                fontMetricsInt.top = staticLayoutPurchase.getLineTop(i16);
                fontMetricsInt.bottom = staticLayoutPurchase.getLineBottom(i16);
            }
            this.vip = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) admob(i18)) : i16;
            this.remoteconfig = fontMetricsInt;
            Layout layout2 = this.billing;
            this.isPro = AbstractC1497l.purchase(layout2, i18, layout2.getPaint());
            Layout layout3 = this.billing;
            this.firebase = AbstractC1497l.billing(layout3, i18, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final float admob(int i) {
        return purchase(i) - subs(i);
    }

    public final float amazon(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.admob + ((i != this.mopub + (-1) || (fontMetricsInt = this.remoteconfig) == null) ? this.billing.getLineBaseline(i) : subs(i) - fontMetricsInt.ascent);
    }

    public final int billing(int i) {
        ThreadLocal threadLocal = AbstractC6290l.yandex;
        Layout layout = this.billing;
        return (layout.getEllipsisCount(i) <= 0 || this.loadAd != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final C11644l crashlytics() {
        C11644l c11644l = this.adcel;
        if (c11644l != null) {
            return c11644l;
        }
        C11644l c11644l2 = new C11644l(this.billing);
        this.adcel = c11644l2;
        return c11644l2;
    }

    public final float firebase(int i, boolean z) {
        return loadAd(mopub(i)) + crashlytics().m3165l(i, false, z);
    }

    public final float isPro(int i, boolean z) {
        return loadAd(mopub(i)) + crashlytics().m3165l(i, true, z);
    }

    public final float loadAd(int i) {
        if (i == this.mopub - 1) {
            return this.isPro + this.firebase;
        }
        return 0.0f;
    }

    public final int mopub(int i) {
        int i2 = this.mopub;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.billing.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float purchase(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.mopub;
        int i3 = i2 - 1;
        Layout layout = this.billing;
        if (i != i3 || (fontMetricsInt = this.remoteconfig) == null) {
            return this.admob + layout.getLineBottom(i) + (i == i2 + (-1) ? this.subs : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final C11522l smaato() {
        C11522l c11522l = this.purchase;
        if (c11522l != null) {
            return c11522l;
        }
        Layout layout = this.billing;
        C11522l c11522l2 = new C11522l(layout.getText(), layout.getText().length(), this.yandex.getTextLocale());
        this.purchase = c11522l2;
        return c11522l2;
    }

    public final float subs(int i) {
        return this.billing.getLineTop(i) + (i == 0 ? 0 : this.admob);
    }

    public final int yandex() {
        boolean z = this.amazon;
        Layout layout = this.billing;
        return (z ? layout.getLineBottom(this.mopub - 1) : layout.getHeight()) + this.admob + this.subs + this.vip;
    }
}
