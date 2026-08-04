package defpackage;

/* JADX INFO: renamed from: lؒٞٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1217l {
    public static final C0264l loadAd;
    public static final C0264l yandex = new C0264l();

    static {
        C10738l c10738l = C10738l.crashlytics;
        C0264l c0264l = null;
        try {
            c0264l = (C0264l) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        loadAd = c0264l;
    }
}
