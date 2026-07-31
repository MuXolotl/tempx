package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.AbstractC12900l;
import defpackage.AbstractC5020l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C2756l;
import defpackage.C7972l;
import defpackage.Cfor;
import defpackage.InterfaceC4787l;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class COMPOSITE {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE";
    private static AsymmetricKeyInfoConverter baseConverter;
    private static final Map<String, String> compositeAttributes;

    public static class KeyFactory extends BaseKeyFactorySpi {
        @Override // java.security.KeyFactorySpi
        public Key engineTranslateKey(Key key) throws InvalidKeyException {
            try {
                if (key instanceof PrivateKey) {
                    return generatePrivate(C2756l.vip(key.getEncoded()));
                }
                if (key instanceof PublicKey) {
                    return generatePublic(C17029l.vip(key.getEncoded()));
                }
                C18073l.smaato("key not recognized");
                return null;
            } catch (IOException e) {
                throw new InvalidKeyException(AbstractC5020l.adcel(e, new StringBuilder("key could not be parsed: ")));
            }
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(C2756l c2756l) {
            return COMPOSITE.baseConverter.generatePrivate(c2756l);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(C17029l c17029l) {
            return COMPOSITE.baseConverter.generatePublic(c17029l);
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sbVip = AbstractC12900l.vip(configurableProvider, "KeyFactory.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.");
            Cfor cfor = InterfaceC4787l.Signature;
            StringBuilder sbLicense = AbstractC12900l.license(cfor, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.", AbstractC12900l.license(cfor, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.OID.", sbVip, configurableProvider), configurableProvider);
            Cfor cfor2 = InterfaceC4787l.license;
            StringBuilder sbLicense2 = AbstractC12900l.license(cfor2, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.OID.", sbLicense, configurableProvider);
            sbLicense2.append(cfor2);
            configurableProvider.addAlgorithm(sbLicense2.toString(), "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            AsymmetricKeyInfoConverter unused = COMPOSITE.baseConverter = new KeyFactorySpi(new C7972l(21, (BouncyCastleProvider) configurableProvider));
            configurableProvider.addKeyInfoConverter(cfor, COMPOSITE.baseConverter);
            configurableProvider.addKeyInfoConverter(cfor2, COMPOSITE.baseConverter);
        }
    }

    static {
        HashMap map = new HashMap();
        compositeAttributes = map;
        map.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
