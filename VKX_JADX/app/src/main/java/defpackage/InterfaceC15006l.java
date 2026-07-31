package defpackage;

/* JADX INFO: renamed from: lُٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC15006l {
    public static final Cfor amazon;
    public static final Cfor crashlytics;
    public static final Cfor loadAd;
    public static final Cfor yandex;

    static {
        Cfor cfor = InterfaceC0543l.f1922throw;
        Cfor cfor2 = new Cfor("1.3.6.1.5.5.7.16");
        cfor2.premium("2");
        cfor2.premium("4");
        Cfor cfor3 = new Cfor("1.3.6.1.5.5.7.6");
        yandex = cfor3.premium("30");
        loadAd = cfor3.premium("31");
        crashlytics = cfor3.premium("32");
        amazon = cfor3.premium("33");
    }
}
