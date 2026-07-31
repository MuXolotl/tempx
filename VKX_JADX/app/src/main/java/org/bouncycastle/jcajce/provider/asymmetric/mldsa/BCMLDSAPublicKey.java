package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import defpackage.AbstractC0676l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC6432l;
import defpackage.AbstractC7678l;
import defpackage.AbstractC8535l;
import defpackage.AbstractC9008l;
import defpackage.C13812l;
import defpackage.C16791l;
import defpackage.C17029l;
import defpackage.C17951l;
import defpackage.C4124l;
import defpackage.C8339l;
import defpackage.InterfaceC14821l;
import defpackage.InterfaceC1984l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class BCMLDSAPublicKey implements InterfaceC1984l, InterfaceC14821l {
    private static final long serialVersionUID = 1;
    private transient String algorithm;
    private transient C4124l params;

    public BCMLDSAPublicKey(C4124l c4124l) {
        this.params = c4124l;
        this.algorithm = AbstractC9008l.mopub(C16791l.yandex(((C13812l) c4124l.f16541l).loadAd).f32815l);
    }

    private void init(C17029l c17029l) {
        C4124l c4124l = (C4124l) AbstractC7678l.yandex(c17029l);
        this.params = c4124l;
        this.algorithm = AbstractC9008l.mopub(C16791l.yandex(((C13812l) c4124l.f16541l).loadAd).f32815l);
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
        if (obj instanceof BCMLDSAPublicKey) {
            return Arrays.equals(this.params.getEncoded(), ((BCMLDSAPublicKey) obj).params.getEncoded());
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

    public C4124l getKeyParams() {
        return this.params;
    }

    public C16791l getParameterSpec() {
        return C16791l.yandex(((C13812l) this.params.f16541l).loadAd);
    }

    @Override // defpackage.InterfaceC1984l
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

    public BCMLDSAPublicKey(C17029l c17029l) {
        init(c17029l);
    }
}
