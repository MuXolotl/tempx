package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import defpackage.AbstractC9008l;
import defpackage.C10198l;
import defpackage.C11138l;
import defpackage.C12933l;
import defpackage.C13649l;
import defpackage.C15281l;
import defpackage.C2756l;
import defpackage.Cfor;
import defpackage.Cstrictfp;
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC15427l;
import defpackage.applovin;
import defpackage.appmetrica;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes3.dex */
public class BCDSAPrivateKey implements DSAPrivateKey, InterfaceC12233l {
    private static final long serialVersionUID = -4677259546958385734L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient DSAParams dsaSpec;
    private BigInteger x;

    public BCDSAPrivateKey(C2756l c2756l) {
        C15281l c15281lVip = C15281l.vip(c2756l.f5961l.f20786l);
        this.x = ((Cstrictfp) c2756l.ads()).appmetrica();
        this.dsaSpec = new DSAParameterSpec(c15281lVip.f29883l.applovin(), c15281lVip.f29882l.applovin(), c15281lVip.f29881l.applovin());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
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
        Cfor cfor = InterfaceC15427l.f30177l;
        BigInteger p = this.dsaSpec.getP();
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
        return KeyUtil.getEncodedPrivateKeyInfo(new C10198l(cfor, c11138l), new Cstrictfp(getX()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public BigInteger getX() {
        return this.x;
    }

    @Override // defpackage.InterfaceC12233l
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    public int hashCode() {
        return getParams().getQ().hashCode() ^ ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode());
    }

    @Override // defpackage.InterfaceC12233l
    public void setBagAttribute(Cfor cfor, applovin applovinVar) {
        this.attrCarrier.setBagAttribute(cfor, applovinVar);
    }

    @Override // defpackage.InterfaceC12233l
    public void setFriendlyName(String str) {
        this.attrCarrier.setFriendlyName(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DSA Private Key [");
        String str = AbstractC9008l.yandex;
        BigInteger bigIntegerModPow = getParams().getG().modPow(this.x, getParams().getP());
        sb.append(DSAUtil.generateKeyFingerprint(bigIntegerModPow, getParams()));
        sb.append("]");
        sb.append(str);
        sb.append("            Y: ");
        sb.append(bigIntegerModPow.toString(16));
        sb.append(str);
        return sb.toString();
    }

    public BCDSAPrivateKey(C13649l c13649l) {
        this.x = c13649l.f26673l;
        C12933l c12933l = (C12933l) c13649l.f16541l;
        this.dsaSpec = new DSAParameterSpec(c12933l.f25380l, c12933l.f25381l, c12933l.f25382l);
    }

    public BCDSAPrivateKey() {
    }

    public BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.x = dSAPrivateKey.getX();
        this.dsaSpec = dSAPrivateKey.getParams();
    }

    public BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.x = dSAPrivateKeySpec.getX();
        this.dsaSpec = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }
}
