package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؓۙۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2085l extends ReplacementSpan {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2049l f4669l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public TextPaint f4671l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Paint.FontMetricsInt f4670l = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public short f4668l = -1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public float f4672l = 1.0f;

    public C2085l(C2049l c2049l) {
        AbstractC5641l.amazon(c2049l, "rasterizer cannot be null");
        this.f4669l = c2049l;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f4671l;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f4671l = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.f4668l, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C12304l.yandex().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        C2049l c2049l = this.f4669l;
        C12014l c12014l = c2049l.loadAd;
        Typeface typeface = (Typeface) c12014l.f23943l;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c12014l.f23940l, c2049l.yandex * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f4670l;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C2049l c2049l = this.f4669l;
        C0680l c0680lLoadAd = c2049l.loadAd();
        int iYandex = c0680lLoadAd.yandex(14);
        this.f4672l = fAbs / (iYandex != 0 ? ((ByteBuffer) c0680lLoadAd.f31320l).getShort(iYandex + c0680lLoadAd.f31319l) : (short) 0);
        C0680l c0680lLoadAd2 = c2049l.loadAd();
        int iYandex2 = c0680lLoadAd2.yandex(14);
        if (iYandex2 != 0) {
            ((ByteBuffer) c0680lLoadAd2.f31320l).getShort(iYandex2 + c0680lLoadAd2.f31319l);
        }
        C0680l c0680lLoadAd3 = c2049l.loadAd();
        int iYandex3 = c0680lLoadAd3.yandex(12);
        short s = (short) ((iYandex3 != 0 ? ((ByteBuffer) c0680lLoadAd3.f31320l).getShort(iYandex3 + c0680lLoadAd3.f31319l) : (short) 0) * this.f4672l);
        this.f4668l = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
