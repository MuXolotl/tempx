package org.bouncycastle.jce.provider;

import defpackage.AbstractC1607l;
import defpackage.C10198l;
import defpackage.C12425l;
import defpackage.C14060l;
import defpackage.C14223l;
import defpackage.C17029l;
import defpackage.C8339l;
import defpackage.C8414l;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.InterfaceC16898l;
import defpackage.InterfaceC4502l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes3.dex */
public class JCEElGamalPublicKey implements InterfaceC16898l, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private C14060l elSpec;
    private BigInteger y;

    public JCEElGamalPublicKey(C17029l c17029l) {
        C8414l c8414lVip = C8414l.vip(c17029l.f33175l.f20786l);
        try {
            this.y = ((Cstrictfp) c17029l.metrica()).appmetrica();
            this.elSpec = new C14060l(c8414lVip.f17421l.applovin(), c8414lVip.f17420l.applovin());
        } catch (IOException unused) {
            C8339l.metrica("invalid info structure in DSA public key");
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.y = (BigInteger) objectInputStream.readObject();
        this.elSpec = new C14060l((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.elSpec.f27407l);
        objectOutputStream.writeObject(this.elSpec.f27406l);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        Cfor cfor = InterfaceC4502l.subs;
        C14060l c14060l = this.elSpec;
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new C10198l(cfor, new C8414l(c14060l.f27407l, c14060l.f27406l)), new Cstrictfp(this.y));
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

    public JCEElGamalPublicKey(C14223l c14223l) {
        this.y = c14223l.f27824l;
        C12425l c12425l = c14223l.f27323l;
        this.elSpec = new C14060l(c12425l.f24533l, c12425l.f24534l);
    }

    public JCEElGamalPublicKey(AbstractC1607l abstractC1607l) {
        throw null;
    }

    public JCEElGamalPublicKey(InterfaceC16898l interfaceC16898l) {
        this.y = interfaceC16898l.getY();
        this.elSpec = interfaceC16898l.getParameters();
    }

    public JCEElGamalPublicKey(BigInteger bigInteger, C14060l c14060l) {
        this.y = bigInteger;
        this.elSpec = c14060l;
    }

    public JCEElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.elSpec = new C14060l(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public JCEElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.elSpec = new C14060l(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }
}
