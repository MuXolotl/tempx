package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: renamed from: lؒۗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1269l {
    static {
        int i = C15820l.CONFIG_NAME_FIELD_NUMBER;
        try {
            yandex();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void yandex() throws GeneralSecurityException {
        C16233l c16233l = C16233l.loadAd;
        c16233l.loadAd(C12107l.firebase);
        c16233l.yandex(C12107l.smaato);
        c16233l.loadAd(C12107l.amazon);
        int i = AbstractC7126l.billing;
        if (!AbstractC12589l.ad(i)) {
            C18262l.ads("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        C3797l c3797l = AbstractC12651l.yandex;
        C5535l c5535l = C5535l.loadAd;
        c5535l.billing(AbstractC12651l.loadAd);
        c5535l.purchase(AbstractC12651l.crashlytics);
        c5535l.amazon(AbstractC12651l.amazon);
        c5535l.crashlytics(AbstractC12651l.purchase);
        c16233l.yandex(AbstractC7126l.yandex);
        c16233l.yandex(AbstractC7126l.loadAd);
        C16704l c16704l = C16704l.loadAd;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", AbstractC10661l.yandex);
        C10038l c10038lLoadAd = C0485l.loadAd();
        c10038lLoadAd.f20463l = 32;
        c10038lLoadAd.f20462l = 16;
        C3179l c3179l = C3179l.f6840l;
        c10038lLoadAd.f20465l = c3179l;
        C10858l c10858l = C10858l.amazon;
        c10038lLoadAd.f20466l = c10858l;
        map.put("HMAC_SHA256_128BITTAG_RAW", c10038lLoadAd.m2842continue());
        C10038l c10038lLoadAd2 = C0485l.loadAd();
        c10038lLoadAd2.f20463l = 32;
        c10038lLoadAd2.f20462l = 32;
        C3179l c3179l2 = C3179l.f6837l;
        c10038lLoadAd2.f20465l = c3179l2;
        c10038lLoadAd2.f20466l = c10858l;
        map.put("HMAC_SHA256_256BITTAG", c10038lLoadAd2.m2842continue());
        C10038l c10038lLoadAd3 = C0485l.loadAd();
        c10038lLoadAd3.f20463l = 32;
        c10038lLoadAd3.f20462l = 32;
        c10038lLoadAd3.f20465l = c3179l;
        c10038lLoadAd3.f20466l = c10858l;
        map.put("HMAC_SHA256_256BITTAG_RAW", c10038lLoadAd3.m2842continue());
        C10038l c10038lLoadAd4 = C0485l.loadAd();
        c10038lLoadAd4.f20463l = 64;
        c10038lLoadAd4.f20462l = 16;
        c10038lLoadAd4.f20465l = c3179l2;
        C10858l c10858l2 = C10858l.billing;
        c10038lLoadAd4.f20466l = c10858l2;
        map.put("HMAC_SHA512_128BITTAG", c10038lLoadAd4.m2842continue());
        C10038l c10038lLoadAd5 = C0485l.loadAd();
        c10038lLoadAd5.f20463l = 64;
        c10038lLoadAd5.f20462l = 16;
        c10038lLoadAd5.f20465l = c3179l;
        c10038lLoadAd5.f20466l = c10858l2;
        map.put("HMAC_SHA512_128BITTAG_RAW", c10038lLoadAd5.m2842continue());
        C10038l c10038lLoadAd6 = C0485l.loadAd();
        c10038lLoadAd6.f20463l = 64;
        c10038lLoadAd6.f20462l = 32;
        c10038lLoadAd6.f20465l = c3179l2;
        c10038lLoadAd6.f20466l = c10858l2;
        map.put("HMAC_SHA512_256BITTAG", c10038lLoadAd6.m2842continue());
        C10038l c10038lLoadAd7 = C0485l.loadAd();
        c10038lLoadAd7.f20463l = 64;
        c10038lLoadAd7.f20462l = 32;
        c10038lLoadAd7.f20465l = c3179l;
        c10038lLoadAd7.f20466l = c10858l2;
        map.put("HMAC_SHA512_256BITTAG_RAW", c10038lLoadAd7.m2842continue());
        map.put("HMAC_SHA512_512BITTAG", AbstractC10661l.loadAd);
        C10038l c10038lLoadAd8 = C0485l.loadAd();
        c10038lLoadAd8.f20463l = 64;
        c10038lLoadAd8.f20462l = 64;
        c10038lLoadAd8.f20465l = c3179l;
        c10038lLoadAd8.f20466l = c10858l2;
        map.put("HMAC_SHA512_512BITTAG_RAW", c10038lLoadAd8.m2842continue());
        c16704l.loadAd(DesugarCollections.unmodifiableMap(map));
        C13002l c13002l = C13002l.loadAd;
        c13002l.yandex(AbstractC7126l.purchase, C0485l.class);
        C7974l.loadAd.yandex(AbstractC7126l.amazon, C0485l.class);
        C16365l c16365l = C16365l.amazon;
        c16365l.purchase(AbstractC7126l.crashlytics, i, true);
        if (AbstractC3534l.yandex()) {
            return;
        }
        C0882l c0882l = AbstractC1236l.yandex;
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Registering AES CMAC is not supported in FIPS mode");
            return;
        }
        c5535l.billing(AbstractC3483l.yandex);
        c5535l.purchase(AbstractC3483l.loadAd);
        c5535l.amazon(AbstractC3483l.crashlytics);
        c5535l.crashlytics(AbstractC3483l.amazon);
        c13002l.yandex(AbstractC1236l.yandex, C6023l.class);
        c16233l.yandex(AbstractC1236l.loadAd);
        c16233l.yandex(AbstractC1236l.crashlytics);
        HashMap map2 = new HashMap();
        C6023l c6023l = AbstractC10661l.crashlytics;
        map2.put("AES_CMAC", c6023l);
        map2.put("AES256_CMAC", c6023l);
        C10111l c10111lLoadAd = C6023l.loadAd();
        c10111lLoadAd.m2882private(32);
        c10111lLoadAd.m2879extends(16);
        c10111lLoadAd.f20589l = C1693l.f4075l;
        map2.put("AES256_CMAC_RAW", c10111lLoadAd.loadAd());
        c16704l.loadAd(DesugarCollections.unmodifiableMap(map2));
        c16365l.amazon(AbstractC1236l.amazon, true);
    }
}
