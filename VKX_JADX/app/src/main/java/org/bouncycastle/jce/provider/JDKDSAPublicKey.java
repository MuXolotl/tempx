package org.bouncycastle.jce.provider;

import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C11138l;
import defpackage.C12933l;
import defpackage.C13353l;
import defpackage.C14998l;
import defpackage.C15281l;
import defpackage.C17029l;
import defpackage.C4767l;
import defpackage.C8339l;
import defpackage.Ccase;
import defpackage.Cstrictfp;
import defpackage.InterfaceC15427l;
import defpackage.applovin;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class JDKDSAPublicKey implements DSAPublicKey {
    private static final long serialVersionUID = 1752452449903495175L;
    private DSAParams dsaSpec;
    private BigInteger y;

    public JDKDSAPublicKey(C17029l c17029l) {
        try {
            Ccase ccaseMetrica = c17029l.metrica();
            C10198l c10198l = c17029l.f33175l;
            this.y = ((Cstrictfp) ccaseMetrica).appmetrica();
            if (isNotNull(c10198l.f20786l)) {
                C15281l c15281lVip = C15281l.vip(c10198l.f20786l);
                this.dsaSpec = new DSAParameterSpec(c15281lVip.f29883l.applovin(), c15281lVip.f29882l.applovin(), c15281lVip.f29881l.applovin());
            }
        } catch (IOException unused) {
            C8339l.metrica("invalid info structure in DSA public key");
            throw null;
        }
    }

    private boolean isNotNull(applovin applovinVar) {
        return (applovinVar == null || C14998l.f29509l.pro(applovinVar)) ? false : true;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.y = (BigInteger) objectInputStream.readObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.y);
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return getY().equals(dSAPublicKey.getY()) && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            DSAParams dSAParams = this.dsaSpec;
            if (dSAParams == null) {
                C10198l c10198l = new C10198l(InterfaceC15427l.f30177l);
                C13353l c13353l = new C13353l(new Cstrictfp(this.y).billing().remoteconfig("DER"), 0);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new C11138l(c10198l, c13353l).tapsense(byteArrayOutputStream, "DER");
                return byteArrayOutputStream.toByteArray();
            }
            C10198l c10198l2 = new C10198l(InterfaceC15427l.f30177l, new C15281l(dSAParams.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()));
            C13353l c13353l2 = new C13353l(new Cstrictfp(this.y).billing().remoteconfig("DER"), 0);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            new C11138l(c10198l2, c13353l2).tapsense(byteArrayOutputStream2, "DER");
            return byteArrayOutputStream2.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return getParams().getQ().hashCode() ^ ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DSA Public Key");
        String str = AbstractC9008l.yandex;
        sb.append(str);
        sb.append("            y: ");
        sb.append(getY().toString(16));
        sb.append(str);
        return sb.toString();
    }

    public JDKDSAPublicKey(C4767l c4767l) {
        this.y = c4767l.f9785l;
        C12933l c12933l = (C12933l) c4767l.f16541l;
        this.dsaSpec = new DSAParameterSpec(c12933l.f25380l, c12933l.f25381l, c12933l.f25382l);
    }

    public JDKDSAPublicKey(BigInteger bigInteger, DSAParameterSpec dSAParameterSpec) {
        this.y = bigInteger;
        this.dsaSpec = dSAParameterSpec;
    }

    public JDKDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
    }

    public JDKDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
    }
}
