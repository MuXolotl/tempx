package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.AbstractC1624l;
import defpackage.AbstractC17195l;
import defpackage.AbstractC18276l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC9361l;
import defpackage.C17209l;
import defpackage.C7100l;
import defpackage.Cfor;
import defpackage.InterfaceC15006l;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC16863l;
import defpackage.InterfaceC18537l;
import defpackage.InterfaceC4368l;
import defpackage.InterfaceC8134l;
import defpackage.InterfaceC9172l;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class EC {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.ec.";
    private static final Map<String, String> ecSupportCurves;
    private static final Map<String, String> generalEcAttributes;

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("AlgorithmParameters.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.AlgorithmParametersSpi", EC.ecSupportCurves);
            configurableProvider.addAlgorithm("KeyAgreement.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DH", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHC", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement.ECDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1KDFAndSharedInfo", AbstractC9361l.isVip("KeyAgreement.ECCDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHC", configurableProvider, "KeyAgreement.ECCDHU", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUC"));
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA224KDFAndSharedInfo", AbstractC9361l.isVip("KeyAgreement.ECCDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA1KDFAndSharedInfo", configurableProvider, "KeyAgreement.ECDHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA224KDFAndSharedInfo"));
            configurableProvider.addAlgorithm("KeyAgreement.ECDHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384KDFAndSharedInfo", AbstractC9361l.isVip("KeyAgreement.ECDHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256KDFAndSharedInfo", configurableProvider, "KeyAgreement.ECCDHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA256KDFAndSharedInfo"));
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA512KDFAndSharedInfo", AbstractC9361l.isVip("KeyAgreement.ECCDHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA384KDFAndSharedInfo", configurableProvider, "KeyAgreement.ECDHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512KDFAndSharedInfo"));
            Cfor cfor = InterfaceC15427l.f30156l;
            configurableProvider.addAlgorithm("KeyAgreement", cfor, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1KDFAndSharedInfo", EC.generalEcAttributes);
            Cfor cfor2 = InterfaceC15427l.f30169l;
            configurableProvider.addAlgorithm("KeyAgreement", cfor2, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA1KDFAndSharedInfo", EC.generalEcAttributes);
            Cfor cfor3 = InterfaceC16863l.f32905strictfp;
            configurableProvider.addAlgorithm("KeyAgreement", cfor3, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA224KDFAndSharedInfo", EC.generalEcAttributes);
            Cfor cfor4 = InterfaceC16863l.f32900extends;
            configurableProvider.addAlgorithm("KeyAgreement", cfor4, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA224KDFAndSharedInfo", EC.generalEcAttributes);
            Cfor cfor5 = InterfaceC16863l.f32910volatile;
            configurableProvider.addAlgorithm("KeyAgreement", cfor5, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256KDFAndSharedInfo", EC.generalEcAttributes);
            Cfor cfor6 = InterfaceC16863l.f32901for;
            configurableProvider.addAlgorithm("KeyAgreement", cfor6, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA256KDFAndSharedInfo", EC.generalEcAttributes);
            Cfor cfor7 = InterfaceC16863l.f32902native;
            configurableProvider.addAlgorithm("KeyAgreement", cfor7, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384KDFAndSharedInfo", EC.generalEcAttributes);
            Cfor cfor8 = InterfaceC16863l.f32908throw;
            configurableProvider.addAlgorithm("KeyAgreement", cfor8, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA384KDFAndSharedInfo", EC.generalEcAttributes);
            Cfor cfor9 = InterfaceC16863l.f32904private;
            configurableProvider.addAlgorithm("KeyAgreement", cfor9, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512KDFAndSharedInfo", EC.generalEcAttributes);
            Cfor cfor10 = InterfaceC16863l.f32897catch;
            configurableProvider.addAlgorithm("KeyAgreement", cfor10, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA512KDFAndSharedInfo", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1CKDF", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512CKDF", AbstractC9361l.isVip("KeyAgreement.ECCDHWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256CKDF", configurableProvider, "KeyAgreement.ECCDHWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384CKDF"));
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA256CKDF", AbstractC9361l.isVip("KeyAgreement.ECCDHUWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA1CKDF", configurableProvider, "KeyAgreement.ECCDHUWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA224CKDF"));
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA1KDF", AbstractC9361l.isVip("KeyAgreement.ECCDHUWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA384CKDF", configurableProvider, "KeyAgreement.ECCDHUWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA512CKDF"));
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA384KDF", AbstractC9361l.isVip("KeyAgreement.ECCDHUWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA224KDF", configurableProvider, "KeyAgreement.ECCDHUWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA256KDF"));
            configurableProvider.addAlgorithm("KeyAgreement.ECKAEGWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA224KDF", AbstractC9361l.isVip("KeyAgreement.ECCDHUWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA512KDF", configurableProvider, "KeyAgreement.ECKAEGWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA1KDF"));
            configurableProvider.addAlgorithm("KeyAgreement.ECKAEGWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA512KDF", AbstractC9361l.isVip("KeyAgreement.ECKAEGWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA256KDF", configurableProvider, "KeyAgreement.ECKAEGWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA384KDF"));
            configurableProvider.addAlgorithm("KeyAgreement", InterfaceC18537l.firebase, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA1KDF", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement", InterfaceC18537l.smaato, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA224KDF", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement", InterfaceC18537l.remoteconfig, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA256KDF", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement", InterfaceC18537l.vip, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA384KDF", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement", InterfaceC18537l.metrica, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA512KDF", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement", InterfaceC18537l.startapp, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithRIPEMD160KDF", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement.ECKAEGWITHRIPEMD160KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithRIPEMD160KDF", EC.generalEcAttributes);
            Cfor cfor11 = InterfaceC15427l.f30173l;
            registerOid(configurableProvider, cfor11, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, cfor, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, cfor2, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, cfor3, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, cfor4, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, cfor5, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, cfor6, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, cfor7, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, cfor8, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, cfor9, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, cfor10, "EC", new KeyFactorySpi.EC());
            registerOidAlgorithmParameters(configurableProvider, cfor11, "EC");
            registerOidAlgorithmParameters(configurableProvider, cfor, "EC");
            registerOidAlgorithmParameters(configurableProvider, cfor2, "EC");
            registerOidAlgorithmParameters(configurableProvider, cfor3, "EC");
            registerOidAlgorithmParameters(configurableProvider, cfor4, "EC");
            registerOidAlgorithmParameters(configurableProvider, cfor5, "EC");
            registerOidAlgorithmParameters(configurableProvider, cfor6, "EC");
            registerOidAlgorithmParameters(configurableProvider, cfor7, "EC");
            registerOidAlgorithmParameters(configurableProvider, cfor8, "EC");
            registerOidAlgorithmParameters(configurableProvider, cfor9, "EC");
            registerOidAlgorithmParameters(configurableProvider, cfor10, "EC");
            if (!AbstractC8151l.crashlytics("org.bouncycastle.ec.disable_mqv")) {
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224CKDF", AbstractC9361l.isVip("KeyAgreement.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQV", configurableProvider, "KeyAgreement.ECMQVWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1CKDF"));
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512CKDF", AbstractC9361l.isVip("KeyAgreement.ECMQVWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256CKDF", configurableProvider, "KeyAgreement.ECMQVWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384CKDF"));
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256KDF", AbstractC9361l.isVip("KeyAgreement.ECMQVWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1KDF", configurableProvider, "KeyAgreement.ECMQVWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224KDF"));
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384KDF", EC.generalEcAttributes);
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512KDF", EC.generalEcAttributes);
                StringBuilder sb = new StringBuilder("KeyAgreement.");
                Cfor cfor12 = InterfaceC15427l.f30159l;
                sb.append(cfor12);
                configurableProvider.addAlgorithm(sb.toString(), "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1KDFAndSharedInfo", EC.generalEcAttributes);
                StringBuilder sb2 = new StringBuilder("KeyAgreement.");
                Cfor cfor13 = InterfaceC16863l.f32899else;
                sb2.append(cfor13);
                configurableProvider.addAlgorithm(sb2.toString(), "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224KDFAndSharedInfo", EC.generalEcAttributes);
                StringBuilder sb3 = new StringBuilder("KeyAgreement.");
                Cfor cfor14 = InterfaceC16863l.f32896case;
                sb3.append(cfor14);
                configurableProvider.addAlgorithm(sb3.toString(), "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256KDFAndSharedInfo", EC.generalEcAttributes);
                StringBuilder sb4 = new StringBuilder("KeyAgreement.");
                Cfor cfor15 = InterfaceC16863l.f32906switch;
                sb4.append(cfor15);
                configurableProvider.addAlgorithm(sb4.toString(), "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384KDFAndSharedInfo", EC.generalEcAttributes);
                StringBuilder sb5 = new StringBuilder("KeyAgreement.");
                Cfor cfor16 = InterfaceC16863l.f32898continue;
                sb5.append(cfor16);
                configurableProvider.addAlgorithm(sb5.toString(), "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512KDFAndSharedInfo", EC.generalEcAttributes);
                registerOid(configurableProvider, cfor12, "ECMQV", new KeyFactorySpi.ECMQV());
                registerOidAlgorithmParameters(configurableProvider, cfor12, "EC");
                registerOid(configurableProvider, cfor13, "ECMQV", new KeyFactorySpi.ECMQV());
                registerOidAlgorithmParameters(configurableProvider, cfor13, "EC");
                registerOid(configurableProvider, cfor14, "ECMQV", new KeyFactorySpi.ECMQV());
                registerOidAlgorithmParameters(configurableProvider, cfor14, "EC");
                registerOid(configurableProvider, cfor15, "ECMQV", new KeyFactorySpi.ECMQV());
                registerOidAlgorithmParameters(configurableProvider, cfor15, "EC");
                registerOid(configurableProvider, cfor16, "ECMQV", new KeyFactorySpi.ECMQV());
                registerOidAlgorithmParameters(configurableProvider, cfor16, "EC");
                configurableProvider.addAlgorithm("KeyFactory.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECMQV");
                configurableProvider.addAlgorithm("KeyPairGenerator.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECMQV");
            }
            configurableProvider.addAlgorithm("KeyFactory.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$EC");
            configurableProvider.addAlgorithm("KeyFactory.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDSA");
            configurableProvider.addAlgorithm("KeyFactory.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDH");
            configurableProvider.addAlgorithm("KeyFactory.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDHC");
            configurableProvider.addAlgorithm("KeyPairGenerator.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$EC");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDSA");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDHC");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECIES", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            configurableProvider.addAlgorithm("Cipher.ECIES", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIES", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256", AbstractC9361l.isVip("Cipher.ECIESwithSHA1", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIES", configurableProvider, "Cipher.ECIESWITHSHA1", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIES"));
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA384", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384", AbstractC9361l.isVip("Cipher.ECIESWITHSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256", configurableProvider, "Cipher.ECIESwithSHA384", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384"));
            configurableProvider.addAlgorithm("Cipher.ECIESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC", AbstractC9361l.isVip("Cipher.ECIESwithSHA512", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512", configurableProvider, "Cipher.ECIESWITHSHA512", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512"));
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA1ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC", AbstractC9361l.isVip("Cipher.ECIESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC", configurableProvider, "Cipher.ECIESwithSHA1andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC"));
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA384andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384andAESCBC", AbstractC9361l.isVip("Cipher.ECIESwithSHA256andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256andAESCBC", configurableProvider, "Cipher.ECIESWITHSHA256ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256andAESCBC"));
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA512ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512andAESCBC", AbstractC9361l.isVip("Cipher.ECIESWITHSHA384ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384andAESCBC", configurableProvider, "Cipher.ECIESwithSHA512andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512andAESCBC"));
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA1andDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC", AbstractC9361l.isVip("Cipher.ECIESwithDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC", configurableProvider, "Cipher.ECIESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC"));
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA256ANDDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256andDESedeCBC", AbstractC9361l.isVip("Cipher.ECIESWITHSHA1ANDDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC", configurableProvider, "Cipher.ECIESwithSHA256andDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256andDESedeCBC"));
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA512andDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512andDESedeCBC", AbstractC9361l.isVip("Cipher.ECIESwithSHA384andDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384andDESedeCBC", configurableProvider, "Cipher.ECIESWITHSHA384ANDDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384andDESedeCBC"));
            configurableProvider.addAlgorithm("Signature.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA", AbstractC9361l.isVip("Cipher.ECIESWITHSHA512ANDDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512andDESedeCBC", configurableProvider, "Cipher.ETSIKEMWITHSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESKEMCipher$KEMwithSHA256"));
            configurableProvider.addAlgorithm("Signature.NONEwithECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAnone", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA1withECDSA", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECDSAwithSHA1", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA1WITHECDSA", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECDSAWITHSHA1", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA1WithECDSA", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECDSAWithSHA1", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.1.2.840.10045.4.1", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + InterfaceC4368l.mopub, "ECDSA");
            configurableProvider.addAlgorithm("Signature.ECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("Signature.SHA256WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA256", AbstractC9361l.isVip("Signature.SHA1WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA", configurableProvider, "Signature.SHA224WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA224"));
            configurableProvider.addAlgorithm("Signature.SHA3-224WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_224", AbstractC9361l.isVip("Signature.SHA384WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA384", configurableProvider, "Signature.SHA512WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA512"));
            configurableProvider.addAlgorithm("Signature.SHA3-512WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_512", AbstractC9361l.isVip("Signature.SHA3-256WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_256", configurableProvider, "Signature.SHA3-384WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_384"));
            configurableProvider.addAlgorithm("Alg.Alias.Signature.DETECDSA", "ECDDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA1WITHDETECDSA", "SHA1WITHECDDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA224WITHDETECDSA", "SHA224WITHECDDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA256WITHDETECDSA", "SHA256WITHECDDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA384WITHDETECDSA", "SHA384WITHECDDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHDETECDSA", "SHA512WITHECDDSA");
            addSignatureAlgorithm(configurableProvider, "SHA224", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA224", InterfaceC15427l.f30182l, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA256", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA256", InterfaceC15427l.f30180l, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA384", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA384", InterfaceC15427l.f30148l, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA512", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA512", InterfaceC15427l.f30147l, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA3-224", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_224", InterfaceC8134l.f16952import, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA3-256", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_256", InterfaceC8134l.f16937abstract, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA3-384", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_384", InterfaceC8134l.f16953instanceof, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA3-512", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_512", InterfaceC8134l.f16987public, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHAKE128", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAShake128", InterfaceC15006l.crashlytics, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHAKE256", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAShake256", InterfaceC15006l.amazon, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "RIPEMD160", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSARipeMD160", InterfaceC4368l.admob, EC.generalEcAttributes);
            configurableProvider.addAlgorithm("Signature.SHA256WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR256", AbstractC9361l.isVip("Signature.SHA1WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR", configurableProvider, "Signature.SHA224WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR224"));
            configurableProvider.addAlgorithm("Signature.SHA384WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR384", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("Signature.SHA512WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR512", EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA1", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA", InterfaceC9172l.yandex, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA224", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224", InterfaceC9172l.loadAd, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA256", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256", InterfaceC9172l.crashlytics, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA384", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA384", InterfaceC9172l.amazon, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA512", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA512", InterfaceC9172l.purchase, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA1", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA", InterfaceC18537l.yandex, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA224", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224", InterfaceC18537l.loadAd, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA256", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256", InterfaceC18537l.crashlytics, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA384", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA384", InterfaceC18537l.amazon, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA512", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA512", InterfaceC18537l.purchase, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "RIPEMD160", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecPlainDSARP160", InterfaceC18537l.billing, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA3-224", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA3_224", InterfaceC18537l.mopub, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA3-256", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA3_256", InterfaceC18537l.admob, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA3-384", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA3_384", InterfaceC18537l.subs, EC.generalEcAttributes);
            addSignatureAlgorithm(configurableProvider, "SHA3-512", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA3_512", InterfaceC18537l.isPro, EC.generalEcAttributes);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0043  */
    static {
        int i;
        String str;
        C7100l c7100lAmazon;
        Cfor cforFirebase;
        HashMap map = new HashMap();
        generalEcAttributes = map;
        ecSupportCurves = new HashMap();
        map.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
        Enumeration enumerationIsPro = AbstractC17195l.isPro();
        Hashtable hashtable = new Hashtable();
        while (enumerationIsPro.hasMoreElements()) {
            String str2 = (String) enumerationIsPro.nextElement();
            Cfor cforM190private = Cfor.m190private(str2);
            if (cforM190private != null) {
                AbstractC18276l abstractC18276l = (AbstractC18276l) AbstractC1624l.crashlytics.get(cforM190private);
                if (abstractC18276l == null) {
                    c7100lAmazon = null;
                } else {
                    c7100lAmazon = abstractC18276l.amazon();
                }
            } else {
                AbstractC18276l abstractC18276lPurchase = AbstractC1624l.purchase(str2);
                if (abstractC18276lPurchase == null) {
                    c7100lAmazon = null;
                } else {
                    c7100lAmazon = abstractC18276lPurchase.amazon();
                }
            }
            if (c7100lAmazon == null) {
                c7100lAmazon = cforM190private != null ? AbstractC17195l.admob(cforM190private) : AbstractC17195l.mopub(str2);
            }
            if ((c7100lAmazon != null ? new C17209l(str2, c7100lAmazon.f14871l.f6465l, c7100lAmazon.f14870l.vip(), c7100lAmazon.f14874l, c7100lAmazon.f14873l, c7100lAmazon.metrica()) : null) != null && (cforFirebase = AbstractC17195l.firebase(str2)) != null) {
                String strInmobi = cforFirebase.inmobi();
                Vector vector = (Vector) hashtable.get(strInmobi);
                if (vector == null) {
                    vector = new Vector();
                    hashtable.put(strInmobi, vector);
                }
                if (!vector.contains(str2)) {
                    vector.addElement(str2);
                }
            }
        }
        Enumeration enumerationKeys = hashtable.keys();
        Vector vector2 = new Vector();
        while (true) {
            i = 0;
            if (!enumerationKeys.hasMoreElements()) {
                break;
            }
            String str3 = (String) enumerationKeys.nextElement();
            Vector vector3 = (Vector) hashtable.get(str3);
            StringBuffer stringBuffer = new StringBuffer("[");
            Cfor cfor = new Cfor(str3);
            if (InterfaceC15427l.f30145l.ad(cfor)) {
                str = "secp256r1,NIST P-256,X9.62 prime256v1";
            } else {
                if (InterfaceC15427l.f30171l.ad(cfor)) {
                    str = "secp192r1,NIST P-192,X9.62 prime192v1";
                } else {
                    if (cfor.m195strictfp(InterfaceC15427l.f30163l) || cfor.m195strictfp(InterfaceC15427l.f30183l)) {
                        stringBuffer.append("X9.62 ");
                    }
                    while (i < vector3.size()) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        String str4 = (String) vector3.elementAt(i);
                        if ((cfor.m195strictfp(InterfaceC16863l.yandex) || InterfaceC15427l.f30145l.ad(cfor) || InterfaceC15427l.f30171l.ad(cfor)) && (str4.startsWith("K-") || str4.startsWith("B-") || str4.startsWith("P-"))) {
                            stringBuffer.append("NIST ");
                        }
                        stringBuffer.append(str4);
                        i++;
                    }
                }
                stringBuffer.append(",");
                stringBuffer.append(str3);
                stringBuffer.append("]");
                vector2.addElement(stringBuffer.toString());
            }
            stringBuffer.append(str);
            stringBuffer.append(",");
            stringBuffer.append(str3);
            stringBuffer.append("]");
            vector2.addElement(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        while (i < vector2.size()) {
            if (i > 0) {
                stringBuffer2.append("|");
            }
            stringBuffer2.append((String) vector2.elementAt(i));
            i++;
        }
        ecSupportCurves.put("SupportedCurves", stringBuffer2.toString());
    }
}
