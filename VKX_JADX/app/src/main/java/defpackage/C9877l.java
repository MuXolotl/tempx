package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٍٕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9877l implements LineHeightSpan {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f20088l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f20091l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f20092l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float f20094l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f20095l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f20096l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f20098l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f20099l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f20089l = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f20090l = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f20097l = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f20093l = RecyclerView.UNDEFINED_DURATION;

    public C9877l(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.f20092l = f;
        this.f20091l = i;
        this.f20088l = z;
        this.f20095l = z2;
        this.f20094l = f2;
        this.f20098l = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            AbstractC1786l.loadAd("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.f20091l;
        int i7 = this.f20098l;
        boolean z3 = this.f20095l;
        boolean z4 = this.f20088l;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.f20089l == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.f20092l);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.f20094l;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.f20097l = i12;
                int i13 = i12 - iCeil;
                this.f20090l = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.f20089l = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.f20093l = i12;
                    this.f20099l = fontMetricsInt.ascent - i13;
                    this.f20096l = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.f20089l = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.f20097l;
                    this.f20093l = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.f20099l = 0;
                    this.f20096l = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.f20090l = i17;
                int i18 = fontMetricsInt.descent;
                this.f20097l = i18;
                this.f20089l = i17;
                this.f20093l = i18;
                this.f20099l = 0;
                this.f20096l = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.f20089l : this.f20090l;
        fontMetricsInt.descent = z2 ? this.f20093l : this.f20097l;
    }
}
