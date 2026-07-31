package defpackage;

/* JADX INFO: renamed from: lُٓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14196l {
    public static final C3529l crashlytics;
    public static volatile String loadAd;
    public static final C6385l yandex;

    static {
        C15952l c15952l = C15952l.f31322l;
        int i = AbstractC8481l.f17529l;
        C13648l c13648l = new C13648l(c15952l, true, C13825l.f26967l);
        C18096l c18096l = new C18096l();
        c18096l.loadAd = c13648l;
        crashlytics = new C3529l(c18096l);
        yandex = new C6385l("__phenotype_server_token", c18096l, "");
        loadAd = null;
    }

    public static String yandex() {
        return (String) yandex.get();
    }
}
