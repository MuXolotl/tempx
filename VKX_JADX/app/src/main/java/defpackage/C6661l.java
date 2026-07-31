package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lؙۖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6661l implements PublicKey {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Cfor f14011l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C1671l f14012l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6661l) {
            C6661l c6661l = (C6661l) obj;
            try {
                if (this.f14011l.ad(c6661l.f14011l) && Arrays.equals(this.f14012l.getEncoded(), c6661l.f14012l.getEncoded())) {
                    return true;
                }
            } catch (IOException unused) {
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
            return AbstractC18323l.crashlytics(this.f14012l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        try {
            return (AbstractC14024l.ads(this.f14012l.getEncoded()) * 37) + AbstractC14024l.ads(this.f14011l.f832l);
        } catch (IOException unused) {
            return AbstractC14024l.ads(this.f14011l.f832l);
        }
    }
}
