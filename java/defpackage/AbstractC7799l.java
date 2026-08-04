package defpackage;

import java.math.BigInteger;
import java.util.HashMap;

/* JADX INFO: renamed from: lًؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7799l {
    public static final C15578l yandex = new C15578l(-1372775149, false, new C11813l(15));

    public static long amazon(String str) {
        long j;
        int length = str.length();
        long j2 = 0;
        if (length < 0) {
            C10754l.metrica(AbstractC12589l.premium(length, 0, "endIndex < beginIndex: ", " < "));
            return 0L;
        }
        if (length > str.length()) {
            C10754l.remoteconfig(str.length(), AbstractC2812l.Signature("endIndex > string.length: ", length, " > "));
            return 0L;
        }
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char cCharAt2 = i2 < length ? str.charAt(i2) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    public static Ccase crashlytics(C11327l c11327l, int i) {
        Object objPremium;
        byte[] bArr = c11327l.f36593l;
        if (bArr.length == i) {
            return c11327l;
        }
        if (AbstractC14907l.yandex(bArr)) {
            objPremium = null;
        } else {
            byte b = bArr[0];
            if (b == 48) {
                objPremium = Cclass.inmobi(bArr);
            } else if (b == 4) {
                objPremium = Cthrow.premium(bArr);
            } else if ((b & 255) == 128) {
                objPremium = (Cthrow) Cthrow.f36592l.m222l(Cfinal.inmobi(bArr), false);
            } else {
                objPremium = null;
            }
        }
        if (objPremium instanceof Cthrow) {
            return Cthrow.premium(objPremium);
        }
        return objPremium instanceof Cclass ? Cclass.inmobi(objPremium) : c11327l;
    }

    public static int loadAd(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (AbstractC5088l.vip(2, AbstractC5088l.subscription("CameraOrientationUtil"))) {
            StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            sbSubscription.append(z);
            sbSubscription.append(", result=");
            sbSubscription.append(i3);
            AbstractC5088l.yandex("CameraOrientationUtil", sbSubscription.toString());
        }
        return i3;
    }

    public static int purchase(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        C8339l.metrica(AbstractC0653l.vip(i, "Unsupported surface rotation: "));
        return 0;
    }

    public static AbstractC8831l yandex(C2756l c2756l) {
        C1658l c1658l;
        BigInteger bigIntegerAppmetrica;
        C6895l c6895l;
        BigInteger bigInteger;
        C7838l c7838l;
        C6895l c6895l2 = null;
        C12933l c12933l = null;
        cthrowPremium = null;
        Cthrow cthrowPremium = null;
        if (c2756l == null) {
            C8339l.metrica("keyInfo argument null");
            return null;
        }
        advert advertVar = c2756l.f5963l;
        Cthrow cthrow = c2756l.f5960l;
        C10198l c10198l = c2756l.f5961l;
        Cfor cfor = c10198l.f20787l;
        applovin applovinVar = c10198l.f20786l;
        if (cfor.ad(InterfaceC0543l.f1922throw) || cfor.ad(InterfaceC0543l.f1918static) || cfor.ad(InterfaceC18049l.f35345l)) {
            C15860l c15860lVip = C15860l.vip(c2756l.ads());
            return new C6554l(c15860lVip.f31123l, c15860lVip.f31120l, c15860lVip.f31127l, c15860lVip.f31126l, c15860lVip.f31129l, c15860lVip.f31121l, c15860lVip.f31122l, c15860lVip.f31128l, false);
        }
        if (cfor.ad(InterfaceC0543l.f1860abstract)) {
            C13061l c13061lVip = C13061l.vip(applovinVar);
            Cstrictfp cstrictfp = (Cstrictfp) c2756l.ads();
            BigInteger bigIntegerMetrica = c13061lVip.metrica();
            return new C12029l(cstrictfp.appmetrica(), new C2396l(bigIntegerMetrica != null ? bigIntegerMetrica.intValue() : 0, c13061lVip.f25574l.applovin(), c13061lVip.f25573l.applovin()));
        }
        if (cfor.ad(InterfaceC4502l.subs)) {
            C8414l c8414lVip = C8414l.vip(applovinVar);
            return new C1795l(((Cstrictfp) c2756l.ads()).appmetrica(), new C12425l(0, c8414lVip.f17421l.applovin(), c8414lVip.f17420l.applovin()));
        }
        if (cfor.ad(InterfaceC15427l.f30177l)) {
            Cstrictfp cstrictfp2 = (Cstrictfp) c2756l.ads();
            if (applovinVar != null) {
                C15281l c15281lVip = C15281l.vip(applovinVar.billing());
                c12933l = new C12933l(c15281lVip.f29883l.applovin(), c15281lVip.f29882l.applovin(), c15281lVip.f29881l.applovin());
            }
            return new C13649l(cstrictfp2.appmetrica(), c12933l);
        }
        if (cfor.ad(InterfaceC15427l.f30173l)) {
            C7154l c7154lVip = C7154l.vip(c2756l.ads());
            Ccase ccase = C7130l.vip(applovinVar.billing()).f14935l;
            if (ccase instanceof Cfor) {
                Cfor cforM192throws = Cfor.m192throws(ccase);
                AbstractC18276l abstractC18276l = (AbstractC18276l) AbstractC1624l.crashlytics.get(cforM192throws);
                C7100l c7100lAmazon = abstractC18276l != null ? abstractC18276l.amazon() : null;
                if (c7100lAmazon == null) {
                    c7100lAmazon = AbstractC17195l.admob(cforM192throws);
                }
                c7838l = new C2542l(cforM192throws, c7100lAmazon);
            } else {
                c7838l = new C7838l(C7100l.vip(ccase));
            }
            return new C8374l(c7154lVip.metrica(), c7838l);
        }
        if (cfor.ad(InterfaceC2716l.yandex)) {
            return 32 == cthrow.f36593l.length ? new C16244l(c2756l.metrica().f36593l) : new C16244l(Cthrow.premium(c2756l.ads()).f36593l);
        }
        if (cfor.ad(InterfaceC2716l.loadAd)) {
            return 56 == cthrow.f36593l.length ? new C16638l(c2756l.metrica().f36593l) : new C16638l(Cthrow.premium(c2756l.ads()).f36593l);
        }
        if (cfor.ad(InterfaceC2716l.crashlytics)) {
            return new C1438l(Cthrow.premium(c2756l.ads()).f36593l);
        }
        if (cfor.ad(InterfaceC2716l.amazon)) {
            return new C9298l(Cthrow.premium(c2756l.ads()).f36593l);
        }
        HashMap map = AbstractC14907l.amazon;
        if (map.containsKey(cfor)) {
            Ccase ccaseCrashlytics = crashlytics((C11327l) c2756l.metrica(), 32);
            C13812l c13812l = (C13812l) map.get(cfor);
            C4124l c4124lYandex = advertVar != null ? C9254l.yandex(c13812l, advertVar) : null;
            if (ccaseCrashlytics instanceof Cthrow) {
                return new C8729l(c13812l, ((Cthrow) ccaseCrashlytics).f36593l, c4124lYandex);
            }
            if (!(ccaseCrashlytics instanceof Cclass)) {
                C8339l.metrica(AbstractC0653l.ads(new StringBuilder("invalid "), c13812l.loadAd, " private key"));
                return null;
            }
            Cclass cclass = (Cclass) ccaseCrashlytics;
            byte[] bArr = Cthrow.premium(cclass.mo173throws(0)).f36593l;
            byte[] bArr2 = Cthrow.premium(cclass.mo173throws(1)).f36593l;
            C8729l c8729l = new C8729l(c13812l, bArr, c4124lYandex);
            if (AbstractC14024l.smaato(c8729l.getEncoded(), bArr2)) {
                return c8729l;
            }
            C8339l.metrica(AbstractC0653l.ads(new StringBuilder("inconsistent "), c13812l.loadAd, " private key"));
            return null;
        }
        if (cfor.ad(InterfaceC8134l.f16958l) || cfor.ad(InterfaceC8134l.f16977l) || cfor.ad(InterfaceC8134l.f16968l)) {
            Ccase ccaseCrashlytics2 = crashlytics((C11327l) c2756l.metrica(), 64);
            C18493l c18493l = (C18493l) AbstractC14907l.loadAd.get(cfor);
            if (advertVar != null) {
                try {
                    Ccase ccaseAdvert = Ccase.advert(advertVar.inmobi());
                    if (ccaseAdvert instanceof Cclass) {
                        Cclass cclassInmobi = Cclass.inmobi(ccaseAdvert);
                        c1658l = new C1658l(c18493l, Cthrow.premium(cclassInmobi.mo173throws(0)).f36593l, Cthrow.premium(cclassInmobi.mo173throws(1)).f36593l);
                    } else {
                        c1658l = new C1658l(c18493l, Cthrow.premium(ccaseAdvert).f36593l);
                    }
                } catch (Exception unused) {
                    c1658l = new C1658l(c18493l, advertVar.inmobi());
                }
            } else {
                c1658l = null;
            }
            if (ccaseCrashlytics2 instanceof Cthrow) {
                return new C10146l(c18493l, ((Cthrow) ccaseCrashlytics2).f36593l, c1658l);
            }
            if (!(ccaseCrashlytics2 instanceof Cclass)) {
                C8339l.metrica(AbstractC0653l.ads(new StringBuilder("invalid "), c18493l.f36123l, " private key"));
                return null;
            }
            Cclass cclass2 = (Cclass) ccaseCrashlytics2;
            byte[] bArr3 = Cthrow.premium(cclass2.mo173throws(0)).f36593l;
            byte[] bArr4 = Cthrow.premium(cclass2.mo173throws(1)).f36593l;
            C10146l c10146l = new C10146l(c18493l, bArr3, c1658l);
            if (AbstractC14024l.smaato(c10146l.getEncoded(), bArr4)) {
                return c10146l;
            }
            C8339l.metrica(AbstractC0653l.ads(new StringBuilder("inconsistent "), c18493l.f36123l, " private key"));
            return null;
        }
        HashMap map2 = AbstractC14907l.billing;
        if (map2.containsKey(cfor)) {
            C18097l c18097l = (C18097l) map2.get(cfor);
            Cthrow cthrowMetrica = c2756l.metrica();
            int iCrashlytics = c18097l.loadAd.crashlytics() * 4;
            byte[] bArr5 = cthrowMetrica.f36593l;
            if (bArr5.length != iCrashlytics) {
                if (!AbstractC14907l.yandex(bArr5) && bArr5[0] == 4) {
                    cthrowPremium = Cthrow.premium(bArr5);
                }
                if (cthrowPremium != null) {
                    cthrowMetrica = Cthrow.premium(cthrowPremium);
                }
            }
            return new C1180l(c18097l, cthrowMetrica.f36593l);
        }
        if (!cfor.ad(InterfaceC11987l.smaato) && !cfor.ad(InterfaceC18410l.billing) && !cfor.ad(InterfaceC18410l.purchase)) {
            C18073l.license("algorithm identifier in private key not recognised");
            return null;
        }
        C13777l c13777lVip = C13777l.vip(applovinVar);
        Ccase ccaseBilling = applovinVar.billing();
        if ((ccaseBilling instanceof Cclass) && (Cclass.inmobi(ccaseBilling).size() == 2 || Cclass.inmobi(ccaseBilling).size() == 3)) {
            Cfor cfor2 = c13777lVip.f26893l;
            c6895l = new C6895l(new C2542l(cfor2, AbstractC11696l.amazon(cfor2)), cfor2, c13777lVip.f26892l, c13777lVip.f26891l);
            int length = cthrow.f36593l.length;
            if (length == 32 || length == 64) {
                bigInteger = new BigInteger(1, AbstractC14024l.license(c2756l.metrica().f36593l));
            } else {
                Ccase ccaseAds = c2756l.ads();
                if (ccaseAds instanceof Cstrictfp) {
                    bigIntegerAppmetrica = Cstrictfp.premium(ccaseAds).applovin();
                } else {
                    bigInteger = new BigInteger(1, AbstractC14024l.license(Cthrow.premium(ccaseAds).f36593l));
                }
            }
            bigIntegerAppmetrica = bigInteger;
        } else {
            Ccase ccase2 = C7130l.vip(applovinVar).f14935l;
            if (ccase2 instanceof Cfor) {
                Cfor cforM192throws2 = Cfor.m192throws(ccase2);
                c6895l2 = new C6895l(new C2542l(cforM192throws2, AbstractC17195l.admob(cforM192throws2)), c13777lVip.f26893l, c13777lVip.f26892l, c13777lVip.f26891l);
            } else if (!(ccase2 instanceof Cvolatile)) {
                c6895l2 = new C6895l(new C2542l(cfor, C7100l.vip(ccase2)), c13777lVip.f26893l, c13777lVip.f26892l, c13777lVip.f26891l);
            }
            Ccase ccaseAds2 = c2756l.ads();
            bigIntegerAppmetrica = ccaseAds2 instanceof Cstrictfp ? Cstrictfp.premium(ccaseAds2).appmetrica() : C7154l.vip(ccaseAds2).metrica();
            c6895l = c6895l2;
        }
        return new C8374l(bigIntegerAppmetrica, new C6895l(c6895l, c13777lVip.f26893l, c13777lVip.f26892l, c13777lVip.f26891l));
    }
}
