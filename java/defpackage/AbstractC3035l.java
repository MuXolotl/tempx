package defpackage;

/* JADX INFO: renamed from: lؔۥۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3035l {
    public static final C0035l loadAd;
    public static final C0035l yandex;

    static {
        C17073l c17073l = C17073l.crashlytics;
        C0035l c0035l = null;
        try {
            c0035l = (C0035l) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        yandex = c0035l;
        loadAd = new C0035l();
    }
}
