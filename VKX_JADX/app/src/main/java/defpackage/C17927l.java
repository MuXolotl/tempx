package defpackage;

/* JADX INFO: renamed from: lٟ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17927l {
    public static final C17927l amazon;
    public static final C17927l billing;
    public static final C17927l crashlytics;
    public static final C17927l mopub;
    public static final C17927l purchase;
    public final String loadAd;
    public final /* synthetic */ int yandex;

    static {
        int i = 0;
        crashlytics = new C17927l("TINK", i);
        amazon = new C17927l("CRUNCHY", i);
        purchase = new C17927l("NO_PREFIX", i);
        int i2 = 1;
        billing = new C17927l("TINK", i2);
        mopub = new C17927l("NO_PREFIX", i2);
    }

    public /* synthetic */ C17927l(String str, int i) {
        this.yandex = i;
        this.loadAd = str;
    }

    public String toString() {
        int i = this.yandex;
        String str = this.loadAd;
        switch (i) {
            case 0:
            case 1:
                return str;
            default:
                return super.toString();
        }
    }
}
