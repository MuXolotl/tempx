package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.C17132l;
import defpackage.C18262l;
import defpackage.C18725l;
import defpackage.C7286l;
import defpackage.Ccase;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class PBEPKCS12 {

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = PBEPKCS12.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            AbstractC11043l.vip(PREFIX, "$AlgParams", "AlgorithmParameters.PKCS12PBE", new StringBuilder(), configurableProvider);
        }
    }

    private PBEPKCS12() {
    }

    public static class AlgParams extends BaseAlgorithmParameters {
        C7286l params;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            try {
                return this.params.remoteconfig("DER");
            } catch (IOException e) {
                C18725l.purchase(e, "Oooops! ");
                return null;
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                C17132l.startapp("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
            } else {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.params = new C7286l(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "PKCS12 PBE Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                C7286l c7286l = this.params;
                return new PBEParameterSpec(c7286l.f15133l.f36593l, c7286l.f15134l.appmetrica().intValue());
            }
            C17132l.startapp("unknown parameter spec passed to PKCS12 PBE parameters object.");
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
        public void engineInit(byte[] bArr) {
            this.params = C7286l.vip(Ccase.advert(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                engineInit(bArr);
            } else {
                C18262l.metrica("Unknown parameters format in PKCS12 PBE parameters object");
            }
        }
    }
}
