package defpackage;

/* JADX INFO: renamed from: lِؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11687l {
    public static final C9899l loadAd;
    public static final C9899l yandex;

    static {
        Class cls = AbstractC16910l.yandex;
        C9899l c9899l = null;
        try {
            c9899l = (C9899l) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        yandex = c9899l;
        loadAd = new C9899l();
    }
}
