package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: renamed from: lٌؙّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12472l {
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
        c16233l.loadAd(C12107l.purchase);
        c16233l.yandex(C12107l.billing);
        if (AbstractC3534l.yandex()) {
            return;
        }
        C13911l c13911l = AbstractC2544l.yandex;
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Registering AES SIV is not supported in FIPS mode");
            return;
        }
        C4733l c4733l = AbstractC13234l.yandex;
        C5535l c5535l = C5535l.loadAd;
        c5535l.billing(AbstractC13234l.yandex);
        c5535l.purchase(AbstractC13234l.loadAd);
        c5535l.amazon(AbstractC13234l.crashlytics);
        c5535l.crashlytics(AbstractC13234l.amazon);
        c16233l.yandex(AbstractC2544l.yandex);
        C16704l c16704l = C16704l.loadAd;
        HashMap map = new HashMap();
        map.put("AES256_SIV", AbstractC18189l.yandex);
        C0458l c0458lLoadAd = C18563l.loadAd();
        c0458lLoadAd.m550for(64);
        c0458lLoadAd.f1690l = C17162l.purchase;
        map.put("AES256_SIV_RAW", c0458lLoadAd.ads());
        c16704l.loadAd(DesugarCollections.unmodifiableMap(map));
        C7974l.loadAd.yandex(AbstractC2544l.crashlytics, C18563l.class);
        C13002l.loadAd.yandex(AbstractC2544l.amazon, C18563l.class);
        C16365l.amazon.amazon(AbstractC2544l.loadAd, true);
    }
}
