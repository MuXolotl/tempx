package org.bouncycastle.jce.provider;

import defpackage.AbstractC0653l;
import defpackage.AbstractC5020l;
import defpackage.C10198l;
import defpackage.C10307l;
import defpackage.C1074l;
import defpackage.C14998l;
import defpackage.C8339l;
import defpackage.Cfor;
import defpackage.Cthrow;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC4368l;
import defpackage.InterfaceC4502l;
import defpackage.InterfaceC8134l;
import defpackage.applovin;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
class X509SignatureUtil {
    private static String getDigestAlgName(Cfor cfor) {
        if (InterfaceC0543l.f1910l.ad(cfor)) {
            return "MD5";
        }
        if (InterfaceC4502l.billing.ad(cfor)) {
            return "SHA1";
        }
        if (InterfaceC8134l.amazon.ad(cfor)) {
            return "SHA224";
        }
        if (InterfaceC8134l.yandex.ad(cfor)) {
            return "SHA256";
        }
        if (InterfaceC8134l.loadAd.ad(cfor)) {
            return "SHA384";
        }
        if (InterfaceC8134l.crashlytics.ad(cfor)) {
            return "SHA512";
        }
        if (InterfaceC4368l.loadAd.ad(cfor)) {
            return "RIPEMD128";
        }
        if (InterfaceC4368l.yandex.ad(cfor)) {
            return "RIPEMD160";
        }
        if (InterfaceC4368l.crashlytics.ad(cfor)) {
            return "RIPEMD256";
        }
        return InterfaceC11987l.yandex.ad(cfor) ? "GOST3411" : cfor.inmobi();
    }

    public static byte[] getExtensionValue(C1074l c1074l, String str) {
        Cfor cforM190private;
        Cthrow cthrowMetrica;
        if (str != null && (cforM190private = Cfor.m190private(str)) != null && (cthrowMetrica = C1074l.metrica(c1074l, cforM190private)) != null) {
            try {
                return cthrowMetrica.getEncoded();
            } catch (Exception e) {
                C8339l.smaato(AbstractC5020l.ads(e, new StringBuilder("error parsing ")));
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
        return cfor.inmobi();
    }

    private static boolean isAbsentOrEmptyParameters(applovin applovinVar) {
        return applovinVar == null || C14998l.f29509l.pro(applovinVar);
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
