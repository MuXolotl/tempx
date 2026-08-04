package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌٗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17001l implements PrivateKey, Key {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Cinterface f33130l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C12344l f33131l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17001l)) {
            return false;
        }
        C12344l c12344l = this.f33131l;
        byte[] bArrAdmob = AbstractC14024l.admob(c12344l.f24438l, c12344l.f24440l, c12344l.f24439l);
        C12344l c12344l2 = ((C17001l) obj).f33131l;
        return Arrays.equals(bArrAdmob, AbstractC14024l.admob(c12344l2.f24438l, c12344l2.f24440l, c12344l2.f24439l));
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC9008l.mopub(((C13523l) this.f33131l.f16541l).f26546l);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC17291l.purchase(this.f33131l, this.f33130l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        C12344l c12344l = this.f33131l;
        return AbstractC14024l.ads(AbstractC14024l.admob(c12344l.f24438l, c12344l.f24440l, c12344l.f24439l));
    }
}
