package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import defpackage.AbstractC0135l;
import defpackage.AbstractC11456l;
import defpackage.AbstractC11918l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC2426l;
import defpackage.AbstractC8859l;
import defpackage.C10198l;
import defpackage.C10825l;
import defpackage.C11327l;
import defpackage.C12726l;
import defpackage.C14772l;
import defpackage.C1550l;
import defpackage.C16217l;
import defpackage.C17029l;
import defpackage.C17209l;
import defpackage.C4148l;
import defpackage.C4301l;
import defpackage.C6304l;
import defpackage.C7100l;
import defpackage.C7130l;
import defpackage.C7838l;
import defpackage.C8339l;
import defpackage.C8838l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.Cthrow;
import defpackage.InterfaceC0885l;
import defpackage.InterfaceC18706l;
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
public class BCDSTU4145PublicKey implements ECPublicKey, InterfaceC0885l {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient C14772l dstuParams;
    private transient C4148l ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private boolean withCompression;

    public BCDSTU4145PublicKey(C8838l c8838l, ProviderConfiguration providerConfiguration) {
        this.algorithm = "DSTU4145";
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

    private void populateFromPubKeyInfo(C17029l c17029l) {
        C12726l c12726l;
        C7100l c7100lVip;
        ECParameterSpec eCParameterSpecConvertToSpec;
        advert advertVar = c17029l.f33174l;
        C10198l c10198l = c17029l.f33175l;
        this.algorithm = "DSTU4145";
        try {
            byte[] bArr = ((Cthrow) Ccase.advert(advertVar.applovin())).f36593l;
            Cfor cfor = c10198l.f20787l;
            Cfor cfor2 = c10198l.f20787l;
            Cfor cfor3 = InterfaceC18706l.yandex;
            if (cfor.ad(cfor3)) {
                reverseBytes(bArr);
            }
            Cclass cclassInmobi = Cclass.inmobi(c10198l.f20786l);
            if (cclassInmobi.mo173throws(0) instanceof Cstrictfp) {
                c7100lVip = C7100l.vip(cclassInmobi);
                c12726l = new C12726l(c7100lVip.f14871l.f6465l, c7100lVip.f14870l.vip(), c7100lVip.f14874l, c7100lVip.f14873l, c7100lVip.metrica());
            } else {
                C14772l c14772lVip = C14772l.vip(cclassInmobi);
                this.dstuParams = c14772lVip;
                Cfor cfor4 = c14772lVip.f28858l;
                if (cfor4 != null) {
                    C7838l c7838lLoadAd = AbstractC11456l.loadAd(cfor4);
                    c12726l = new C17209l(cfor4.inmobi(), c7838lLoadAd.f16360l, c7838lLoadAd.f16358l, c7838lLoadAd.f16362l, c7838lLoadAd.f16361l, AbstractC14024l.crashlytics(c7838lLoadAd.f16359l));
                } else {
                    C4301l c4301l = c14772lVip.f28857l;
                    byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c4301l.f8830l.f36593l);
                    if (cfor2.ad(cfor3)) {
                        reverseBytes(bArrCrashlytics);
                    }
                    C1550l c1550l = c4301l.f8827l;
                    C6304l c6304l = new C6304l(c1550l.f3837l, c1550l.f3836l, c1550l.f3835l, c1550l.f3838l, c4301l.f8826l.appmetrica(), new BigInteger(1, bArrCrashlytics), null, null);
                    byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(c4301l.f8831l.f36593l);
                    if (cfor2.ad(cfor3)) {
                        reverseBytes(bArrCrashlytics2);
                    }
                    c12726l = new C12726l(c6304l, AbstractC0135l.loadAd(c6304l, bArrCrashlytics2), c4301l.f8829l.appmetrica());
                }
                c7100lVip = null;
            }
            byte[] bArr2 = c12726l.f25096l;
            AbstractC11918l abstractC11918l = c12726l.f25097l;
            EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(abstractC11918l, bArr2);
            if (this.dstuParams != null) {
                ECPoint eCPointConvertPoint = EC5Util.convertPoint(c12726l.f25095l);
                Cfor cfor5 = this.dstuParams.f28858l;
                if (cfor5 != null) {
                    this.ecSpec = new C10825l(cfor5.inmobi(), ellipticCurveConvertCurve, eCPointConvertPoint, c12726l.f25099l, c12726l.f25098l);
                } else {
                    eCParameterSpecConvertToSpec = new ECParameterSpec(ellipticCurveConvertCurve, eCPointConvertPoint, c12726l.f25099l, c12726l.f25098l.intValue());
                }
                this.ecPublicKey = new C4148l(AbstractC0135l.loadAd(abstractC11918l, bArr), EC5Util.getDomainParameters(null, this.ecSpec));
            }
            eCParameterSpecConvertToSpec = EC5Util.convertToSpec(c7100lVip);
            this.ecSpec = eCParameterSpecConvertToSpec;
            this.ecPublicKey = new C4148l(AbstractC0135l.loadAd(abstractC11918l, bArr), EC5Util.getDomainParameters(null, this.ecSpec));
        } catch (IOException unused) {
            C8339l.metrica("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(C17029l.vip(Ccase.advert((byte[]) objectInputStream.readObject())));
    }

    private void reverseBytes(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
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
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        return this.ecPublicKey.f8515l.amazon(bCDSTU4145PublicKey.ecPublicKey.f8515l) && engineGetSpec().equals(bCDSTU4145PublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        applovin c7130l = this.dstuParams;
        if (c7130l == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof C10825l) {
                c7130l = new C14772l(new Cfor(((C10825l) this.ecSpec).f21882l));
            } else {
                AbstractC11918l abstractC11918lConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                c7130l = new C7130l(new C7100l(abstractC11918lConvertCurve, new C16217l(EC5Util.convertPoint(abstractC11918lConvertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
        }
        AbstractC8859l abstractC8859lStartapp = this.ecPublicKey.f8515l.startapp();
        abstractC8859lStartapp.loadAd();
        AbstractC2426l abstractC2426l = abstractC8859lStartapp.loadAd;
        byte[] bArrIsPro = abstractC2426l.isPro();
        if (!abstractC2426l.metrica()) {
            if (AbstractC0135l.billing(abstractC8859lStartapp.purchase().admob(abstractC2426l)).vip()) {
                int length = bArrIsPro.length - 1;
                bArrIsPro[length] = (byte) (bArrIsPro[length] | 1);
            } else {
                int length2 = bArrIsPro.length - 1;
                bArrIsPro[length2] = (byte) (bArrIsPro[length2] & 254);
            }
        }
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new C17029l(new C10198l(InterfaceC18706l.loadAd, c7130l), new C11327l(bArrIsPro)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
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
        AbstractC8859l abstractC8859l = this.ecPublicKey.f8515l;
        return this.ecSpec == null ? abstractC8859l.startapp().crashlytics() : abstractC8859l;
    }

    public byte[] getSbox() {
        C14772l c14772l = this.dstuParams;
        return c14772l != null ? AbstractC14024l.crashlytics(c14772l.f28856l) : AbstractC14024l.crashlytics(C14772l.f28855l);
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

    public BCDSTU4145PublicKey(C17029l c17029l) {
        this.algorithm = "DSTU4145";
        populateFromPubKeyInfo(c17029l);
    }

    public BCDSTU4145PublicKey(String str, C4148l c4148l) {
        this.algorithm = str;
        this.ecPublicKey = c4148l;
        this.ecSpec = null;
    }

    public BCDSTU4145PublicKey(String str, C4148l c4148l, C12726l c12726l) {
        ECParameterSpec eCParameterSpecConvertSpec;
        this.algorithm = "DSTU4145";
        C7838l c7838l = c4148l.f4542l;
        this.algorithm = str;
        if (c12726l == null) {
            eCParameterSpecConvertSpec = createSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), c7838l);
        } else {
            eCParameterSpecConvertSpec = EC5Util.convertSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), c12726l);
        }
        this.ecSpec = eCParameterSpecConvertSpec;
        this.ecPublicKey = c4148l;
    }

    public BCDSTU4145PublicKey(String str, C4148l c4148l, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        C7838l c7838l = c4148l.f4542l;
        this.algorithm = str;
        this.ecPublicKey = c4148l;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), c7838l);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "DSTU4145";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new C4148l(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, this.ecSpec));
    }

    public BCDSTU4145PublicKey(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        this.algorithm = "DSTU4145";
        this.ecPublicKey = bCDSTU4145PublicKey.ecPublicKey;
        this.ecSpec = bCDSTU4145PublicKey.ecSpec;
        this.withCompression = bCDSTU4145PublicKey.withCompression;
        this.dstuParams = bCDSTU4145PublicKey.dstuParams;
    }
}
