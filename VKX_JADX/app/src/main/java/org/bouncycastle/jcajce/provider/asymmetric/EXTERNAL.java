package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.AbstractC12900l;
import defpackage.AbstractC5020l;
import defpackage.C0610l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C2756l;
import defpackage.C6880l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.InterfaceC2522l;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* JADX INFO: loaded from: classes3.dex */
public class EXTERNAL {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL";
    private static AsymmetricKeyInfoConverter baseConverter;
    private static final Map<String, String> externalAttributes;

    public static class ExternalKeyInfoConverter implements AsymmetricKeyInfoConverter {
        private final ConfigurableProvider provider;

        public ExternalKeyInfoConverter(ConfigurableProvider configurableProvider) {
            this.provider = configurableProvider;
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(C2756l c2756l) {
            throw new UnsupportedOperationException("no support for private key");
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(C17029l c17029l) {
            Ccase ccaseMetrica = c17029l.metrica();
            return new C6880l(ccaseMetrica != null ? new C0610l(Cclass.inmobi(ccaseMetrica)) : null);
        }
    }

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
            return EXTERNAL.baseConverter.generatePrivate(c2756l);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(C17029l c17029l) {
            return EXTERNAL.baseConverter.generatePublic(c17029l);
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sbVip = AbstractC12900l.vip(configurableProvider, "KeyFactory.EXTERNAL", "org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL$KeyFactory", "KeyFactory.");
            Cfor cfor = InterfaceC2522l.f5458l;
            StringBuilder sbLicense = AbstractC12900l.license(cfor, "org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL$KeyFactory", "KeyFactory.OID.", sbVip, configurableProvider);
            sbLicense.append(cfor);
            configurableProvider.addAlgorithm(sbLicense.toString(), "org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL$KeyFactory");
            AsymmetricKeyInfoConverter unused = EXTERNAL.baseConverter = new ExternalKeyInfoConverter(configurableProvider);
            configurableProvider.addKeyInfoConverter(cfor, EXTERNAL.baseConverter);
        }
    }

    static {
        HashMap map = new HashMap();
        externalAttributes = map;
        map.put("SupportedKeyClasses", "org.bouncycastle.jcajce.ExternalPublicKey");
        map.put("SupportedKeyFormats", "X.509");
    }
}
