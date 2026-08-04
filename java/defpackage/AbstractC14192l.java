package defpackage;

/* JADX INFO: renamed from: lٓٗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14192l {
    public static final C5254l amazon;
    public static final C5254l crashlytics;
    public static final C5254l loadAd;
    public static final C5254l yandex;

    static {
        new C5254l("application", "*");
        new C5254l("application", "atom+xml");
        new C5254l("application", "cbor");
        yandex = new C5254l("application", "json");
        new C5254l("application", "hal+json");
        new C5254l("application", "javascript");
        loadAd = new C5254l("application", "octet-stream");
        new C5254l("application", "rss+xml");
        new C5254l("application", "soap+xml");
        new C5254l("application", "xml");
        new C5254l("application", "xml-dtd");
        new C5254l("application", "yaml");
        new C5254l("application", "zip");
        new C5254l("application", "gzip");
        crashlytics = new C5254l("application", "x-www-form-urlencoded");
        new C5254l("application", "pdf");
        new C5254l("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        new C5254l("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        new C5254l("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        amazon = new C5254l("application", "protobuf");
        new C5254l("application", "wasm");
        new C5254l("application", "problem+json");
        new C5254l("application", "problem+xml");
    }
}
