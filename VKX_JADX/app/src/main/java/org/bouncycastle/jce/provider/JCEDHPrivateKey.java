package org.bouncycastle.jce.provider;

import defpackage.AbstractC9361l;
import defpackage.C0500l;
import defpackage.C10198l;
import defpackage.C12029l;
import defpackage.C13061l;
import defpackage.C2396l;
import defpackage.C2756l;
import defpackage.C8339l;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cinterface;
import defpackage.Cstrictfp;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC15427l;
import defpackage.applovin;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes3.dex */
public class JCEDHPrivateKey implements DHPrivateKey, InterfaceC12233l {
    static final long serialVersionUID = 311058815616901812L;
    private InterfaceC12233l attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private DHParameterSpec dhSpec;
    private C2756l info;
    BigInteger x;

    public JCEDHPrivateKey(C2756l c2756l) {
        Cclass cclassInmobi = Cclass.inmobi(c2756l.f5961l.f20786l);
        Cstrictfp cstrictfpPremium = Cstrictfp.premium(c2756l.ads());
        Cfor cfor = c2756l.f5961l.f20787l;
        this.info = c2756l;
        this.x = cstrictfpPremium.appmetrica();
        if (!cfor.ad(InterfaceC0543l.f1860abstract)) {
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
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.x = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
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
        try {
            C2756l c2756l = this.info;
            if (c2756l != null) {
                return c2756l.remoteconfig("DER");
            }
            return new C2756l(new C10198l(InterfaceC0543l.f1860abstract, new C13061l(this.dhSpec.getL(), this.dhSpec.getP(), this.dhSpec.getG())), new Cstrictfp(getX()), (Cinterface) null, (byte[]) null).remoteconfig("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
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

    public JCEDHPrivateKey(C12029l c12029l) {
        this.x = c12029l.f23959l;
        C2396l c2396l = c12029l.f23457l;
        this.dhSpec = new DHParameterSpec(c2396l.f5158l, c2396l.f5159l, c2396l.f5162l);
    }

    public JCEDHPrivateKey() {
    }

    public JCEDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public JCEDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }
}
