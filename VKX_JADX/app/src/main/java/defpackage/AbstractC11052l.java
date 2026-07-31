package defpackage;

/* JADX INFO: renamed from: lُٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11052l {
    public static C10282l admob;
    public static final float[] amazon;
    public static C10282l billing;
    public static C10282l firebase;
    public static C10282l isPro;
    public static C10282l mopub;
    public static final float[] purchase;
    public static C10282l remoteconfig;
    public static C10282l smaato;
    public static C10282l subs;
    public static final C2183l yandex = new C2183l(5);
    public static final C2428l loadAd = new C2428l(2, 0.15f);
    public static final C2428l crashlytics = new C2428l(2, 0.5f);

    static {
        float[] fArrYandex = C10924l.yandex();
        C10924l.billing(fArrYandex, -45.0f);
        amazon = fArrYandex;
        float[] fArrYandex2 = C10924l.yandex();
        C10924l.billing(fArrYandex2, -90.0f);
        purchase = fArrYandex2;
        C10924l.billing(C10924l.yandex(), -135.0f);
    }
}
