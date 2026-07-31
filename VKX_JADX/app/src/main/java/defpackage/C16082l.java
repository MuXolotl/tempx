package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lِٕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16082l implements PrivateKey, Key {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Cinterface f31525l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C6818l f31526l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16082l) {
            return Arrays.equals(AbstractC14024l.crashlytics(this.f31526l.f14247l), AbstractC14024l.crashlytics(((C16082l) obj).f31526l.f14247l));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC9008l.mopub(((C15183l) this.f31526l.f16541l).yandex);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC17291l.purchase(this.f31526l, this.f31525l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(AbstractC14024l.crashlytics(this.f31526l.f14247l));
    }
}
