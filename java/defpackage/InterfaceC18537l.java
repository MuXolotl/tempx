package defpackage;

/* JADX INFO: renamed from: lۘۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC18537l {
    public static final Cfor admob;
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
        Cfor cfor = new Cfor("0.4.0.127.0.7");
        Cfor cforPremium = cfor.premium("1.1");
        Cfor cforPremium2 = cforPremium.premium("4.1");
        yandex = cforPremium2.premium("1");
        loadAd = cforPremium2.premium("2");
        crashlytics = cforPremium2.premium("3");
        amazon = cforPremium2.premium("4");
        purchase = cforPremium2.premium("5");
        billing = cforPremium2.premium("6");
        mopub = cforPremium2.premium("8");
        admob = cforPremium2.premium("9");
        subs = cforPremium2.premium("10");
        isPro = cforPremium2.premium("11");
        cfor.premium("1");
        Cfor cforPremium3 = cforPremium.premium("5.1");
        Cfor cforPremium4 = cforPremium3.premium("1");
        firebase = cforPremium4.premium("1");
        smaato = cforPremium4.premium("2");
        remoteconfig = cforPremium4.premium("3");
        vip = cforPremium4.premium("4");
        metrica = cforPremium4.premium("5");
        startapp = cforPremium4.premium("6");
        Cfor cforPremium5 = cforPremium3.premium("2");
        cforPremium5.premium("1");
        cforPremium5.premium("2");
        cforPremium5.premium("3");
        cforPremium5.premium("4");
    }
}
