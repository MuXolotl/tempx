package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import defpackage.AbstractC0676l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC6432l;
import defpackage.AbstractC7678l;
import defpackage.AbstractC8535l;
import defpackage.AbstractC9008l;
import defpackage.C1658l;
import defpackage.C17029l;
import defpackage.C17951l;
import defpackage.C18493l;
import defpackage.C7610l;
import defpackage.InterfaceC10786l;
import defpackage.InterfaceC14821l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class BCMLKEMPublicKey implements InterfaceC10786l, InterfaceC14821l {
    private static final long serialVersionUID = 1;
    private transient String algorithm;
    private transient C1658l params;

    public BCMLKEMPublicKey(C1658l c1658l) {
        init(c1658l);
    }

    private void init(C17029l c17029l) {
        C1658l c1658l = (C1658l) AbstractC7678l.yandex(c17029l);
        this.params = c1658l;
        this.algorithm = AbstractC9008l.mopub(C7610l.yandex(((C18493l) c1658l.f16541l).f36123l).f15658l);
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
        if (obj instanceof BCMLKEMPublicKey) {
            return Arrays.equals(getEncoded(), ((BCMLKEMPublicKey) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.algorithm;
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

    public C1658l getKeyParams() {
        return this.params;
    }

    public C7610l getParameterSpec() {
        return C7610l.yandex(((C18493l) this.params.f16541l).f36123l);
    }

    @Override // defpackage.InterfaceC10786l
    public byte[] getPublicData() {
        C1658l c1658l = this.params;
        return AbstractC14024l.mopub(c1658l.f4002l, c1658l.f4003l);
    }

    public int hashCode() {
        return AbstractC14024l.ads(getEncoded());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = AbstractC9008l.yandex;
        C1658l c1658l = this.params;
        byte[] bArrMopub = AbstractC14024l.mopub(c1658l.f4002l, c1658l.f4003l);
        sb.append(getAlgorithm());
        sb.append(" Public Key [");
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c17951l.billing(0, bArrMopub.length, bArrMopub);
        byte[] bArr = new byte[20];
        c17951l.crashlytics(0, 20, bArr);
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i != 20; i++) {
            if (i > 0) {
                sb2.append(":");
            }
            int i2 = (bArr[i] >>> 4) & 15;
            char[] cArr = AbstractC0676l.yandex;
            sb2.append(cArr[i2]);
            sb2.append(cArr[bArr[i] & 15]);
        }
        sb.append(sb2.toString());
        sb.append("]");
        sb.append(str);
        sb.append("    public data: ");
        sb.append(AbstractC8535l.purchase(0, bArrMopub.length, bArrMopub));
        sb.append(str);
        return sb.toString();
    }

    public BCMLKEMPublicKey(C17029l c17029l) {
        init(c17029l);
    }

    private void init(C1658l c1658l) {
        this.params = c1658l;
        this.algorithm = AbstractC9008l.mopub(C7610l.yandex(((C18493l) c1658l.f16541l).f36123l).f15658l);
    }
}
