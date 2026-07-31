package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؙۙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6719l implements InterfaceC9750l {
    public final float admob;
    public final C2536l amazon;
    public final int billing;
    public final C2536l crashlytics;
    public final ArrayList loadAd;
    public final int mopub;
    public final C2982l purchase;
    public final boolean subs;
    public final C2982l yandex;

    public C6719l(String str, C2982l c2982l, ArrayList arrayList, C2536l c2536l, C2536l c2536l2, C2982l c2982l2, int i, int i2, float f, boolean z) {
        this.yandex = c2982l;
        this.loadAd = arrayList;
        this.crashlytics = c2536l;
        this.amazon = c2536l2;
        this.purchase = c2982l2;
        this.billing = i;
        this.mopub = i2;
        this.admob = f;
        this.subs = z;
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        return new C9447l(c9950l, abstractC10437l, this);
    }
}
