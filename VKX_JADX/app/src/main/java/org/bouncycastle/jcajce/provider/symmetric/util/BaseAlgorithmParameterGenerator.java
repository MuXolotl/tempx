package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.C7633l;
import defpackage.InterfaceC12575l;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAlgorithmParameterGenerator extends AlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    private final InterfaceC12575l helper = new C7633l();
    protected int strength = 1024;

    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.advert(str);
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }
}
