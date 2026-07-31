package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC9008l;
import defpackage.C13886l;
import defpackage.C18073l;
import defpackage.C2230l;
import defpackage.C8339l;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenSSLPBKDF {

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = OpenSSLPBKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            AbstractC11043l.vip(PREFIX, "$PBKDF", "SecretKeyFactory.PBKDF-OPENSSL", new StringBuilder(), configurableProvider);
        }
    }

    public static class PBKDF extends BaseSecretKeyFactory {
        public PBKDF() {
            super("PBKDF-OpenSSL", null);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                C18073l.subscription("Invalid KeySpec");
                return null;
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                C18073l.subscription("missing required salt");
                return null;
            }
            if (pBEKeySpec.getIterationCount() <= 0) {
                throw new InvalidKeySpecException("positive iteration count required: " + pBEKeySpec.getIterationCount());
            }
            if (pBEKeySpec.getKeyLength() <= 0) {
                throw new InvalidKeySpecException("positive key length required: " + pBEKeySpec.getKeyLength());
            }
            if (pBEKeySpec.getPassword().length == 0) {
                C8339l.metrica("password empty");
                return null;
            }
            C2230l c2230l = new C2230l();
            c2230l.crashlytics(AbstractC9008l.billing(pBEKeySpec.getPassword()), pBEKeySpec.getSalt());
            return new SecretKeySpec(((C13886l) c2230l.generateDerivedParameters(pBEKeySpec.getKeyLength())).f27156l, "OpenSSLPBKDF");
        }
    }

    private OpenSSLPBKDF() {
    }
}
