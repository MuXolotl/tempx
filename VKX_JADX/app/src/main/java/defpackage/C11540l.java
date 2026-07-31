package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lِؐٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11540l implements PrivateKey, Key {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Cinterface f23210l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C7400l f23211l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11540l) {
            return Arrays.equals(this.f23211l.getEncoded(), ((C11540l) obj).f23211l.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS+";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC17291l.purchase(this.f23211l, this.f23210l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(this.f23211l.getEncoded());
    }
}
