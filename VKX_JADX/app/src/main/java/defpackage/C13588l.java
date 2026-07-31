package defpackage;

/* JADX INFO: renamed from: lِْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13588l {
    public static final C9299l loadAd;
    public static final C9299l yandex;

    static {
        C3529l c3529l = AbstractC14196l.crashlytics;
        yandex = c3529l.yandex("measurement.set_default_event_parameters.fix_app_update_logging", true);
        loadAd = c3529l.yandex("measurement.set_default_event_parameters.fix_service_request_ordering", false);
    }
}
