package defpackage;

/* JADX INFO: renamed from: lؙّٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12437l {
    public static final C12437l amazon;
    public static final C12437l billing;
    public static final C12437l crashlytics;
    public static final C12437l loadAd;
    public static final C12437l purchase;
    public final InterfaceC16334l yandex;

    static {
        int i = 1;
        loadAd = new C12437l(new C16936l(i));
        crashlytics = new C12437l(new C9912l(i));
        new C12437l(new C6162l(i));
        new C12437l(new C6096l(i));
        amazon = new C12437l(new C10819l(i));
        purchase = new C12437l(new C16222l(i));
        billing = new C12437l(new C13975l(i));
    }

    public C12437l(InterfaceC2165l interfaceC2165l) {
        if (AbstractC3534l.yandex()) {
            this.yandex = new C13161l(interfaceC2165l);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.yandex = new C14965l(interfaceC2165l);
        } else {
            this.yandex = new C10685l(interfaceC2165l);
        }
    }
}
