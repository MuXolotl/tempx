package defpackage;

/* JADX INFO: renamed from: lٌۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18718l {
    public static final C7545l admob;
    public static final C7545l billing;
    public static final C7545l mopub;
    public static final C7545l purchase;
    public final long amazon;
    public final long crashlytics;
    public final long loadAd;
    public final long yandex;

    static {
        C7545l c7545l = new C7545l();
        float[] fArr = c7545l.crashlytics;
        fArr[2] = 1.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        c7545l.amazon = false;
        purchase = c7545l;
        C7545l c7545l2 = new C7545l();
        float[] fArr2 = c7545l2.loadAd;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.26f;
        fArr2[2] = 0.5f;
        float[] fArr3 = c7545l2.yandex;
        fArr3[0] = 0.1f;
        fArr3[1] = 0.6f;
        fArr3[2] = 1.0f;
        float[] fArr4 = c7545l2.crashlytics;
        fArr4[2] = 0.18f;
        fArr4[0] = 0.22f;
        fArr4[1] = 0.6f;
        c7545l2.amazon = false;
        billing = c7545l2;
        C7545l c7545l3 = new C7545l();
        float[] fArr5 = c7545l3.loadAd;
        fArr5[0] = 0.5f;
        fArr5[1] = 0.74f;
        fArr5[2] = 1.0f;
        float[] fArr6 = c7545l3.yandex;
        fArr6[0] = 0.1f;
        fArr6[1] = 0.7f;
        fArr6[2] = 1.0f;
        float[] fArr7 = c7545l3.crashlytics;
        fArr7[2] = 0.18f;
        fArr7[0] = 0.22f;
        fArr7[1] = 0.6f;
        c7545l3.amazon = false;
        mopub = c7545l3;
        C7545l c7545l4 = new C7545l();
        float[] fArr8 = c7545l4.loadAd;
        fArr8[0] = 0.2f;
        fArr8[1] = 0.5f;
        fArr8[2] = 0.8f;
        float[] fArr9 = c7545l4.yandex;
        fArr9[0] = 0.1f;
        fArr9[1] = 0.6f;
        fArr9[2] = 1.0f;
        float[] fArr10 = c7545l4.crashlytics;
        fArr10[2] = 0.18f;
        fArr10[0] = 0.22f;
        fArr10[1] = 0.6f;
        c7545l4.amazon = false;
        admob = c7545l4;
    }

    public C18718l(long j, long j2) {
        j = j2 != 16 ? AbstractC12953l.firebase(C9735l.loadAd(0.35f, j2), j) : j;
        this.yandex = j;
        this.loadAd = C9735l.loadAd(0.75f, j);
        this.crashlytics = C9735l.loadAd(0.5f, j);
        this.amazon = C9735l.loadAd(0.25f, j);
    }
}
