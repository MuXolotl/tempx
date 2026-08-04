package defpackage;

/* JADX INFO: renamed from: lِْۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13656l {
    public static final C5018l loadAd;
    public static final C5018l yandex;

    static {
        C10738l c10738l = C10738l.crashlytics;
        C5018l c5018l = null;
        try {
            c5018l = (C5018l) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        yandex = c5018l;
        loadAd = new C5018l();
    }
}
