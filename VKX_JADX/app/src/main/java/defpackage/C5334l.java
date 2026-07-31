package defpackage;

/* JADX INFO: renamed from: lؘَؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5334l {
    public static final C5334l admob;
    public static final C5334l mopub = new C5334l(new C17141l());
    public static final C5334l subs;
    public final boolean amazon;
    public final C1770l billing;
    public final boolean crashlytics;
    public final int loadAd;
    public final boolean purchase;
    public final int yandex;

    static {
        C17141l c17141l = new C17141l();
        c17141l.amazon = 0;
        c17141l.purchase = false;
        c17141l.crashlytics = 1;
        c17141l.yandex = true;
        c17141l.loadAd = false;
        admob = new C5334l(c17141l);
        C17141l c17141l2 = new C17141l();
        c17141l2.amazon = 2;
        c17141l2.purchase = true;
        c17141l2.crashlytics = 2;
        c17141l2.loadAd = true;
        c17141l2.yandex = false;
        subs = new C5334l(c17141l2);
        C17141l c17141l3 = new C17141l();
        c17141l3.amazon = 0;
        c17141l3.purchase = true;
        c17141l3.crashlytics = 2;
        c17141l3.loadAd = true;
        c17141l3.yandex = true;
    }

    public C5334l(C17141l c17141l) {
        this.purchase = c17141l.yandex;
        this.yandex = c17141l.crashlytics;
        this.loadAd = c17141l.amazon;
        this.amazon = c17141l.loadAd;
        this.crashlytics = c17141l.purchase;
        this.billing = c17141l.billing;
    }
}
