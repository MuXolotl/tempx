package defpackage;

import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lٓۥؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14534l implements PrivateKey, Key {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient byte[] f28455l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient String f28456l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C18301l f28457l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public transient Cinterface f28458l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14534l) {
            return Arrays.equals(getEncoded(), ((C14534l) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f28456l;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f28455l == null) {
            C18301l c18301l = this.f28457l;
            Cinterface cinterface = this.f28458l;
            byte[] bArrRemoteconfig = null;
            if (!c18301l.f18137l) {
                C8339l.metrica("public key found");
                return null;
            }
            try {
                bArrRemoteconfig = AbstractC17291l.purchase(c18301l, cinterface).remoteconfig("DER");
            } catch (Exception unused) {
            }
            this.f28455l = bArrRemoteconfig;
        }
        return AbstractC14024l.crashlytics(this.f28455l);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(getEncoded());
    }
}
