package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lؔٔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2618l implements PrivateKey, Key {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Cinterface f5692l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C10002l f5693l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2618l) {
            return Arrays.equals(AbstractC14024l.crashlytics(this.f5693l.f20401l), AbstractC14024l.crashlytics(((C2618l) obj).f5693l.f20401l));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC9008l.mopub(((C17145l) this.f5693l.f16541l).f33330l);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC17291l.purchase(this.f5693l, this.f5692l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(AbstractC14024l.crashlytics(this.f5693l.f20401l));
    }
}
