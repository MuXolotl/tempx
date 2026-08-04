package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lۣؓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1933l implements Key, PublicKey {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C17794l f4403l;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1933l)) {
            return false;
        }
        return Arrays.equals(AbstractC14024l.crashlytics(this.f4403l.f34658l), AbstractC14024l.crashlytics(((C1933l) obj).f4403l.f34658l));
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC18323l.crashlytics(this.f4403l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC14024l.ads(AbstractC14024l.crashlytics(this.f4403l.f34658l));
    }
}
