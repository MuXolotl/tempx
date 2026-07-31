package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import defpackage.AbstractC11696l;
import defpackage.AbstractC11918l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC7016l;
import defpackage.C10198l;
import defpackage.C10825l;
import defpackage.C11327l;
import defpackage.C12726l;
import defpackage.C13777l;
import defpackage.C14287l;
import defpackage.C16217l;
import defpackage.C17029l;
import defpackage.C17209l;
import defpackage.C18073l;
import defpackage.C2756l;
import defpackage.C7100l;
import defpackage.C7130l;
import defpackage.C7154l;
import defpackage.C7838l;
import defpackage.C8374l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cinterface;
import defpackage.Cstrictfp;
import defpackage.Cthrow;
import defpackage.Cvolatile;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC18238l;
import defpackage.advert;
import defpackage.applovin;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class BCECGOST3410PrivateKey implements ECPrivateKey, InterfaceC18238l, InterfaceC12233l {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient applovin gostParams;
    private transient advert publicKey;
    private boolean withCompression;

    public BCECGOST3410PrivateKey(String str, C8374l c8374l, BCECGOST3410PublicKey bCECGOST3410PublicKey, C12726l c12726l) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c8374l.f17335l;
        if (c12726l == null) {
            C7838l c7838l = c8374l.f4542l;
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), EC5Util.convertPoint(c12726l.f25095l), c12726l.f25099l, c12726l.f25098l.intValue());
        }
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    private void extractBytes(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    private advert getPublicKeyDetails(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        try {
            return C17029l.vip(Ccase.advert(bCECGOST3410PublicKey.getEncoded())).f33174l;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    private void populateFromPrivKeyInfo(C2756l c2756l) {
        ECParameterSpec eCParameterSpec;
        Ccase ccaseAds;
        applovin applovinVar = c2756l.f5961l.f20786l;
        Ccase ccaseBilling = applovinVar.billing();
        if ((ccaseBilling instanceof Cclass) && (Cclass.inmobi(ccaseBilling).size() == 2 || Cclass.inmobi(ccaseBilling).size() == 3)) {
            C13777l c13777lVip = C13777l.vip(applovinVar);
            this.gostParams = c13777lVip;
            C17209l c17209lLoadAd = AbstractC7016l.loadAd(AbstractC11696l.purchase(c13777lVip.f26893l));
            this.ecSpec = new C10825l(AbstractC11696l.purchase(c13777lVip.f26893l), EC5Util.convertCurve(c17209lLoadAd.f25097l, c17209lLoadAd.f25096l), EC5Util.convertPoint(c17209lLoadAd.f25095l), c17209lLoadAd.f25099l, c17209lLoadAd.f25098l);
            Ccase ccaseAds2 = c2756l.ads();
            if (ccaseAds2 instanceof Cstrictfp) {
                this.d = Cstrictfp.premium(ccaseAds2).applovin();
                return;
            }
            byte[] bArr = Cthrow.premium(ccaseAds2).f36593l;
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i != bArr.length; i++) {
                bArr2[i] = bArr[(bArr.length - 1) - i];
            }
            this.d = new BigInteger(1, bArr2);
            return;
        }
        Ccase ccase = C7130l.vip(applovinVar).f14935l;
        if (!(ccase instanceof Cfor)) {
            if (ccase instanceof Cvolatile) {
                this.ecSpec = null;
            } else {
                C7100l c7100lVip = C7100l.vip(ccase);
                eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(c7100lVip.f14871l.f6465l, c7100lVip.metrica()), EC5Util.convertPoint(c7100lVip.f14870l.vip()), c7100lVip.f14874l, c7100lVip.f14873l.intValue());
            }
            ccaseAds = c2756l.ads();
            if (ccaseAds instanceof Cstrictfp) {
                this.d = Cstrictfp.premium(ccaseAds).appmetrica();
                return;
            }
            C7154l c7154lVip = C7154l.vip(ccaseAds);
            this.d = c7154lVip.metrica();
            this.publicKey = c7154lVip.tapsense();
        }
        Cfor cforM192throws = Cfor.m192throws(ccase);
        C7100l namedCurveByOid = ECUtil.getNamedCurveByOid(cforM192throws);
        if (namedCurveByOid == null) {
            C18073l.admob();
            return;
        }
        eCParameterSpec = new C10825l(ECUtil.getCurveName(cforM192throws), EC5Util.convertCurve(namedCurveByOid.f14871l.f6465l, namedCurveByOid.metrica()), EC5Util.convertPoint(namedCurveByOid.f14870l.vip()), namedCurveByOid.f14874l, namedCurveByOid.f14873l);
        this.ecSpec = eCParameterSpec;
        ccaseAds = c2756l.ads();
        if (ccaseAds instanceof Cstrictfp) {
            this.d = Cstrictfp.premium(ccaseAds).appmetrica();
            return;
        }
        C7154l c7154lVip2 = C7154l.vip(ccaseAds);
        this.d = c7154lVip2.metrica();
        this.publicKey = c7154lVip2.tapsense();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(C2756l.vip(Ccase.advert((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public C12726l engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PrivateKey)) {
            return false;
        }
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
        return getD().equals(bCECGOST3410PrivateKey.getD()) && engineGetSpec().equals(bCECGOST3410PrivateKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // defpackage.InterfaceC12233l
    public applovin getBagAttribute(Cfor cfor) {
        return this.attrCarrier.getBagAttribute(cfor);
    }

    @Override // defpackage.InterfaceC12233l
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // defpackage.InterfaceC18238l
    public BigInteger getD() {
        return this.d;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C7130l c7130l;
        int orderBitLength;
        try {
            if (this.gostParams != null) {
                byte[] bArr = new byte[32];
                extractBytes(bArr, 0, getS());
                return new C2756l(new C10198l(InterfaceC11987l.smaato, this.gostParams), new C11327l(bArr), (Cinterface) null, (byte[]) null).remoteconfig("DER");
            }
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof C10825l) {
                Cfor namedCurveOid = ECUtil.getNamedCurveOid(((C10825l) eCParameterSpec).f21882l);
                if (namedCurveOid == null) {
                    namedCurveOid = new Cfor(((C10825l) this.ecSpec).f21882l);
                }
                c7130l = new C7130l(namedCurveOid);
                orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, this.ecSpec.getOrder(), getS());
            } else if (eCParameterSpec == null) {
                c7130l = new C7130l();
                orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, null, getS());
            } else {
                AbstractC11918l abstractC11918lConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                c7130l = new C7130l(new C7100l(abstractC11918lConvertCurve, new C16217l(EC5Util.convertPoint(abstractC11918lConvertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, this.ecSpec.getOrder(), getS());
            }
            return new C2756l(new C10198l(InterfaceC11987l.smaato, c7130l.f14935l), (this.publicKey != null ? new C7154l(orderBitLength, getS(), this.publicKey, c7130l) : new C7154l(orderBitLength, getS(), null, c7130l)).f14964l, (Cinterface) null, (byte[]) null).remoteconfig("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
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

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.d;
    }

    @Override // defpackage.InterfaceC12233l
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    public int hashCode() {
        return engineGetSpec().hashCode() ^ getD().hashCode();
    }

    @Override // defpackage.InterfaceC12233l
    public void setBagAttribute(Cfor cfor, applovin applovinVar) {
        this.attrCarrier.setBagAttribute(cfor, applovinVar);
    }

    @Override // defpackage.InterfaceC12233l
    public void setFriendlyName(String str) {
        this.attrCarrier.setFriendlyName(str);
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.privateKeyToString(this.algorithm, this.d, engineGetSpec());
    }

    public BCECGOST3410PrivateKey(C14287l c14287l) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = c14287l.f27968l;
        C12726l c12726l = c14287l.f4939l;
        this.ecSpec = c12726l != null ? EC5Util.convertSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), c12726l) : null;
    }

    public BCECGOST3410PrivateKey(C2756l c2756l) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(c2756l);
    }

    public BCECGOST3410PrivateKey(String str, C8374l c8374l) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c8374l.f17335l;
        this.ecSpec = null;
    }

    public BCECGOST3410PrivateKey() {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECGOST3410PrivateKey(String str, C8374l c8374l, BCECGOST3410PublicKey bCECGOST3410PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c8374l.f17335l;
        if (eCParameterSpec == null) {
            C7838l c7838l = c8374l.f4542l;
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410PrivateKey(BCECGOST3410PrivateKey bCECGOST3410PrivateKey) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = bCECGOST3410PrivateKey.d;
        this.ecSpec = bCECGOST3410PrivateKey.ecSpec;
        this.withCompression = bCECGOST3410PrivateKey.withCompression;
        this.attrCarrier = bCECGOST3410PrivateKey.attrCarrier;
        this.publicKey = bCECGOST3410PrivateKey.publicKey;
        this.gostParams = bCECGOST3410PrivateKey.gostParams;
    }
}
