package defpackage;

/* JADX INFO: renamed from: lؖٛؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4231l {
    public static final C8705l loadAd;
    public static final C8705l yandex = new C8705l();

    static {
        C17073l c17073l = C17073l.crashlytics;
        C8705l c8705l = null;
        try {
            c8705l = (C8705l) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        loadAd = c8705l;
    }
}
