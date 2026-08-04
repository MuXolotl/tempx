package defpackage;

import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lٓٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14159l implements PublicKey, Key {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient byte[] f27687l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient String f27688l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C13671l f27689l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14159l) {
            return Arrays.equals(getEncoded(), ((C14159l) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f27688l;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f27687l == null) {
            C13671l c13671l = this.f27689l;
            byte[] bArrRemoteconfig = null;
            if (c13671l.f18137l) {
                C8339l.metrica("private key found");
                return null;
            }
            try {
                bArrRemoteconfig = AbstractC18323l.crashlytics(c13671l).remoteconfig("DER");
            } catch (Exception unused) {
            }
            this.f27687l = bArrRemoteconfig;
        }
        return AbstractC14024l.crashlytics(this.f27687l);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(getEncoded());
    }
}
