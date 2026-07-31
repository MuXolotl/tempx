package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import defpackage.AbstractC0676l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC6432l;
import defpackage.AbstractC7678l;
import defpackage.AbstractC8535l;
import defpackage.AbstractC9008l;
import defpackage.C17029l;
import defpackage.C17951l;
import defpackage.C18097l;
import defpackage.C6741l;
import defpackage.C8339l;
import defpackage.C9314l;
import defpackage.InterfaceC14821l;
import defpackage.InterfaceC14873l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class BCSLHDSAPublicKey implements InterfaceC14873l, InterfaceC14821l {
    private static final long serialVersionUID = 1;
    private transient C9314l params;

    public BCSLHDSAPublicKey(C17029l c17029l) {
        init(c17029l);
    }

    private void init(C17029l c17029l) {
        this.params = (C9314l) AbstractC7678l.yandex(c17029l);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(C17029l.vip((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCSLHDSAPublicKey) {
            return Arrays.equals(this.params.getEncoded(), ((BCSLHDSAPublicKey) obj).params.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SLH-DSA-".concat(AbstractC9008l.mopub(((C18097l) this.params.f16541l).yandex));
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6432l.yandex(this.params).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public C9314l getKeyParams() {
        return this.params;
    }

    public C6741l getParameterSpec() {
        return C6741l.yandex(((C18097l) this.params.f16541l).yandex);
    }

    public byte[] getPublicData() {
        return this.params.getEncoded();
    }

    public int hashCode() {
        return AbstractC14024l.ads(this.params.getEncoded());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = AbstractC9008l.yandex;
        byte[] encoded = this.params.getEncoded();
        sb.append(getAlgorithm());
        sb.append(" Public Key [");
        if (160 % 8 != 0) {
            C8339l.metrica("bitLength must be a multiple of 8");
            return null;
        }
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c17951l.billing(0, encoded.length, encoded);
        int i = 160 / 8;
        byte[] bArr = new byte[i];
        c17951l.crashlytics(0, i, bArr);
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 != bArr.length; i2++) {
            if (i2 > 0) {
                sb2.append(":");
            }
            int i3 = (bArr[i2] >>> 4) & 15;
            char[] cArr = AbstractC0676l.yandex;
            sb2.append(cArr[i3]);
            sb2.append(cArr[bArr[i2] & 15]);
        }
        sb.append(sb2.toString());
        sb.append("]");
        sb.append(str);
        sb.append("    public data: ");
        sb.append(AbstractC8535l.purchase(0, encoded.length, encoded));
        sb.append(str);
        return sb.toString();
    }

    public BCSLHDSAPublicKey(C9314l c9314l) {
        this.params = c9314l;
    }
}
