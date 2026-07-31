package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import defpackage.AbstractC0676l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC7799l;
import defpackage.AbstractC8535l;
import defpackage.AbstractC9008l;
import defpackage.C13812l;
import defpackage.C16791l;
import defpackage.C17951l;
import defpackage.C2756l;
import defpackage.C4124l;
import defpackage.C8729l;
import defpackage.Cinterface;
import defpackage.InterfaceC14821l;
import defpackage.InterfaceC17813l;
import defpackage.InterfaceC1984l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class BCMLDSAPrivateKey implements InterfaceC17813l, InterfaceC14821l {
    private static final long serialVersionUID = 1;
    private transient String algorithm;
    private transient Cinterface attributes;
    private transient byte[] encoding;
    private transient C8729l params;

    public BCMLDSAPrivateKey(C8729l c8729l) {
        this.params = c8729l;
        this.algorithm = AbstractC9008l.mopub(C16791l.yandex(((C13812l) c8729l.f16541l).loadAd).f32815l);
    }

    private void init(C8729l c8729l, Cinterface cinterface) {
        this.attributes = cinterface;
        this.params = c8729l;
        this.algorithm = AbstractC9008l.mopub(C16791l.yandex(((C13812l) c8729l.f16541l).loadAd).f32815l);
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
        if (obj instanceof BCMLDSAPrivateKey) {
            return Arrays.equals(this.params.getEncoded(), ((BCMLDSAPrivateKey) obj).params.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.encoding == null) {
            this.encoding = KeyUtil.getEncodedPrivateKeyInfo(this.params, this.attributes);
        }
        return AbstractC14024l.crashlytics(this.encoding);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public C8729l getKeyParams() {
        return this.params;
    }

    public C16791l getParameterSpec() {
        return C16791l.yandex(((C13812l) this.params.f16541l).loadAd);
    }

    public byte[] getPrivateData() {
        return this.params.getEncoded();
    }

    @Override // defpackage.InterfaceC17813l
    public InterfaceC17813l getPrivateKey(boolean z) {
        return (!z || AbstractC14024l.crashlytics(this.params.f17958l) == null) ? new BCMLDSAPrivateKey(this.params.billing(2)) : new BCMLDSAPrivateKey(this.params.billing(1));
    }

    public InterfaceC1984l getPublicKey() {
        C8729l c8729l = this.params;
        byte[] bArr = c8729l.f17961l;
        C4124l c4124l = bArr == null ? null : new C4124l((C13812l) c8729l.f16541l, c8729l.f17955l, bArr);
        if (c4124l == null) {
            return null;
        }
        return new BCMLDSAPublicKey(c4124l);
    }

    @Override // defpackage.InterfaceC17813l
    public byte[] getSeed() {
        return AbstractC14024l.crashlytics(this.params.f17958l);
    }

    public int hashCode() {
        return AbstractC14024l.ads(this.params.getEncoded());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = AbstractC9008l.yandex;
        C8729l c8729l = this.params;
        byte[] bArrMopub = AbstractC14024l.mopub(c8729l.f17955l, c8729l.f17961l);
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

    private void init(C2756l c2756l) {
        this.encoding = c2756l.getEncoded();
        init((C8729l) AbstractC7799l.yandex(c2756l), c2756l.f5964l);
    }

    public BCMLDSAPrivateKey(C2756l c2756l) {
        init(c2756l);
    }
}
