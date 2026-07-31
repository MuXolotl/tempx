package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.AbstractC11043l;
import defpackage.AbstractC12900l;
import defpackage.C11327l;
import defpackage.C15320l;
import defpackage.C17132l;
import defpackage.C18262l;
import defpackage.C18725l;
import defpackage.C8339l;
import defpackage.Cclass;
import defpackage.Cstrictfp;
import defpackage.Cthrow;
import defpackage.InterfaceC0543l;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
public class PBEPBKDF1 {

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = PBEPBKDF1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("AlgorithmParameters.PBKDF1", PREFIX + "$AlgParams");
            AbstractC11043l.metrica(AbstractC12900l.license(InterfaceC0543l.f1924try, "PBKDF1", "Alg.Alias.AlgorithmParameters.", AbstractC12900l.license(InterfaceC0543l.f1921this, "PBKDF1", "Alg.Alias.AlgorithmParameters.", AbstractC12900l.license(InterfaceC0543l.f1870finally, "PBKDF1", "Alg.Alias.AlgorithmParameters.", AbstractC12900l.license(InterfaceC0543l.f1874instanceof, "PBKDF1", "Alg.Alias.AlgorithmParameters.", new StringBuilder("Alg.Alias.AlgorithmParameters."), configurableProvider), configurableProvider), configurableProvider), configurableProvider), InterfaceC0543l.f1861break, configurableProvider, "PBKDF1");
        }
    }

    private PBEPBKDF1() {
    }

    public static class AlgParams extends BaseAlgorithmParameters {
        C15320l params;

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
                C17132l.startapp("PBEParameterSpec required to initialise a PBKDF1 PBE parameters algorithm parameters object");
                return;
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            byte[] salt = pBEParameterSpec.getSalt();
            int iterationCount = pBEParameterSpec.getIterationCount();
            C15320l c15320l = new C15320l();
            if (salt.length != 8) {
                C8339l.metrica("salt length must be 8");
                return;
            }
            c15320l.f29947l = new C11327l(salt);
            c15320l.f29948l = Cstrictfp.m4580private(iterationCount);
            this.params = c15320l;
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "PBKDF1 Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                C15320l c15320l = this.params;
                return new PBEParameterSpec(c15320l.f29947l.f36593l, c15320l.f29948l.appmetrica().intValue());
            }
            C17132l.startapp("unknown parameter spec passed to PBKDF1 PBE parameters object.");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            C15320l c15320l;
            if (bArr instanceof C15320l) {
                c15320l = (C15320l) bArr;
            } else if (bArr != 0) {
                Cclass cclassInmobi = Cclass.inmobi(bArr);
                C15320l c15320l2 = new C15320l();
                c15320l2.f29947l = (Cthrow) cclassInmobi.mo173throws(0);
                c15320l2.f29948l = (Cstrictfp) cclassInmobi.mo173throws(1);
                c15320l = c15320l2;
            } else {
                c15320l = null;
            }
            this.params = c15320l;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                engineInit(bArr);
            } else {
                C18262l.metrica("Unknown parameters format in PBKDF2 parameters object");
            }
        }
    }
}
