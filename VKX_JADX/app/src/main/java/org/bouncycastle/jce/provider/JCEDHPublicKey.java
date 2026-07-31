package org.bouncycastle.jce.provider;

import defpackage.AbstractC9361l;
import defpackage.C0500l;
import defpackage.C10198l;
import defpackage.C13061l;
import defpackage.C17029l;
import defpackage.C2396l;
import defpackage.C7438l;
import defpackage.C8339l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC15427l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes3.dex */
public class JCEDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private DHParameterSpec dhSpec;
    private C17029l info;
    private BigInteger y;

    public JCEDHPublicKey(C17029l c17029l) {
        this.info = c17029l;
        try {
            Ccase ccaseMetrica = c17029l.metrica();
            C10198l c10198l = c17029l.f33175l;
            this.y = ((Cstrictfp) ccaseMetrica).appmetrica();
            Cclass cclassInmobi = Cclass.inmobi(c10198l.f20786l);
            Cfor cfor = c10198l.f20787l;
            if (!cfor.ad(InterfaceC0543l.f1860abstract) && !isPKCSParam(cclassInmobi)) {
                if (!cfor.ad(InterfaceC15427l.f30146l)) {
                    C8339l.metrica(AbstractC9361l.license("unknown algorithm type: ", cfor));
                    throw null;
                }
                C0500l c0500lVip = C0500l.vip(cclassInmobi);
                this.dhSpec = new DHParameterSpec(c0500lVip.f1811l.applovin(), c0500lVip.f1810l.applovin());
                return;
            }
            C13061l c13061lVip = C13061l.vip(cclassInmobi);
            BigInteger bigIntegerMetrica = c13061lVip.metrica();
            Cstrictfp cstrictfp = c13061lVip.f25573l;
            Cstrictfp cstrictfp2 = c13061lVip.f25574l;
            if (bigIntegerMetrica != null) {
                this.dhSpec = new DHParameterSpec(cstrictfp2.applovin(), cstrictfp.applovin(), c13061lVip.metrica().intValue());
            } else {
                this.dhSpec = new DHParameterSpec(cstrictfp2.applovin(), cstrictfp.applovin());
            }
        } catch (IOException unused) {
            C8339l.metrica("invalid info structure in DH public key");
            throw null;
        }
    }

    private boolean isPKCSParam(Cclass cclass) {
        if (cclass.size() == 2) {
            return true;
        }
        if (cclass.size() > 3) {
            return false;
        }
        return Cstrictfp.premium(cclass.mo173throws(2)).appmetrica().compareTo(BigInteger.valueOf((long) Cstrictfp.premium(cclass.mo173throws(0)).appmetrica().bitLength())) <= 0;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.y = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C17029l c17029l = this.info;
        if (c17029l != null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(c17029l);
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new C10198l(InterfaceC0543l.f1860abstract, new C13061l(this.dhSpec.getL(), this.dhSpec.getP(), this.dhSpec.getG())), new Cstrictfp(this.y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public JCEDHPublicKey(C7438l c7438l) {
        this.y = c7438l.f15399l;
        C2396l c2396l = c7438l.f23457l;
        this.dhSpec = new DHParameterSpec(c2396l.f5158l, c2396l.f5159l, c2396l.f5162l);
    }

    public JCEDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.y = bigInteger;
        this.dhSpec = dHParameterSpec;
    }

    public JCEDHPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.dhSpec = dHPublicKey.getParams();
    }

    public JCEDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.dhSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }
}
