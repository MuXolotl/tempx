package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C14998l;
import defpackage.C17029l;
import defpackage.C5199l;
import defpackage.C6963l;
import defpackage.C8339l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC14821l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes3.dex */
public class BCRSAPublicKey implements RSAPublicKey, InterfaceC14821l {
    static final C10198l DEFAULT_ALGORITHM_IDENTIFIER = new C10198l(InterfaceC0543l.f1922throw, C14998l.f29509l);
    static final long serialVersionUID = 2675817738516720772L;
    private transient C10198l algorithmIdentifier;
    private BigInteger modulus;
    private BigInteger publicExponent;
    private transient C6963l rsaPublicKey;

    public BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
        this.rsaPublicKey = new C6963l(false, this.modulus, this.publicExponent, false);
    }

    private void populateFromPublicKeyInfo(C17029l c17029l) {
        try {
            C5199l c5199lVip = C5199l.vip(c17029l.metrica());
            this.algorithmIdentifier = c17029l.f33175l;
            this.modulus = c5199lVip.f11274l;
            this.publicExponent = c5199lVip.f11273l;
            this.rsaPublicKey = new C6963l(false, this.modulus, this.publicExponent, false);
        } catch (IOException unused) {
            C8339l.metrica("invalid info structure in RSA public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        try {
            this.algorithmIdentifier = C10198l.vip(objectInputStream.readObject());
        } catch (Exception unused) {
            this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        }
        this.rsaPublicKey = new C6963l(false, this.modulus, this.publicExponent, false);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (this.algorithmIdentifier.equals(DEFAULT_ALGORITHM_IDENTIFIER)) {
            return;
        }
        objectOutputStream.writeObject(this.algorithmIdentifier.getEncoded());
    }

    public C6963l engineGetKeyParameters() {
        return this.rsaPublicKey;
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
        return this.algorithmIdentifier.f20787l.ad(InterfaceC0543l.f1918static) ? "RSASSA-PSS" : "RSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(this.algorithmIdentifier, new C5199l(getModulus(), getPublicExponent()));
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
        StringBuilder sb = new StringBuilder("RSA Public Key [");
        String str = AbstractC9008l.yandex;
        sb.append(RSAUtil.generateKeyFingerprint(getModulus()));
        sb.append("],[");
        sb.append(RSAUtil.generateExponentFingerprint(getPublicExponent()));
        sb.append("]");
        sb.append(str);
        sb.append("        modulus: ");
        sb.append(getModulus().toString(16));
        sb.append(str);
        sb.append("public exponent: ");
        sb.append(getPublicExponent().toString(16));
        sb.append(str);
        return sb.toString();
    }

    public BCRSAPublicKey(C6963l c6963l) {
        this(DEFAULT_ALGORITHM_IDENTIFIER, c6963l);
    }

    public BCRSAPublicKey(C17029l c17029l) {
        populateFromPublicKeyInfo(c17029l);
    }

    public BCRSAPublicKey(C10198l c10198l, C6963l c6963l) {
        this.algorithmIdentifier = c10198l;
        this.modulus = c6963l.f14630l;
        this.publicExponent = c6963l.f14629l;
        this.rsaPublicKey = c6963l;
    }

    public BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
        this.rsaPublicKey = new C6963l(false, this.modulus, this.publicExponent, false);
    }
}
