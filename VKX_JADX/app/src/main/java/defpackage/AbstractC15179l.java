package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lٔۜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15179l {
    public static final C3797l admob;
    public static final C3797l mopub;
    public static final C3797l subs;
    public static final C4733l yandex = new C4733l(C11232l.class, new C18262l(25));
    public static final C8873l loadAd = new C8873l("type.googleapis.com/google.crypto.tink.HpkePrivateKey", new C18262l(26));
    public static final C5773l crashlytics = new C5773l(C4822l.class, new C18262l(27));
    public static final C9439l amazon = new C9439l("type.googleapis.com/google.crypto.tink.HpkePublicKey", new C18262l(28));
    public static final C5773l purchase = new C5773l(C11153l.class, new C18262l(29));
    public static final C9439l billing = new C9439l("type.googleapis.com/google.crypto.tink.HpkePrivateKey", new C11467l(0));

    static {
        C0458l c0458lPurchase = C3797l.purchase();
        c0458lPurchase.remoteconfig(EnumC4659l.DHKEM_P256_HKDF_SHA256, C15026l.amazon);
        c0458lPurchase.remoteconfig(EnumC4659l.DHKEM_P384_HKDF_SHA384, C15026l.purchase);
        c0458lPurchase.remoteconfig(EnumC4659l.DHKEM_P521_HKDF_SHA512, C15026l.billing);
        c0458lPurchase.remoteconfig(EnumC4659l.DHKEM_X25519_HKDF_SHA256, C15026l.mopub);
        c0458lPurchase.remoteconfig(EnumC4659l.X_WING, C15026l.admob);
        mopub = c0458lPurchase.isVip();
        C0458l c0458lPurchase2 = C3797l.purchase();
        c0458lPurchase2.remoteconfig(EnumC2477l.HKDF_SHA256, C6636l.amazon);
        c0458lPurchase2.remoteconfig(EnumC2477l.HKDF_SHA384, C6636l.purchase);
        c0458lPurchase2.remoteconfig(EnumC2477l.HKDF_SHA512, C6636l.billing);
        admob = c0458lPurchase2.isVip();
        C0458l c0458lPurchase3 = C3797l.purchase();
        c0458lPurchase3.remoteconfig(EnumC11952l.AES_128_GCM, C2204l.amazon);
        c0458lPurchase3.remoteconfig(EnumC11952l.AES_256_GCM, C2204l.purchase);
        c0458lPurchase3.remoteconfig(EnumC11952l.CHACHA20_POLY1305, C2204l.billing);
        subs = c0458lPurchase3.isVip();
    }

    public static C4826l amazon(C11232l c11232l) {
        C12989l c12989lM1618package = C4826l.m1618package();
        EnumC4659l enumC4659l = (EnumC4659l) mopub.m1425native(c11232l.yandex);
        c12989lM1618package.purchase();
        C4826l.premium((C4826l) c12989lM1618package.f19242l, enumC4659l);
        EnumC2477l enumC2477l = (EnumC2477l) admob.m1425native(c11232l.loadAd);
        c12989lM1618package.purchase();
        C4826l.signatures((C4826l) c12989lM1618package.f19242l, enumC2477l);
        EnumC11952l enumC11952l = (EnumC11952l) subs.m1425native(c11232l.crashlytics);
        c12989lM1618package.purchase();
        C4826l.isVip((C4826l) c12989lM1618package.f19242l, enumC11952l);
        return (C4826l) c12989lM1618package.yandex();
    }

    public static C9358l crashlytics(C9676l c9676l) {
        if (c9676l.equals(C9676l.f19755l)) {
            return C9358l.purchase;
        }
        if (c9676l == C9676l.f19754l) {
            return C9358l.crashlytics;
        }
        if (c9676l == C9676l.f19756l) {
            return C9358l.billing;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(c9676l)));
    }

    public static C11232l loadAd(C9358l c9358l, C4826l c4826l) {
        C9676l c9676l;
        C12014l c12014lLoadAd = C11232l.loadAd();
        if (c9358l.equals(C9358l.purchase)) {
            c9676l = C9676l.f19755l;
        } else if (c9358l == C9358l.crashlytics) {
            c9676l = C9676l.f19754l;
        } else {
            if (c9358l != C9358l.billing && c9358l != C9358l.amazon) {
                throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(c9358l)));
            }
            c9676l = C9676l.f19756l;
        }
        c12014lLoadAd.f23943l = c9676l;
        c12014lLoadAd.f23941l = (C15026l) mopub.signatures(c4826l.m1619throws());
        c12014lLoadAd.f23940l = (C6636l) admob.signatures(c4826l.inmobi());
        c12014lLoadAd.f23944l = (C2204l) subs.signatures(c4826l.applovin());
        return c12014lLoadAd.firebase();
    }

    public static C6833l purchase(C4822l c4822l) {
        C1488l c1488lM2075package = C6833l.m2075package();
        c1488lM2075package.purchase();
        C6833l.premium((C6833l) c1488lM2075package.f19242l);
        C4826l c4826lAmazon = amazon(c4822l.admob);
        c1488lM2075package.purchase();
        C6833l.isVip((C6833l) c1488lM2075package.f19242l, c4826lAmazon);
        byte[] bArrLoadAd = c4822l.subs.loadAd();
        C14809l c14809lMopub = AbstractC15257l.mopub(0, bArrLoadAd.length, bArrLoadAd);
        c1488lM2075package.purchase();
        C6833l.signatures((C6833l) c1488lM2075package.f19242l, c14809lMopub);
        return (C6833l) c1488lM2075package.yandex();
    }

    public static C0346l yandex(C15026l c15026l, byte[] bArr) throws GeneralSecurityException {
        int i;
        BigInteger bigIntegerLoadAd = AbstractC17185l.loadAd(bArr);
        byte[] bArr2 = AbstractC2383l.yandex;
        if (c15026l == C15026l.mopub) {
            i = 32;
        } else if (c15026l == C15026l.amazon) {
            i = 65;
        } else if (c15026l == C15026l.purchase) {
            i = 97;
        } else if (c15026l == C15026l.billing) {
            i = 133;
        } else {
            if (c15026l != C15026l.admob) {
                C18262l.ads("Unrecognized HPKE KEM identifier");
                return null;
            }
            i = 1216;
        }
        return C0346l.yandex(AbstractC17185l.mopub(i, bigIntegerLoadAd));
    }
}
