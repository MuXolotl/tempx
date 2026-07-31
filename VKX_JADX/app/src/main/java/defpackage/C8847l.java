package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌٗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8847l implements PublicKey, Key {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C7006l f18193l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8847l) {
            return Arrays.equals(AbstractC14024l.crashlytics(this.f18193l.f14695l), AbstractC14024l.crashlytics(((C8847l) obj).f18193l.f14695l));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC9008l.mopub(((C17145l) this.f18193l.f16541l).f33330l);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC18323l.crashlytics(this.f18193l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(AbstractC14024l.crashlytics(this.f18193l.f14695l));
    }
}
