package defpackage;

import ua.itaysonlab.vkxnative.BundleNativeClass;

/* JADX INFO: renamed from: lٌؚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2490l extends BundleNativeClass {
    public static final C8688l subs = new C8688l(new C15687l(4));
    public final C14785l admob;
    public final C14785l amazon;
    public final C3316l billing;
    public final C14785l crashlytics;
    public final C16543l loadAd;
    public final C14785l mopub;
    public final C14785l purchase;

    public C2490l() {
        super(12);
        this.loadAd = new C16543l(5, this);
        int i = 2;
        this.crashlytics = new C14785l(this, 4, i);
        this.amazon = new C14785l(this, 5, i);
        this.purchase = new C14785l(this, 6, i);
        this.billing = new C3316l(5, this);
        int i2 = 2;
        this.mopub = new C14785l(this, 8, i2);
        this.admob = new C14785l(this, 10, i2);
    }
}
