package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lؚّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7211l implements PrivateKey, Key {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient Cinterface f15041l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient String f15042l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C10146l f15043l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7211l) {
            return Arrays.equals(getEncoded(), ((C7211l) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f15042l;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC17160l.yandex(this.f15043l, this.f15041l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(getEncoded());
    }
}
