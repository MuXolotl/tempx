package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: lُُۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11240l extends CharacterStyle {
    public final boolean loadAd;
    public final boolean yandex;

    public C11240l(boolean z, boolean z2) {
        this.yandex = z;
        this.loadAd = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.yandex);
        textPaint.setStrikeThruText(this.loadAd);
    }
}
