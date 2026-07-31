package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.AbstractC2509l;
import defpackage.C10198l;
import defpackage.C10307l;
import defpackage.C11327l;
import defpackage.C12547l;
import defpackage.C14998l;
import defpackage.C17132l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C6541l;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.Cthrow;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC8134l;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.jcajce.provider.util.DigestFactory;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        C6541l.subs("argument to getParameterSpec must not be null");
        return null;
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls);

    public static class OAEP extends AlgorithmParametersSpi {
        OAEPParameterSpec currentSpec;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            Cfor oid = DigestFactory.getOID(this.currentSpec.getDigestAlgorithm());
            C14998l c14998l = C14998l.f29509l;
            C10198l c10198l = new C10198l(oid, c14998l);
            C10198l c10198l2 = new C10198l(InterfaceC0543l.f1864class, new C10198l(DigestFactory.getOID(((MGF1ParameterSpec) this.currentSpec.getMGFParameters()).getDigestAlgorithm()), c14998l));
            C10198l c10198l3 = new C10198l(InterfaceC0543l.f1875interface, new C11327l(((PSource.PSpecified) this.currentSpec.getPSource()).getValue()));
            C12547l c12547l = new C12547l();
            c12547l.f24736l = c10198l;
            c12547l.f24735l = c10198l2;
            c12547l.f24734l = c10198l3;
            try {
                return c12547l.remoteconfig("DER");
            } catch (IOException unused) {
                C18073l.license("Error encoding OAEPParameters");
                return null;
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            try {
                C12547l c12547lVip = C12547l.vip(bArr);
                C10198l c10198l = c12547lVip.f24735l;
                if (c10198l.f20787l.ad(InterfaceC0543l.f1864class)) {
                    this.currentSpec = new OAEPParameterSpec(AbstractC2509l.yandex(c12547lVip.f24736l.f20787l), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(AbstractC2509l.yandex(C10198l.vip(c10198l.f20786l).f20787l)), new PSource.PSpecified(Cthrow.premium(c12547lVip.f24734l.f20786l).f36593l));
                } else {
                    throw new IOException("unknown mask generation function: " + c10198l.f20787l);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                C18262l.metrica("Not a valid OAEP Parameter encoding.");
            } catch (ClassCastException unused2) {
                C18262l.metrica("Not a valid OAEP Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "OAEP Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == OAEPParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.currentSpec;
            }
            C17132l.startapp("unknown parameter spec passed to OAEP parameters object.");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof OAEPParameterSpec) {
                this.currentSpec = (OAEPParameterSpec) algorithmParameterSpec;
            } else {
                C17132l.startapp("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                engineInit(bArr);
            } else {
                C18262l.metrica("Unknown parameter format ".concat(str));
            }
        }
    }

    public static class PSS extends AlgorithmParametersSpi {
        PSSParameterSpec currentSpec;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            PSSParameterSpec pSSParameterSpec = this.currentSpec;
            Cfor oid = DigestFactory.getOID(pSSParameterSpec.getDigestAlgorithm());
            Cfor cfor = InterfaceC8134l.firebase;
            boolean zAd = cfor.ad(oid);
            C14998l c14998l = C14998l.f29509l;
            C10198l c10198l = (zAd || InterfaceC8134l.smaato.ad(oid)) ? new C10198l(oid) : new C10198l(oid, c14998l);
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            if (mGF1ParameterSpec != null) {
                return new C10307l(c10198l, new C10198l(InterfaceC0543l.f1864class, new C10198l(DigestFactory.getOID(mGF1ParameterSpec.getDigestAlgorithm()), c14998l)), Cstrictfp.m4580private(pSSParameterSpec.getSaltLength()), Cstrictfp.m4580private(pSSParameterSpec.getTrailerField())).remoteconfig("DER");
            }
            if (!pSSParameterSpec.getMGFAlgorithm().equals("SHAKE128")) {
                cfor = InterfaceC8134l.smaato;
            }
            return new C10307l(c10198l, new C10198l(cfor), Cstrictfp.m4580private(pSSParameterSpec.getSaltLength()), Cstrictfp.m4580private(pSSParameterSpec.getTrailerField())).remoteconfig("DER");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            try {
                C10307l c10307lVip = C10307l.vip(bArr);
                C10198l c10198l = c10307lVip.f21017l;
                Cstrictfp cstrictfp = c10307lVip.f21019l;
                Cstrictfp cstrictfp2 = c10307lVip.f21016l;
                C10198l c10198l2 = c10307lVip.f21017l;
                C10198l c10198l3 = c10307lVip.f21018l;
                Cfor cfor = c10198l.f20787l;
                if (cfor.ad(InterfaceC0543l.f1864class)) {
                    this.currentSpec = new PSSParameterSpec(AbstractC2509l.yandex(c10198l3.f20787l), PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(AbstractC2509l.yandex(C10198l.vip(c10198l2.f20786l).f20787l)), cstrictfp2.appmetrica().intValue(), cstrictfp.appmetrica().intValue());
                    return;
                }
                Cfor cfor2 = InterfaceC8134l.firebase;
                if (!cfor.ad(cfor2) && !cfor.ad(InterfaceC8134l.smaato)) {
                    throw new IOException("unknown mask generation function: " + c10198l2.f20787l);
                }
                this.currentSpec = new PSSParameterSpec(AbstractC2509l.yandex(c10198l3.f20787l), cfor.ad(cfor2) ? "SHAKE128" : "SHAKE256", null, cstrictfp2.appmetrica().intValue(), cstrictfp.appmetrica().intValue());
            } catch (ArrayIndexOutOfBoundsException unused) {
                C18262l.metrica("Not a valid PSS Parameter encoding.");
            } catch (ClassCastException unused2) {
                C18262l.metrica("Not a valid PSS Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "PSS Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PSSParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.currentSpec;
            }
            C17132l.startapp("unknown parameter spec passed to PSS parameters object.");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof PSSParameterSpec) {
                this.currentSpec = (PSSParameterSpec) algorithmParameterSpec;
            } else {
                C17132l.startapp("PSSParameterSpec required to initialise an PSS algorithm parameters object");
            }
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
}
