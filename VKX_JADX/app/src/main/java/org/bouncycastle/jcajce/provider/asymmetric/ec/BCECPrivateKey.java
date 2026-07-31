package org.bouncycastle.jcajce.provider.asymmetric.ec;

import defpackage.AbstractC14024l;
import defpackage.AbstractC17195l;
import defpackage.C10198l;
import defpackage.C12726l;
import defpackage.C14287l;
import defpackage.C17029l;
import defpackage.C17209l;
import defpackage.C2542l;
import defpackage.C2756l;
import defpackage.C7130l;
import defpackage.C7154l;
import defpackage.C7838l;
import defpackage.C8374l;
import defpackage.Ccase;
import defpackage.Cfor;
import defpackage.Cinterface;
import defpackage.Cstrictfp;
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC14821l;
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
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class BCECPrivateKey implements ECPrivateKey, InterfaceC18238l, InterfaceC12233l, InterfaceC14821l {
    static final long serialVersionUID = 994553197664784084L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient C8374l baseKey;
    private transient ProviderConfiguration configuration;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient byte[] encoding;
    private transient C2756l privateKeyInfo;
    private transient advert publicKey;
    private boolean withCompression;

    public BCECPrivateKey(String str, C8374l c8374l, BCECPublicKey bCECPublicKey, C12726l c12726l, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c8374l.f17335l;
        this.configuration = providerConfiguration;
        this.baseKey = c8374l;
        if (c12726l == null) {
            C7838l c7838l = c8374l.f4542l;
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
        } else {
            this.ecSpec = EC5Util.convertSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), c12726l);
        }
        try {
            this.publicKey = getPublicKeyDetails(bCECPublicKey);
        } catch (Exception unused) {
            this.publicKey = null;
        }
    }

    private static C8374l convertToBaseKey(BCECPrivateKey bCECPrivateKey) {
        String str;
        C12726l parameters = bCECPrivateKey.getParameters();
        if (parameters == null) {
            parameters = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
        }
        return (!(bCECPrivateKey.getParameters() instanceof C17209l) || (str = ((C17209l) bCECPrivateKey.getParameters()).f33402l) == null) ? new C8374l(bCECPrivateKey.getD(), new C7838l(parameters.f25097l, parameters.f25095l, parameters.f25099l, parameters.f25098l, parameters.f25096l)) : new C8374l(bCECPrivateKey.getD(), new C2542l(AbstractC17195l.firebase(str), parameters.f25097l, parameters.f25095l, parameters.f25099l, parameters.f25098l, parameters.f25096l));
    }

    private C2756l getPrivateKeyInfo() {
        if (this.privateKeyInfo == null) {
            C7130l domainParametersFromName = ECUtils.getDomainParametersFromName(this.ecSpec, this.withCompression);
            ECParameterSpec eCParameterSpec = this.ecSpec;
            ProviderConfiguration providerConfiguration = this.configuration;
            int orderBitLength = eCParameterSpec == null ? ECUtil.getOrderBitLength(providerConfiguration, null, getS()) : ECUtil.getOrderBitLength(providerConfiguration, eCParameterSpec.getOrder(), getS());
            try {
                this.privateKeyInfo = new C2756l(new C10198l(InterfaceC15427l.f30173l, domainParametersFromName), this.publicKey != null ? new C7154l(orderBitLength, getS(), this.publicKey, domainParametersFromName) : new C7154l(orderBitLength, getS(), null, domainParametersFromName), (Cinterface) null, (byte[]) null);
            } catch (IOException unused) {
                return null;
            }
        }
        return this.privateKeyInfo;
    }

    private advert getPublicKeyDetails(BCECPublicKey bCECPublicKey) {
        try {
            return C17029l.vip(Ccase.advert(bCECPublicKey.getEncoded())).f33174l;
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(C2756l c2756l) {
        C7130l c7130lVip = C7130l.vip(c2756l.f5961l.f20786l);
        this.ecSpec = EC5Util.convertToSpec(c7130lVip, EC5Util.getCurve(this.configuration, c7130lVip));
        Ccase ccaseAds = c2756l.ads();
        if (ccaseAds instanceof Cstrictfp) {
            this.d = Cstrictfp.premium(ccaseAds).appmetrica();
        } else {
            C7154l c7154lVip = C7154l.vip(ccaseAds);
            this.d = c7154lVip.metrica();
            this.publicKey = c7154lVip.tapsense();
        }
        this.baseKey = convertToBaseKey(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        populateFromPrivKeyInfo(C2756l.vip(Ccase.advert(bArr)));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public C8374l engineGetKeyParameters() {
        return this.baseKey;
    }

    public C12726l engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : this.configuration.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) obj;
            C2756l privateKeyInfo = getPrivateKeyInfo();
            C2756l privateKeyInfo2 = eCPrivateKey instanceof BCECPrivateKey ? ((BCECPrivateKey) eCPrivateKey).getPrivateKeyInfo() : C2756l.vip(eCPrivateKey.getEncoded());
            if (privateKeyInfo != null && privateKeyInfo2 != null) {
                try {
                    return AbstractC14024l.smaato(getS().toByteArray(), eCPrivateKey.getS().toByteArray()) & AbstractC14024l.smaato(privateKeyInfo.f5961l.getEncoded(), privateKeyInfo2.f5961l.getEncoded());
                } catch (IOException unused) {
                }
            }
        }
        return false;
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
        if (this.encoding == null) {
            C2756l privateKeyInfo = getPrivateKeyInfo();
            if (privateKeyInfo == null) {
                return null;
            }
            try {
                this.encoding = privateKeyInfo.remoteconfig("DER");
            } catch (IOException unused) {
                return null;
            }
        }
        return AbstractC14024l.crashlytics(this.encoding);
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
        return ECUtil.privateKeyToString("EC", this.d, engineGetSpec());
    }

    public BCECPrivateKey() {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECPrivateKey(String str, C8374l c8374l, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c8374l.f17335l;
        this.configuration = providerConfiguration;
        this.baseKey = c8374l;
        if (eCParameterSpec == null) {
            C7838l c7838l = c8374l.f4542l;
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(c7838l.f16360l, AbstractC14024l.crashlytics(c7838l.f16359l)), EC5Util.convertPoint(c7838l.f16358l), c7838l.f16362l, c7838l.f16361l.intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(bCECPublicKey);
    }

    public BCECPrivateKey(String str, C8374l c8374l, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c8374l.f17335l;
        this.ecSpec = null;
        this.configuration = providerConfiguration;
        this.baseKey = c8374l;
    }

    public BCECPrivateKey(String str, C14287l c14287l, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = c14287l.f27968l;
        C12726l c12726l = c14287l.f4939l;
        this.ecSpec = c12726l != null ? EC5Util.convertSpec(EC5Util.convertCurve(c12726l.f25097l, c12726l.f25096l), c12726l) : null;
        this.configuration = providerConfiguration;
        this.baseKey = convertToBaseKey(this);
    }

    public BCECPrivateKey(String str, C2756l c2756l, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.configuration = providerConfiguration;
        populateFromPrivKeyInfo(c2756l);
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
        this.configuration = providerConfiguration;
        this.baseKey = convertToBaseKey(this);
    }

    public BCECPrivateKey(String str, BCECPrivateKey bCECPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = bCECPrivateKey.d;
        this.ecSpec = bCECPrivateKey.ecSpec;
        this.withCompression = bCECPrivateKey.withCompression;
        this.attrCarrier = bCECPrivateKey.attrCarrier;
        this.publicKey = bCECPrivateKey.publicKey;
        this.configuration = bCECPrivateKey.configuration;
        this.baseKey = bCECPrivateKey.baseKey;
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
        this.configuration = providerConfiguration;
        this.baseKey = convertToBaseKey(this);
    }
}
