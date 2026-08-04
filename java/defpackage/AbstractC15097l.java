package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: renamed from: lٕٔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15097l {
    public static final C3797l admob;
    public static final C3797l mopub;
    public static final C3797l subs;
    public static final C4733l yandex = new C4733l(C5416l.class, new C17132l(20));
    public static final C8873l loadAd = new C8873l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new C17132l(21));
    public static final C5773l crashlytics = new C5773l(C5454l.class, new C17132l(22));
    public static final C9439l amazon = new C9439l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new C17132l(23));
    public static final C5773l purchase = new C5773l(C5523l.class, new C17132l(24));
    public static final C9439l billing = new C9439l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new C17132l(25));

    static {
        C0458l c0458lPurchase = C3797l.purchase();
        c0458lPurchase.remoteconfig(EnumC7004l.SHA1, C13114l.loadAd);
        c0458lPurchase.remoteconfig(EnumC7004l.SHA224, C13114l.crashlytics);
        c0458lPurchase.remoteconfig(EnumC7004l.SHA256, C13114l.amazon);
        c0458lPurchase.remoteconfig(EnumC7004l.SHA384, C13114l.purchase);
        c0458lPurchase.remoteconfig(EnumC7004l.SHA512, C13114l.billing);
        mopub = c0458lPurchase.isVip();
        C0458l c0458lPurchase2 = C3797l.purchase();
        c0458lPurchase2.remoteconfig(EnumC2916l.NIST_P256, C15059l.loadAd);
        c0458lPurchase2.remoteconfig(EnumC2916l.NIST_P384, C15059l.crashlytics);
        c0458lPurchase2.remoteconfig(EnumC2916l.NIST_P521, C15059l.amazon);
        c0458lPurchase2.remoteconfig(EnumC2916l.CURVE25519, C15059l.purchase);
        admob = c0458lPurchase2.isVip();
        C0458l c0458lPurchase3 = C3797l.purchase();
        c0458lPurchase3.remoteconfig(EnumC13513l.UNCOMPRESSED, C12247l.crashlytics);
        c0458lPurchase3.remoteconfig(EnumC13513l.COMPRESSED, C12247l.loadAd);
        c0458lPurchase3.remoteconfig(EnumC13513l.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, C12247l.amazon);
        subs = c0458lPurchase3.isVip();
    }

    public static C9493l amazon(C5416l c5416l) {
        C12915l c12915lM854package = C1244l.m854package();
        EnumC2916l enumC2916l = (EnumC2916l) admob.m1425native(c5416l.yandex);
        c12915lM854package.purchase();
        C1244l.isVip((C1244l) c12915lM854package.f19242l, enumC2916l);
        EnumC7004l enumC7004l = (EnumC7004l) mopub.m1425native(c5416l.loadAd);
        c12915lM854package.purchase();
        C1244l.signatures((C1244l) c12915lM854package.f19242l, enumC7004l);
        C0346l c0346l = c5416l.billing;
        if (c0346l != null && c0346l.yandex.length > 0) {
            byte[] bArrLoadAd = c0346l.loadAd();
            C14809l c14809lMopub = AbstractC15257l.mopub(0, bArrLoadAd.length, bArrLoadAd);
            c12915lM854package.purchase();
            C1244l.premium((C1244l) c12915lM854package.f19242l, c14809lMopub);
        }
        C1244l c1244l = (C1244l) c12915lM854package.yandex();
        try {
            C13608l c13608lM3651strictfp = C13608l.m3651strictfp(AbstractC2130l.mopub(c5416l.purchase), C7597l.yandex());
            C5982l c5982lApplovin = C2619l.applovin();
            C5001l c5001lM3650package = C13608l.m3650package();
            c5001lM3650package.subs(c13608lM3651strictfp.inmobi());
            c5001lM3650package.admob(EnumC9483l.TINK);
            c5001lM3650package.isPro(c13608lM3651strictfp.m3653throws());
            C13608l c13608l = (C13608l) c5001lM3650package.yandex();
            c5982lApplovin.purchase();
            C2619l.isVip((C2619l) c5982lApplovin.f19242l, c13608l);
            C2619l c2619l = (C2619l) c5982lApplovin.yandex();
            C12247l c12247l = c5416l.crashlytics;
            if (c12247l == null) {
                c12247l = C12247l.loadAd;
            }
            C3598l c3598lM2664package = C9493l.m2664package();
            c3598lM2664package.purchase();
            C9493l.premium((C9493l) c3598lM2664package.f19242l, c1244l);
            c3598lM2664package.purchase();
            C9493l.isVip((C9493l) c3598lM2664package.f19242l, c2619l);
            EnumC13513l enumC13513l = (EnumC13513l) subs.m1425native(c12247l);
            c3598lM2664package.purchase();
            C9493l.signatures((C9493l) c3598lM2664package.f19242l, enumC13513l);
            return (C9493l) c3598lM2664package.yandex();
        } catch (C2297l e) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    public static C9358l crashlytics(C10828l c10828l) {
        if (c10828l.equals(C10828l.f21887l)) {
            return C9358l.purchase;
        }
        if (c10828l == C10828l.f21886l) {
            return C9358l.crashlytics;
        }
        if (c10828l == C10828l.f21888l) {
            return C9358l.billing;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(c10828l)));
    }

    public static int loadAd(C15059l c15059l) throws GeneralSecurityException {
        if (C15059l.loadAd == c15059l) {
            return 33;
        }
        if (C15059l.crashlytics == c15059l) {
            return 49;
        }
        if (C15059l.amazon == c15059l) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(String.valueOf(c15059l)));
    }

    public static C0413l purchase(C5454l c5454l) {
        C5416l c5416l = c5454l.admob;
        if (c5416l.yandex.equals(C15059l.purchase)) {
            C6508l c6508lM515strictfp = C0413l.m515strictfp();
            c6508lM515strictfp.purchase();
            C0413l.signatures((C0413l) c6508lM515strictfp.f19242l);
            C9493l c9493lAmazon = amazon(c5416l);
            c6508lM515strictfp.purchase();
            C0413l.isVip((C0413l) c6508lM515strictfp.f19242l, c9493lAmazon);
            byte[] bArrLoadAd = c5454l.isPro.loadAd();
            C14809l c14809lMopub = AbstractC15257l.mopub(0, bArrLoadAd.length, bArrLoadAd);
            c6508lM515strictfp.purchase();
            C0413l.premium((C0413l) c6508lM515strictfp.f19242l, c14809lMopub);
            C14809l c14809l = AbstractC15257l.f29847l;
            c6508lM515strictfp.purchase();
            C0413l.applovin((C0413l) c6508lM515strictfp.f19242l, c14809l);
            return (C0413l) c6508lM515strictfp.yandex();
        }
        int iLoadAd = loadAd(c5416l.yandex);
        ECPoint eCPoint = c5454l.subs;
        if (eCPoint == null) {
            C18262l.ads("NistCurvePoint was null for NIST curve");
            return null;
        }
        C6508l c6508lM515strictfp2 = C0413l.m515strictfp();
        c6508lM515strictfp2.purchase();
        C0413l.signatures((C0413l) c6508lM515strictfp2.f19242l);
        C9493l c9493lAmazon2 = amazon(c5416l);
        c6508lM515strictfp2.purchase();
        C0413l.isVip((C0413l) c6508lM515strictfp2.f19242l, c9493lAmazon2);
        byte[] bArrMopub = AbstractC17185l.mopub(iLoadAd, eCPoint.getAffineX());
        C14809l c14809lMopub2 = AbstractC15257l.mopub(0, bArrMopub.length, bArrMopub);
        c6508lM515strictfp2.purchase();
        C0413l.premium((C0413l) c6508lM515strictfp2.f19242l, c14809lMopub2);
        byte[] bArrMopub2 = AbstractC17185l.mopub(iLoadAd, eCPoint.getAffineY());
        C14809l c14809lMopub3 = AbstractC15257l.mopub(0, bArrMopub2.length, bArrMopub2);
        c6508lM515strictfp2.purchase();
        C0413l.applovin((C0413l) c6508lM515strictfp2.f19242l, c14809lMopub3);
        return (C0413l) c6508lM515strictfp2.yandex();
    }

    public static C5416l yandex(C9358l c9358l, C9493l c9493l) {
        C10828l c10828l;
        C5001l c5001lM3650package = C13608l.m3650package();
        c5001lM3650package.subs(c9493l.appmetrica().signatures().inmobi());
        c5001lM3650package.admob(EnumC9483l.RAW);
        c5001lM3650package.isPro(c9493l.appmetrica().signatures().m3653throws());
        C13608l c13608l = (C13608l) c5001lM3650package.yandex();
        C1424l c1424lLoadAd = C5416l.loadAd();
        if (c9358l.equals(C9358l.purchase)) {
            c10828l = C10828l.f21887l;
        } else if (c9358l == C9358l.crashlytics) {
            c10828l = C10828l.f21886l;
        } else {
            if (c9358l != C9358l.billing && c9358l != C9358l.amazon) {
                throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(c9358l)));
            }
            c10828l = C10828l.f21888l;
        }
        c1424lLoadAd.f3604l = c10828l;
        c1424lLoadAd.f3603l = (C15059l) admob.signatures(c9493l.m2665throws().applovin());
        c1424lLoadAd.f3602l = (C13114l) mopub.signatures(c9493l.m2665throws().inmobi());
        c1424lLoadAd.m938l(AbstractC2130l.billing(c13608l.purchase()));
        C0346l c0346lYandex = C0346l.yandex(c9493l.m2665throws().m855throws().firebase());
        if (c0346lYandex.yandex.length == 0) {
            c1424lLoadAd.f3606l = null;
        } else {
            c1424lLoadAd.f3606l = c0346lYandex;
        }
        if (!c9493l.m2665throws().applovin().equals(EnumC2916l.CURVE25519)) {
            c1424lLoadAd.f3601l = (C12247l) subs.signatures(c9493l.inmobi());
        } else if (!c9493l.inmobi().equals(EnumC13513l.COMPRESSED)) {
            C18262l.ads("For CURVE25519 EcPointFormat must be compressed");
            return null;
        }
        return c1424lLoadAd.advert();
    }
}
