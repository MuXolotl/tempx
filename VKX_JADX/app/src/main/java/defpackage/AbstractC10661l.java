package defpackage;

/* JADX INFO: renamed from: lَۢۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10661l {
    public static final C6023l crashlytics;
    public static final C0485l loadAd;
    public static final C0485l yandex;

    static {
        C10858l c10858l = C10858l.billing;
        C10858l c10858l2 = C10858l.amazon;
        C3179l c3179l = C3179l.f6837l;
        try {
            C10038l c10038lLoadAd = C0485l.loadAd();
            c10038lLoadAd.f20463l = 32;
            c10038lLoadAd.f20462l = 16;
            c10038lLoadAd.f20465l = c3179l;
            c10038lLoadAd.f20466l = c10858l2;
            yandex = c10038lLoadAd.m2842continue();
            try {
                C10038l c10038lLoadAd2 = C0485l.loadAd();
                c10038lLoadAd2.f20463l = 32;
                c10038lLoadAd2.f20462l = 16;
                c10038lLoadAd2.f20465l = C3179l.f6840l;
                c10038lLoadAd2.f20466l = c10858l2;
                c10038lLoadAd2.m2842continue();
                try {
                    C10038l c10038lLoadAd3 = C0485l.loadAd();
                    c10038lLoadAd3.f20463l = 32;
                    c10038lLoadAd3.f20462l = 32;
                    c10038lLoadAd3.f20465l = c3179l;
                    c10038lLoadAd3.f20466l = c10858l2;
                    c10038lLoadAd3.m2842continue();
                    try {
                        C10038l c10038lLoadAd4 = C0485l.loadAd();
                        c10038lLoadAd4.f20463l = 64;
                        c10038lLoadAd4.f20462l = 32;
                        c10038lLoadAd4.f20465l = c3179l;
                        c10038lLoadAd4.f20466l = c10858l;
                        c10038lLoadAd4.m2842continue();
                        try {
                            C10038l c10038lLoadAd5 = C0485l.loadAd();
                            c10038lLoadAd5.f20463l = 64;
                            c10038lLoadAd5.f20462l = 64;
                            c10038lLoadAd5.f20465l = c3179l;
                            c10038lLoadAd5.f20466l = c10858l;
                            loadAd = c10038lLoadAd5.m2842continue();
                            try {
                                C10111l c10111lLoadAd = C6023l.loadAd();
                                c10111lLoadAd.m2882private(32);
                                c10111lLoadAd.m2879extends(16);
                                c10111lLoadAd.f20589l = C1693l.f4068l;
                                crashlytics = c10111lLoadAd.loadAd();
                                try {
                                    C10111l c10111lLoadAd2 = C6023l.loadAd();
                                    c10111lLoadAd2.m2882private(32);
                                    c10111lLoadAd2.m2879extends(16);
                                    c10111lLoadAd2.f20589l = C1693l.f4075l;
                                    c10111lLoadAd2.loadAd();
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
    }
}
