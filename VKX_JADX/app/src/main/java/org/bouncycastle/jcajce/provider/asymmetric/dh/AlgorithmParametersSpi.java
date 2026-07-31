package org.bouncycastle.jcajce.provider.asymmetric.dh;

import defpackage.AbstractC14814l;
import defpackage.C13061l;
import defpackage.C17132l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C6541l;
import defpackage.Cstrictfp;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    DHParameterSpec currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new C13061l(this.currentSpec.getL(), this.currentSpec.getP(), this.currentSpec.getG()).remoteconfig("DER");
        } catch (IOException unused) {
            C18073l.license("Error encoding DHParameters");
            return null;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        C6541l.subs("argument to getParameterSpec must not be null");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        try {
            C13061l c13061lVip = C13061l.vip(bArr);
            BigInteger bigIntegerMetrica = c13061lVip.metrica();
            Cstrictfp cstrictfp = c13061lVip.f25573l;
            Cstrictfp cstrictfp2 = c13061lVip.f25574l;
            if (bigIntegerMetrica != null) {
                this.currentSpec = new DHParameterSpec(cstrictfp2.applovin(), cstrictfp.applovin(), c13061lVip.metrica().intValue());
            } else {
                this.currentSpec = new DHParameterSpec(cstrictfp2.applovin(), cstrictfp.applovin());
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            C18262l.metrica("Not a valid DH Parameter encoding.");
        } catch (ClassCastException unused2) {
            C18262l.metrica("Not a valid DH Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Diffie-Hellman Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == DHParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        C17132l.startapp("unknown parameter spec passed to DH parameters object.");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str)) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            this.currentSpec = (DHParameterSpec) algorithmParameterSpec;
        } else {
            C17132l.startapp("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str)) {
            engineInit(bArr);
        } else {
            C18262l.metrica(AbstractC14814l.startapp("Unknown parameter format ", str));
        }
    }
}
