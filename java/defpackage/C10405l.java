package defpackage;

/* JADX INFO: renamed from: lَؙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10405l {
    public C7066l amazon;
    public final C13765l crashlytics;
    public final C0274l loadAd;
    public final C3000l yandex;

    public C10405l(C3000l c3000l, C0274l c0274l) {
        C7066l c7066lBilling = AbstractC7741l.billing(3);
        this.yandex = c3000l;
        this.loadAd = c0274l;
        this.crashlytics = new C13765l(0.0f);
        this.amazon = c7066lBilling;
    }
}
