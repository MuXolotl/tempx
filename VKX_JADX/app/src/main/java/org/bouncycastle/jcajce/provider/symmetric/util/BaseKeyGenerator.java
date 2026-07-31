package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.AbstractC8776l;
import defpackage.C14785l;
import defpackage.C18017l;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class BaseKeyGenerator extends KeyGeneratorSpi {
    protected String algName;
    protected int defaultKeySize;
    protected C18017l engine;
    protected int keySize;
    protected boolean uninitialised = true;

    public BaseKeyGenerator(String str, int i, C18017l c18017l) {
        this.algName = str;
        this.defaultKeySize = i;
        this.keySize = i;
        this.engine = c18017l;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        if (this.uninitialised) {
            this.engine.loadAd(new C14785l(this.defaultKeySize, AbstractC8776l.loadAd()));
            this.uninitialised = false;
        }
        return new SecretKeySpec(this.engine.yandex(), this.algName);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = AbstractC8776l.loadAd();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        this.engine.loadAd(new C14785l(i, secureRandom));
        this.uninitialised = false;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.engine.loadAd(new C14785l(this.defaultKeySize, secureRandom));
            this.uninitialised = false;
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }
}
