package org.bouncycastle.jcajce.provider.asymmetric.edec;

import defpackage.AbstractC14024l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC8831l;
import defpackage.C14685l;
import defpackage.C15654l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.InterfaceC12995l;
import defpackage.InterfaceC2716l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class BCXDHPublicKey implements InterfaceC12995l {
    static final long serialVersionUID = 1;
    transient AbstractC8831l xdhPublicKey;

    public BCXDHPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        AbstractC8831l c15654l;
        int length = bArr.length;
        if (!Utils.isValidPrefix(bArr, bArr2)) {
            C18073l.subscription("raw key data not recognised");
            throw null;
        }
        if (bArr2.length - length == 56) {
            c15654l = new C14685l(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                C18073l.subscription("raw key data not recognised");
                throw null;
            }
            c15654l = new C15654l(bArr2, length);
        }
        this.xdhPublicKey = c15654l;
    }

    private void populateFromPubKeyInfo(C17029l c17029l) {
        byte[] bArrInmobi = c17029l.f33174l.inmobi();
        this.xdhPublicKey = InterfaceC2716l.loadAd.ad(c17029l.f33175l.f20787l) ? new C14685l(bArrInmobi) : new C15654l(bArrInmobi);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(C17029l.vip((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public AbstractC8831l engineGetKeyParameters() {
        return this.xdhPublicKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PublicKey) {
            return Arrays.equals(((PublicKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        if (AbstractC8151l.crashlytics("org.bouncycastle.emulate.oracle")) {
            return "XDH";
        }
        return this.xdhPublicKey instanceof C14685l ? "X448" : "X25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.xdhPublicKey instanceof C14685l) {
            byte[] bArr = KeyFactorySpi.x448Prefix;
            byte[] bArr2 = new byte[bArr.length + 56];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            C14685l c14685l = (C14685l) this.xdhPublicKey;
            System.arraycopy(c14685l.f28737l, 0, bArr2, bArr.length, 56);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.x25519Prefix;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        C15654l c15654l = (C15654l) this.xdhPublicKey;
        System.arraycopy(c15654l.f30601l, 0, bArr4, bArr3.length, 32);
        return bArr4;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public BigInteger getU() {
        byte[] uEncoding = getUEncoding();
        AbstractC14024l.pro(uEncoding);
        return new BigInteger(1, uEncoding);
    }

    @Override // defpackage.InterfaceC12995l
    public byte[] getUEncoding() {
        AbstractC8831l abstractC8831l = this.xdhPublicKey;
        return abstractC8831l instanceof C14685l ? AbstractC14024l.crashlytics(((C14685l) abstractC8831l).f28737l) : AbstractC14024l.crashlytics(((C15654l) abstractC8831l).f30601l);
    }

    public int hashCode() {
        return AbstractC14024l.ads(getEncoded());
    }

    public String toString() {
        return Utils.keyToString("Public Key", getAlgorithm(), this.xdhPublicKey);
    }

    public BCXDHPublicKey(C17029l c17029l) {
        populateFromPubKeyInfo(c17029l);
    }

    public BCXDHPublicKey(AbstractC8831l abstractC8831l) {
        this.xdhPublicKey = abstractC8831l;
    }
}
