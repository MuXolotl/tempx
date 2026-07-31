package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.AbstractC14024l;
import defpackage.C10754l;
import defpackage.C11327l;
import defpackage.C17132l;
import defpackage.C18262l;
import defpackage.Ccase;
import defpackage.Cthrow;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class IvAlgorithmParameters extends BaseAlgorithmParameters {
    private byte[] iv;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str)) {
            return new C11327l(engineGetEncoded("RAW")).getEncoded();
        }
        if (str.equals("RAW")) {
            return AbstractC14024l.crashlytics(this.iv);
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str)) {
            try {
                engineInit(((Cthrow) Ccase.advert(bArr)).f36593l);
                return;
            } catch (Exception e) {
                C10754l.pro(e, "Exception decoding: ");
                return;
            }
        }
        if (str.equals("RAW")) {
            engineInit(bArr);
        } else {
            C18262l.metrica("Unknown parameters format in IV parameters object");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "IV Parameters";
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return new IvParameterSpec(this.iv);
        }
        C17132l.startapp("unknown parameter spec passed to IV parameters object.");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) {
        if (bArr.length % 8 != 0 && bArr[0] == 4 && bArr[1] == bArr.length - 2) {
            bArr = ((Cthrow) Ccase.advert(bArr)).f36593l;
        }
        this.iv = AbstractC14024l.crashlytics(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
        } else {
            C17132l.startapp("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }
    }
}
