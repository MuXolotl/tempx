package defpackage;

/* JADX INFO: renamed from: lۣ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18189l {
    public static final C18563l yandex;

    static {
        try {
            C0458l c0458lLoadAd = C18563l.loadAd();
            c0458lLoadAd.m550for(64);
            c0458lLoadAd.f1690l = C17162l.crashlytics;
            yandex = c0458lLoadAd.ads();
        } catch (Exception e) {
            C11467l.tapsense(e);
        }
    }
}
