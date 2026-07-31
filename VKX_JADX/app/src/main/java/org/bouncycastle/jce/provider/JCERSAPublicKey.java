package org.bouncycastle.jce.provider;

import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C14998l;
import defpackage.C17029l;
import defpackage.C5199l;
import defpackage.C6963l;
import defpackage.C8339l;
import defpackage.InterfaceC0543l;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes3.dex */
public class JCERSAPublicKey implements RSAPublicKey {
    static final long serialVersionUID = 2675817738516720772L;
    private BigInteger modulus;
    private BigInteger publicExponent;

    public JCERSAPublicKey(C17029l c17029l) {
        try {
            C5199l c5199lVip = C5199l.vip(c17029l.metrica());
            this.modulus = c5199lVip.f11274l;
            this.publicExponent = c5199lVip.f11273l;
        } catch (IOException unused) {
            C8339l.metrica("invalid info structure in RSA public key");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "RSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new C10198l(InterfaceC0543l.f1922throw, C14998l.f29509l), new C5199l(getModulus(), getPublicExponent()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    public int hashCode() {
        return getPublicExponent().hashCode() ^ getModulus().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RSA Public Key");
        String str = AbstractC9008l.yandex;
        sb.append(str);
        sb.append("            modulus: ");
        sb.append(getModulus().toString(16));
        sb.append(str);
        sb.append("    public exponent: ");
        sb.append(getPublicExponent().toString(16));
        sb.append(str);
        return sb.toString();
    }

    public JCERSAPublicKey(C6963l c6963l) {
        this.modulus = c6963l.f14630l;
        this.publicExponent = c6963l.f14629l;
    }

    public JCERSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
    }

    public JCERSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
    }
}
