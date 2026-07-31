package org.bouncycastle.jce.provider;

import defpackage.AbstractC11918l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C10825l;
import defpackage.C12726l;
import defpackage.C14287l;
import defpackage.C16217l;
import defpackage.C17029l;
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
import defpackage.Cvolatile;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC15427l;
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

/* JADX INFO: loaded from: classes3.dex */
public class JCEECPrivateKey implements ECPrivateKey, InterfaceC18238l, InterfaceC12233l {
    private String algorithm;
    private PKCS12BagAttributeCarrierImpl attrCarrier;
    private BigInteger d;
    private ECParameterSpec ecSpec;
    private advert publicKey;
    private boolean withCompression;

    public JCEECPrivateKey(String str, C8374l c8374l, JCEECPublicKey jCEECPublicKey, C12726l c12726l) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c8374l.f17335l;
        if (c12726l == null) {
            C7838l c7838l = c8374l.f4542l;
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), EC5Util.convertPoint(c12726l.f25095l), c12726l.f25099l, c12726l.f25098l.intValue());
        }
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
    }

    private advert getPublicKeyDetails(JCEECPublicKey jCEECPublicKey) {
        try {
            return C17029l.vip(Ccase.advert(jCEECPublicKey.getEncoded())).f33174l;
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(C2756l c2756l) {
        Ccase ccase = C7130l.vip(c2756l.f5961l.f20786l).f14935l;
        if (ccase instanceof Cfor) {
            Cfor cforM192throws = Cfor.m192throws(ccase);
            C7100l namedCurveByOid = ECUtil.getNamedCurveByOid(cforM192throws);
            if (namedCurveByOid != null) {
                this.ecSpec = new C10825l(ECUtil.getCurveName(cforM192throws), EC5Util.convertCurve(namedCurveByOid.f14871l.f6465l, namedCurveByOid.metrica()), EC5Util.convertPoint(namedCurveByOid.f14870l.vip()), namedCurveByOid.f14874l, namedCurveByOid.f14873l);
            }
        } else if (ccase instanceof Cvolatile) {
            this.ecSpec = null;
        } else {
            C7100l c7100lVip = C7100l.vip(ccase);
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(c7100lVip.f14871l.f6465l, c7100lVip.metrica()), EC5Util.convertPoint(c7100lVip.f14870l.vip()), c7100lVip.f14874l, c7100lVip.f14873l.intValue());
        }
        Ccase ccaseAds = c2756l.ads();
        if (ccaseAds instanceof Cstrictfp) {
            this.d = Cstrictfp.premium(ccaseAds).appmetrica();
            return;
        }
        C7154l c7154lVip = C7154l.vip(ccaseAds);
        this.d = c7154lVip.metrica();
        this.publicKey = c7154lVip.tapsense();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        populateFromPrivKeyInfo(C2756l.vip(Ccase.advert((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
        PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = new PKCS12BagAttributeCarrierImpl();
        this.attrCarrier = pKCS12BagAttributeCarrierImpl;
        pKCS12BagAttributeCarrierImpl.readObject(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
        this.attrCarrier.writeObject(objectOutputStream);
    }

    public C12726l engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPrivateKey)) {
            return false;
        }
        JCEECPrivateKey jCEECPrivateKey = (JCEECPrivateKey) obj;
        return getD().equals(jCEECPrivateKey.getD()) && engineGetSpec().equals(jCEECPrivateKey.engineGetSpec());
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
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec instanceof C10825l) {
            Cfor namedCurveOid = ECUtil.getNamedCurveOid(((C10825l) eCParameterSpec).f21882l);
            if (namedCurveOid == null) {
                namedCurveOid = new Cfor(((C10825l) this.ecSpec).f21882l);
            }
            c7130l = new C7130l(namedCurveOid);
        } else if (eCParameterSpec == null) {
            c7130l = new C7130l();
        } else {
            AbstractC11918l abstractC11918lConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            c7130l = new C7130l(new C7100l(abstractC11918lConvertCurve, new C16217l(EC5Util.convertPoint(abstractC11918lConvertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
        }
        ECParameterSpec eCParameterSpec2 = this.ecSpec;
        int orderBitLength = eCParameterSpec2 == null ? ECUtil.getOrderBitLength(null, null, getS()) : ECUtil.getOrderBitLength(null, eCParameterSpec2.getOrder(), getS());
        try {
            Cclass cclass = (this.publicKey != null ? new C7154l(orderBitLength, getS(), this.publicKey, c7130l) : new C7154l(orderBitLength, getS(), null, c7130l)).f14964l;
            boolean zEquals = this.algorithm.equals("ECGOST3410");
            Ccase ccase = c7130l.f14935l;
            return (zEquals ? new C2756l(new C10198l(InterfaceC11987l.smaato, ccase), cclass, (Cinterface) null, (byte[]) null) : new C2756l(new C10198l(InterfaceC15427l.f30173l, ccase), cclass, (Cinterface) null, (byte[]) null)).remoteconfig("DER");
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
        StringBuilder sb = new StringBuilder("EC Private Key");
        String str = AbstractC9008l.yandex;
        sb.append(str);
        sb.append("             S: ");
        sb.append(this.d.toString(16));
        sb.append(str);
        return sb.toString();
    }

    public JCEECPrivateKey(C2756l c2756l) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(c2756l);
    }

    public JCEECPrivateKey(String str, C8374l c8374l) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c8374l.f17335l;
        this.ecSpec = null;
    }

    public JCEECPrivateKey() {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public JCEECPrivateKey(String str, C8374l c8374l, JCEECPublicKey jCEECPublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c8374l.f17335l;
        if (eCParameterSpec == null) {
            C7838l c7838l = c8374l.f4542l;
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
    }

    public JCEECPrivateKey(String str, C14287l c14287l) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c14287l.f27968l;
        C12726l c12726l = c14287l.f4939l;
        this.ecSpec = c12726l != null ? EC5Util.convertSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), c12726l) : null;
    }

    public JCEECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public JCEECPrivateKey(String str, JCEECPrivateKey jCEECPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = jCEECPrivateKey.d;
        this.ecSpec = jCEECPrivateKey.ecSpec;
        this.withCompression = jCEECPrivateKey.withCompression;
        this.attrCarrier = jCEECPrivateKey.attrCarrier;
        this.publicKey = jCEECPrivateKey.publicKey;
    }

    public JCEECPrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }
}
