package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lِٗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17574l implements PublicKey, Key {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C13410l f34201l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17574l) {
            return Arrays.equals(AbstractC14024l.crashlytics(this.f34201l.f26313l), AbstractC14024l.crashlytics(((C17574l) obj).f34201l.f26313l));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC9008l.mopub(((C6801l) this.f34201l.f16541l).f14239l);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC18323l.crashlytics(this.f34201l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(AbstractC14024l.crashlytics(this.f34201l.f26313l));
    }
}
