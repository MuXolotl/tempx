package defpackage;

/* JADX INFO: renamed from: lؓۡؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2171l {
    public static final C2171l amazon = new C2171l(new C2985l());
    public static final String billing;
    public static final String mopub;
    public static final String purchase;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        purchase = Integer.toString(1, 36);
        billing = Integer.toString(2, 36);
        mopub = Integer.toString(3, 36);
    }

    public C2171l(C2985l c2985l) {
        this.yandex = c2985l.yandex;
        this.loadAd = c2985l.loadAd;
        this.crashlytics = c2985l.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2171l.class == obj.getClass()) {
            C2171l c2171l = (C2171l) obj;
            if (this.yandex == c2171l.yandex && this.loadAd == c2171l.loadAd && this.crashlytics == c2171l.crashlytics) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.yandex + 31) * 31) + (this.loadAd ? 1 : 0)) * 31) + (this.crashlytics ? 1 : 0);
    }
}
