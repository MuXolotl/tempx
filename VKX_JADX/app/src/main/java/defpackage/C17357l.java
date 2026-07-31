package defpackage;

import android.graphics.Typeface;

/* JADX INFO: renamed from: lِٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17357l extends AbstractC8016l {
    public boolean amazon;
    public final C10975l crashlytics;
    public final Typeface loadAd;

    public C17357l(C10975l c10975l, Typeface typeface) {
        this.loadAd = typeface;
        this.crashlytics = c10975l;
    }

    @Override // defpackage.AbstractC8016l
    public final void amazon(int i) {
        if (this.amazon) {
            return;
        }
        C5844l c5844l = (C5844l) this.crashlytics.f22121l;
        if (c5844l.isPro(this.loadAd)) {
            c5844l.admob(false);
        }
    }

    @Override // defpackage.AbstractC8016l
    public final void purchase(Typeface typeface, boolean z) {
        if (this.amazon) {
            return;
        }
        C5844l c5844l = (C5844l) this.crashlytics.f22121l;
        if (c5844l.isPro(typeface)) {
            c5844l.admob(false);
        }
    }
}
