package defpackage;

/* JADX INFO: renamed from: lّٖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12770l {
    public static final C4863l loadAd;
    public static final C4863l yandex;

    static {
        C17073l c17073l = C17073l.crashlytics;
        C4863l c4863l = null;
        try {
            c4863l = (C4863l) Class.forName("com.google.crypto.tink.shaded.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        yandex = c4863l;
        loadAd = new C4863l();
    }
}
