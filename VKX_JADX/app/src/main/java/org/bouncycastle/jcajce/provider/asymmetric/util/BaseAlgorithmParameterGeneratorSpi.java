package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.C7633l;
import defpackage.InterfaceC12575l;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAlgorithmParameterGeneratorSpi extends AlgorithmParameterGeneratorSpi {
    private final InterfaceC12575l helper = new C7633l();

    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.advert(str);
    }
}
