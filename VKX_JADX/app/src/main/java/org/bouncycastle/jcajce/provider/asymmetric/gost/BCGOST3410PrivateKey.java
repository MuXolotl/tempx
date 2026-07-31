package org.bouncycastle.jcajce.provider.asymmetric.gost;

import defpackage.C0277l;
import defpackage.C0419l;
import defpackage.C10198l;
import defpackage.C11327l;
import defpackage.C13266l;
import defpackage.C13777l;
import defpackage.C2756l;
import defpackage.C4598l;
import defpackage.C6230l;
import defpackage.C8339l;
import defpackage.Ccase;
import defpackage.Cfor;
import defpackage.Cinterface;
import defpackage.Cstrictfp;
import defpackage.Cthrow;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC2320l;
import defpackage.InterfaceC9935l;
import defpackage.applovin;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes3.dex */
public class BCGOST3410PrivateKey implements InterfaceC2320l, InterfaceC12233l {
    static final long serialVersionUID = 8581661527592305464L;
    private transient InterfaceC12233l attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient InterfaceC9935l gost3410Spec;
    private BigInteger x;

    public BCGOST3410PrivateKey(C2756l c2756l) {
        BigInteger bigInteger;
        C13777l c13777lVip = C13777l.vip(c2756l.f5961l.f20786l);
        Ccase ccaseAds = c2756l.ads();
        if (ccaseAds instanceof Cstrictfp) {
            bigInteger = Cstrictfp.premium(ccaseAds).applovin();
        } else {
            byte[] bArr = Cthrow.premium(c2756l.ads()).f36593l;
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i != bArr.length; i++) {
                bArr2[i] = bArr[(bArr.length - 1) - i];
            }
            bigInteger = new BigInteger(1, bArr2);
        }
        this.x = bigInteger;
        this.gost3410Spec = C6230l.yandex(c13777lVip);
    }

    private boolean compareObj(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new C6230l(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        } else {
            this.gost3410Spec = new C6230l(new C0419l((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object obj;
        objectOutputStream.defaultWriteObject();
        InterfaceC9935l interfaceC9935l = this.gost3410Spec;
        if (((C6230l) interfaceC9935l).f13161l != null) {
            obj = ((C6230l) interfaceC9935l).f13161l;
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(((C6230l) this.gost3410Spec).f13162l.yandex);
            objectOutputStream.writeObject(((C6230l) this.gost3410Spec).f13162l.loadAd);
            obj = ((C6230l) this.gost3410Spec).f13162l.crashlytics;
        }
        objectOutputStream.writeObject(obj);
        objectOutputStream.writeObject(((C6230l) this.gost3410Spec).f13160l);
        objectOutputStream.writeObject(((C6230l) this.gost3410Spec).f13163l);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC2320l)) {
            return false;
        }
        InterfaceC2320l interfaceC2320l = (InterfaceC2320l) obj;
        return getX().equals(interfaceC2320l.getX()) && ((C6230l) getParameters()).f13162l.equals(((C6230l) interfaceC2320l.getParameters()).f13162l) && compareObj(((C6230l) getParameters()).f13160l, ((C6230l) interfaceC2320l.getParameters()).f13160l) && compareObj(((C6230l) getParameters()).f13163l, ((C6230l) interfaceC2320l.getParameters()).f13163l);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
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
        byte[] byteArray = getX().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            return (this.gost3410Spec instanceof C6230l ? new C2756l(new C10198l(InterfaceC11987l.firebase, new C13777l(new Cfor(((C6230l) this.gost3410Spec).f13161l), new Cfor(((C6230l) this.gost3410Spec).f13160l))), new C11327l(bArr), (Cinterface) null, (byte[]) null) : new C2756l(new C10198l(InterfaceC11987l.firebase), new C11327l(bArr), (Cinterface) null, (byte[]) null)).remoteconfig("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // defpackage.InterfaceC3016l
    public InterfaceC9935l getParameters() {
        return this.gost3410Spec;
    }

    @Override // defpackage.InterfaceC2320l
    public BigInteger getX() {
        return this.x;
    }

    @Override // defpackage.InterfaceC12233l
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    public int hashCode() {
        return this.gost3410Spec.hashCode() ^ getX().hashCode();
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
        try {
            return GOSTUtil.privateKeyToString("GOST3410", this.x, (C0277l) ((C4598l) GOST3410Util.generatePrivateKeyParameter(this)).f16541l);
        } catch (InvalidKeyException e) {
            C8339l.smaato(e.getMessage());
            return null;
        }
    }

    public BCGOST3410PrivateKey(InterfaceC2320l interfaceC2320l) {
        this.x = interfaceC2320l.getX();
        this.gost3410Spec = interfaceC2320l.getParameters();
    }

    public BCGOST3410PrivateKey(C4598l c4598l, C6230l c6230l) {
        this.x = c4598l.f9336l;
        this.gost3410Spec = c6230l;
        if (c6230l != null) {
            return;
        }
        C8339l.metrica("spec is null");
        throw null;
    }

    public BCGOST3410PrivateKey(C13266l c13266l) {
        this.x = c13266l.f26044l;
        this.gost3410Spec = new C6230l(new C0419l(c13266l.f26043l, c13266l.f26042l, c13266l.f26045l));
    }

    public BCGOST3410PrivateKey() {
    }
}
