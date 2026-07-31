package defpackage;

/* JADX INFO: renamed from: lؚ۠ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7551l {
    public static final C8806l admob;
    public static final C3724l amazon;
    public static final C6362l billing;
    public static final C3724l crashlytics;
    public static final C5253l loadAd;
    public static final C6362l mopub;
    public static final C6362l purchase;
    public static final C8806l subs;
    public static final C5253l yandex;

    static {
        C15089l c15089l = C18450l.f36046l;
        yandex = new C5253l(c15089l, c15089l);
        C15089l c15089l2 = C18450l.f36023l;
        new C5253l(c15089l, c15089l2);
        loadAd = new C5253l(c15089l2, c15089l2);
        new C5253l(c15089l2, c15089l);
        crashlytics = new C3724l(AbstractC5088l.crashlytics);
        amazon = new C3724l(AbstractC5088l.amazon);
        C0086l c0086l = C18450l.f36044l;
        C0086l c0086l2 = C18450l.f36016l;
        purchase = new C6362l(c0086l, c0086l2);
        new C6362l(c0086l, c0086l);
        billing = new C6362l(c0086l2, c0086l);
        new C6362l(c0086l2, c0086l2);
        mopub = new C6362l(C18450l.f36040l, c0086l);
        admob = new C8806l(c0086l);
        subs = new C8806l(c0086l2);
    }
}
