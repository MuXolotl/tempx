package defpackage;

/* JADX INFO: renamed from: lَْؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10255l {
    public static final C3682l loadAd;
    public static final C3682l yandex;

    static {
        Class cls = AbstractC16910l.yandex;
        C3682l c3682l = null;
        try {
            c3682l = (C3682l) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        yandex = c3682l;
        loadAd = new C3682l();
    }
}
