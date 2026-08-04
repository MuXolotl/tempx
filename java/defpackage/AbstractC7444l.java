package defpackage;

/* JADX INFO: renamed from: lؚۖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7444l {
    public static final C0950l amazon;
    public static final C0950l billing;
    public static final C0950l crashlytics;
    public static final C0950l mopub;
    public static final C0950l purchase;
    public static final C8654l yandex = new C8654l(0.0d, C2759l.f5976l);
    public static final C8654l loadAd = new C8654l(0.02d, C2759l.f5977l);

    static {
        int i = 0;
        int i2 = 6;
        crashlytics = new C0950l(0.2d, i, i2);
        double d = 1.0d;
        amazon = new C0950l(d, i, i2);
        purchase = new C0950l(-1.0d, i, i2);
        int i3 = 1;
        int i4 = 2;
        billing = new C0950l(d, i3, i4);
        mopub = new C0950l(0.5d, i3, i4);
    }
}
