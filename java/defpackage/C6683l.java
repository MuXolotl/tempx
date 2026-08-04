package defpackage;

import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lؙۗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6683l implements PublicKey, Key {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient byte[] f14034l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient String f14035l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C9841l f14036l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6683l) {
            return Arrays.equals(getEncoded(), ((C6683l) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f14035l;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f14034l == null) {
            C9841l c9841l = this.f14036l;
            byte[] bArrRemoteconfig = null;
            if (c9841l.f18137l) {
                C8339l.metrica("private key found");
                return null;
            }
            try {
                bArrRemoteconfig = AbstractC18323l.crashlytics(c9841l).remoteconfig("DER");
            } catch (Exception unused) {
            }
            this.f14034l = bArrRemoteconfig;
        }
        return AbstractC14024l.crashlytics(this.f14034l);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(getEncoded());
    }
}
