package defpackage;

/* JADX INFO: renamed from: l٘ۨ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18385l {
    public static final C17664l loadAd;
    public static final C17664l yandex;

    static {
        C17073l c17073l = C17073l.crashlytics;
        C17664l c17664l = null;
        try {
            c17664l = (C17664l) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        yandex = c17664l;
        loadAd = new C17664l();
    }
}
