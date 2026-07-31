package org.bouncycastle.jcajce.provider.asymmetric.dh;

import defpackage.AbstractC14024l;
import defpackage.AbstractC9361l;
import defpackage.C0500l;
import defpackage.C10198l;
import defpackage.C11138l;
import defpackage.C13061l;
import defpackage.C14063l;
import defpackage.C14396l;
import defpackage.C14839l;
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
import defpackage.appmetrica;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes3.dex */
public class BCDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private transient C7438l dhPublicKey;
    private transient DHParameterSpec dhSpec;
    private transient C17029l info;
    private BigInteger y;

    public BCDHPublicKey(C17029l c17029l) {
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
                C14839l c14839l = c0500lVip.f1812l;
                Cstrictfp cstrictfp = c0500lVip.f1809l;
                Cstrictfp cstrictfp2 = c0500lVip.f1810l;
                Cstrictfp cstrictfp3 = c0500lVip.f1811l;
                if (c14839l != null) {
                    this.dhPublicKey = new C7438l(this.y, new C2396l(cstrictfp3.applovin(), cstrictfp2.applovin(), cstrictfp.applovin(), 160, 0, c0500lVip.metrica(), new C14396l(c14839l.f29052l.applovin(), c14839l.f29051l.applovin().intValue())));
                } else {
                    this.dhPublicKey = new C7438l(this.y, new C2396l(cstrictfp3.applovin(), cstrictfp2.applovin(), cstrictfp.applovin(), 160, 0, c0500lVip.metrica(), null));
                }
                this.dhSpec = new C14063l(this.dhPublicKey.f23457l);
                return;
            }
            C13061l c13061lVip = C13061l.vip(cclassInmobi);
            BigInteger bigIntegerMetrica = c13061lVip.metrica();
            Cstrictfp cstrictfp4 = c13061lVip.f25573l;
            Cstrictfp cstrictfp5 = c13061lVip.f25574l;
            if (bigIntegerMetrica == null) {
                this.dhSpec = new DHParameterSpec(cstrictfp5.applovin(), cstrictfp4.applovin());
                this.dhPublicKey = new C7438l(this.y, new C2396l(0, this.dhSpec.getP(), this.dhSpec.getG()));
                return;
            }
            this.dhSpec = new DHParameterSpec(cstrictfp5.applovin(), cstrictfp4.applovin(), c13061lVip.metrica().intValue());
            this.dhPublicKey = new C7438l(this.y, new C2396l(this.dhSpec.getL(), this.dhSpec.getP(), this.dhSpec.getG()));
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

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public C7438l engineGetKeyParameters() {
        return this.dhPublicKey;
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
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C10198l c10198l;
        Cstrictfp cstrictfp;
        String str;
        C17029l c17029l = this.info;
        if (c17029l != null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(c17029l);
        }
        DHParameterSpec dHParameterSpec = this.dhSpec;
        if ((dHParameterSpec instanceof C14063l) && ((C14063l) dHParameterSpec).f27410l != null) {
            C2396l c2396lYandex = ((C14063l) dHParameterSpec).yandex();
            C14396l c14396l = c2396lYandex.f5157l;
            C14839l c14839l = c14396l != null ? new C14839l(AbstractC14024l.crashlytics(c14396l.yandex), c14396l.loadAd) : null;
            Cfor cfor = InterfaceC15427l.f30146l;
            BigInteger bigInteger = c2396lYandex.f5158l;
            BigInteger bigInteger2 = c2396lYandex.f5159l;
            BigInteger bigInteger3 = c2396lYandex.f5156l;
            BigInteger bigInteger4 = c2396lYandex.f5161l;
            if (bigInteger == null) {
                str = "'p' cannot be null";
            } else if (bigInteger2 == null) {
                str = "'g' cannot be null";
            } else if (bigInteger3 != null) {
                Cstrictfp cstrictfp2 = new Cstrictfp(bigInteger);
                Cstrictfp cstrictfp3 = new Cstrictfp(bigInteger2);
                Cstrictfp cstrictfp4 = new Cstrictfp(bigInteger3);
                Cstrictfp cstrictfp5 = bigInteger4 != null ? new Cstrictfp(bigInteger4) : null;
                appmetrica appmetricaVar = new appmetrica(5, 0);
                appmetricaVar.purchase(cstrictfp2);
                appmetricaVar.purchase(cstrictfp3);
                appmetricaVar.purchase(cstrictfp4);
                if (cstrictfp5 != null) {
                    appmetricaVar.purchase(cstrictfp5);
                }
                if (c14839l != null) {
                    appmetricaVar.purchase(c14839l);
                }
                C11138l c11138l = new C11138l(appmetricaVar);
                c11138l.f22357l = -1;
                c10198l = new C10198l(cfor, c11138l);
                cstrictfp = new Cstrictfp(this.y);
            } else {
                str = "'q' cannot be null";
            }
            C8339l.metrica(str);
            return null;
        }
        Cfor cfor2 = InterfaceC0543l.f1860abstract;
        BigInteger p = dHParameterSpec.getP();
        BigInteger g = this.dhSpec.getG();
        int l = this.dhSpec.getL();
        Cstrictfp cstrictfp6 = new Cstrictfp(p);
        Cstrictfp cstrictfp7 = new Cstrictfp(g);
        Cstrictfp cstrictfpM4580private = l != 0 ? Cstrictfp.m4580private(l) : null;
        appmetrica appmetricaVar2 = new appmetrica(3, 0);
        appmetricaVar2.purchase(cstrictfp6);
        appmetricaVar2.purchase(cstrictfp7);
        if ((cstrictfpM4580private != null ? cstrictfpM4580private.applovin() : null) != null) {
            appmetricaVar2.purchase(cstrictfpM4580private);
        }
        C11138l c11138l2 = new C11138l(appmetricaVar2);
        c11138l2.f22357l = -1;
        c10198l = new C10198l(cfor2, c11138l2);
        cstrictfp = new Cstrictfp(this.y);
        return KeyUtil.getEncodedSubjectPublicKeyInfo(c10198l, cstrictfp);
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

    public int hashCode() {
        return getParams().getL() ^ ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode());
    }

    public String toString() {
        return DHUtil.publicKeyToString("DH", this.y, new C2396l(0, this.dhSpec.getP(), this.dhSpec.getG()));
    }

    public BCDHPublicKey(C7438l c7438l) {
        this.y = c7438l.f15399l;
        this.dhSpec = new C14063l(c7438l.f23457l);
        this.dhPublicKey = c7438l;
    }

    public BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.y = bigInteger;
        this.dhSpec = dHParameterSpec;
        if (dHParameterSpec instanceof C14063l) {
            this.dhPublicKey = new C7438l(bigInteger, ((C14063l) dHParameterSpec).yandex());
        } else {
            this.dhPublicKey = new C7438l(bigInteger, new C2396l(0, dHParameterSpec.getP(), dHParameterSpec.getG()));
        }
    }

    public BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        DHParameterSpec params = dHPublicKey.getParams();
        this.dhSpec = params;
        if (params instanceof C14063l) {
            this.dhPublicKey = new C7438l(this.y, ((C14063l) params).yandex());
        } else {
            this.dhPublicKey = new C7438l(this.y, new C2396l(0, this.dhSpec.getP(), this.dhSpec.getG()));
        }
    }

    public BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.dhSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        this.dhPublicKey = new C7438l(this.y, new C2396l(0, dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
    }
}
