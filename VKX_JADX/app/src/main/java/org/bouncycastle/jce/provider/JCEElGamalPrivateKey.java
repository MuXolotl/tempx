package org.bouncycastle.jce.provider;

import defpackage.AbstractC8303l;
import defpackage.C10198l;
import defpackage.C12425l;
import defpackage.C14060l;
import defpackage.C1795l;
import defpackage.C2756l;
import defpackage.C8414l;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC16281l;
import defpackage.InterfaceC4502l;
import defpackage.applovin;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes3.dex */
public class JCEElGamalPrivateKey implements InterfaceC16281l, DHPrivateKey, InterfaceC12233l {
    static final long serialVersionUID = 4819350091141529678L;
    private PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    C14060l elSpec;
    BigInteger x;

    public JCEElGamalPrivateKey(C2756l c2756l) {
        C8414l c8414lVip = C8414l.vip(c2756l.f5961l.f20786l);
        this.x = Cstrictfp.premium(c2756l.ads()).appmetrica();
        this.elSpec = new C14060l(c8414lVip.f17421l.applovin(), c8414lVip.f17420l.applovin());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.x = (BigInteger) objectInputStream.readObject();
        this.elSpec = new C14060l((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.elSpec.f27407l);
        objectOutputStream.writeObject(this.elSpec.f27406l);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
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
        Cfor cfor = InterfaceC4502l.subs;
        C14060l c14060l = this.elSpec;
        return KeyUtil.getEncodedPrivateKeyInfo(new C10198l(cfor, new C8414l(c14060l.f27407l, c14060l.f27406l)), new Cstrictfp(getX()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
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

    @Override // defpackage.InterfaceC16281l, javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.x;
    }

    @Override // defpackage.InterfaceC12233l
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    @Override // defpackage.InterfaceC12233l
    public void setBagAttribute(Cfor cfor, applovin applovinVar) {
        this.attrCarrier.setBagAttribute(cfor, applovinVar);
    }

    @Override // defpackage.InterfaceC12233l
    public void setFriendlyName(String str) {
        this.attrCarrier.setFriendlyName(str);
    }

    public JCEElGamalPrivateKey(InterfaceC16281l interfaceC16281l) {
        this.x = interfaceC16281l.getX();
        this.elSpec = interfaceC16281l.getParameters();
    }

    public JCEElGamalPrivateKey(C1795l c1795l) {
        this.x = c1795l.f4209l;
        C12425l c12425l = c1795l.f27323l;
        this.elSpec = new C14060l(c12425l.f24533l, c12425l.f24534l);
    }

    public JCEElGamalPrivateKey(AbstractC8303l abstractC8303l) {
        throw null;
    }

    public JCEElGamalPrivateKey() {
    }

    public JCEElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.elSpec = new C14060l(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    public JCEElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.elSpec = new C14060l(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }
}
