package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

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
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC18238l;
import defpackage.InterfaceC18410l;
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
public class BCECGOST3410_2012PrivateKey implements ECPrivateKey, InterfaceC18238l, InterfaceC12233l {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient C13777l gostParams;
    private transient advert publicKey;
    private boolean withCompression;

    public BCECGOST3410_2012PrivateKey(String str, C8374l c8374l, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, C12726l c12726l) {
        this.algorithm = "ECGOST3410-2012";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        C7838l c7838l = c8374l.f4542l;
        this.algorithm = str;
        this.d = c8374l.f17335l;
        this.ecSpec = c12726l == null ? new ECParameterSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue()) : new ECParameterSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), EC5Util.convertPoint(c12726l.f25095l), c12726l.f25099l, c12726l.f25098l.intValue());
        this.gostParams = bCECGOST3410_2012PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410_2012PublicKey);
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

    private advert getPublicKeyDetails(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        return C17029l.vip(bCECGOST3410_2012PublicKey.getEncoded()).f33174l;
    }

    private void populateFromPrivKeyInfo(C2756l c2756l) {
        C10825l c10825l;
        C10198l c10198l = c2756l.f5961l;
        Ccase ccaseBilling = c10198l.f20786l.billing();
        if ((ccaseBilling instanceof Cclass) && Cclass.inmobi(ccaseBilling).size() <= 3) {
            C13777l c13777lVip = C13777l.vip(c10198l.f20786l);
            this.gostParams = c13777lVip;
            C17209l c17209lLoadAd = AbstractC7016l.loadAd(AbstractC11696l.purchase(c13777lVip.f26893l));
            this.ecSpec = new C10825l(AbstractC11696l.purchase(this.gostParams.f26893l), EC5Util.convertCurve(c17209lLoadAd.f25097l, c17209lLoadAd.f25096l), EC5Util.convertPoint(c17209lLoadAd.f25095l), c17209lLoadAd.f25099l, c17209lLoadAd.f25098l);
            byte[] bArr = c2756l.metrica().f36593l;
            if (bArr.length == 32 || bArr.length == 64) {
                this.d = new BigInteger(1, AbstractC14024l.license(bArr));
                return;
            }
            Ccase ccaseAds = c2756l.ads();
            if (ccaseAds instanceof Cstrictfp) {
                this.d = Cstrictfp.premium(ccaseAds).applovin();
                return;
            } else {
                this.d = new BigInteger(1, AbstractC14024l.license(Cthrow.premium(ccaseAds).f36593l));
                return;
            }
        }
        Ccase ccase = C7130l.vip(c10198l.f20786l).f14935l;
        if (ccase instanceof Cfor) {
            Cfor cforM192throws = Cfor.m192throws(ccase);
            C7100l namedCurveByOid = ECUtil.getNamedCurveByOid(cforM192throws);
            if (namedCurveByOid == null) {
                C7100l c7100lAmazon = AbstractC11696l.amazon(cforM192throws);
                c10825l = new C10825l(AbstractC11696l.purchase(cforM192throws), EC5Util.convertCurve(c7100lAmazon.f14871l.f6465l, c7100lAmazon.metrica()), EC5Util.convertPoint(c7100lAmazon.f14870l.vip()), c7100lAmazon.f14874l, c7100lAmazon.f14873l);
            } else {
                c10825l = new C10825l(ECUtil.getCurveName(cforM192throws), EC5Util.convertCurve(namedCurveByOid.f14871l.f6465l, namedCurveByOid.metrica()), EC5Util.convertPoint(namedCurveByOid.f14870l.vip()), namedCurveByOid.f14874l, namedCurveByOid.f14873l);
            }
            this.ecSpec = c10825l;
        } else if (ccase instanceof Cvolatile) {
            this.ecSpec = null;
        } else {
            C7100l c7100lVip = C7100l.vip(ccase);
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(c7100lVip.f14871l.f6465l, c7100lVip.metrica()), EC5Util.convertPoint(c7100lVip.f14870l.vip()), c7100lVip.f14874l, c7100lVip.f14873l.intValue());
        }
        Ccase ccaseAds2 = c2756l.ads();
        if (ccaseAds2 instanceof Cstrictfp) {
            this.d = Cstrictfp.premium(ccaseAds2).appmetrica();
            return;
        }
        C7154l c7154lVip = C7154l.vip(ccaseAds2);
        this.d = c7154lVip.metrica();
        this.publicKey = c7154lVip.tapsense();
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
        if (!(obj instanceof BCECGOST3410_2012PrivateKey)) {
            return false;
        }
        BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = (BCECGOST3410_2012PrivateKey) obj;
        return getD().equals(bCECGOST3410_2012PrivateKey.getD()) && engineGetSpec().equals(bCECGOST3410_2012PrivateKey.engineGetSpec());
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

    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d4  */
    @Override // java.security.Key
    public byte[] getEncoded() {
        C7130l c7130l;
        int orderBitLength;
        C7154l c7154l;
        boolean z = this.d.bitLength() > 256;
        Cfor cfor = z ? InterfaceC18410l.billing : InterfaceC18410l.purchase;
        int i = z ? 64 : 32;
        try {
            if (this.gostParams != null) {
                byte[] bArr = new byte[i];
                extractBytes(bArr, i, 0, getS());
                return new C2756l(new C10198l(cfor, this.gostParams), new C11327l(bArr), (Cinterface) null, (byte[]) null).remoteconfig("DER");
            }
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (!(eCParameterSpec instanceof C10825l)) {
                if (eCParameterSpec == null) {
                    c7130l = new C7130l();
                    orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, null, getS());
                } else {
                    AbstractC11918l abstractC11918lConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                    c7130l = new C7130l(new C7100l(abstractC11918lConvertCurve, new C16217l(EC5Util.convertPoint(abstractC11918lConvertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
                if (this.publicKey != null) {
                    c7154l = new C7154l(orderBitLength, getS(), this.publicKey, c7130l);
                } else {
                    c7154l = new C7154l(orderBitLength, getS(), null, c7130l);
                }
                return new C2756l(new C10198l(cfor, c7130l.f14935l), c7154l.f14964l, (Cinterface) null, (byte[]) null).remoteconfig("DER");
            }
            Cfor namedCurveOid = ECUtil.getNamedCurveOid(((C10825l) eCParameterSpec).f21882l);
            if (namedCurveOid == null) {
                namedCurveOid = new Cfor(((C10825l) this.ecSpec).f21882l);
            }
            c7130l = new C7130l(namedCurveOid);
            orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, this.ecSpec.getOrder(), getS());
            if (this.publicKey != null) {
                c7154l = new C7154l(orderBitLength, getS(), this.publicKey, c7130l);
            } else {
                c7154l = new C7154l(orderBitLength, getS(), null, c7130l);
            }
            return new C2756l(new C10198l(cfor, c7130l.f14935l), c7154l.f14964l, (Cinterface) null, (byte[]) null).remoteconfig("DER");
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

    public BCECGOST3410_2012PrivateKey(C14287l c14287l) {
        this.algorithm = "ECGOST3410-2012";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = c14287l.f27968l;
        C12726l c12726l = c14287l.f4939l;
        this.ecSpec = c12726l != null ? EC5Util.convertSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), c12726l) : null;
    }

    public BCECGOST3410_2012PrivateKey(C2756l c2756l) {
        this.algorithm = "ECGOST3410-2012";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(c2756l);
    }

    public BCECGOST3410_2012PrivateKey(String str, C8374l c8374l) {
        this.algorithm = "ECGOST3410-2012";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c8374l.f17335l;
        this.ecSpec = null;
    }

    public BCECGOST3410_2012PrivateKey() {
        this.algorithm = "ECGOST3410-2012";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECGOST3410_2012PrivateKey(String str, C8374l c8374l, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410-2012";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        C7838l c7838l = c8374l.f4542l;
        this.algorithm = str;
        this.d = c8374l.f17335l;
        if (eCParameterSpec == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.gostParams = bCECGOST3410_2012PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410_2012PublicKey);
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "ECGOST3410-2012";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "ECGOST3410-2012";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410_2012PrivateKey(BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey) {
        this.algorithm = "ECGOST3410-2012";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = bCECGOST3410_2012PrivateKey.d;
        this.ecSpec = bCECGOST3410_2012PrivateKey.ecSpec;
        this.withCompression = bCECGOST3410_2012PrivateKey.withCompression;
        this.attrCarrier = bCECGOST3410_2012PrivateKey.attrCarrier;
        this.publicKey = bCECGOST3410_2012PrivateKey.publicKey;
        this.gostParams = bCECGOST3410_2012PrivateKey.gostParams;
    }
}
