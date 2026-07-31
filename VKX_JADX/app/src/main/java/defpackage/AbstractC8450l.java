package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* JADX INFO: renamed from: lًۨٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8450l {
    public static final C7654l admob;
    public static final C7654l amazon;
    public static final C7654l billing;
    public static final C7654l crashlytics;
    public static final C7654l firebase;
    public static final C7654l isPro;
    public static final C7654l loadAd;
    public static final C7654l mopub;
    public static final C7654l purchase;
    public static final C7654l smaato;
    public static final C7654l subs;
    public static final C7654l yandex;

    static {
        C13347l c13347l = C13347l.f26200l;
        C6431l c6431l = C6431l.f13450l;
        C3265l c3265l = EnumC17998l.f35192l;
        yandex = AbstractC4730l.admob(c13347l, c6431l, c6431l, 100, c3265l, C6431l.class);
        C14036l c14036l = C14036l.f27354l;
        loadAd = AbstractC4730l.admob(c14036l, c6431l, c6431l, 100, c3265l, C6431l.class);
        EnumC17998l enumC17998l = EnumC17998l.f35187l;
        crashlytics = AbstractC4730l.admob(c14036l, 0, null, EnergyProfile.EVCONNECTOR_TYPE_OTHER, enumC17998l, Integer.class);
        C13146l c13146l = C13146l.f25711l;
        C10459l c10459l = C10459l.f21274l;
        amazon = AbstractC4730l.admob(c13146l, c10459l, c10459l, 100, c3265l, C10459l.class);
        purchase = AbstractC4730l.admob(c13146l, 0, null, EnergyProfile.EVCONNECTOR_TYPE_OTHER, enumC17998l, Integer.class);
        billing = AbstractC4730l.admob(C18128l.f35421l, Boolean.FALSE, null, EnergyProfile.EVCONNECTOR_TYPE_OTHER, EnumC17998l.f35191l, Boolean.class);
        C6582l c6582l = C6582l.f13768l;
        mopub = AbstractC4730l.admob(c6582l, 0, null, EnergyProfile.EVCONNECTOR_TYPE_OTHER, enumC17998l, Integer.class);
        admob = AbstractC4730l.mopub(c6582l, c13146l, 102, c3265l, C13146l.class);
        subs = AbstractC4730l.admob(c6582l, 0, null, 103, enumC17998l, Integer.class);
        isPro = AbstractC4730l.admob(c6582l, 0, null, 104, enumC17998l, Integer.class);
        C5665l c5665l = C5665l.f12045l;
        firebase = AbstractC4730l.admob(c5665l, 0, null, EnergyProfile.EVCONNECTOR_TYPE_OTHER, enumC17998l, Integer.class);
        smaato = AbstractC4730l.mopub(c5665l, c13146l, 102, c3265l, C13146l.class);
    }
}
