package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C11138l;
import defpackage.C12933l;
import defpackage.C14998l;
import defpackage.C15281l;
import defpackage.C17029l;
import defpackage.C4767l;
import defpackage.C8339l;
import defpackage.Ccase;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.InterfaceC15427l;
import defpackage.applovin;
import defpackage.appmetrica;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes3.dex */
public class BCDSAPublicKey implements DSAPublicKey {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static final long serialVersionUID = 1752452449903495175L;
    private transient DSAParams dsaSpec;
    private transient C4767l lwKeyParams;
    private BigInteger y;

    public BCDSAPublicKey(C17029l c17029l) {
        DSAParameterSpec dSAParameterSpec = null;
        try {
            Ccase ccaseMetrica = c17029l.metrica();
            C10198l c10198l = c17029l.f33175l;
            this.y = ((Cstrictfp) ccaseMetrica).appmetrica();
            if (isNotNull(c10198l.f20786l)) {
                C15281l c15281lVip = C15281l.vip(c10198l.f20786l);
                dSAParameterSpec = new DSAParameterSpec(c15281lVip.f29883l.applovin(), c15281lVip.f29882l.applovin(), c15281lVip.f29881l.applovin());
            }
            this.dsaSpec = dSAParameterSpec;
            this.lwKeyParams = new C4767l(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
        } catch (IOException unused) {
            C8339l.metrica("invalid info structure in DSA public key");
            throw null;
        }
    }

    private boolean isNotNull(applovin applovinVar) {
        return (applovinVar == null || C14998l.f29509l.ad(applovinVar.billing())) ? false : true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(ZERO)) {
            this.dsaSpec = null;
        } else {
            this.dsaSpec = new DSAParameterSpec(bigInteger, (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        }
        this.lwKeyParams = new C4767l(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        BigInteger g;
        objectOutputStream.defaultWriteObject();
        DSAParams dSAParams = this.dsaSpec;
        if (dSAParams == null) {
            g = ZERO;
        } else {
            objectOutputStream.writeObject(dSAParams.getP());
            objectOutputStream.writeObject(this.dsaSpec.getQ());
            g = this.dsaSpec.getG();
        }
        objectOutputStream.writeObject(g);
    }

    public C4767l engineGetKeyParameters() {
        return this.lwKeyParams;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        if (this.dsaSpec != null) {
            return getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
        }
        return getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        DSAParams dSAParams = this.dsaSpec;
        if (dSAParams == null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new C10198l(InterfaceC15427l.f30177l), new Cstrictfp(this.y));
        }
        Cfor cfor = InterfaceC15427l.f30177l;
        BigInteger p = dSAParams.getP();
        BigInteger q = this.dsaSpec.getQ();
        BigInteger g = this.dsaSpec.getG();
        Cstrictfp cstrictfp = new Cstrictfp(p);
        Cstrictfp cstrictfp2 = new Cstrictfp(q);
        Cstrictfp cstrictfp3 = new Cstrictfp(g);
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(cstrictfp);
        appmetricaVar.purchase(cstrictfp2);
        appmetricaVar.purchase(cstrictfp3);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new C10198l(cfor, c11138l), new Cstrictfp(this.y));
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
        if (this.dsaSpec == null) {
            return getY().hashCode();
        }
        return getParams().getQ().hashCode() ^ ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DSA Public Key [");
        String str = AbstractC9008l.yandex;
        sb.append(DSAUtil.generateKeyFingerprint(this.y, getParams()));
        sb.append("]");
        sb.append(str);
        sb.append("            Y: ");
        sb.append(getY().toString(16));
        sb.append(str);
        return sb.toString();
    }

    public BCDSAPublicKey(C4767l c4767l) {
        this.y = c4767l.f9785l;
        C12933l c12933l = (C12933l) c4767l.f16541l;
        if (c12933l != null) {
            this.dsaSpec = new DSAParameterSpec(c12933l.f25380l, c12933l.f25381l, c12933l.f25382l);
        } else {
            this.dsaSpec = null;
        }
        this.lwKeyParams = c4767l;
    }

    public BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
        this.lwKeyParams = new C4767l(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    public BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.lwKeyParams = new C4767l(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
    }
}
