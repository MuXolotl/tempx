package defpackage;

import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: renamed from: lَؑؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0002l implements PublicKey, Key {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient byte[] f850l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient String f851l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C1658l f852l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0002l) {
            return Arrays.equals(getEncoded(), ((C0002l) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f851l;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f850l == null) {
            this.f850l = KeyUtil.getEncodedSubjectPublicKeyInfo(this.f852l);
        }
        return AbstractC14024l.crashlytics(this.f850l);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(getEncoded());
    }
}
