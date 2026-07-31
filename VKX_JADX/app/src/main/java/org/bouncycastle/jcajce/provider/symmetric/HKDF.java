package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.C17711l;
import defpackage.C2313l;
import defpackage.C2657l;
import defpackage.C5153l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC16922l;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class HKDF {

    public static class HKDFBase extends BaseSecretKeyFactory {
        protected String algName;
        protected C2313l hkdf;

        public HKDFBase(String str, InterfaceC16922l interfaceC16922l, Cfor cfor) {
            super(str, cfor);
            this.algName = str;
            this.hkdf = new C2313l(interfaceC16922l);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            throw new InvalidKeySpecException("invalid KeySpec: expected HKDFParameterSpec, but got ".concat(keySpec.getClass().getName()));
        }
    }

    public static class HKDFwithSHA256 extends HKDFBase {
        public HKDFwithSHA256() {
            super("HKDF-SHA256", new C2657l(), InterfaceC0543l.f1904l);
        }
    }

    public static class HKDFwithSHA384 extends HKDFBase {
        public HKDFwithSHA384() {
            super("HKDF-SHA384", new C5153l(), InterfaceC0543l.f1894l);
        }
    }

    public static class HKDFwithSHA512 extends HKDFBase {
        public HKDFwithSHA512() {
            super("HKDF-SHA512", new C17711l(), InterfaceC0543l.f1886l);
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = HKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            AbstractC11043l.vip(str, "$HKDFwithSHA512", "SecretKeyFactory.HKDF-SHA512", AbstractC11043l.subs(str, "$HKDFwithSHA384", "SecretKeyFactory.HKDF-SHA384", AbstractC11043l.subs(str, "$HKDFwithSHA256", "SecretKeyFactory.HKDF-SHA256", sb, configurableProvider), configurableProvider), configurableProvider);
        }
    }

    private HKDF() {
    }
}
