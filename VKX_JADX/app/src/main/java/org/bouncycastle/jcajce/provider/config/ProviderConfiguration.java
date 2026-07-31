package org.bouncycastle.jcajce.provider.config;

import defpackage.C12726l;
import java.security.spec.DSAParameterSpec;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public interface ProviderConfiguration {
    Set getAcceptableNamedCurves();

    Map getAdditionalECParameters();

    DHParameterSpec getDHDefaultParameters(int i);

    DSAParameterSpec getDSADefaultParameters(int i);

    C12726l getEcImplicitlyCa();
}
