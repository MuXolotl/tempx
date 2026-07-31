package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lٕٙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15763l implements PublicKey, Key {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient AbstractC17897l f30945l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15763l) {
            try {
                return Arrays.equals(this.f30945l.getEncoded(), ((C15763l) obj).f30945l.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC18323l.crashlytics(this.f30945l).getEncoded();
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
            return AbstractC14024l.ads(this.f30945l.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
