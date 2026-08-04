package defpackage;

/* JADX INFO: renamed from: lُؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1151l {
    public static final C4736l loadAd;
    public static final C4736l yandex;

    static {
        C10738l c10738l = C10738l.crashlytics;
        C4736l c4736l = null;
        try {
            c4736l = (C4736l) Class.forName("androidx.glance.appwidget.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        yandex = c4736l;
        loadAd = new C4736l();
    }
}
