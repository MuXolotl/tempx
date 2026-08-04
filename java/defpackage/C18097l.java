package defpackage;

/* JADX INFO: renamed from: lٟ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18097l {
    public final int crashlytics;
    public final C12280l loadAd;
    public final String yandex;
    public static final C18097l amazon = new C18097l("sha2-128f", new C12280l(16, 22, 6, 33, 66, 1), 0);
    public static final C18097l purchase = new C18097l("sha2-128s", new C12280l(16, 7, 12, 14, 63, 1), 0);
    public static final C18097l billing = new C18097l("sha2-192f", new C12280l(24, 22, 8, 33, 66, 1), 0);
    public static final C18097l mopub = new C18097l("sha2-192s", new C12280l(24, 7, 14, 17, 63, 1), 0);
    public static final C18097l admob = new C18097l("sha2-256f", new C12280l(32, 17, 9, 35, 68, 1), 0);
    public static final C18097l subs = new C18097l("sha2-256s", new C12280l(32, 8, 14, 22, 64, 1), 0);
    public static final C18097l isPro = new C18097l("shake-128f", new C12280l(16, 22, 6, 33, 66, 2), 0);
    public static final C18097l firebase = new C18097l("shake-128s", new C12280l(16, 7, 12, 14, 63, 2), 0);
    public static final C18097l smaato = new C18097l("shake-192f", new C12280l(24, 22, 8, 33, 66, 2), 0);
    public static final C18097l remoteconfig = new C18097l("shake-192s", new C12280l(24, 7, 14, 17, 63, 2), 0);
    public static final C18097l vip = new C18097l("shake-256f", new C12280l(32, 17, 9, 35, 68, 2), 0);
    public static final C18097l metrica = new C18097l("shake-256s", new C12280l(32, 8, 14, 22, 64, 2), 0);
    public static final C18097l startapp = new C18097l("sha2-128f-with-sha256", new C12280l(16, 22, 6, 33, 66, 1), 1);
    public static final C18097l adcel = new C18097l("sha2-128s-with-sha256", new C12280l(16, 7, 12, 14, 63, 1), 1);
    public static final C18097l ads = new C18097l("sha2-192f-with-sha512", new C12280l(24, 22, 8, 33, 66, 1), 2);
    public static final C18097l subscription = new C18097l("sha2-192s-with-sha512", new C12280l(24, 7, 14, 17, 63, 1), 2);
    public static final C18097l tapsense = new C18097l("sha2-256f-with-sha512", new C12280l(32, 17, 9, 35, 68, 1), 2);
    public static final C18097l Signature = new C18097l("sha2-256s-with-sha512", new C12280l(32, 8, 14, 22, 64, 1), 2);
    public static final C18097l license = new C18097l("shake-128f-with-shake128", new C12280l(16, 22, 6, 33, 66, 2), 3);
    public static final C18097l pro = new C18097l("shake-128s-with-shake128", new C12280l(16, 7, 12, 14, 63, 2), 3);
    public static final C18097l ad = new C18097l("shake-192f-with-shake256", new C12280l(24, 22, 8, 33, 66, 2), 4);
    public static final C18097l advert = new C18097l("shake-192s-with-shake256", new C12280l(24, 7, 14, 17, 63, 2), 4);
    public static final C18097l isVip = new C18097l("shake-256f-with-shake256", new C12280l(32, 17, 9, 35, 68, 2), 4);
    public static final C18097l signatures = new C18097l("shake-256s-with-shake256", new C12280l(32, 8, 14, 22, 64, 2), 4);

    public C18097l(String str, C12280l c12280l, int i) {
        this.yandex = str;
        this.loadAd = c12280l;
        this.crashlytics = i;
    }
}
