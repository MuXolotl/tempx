package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import defpackage.AbstractC1607l;
import defpackage.C10198l;
import defpackage.C11138l;
import defpackage.C12425l;
import defpackage.C13353l;
import defpackage.C14060l;
import defpackage.C14223l;
import defpackage.C17029l;
import defpackage.C8339l;
import defpackage.C8414l;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.InterfaceC16898l;
import defpackage.InterfaceC4502l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class BCElGamalPublicKey implements InterfaceC16898l, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private transient C14060l elSpec;
    private BigInteger y;

    public BCElGamalPublicKey(C17029l c17029l) {
        C8414l c8414lVip = C8414l.vip(c17029l.f33175l.f20786l);
        try {
            this.y = ((Cstrictfp) c17029l.metrica()).appmetrica();
            this.elSpec = new C14060l(c8414lVip.f17421l.applovin(), c8414lVip.f17420l.applovin());
        } catch (IOException unused) {
            C8339l.metrica("invalid info structure in DSA public key");
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.elSpec = new C14060l((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.f27407l);
        objectOutputStream.writeObject(this.elSpec.f27406l);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            Cfor cfor = InterfaceC4502l.subs;
            C14060l c14060l = this.elSpec;
            C10198l c10198l = new C10198l(cfor, new C8414l(c14060l.f27407l, c14060l.f27406l));
            C13353l c13353l = new C13353l(new Cstrictfp(this.y).billing().remoteconfig("DER"), 0);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C11138l(c10198l, c13353l).tapsense(byteArrayOutputStream, "DER");
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // defpackage.InterfaceC17495l
    public C14060l getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        C14060l c14060l = this.elSpec;
        return new DHParameterSpec(c14060l.f27407l, c14060l.f27406l);
    }

    @Override // defpackage.InterfaceC16898l, javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return getParams().getL() ^ ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode());
    }

    public BCElGamalPublicKey(C14223l c14223l) {
        this.y = c14223l.f27824l;
        C12425l c12425l = c14223l.f27323l;
        this.elSpec = new C14060l(c12425l.f24533l, c12425l.f24534l);
    }

    public BCElGamalPublicKey(AbstractC1607l abstractC1607l) {
        throw null;
    }

    public BCElGamalPublicKey(InterfaceC16898l interfaceC16898l) {
        this.y = interfaceC16898l.getY();
        this.elSpec = interfaceC16898l.getParameters();
    }

    public BCElGamalPublicKey(BigInteger bigInteger, C14060l c14060l) {
        this.y = bigInteger;
        this.elSpec = c14060l;
    }

    public BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.elSpec = new C14060l(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.elSpec = new C14060l(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }
}
