package defpackage;

import android.graphics.Path;

/* JADX INFO: renamed from: lٌٕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15570l implements InterfaceC9750l {
    public final C2536l amazon;
    public final C2536l crashlytics;
    public final Path.FillType loadAd;
    public final boolean purchase;
    public final boolean yandex;

    public C15570l(String str, boolean z, Path.FillType fillType, C2536l c2536l, C2536l c2536l2, boolean z2) {
        this.yandex = z;
        this.loadAd = fillType;
        this.crashlytics = c2536l;
        this.amazon = c2536l2;
        this.purchase = z2;
    }

    public final String toString() {
        return AbstractC0653l.tapsense(new StringBuilder("ShapeFill{color=, fillEnabled="), this.yandex, '}');
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        return new C2031l(c9950l, abstractC10437l, this);
    }
}
