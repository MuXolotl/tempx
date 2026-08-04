package defpackage;

/* JADX INFO: renamed from: lٌۥٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9172l {
    public static final Cfor amazon;
    public static final Cfor crashlytics;
    public static final Cfor loadAd;
    public static final Cfor purchase;
    public static final Cfor yandex;

    static {
        Cfor cfor = new Cfor("0.4.0.127.0.7");
        Cfor cforPremium = cfor.premium("2.2.1");
        cforPremium.premium("1");
        cforPremium.premium("2");
        Cfor cforPremium2 = cfor.premium("2.2.3");
        cforPremium2.premium("1").premium("1");
        cforPremium2.premium("2").premium("1");
        Cfor cforPremium3 = cfor.premium("2.2.2");
        Cfor cforPremium4 = cforPremium3.premium("1");
        cforPremium4.premium("1");
        cforPremium4.premium("2");
        cforPremium4.premium("3");
        cforPremium4.premium("4");
        cforPremium4.premium("5");
        cforPremium4.premium("6");
        Cfor cforPremium5 = cforPremium3.premium("2");
        yandex = cforPremium5.premium("1");
        loadAd = cforPremium5.premium("2");
        crashlytics = cforPremium5.premium("3");
        amazon = cforPremium5.premium("4");
        purchase = cforPremium5.premium("5");
        cfor.premium("3.1.2.1");
    }
}
