package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lؙٕٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6482l implements PrivateKey {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient Cinterface f13533l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Cfor f13534l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C5745l f13535l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6482l) {
            C6482l c6482l = (C6482l) obj;
            if (this.f13534l.ad(c6482l.f13534l) && Arrays.equals(this.f13535l.yandex(), c6482l.f13535l.yandex())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC17291l.purchase(this.f13535l, this.f13533l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (AbstractC14024l.ads(this.f13535l.yandex()) * 37) + AbstractC14024l.ads(this.f13534l.f832l);
    }
}
