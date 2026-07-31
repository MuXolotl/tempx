package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lًؚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7677l implements InterfaceC9750l {
    public final int admob;
    public final C2536l amazon;
    public final C2982l billing;
    public final C2536l crashlytics;
    public final C2982l firebase;
    public final ArrayList isPro;
    public final C2536l loadAd;
    public final int mopub;
    public final C2536l purchase;
    public final boolean smaato;
    public final float subs;
    public final int yandex;

    public C7677l(String str, int i, C2536l c2536l, C2536l c2536l2, C2536l c2536l3, C2536l c2536l4, C2982l c2982l, int i2, int i3, float f, ArrayList arrayList, C2982l c2982l2, boolean z) {
        this.yandex = i;
        this.loadAd = c2536l;
        this.crashlytics = c2536l2;
        this.amazon = c2536l3;
        this.purchase = c2536l4;
        this.billing = c2982l;
        this.mopub = i2;
        this.admob = i3;
        this.subs = f;
        this.isPro = arrayList;
        this.firebase = c2982l2;
        this.smaato = z;
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        return new C12806l(c9950l, abstractC10437l, this);
    }
}
