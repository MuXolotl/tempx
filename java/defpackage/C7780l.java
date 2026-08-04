package defpackage;

/* JADX INFO: renamed from: lًؕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7780l {
    public static final C7780l remoteconfig = new C7780l();
    public final C7654l admob;
    public final C7654l amazon;
    public final C7654l billing;
    public final C7654l crashlytics;
    public final C7654l firebase;
    public final C7654l isPro;
    public final C7654l loadAd;
    public final C7654l mopub;
    public final C7654l purchase;
    public final C7654l smaato;
    public final C7654l subs;
    public final C3429l yandex;

    public C7780l() {
        C3429l c3429l = new C3429l();
        AbstractC6810l.yandex(c3429l);
        C7654l c7654l = AbstractC6810l.crashlytics;
        C7654l c7654l2 = AbstractC6810l.loadAd;
        C7654l c7654l3 = AbstractC6810l.amazon;
        C7654l c7654l4 = AbstractC6810l.purchase;
        C7654l c7654l5 = AbstractC6810l.billing;
        C7654l c7654l6 = AbstractC6810l.mopub;
        C7654l c7654l7 = AbstractC6810l.subs;
        C7654l c7654l8 = AbstractC6810l.admob;
        C7654l c7654l9 = AbstractC6810l.isPro;
        C7654l c7654l10 = AbstractC6810l.firebase;
        C7654l c7654l11 = AbstractC6810l.smaato;
        this.yandex = c3429l;
        this.loadAd = c7654l;
        this.crashlytics = c7654l2;
        this.amazon = c7654l3;
        this.purchase = c7654l4;
        this.billing = c7654l5;
        this.mopub = c7654l6;
        this.admob = c7654l7;
        this.subs = c7654l8;
        this.isPro = c7654l9;
        this.firebase = c7654l10;
        this.smaato = c7654l11;
    }

    public static String yandex(C2312l c2312l) {
        StringBuilder sb = new StringBuilder();
        C16781l c16781l = c2312l.yandex;
        sb.append(c16781l.yandex.replace('.', '/'));
        sb.append('/');
        sb.append((c16781l.crashlytics() ? "default-package" : c16781l.mopub().loadAd()).concat(".kotlin_builtins"));
        return sb.toString();
    }
}
