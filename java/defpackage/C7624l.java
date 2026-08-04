package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: lؚۤٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7624l extends ReplacementSpan {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f15697l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f15698l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Paint.FontMetricsInt f15699l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f15700l;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f15700l = true;
        paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        this.f15699l = fontMetricsInt2;
        int i3 = (fontMetricsInt2 != null ? fontMetricsInt2 : null).descent;
        if (fontMetricsInt2 == null) {
            fontMetricsInt2 = null;
        }
        if (i3 <= fontMetricsInt2.ascent) {
            AbstractC1786l.yandex("Invalid fontMetrics: line height can not be negative.");
        }
        this.f15698l = (int) Math.ceil(0.0d);
        this.f15697l = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f15699l;
            int i4 = (fontMetricsInt3 != null ? fontMetricsInt3 : null).ascent;
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = (fontMetricsInt3 != null ? fontMetricsInt3 : null).descent;
            if (fontMetricsInt3 == null) {
                fontMetricsInt3 = null;
            }
            fontMetricsInt.leading = fontMetricsInt3.leading;
            if (i4 > (-yandex())) {
                fontMetricsInt.ascent = -yandex();
            }
            Paint.FontMetricsInt fontMetricsInt4 = this.f15699l;
            if (fontMetricsInt4 == null) {
                fontMetricsInt4 = null;
            }
            fontMetricsInt.top = Math.min(fontMetricsInt4.top, fontMetricsInt.ascent);
            Paint.FontMetricsInt fontMetricsInt5 = this.f15699l;
            fontMetricsInt.bottom = Math.max((fontMetricsInt5 != null ? fontMetricsInt5 : null).bottom, fontMetricsInt.descent);
        }
        return loadAd();
    }

    public final int loadAd() {
        if (!this.f15700l) {
            AbstractC1786l.loadAd("PlaceholderSpan is not laid out yet.");
        }
        return this.f15698l;
    }

    public final int yandex() {
        if (!this.f15700l) {
            AbstractC1786l.loadAd("PlaceholderSpan is not laid out yet.");
        }
        return this.f15697l;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
