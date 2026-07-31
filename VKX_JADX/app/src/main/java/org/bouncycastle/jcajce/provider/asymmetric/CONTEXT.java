package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.C16833l;
import defpackage.C6541l;
import defpackage.C8339l;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class CONTEXT {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.CONTEXT$";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("AlgorithmParameters.CONTEXT", "org.bouncycastle.jcajce.provider.asymmetric.CONTEXT$ContextAlgorithmParametersSpi");
        }
    }

    public static class ContextAlgorithmParametersSpi extends AlgorithmParametersSpi {
        private C16833l contextParameterSpec;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            throw new IllegalStateException("not implemented");
        }

        @Override // java.security.AlgorithmParametersSpi
        public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
            if (cls == null) {
                C6541l.subs("argument to getParameterSpec must not be null");
                return null;
            }
            if (cls == C16833l.class) {
                return this.contextParameterSpec;
            }
            C8339l.metrica("argument to getParameterSpec must be ContextParameterSpec.class");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof C16833l) {
                this.contextParameterSpec = (C16833l) algorithmParameterSpec;
            } else {
                C8339l.metrica("argument to engineInit must be a ContextParameterSpec");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ContextParameterSpec";
        }

        public boolean isASN1FormatString(String str) {
            return str == null || str.equals("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            throw new IllegalStateException("not implemented");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            throw new IllegalStateException("not implemented");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) {
            throw new IllegalStateException("not implemented");
        }
    }
}
