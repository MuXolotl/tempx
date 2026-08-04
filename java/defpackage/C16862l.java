package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: renamed from: lٗؓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16862l extends AbstractC8016l {
    public final /* synthetic */ AbstractC8016l amazon;
    public final /* synthetic */ TextPaint crashlytics;
    public final /* synthetic */ Context loadAd;
    public final /* synthetic */ C1085l purchase;

    public C16862l(C1085l c1085l, Context context, TextPaint textPaint, AbstractC8016l abstractC8016l) {
        this.purchase = c1085l;
        this.loadAd = context;
        this.crashlytics = textPaint;
        this.amazon = abstractC8016l;
    }

    @Override // defpackage.AbstractC8016l
    public final void amazon(int i) {
        this.amazon.amazon(i);
    }

    @Override // defpackage.AbstractC8016l
    public final void purchase(Typeface typeface, boolean z) {
        this.purchase.billing(this.loadAd, this.crashlytics, typeface);
        this.amazon.purchase(typeface, z);
    }
}
