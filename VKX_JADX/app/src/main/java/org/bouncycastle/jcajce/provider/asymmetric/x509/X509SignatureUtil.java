package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC16570l;
import defpackage.AbstractC2509l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC8535l;
import defpackage.C10198l;
import defpackage.C10307l;
import defpackage.C1074l;
import defpackage.C14998l;
import defpackage.C4875l;
import defpackage.Cfor;
import defpackage.Cthrow;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC2716l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC4787l;
import defpackage.applovin;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
class X509SignatureUtil {
    private static final Map<Cfor, String> algNames;

    static {
        HashMap map = new HashMap();
        algNames = map;
        map.put(InterfaceC2716l.crashlytics, "Ed25519");
        map.put(InterfaceC2716l.amazon, "Ed448");
        map.put(InterfaceC4502l.mopub, "SHA1withDSA");
        map.put(InterfaceC15427l.f30158l, "SHA1withDSA");
    }

    public static boolean areEquivalentAlgorithms(C10198l c10198l, C10198l c10198l2) {
        Cfor cfor = c10198l.f20787l;
        applovin applovinVar = c10198l.f20786l;
        Cfor cfor2 = c10198l2.f20787l;
        applovin applovinVar2 = c10198l2.f20786l;
        if (!cfor.ad(cfor2)) {
            return false;
        }
        if (AbstractC8151l.crashlytics("org.bouncycastle.x509.allow_absent_equiv_NULL") && isAbsentOrEmptyParameters(applovinVar) && isAbsentOrEmptyParameters(applovinVar2)) {
            return true;
        }
        return AbstractC16570l.loadAd(applovinVar, applovinVar2);
    }

    private static String findAlgName(Cfor cfor) {
        String strLookupAlg;
        String strLookupAlg2;
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null && (strLookupAlg2 = lookupAlg(provider, cfor)) != null) {
            return strLookupAlg2;
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            if (provider != provider2 && (strLookupAlg = lookupAlg(provider2, cfor)) != null) {
                return strLookupAlg;
            }
        }
        return cfor.inmobi();
    }

    private static String getDigestAlgName(Cfor cfor) {
        String strYandex = AbstractC2509l.yandex(cfor);
        int iIndexOf = strYandex.indexOf(45);
        return (iIndexOf <= 0 || strYandex.startsWith("SHA3")) ? strYandex : strYandex.substring(0, iIndexOf).concat(strYandex.substring(iIndexOf + 1));
    }

    public static byte[] getExtensionValue(C1074l c1074l, String str) {
        Cfor cforM190private;
        Cthrow cthrowMetrica;
        if (str != null && (cforM190private = Cfor.m190private(str)) != null && (cthrowMetrica = C1074l.metrica(c1074l, cforM190private)) != null) {
            try {
                return cthrowMetrica.getEncoded();
            } catch (Exception e) {
                C4875l.remoteconfig(AbstractC12900l.admob(e, new StringBuilder("error parsing ")), e);
            }
        }
        return null;
    }

    public static String getSignatureName(C10198l c10198l) {
        StringBuilder sb;
        String digestAlgName;
        String str;
        Cfor cfor = c10198l.f20787l;
        applovin applovinVar = c10198l.f20786l;
        if (!isAbsentOrEmptyParameters(applovinVar)) {
            if (InterfaceC0543l.f1918static.ad(cfor)) {
                C10307l c10307lVip = C10307l.vip(applovinVar);
                sb = new StringBuilder();
                digestAlgName = getDigestAlgName(c10307lVip.f21018l.f20787l);
                str = "withRSAandMGF1";
            } else if (InterfaceC15427l.f30179l.ad(cfor)) {
                C10198l c10198lVip = C10198l.vip(applovinVar);
                sb = new StringBuilder();
                digestAlgName = getDigestAlgName(c10198lVip.f20787l);
                str = "withECDSA";
            }
            return AbstractC0653l.ads(sb, digestAlgName, str);
        }
        String str2 = algNames.get(cfor);
        return str2 != null ? str2 : findAlgName(cfor);
    }

    private static boolean isAbsentOrEmptyParameters(applovin applovinVar) {
        return applovinVar == null || C14998l.f29509l.pro(applovinVar);
    }

    public static boolean isCompositeAlgorithm(C10198l c10198l) {
        return InterfaceC4787l.Signature.ad(c10198l.f20787l);
    }

    private static String lookupAlg(Provider provider, Cfor cfor) {
        String property = provider.getProperty("Alg.Alias.Signature." + cfor);
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty("Alg.Alias.Signature.OID." + cfor);
        if (property2 != null) {
            return property2;
        }
        return null;
    }

    public static void prettyPrintSignature(byte[] bArr, StringBuilder sb, String str) {
        int length = bArr.length;
        sb.append("            Signature: ");
        if (length <= 20) {
            sb.append(AbstractC8535l.purchase(0, bArr.length, bArr));
            sb.append(str);
            return;
        }
        sb.append(AbstractC8535l.purchase(0, 20, bArr));
        sb.append(str);
        int i = 20;
        while (i < bArr.length) {
            int length2 = bArr.length - 20;
            sb.append("                       ");
            sb.append(i < length2 ? AbstractC8535l.purchase(i, 20, bArr) : AbstractC8535l.purchase(i, bArr.length - i, bArr));
            sb.append(str);
            i += 20;
        }
    }

    public static void setSignatureParameters(Signature signature, applovin applovinVar) throws NoSuchAlgorithmException, SignatureException {
        if (isAbsentOrEmptyParameters(applovinVar)) {
            return;
        }
        String algorithm = signature.getAlgorithm();
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithm, signature.getProvider());
        try {
            algorithmParameters.init(applovinVar.billing().getEncoded());
            if (algorithm.endsWith("MGF1")) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e) {
                    throw new SignatureException("Exception extracting parameters: " + e.getMessage());
                }
            }
        } catch (IOException e2) {
            throw new SignatureException(AbstractC5020l.adcel(e2, new StringBuilder("IOException decoding parameters: ")));
        }
    }
}
