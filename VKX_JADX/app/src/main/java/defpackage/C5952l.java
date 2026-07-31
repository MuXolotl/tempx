package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘِۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5952l implements PrivateKey {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient Cinterface f12554l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient C3910l f12555l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient Cfor f12556l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5952l) {
            C5952l c5952l = (C5952l) obj;
            if (this.f12556l.ad(c5952l.f12556l) && Arrays.equals(this.f12555l.yandex(), c5952l.f12555l.yandex())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC17291l.purchase(this.f12555l, this.f12554l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (AbstractC14024l.ads(this.f12555l.yandex()) * 37) + AbstractC14024l.ads(this.f12556l.f832l);
    }
}
