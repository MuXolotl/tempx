package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: renamed from: lٌّۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12801l {
    static {
        int i = C15820l.CONFIG_NAME_FIELD_NUMBER;
        try {
            yandex();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void yandex() {
        C16233l c16233l = C16233l.loadAd;
        c16233l.loadAd(C12107l.loadAd);
        c16233l.yandex(C12107l.crashlytics);
        AbstractC1269l.yandex();
        int i = AbstractC3869l.purchase;
        if (!AbstractC12589l.ad(i)) {
            C18262l.ads("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        C5535l c5535l = C5535l.loadAd;
        c5535l.billing(C9552l.loadAd);
        c5535l.purchase(C9552l.crashlytics);
        c5535l.amazon(C9552l.amazon);
        c5535l.crashlytics(C9552l.purchase);
        c16233l.yandex(AbstractC3869l.yandex);
        C16704l c16704l = C16704l.loadAd;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", AbstractC2753l.purchase);
        C1424l c1424lLoadAd = C8378l.loadAd();
        c1424lLoadAd.m933l(16);
        c1424lLoadAd.m928l(32);
        c1424lLoadAd.m930l(16);
        c1424lLoadAd.m929l(16);
        C11534l c11534l = C11534l.f23194l;
        c1424lLoadAd.f3604l = c11534l;
        C6932l c6932l = C6932l.purchase;
        c1424lLoadAd.f3606l = c6932l;
        map.put("AES128_CTR_HMAC_SHA256_RAW", c1424lLoadAd.ad());
        map.put("AES256_CTR_HMAC_SHA256", AbstractC2753l.billing);
        C1424l c1424lLoadAd2 = C8378l.loadAd();
        c1424lLoadAd2.m933l(32);
        c1424lLoadAd2.m928l(32);
        c1424lLoadAd2.m930l(32);
        c1424lLoadAd2.m929l(16);
        c1424lLoadAd2.f3604l = c11534l;
        c1424lLoadAd2.f3606l = c6932l;
        map.put("AES256_CTR_HMAC_SHA256_RAW", c1424lLoadAd2.ad());
        c16704l.loadAd(DesugarCollections.unmodifiableMap(map));
        C7974l c7974l = C7974l.loadAd;
        c7974l.yandex(AbstractC3869l.crashlytics, C8378l.class);
        C13002l c13002l = C13002l.loadAd;
        c13002l.yandex(AbstractC3869l.amazon, C8378l.class);
        C16365l c16365l = C16365l.amazon;
        c16365l.purchase(AbstractC3869l.loadAd, i, true);
        int i2 = AbstractC13348l.purchase;
        if (!AbstractC12589l.ad(i2)) {
            C18262l.ads("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        c5535l.billing(AbstractC6660l.f14007l);
        c5535l.purchase(AbstractC6660l.f14006l);
        c5535l.amazon(AbstractC6660l.f14003l);
        c5535l.crashlytics(AbstractC6660l.f14009l);
        c16233l.yandex(AbstractC13348l.yandex);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", AbstractC2753l.yandex);
        C10038l c10038lLoadAd = C16816l.loadAd();
        c10038lLoadAd.m2857protected();
        c10038lLoadAd.m2868while(16);
        c10038lLoadAd.m2841const();
        C5138l c5138l = C5138l.f11178l;
        c10038lLoadAd.f20465l = c5138l;
        map2.put("AES128_GCM_RAW", c10038lLoadAd.m2862switch());
        map2.put("AES256_GCM", AbstractC2753l.loadAd);
        C10038l c10038lLoadAd2 = C16816l.loadAd();
        c10038lLoadAd2.m2857protected();
        c10038lLoadAd2.m2868while(32);
        c10038lLoadAd2.m2841const();
        c10038lLoadAd2.f20465l = c5138l;
        map2.put("AES256_GCM_RAW", c10038lLoadAd2.m2862switch());
        c16704l.loadAd(DesugarCollections.unmodifiableMap(map2));
        c7974l.yandex(AbstractC13348l.crashlytics, C16816l.class);
        c13002l.yandex(AbstractC13348l.amazon, C16816l.class);
        c16365l.purchase(AbstractC13348l.loadAd, i2, true);
        if (AbstractC3534l.yandex()) {
            return;
        }
        C13911l c13911l = AbstractC5503l.yandex;
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Registering AES EAX is not supported in FIPS mode");
            return;
        }
        c5535l.billing(AbstractC16181l.yandex);
        c5535l.purchase(AbstractC16181l.loadAd);
        c5535l.amazon(AbstractC16181l.crashlytics);
        c5535l.crashlytics(AbstractC16181l.amazon);
        c16233l.yandex(AbstractC5503l.yandex);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", AbstractC2753l.crashlytics);
        C12014l c12014lLoadAd = C3281l.loadAd();
        c12014lLoadAd.m3299continue(16);
        c12014lLoadAd.m3298class(16);
        c12014lLoadAd.m3303interface();
        C17927l c17927l = C17927l.purchase;
        c12014lLoadAd.f23943l = c17927l;
        map3.put("AES128_EAX_RAW", c12014lLoadAd.subs());
        map3.put("AES256_EAX", AbstractC2753l.amazon);
        C12014l c12014lLoadAd2 = C3281l.loadAd();
        c12014lLoadAd2.m3299continue(16);
        c12014lLoadAd2.m3298class(32);
        c12014lLoadAd2.m3303interface();
        c12014lLoadAd2.f23943l = c17927l;
        map3.put("AES256_EAX_RAW", c12014lLoadAd2.subs());
        c16704l.loadAd(DesugarCollections.unmodifiableMap(map3));
        c13002l.yandex(AbstractC5503l.crashlytics, C3281l.class);
        c16365l.amazon(AbstractC5503l.loadAd, true);
        C13911l c13911l2 = AbstractC4837l.yandex;
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        c5535l.billing(AbstractC3105l.yandex);
        c5535l.purchase(AbstractC3105l.loadAd);
        c5535l.amazon(AbstractC3105l.crashlytics);
        c5535l.crashlytics(AbstractC3105l.amazon);
        HashMap map4 = new HashMap();
        C10023l c10023lLoadAd = C2385l.loadAd();
        c10023lLoadAd.m2830private(16);
        C16751l c16751l = C16751l.f32753l;
        c10023lLoadAd.f20418l = c16751l;
        map4.put("AES128_GCM_SIV", c10023lLoadAd.metrica());
        C10023l c10023lLoadAd2 = C2385l.loadAd();
        c10023lLoadAd2.m2830private(16);
        C16751l c16751l2 = C16751l.f32754l;
        c10023lLoadAd2.f20418l = c16751l2;
        map4.put("AES128_GCM_SIV_RAW", c10023lLoadAd2.metrica());
        C10023l c10023lLoadAd3 = C2385l.loadAd();
        c10023lLoadAd3.m2830private(32);
        c10023lLoadAd3.f20418l = c16751l;
        map4.put("AES256_GCM_SIV", c10023lLoadAd3.metrica());
        C10023l c10023lLoadAd4 = C2385l.loadAd();
        c10023lLoadAd4.m2830private(32);
        c10023lLoadAd4.f20418l = c16751l2;
        map4.put("AES256_GCM_SIV_RAW", c10023lLoadAd4.metrica());
        c16704l.loadAd(DesugarCollections.unmodifiableMap(map4));
        c7974l.yandex(AbstractC4837l.crashlytics, C2385l.class);
        c13002l.yandex(AbstractC4837l.loadAd, C2385l.class);
        c16233l.yandex(AbstractC4837l.yandex);
        c16365l.amazon(AbstractC4837l.amazon, true);
        C13911l c13911l3 = AbstractC0186l.yandex;
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Registering ChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        c5535l.billing(AbstractC8020l.yandex);
        c5535l.purchase(AbstractC8020l.loadAd);
        c5535l.amazon(AbstractC8020l.crashlytics);
        c5535l.crashlytics(AbstractC8020l.amazon);
        c16233l.yandex(AbstractC0186l.yandex);
        c13002l.yandex(AbstractC0186l.loadAd, C15840l.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new C15840l(C7396l.f15322l));
        map5.put("CHACHA20_POLY1305_RAW", new C15840l(C7396l.f15323l));
        c16704l.loadAd(DesugarCollections.unmodifiableMap(map5));
        c16365l.amazon(AbstractC0186l.crashlytics, true);
        C13911l c13911l4 = AbstractC1205l.yandex;
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Registering KMS AEAD is not supported in FIPS mode");
            return;
        }
        c5535l.billing(AbstractC16655l.yandex);
        c5535l.purchase(AbstractC16655l.loadAd);
        c5535l.amazon(AbstractC16655l.crashlytics);
        c5535l.crashlytics(AbstractC16655l.amazon);
        c16233l.yandex(AbstractC1205l.yandex);
        c13002l.yandex(AbstractC1205l.crashlytics, C10257l.class);
        c16365l.amazon(AbstractC1205l.loadAd, true);
        C7912l c7912l = AbstractC5560l.yandex;
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Registering KMS Envelope AEAD is not supported in FIPS mode");
            return;
        }
        c5535l.billing(AbstractC12832l.yandex);
        c5535l.purchase(AbstractC12832l.loadAd);
        c5535l.amazon(AbstractC12832l.crashlytics);
        c5535l.crashlytics(AbstractC12832l.amazon);
        c13002l.yandex(AbstractC5560l.loadAd, C6762l.class);
        c16233l.yandex(AbstractC5560l.crashlytics);
        c16365l.amazon(AbstractC5560l.yandex, true);
        C13911l c13911l5 = AbstractC17037l.yandex;
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Registering XChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        c5535l.billing(AbstractC8532l.loadAd);
        c5535l.purchase(AbstractC8532l.crashlytics);
        c5535l.amazon(AbstractC8532l.amazon);
        c5535l.crashlytics(AbstractC8532l.purchase);
        c16233l.yandex(AbstractC17037l.yandex);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new C10441l(C11534l.f23193l));
        map6.put("XCHACHA20_POLY1305_RAW", new C10441l(C11534l.f23196l));
        c16704l.loadAd(DesugarCollections.unmodifiableMap(map6));
        c13002l.yandex(AbstractC17037l.amazon, C10441l.class);
        c7974l.yandex(AbstractC17037l.crashlytics, C10441l.class);
        c16365l.amazon(AbstractC17037l.loadAd, true);
        c5535l.billing(AbstractC3308l.loadAd);
        c5535l.purchase(AbstractC3308l.crashlytics);
        c5535l.amazon(AbstractC3308l.amazon);
        c5535l.crashlytics(AbstractC3308l.purchase);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", AbstractC2753l.mopub);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", AbstractC2753l.admob);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", AbstractC2753l.subs);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", AbstractC2753l.isPro);
        c16704l.loadAd(DesugarCollections.unmodifiableMap(map7));
        c16233l.yandex(AbstractC7741l.loadAd);
        c13002l.yandex(AbstractC7741l.yandex, C13618l.class);
    }
}
