package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C15860l;
import defpackage.C2756l;
import defpackage.C6554l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes3.dex */
public class BCRSAPrivateCrtKey extends BCRSAPrivateKey implements RSAPrivateCrtKey {
    static final long serialVersionUID = 7834723820638524718L;
    private BigInteger crtCoefficient;
    private BigInteger primeExponentP;
    private BigInteger primeExponentQ;
    private BigInteger primeP;
    private BigInteger primeQ;
    private BigInteger publicExponent;

    public BCRSAPrivateCrtKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
        super(new C6554l(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient(), false));
        this.modulus = rSAPrivateCrtKey.getModulus();
        this.publicExponent = rSAPrivateCrtKey.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKey.getPrivateExponent();
        this.primeP = rSAPrivateCrtKey.getPrimeP();
        this.primeQ = rSAPrivateCrtKey.getPrimeQ();
        this.primeExponentP = rSAPrivateCrtKey.getPrimeExponentP();
        this.primeExponentQ = rSAPrivateCrtKey.getPrimeExponentQ();
        this.crtCoefficient = rSAPrivateCrtKey.getCrtCoefficient();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new C6554l(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient(), false);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPrivateCrtKey)) {
            return false;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
        return getModulus().equals(rSAPrivateCrtKey.getModulus()) && getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent()) && getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && getPrimeP().equals(rSAPrivateCrtKey.getPrimeP()) && getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ()) && getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient());
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getCrtCoefficient() {
        return this.crtCoefficient;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedPrivateKeyInfo(this.algorithmIdentifier, new C15860l(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentP() {
        return this.primeExponentP;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentQ() {
        return this.primeExponentQ;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeP() {
        return this.primeP;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeQ() {
        return this.primeQ;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public int hashCode() {
        return getPrivateExponent().hashCode() ^ (getModulus().hashCode() ^ getPublicExponent().hashCode());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public String toString() {
        StringBuilder sb = new StringBuilder("RSA Private CRT Key [");
        String str = AbstractC9008l.yandex;
        sb.append(RSAUtil.generateKeyFingerprint(getModulus()));
        sb.append("],[");
        sb.append(RSAUtil.generateExponentFingerprint(getPublicExponent()));
        sb.append("]");
        sb.append(str);
        sb.append("             modulus: ");
        sb.append(getModulus().toString(16));
        sb.append(str);
        sb.append("     public exponent: ");
        sb.append(getPublicExponent().toString(16));
        sb.append(str);
        return sb.toString();
    }

    public BCRSAPrivateCrtKey(C10198l c10198l, C15860l c15860l) {
        super(c10198l, new C6554l(c15860l.f31123l, c15860l.f31120l, c15860l.f31127l, c15860l.f31126l, c15860l.f31129l, c15860l.f31121l, c15860l.f31122l, c15860l.f31128l, false));
        this.modulus = c15860l.f31123l;
        this.publicExponent = c15860l.f31120l;
        this.privateExponent = c15860l.f31127l;
        this.primeP = c15860l.f31126l;
        this.primeQ = c15860l.f31129l;
        this.primeExponentP = c15860l.f31121l;
        this.primeExponentQ = c15860l.f31122l;
        this.crtCoefficient = c15860l.f31128l;
    }

    public BCRSAPrivateCrtKey(C2756l c2756l) {
        this(c2756l.f5961l, C15860l.vip(c2756l.ads()));
    }

    public BCRSAPrivateCrtKey(C6554l c6554l) {
        super(c6554l);
        this.publicExponent = c6554l.f13683l;
        this.primeP = c6554l.f13679l;
        this.primeQ = c6554l.f13680l;
        this.primeExponentP = c6554l.f13682l;
        this.primeExponentQ = c6554l.f13681l;
        this.crtCoefficient = c6554l.f13684l;
    }

    public BCRSAPrivateCrtKey(C15860l c15860l) {
        this(BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER, c15860l);
    }

    public BCRSAPrivateCrtKey(C10198l c10198l, C6554l c6554l) {
        super(c10198l, c6554l);
        this.publicExponent = c6554l.f13683l;
        this.primeP = c6554l.f13679l;
        this.primeQ = c6554l.f13680l;
        this.primeExponentP = c6554l.f13682l;
        this.primeExponentQ = c6554l.f13681l;
        this.crtCoefficient = c6554l.f13684l;
    }

    public BCRSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        super(new C6554l(rSAPrivateCrtKeySpec.getModulus(), rSAPrivateCrtKeySpec.getPublicExponent(), rSAPrivateCrtKeySpec.getPrivateExponent(), rSAPrivateCrtKeySpec.getPrimeP(), rSAPrivateCrtKeySpec.getPrimeQ(), rSAPrivateCrtKeySpec.getPrimeExponentP(), rSAPrivateCrtKeySpec.getPrimeExponentQ(), rSAPrivateCrtKeySpec.getCrtCoefficient(), false));
        this.modulus = rSAPrivateCrtKeySpec.getModulus();
        this.publicExponent = rSAPrivateCrtKeySpec.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKeySpec.getPrivateExponent();
        this.primeP = rSAPrivateCrtKeySpec.getPrimeP();
        this.primeQ = rSAPrivateCrtKeySpec.getPrimeQ();
        this.primeExponentP = rSAPrivateCrtKeySpec.getPrimeExponentP();
        this.primeExponentQ = rSAPrivateCrtKeySpec.getPrimeExponentQ();
        this.crtCoefficient = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }
}
