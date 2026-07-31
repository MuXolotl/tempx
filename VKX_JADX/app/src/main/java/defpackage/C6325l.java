package defpackage;

import android.graphics.Typeface;

/* JADX INFO: renamed from: lًؙؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6325l extends AbstractC8016l {
    public final /* synthetic */ C1505l loadAd;

    public C6325l(C1505l c1505l) {
        this.loadAd = c1505l;
    }

    @Override // defpackage.AbstractC8016l
    public final void amazon(int i) {
        C1505l c1505l = this.loadAd;
        c1505l.purchase = true;
        C1664l c1664l = (C1664l) c1505l.billing.get();
        if (c1664l != null) {
            c1664l.invalidateSelf();
        }
    }

    @Override // defpackage.AbstractC8016l
    public final void purchase(Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        C1505l c1505l = this.loadAd;
        c1505l.purchase = true;
        C1664l c1664l = (C1664l) c1505l.billing.get();
        if (c1664l != null) {
            c1664l.invalidateSelf();
        }
    }
}
