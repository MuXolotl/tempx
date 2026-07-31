package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import defpackage.C17711l;
import defpackage.C17951l;
import defpackage.C2657l;
import defpackage.C5153l;
import defpackage.C6051l;
import defpackage.Cfor;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC4787l;
import defpackage.InterfaceC6796l;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class CompositeIndex {
    private static Map<Cfor, String[]> pairings = new HashMap();
    private static Map<Cfor, AlgorithmParameterSpec[]> kpgInitSpecs = new HashMap();
    private static Map<Cfor, String> algorithmNames = new HashMap();

    static {
        Map<Cfor, String[]> map = pairings;
        Cfor cfor = InterfaceC6796l.billing;
        map.put(cfor, new String[]{"ML-DSA-44", "RSASSA-PSS"});
        Map<Cfor, String[]> map2 = pairings;
        Cfor cfor2 = InterfaceC6796l.mopub;
        map2.put(cfor2, new String[]{"ML-DSA-44", "SHA256withRSA"});
        Map<Cfor, String[]> map3 = pairings;
        Cfor cfor3 = InterfaceC6796l.admob;
        map3.put(cfor3, new String[]{"ML-DSA-44", "Ed25519"});
        Map<Cfor, String[]> map4 = pairings;
        Cfor cfor4 = InterfaceC6796l.subs;
        map4.put(cfor4, new String[]{"ML-DSA-44", "SHA256withECDSA"});
        Map<Cfor, String[]> map5 = pairings;
        Cfor cfor5 = InterfaceC6796l.isPro;
        map5.put(cfor5, new String[]{"ML-DSA-65", "RSASSA-PSS"});
        Map<Cfor, String[]> map6 = pairings;
        Cfor cfor6 = InterfaceC6796l.firebase;
        map6.put(cfor6, new String[]{"ML-DSA-65", "SHA256withRSA"});
        Map<Cfor, String[]> map7 = pairings;
        Cfor cfor7 = InterfaceC6796l.smaato;
        map7.put(cfor7, new String[]{"ML-DSA-65", "RSASSA-PSS"});
        Map<Cfor, String[]> map8 = pairings;
        Cfor cfor8 = InterfaceC6796l.remoteconfig;
        map8.put(cfor8, new String[]{"ML-DSA-65", "SHA384withRSA"});
        Map<Cfor, String[]> map9 = pairings;
        Cfor cfor9 = InterfaceC6796l.vip;
        map9.put(cfor9, new String[]{"ML-DSA-65", "SHA256withECDSA"});
        Map<Cfor, String[]> map10 = pairings;
        Cfor cfor10 = InterfaceC6796l.metrica;
        map10.put(cfor10, new String[]{"ML-DSA-65", "SHA384withECDSA"});
        Map<Cfor, String[]> map11 = pairings;
        Cfor cfor11 = InterfaceC6796l.startapp;
        map11.put(cfor11, new String[]{"ML-DSA-65", "SHA256withECDSA"});
        Map<Cfor, String[]> map12 = pairings;
        Cfor cfor12 = InterfaceC6796l.adcel;
        map12.put(cfor12, new String[]{"ML-DSA-65", "Ed25519"});
        Map<Cfor, String[]> map13 = pairings;
        Cfor cfor13 = InterfaceC6796l.ads;
        map13.put(cfor13, new String[]{"ML-DSA-87", "SHA384withECDSA"});
        Map<Cfor, String[]> map14 = pairings;
        Cfor cfor14 = InterfaceC6796l.subscription;
        map14.put(cfor14, new String[]{"ML-DSA-87", "SHA384withECDSA"});
        Map<Cfor, String[]> map15 = pairings;
        Cfor cfor15 = InterfaceC6796l.tapsense;
        map15.put(cfor15, new String[]{"ML-DSA-87", "Ed448"});
        Map<Cfor, String[]> map16 = pairings;
        Cfor cfor16 = InterfaceC6796l.Signature;
        map16.put(cfor16, new String[]{"ML-DSA-87", "RSASSA-PSS"});
        Map<Cfor, String[]> map17 = pairings;
        Cfor cfor17 = InterfaceC6796l.license;
        map17.put(cfor17, new String[]{"ML-DSA-87", "RSASSA-PSS"});
        Map<Cfor, String[]> map18 = pairings;
        Cfor cfor18 = InterfaceC6796l.pro;
        map18.put(cfor18, new String[]{"ML-DSA-87", "SHA512withECDSA"});
        Map<Cfor, AlgorithmParameterSpec[]> map19 = kpgInitSpecs;
        Cfor cfor19 = InterfaceC4787l.ad;
        BigInteger bigInteger = RSAKeyGenParameterSpec.F4;
        map19.put(cfor19, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(2048, bigInteger)});
        Map<Cfor, AlgorithmParameterSpec[]> map20 = kpgInitSpecs;
        Cfor cfor20 = InterfaceC4787l.advert;
        map20.put(cfor20, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(2048, bigInteger)});
        Map<Cfor, AlgorithmParameterSpec[]> map21 = kpgInitSpecs;
        Cfor cfor21 = InterfaceC4787l.isVip;
        map21.put(cfor21, new AlgorithmParameterSpec[]{null, null});
        Map<Cfor, AlgorithmParameterSpec[]> map22 = kpgInitSpecs;
        Cfor cfor22 = InterfaceC4787l.signatures;
        map22.put(cfor22, new AlgorithmParameterSpec[]{null, new C6051l("P-256")});
        Map<Cfor, AlgorithmParameterSpec[]> map23 = kpgInitSpecs;
        Cfor cfor23 = InterfaceC4787l.premium;
        map23.put(cfor23, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        Map<Cfor, AlgorithmParameterSpec[]> map24 = kpgInitSpecs;
        Cfor cfor24 = InterfaceC4787l.applovin;
        map24.put(cfor24, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        Map<Cfor, AlgorithmParameterSpec[]> map25 = kpgInitSpecs;
        Cfor cfor25 = InterfaceC4787l.appmetrica;
        map25.put(cfor25, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        Map<Cfor, AlgorithmParameterSpec[]> map26 = kpgInitSpecs;
        Cfor cfor26 = InterfaceC4787l.inmobi;
        map26.put(cfor26, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        Map<Cfor, AlgorithmParameterSpec[]> map27 = kpgInitSpecs;
        Cfor cfor27 = InterfaceC4787l.f9829throws;
        map27.put(cfor27, new AlgorithmParameterSpec[]{null, new C6051l("P-384")});
        Map<Cfor, AlgorithmParameterSpec[]> map28 = kpgInitSpecs;
        Cfor cfor28 = InterfaceC4787l.f9826package;
        map28.put(cfor28, new AlgorithmParameterSpec[]{null, new C6051l("brainpoolP256r1")});
        Map<Cfor, AlgorithmParameterSpec[]> map29 = kpgInitSpecs;
        Cfor cfor29 = InterfaceC4787l.f9828synchronized;
        map29.put(cfor29, new AlgorithmParameterSpec[]{null, null});
        Map<Cfor, AlgorithmParameterSpec[]> map30 = kpgInitSpecs;
        Cfor cfor30 = InterfaceC4787l.f9827strictfp;
        map30.put(cfor30, new AlgorithmParameterSpec[]{null, new C6051l("P-384")});
        Map<Cfor, AlgorithmParameterSpec[]> map31 = kpgInitSpecs;
        Cfor cfor31 = InterfaceC4787l.f9830volatile;
        map31.put(cfor31, new AlgorithmParameterSpec[]{null, new C6051l("brainpoolP384r1")});
        Map<Cfor, AlgorithmParameterSpec[]> map32 = kpgInitSpecs;
        Cfor cfor32 = InterfaceC4787l.f9825native;
        map32.put(cfor32, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(cfor, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(2048, bigInteger)});
        kpgInitSpecs.put(cfor2, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(2048, bigInteger)});
        kpgInitSpecs.put(cfor3, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(cfor4, new AlgorithmParameterSpec[]{null, new C6051l("P-256")});
        kpgInitSpecs.put(cfor5, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        kpgInitSpecs.put(cfor6, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        kpgInitSpecs.put(cfor7, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        kpgInitSpecs.put(cfor8, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        kpgInitSpecs.put(cfor9, new AlgorithmParameterSpec[]{null, new C6051l("P-256")});
        kpgInitSpecs.put(cfor10, new AlgorithmParameterSpec[]{null, new C6051l("P-384")});
        kpgInitSpecs.put(cfor11, new AlgorithmParameterSpec[]{null, new C6051l("brainpoolP256r1")});
        kpgInitSpecs.put(cfor12, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(cfor13, new AlgorithmParameterSpec[]{null, new C6051l("P-384")});
        kpgInitSpecs.put(cfor14, new AlgorithmParameterSpec[]{null, new C6051l("brainpoolP384r1")});
        kpgInitSpecs.put(cfor15, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(cfor17, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        kpgInitSpecs.put(cfor18, new AlgorithmParameterSpec[]{null, new C6051l("P-521")});
        kpgInitSpecs.put(cfor16, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        algorithmNames.put(cfor19, "HashMLDSA44-RSA2048-PSS-SHA256");
        algorithmNames.put(cfor20, "HashMLDSA44-RSA2048-PKCS15-SHA256");
        algorithmNames.put(cfor21, "HashMLDSA44-Ed25519-SHA512");
        algorithmNames.put(cfor22, "HashMLDSA44-ECDSA-P256-SHA256");
        algorithmNames.put(cfor23, "HashMLDSA65-RSA3072-PSS-SHA512");
        algorithmNames.put(cfor24, "HashMLDSA65-RSA3072-PKCS15-SHA512");
        algorithmNames.put(cfor25, "HashMLDSA65-RSA4096-PSS-SHA512");
        algorithmNames.put(cfor26, "HashMLDSA65-RSA4096-PKCS15-SHA512");
        algorithmNames.put(cfor27, "HashMLDSA65-ECDSA-P384-SHA512");
        algorithmNames.put(cfor28, "HashMLDSA65-ECDSA-brainpoolP256r1-SHA512");
        algorithmNames.put(cfor29, "HashMLDSA65-Ed25519-SHA512");
        algorithmNames.put(cfor30, "HashMLDSA87-ECDSA-P384-SHA512");
        algorithmNames.put(cfor31, "HashMLDSA87-ECDSA-brainpoolP384r1-SHA512");
        algorithmNames.put(cfor32, "HashMLDSA87-Ed448-SHA512");
        algorithmNames.put(cfor, "MLDSA44-RSA2048-PSS-SHA256");
        algorithmNames.put(cfor2, "MLDSA44-RSA2048-PKCS15-SHA256");
        algorithmNames.put(cfor3, "MLDSA44-Ed25519-SHA512");
        algorithmNames.put(cfor4, "MLDSA44-ECDSA-P256-SHA256");
        algorithmNames.put(cfor5, "MLDSA65-RSA3072-PSS-SHA512");
        algorithmNames.put(cfor6, "MLDSA65-RSA3072-PKCS15-SHA512");
        algorithmNames.put(cfor7, "MLDSA65-RSA4096-PSS-SHA512");
        algorithmNames.put(cfor8, "MLDSA65-RSA4096-PKCS15-SHA512");
        algorithmNames.put(cfor9, "MLDSA65-ECDSA-P256-SHA512");
        algorithmNames.put(cfor10, "MLDSA65-ECDSA-P384-SHA512");
        algorithmNames.put(cfor11, "MLDSA65-ECDSA-brainpoolP256r1-SHA512");
        algorithmNames.put(cfor12, "MLDSA65-Ed25519-SHA512");
        algorithmNames.put(cfor13, "MLDSA87-ECDSA-P384-SHA512");
        algorithmNames.put(cfor14, "MLDSA87-ECDSA-brainpoolP384r1-SHA512");
        algorithmNames.put(cfor15, "MLDSA87-Ed448-SHAKE256");
        algorithmNames.put(cfor17, "MLDSA87-RSA4096-PSS-SHA512");
        algorithmNames.put(cfor18, "MLDSA87-ECDSA-P521-SHA512");
        algorithmNames.put(cfor16, "MLDSA87-RSA3072-PSS-SHA512");
    }

    public static String getAlgorithmName(Cfor cfor) {
        return algorithmNames.get(cfor);
    }

    public static String getBaseName(String str) {
        if (str.indexOf("RSA") >= 0) {
            return "RSA";
        }
        return str.indexOf("ECDSA") >= 0 ? "EC" : str;
    }

    public static InterfaceC16922l getDigest(Cfor cfor) {
        String str = algorithmNames.get(cfor);
        if (str.endsWith("SHA256")) {
            return new C2657l();
        }
        if (str.endsWith("SHA384")) {
            return new C5153l();
        }
        return str.endsWith("SHA512") ? new C17711l() : new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public static AlgorithmParameterSpec[] getKeyPairSpecs(Cfor cfor) {
        return kpgInitSpecs.get(cfor);
    }

    public static String[] getPairing(Cfor cfor) {
        return pairings.get(cfor);
    }

    public static Set<Cfor> getSupportedIdentifiers() {
        return pairings.keySet();
    }

    public static boolean isAlgorithmSupported(Cfor cfor) {
        return pairings.containsKey(cfor);
    }
}
