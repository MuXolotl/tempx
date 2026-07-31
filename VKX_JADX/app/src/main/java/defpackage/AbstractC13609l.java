package defpackage;

/* JADX INFO: renamed from: lْۘۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13609l {
    public static final C2029l amazon;
    public static final C2029l billing;
    public static final C10210l crashlytics;
    public static final C10210l loadAd;
    public static final C2029l purchase;
    public static final C8540l yandex = new C8540l(new C5146l(3));

    static {
        long j = C9735l.firebase;
        loadAd = new C10210l(true, Float.NaN, j);
        crashlytics = new C10210l(false, Float.NaN, j);
        amazon = new C2029l(0.16f, 0.24f, 0.08f, 0.24f);
        purchase = new C2029l(0.08f, 0.12f, 0.04f, 0.12f);
        billing = new C2029l(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static C10210l yandex(int i, float f) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = C9735l.firebase;
        if (C14467l.loadAd(f, Float.NaN) && C9735l.crashlytics(j, j)) {
            return z ? loadAd : crashlytics;
        }
        return new C10210l(z, f, j);
    }
}
