package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import defpackage.C11138l;
import defpackage.C14060l;
import defpackage.C17132l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C8414l;
import defpackage.Ccase;
import defpackage.Cstrictfp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParametersSpi extends BaseAlgorithmParameters {
    C14060l currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        C14060l c14060l = this.currentSpec;
        BigInteger bigInteger = c14060l.f27407l;
        BigInteger bigInteger2 = c14060l.f27406l;
        Cstrictfp cstrictfp = new Cstrictfp(bigInteger);
        Cstrictfp cstrictfp2 = new Cstrictfp(bigInteger2);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C11138l(cstrictfp, cstrictfp2).tapsense(byteArrayOutputStream, "DER");
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            C18073l.license("Error encoding ElGamalParameters");
            return null;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        boolean z = algorithmParameterSpec instanceof C14060l;
        if (!z && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            C17132l.startapp("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
        } else if (z) {
            this.currentSpec = (C14060l) algorithmParameterSpec;
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.currentSpec = new C14060l(dHParameterSpec.getP(), dHParameterSpec.getG());
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "ElGamal Parameters";
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == C14060l.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        if (cls == DHParameterSpec.class) {
            C14060l c14060l = this.currentSpec;
            return new DHParameterSpec(c14060l.f27407l, c14060l.f27406l);
        }
        C17132l.startapp("unknown parameter spec passed to ElGamal parameters object.");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        try {
            C8414l c8414lVip = C8414l.vip(Ccase.advert(bArr));
            this.currentSpec = new C14060l(c8414lVip.f17421l.applovin(), c8414lVip.f17420l.applovin());
        } catch (ArrayIndexOutOfBoundsException unused) {
            C18262l.metrica("Not a valid ElGamal Parameter encoding.");
        } catch (ClassCastException unused2) {
            C18262l.metrica("Not a valid ElGamal Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
        } else {
            C18262l.metrica("Unknown parameter format ".concat(str));
        }
    }
}
