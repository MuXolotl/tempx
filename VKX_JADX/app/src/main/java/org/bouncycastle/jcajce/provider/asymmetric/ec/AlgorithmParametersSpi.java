package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC11918l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC17195l;
import defpackage.C10825l;
import defpackage.C12726l;
import defpackage.C16217l;
import defpackage.C18262l;
import defpackage.C7100l;
import defpackage.C7130l;
import defpackage.Ccase;
import defpackage.Cfor;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private String curveName;
    private ECParameterSpec ecParameterSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        C7130l c7130l;
        if (!isASN1FormatString(str)) {
            C18262l.metrica(AbstractC14814l.startapp("Unknown parameters format in AlgorithmParameters object: ", str));
            return null;
        }
        ECParameterSpec eCParameterSpec = this.ecParameterSpec;
        if (eCParameterSpec == null) {
            c7130l = new C7130l();
        } else {
            String str2 = this.curveName;
            if (str2 != null) {
                c7130l = new C7130l(ECUtil.getNamedCurveOid(str2));
            } else {
                C12726l c12726lConvertSpec = EC5Util.convertSpec(eCParameterSpec);
                c7130l = new C7130l(new C7100l(c12726lConvertSpec.f25097l, new C16217l(c12726lConvertSpec.f25095l, false), c12726lConvertSpec.f25099l, c12726lConvertSpec.f25098l, c12726lConvertSpec.f25096l));
            }
        }
        return c7130l.getEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
            return this.ecParameterSpec;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
            String str = this.curveName;
            if (str != null) {
                Cfor namedCurveOid = ECUtil.getNamedCurveOid(str);
                return namedCurveOid != null ? new ECGenParameterSpec(namedCurveOid.inmobi()) : new ECGenParameterSpec(this.curveName);
            }
            Cfor namedCurveOid2 = ECUtil.getNamedCurveOid(EC5Util.convertSpec(this.ecParameterSpec));
            if (namedCurveOid2 != null) {
                return new ECGenParameterSpec(namedCurveOid2.inmobi());
            }
        }
        throw new InvalidParameterSpecException("EC AlgorithmParameters cannot convert to ".concat(cls.getName()));
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof ECGenParameterSpec)) {
            if (!(algorithmParameterSpec instanceof ECParameterSpec)) {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
            }
            this.curveName = algorithmParameterSpec instanceof C10825l ? ((C10825l) algorithmParameterSpec).f21882l : null;
            this.ecParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            return;
        }
        ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
        C7100l domainParametersFromGenSpec = ECUtils.getDomainParametersFromGenSpec(eCGenParameterSpec, BouncyCastleProvider.CONFIGURATION);
        if (domainParametersFromGenSpec != null) {
            this.curveName = eCGenParameterSpec.getName();
            ECParameterSpec eCParameterSpecConvertToSpec = EC5Util.convertToSpec(domainParametersFromGenSpec);
            this.ecParameterSpec = new C10825l(this.curveName, eCParameterSpecConvertToSpec.getCurve(), eCParameterSpecConvertToSpec.getGenerator(), eCParameterSpecConvertToSpec.getOrder(), BigInteger.valueOf(eCParameterSpecConvertToSpec.getCofactor()));
        } else {
            throw new InvalidParameterSpecException("EC curve name not recognized: " + eCGenParameterSpec.getName());
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "EC Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, "ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str)) {
            C7130l c7130lVip = C7130l.vip(bArr);
            AbstractC11918l curve = EC5Util.getCurve(BouncyCastleProvider.CONFIGURATION, c7130lVip);
            Ccase ccase = c7130lVip.f14935l;
            if (ccase instanceof Cfor) {
                Cfor cforM192throws = Cfor.m192throws(ccase);
                String strSubs = AbstractC17195l.subs(cforM192throws);
                this.curveName = strSubs;
                if (strSubs == null) {
                    this.curveName = cforM192throws.inmobi();
                }
            }
            this.ecParameterSpec = EC5Util.convertToSpec(c7130lVip, curve);
            return;
        }
        C18262l.metrica(AbstractC14814l.startapp("Unknown encoded parameters format in AlgorithmParameters object: ", str));
    }
}
