package org.bouncycastle.jce.provider;

import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C14998l;
import defpackage.C15860l;
import defpackage.C2756l;
import defpackage.C6554l;
import defpackage.InterfaceC0543l;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes3.dex */
public class JCERSAPrivateCrtKey extends JCERSAPrivateKey implements RSAPrivateCrtKey {
    static final long serialVersionUID = 7834723820638524718L;
    private BigInteger crtCoefficient;
    private BigInteger primeExponentP;
    private BigInteger primeExponentQ;
    private BigInteger primeP;
    private BigInteger primeQ;
    private BigInteger publicExponent;

    public JCERSAPrivateCrtKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
        this.modulus = rSAPrivateCrtKey.getModulus();
        this.publicExponent = rSAPrivateCrtKey.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKey.getPrivateExponent();
        this.primeP = rSAPrivateCrtKey.getPrimeP();
        this.primeQ = rSAPrivateCrtKey.getPrimeQ();
        this.primeExponentP = rSAPrivateCrtKey.getPrimeExponentP();
        this.primeExponentQ = rSAPrivateCrtKey.getPrimeExponentQ();
        this.crtCoefficient = rSAPrivateCrtKey.getCrtCoefficient();
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
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

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey, java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedPrivateKeyInfo(new C10198l(InterfaceC0543l.f1922throw, C14998l.f29509l), new C15860l(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey, java.security.Key
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

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
    public int hashCode() {
        return getPrivateExponent().hashCode() ^ (getModulus().hashCode() ^ getPublicExponent().hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RSA Private CRT Key");
        String str = AbstractC9008l.yandex;
        sb.append(str);
        sb.append("            modulus: ");
        sb.append(getModulus().toString(16));
        sb.append(str);
        sb.append("    public exponent: ");
        sb.append(getPublicExponent().toString(16));
        sb.append(str);
        sb.append("   private exponent: ");
        sb.append(getPrivateExponent().toString(16));
        sb.append(str);
        sb.append("             primeP: ");
        sb.append(getPrimeP().toString(16));
        sb.append(str);
        sb.append("             primeQ: ");
        sb.append(getPrimeQ().toString(16));
        sb.append(str);
        sb.append("     primeExponentP: ");
        sb.append(getPrimeExponentP().toString(16));
        sb.append(str);
        sb.append("     primeExponentQ: ");
        sb.append(getPrimeExponentQ().toString(16));
        sb.append(str);
        sb.append("     crtCoefficient: ");
        sb.append(getCrtCoefficient().toString(16));
        sb.append(str);
        return sb.toString();
    }

    public JCERSAPrivateCrtKey(C6554l c6554l) {
        super(c6554l);
        this.publicExponent = c6554l.f13683l;
        this.primeP = c6554l.f13679l;
        this.primeQ = c6554l.f13680l;
        this.primeExponentP = c6554l.f13682l;
        this.primeExponentQ = c6554l.f13681l;
        this.crtCoefficient = c6554l.f13684l;
    }

    public JCERSAPrivateCrtKey(C15860l c15860l) {
        this.modulus = c15860l.f31123l;
        this.publicExponent = c15860l.f31120l;
        this.privateExponent = c15860l.f31127l;
        this.primeP = c15860l.f31126l;
        this.primeQ = c15860l.f31129l;
        this.primeExponentP = c15860l.f31121l;
        this.primeExponentQ = c15860l.f31122l;
        this.crtCoefficient = c15860l.f31128l;
    }

    public JCERSAPrivateCrtKey(C2756l c2756l) {
        this(C15860l.vip(c2756l.ads()));
    }

    public JCERSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
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
