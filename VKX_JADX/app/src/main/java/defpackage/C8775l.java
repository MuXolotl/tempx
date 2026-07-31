package defpackage;

/* JADX INFO: renamed from: lٌٔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8775l {
    public static final C9299l crashlytics;
    public static final C9299l loadAd;
    public static final C9299l yandex;

    static {
        C3529l c3529l = AbstractC14196l.crashlytics;
        yandex = c3529l.yandex("measurement.audience.refresh_event_count_filters_timestamp", false);
        loadAd = c3529l.yandex("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        crashlytics = c3529l.yandex("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
