package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import defpackage.AbstractC0676l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC17160l;
import defpackage.AbstractC7799l;
import defpackage.AbstractC8535l;
import defpackage.AbstractC9008l;
import defpackage.C10237l;
import defpackage.C1180l;
import defpackage.C17951l;
import defpackage.C18097l;
import defpackage.C2756l;
import defpackage.C6741l;
import defpackage.C9314l;
import defpackage.Cinterface;
import defpackage.InterfaceC14821l;
import defpackage.InterfaceC14873l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class BCSLHDSAPrivateKey implements PrivateKey, Key, InterfaceC14821l {
    private static final long serialVersionUID = 1;
    private transient Cinterface attributes;
    private transient C1180l params;

    public BCSLHDSAPrivateKey(C2756l c2756l) {
        init(c2756l);
    }

    private void init(C2756l c2756l) {
        this.attributes = c2756l.f5964l;
        this.params = (C1180l) AbstractC7799l.yandex(c2756l);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(C2756l.vip((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCSLHDSAPrivateKey) {
            return Arrays.equals(this.params.getEncoded(), ((BCSLHDSAPrivateKey) obj).params.getEncoded());
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
            return AbstractC17160l.yandex(this.params, this.attributes).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public C1180l getKeyParams() {
        return this.params;
    }

    public C6741l getParameterSpec() {
        return C6741l.yandex(((C18097l) this.params.f16541l).yandex);
    }

    public InterfaceC14873l getPublicKey() {
        C1180l c1180l = this.params;
        C18097l c18097l = (C18097l) c1180l.f16541l;
        C10237l c10237l = c1180l.f3173l;
        return new BCSLHDSAPublicKey(new C9314l(c18097l, AbstractC14024l.mopub(c10237l.yandex, c10237l.loadAd)));
    }

    public int hashCode() {
        return AbstractC14024l.ads(this.params.getEncoded());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = AbstractC9008l.yandex;
        C10237l c10237l = this.params.f3173l;
        byte[] bArrMopub = AbstractC14024l.mopub(c10237l.yandex, c10237l.loadAd);
        sb.append(getAlgorithm());
        sb.append(" Private Key [");
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

    public BCSLHDSAPrivateKey(C1180l c1180l) {
        this.params = c1180l;
    }
}
