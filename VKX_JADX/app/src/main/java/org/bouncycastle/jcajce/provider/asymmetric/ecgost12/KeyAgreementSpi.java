package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12900l;
import defpackage.AbstractC8831l;
import defpackage.C13527l;
import defpackage.C16665l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.C8374l;
import defpackage.InterfaceC0885l;
import defpackage.InterfaceC18238l;
import defpackage.InterfaceC6152l;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;

/* JADX INFO: loaded from: classes3.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private C16665l agreement;
    private String kaAlgorithm;
    private C7838l parameters;
    private byte[] result;

    public static class ECVKO256 extends KeyAgreementSpi {
        public ECVKO256() {
            super("ECGOST3410-2012-256", new C16665l(new C13527l()), null);
        }
    }

    public static class ECVKO512 extends KeyAgreementSpi {
        public ECVKO512() {
            super("ECGOST3410-2012-512", new C16665l(new C13527l()), null);
        }
    }

    public KeyAgreementSpi(String str, C16665l c16665l, InterfaceC6152l interfaceC6152l) {
        super(str, interfaceC6152l);
        this.kaAlgorithm = str;
        this.agreement = c16665l;
    }

    public static AbstractC8831l generatePublicKeyParameter(PublicKey publicKey) {
        return publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return this.result;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof PrivateKey)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.kaAlgorithm);
            sb.append(" key agreement requires ");
            throw new InvalidKeyException(AbstractC0653l.ads(sb, getSimpleName(InterfaceC18238l.class), " for initialisation"));
        }
        if (algorithmParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        this.parameters = ((C8374l) ECUtil.generatePrivateKeyParameter((PrivateKey) key)).f4542l;
        this.ukmParameters = null;
        throw null;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        StringBuilder sb;
        String str;
        String str2;
        if (this.parameters == null) {
            sb = new StringBuilder();
            str = this.kaAlgorithm;
            str2 = " not initialised.";
        } else {
            if (z) {
                if (!(key instanceof PublicKey)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.kaAlgorithm);
                    sb2.append(" key agreement requires ");
                    throw new InvalidKeyException(AbstractC0653l.ads(sb2, getSimpleName(InterfaceC0885l.class), " for doPhase"));
                }
                try {
                    this.result = this.agreement.yandex(generatePublicKeyParameter((PublicKey) key));
                    return null;
                } catch (Exception e) {
                    throw new InvalidKeyException(AbstractC12900l.admob(e, new StringBuilder("calculation failed: "))) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi.1
                        @Override // java.lang.Throwable
                        public Throwable getCause() {
                            return e;
                        }
                    };
                }
            }
            sb = new StringBuilder();
            str = this.kaAlgorithm;
            str2 = " can only be between two parties.";
        }
        C8339l.smaato(AbstractC0653l.ads(sb, str, str2));
        return null;
    }
}
