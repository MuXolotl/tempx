package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘۣٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14716l implements PublicKey, Key {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C17871l f28779l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14716l) {
            return Arrays.equals(AbstractC14024l.crashlytics(this.f28779l.f34832l), AbstractC14024l.crashlytics(((C14716l) obj).f28779l.f34832l));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Picnic";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC18323l.crashlytics(this.f28779l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(AbstractC14024l.crashlytics(this.f28779l.f34832l));
    }
}
