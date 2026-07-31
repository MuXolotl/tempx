package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC0317l;
import defpackage.AbstractC11696l;
import defpackage.AbstractC11918l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC1624l;
import defpackage.AbstractC18276l;
import defpackage.AbstractC5730l;
import defpackage.AbstractC6569l;
import defpackage.AbstractC6662l;
import defpackage.AbstractC6974l;
import defpackage.AbstractC7016l;
import defpackage.AbstractC8660l;
import defpackage.AbstractC8859l;
import defpackage.AbstractC9008l;
import defpackage.C10044l;
import defpackage.C10825l;
import defpackage.C12726l;
import defpackage.C13777l;
import defpackage.C16217l;
import defpackage.C17209l;
import defpackage.C5277l;
import defpackage.C6304l;
import defpackage.C7100l;
import defpackage.C7130l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cvolatile;
import defpackage.InterfaceC3340l;
import defpackage.tapsense;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class EC5Util {

    public static class CustomCurves {
        private static Map CURVE_MAP = createCurveMap();

        private CustomCurves() {
        }

        private static Map createCurveMap() {
            HashMap map = new HashMap();
            Enumeration enumerationElements = AbstractC1624l.purchase.elements();
            while (enumerationElements.hasMoreElements()) {
                String str = (String) enumerationElements.nextElement();
                Cfor cfor = (Cfor) AbstractC5730l.yandex.get(AbstractC9008l.amazon(str));
                AbstractC18276l abstractC18276l = null;
                AbstractC18276l abstractC18276l2 = cfor == null ? null : (AbstractC18276l) AbstractC5730l.loadAd.get(cfor);
                if (abstractC18276l2 == null) {
                    Cfor cfor2 = (Cfor) AbstractC6569l.yandex.get(AbstractC9008l.amazon(str));
                    abstractC18276l2 = cfor2 == null ? null : (AbstractC18276l) AbstractC6569l.loadAd.get(cfor2);
                }
                if (abstractC18276l2 == null) {
                    Cfor cfor3 = (Cfor) AbstractC6662l.yandex.get(AbstractC9008l.mopub(str));
                    abstractC18276l2 = cfor3 != null ? (AbstractC18276l) AbstractC6569l.loadAd.get(cfor3) : null;
                }
                if (abstractC18276l2 == null) {
                    Cfor cfor4 = (Cfor) AbstractC0317l.yandex.get(AbstractC9008l.amazon(str));
                    abstractC18276l2 = cfor4 == null ? null : (AbstractC18276l) AbstractC0317l.loadAd.get(cfor4);
                }
                if (abstractC18276l2 == null) {
                    Cfor cfor5 = (Cfor) tapsense.yandex.get(AbstractC9008l.amazon(str));
                    abstractC18276l2 = cfor5 == null ? null : (AbstractC18276l) tapsense.loadAd.get(cfor5);
                }
                if (abstractC18276l2 == null) {
                    Cfor cforBilling = AbstractC11696l.billing(str);
                    abstractC18276l2 = cforBilling == null ? null : (AbstractC18276l) AbstractC11696l.loadAd.get(cforBilling);
                }
                if (abstractC18276l2 == null) {
                    Cfor cfor6 = (Cfor) AbstractC8660l.yandex.get(AbstractC9008l.amazon(str));
                    if (cfor6 != null) {
                        abstractC18276l = (AbstractC18276l) AbstractC8660l.loadAd.get(cfor6);
                    }
                } else {
                    abstractC18276l = abstractC18276l2;
                }
                if (abstractC18276l != null) {
                    AbstractC11918l abstractC11918lCrashlytics = abstractC18276l.crashlytics();
                    if (AbstractC6974l.firebase(abstractC11918lCrashlytics.yandex)) {
                        map.put(abstractC11918lCrashlytics, AbstractC1624l.purchase(str).crashlytics());
                    }
                }
            }
            AbstractC11918l abstractC11918lCrashlytics2 = AbstractC1624l.purchase("Curve25519").crashlytics();
            map.put(new C5277l(abstractC11918lCrashlytics2.yandex.loadAd(), abstractC11918lCrashlytics2.loadAd.signatures(), abstractC11918lCrashlytics2.crashlytics.signatures(), abstractC11918lCrashlytics2.amazon, abstractC11918lCrashlytics2.purchase, true), abstractC11918lCrashlytics2);
            return map;
        }

        public static AbstractC11918l substitute(AbstractC11918l abstractC11918l) {
            AbstractC11918l abstractC11918l2 = (AbstractC11918l) CURVE_MAP.get(abstractC11918l);
            return abstractC11918l2 != null ? abstractC11918l2 : abstractC11918l;
        }
    }

    public static AbstractC11918l convertCurve(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            return CustomCurves.substitute(new C5277l(((ECFieldFp) field).getP(), a, b, null, null, false));
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] iArrConvertMidTerms = ECUtil.convertMidTerms(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new C6304l(m, iArrConvertMidTerms[0], iArrConvertMidTerms[1], iArrConvertMidTerms[2], a, b, null, null);
    }

    public static ECField convertField(InterfaceC3340l interfaceC3340l) {
        if (AbstractC6974l.firebase(interfaceC3340l)) {
            return new ECFieldFp(interfaceC3340l.loadAd());
        }
        int[] iArr = ((C10044l) interfaceC3340l).loadAd.yandex;
        int[] iArrAmazon = AbstractC14024l.amazon(iArr);
        int[] iArrMetrica = AbstractC14024l.metrica(1, iArrAmazon.length - 1, iArrAmazon);
        int length = iArrMetrica.length - 1;
        for (int i = 0; i < length; i++) {
            int i2 = iArrMetrica[i];
            iArrMetrica[i] = iArrMetrica[length];
            iArrMetrica[length] = i2;
            length--;
        }
        return new ECFieldF2m(iArr[iArr.length - 1], iArrMetrica);
    }

    public static ECPoint convertPoint(AbstractC8859l abstractC8859l) {
        AbstractC8859l abstractC8859lStartapp = abstractC8859l.startapp();
        abstractC8859lStartapp.loadAd();
        return new ECPoint(abstractC8859lStartapp.loadAd.signatures(), abstractC8859lStartapp.purchase().signatures());
    }

    public static C12726l convertSpec(ECParameterSpec eCParameterSpec) {
        AbstractC11918l abstractC11918lConvertCurve = convertCurve(eCParameterSpec.getCurve());
        AbstractC8859l abstractC8859lConvertPoint = convertPoint(abstractC11918lConvertCurve, eCParameterSpec.getGenerator());
        BigInteger order = eCParameterSpec.getOrder();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(eCParameterSpec.getCofactor());
        byte[] seed = eCParameterSpec.getCurve().getSeed();
        return eCParameterSpec instanceof C10825l ? new C17209l(((C10825l) eCParameterSpec).f21882l, abstractC11918lConvertCurve, abstractC8859lConvertPoint, order, bigIntegerValueOf, seed) : new C12726l(abstractC11918lConvertCurve, abstractC8859lConvertPoint, order, bigIntegerValueOf, seed);
    }

    public static ECParameterSpec convertToSpec(C7130l c7130l, AbstractC11918l abstractC11918l) {
        Ccase ccase = c7130l.f14935l;
        if (ccase instanceof Cfor) {
            Cfor cfor = (Cfor) ccase;
            C7100l namedCurveByOid = ECUtil.getNamedCurveByOid(cfor);
            if (namedCurveByOid == null) {
                Map additionalECParameters = BouncyCastleProvider.CONFIGURATION.getAdditionalECParameters();
                if (!additionalECParameters.isEmpty()) {
                    namedCurveByOid = (C7100l) additionalECParameters.get(cfor);
                }
            }
            return new C10825l(ECUtil.getCurveName(cfor), convertCurve(abstractC11918l, namedCurveByOid.metrica()), convertPoint(namedCurveByOid.f14870l.vip()), namedCurveByOid.f14874l, namedCurveByOid.f14873l);
        }
        if (ccase instanceof Cvolatile) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(ccase);
        if (cclassInmobi.size() <= 3) {
            C13777l c13777lVip = C13777l.vip(cclassInmobi);
            C17209l c17209lLoadAd = AbstractC7016l.loadAd(AbstractC11696l.purchase(c13777lVip.f26893l));
            return new C10825l(AbstractC11696l.purchase(c13777lVip.f26893l), convertCurve(c17209lLoadAd.f25097l, c17209lLoadAd.f25096l), convertPoint(c17209lLoadAd.f25095l), c17209lLoadAd.f25099l, c17209lLoadAd.f25098l);
        }
        C7100l c7100lVip = C7100l.vip(cclassInmobi);
        byte[] bArrMetrica = c7100lVip.metrica();
        BigInteger bigInteger = c7100lVip.f14874l;
        C16217l c16217l = c7100lVip.f14870l;
        BigInteger bigInteger2 = c7100lVip.f14873l;
        EllipticCurve ellipticCurveConvertCurve = convertCurve(abstractC11918l, bArrMetrica);
        return bigInteger2 != null ? new ECParameterSpec(ellipticCurveConvertCurve, convertPoint(c16217l.vip()), bigInteger, bigInteger2.intValue()) : new ECParameterSpec(ellipticCurveConvertCurve, convertPoint(c16217l.vip()), bigInteger, 1);
    }

    public static AbstractC11918l getCurve(ProviderConfiguration providerConfiguration, C7130l c7130l) {
        String str;
        Set acceptableNamedCurves = providerConfiguration.getAcceptableNamedCurves();
        Ccase ccase = c7130l.f14935l;
        if (ccase instanceof Cfor) {
            Cfor cforM192throws = Cfor.m192throws(ccase);
            if (acceptableNamedCurves.isEmpty() || acceptableNamedCurves.contains(cforM192throws)) {
                C7100l namedCurveByOid = ECUtil.getNamedCurveByOid(cforM192throws);
                if (namedCurveByOid == null) {
                    namedCurveByOid = (C7100l) providerConfiguration.getAdditionalECParameters().get(cforM192throws);
                }
                return namedCurveByOid.f14871l.f6465l;
            }
            str = "named curve not acceptable";
        } else {
            if (ccase instanceof Cvolatile) {
                return providerConfiguration.getEcImplicitlyCa().f25097l;
            }
            Cclass cclassInmobi = Cclass.inmobi(ccase);
            if (acceptableNamedCurves.isEmpty()) {
                return cclassInmobi.size() > 3 ? C7100l.vip(cclassInmobi).f14871l.f6465l : AbstractC11696l.amazon(Cfor.m192throws(cclassInmobi.mo173throws(0))).f14871l.f6465l;
            }
            str = "encoded parameters not acceptable";
        }
        C8339l.smaato(str);
        return null;
    }

    public static C7838l getDomainParameters(ProviderConfiguration providerConfiguration, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return ECUtil.getDomainParameters(providerConfiguration, convertSpec(eCParameterSpec));
        }
        C12726l ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
        return new C7838l(ecImplicitlyCa.f25097l, ecImplicitlyCa.f25095l, ecImplicitlyCa.f25099l, ecImplicitlyCa.f25098l, ecImplicitlyCa.f25096l);
    }

    public static AbstractC8859l convertPoint(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return convertPoint(convertCurve(eCParameterSpec.getCurve()), eCPoint);
    }

    public static AbstractC8859l convertPoint(AbstractC11918l abstractC11918l, ECPoint eCPoint) {
        return abstractC11918l.amazon(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static ECParameterSpec convertSpec(EllipticCurve ellipticCurve, C12726l c12726l) {
        ECPoint eCPointConvertPoint = convertPoint(c12726l.f25095l);
        if (c12726l instanceof C17209l) {
            return new C10825l(((C17209l) c12726l).f33402l, ellipticCurve, eCPointConvertPoint, c12726l.f25099l, c12726l.f25098l);
        }
        return new ECParameterSpec(ellipticCurve, eCPointConvertPoint, c12726l.f25099l, c12726l.f25098l.intValue());
    }

    public static EllipticCurve convertCurve(AbstractC11918l abstractC11918l, byte[] bArr) {
        return new EllipticCurve(convertField(abstractC11918l.yandex), abstractC11918l.loadAd.signatures(), abstractC11918l.crashlytics.signatures(), null);
    }

    public static ECParameterSpec convertToSpec(C7838l c7838l) {
        return new ECParameterSpec(convertCurve(c7838l.f16360l, null), convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
    }

    public static ECParameterSpec convertToSpec(C7100l c7100l) {
        return new ECParameterSpec(convertCurve(c7100l.f14871l.f6465l, null), convertPoint(c7100l.f14870l.vip()), c7100l.f14874l, c7100l.f14873l.intValue());
    }
}
