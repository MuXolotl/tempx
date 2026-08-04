package defpackage;

/* JADX INFO: renamed from: lۣؑؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C0129l<T> {
    public static final C17861l Companion = new C17861l();
    public static final C13637l crashlytics;
    public final String loadAd;
    public final Object yandex;

    static {
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.spark.client.SparkWithHash", null, 2);
        c13637l.smaato("data", false);
        c13637l.smaato("hash", false);
        crashlytics = c13637l;
    }

    public /* synthetic */ C0129l(int i, Object obj, String str) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, crashlytics);
            throw null;
        }
        this.yandex = obj;
        this.loadAd = str;
    }

    public C0129l(Object obj, String str) {
        this.yandex = obj;
        this.loadAd = str;
    }
}
