package org.bouncycastle.jcajce.provider.asymmetric.edec;

import defpackage.AbstractC14024l;
import defpackage.AbstractC17160l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC8831l;
import defpackage.C14685l;
import defpackage.C15654l;
import defpackage.C16244l;
import defpackage.C16638l;
import defpackage.C2756l;
import defpackage.Cinterface;
import defpackage.Cthrow;
import defpackage.InterfaceC12995l;
import defpackage.InterfaceC2716l;
import defpackage.InterfaceC5727l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCXDHPrivateKey implements InterfaceC5727l, PrivateKey {
    static final long serialVersionUID = 1;
    private final byte[] attributes;
    private final boolean hasPublicKey;
    transient int hashCode;
    transient AbstractC8831l xdhPrivateKey;
    transient AbstractC8831l xdhPublicKey;

    public BCXDHPrivateKey(AbstractC8831l abstractC8831l) {
        this.hasPublicKey = true;
        this.attributes = null;
        this.xdhPrivateKey = abstractC8831l;
        this.xdhPublicKey = abstractC8831l instanceof C16638l ? ((C16638l) abstractC8831l).yandex() : ((C16244l) abstractC8831l).yandex();
        this.hashCode = calculateHashCode();
    }

    private int calculateHashCode() {
        AbstractC8831l abstractC8831l = this.xdhPublicKey;
        return AbstractC14024l.ads(abstractC8831l instanceof C14685l ? AbstractC14024l.crashlytics(((C14685l) abstractC8831l).f28737l) : AbstractC14024l.crashlytics(((C15654l) abstractC8831l).f30601l)) + (getAlgorithm().hashCode() * 31);
    }

    private C2756l getPrivateKeyInfo() {
        try {
            Cinterface cinterfaceApplovin = Cinterface.applovin(this.attributes);
            C2756l c2756lYandex = AbstractC17160l.yandex(this.xdhPrivateKey, cinterfaceApplovin);
            return (!this.hasPublicKey || AbstractC8151l.crashlytics("org.bouncycastle.pkcs8.v1_info_only")) ? new C2756l(c2756lYandex.f5961l, c2756lYandex.ads(), cinterfaceApplovin, (byte[]) null) : c2756lYandex;
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivateKeyInfo(C2756l c2756l) {
        AbstractC8831l abstractC8831lYandex;
        int length = c2756l.f5960l.f36593l.length;
        byte[] bArr = (length == 32 || length == 56) ? c2756l.metrica().f36593l : Cthrow.premium(c2756l.ads()).f36593l;
        if (InterfaceC2716l.loadAd.ad(c2756l.f5961l.f20787l)) {
            C16638l c16638l = new C16638l(bArr);
            this.xdhPrivateKey = c16638l;
            abstractC8831lYandex = c16638l.yandex();
        } else {
            C16244l c16244l = new C16244l(bArr);
            this.xdhPrivateKey = c16244l;
            abstractC8831lYandex = c16244l.yandex();
        }
        this.xdhPublicKey = abstractC8831lYandex;
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
        return this.xdhPrivateKey;
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
        C2756l privateKeyInfo2 = privateKey instanceof BCXDHPrivateKey ? ((BCXDHPrivateKey) privateKey).getPrivateKeyInfo() : C2756l.vip(privateKey.getEncoded());
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
            return "XDH";
        }
        return this.xdhPrivateKey instanceof C16638l ? "X448" : "X25519";
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

    public InterfaceC12995l getPublicKey() {
        return new BCXDHPublicKey(this.xdhPublicKey);
    }

    public int hashCode() {
        return this.hashCode;
    }

    public String toString() {
        return Utils.keyToString("Private Key", getAlgorithm(), this.xdhPublicKey);
    }

    public BCXDHPrivateKey(C2756l c2756l) {
        this.hasPublicKey = c2756l.f5963l != null;
        Cinterface cinterface = c2756l.f5964l;
        this.attributes = cinterface != null ? cinterface.getEncoded() : null;
        populateFromPrivateKeyInfo(c2756l);
    }
}
