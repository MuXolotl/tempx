package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lؚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7494l implements PublicKey {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient C4492l f15497l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient Cfor f15498l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7494l) {
            C7494l c7494l = (C7494l) obj;
            if (this.f15498l.ad(c7494l.f15498l) && Arrays.equals(this.f15497l.yandex(), c7494l.f15497l.yandex())) {
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
            return AbstractC18323l.crashlytics(this.f15497l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (AbstractC14024l.ads(this.f15497l.yandex()) * 37) + AbstractC14024l.ads(this.f15498l.f832l);
    }
}
