package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import defpackage.AbstractC0135l;
import defpackage.AbstractC11456l;
import defpackage.AbstractC11918l;
import defpackage.AbstractC14024l;
import defpackage.C10198l;
import defpackage.C10825l;
import defpackage.C12726l;
import defpackage.C14287l;
import defpackage.C14772l;
import defpackage.C1550l;
import defpackage.C16217l;
import defpackage.C17029l;
import defpackage.C17209l;
import defpackage.C2756l;
import defpackage.C4301l;
import defpackage.C6304l;
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
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC18238l;
import defpackage.InterfaceC18706l;
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
public class BCDSTU4145PrivateKey implements ECPrivateKey, InterfaceC18238l, InterfaceC12233l {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient advert publicKey;
    private boolean withCompression;

    public BCDSTU4145PrivateKey(String str, C8374l c8374l, BCDSTU4145PublicKey bCDSTU4145PublicKey, C12726l c12726l) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        C7838l c7838l = c8374l.f4542l;
        this.algorithm = str;
        this.d = c8374l.f17335l;
        this.ecSpec = c12726l == null ? new ECParameterSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue()) : new ECParameterSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), EC5Util.convertPoint(c12726l.f25095l), c12726l.f25099l, c12726l.f25098l.intValue());
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    private advert getPublicKeyDetails(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return C17029l.vip(Ccase.advert(bCDSTU4145PublicKey.getEncoded())).f33174l;
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(C2756l c2756l) {
        C12726l c12726l;
        C10825l c10825l;
        C10198l c10198l = c2756l.f5961l;
        C7130l c7130lVip = C7130l.vip(c10198l.f20786l);
        Ccase ccase = c7130lVip.f14935l;
        if (ccase instanceof Cfor) {
            Cfor cforM192throws = Cfor.m192throws(ccase);
            C7100l namedCurveByOid = ECUtil.getNamedCurveByOid(cforM192throws);
            if (namedCurveByOid == null) {
                C7838l c7838lLoadAd = AbstractC11456l.loadAd(cforM192throws);
                c10825l = new C10825l(cforM192throws.inmobi(), EC5Util.convertCurve(c7838lLoadAd.f16360l, AbstractC14024l.crashlytics(c7838lLoadAd.f16359l)), EC5Util.convertPoint(c7838lLoadAd.f16358l), c7838lLoadAd.f16362l, c7838lLoadAd.f16361l);
            } else {
                c10825l = new C10825l(ECUtil.getCurveName(cforM192throws), EC5Util.convertCurve(namedCurveByOid.f14871l.f6465l, namedCurveByOid.metrica()), EC5Util.convertPoint(namedCurveByOid.f14870l.vip()), namedCurveByOid.f14874l, namedCurveByOid.f14873l);
            }
            this.ecSpec = c10825l;
        } else if (ccase instanceof Cvolatile) {
            this.ecSpec = null;
        } else {
            Cclass cclassInmobi = Cclass.inmobi(ccase);
            if (cclassInmobi.mo173throws(0) instanceof Cstrictfp) {
                C7100l c7100lVip = C7100l.vip(c7130lVip.f14935l);
                this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(c7100lVip.f14871l.f6465l, c7100lVip.metrica()), EC5Util.convertPoint(c7100lVip.f14870l.vip()), c7100lVip.f14874l, c7100lVip.f14873l.intValue());
            } else {
                C14772l c14772lVip = C14772l.vip(cclassInmobi);
                Cfor cfor = c14772lVip.f28858l;
                if (cfor != null) {
                    C7838l c7838lLoadAd2 = AbstractC11456l.loadAd(cfor);
                    c12726l = new C17209l(cfor.inmobi(), c7838lLoadAd2.f16360l, c7838lLoadAd2.f16358l, c7838lLoadAd2.f16362l, c7838lLoadAd2.f16361l, AbstractC14024l.crashlytics(c7838lLoadAd2.f16359l));
                } else {
                    C4301l c4301l = c14772lVip.f28857l;
                    byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c4301l.f8830l.f36593l);
                    Cfor cfor2 = c10198l.f20787l;
                    Cfor cfor3 = InterfaceC18706l.yandex;
                    if (cfor2.ad(cfor3)) {
                        reverseBytes(bArrCrashlytics);
                    }
                    C1550l c1550l = c4301l.f8827l;
                    C6304l c6304l = new C6304l(c1550l.f3837l, c1550l.f3836l, c1550l.f3835l, c1550l.f3838l, c4301l.f8826l.appmetrica(), new BigInteger(1, bArrCrashlytics), null, null);
                    byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(c4301l.f8831l.f36593l);
                    if (c10198l.f20787l.ad(cfor3)) {
                        reverseBytes(bArrCrashlytics2);
                    }
                    c12726l = new C12726l(c6304l, AbstractC0135l.loadAd(c6304l, bArrCrashlytics2), c4301l.f8829l.appmetrica());
                }
                this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), EC5Util.convertPoint(c12726l.f25095l), c12726l.f25099l, c12726l.f25098l.intValue());
            }
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
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(C2756l.vip(Ccase.advert((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
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

    public C12726l engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        return getD().equals(bCDSTU4145PrivateKey.getD()) && engineGetSpec().equals(bCDSTU4145PrivateKey.engineGetSpec());
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

    /* JADX WARN: Code duplicated, block: B:14:0x0087  */
    /* JADX WARN: Code duplicated, block: B:15:0x0093  */
    /* JADX WARN: Code duplicated, block: B:19:0x00aa A[Catch: IOException -> 0x00ca, TRY_ENTER, TryCatch #0 {IOException -> 0x00ca, blocks: (B:16:0x009c, B:19:0x00aa, B:21:0x00c3, B:20:0x00b7), top: B:24:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b7 A[Catch: IOException -> 0x00ca, TryCatch #0 {IOException -> 0x00ca, blocks: (B:16:0x009c, B:19:0x00aa, B:21:0x00c3, B:20:0x00b7), top: B:24:0x009c }] */
    @Override // java.security.Key
    public byte[] getEncoded() {
        C7130l c7130l;
        int orderBitLength;
        C7154l c7154l;
        Cclass cclass;
        boolean zEquals;
        Ccase ccase;
        C2756l c2756l;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        try {
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
                cclass = c7154l.f14964l;
                zEquals = this.algorithm.equals("DSTU4145");
                ccase = c7130l.f14935l;
                if (zEquals) {
                    c2756l = new C2756l(new C10198l(InterfaceC18706l.loadAd, ccase), cclass, (Cinterface) null, (byte[]) null);
                } else {
                    c2756l = new C2756l(new C10198l(InterfaceC15427l.f30173l, ccase), cclass, (Cinterface) null, (byte[]) null);
                }
                return c2756l.remoteconfig("DER");
            }
            Cfor namedCurveOid = ECUtil.getNamedCurveOid(((C10825l) eCParameterSpec).f21882l);
            if (namedCurveOid == null) {
                namedCurveOid = new Cfor(((C10825l) this.ecSpec).f21882l);
            }
            c7130l = new C7130l(namedCurveOid);
            cclass = c7154l.f14964l;
            zEquals = this.algorithm.equals("DSTU4145");
            ccase = c7130l.f14935l;
            if (zEquals) {
                c2756l = new C2756l(new C10198l(InterfaceC18706l.loadAd, ccase), cclass, (Cinterface) null, (byte[]) null);
            } else {
                c2756l = new C2756l(new C10198l(InterfaceC15427l.f30173l, ccase), cclass, (Cinterface) null, (byte[]) null);
            }
            return c2756l.remoteconfig("DER");
        } catch (IOException unused) {
            return null;
        }
        orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, this.ecSpec.getOrder(), getS());
        if (this.publicKey != null) {
            c7154l = new C7154l(orderBitLength, getS(), this.publicKey, c7130l);
        } else {
            c7154l = new C7154l(orderBitLength, getS(), null, c7130l);
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

    public BCDSTU4145PrivateKey(C14287l c14287l) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = c14287l.f27968l;
        C12726l c12726l = c14287l.f4939l;
        this.ecSpec = c12726l != null ? EC5Util.convertSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), c12726l) : null;
    }

    public BCDSTU4145PrivateKey(C2756l c2756l) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(c2756l);
    }

    public BCDSTU4145PrivateKey(String str, C8374l c8374l) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c8374l.f17335l;
        this.ecSpec = null;
    }

    public BCDSTU4145PrivateKey() {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCDSTU4145PrivateKey(String str, C8374l c8374l, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        C7838l c7838l = c8374l.f4542l;
        this.algorithm = str;
        this.d = c8374l.f17335l;
        if (eCParameterSpec == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(BCDSTU4145PrivateKey bCDSTU4145PrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = bCDSTU4145PrivateKey.d;
        this.ecSpec = bCDSTU4145PrivateKey.ecSpec;
        this.withCompression = bCDSTU4145PrivateKey.withCompression;
        this.attrCarrier = bCDSTU4145PrivateKey.attrCarrier;
        this.publicKey = bCDSTU4145PrivateKey.publicKey;
    }
}
