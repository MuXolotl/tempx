package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC11918l;
import defpackage.AbstractC8831l;
import defpackage.C10825l;
import defpackage.C16217l;
import defpackage.C7100l;
import defpackage.C7130l;
import defpackage.Cfor;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;

/* JADX INFO: loaded from: classes3.dex */
class ECUtils {
    public static AbstractC8831l generatePrivateKeyParameter(PrivateKey privateKey) {
        return privateKey instanceof BCECPrivateKey ? ((BCECPrivateKey) privateKey).engineGetKeyParameters() : ECUtil.generatePrivateKeyParameter(privateKey);
    }

    public static AbstractC8831l generatePublicKeyParameter(PublicKey publicKey) {
        return publicKey instanceof BCECPublicKey ? ((BCECPublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    public static C7100l getDomainParametersFromGenSpec(ECGenParameterSpec eCGenParameterSpec, ProviderConfiguration providerConfiguration) {
        return getDomainParametersFromName(eCGenParameterSpec.getName(), providerConfiguration);
    }

    public static C7130l getDomainParametersFromName(ECParameterSpec eCParameterSpec, boolean z) {
        if (!(eCParameterSpec instanceof C10825l)) {
            if (eCParameterSpec == null) {
                return new C7130l();
            }
            AbstractC11918l abstractC11918lConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new C7130l(new C7100l(abstractC11918lConvertCurve, new C16217l(EC5Util.convertPoint(abstractC11918lConvertCurve, eCParameterSpec.getGenerator()), z), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
        String str = ((C10825l) eCParameterSpec).f21882l;
        Cfor namedCurveOid = ECUtil.getNamedCurveOid(str);
        if (namedCurveOid == null) {
            namedCurveOid = new Cfor(str);
        }
        return new C7130l(namedCurveOid);
    }

    public static C7100l getDomainParametersFromName(String str, ProviderConfiguration providerConfiguration) {
        if (str == null || str.length() < 1) {
            return null;
        }
        int iIndexOf = str.indexOf(32);
        if (iIndexOf > 0) {
            str = str.substring(iIndexOf + 1);
        }
        Cfor cforM190private = Cfor.m190private(str);
        if (cforM190private == null) {
            return ECUtil.getNamedCurveByName(str);
        }
        C7100l namedCurveByOid = ECUtil.getNamedCurveByOid(cforM190private);
        return (namedCurveByOid != null || providerConfiguration == null) ? namedCurveByOid : (C7100l) providerConfiguration.getAdditionalECParameters().get(cforM190private);
    }
}
