package org.bouncycastle.jcajce.provider.asymmetric.edec;

import defpackage.AbstractC14024l;
import defpackage.AbstractC15960l;
import defpackage.AbstractC17160l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC8831l;
import defpackage.C11104l;
import defpackage.C1438l;
import defpackage.C2756l;
import defpackage.C6254l;
import defpackage.C9298l;
import defpackage.Cinterface;
import defpackage.Cthrow;
import defpackage.InterfaceC14611l;
import defpackage.InterfaceC14821l;
import defpackage.InterfaceC2716l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCEdDSAPrivateKey implements Key, PrivateKey, InterfaceC14821l {
    static final long serialVersionUID = 1;
    private final byte[] attributes;
    transient AbstractC8831l eddsaPrivateKey;
    transient AbstractC8831l eddsaPublicKey;
    private final boolean hasPublicKey;
    transient int hashCode;

    public BCEdDSAPrivateKey(AbstractC8831l abstractC8831l) {
        this.hasPublicKey = true;
        this.attributes = null;
        this.eddsaPrivateKey = abstractC8831l;
        this.eddsaPublicKey = abstractC8831l instanceof C9298l ? ((C9298l) abstractC8831l).yandex() : ((C1438l) abstractC8831l).yandex();
        this.hashCode = calculateHashCode();
    }

    private int calculateHashCode() {
        byte[] encoded;
        AbstractC8831l abstractC8831l = this.eddsaPublicKey;
        if (abstractC8831l instanceof C11104l) {
            encoded = new byte[57];
            AbstractC15960l.billing(((C11104l) abstractC8831l).f22309l, encoded, 0);
        } else {
            encoded = ((C6254l) abstractC8831l).getEncoded();
        }
        return AbstractC14024l.ads(encoded) + (getAlgorithm().hashCode() * 31);
    }

    private C2756l getPrivateKeyInfo() {
        try {
            Cinterface cinterfaceApplovin = Cinterface.applovin(this.attributes);
            C2756l c2756lYandex = AbstractC17160l.yandex(this.eddsaPrivateKey, cinterfaceApplovin);
            return (!this.hasPublicKey || AbstractC8151l.crashlytics("org.bouncycastle.pkcs8.v1_info_only")) ? new C2756l(c2756lYandex.f5961l, c2756lYandex.ads(), cinterfaceApplovin, (byte[]) null) : c2756lYandex;
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivateKeyInfo(C2756l c2756l) {
        AbstractC8831l abstractC8831lYandex;
        byte[] bArr = Cthrow.premium(c2756l.ads()).f36593l;
        if (InterfaceC2716l.amazon.ad(c2756l.f5961l.f20787l)) {
            C9298l c9298l = new C9298l(bArr);
            this.eddsaPrivateKey = c9298l;
            abstractC8831lYandex = c9298l.yandex();
        } else {
            C1438l c1438l = new C1438l(bArr);
            this.eddsaPrivateKey = c1438l;
            abstractC8831lYandex = c1438l.yandex();
        }
        this.eddsaPublicKey = abstractC8831lYandex;
        this.hashCode = calculateHashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPrivateKeyInfo(C2756l.vip((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public AbstractC8831l engineGetKeyParameters() {
        return this.eddsaPrivateKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivateKey)) {
            return false;
        }
        PrivateKey privateKey = (PrivateKey) obj;
        C2756l privateKeyInfo = getPrivateKeyInfo();
        C2756l privateKeyInfo2 = privateKey instanceof BCEdDSAPrivateKey ? ((BCEdDSAPrivateKey) privateKey).getPrivateKeyInfo() : C2756l.vip(privateKey.getEncoded());
        if (privateKeyInfo != null && privateKeyInfo2 != null) {
            try {
                return AbstractC14024l.smaato(privateKeyInfo.metrica().getEncoded(), privateKeyInfo2.metrica().getEncoded()) & AbstractC14024l.smaato(privateKeyInfo.f5961l.getEncoded(), privateKeyInfo2.f5961l.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        if (AbstractC8151l.crashlytics("org.bouncycastle.emulate.oracle")) {
            return "EdDSA";
        }
        return this.eddsaPrivateKey instanceof C9298l ? "Ed448" : "Ed25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            C2756l privateKeyInfo = getPrivateKeyInfo();
            if (privateKeyInfo == null) {
                return null;
            }
            return privateKeyInfo.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public InterfaceC14611l getPublicKey() {
        return new BCEdDSAPublicKey(this.eddsaPublicKey);
    }

    public int hashCode() {
        return this.hashCode;
    }

    public String toString() {
        return Utils.keyToString("Private Key", getAlgorithm(), this.eddsaPublicKey);
    }

    public BCEdDSAPrivateKey(C2756l c2756l) {
        this.hasPublicKey = c2756l.f5963l != null;
        Cinterface cinterface = c2756l.f5964l;
        this.attributes = cinterface != null ? cinterface.getEncoded() : null;
        populateFromPrivateKeyInfo(c2756l);
    }
}
