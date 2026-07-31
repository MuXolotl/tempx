package defpackage;

import android.graphics.Path;

/* JADX INFO: renamed from: lٕؕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3391l implements InterfaceC9750l {
    public final C2536l amazon;
    public final C2536l billing;
    public final C2536l crashlytics;
    public final Path.FillType loadAd;
    public final boolean mopub;
    public final C2536l purchase;
    public final int yandex;

    public C3391l(String str, int i, Path.FillType fillType, C2536l c2536l, C2536l c2536l2, C2536l c2536l3, C2536l c2536l4, boolean z) {
        this.yandex = i;
        this.loadAd = fillType;
        this.crashlytics = c2536l;
        this.amazon = c2536l2;
        this.purchase = c2536l3;
        this.billing = c2536l4;
        this.mopub = z;
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        return new C10778l(c9950l, c10712l, abstractC10437l, this);
    }
}
