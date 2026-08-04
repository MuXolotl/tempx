package defpackage;

/* JADX INFO: renamed from: lٙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC18410l {
    public static final Cfor adcel;
    public static final Cfor admob;
    public static final Cfor ads;
    public static final Cfor amazon;
    public static final Cfor billing;
    public static final Cfor crashlytics;
    public static final Cfor firebase;
    public static final Cfor isPro;
    public static final Cfor loadAd;
    public static final Cfor metrica;
    public static final Cfor mopub;
    public static final Cfor purchase;
    public static final Cfor remoteconfig;
    public static final Cfor smaato;
    public static final Cfor startapp;
    public static final Cfor subs;
    public static final Cfor vip;
    public static final Cfor yandex;

    static {
        Cfor cforPremium = new Cfor("1.2.643.7").premium("1");
        yandex = cforPremium.premium("1.2.2");
        loadAd = cforPremium.premium("1.2.3");
        crashlytics = cforPremium.premium("1.4.1");
        amazon = cforPremium.premium("1.4.2");
        purchase = cforPremium.premium("1.1.1");
        billing = cforPremium.premium("1.1.2");
        mopub = cforPremium.premium("1.3.2");
        admob = cforPremium.premium("1.3.3");
        Cfor cforPremium2 = cforPremium.premium("1.6");
        subs = cforPremium2.premium("1");
        isPro = cforPremium2.premium("2");
        Cfor cforPremium3 = cforPremium.premium("2.1.1");
        firebase = cforPremium3.premium("1");
        smaato = cforPremium3.premium("2");
        remoteconfig = cforPremium3.premium("3");
        vip = cforPremium3.premium("4");
        Cfor cforPremium4 = cforPremium.premium("2.1.2");
        metrica = cforPremium4.premium("1");
        startapp = cforPremium4.premium("2");
        adcel = cforPremium4.premium("3");
        ads = cforPremium.premium("2.5.1.1");
    }
}
