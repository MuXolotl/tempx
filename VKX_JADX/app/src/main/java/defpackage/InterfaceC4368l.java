package defpackage;

/* JADX INFO: renamed from: lؖۙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4368l {
    public static final Cfor Signature;
    public static final Cfor adcel;
    public static final Cfor admob;
    public static final Cfor ads;
    public static final Cfor amazon;
    public static final Cfor billing;
    public static final Cfor crashlytics;
    public static final Cfor firebase;
    public static final Cfor isPro;
    public static final Cfor license;
    public static final Cfor loadAd;
    public static final Cfor metrica;
    public static final Cfor mopub;
    public static final Cfor purchase;
    public static final Cfor remoteconfig;
    public static final Cfor smaato;
    public static final Cfor startapp;
    public static final Cfor subs;
    public static final Cfor subscription;
    public static final Cfor tapsense;
    public static final Cfor vip;
    public static final Cfor yandex;

    static {
        Cfor cfor = new Cfor("1.3.36.3");
        yandex = cfor.premium("2.1");
        loadAd = cfor.premium("2.2");
        crashlytics = cfor.premium("2.3");
        Cfor cforPremium = cfor.premium("3.1");
        amazon = cforPremium.premium("2");
        purchase = cforPremium.premium("3");
        billing = cforPremium.premium("4");
        Cfor cforPremium2 = cfor.premium("3.2");
        mopub = cforPremium2.premium("1");
        admob = cforPremium2.premium("2");
        Cfor cforPremium3 = cfor.premium("3.2.8").premium("1").premium("1");
        subs = cforPremium3.premium("1");
        isPro = cforPremium3.premium("2");
        firebase = cforPremium3.premium("3");
        smaato = cforPremium3.premium("4");
        remoteconfig = cforPremium3.premium("5");
        vip = cforPremium3.premium("6");
        metrica = cforPremium3.premium("7");
        startapp = cforPremium3.premium("8");
        adcel = cforPremium3.premium("9");
        ads = cforPremium3.premium("10");
        subscription = cforPremium3.premium("11");
        tapsense = cforPremium3.premium("12");
        Signature = cforPremium3.premium("13");
        license = cforPremium3.premium("14");
    }
}
