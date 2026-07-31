package defpackage;

/* JADX INFO: renamed from: lؙۡؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6810l {
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
    public static final C7654l yandex = AbstractC4730l.admob(C5665l.f12045l, 0, null, 151, EnumC17998l.f35187l, Integer.class);

    static {
        C6582l c6582l = C6582l.f13768l;
        C7899l c7899l = C7899l.f16470l;
        C3265l c3265l = EnumC17998l.f35192l;
        loadAd = AbstractC4730l.mopub(c6582l, c7899l, 150, c3265l, C7899l.class);
        crashlytics = AbstractC4730l.mopub(C13347l.f26200l, c7899l, 150, c3265l, C7899l.class);
        amazon = AbstractC4730l.mopub(C14036l.f27354l, c7899l, 150, c3265l, C7899l.class);
        C13146l c13146l = C13146l.f25711l;
        purchase = AbstractC4730l.mopub(c13146l, c7899l, 150, c3265l, C7899l.class);
        billing = AbstractC4730l.mopub(c13146l, c7899l, 152, c3265l, C7899l.class);
        mopub = AbstractC4730l.mopub(c13146l, c7899l, 153, c3265l, C7899l.class);
        C4207l c4207l = C4207l.f8622l;
        admob = AbstractC4730l.admob(c13146l, c4207l, c4207l, 151, c3265l, C4207l.class);
        subs = AbstractC4730l.mopub(C16400l.f32091l, c7899l, 150, c3265l, C7899l.class);
        isPro = AbstractC4730l.mopub(C18426l.f35982l, c7899l, 150, c3265l, C7899l.class);
        firebase = AbstractC4730l.mopub(C18128l.f35421l, c7899l, 150, c3265l, C7899l.class);
        smaato = AbstractC4730l.mopub(C17586l.f34235l, c7899l, 150, c3265l, C7899l.class);
    }

    public static void yandex(C3429l c3429l) {
        c3429l.yandex(yandex);
        c3429l.yandex(loadAd);
        c3429l.yandex(crashlytics);
        c3429l.yandex(amazon);
        c3429l.yandex(purchase);
        c3429l.yandex(billing);
        c3429l.yandex(mopub);
        c3429l.yandex(admob);
        c3429l.yandex(subs);
        c3429l.yandex(isPro);
        c3429l.yandex(firebase);
        c3429l.yandex(smaato);
    }
}
