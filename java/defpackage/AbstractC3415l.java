package defpackage;

/* JADX INFO: renamed from: lٕؕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3415l {
    public static final C13315l amazon;
    public static final long crashlytics;
    public static final C15709l yandex = new C15709l(Float.NaN, Float.NaN);
    public static final C0010l loadAd = new C0010l(new C10557l(22), new C10557l(23));

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        crashlytics = jFloatToRawIntBits;
        amazon = new C13315l(new C1187l(jFloatToRawIntBits));
    }
}
