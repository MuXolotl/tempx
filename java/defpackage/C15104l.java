package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lٔۗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15104l implements PublicKey, Key {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient C13596l f29634l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient Cfor f29635l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15104l) {
            C15104l c15104l = (C15104l) obj;
            if (this.f29635l.ad(c15104l.f29635l) && Arrays.equals(AbstractC14024l.crashlytics(this.f29634l.f26615l), AbstractC14024l.crashlytics(c15104l.f29634l.f26615l))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            C13596l c13596l = this.f29634l;
            String str = c13596l.f25990l;
            return AbstractC18323l.crashlytics(c13596l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (AbstractC14024l.ads(AbstractC14024l.crashlytics(this.f29634l.f26615l)) * 37) + AbstractC14024l.ads(this.f29635l.f832l);
    }
}
