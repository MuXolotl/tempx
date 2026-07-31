package org.bouncycastle.jcajce.provider.util;

import defpackage.AbstractC11043l;
import defpackage.AbstractC9361l;
import defpackage.Cfor;
import java.util.Map;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addCipherAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, Cfor cfor) {
        configurableProvider.addAlgorithm("Cipher." + str, str2);
        if (cfor != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + cfor, str);
            AbstractC11043l.metrica(new StringBuilder("Alg.Alias.Cipher.OID."), cfor, configurableProvider, str);
        }
    }

    public void addKEMAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, Cfor cfor) {
        configurableProvider.addAlgorithm("KEM." + str, str2);
        if (cfor != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KEM." + cfor, str);
            AbstractC11043l.metrica(new StringBuilder("Alg.Alias.KEM.OID."), cfor, configurableProvider, str);
        }
    }

    public void addKeyFactoryAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, Cfor cfor, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("KeyFactory." + str, str2);
        if (cfor != null) {
            registerKeyFactoryOid(configurableProvider, cfor, str, asymmetricKeyInfoConverter);
        }
    }

    public void addKeyGeneratorAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, Cfor cfor) {
        configurableProvider.addAlgorithm("KeyGenerator." + str, str2);
        if (cfor != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + cfor, str);
            AbstractC11043l.metrica(new StringBuilder("Alg.Alias.KeyGenerator.OID."), cfor, configurableProvider, str);
        }
    }

    public void addKeyPairGeneratorAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, Cfor cfor) {
        configurableProvider.addAlgorithm("KeyPairGenerator." + str, str2);
        if (cfor != null) {
            registerKeyPairGeneratorOid(configurableProvider, cfor, str);
        }
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, Cfor cfor, Map<String, String> map) {
        String strPro = AbstractC9361l.pro(str, "WITH", str2);
        String strPro2 = AbstractC9361l.pro(str, "with", str2);
        String strPro3 = AbstractC9361l.pro(str, "With", str2);
        String strPro4 = AbstractC9361l.pro(str, "/", str2);
        configurableProvider.addAlgorithm("Signature.".concat(strPro), str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strPro2), strPro);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strPro3), strPro);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strPro4), strPro);
        if (cfor != null) {
            registerSignatureOid(configurableProvider, cfor, strPro);
        }
        configurableProvider.addAttributes("Signature.".concat(strPro), map);
    }

    public void addSignatureAlias(ConfigurableProvider configurableProvider, String str, Cfor cfor) {
        registerSignatureOid(configurableProvider, cfor, str);
    }

    public void registerKeyFactoryOid(ConfigurableProvider configurableProvider, Cfor cfor, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + cfor, str);
        AbstractC11043l.metrica(new StringBuilder("Alg.Alias.KeyFactory.OID."), cfor, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(cfor, asymmetricKeyInfoConverter);
    }

    public void registerKeyPairGeneratorOid(ConfigurableProvider configurableProvider, Cfor cfor, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator." + cfor, str);
        AbstractC11043l.metrica(new StringBuilder("Alg.Alias.KeyPairGenerator.OID."), cfor, configurableProvider, str);
    }

    public void registerOid(ConfigurableProvider configurableProvider, Cfor cfor, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        registerKeyFactoryOid(configurableProvider, cfor, str, asymmetricKeyInfoConverter);
        registerKeyPairGeneratorOid(configurableProvider, cfor, str);
    }

    public void registerOidAlgorithmParameterGenerator(ConfigurableProvider configurableProvider, Cfor cfor, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + cfor, str);
        AbstractC11043l.metrica(new StringBuilder("Alg.Alias.AlgorithmParameters."), cfor, configurableProvider, str);
    }

    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, Cfor cfor, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + cfor, str);
    }

    public void registerSignatureOid(ConfigurableProvider configurableProvider, Cfor cfor, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + cfor, str);
        AbstractC11043l.metrica(new StringBuilder("Alg.Alias.Signature.OID."), cfor, configurableProvider, str);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        addSignatureAlgorithm(configurableProvider, str, str2, str3, null);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, Cfor cfor) {
        String strPro = AbstractC9361l.pro(str, "WITH", str2);
        String strPro2 = AbstractC9361l.pro(str, "with", str2);
        String strPro3 = AbstractC9361l.pro(str, "With", str2);
        String strPro4 = AbstractC9361l.pro(str, "/", str2);
        configurableProvider.addAlgorithm("Signature.".concat(strPro), str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strPro2), strPro);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strPro3), strPro);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(strPro4), strPro);
        if (cfor != null) {
            registerSignatureOid(configurableProvider, cfor, strPro);
        }
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, Cfor cfor) {
        configurableProvider.addAlgorithm("Signature." + str, str2);
        if (cfor != null) {
            registerSignatureOid(configurableProvider, cfor, str);
        }
    }
}
