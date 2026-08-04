package defpackage;

import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lؑٓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0315l implements PrivateKey, Key {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient byte[] f1359l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient String f1360l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C5354l f1361l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public transient Cinterface f1362l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0315l) {
            return Arrays.equals(getEncoded(), ((C0315l) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f1360l;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f1359l == null) {
            C5354l c5354l = this.f1361l;
            Cinterface cinterface = this.f1362l;
            byte[] bArrRemoteconfig = null;
            if (!c5354l.f18137l) {
                C8339l.metrica("public key found");
                return null;
            }
            try {
                bArrRemoteconfig = AbstractC17291l.purchase(c5354l, cinterface).remoteconfig("DER");
            } catch (Exception unused) {
            }
            this.f1359l = bArrRemoteconfig;
        }
        return AbstractC14024l.crashlytics(this.f1359l);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(getEncoded());
    }
}
