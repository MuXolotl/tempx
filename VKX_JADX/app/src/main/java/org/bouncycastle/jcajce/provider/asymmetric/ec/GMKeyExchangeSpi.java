package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC0653l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC3021l;
import defpackage.C0709l;
import defpackage.C1152l;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;

/* JADX INFO: loaded from: classes3.dex */
public class GMKeyExchangeSpi extends BaseAgreementSpi {
    private final C1152l engine;
    private final String kaAlgorithm;
    private byte[] result;
    private AbstractC3021l spec;

    public static class SM2 extends GMKeyExchangeSpi {
        public SM2() {
            super("SM2");
        }
    }

    public GMKeyExchangeSpi(String str) {
        super(str, null);
        this.kaAlgorithm = str;
        new C0709l();
        this.engine = new C1152l();
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return AbstractC14024l.crashlytics(this.result);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        if (key instanceof PrivateKey) {
            if (algorithmParameterSpec != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.kaAlgorithm);
        sb.append(" key agreement requires ");
        throw new InvalidKeyException(AbstractC0653l.ads(sb, getSimpleName(BCECPrivateKey.class), " for initialisation"));
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) {
        throw new IllegalStateException(AbstractC0653l.ads(new StringBuilder(), this.kaAlgorithm, " not initialised."));
    }
}
