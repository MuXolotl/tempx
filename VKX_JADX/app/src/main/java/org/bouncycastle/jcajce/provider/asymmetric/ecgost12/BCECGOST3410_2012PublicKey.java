package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import defpackage.AbstractC11696l;
import defpackage.AbstractC11918l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC7016l;
import defpackage.AbstractC8859l;
import defpackage.C10198l;
import defpackage.C10825l;
import defpackage.C11327l;
import defpackage.C12726l;
import defpackage.C13777l;
import defpackage.C16217l;
import defpackage.C17029l;
import defpackage.C17209l;
import defpackage.C4148l;
import defpackage.C6895l;
import defpackage.C7100l;
import defpackage.C7130l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.C8838l;
import defpackage.Ccase;
import defpackage.Cfor;
import defpackage.Cthrow;
import defpackage.InterfaceC0885l;
import defpackage.InterfaceC18410l;
import defpackage.advert;
import defpackage.applovin;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class BCECGOST3410_2012PublicKey implements ECPublicKey, InterfaceC0885l {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient C4148l ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private transient C13777l gostParams;
    private boolean withCompression;

    public BCECGOST3410_2012PublicKey(C8838l c8838l, ProviderConfiguration providerConfiguration) {
        this.algorithm = "ECGOST3410-2012";
        C12726l c12726l = c8838l.f4939l;
        AbstractC8859l abstractC8859l = c8838l.f18167l;
        if (c12726l != null) {
            EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l);
            this.ecPublicKey = new C4148l(abstractC8859l, ECUtil.getDomainParameters(providerConfiguration, c12726l));
            this.ecSpec = EC5Util.convertSpec(ellipticCurveConvertCurve, c12726l);
        } else {
            AbstractC11918l abstractC11918l = providerConfiguration.getEcImplicitlyCa().f25097l;
            abstractC8859l.loadAd();
            this.ecPublicKey = new C4148l(abstractC11918l.amazon(abstractC8859l.loadAd.signatures(), abstractC8859l.purchase().signatures()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.ecSpec = null;
        }
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, C7838l c7838l) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
    }

    private void extractBytes(byte[] bArr, int i, int i2, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
        }
    }

    private void populateFromPubKeyInfo(C17029l c17029l) {
        Cfor cfor = c17029l.f33175l.f20787l;
        advert advertVar = c17029l.f33174l;
        this.algorithm = "ECGOST3410-2012";
        try {
            byte[] bArr = ((Cthrow) Ccase.advert(advertVar.applovin())).f36593l;
            int i = cfor.ad(InterfaceC18410l.billing) ? 64 : 32;
            int i2 = i * 2;
            byte[] bArr2 = new byte[i2 + 1];
            bArr2[0] = 4;
            for (int i3 = 1; i3 <= i; i3++) {
                bArr2[i3] = bArr[i - i3];
                bArr2[i3 + i] = bArr[i2 - i3];
            }
            C13777l c13777lVip = C13777l.vip(c17029l.f33175l.f20786l);
            this.gostParams = c13777lVip;
            C17209l c17209lLoadAd = AbstractC7016l.loadAd(AbstractC11696l.purchase(c13777lVip.f26893l));
            AbstractC11918l abstractC11918l = c17209lLoadAd.f25097l;
            EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(abstractC11918l, c17209lLoadAd.f25096l);
            this.ecPublicKey = new C4148l(abstractC11918l.mopub(bArr2), ECUtil.getDomainParameters((ProviderConfiguration) null, c17209lLoadAd));
            this.ecSpec = new C10825l(AbstractC11696l.purchase(this.gostParams.f26893l), ellipticCurveConvertCurve, EC5Util.convertPoint(c17209lLoadAd.f25095l), c17209lLoadAd.f25099l, c17209lLoadAd.f25098l);
        } catch (IOException unused) {
            C8339l.metrica("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(C17029l.vip(Ccase.advert((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public C4148l engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    public C12726l engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PublicKey)) {
            return false;
        }
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = (BCECGOST3410_2012PublicKey) obj;
        return this.ecPublicKey.f8515l.amazon(bCECGOST3410_2012PublicKey.ecPublicKey.f8515l) && engineGetSpec().equals(bCECGOST3410_2012PublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        Cfor cfor;
        int i;
        C13777l c13777l;
        AbstractC8859l abstractC8859l = this.ecPublicKey.f8515l;
        abstractC8859l.loadAd();
        BigInteger bigIntegerSignatures = abstractC8859l.loadAd.signatures();
        BigInteger bigIntegerSignatures2 = this.ecPublicKey.f8515l.purchase().signatures();
        boolean z = bigIntegerSignatures.bitLength() > 256;
        applovin gostParams = getGostParams();
        if (gostParams == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof C10825l) {
                Cfor cforBilling = AbstractC11696l.billing(((C10825l) eCParameterSpec).f21882l);
                if (z) {
                    c13777l = new C13777l(cforBilling, InterfaceC18410l.loadAd);
                } else {
                    c13777l = (cforBilling.ad(InterfaceC18410l.smaato) || cforBilling.ad(InterfaceC18410l.remoteconfig) || cforBilling.ad(InterfaceC18410l.vip)) ? new C13777l(cforBilling, null) : new C13777l(cforBilling, InterfaceC18410l.yandex);
                }
                gostParams = c13777l;
            } else {
                AbstractC11918l abstractC11918lConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                gostParams = new C7130l(new C7100l(abstractC11918lConvertCurve, new C16217l(EC5Util.convertPoint(abstractC11918lConvertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
        }
        int i2 = 64;
        if (z) {
            cfor = InterfaceC18410l.billing;
            i = 64;
            i2 = 128;
        } else {
            cfor = InterfaceC18410l.purchase;
            i = 32;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2 / 2;
        extractBytes(bArr, i3, 0, bigIntegerSignatures);
        extractBytes(bArr, i3, i, bigIntegerSignatures2);
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new C17029l(new C10198l(cfor, gostParams), new C11327l(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public C13777l getGostParams() {
        C13777l c13777l;
        if (this.gostParams == null && (this.ecSpec instanceof C10825l)) {
            AbstractC8859l abstractC8859l = this.ecPublicKey.f8515l;
            abstractC8859l.loadAd();
            boolean z = abstractC8859l.loadAd.signatures().bitLength() > 256;
            Cfor cforBilling = AbstractC11696l.billing(((C10825l) this.ecSpec).f21882l);
            if (z) {
                c13777l = new C13777l(cforBilling, InterfaceC18410l.loadAd);
            } else {
                c13777l = (cforBilling.ad(InterfaceC18410l.smaato) || cforBilling.ad(InterfaceC18410l.remoteconfig) || cforBilling.ad(InterfaceC18410l.vip)) ? new C13777l(cforBilling, null) : new C13777l(cforBilling, InterfaceC18410l.yandex);
            }
            this.gostParams = c13777l;
        }
        return this.gostParams;
    }

    @Override // defpackage.InterfaceC11004l
    public C12726l getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // defpackage.InterfaceC0885l
    public AbstractC8859l getQ() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        C4148l c4148l = this.ecPublicKey;
        return eCParameterSpec == null ? c4148l.f8515l.startapp().crashlytics() : c4148l.f8515l;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.convertPoint(this.ecPublicKey.f8515l);
    }

    public int hashCode() {
        return engineGetSpec().hashCode() ^ this.ecPublicKey.f8515l.hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString(this.algorithm, this.ecPublicKey.f8515l, engineGetSpec());
    }

    public BCECGOST3410_2012PublicKey(C17029l c17029l) {
        this.algorithm = "ECGOST3410-2012";
        populateFromPubKeyInfo(c17029l);
    }

    public BCECGOST3410_2012PublicKey(String str, C4148l c4148l) {
        this.algorithm = str;
        this.ecPublicKey = c4148l;
        this.ecSpec = null;
    }

    public BCECGOST3410_2012PublicKey(String str, C4148l c4148l, C12726l c12726l) {
        ECParameterSpec eCParameterSpecConvertSpec;
        this.algorithm = "ECGOST3410-2012";
        C7838l c7838l = c4148l.f4542l;
        this.algorithm = str;
        this.ecPublicKey = c4148l;
        if (c12726l == null) {
            eCParameterSpecConvertSpec = createSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), c7838l);
        } else {
            eCParameterSpecConvertSpec = EC5Util.convertSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), c12726l);
        }
        this.ecSpec = eCParameterSpecConvertSpec;
    }

    public BCECGOST3410_2012PublicKey(String str, C4148l c4148l, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410-2012";
        C7838l c7838l = c4148l.f4542l;
        this.algorithm = str;
        this.ecPublicKey = c4148l;
        if (c7838l instanceof C6895l) {
            C6895l c6895l = (C6895l) c7838l;
            this.gostParams = new C13777l(c6895l.f14435l, c6895l.f14437l, c6895l.f14436l);
        }
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), c7838l);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCECGOST3410_2012PublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "ECGOST3410-2012";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new C4148l(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(null, eCPublicKey.getParams()));
    }

    public BCECGOST3410_2012PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "ECGOST3410-2012";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new C4148l(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410_2012PublicKey(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        this.algorithm = "ECGOST3410-2012";
        this.ecPublicKey = bCECGOST3410_2012PublicKey.ecPublicKey;
        this.ecSpec = bCECGOST3410_2012PublicKey.ecSpec;
        this.withCompression = bCECGOST3410_2012PublicKey.withCompression;
        this.gostParams = bCECGOST3410_2012PublicKey.gostParams;
    }
}
