package org.bouncycastle.jcajce.provider.asymmetric.dh;

import defpackage.AbstractC14024l;
import defpackage.AbstractC9361l;
import defpackage.C0500l;
import defpackage.C10198l;
import defpackage.C11138l;
import defpackage.C12029l;
import defpackage.C13061l;
import defpackage.C14063l;
import defpackage.C14396l;
import defpackage.C14839l;
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
import defpackage.appmetrica;
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
public class BCDHPrivateKey implements DHPrivateKey, InterfaceC12233l {
    static final long serialVersionUID = 311058815616901812L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient C12029l dhPrivateKey;
    private transient DHParameterSpec dhSpec;
    private transient C2756l info;
    private BigInteger x;

    public BCDHPrivateKey(C2756l c2756l) {
        Cclass cclassInmobi = Cclass.inmobi(c2756l.f5961l.f20786l);
        Cstrictfp cstrictfp = (Cstrictfp) c2756l.ads();
        Cfor cfor = c2756l.f5961l.f20787l;
        this.info = c2756l;
        this.x = cstrictfp.appmetrica();
        if (!cfor.ad(InterfaceC0543l.f1860abstract)) {
            if (!cfor.ad(InterfaceC15427l.f30146l)) {
                C8339l.metrica(AbstractC9361l.license("unknown algorithm type: ", cfor));
                throw null;
            }
            C0500l c0500lVip = C0500l.vip(cclassInmobi);
            Cstrictfp cstrictfp2 = c0500lVip.f1811l;
            Cstrictfp cstrictfp3 = c0500lVip.f1810l;
            Cstrictfp cstrictfp4 = c0500lVip.f1809l;
            this.dhSpec = new C14063l(0, 0, cstrictfp2.applovin(), cstrictfp4.applovin(), cstrictfp3.applovin(), c0500lVip.metrica());
            this.dhPrivateKey = new C12029l(this.x, new C2396l(c0500lVip.f1811l.applovin(), cstrictfp3.applovin(), cstrictfp4.applovin(), 160, 0, c0500lVip.metrica(), null));
            return;
        }
        C13061l c13061lVip = C13061l.vip(cclassInmobi);
        BigInteger bigIntegerMetrica = c13061lVip.metrica();
        Cstrictfp cstrictfp5 = c13061lVip.f25573l;
        Cstrictfp cstrictfp6 = c13061lVip.f25574l;
        if (bigIntegerMetrica == null) {
            this.dhSpec = new DHParameterSpec(cstrictfp6.applovin(), cstrictfp5.applovin());
            this.dhPrivateKey = new C12029l(this.x, new C2396l(0, cstrictfp6.applovin(), cstrictfp5.applovin()));
            return;
        }
        this.dhSpec = new DHParameterSpec(cstrictfp6.applovin(), cstrictfp5.applovin(), c13061lVip.metrica().intValue());
        this.dhPrivateKey = new C12029l(this.x, new C2396l(c13061lVip.metrica().intValue(), cstrictfp6.applovin(), cstrictfp5.applovin()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public C12029l engineGetKeyParameters() {
        C12029l c12029l = this.dhPrivateKey;
        if (c12029l != null) {
            return c12029l;
        }
        DHParameterSpec dHParameterSpec = this.dhSpec;
        boolean z = dHParameterSpec instanceof C14063l;
        BigInteger bigInteger = this.x;
        if (z) {
            return new C12029l(bigInteger, ((C14063l) dHParameterSpec).yandex());
        }
        return new C12029l(bigInteger, new C2396l(this.dhSpec.getL(), dHParameterSpec.getP(), this.dhSpec.getG()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
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
        C2756l c2756l;
        try {
            C2756l c2756l2 = this.info;
            if (c2756l2 != null) {
                return c2756l2.remoteconfig("DER");
            }
            DHParameterSpec dHParameterSpec = this.dhSpec;
            if (!(dHParameterSpec instanceof C14063l) || ((C14063l) dHParameterSpec).f27410l == null) {
                Cfor cfor = InterfaceC0543l.f1860abstract;
                BigInteger p = dHParameterSpec.getP();
                BigInteger g = this.dhSpec.getG();
                int l = this.dhSpec.getL();
                Cstrictfp cstrictfp = new Cstrictfp(p);
                Cstrictfp cstrictfp2 = new Cstrictfp(g);
                Cstrictfp cstrictfpM4580private = l != 0 ? Cstrictfp.m4580private(l) : null;
                appmetrica appmetricaVar = new appmetrica(3, 0);
                appmetricaVar.purchase(cstrictfp);
                appmetricaVar.purchase(cstrictfp2);
                if ((cstrictfpM4580private == null ? null : cstrictfpM4580private.applovin()) != null) {
                    appmetricaVar.purchase(cstrictfpM4580private);
                }
                C11138l c11138l = new C11138l(appmetricaVar);
                c11138l.f22357l = -1;
                c2756l = new C2756l(new C10198l(cfor, c11138l), new Cstrictfp(getX()), (Cinterface) null, (byte[]) null);
            } else {
                C2396l c2396lYandex = ((C14063l) dHParameterSpec).yandex();
                C14396l c14396l = c2396lYandex.f5157l;
                C14839l c14839l = c14396l != null ? new C14839l(AbstractC14024l.crashlytics(c14396l.yandex), c14396l.loadAd) : null;
                Cfor cfor2 = InterfaceC15427l.f30146l;
                BigInteger bigInteger = c2396lYandex.f5158l;
                BigInteger bigInteger2 = c2396lYandex.f5159l;
                BigInteger bigInteger3 = c2396lYandex.f5156l;
                BigInteger bigInteger4 = c2396lYandex.f5161l;
                if (bigInteger == null) {
                    throw new IllegalArgumentException("'p' cannot be null");
                }
                if (bigInteger2 == null) {
                    throw new IllegalArgumentException("'g' cannot be null");
                }
                if (bigInteger3 == null) {
                    throw new IllegalArgumentException("'q' cannot be null");
                }
                Cstrictfp cstrictfp3 = new Cstrictfp(bigInteger);
                Cstrictfp cstrictfp4 = new Cstrictfp(bigInteger2);
                Cstrictfp cstrictfp5 = new Cstrictfp(bigInteger3);
                Cstrictfp cstrictfp6 = bigInteger4 != null ? new Cstrictfp(bigInteger4) : null;
                appmetrica appmetricaVar2 = new appmetrica(5, 0);
                appmetricaVar2.purchase(cstrictfp3);
                appmetricaVar2.purchase(cstrictfp4);
                appmetricaVar2.purchase(cstrictfp5);
                if (cstrictfp6 != null) {
                    appmetricaVar2.purchase(cstrictfp6);
                }
                if (c14839l != null) {
                    appmetricaVar2.purchase(c14839l);
                }
                C11138l c11138l2 = new C11138l(appmetricaVar2);
                c11138l2.f22357l = -1;
                c2756l = new C2756l(new C10198l(cfor2, c11138l2), new Cstrictfp(getX()), (Cinterface) null, (byte[]) null);
            }
            return c2756l.remoteconfig("DER");
        } catch (Exception unused) {
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

    public int hashCode() {
        return getParams().getL() ^ ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode());
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
        return DHUtil.privateKeyToString("DH", this.x, new C2396l(0, this.dhSpec.getP(), this.dhSpec.getG()));
    }

    public BCDHPrivateKey(C12029l c12029l) {
        this.x = c12029l.f23959l;
        this.dhSpec = new C14063l(c12029l.f23457l);
    }

    public BCDHPrivateKey() {
    }

    public BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }
}
