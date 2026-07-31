package defpackage;

/* JADX INFO: renamed from: lٗۙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17365l {
    public static final C2823l loadAd;
    public static final C2823l yandex;

    static {
        Class cls = AbstractC16910l.yandex;
        C2823l c2823l = null;
        try {
            c2823l = (C2823l) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        yandex = c2823l;
        loadAd = new C2823l();
    }
}
