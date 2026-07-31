package defpackage;

import android.text.TextPaint;

/* JADX INFO: renamed from: lؘّٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5634l extends AbstractC7822l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final CharSequence f11988l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextPaint f11989l;

    public C5634l(CharSequence charSequence, TextPaint textPaint) {
        this.f11988l = charSequence;
        this.f11989l = textPaint;
    }

    @Override // defpackage.AbstractC7822l
    public final int firebase(int i) {
        CharSequence charSequence = this.f11988l;
        return this.f11989l.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    @Override // defpackage.AbstractC7822l
    public final int isPro(int i) {
        CharSequence charSequence = this.f11988l;
        return this.f11989l.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }
}
