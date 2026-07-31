package defpackage;

/* JADX INFO: renamed from: lؓ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1913l {
    public static final C18328l loadAd;
    public static final C18328l yandex;

    static {
        C10738l c10738l = C10738l.crashlytics;
        C18328l c18328l = null;
        try {
            c18328l = (C18328l) Class.forName("androidx.glance.appwidget.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        yandex = c18328l;
        loadAd = new C18328l();
    }
}
