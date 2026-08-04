package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: lًَّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12455l implements InterfaceC2406l {
    public final /* synthetic */ C16950l loadAd;
    public ValueAnimator yandex;

    public C12455l(C16950l c16950l) {
        this.loadAd = c16950l;
    }

    @Override // defpackage.InterfaceC2406l
    public final void clear() {
        AbstractC5088l.yandex("ScreenFlashView", "ScreenFlash#clear");
        ValueAnimator valueAnimator = this.yandex;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.yandex = null;
        }
        C16950l c16950l = this.loadAd;
        c16950l.setAlpha(0.0f);
        c16950l.setBrightness(0.0f);
    }
}
