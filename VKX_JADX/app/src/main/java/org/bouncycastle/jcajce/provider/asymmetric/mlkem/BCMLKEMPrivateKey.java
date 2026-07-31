package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import defpackage.AbstractC0676l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC17160l;
import defpackage.AbstractC7799l;
import defpackage.AbstractC8535l;
import defpackage.AbstractC9008l;
import defpackage.C10146l;
import defpackage.C1658l;
import defpackage.C17951l;
import defpackage.C18493l;
import defpackage.C2756l;
import defpackage.C7610l;
import defpackage.Cinterface;
import defpackage.InterfaceC10786l;
import defpackage.InterfaceC14821l;
import defpackage.InterfaceC17102l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class BCMLKEMPrivateKey implements InterfaceC17102l, InterfaceC14821l {
    private static final long serialVersionUID = 1;
    private transient String algorithm;
    private transient Cinterface attributes;
    private transient C10146l params;
    private transient byte[] priorEncoding;

    public BCMLKEMPrivateKey(C10146l c10146l) {
        this.params = c10146l;
        this.algorithm = AbstractC9008l.mopub(((C18493l) c10146l.f16541l).f36123l);
    }

    private void init(C2756l c2756l) {
        this.attributes = c2756l.f5964l;
        this.priorEncoding = c2756l.getEncoded();
        C10146l c10146l = (C10146l) AbstractC7799l.yandex(c2756l);
        this.params = c10146l;
        this.algorithm = AbstractC9008l.mopub(C7610l.yandex(((C18493l) c10146l.f16541l).f36123l).f15658l);
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
        if (obj instanceof BCMLKEMPrivateKey) {
            return Arrays.equals(this.params.getEncoded(), ((BCMLKEMPrivateKey) obj).params.getEncoded());
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
            byte[] bArr = this.priorEncoding;
            return bArr != null ? bArr : AbstractC17160l.yandex(this.params, this.attributes).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public C10146l getKeyParams() {
        return this.params;
    }

    public C7610l getParameterSpec() {
        return C7610l.yandex(((C18493l) this.params.f16541l).f36123l);
    }

    public byte[] getPrivateData() {
        return this.params.getEncoded();
    }

    public InterfaceC17102l getPrivateKey(boolean z) {
        return (!z || AbstractC14024l.crashlytics(this.params.f20658l) == null) ? new BCMLKEMPrivateKey(this.params.mopub(2)) : new BCMLKEMPrivateKey(this.params.mopub(1));
    }

    public InterfaceC10786l getPublicKey() {
        C10146l c10146l = this.params;
        return new BCMLKEMPublicKey(new C1658l((C18493l) c10146l.f16541l, c10146l.f20662l, c10146l.f20657l));
    }

    public byte[] getSeed() {
        return AbstractC14024l.crashlytics(this.params.f20658l);
    }

    public int hashCode() {
        return AbstractC14024l.ads(this.params.getEncoded());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = AbstractC9008l.yandex;
        C10146l c10146l = this.params;
        byte[] bArrMopub = AbstractC14024l.mopub(c10146l.f20662l, c10146l.f20657l);
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

    public BCMLKEMPrivateKey(C2756l c2756l) {
        init(c2756l);
    }
}
