package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lؕ۟۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3681l implements PrivateKey, Key {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Cinterface f7763l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C18465l f7764l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3681l) {
            return Arrays.equals(AbstractC14024l.crashlytics(this.f7764l.f36064l), AbstractC14024l.crashlytics(((C3681l) obj).f7764l.f36064l));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC9008l.mopub(((C6801l) this.f7764l.f16541l).f14239l);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC17291l.purchase(this.f7764l, this.f7763l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(AbstractC14024l.crashlytics(this.f7764l.f36064l));
    }
}
