package defpackage;

/* JADX INFO: renamed from: lؖؔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3889l {
    public static final C16543l amazon;
    public static final C16543l crashlytics;
    public static final C16543l loadAd;
    public static final C16543l yandex;

    static {
        int i = 11;
        yandex = new C16543l(i, (Object) 4);
        loadAd = new C16543l(i, C7455l.yandex);
        crashlytics = new C16543l(i, Boolean.TRUE);
        amazon = new C16543l(i, Double.valueOf(1.0d));
    }
}
