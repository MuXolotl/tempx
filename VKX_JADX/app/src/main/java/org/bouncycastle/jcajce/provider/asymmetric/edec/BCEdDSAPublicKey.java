package org.bouncycastle.jcajce.provider.asymmetric.edec;

import defpackage.AbstractC13041l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC15960l;
import defpackage.AbstractC8151l;
import defpackage.AbstractC8831l;
import defpackage.C11104l;
import defpackage.C17029l;
import defpackage.C18073l;
import defpackage.C6254l;
import defpackage.InterfaceC14611l;
import defpackage.InterfaceC14821l;
import defpackage.InterfaceC2716l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class BCEdDSAPublicKey implements InterfaceC14611l, InterfaceC14821l {
    static final long serialVersionUID = 1;
    transient AbstractC8831l eddsaPublicKey;

    public BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        AbstractC8831l c6254l;
        int length = bArr.length;
        if (!Utils.isValidPrefix(bArr, bArr2)) {
            C18073l.subscription("raw key data not recognised");
            throw null;
        }
        if (bArr2.length - length == 57) {
            c6254l = new C11104l(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                C18073l.subscription("raw key data not recognised");
                throw null;
            }
            c6254l = new C6254l(bArr2, length);
        }
        this.eddsaPublicKey = c6254l;
    }

    private void populateFromPubKeyInfo(C17029l c17029l) {
        byte[] bArrInmobi = c17029l.f33174l.inmobi();
        this.eddsaPublicKey = InterfaceC2716l.amazon.ad(c17029l.f33175l.f20787l) ? new C11104l(bArrInmobi) : new C6254l(bArrInmobi);
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
        return this.eddsaPublicKey;
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
            return "EdDSA";
        }
        return this.eddsaPublicKey instanceof C11104l ? "Ed448" : "Ed25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.eddsaPublicKey instanceof C11104l) {
            byte[] bArr = KeyFactorySpi.Ed448Prefix;
            byte[] bArr2 = new byte[bArr.length + 57];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            C11104l c11104l = (C11104l) this.eddsaPublicKey;
            AbstractC15960l.billing(c11104l.f22309l, bArr2, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.Ed25519Prefix;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        C6254l c6254l = (C6254l) this.eddsaPublicKey;
        AbstractC13041l.purchase(c6254l.f13200l, bArr4, bArr3.length);
        return bArr4;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // defpackage.InterfaceC14611l
    public byte[] getPointEncoding() {
        AbstractC8831l abstractC8831l = this.eddsaPublicKey;
        if (!(abstractC8831l instanceof C11104l)) {
            return ((C6254l) abstractC8831l).getEncoded();
        }
        byte[] bArr = new byte[57];
        AbstractC15960l.billing(((C11104l) abstractC8831l).f22309l, bArr, 0);
        return bArr;
    }

    public int hashCode() {
        return AbstractC14024l.ads(getEncoded());
    }

    public String toString() {
        return Utils.keyToString("Public Key", getAlgorithm(), this.eddsaPublicKey);
    }

    public BCEdDSAPublicKey(C17029l c17029l) {
        populateFromPubKeyInfo(c17029l);
    }

    public BCEdDSAPublicKey(AbstractC8831l abstractC8831l) {
        this.eddsaPublicKey = abstractC8831l;
    }
}
