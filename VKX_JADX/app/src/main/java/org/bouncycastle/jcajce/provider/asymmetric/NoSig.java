package org.bouncycastle.jcajce.provider.asymmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.InterfaceC18049l;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureSpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class NoSig {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.NoSig$";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            AbstractC11043l.metrica(AbstractC12900l.license(InterfaceC18049l.f35341l, "org.bouncycastle.jcajce.provider.asymmetric.NoSig$SigSpi", "Signature.", new StringBuilder("Signature."), configurableProvider), InterfaceC18049l.f35344l, configurableProvider, "org.bouncycastle.jcajce.provider.asymmetric.NoSig$SigSpi");
        }
    }

    public static class SigSpi extends SignatureSpi {
        @Override // java.security.SignatureSpi
        public Object engineGetParameter(String str) {
            return null;
        }

        @Override // java.security.SignatureSpi
        public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
            throw new InvalidKeyException("attempt to pass private key to NoSig");
        }

        @Override // java.security.SignatureSpi
        public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
            throw new InvalidKeyException("attempt to pass public key to NoSig");
        }

        @Override // java.security.SignatureSpi
        public byte[] engineSign() {
            return new byte[0];
        }

        @Override // java.security.SignatureSpi
        public boolean engineVerify(byte[] bArr) {
            return false;
        }

        @Override // java.security.SignatureSpi
        public void engineUpdate(byte[] bArr, int i, int i2) {
        }

        @Override // java.security.SignatureSpi
        public void engineUpdate(byte b) {
        }

        @Override // java.security.SignatureSpi
        public void engineSetParameter(String str, Object obj) {
        }
    }
}
