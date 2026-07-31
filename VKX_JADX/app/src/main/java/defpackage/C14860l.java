package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: lْٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14860l extends CharacterStyle {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final int yandex;

    public C14860l(float f, float f2, float f3, int i) {
        this.yandex = i;
        this.loadAd = f;
        this.crashlytics = f2;
        this.amazon = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.amazon, this.loadAd, this.crashlytics, this.yandex);
    }
}
