package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: renamed from: lؓۛؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2111l extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC3239l f4744l;

    public C2111l(AbstractC3239l abstractC3239l) {
        this.f4744l = abstractC3239l;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            C5053l c5053l = C5053l.yandex;
            AbstractC3239l abstractC3239l = this.f4744l;
            if (AbstractC8576l.yandex(abstractC3239l, c5053l)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC3239l instanceof C0404l)) {
                C18725l.billing();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            C0404l c0404l = (C0404l) abstractC3239l;
            textPaint.setStrokeWidth(c0404l.yandex);
            textPaint.setStrokeMiter(c0404l.loadAd);
            int i = c0404l.amazon;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = c0404l.crashlytics;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            C6853l c6853l = c0404l.purchase;
            textPaint.setPathEffect(c6853l != null ? c6853l.yandex : null);
        }
    }
}
