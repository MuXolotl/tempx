package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lِۙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12087l implements PrivateKey, Key {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Cinterface f24017l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient AbstractC17897l f24018l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12087l) {
            try {
                return Arrays.equals(this.f24018l.getEncoded(), ((C12087l) obj).f24018l.getEncoded());
            } catch (IOException unused) {
                C8339l.smaato("unable to perform equals");
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
            return AbstractC17291l.purchase(this.f24018l, this.f24017l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        try {
            return AbstractC14024l.ads(this.f24018l.getEncoded());
        } catch (IOException unused) {
            C8339l.smaato("unable to calculate hashCode");
            return 0;
        }
    }
}
