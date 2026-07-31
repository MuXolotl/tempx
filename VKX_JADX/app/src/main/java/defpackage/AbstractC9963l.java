package defpackage;

/* JADX INFO: renamed from: lٍۧؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9963l {
    public final String crashlytics;
    public final String loadAd;
    public final int yandex;

    public AbstractC9963l(String str, int i, String str2) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
    }

    public abstract void amazon(InterfaceC0684l interfaceC0684l);

    public abstract void billing(InterfaceC0684l interfaceC0684l);

    public abstract void crashlytics();

    public abstract void loadAd(InterfaceC0684l interfaceC0684l);

    public abstract C10997l mopub(InterfaceC0684l interfaceC0684l);

    public abstract void purchase();

    public abstract void yandex(InterfaceC0684l interfaceC0684l);
}
