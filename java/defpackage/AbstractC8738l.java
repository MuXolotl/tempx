package defpackage;

/* JADX INFO: renamed from: lٌّّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8738l {
    public static final C1558l loadAd;
    public static final C1558l yandex = new C1558l();

    static {
        Class cls = AbstractC16910l.yandex;
        C1558l c1558l = null;
        try {
            c1558l = (C1558l) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        loadAd = c1558l;
    }
}
