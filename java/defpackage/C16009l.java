package defpackage;

import android.graphics.Path;

/* JADX INFO: renamed from: lٕۢۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16009l implements InterfaceC1767l {
    public float crashlytics;
    public float loadAd;
    public final Path yandex = new Path();

    public C16009l(C11522l c11522l) {
        if (c11522l == null) {
            return;
        }
        c11522l.isVip(this);
    }

    @Override // defpackage.InterfaceC1767l
    public final void amazon(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        C1424l.mopub(this.loadAd, this.crashlytics, f, f2, f3, z, z2, f4, f5, this);
        this.loadAd = f4;
        this.crashlytics = f5;
    }

    @Override // defpackage.InterfaceC1767l
    public final void close() {
        this.yandex.close();
    }

    @Override // defpackage.InterfaceC1767l
    public final void crashlytics(float f, float f2, float f3, float f4, float f5, float f6) {
        this.yandex.cubicTo(f, f2, f3, f4, f5, f6);
        this.loadAd = f5;
        this.crashlytics = f6;
    }

    @Override // defpackage.InterfaceC1767l
    public final void loadAd(float f, float f2) {
        this.yandex.moveTo(f, f2);
        this.loadAd = f;
        this.crashlytics = f2;
    }

    @Override // defpackage.InterfaceC1767l
    public final void purchase(float f, float f2) {
        this.yandex.lineTo(f, f2);
        this.loadAd = f;
        this.crashlytics = f2;
    }

    @Override // defpackage.InterfaceC1767l
    public final void yandex(float f, float f2, float f3, float f4) {
        this.yandex.quadTo(f, f2, f3, f4);
        this.loadAd = f3;
        this.crashlytics = f4;
    }
}
