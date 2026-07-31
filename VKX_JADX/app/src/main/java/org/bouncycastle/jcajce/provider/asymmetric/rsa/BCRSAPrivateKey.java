package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C15860l;
import defpackage.C6963l;
import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC14821l;
import defpackage.applovin;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes3.dex */
public class BCRSAPrivateKey implements RSAPrivateKey, InterfaceC12233l, InterfaceC14821l {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    static final long serialVersionUID = 5110188922551353628L;
    protected transient C10198l algorithmIdentifier;
    private byte[] algorithmIdentifierEnc;
    protected transient PKCS12BagAttributeCarrierImpl attrCarrier;
    protected BigInteger modulus;
    protected BigInteger privateExponent;
    protected transient C6963l rsaPrivateKey;

    public BCRSAPrivateKey(C10198l c10198l, C15860l c15860l) {
        C10198l c10198l2 = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(c10198l2);
        this.algorithmIdentifier = c10198l2;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithmIdentifier = c10198l;
        this.algorithmIdentifierEnc = getEncoding(c10198l);
        this.modulus = c15860l.f31123l;
        this.privateExponent = c15860l.f31127l;
        this.rsaPrivateKey = new C6963l(true, this.modulus, this.privateExponent, false);
    }

    private static byte[] getEncoding(C10198l c10198l) {
        try {
            return c10198l.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.algorithmIdentifierEnc == null) {
            this.algorithmIdentifierEnc = getEncoding(BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER);
        }
        this.algorithmIdentifier = C10198l.vip(this.algorithmIdentifierEnc);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new C6963l(true, this.modulus, this.privateExponent, false);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public C6963l engineGetKeyParameters() {
        return this.rsaPrivateKey;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithmIdentifier.f20787l.ad(InterfaceC0543l.f1918static) ? "RSASSA-PSS" : "RSA";
    }

    @Override // defpackage.InterfaceC12233l
    public applovin getBagAttribute(Cfor cfor) {
        return this.attrCarrier.getBagAttribute(cfor);
    }

    @Override // defpackage.InterfaceC12233l
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C10198l c10198l = this.algorithmIdentifier;
        BigInteger modulus = getModulus();
        BigInteger bigInteger = ZERO;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = ZERO;
        return KeyUtil.getEncodedPrivateKeyInfo(c10198l, new C15860l(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public BigInteger getPrivateExponent() {
        return this.privateExponent;
    }

    @Override // defpackage.InterfaceC12233l
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    public int hashCode() {
        return getPrivateExponent().hashCode() ^ getModulus().hashCode();
    }

    @Override // defpackage.InterfaceC12233l
    public void setBagAttribute(Cfor cfor, applovin applovinVar) {
        this.attrCarrier.setBagAttribute(cfor, applovinVar);
    }

    @Override // defpackage.InterfaceC12233l
    public void setFriendlyName(String str) {
        this.attrCarrier.setFriendlyName(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RSA Private Key [");
        String str = AbstractC9008l.yandex;
        sb.append(RSAUtil.generateKeyFingerprint(getModulus()));
        sb.append("],[]");
        sb.append(str);
        sb.append("            modulus: ");
        sb.append(getModulus().toString(16));
        sb.append(str);
        return sb.toString();
    }

    public BCRSAPrivateKey(C10198l c10198l, C6963l c6963l) {
        C10198l c10198l2 = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(c10198l2);
        this.algorithmIdentifier = c10198l2;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithmIdentifier = c10198l;
        this.algorithmIdentifierEnc = getEncoding(c10198l);
        this.modulus = c6963l.f14630l;
        this.privateExponent = c6963l.f14629l;
        this.rsaPrivateKey = c6963l;
    }

    public BCRSAPrivateKey(C6963l c6963l) {
        C10198l c10198l = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(c10198l);
        this.algorithmIdentifier = c10198l;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.modulus = c6963l.f14630l;
        this.privateExponent = c6963l.f14629l;
        this.rsaPrivateKey = c6963l;
    }

    public BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        C10198l c10198l = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(c10198l);
        this.algorithmIdentifier = c10198l;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.modulus = rSAPrivateKey.getModulus();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.rsaPrivateKey = new C6963l(true, this.modulus, this.privateExponent, false);
    }

    public BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        C10198l c10198l = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(c10198l);
        this.algorithmIdentifier = c10198l;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.modulus = rSAPrivateKeySpec.getModulus();
        this.privateExponent = rSAPrivateKeySpec.getPrivateExponent();
        this.rsaPrivateKey = new C6963l(true, this.modulus, this.privateExponent, false);
    }
}
