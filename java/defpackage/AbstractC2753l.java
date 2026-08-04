package defpackage;

/* JADX INFO: renamed from: lؔٛۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2753l {
    public static final C13618l admob;
    public static final C3281l amazon;
    public static final C8378l billing;
    public static final C3281l crashlytics;
    public static final C13618l isPro;
    public static final C16816l loadAd;
    public static final C13618l mopub;
    public static final C8378l purchase;
    public static final C13618l subs;
    public static final C16816l yandex;

    static {
        C1693l c1693l = C1693l.f4076l;
        C6932l c6932l = C6932l.crashlytics;
        C11534l c11534l = C11534l.f23194l;
        C17927l c17927l = C17927l.crashlytics;
        C5138l c5138l = C5138l.f11176l;
        try {
            C10038l c10038lLoadAd = C16816l.loadAd();
            c10038lLoadAd.m2857protected();
            c10038lLoadAd.m2868while(16);
            c10038lLoadAd.m2841const();
            c10038lLoadAd.f20465l = c5138l;
            yandex = c10038lLoadAd.m2862switch();
            try {
                C10038l c10038lLoadAd2 = C16816l.loadAd();
                c10038lLoadAd2.m2857protected();
                c10038lLoadAd2.m2868while(32);
                c10038lLoadAd2.m2841const();
                c10038lLoadAd2.f20465l = c5138l;
                loadAd = c10038lLoadAd2.m2862switch();
                try {
                    C12014l c12014lLoadAd = C3281l.loadAd();
                    c12014lLoadAd.m3299continue(16);
                    c12014lLoadAd.m3298class(16);
                    c12014lLoadAd.m3303interface();
                    c12014lLoadAd.f23943l = c17927l;
                    crashlytics = c12014lLoadAd.subs();
                    try {
                        C12014l c12014lLoadAd2 = C3281l.loadAd();
                        c12014lLoadAd2.m3299continue(16);
                        c12014lLoadAd2.m3298class(32);
                        c12014lLoadAd2.m3303interface();
                        c12014lLoadAd2.f23943l = c17927l;
                        amazon = c12014lLoadAd2.subs();
                        try {
                            C1424l c1424lLoadAd = C8378l.loadAd();
                            c1424lLoadAd.m933l(16);
                            c1424lLoadAd.m928l(32);
                            c1424lLoadAd.m930l(16);
                            c1424lLoadAd.m929l(16);
                            c1424lLoadAd.f3604l = c11534l;
                            c1424lLoadAd.f3606l = c6932l;
                            purchase = c1424lLoadAd.ad();
                            try {
                                C1424l c1424lLoadAd2 = C8378l.loadAd();
                                c1424lLoadAd2.m933l(32);
                                c1424lLoadAd2.m928l(32);
                                c1424lLoadAd2.m930l(32);
                                c1424lLoadAd2.m929l(16);
                                c1424lLoadAd2.f3604l = c11534l;
                                c1424lLoadAd2.f3606l = c6932l;
                                billing = c1424lLoadAd2.ad();
                                try {
                                    mopub = C13618l.loadAd(C1693l.f4071l, 12);
                                    try {
                                        admob = C13618l.loadAd(c1693l, 12);
                                        try {
                                            C13618l c13618lLoadAd = C13618l.loadAd(c1693l, 8);
                                            subs = c13618lLoadAd;
                                            isPro = c13618lLoadAd;
                                        } catch (Exception e) {
                                            C11467l.tapsense(e);
                                        }
                                    } catch (Exception e2) {
                                        C11467l.tapsense(e2);
                                    }
                                } catch (Exception e3) {
                                    C11467l.tapsense(e3);
                                }
                            } catch (Exception e4) {
                                C11467l.tapsense(e4);
                            }
                        } catch (Exception e5) {
                            C11467l.tapsense(e5);
                        }
                    } catch (Exception e6) {
                        C11467l.tapsense(e6);
                    }
                } catch (Exception e7) {
                    C11467l.tapsense(e7);
                }
            } catch (Exception e8) {
                C11467l.tapsense(e8);
            }
        } catch (Exception e9) {
            C11467l.tapsense(e9);
        }
    }
}
