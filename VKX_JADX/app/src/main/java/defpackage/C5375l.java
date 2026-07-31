package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘؘؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5375l implements PrivateKey, Key {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Cinterface f11509l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C5200l f11510l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5375l) {
            return Arrays.equals(AbstractC14024l.crashlytics(this.f11510l.f11276l), AbstractC14024l.crashlytics(((C5375l) obj).f11510l.f11276l));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC9008l.mopub(this.f11510l.f11275l.yandex);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC17291l.purchase(this.f11510l, this.f11509l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(AbstractC14024l.crashlytics(this.f11510l.f11276l));
    }
}
