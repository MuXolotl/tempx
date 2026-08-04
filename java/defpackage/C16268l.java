package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16268l implements Key, PrivateKey {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Cinterface f31836l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C11529l f31837l;

    public final boolean equals(Object obj) {
        if (obj instanceof C16268l) {
            return Arrays.equals(AbstractC14024l.billing(this.f31837l.f23187l), AbstractC14024l.billing(((C16268l) obj).f31837l.f23187l));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC17291l.purchase(this.f31837l, this.f31836l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        short[] sArrBilling = AbstractC14024l.billing(this.f31837l.f23187l);
        if (sArrBilling == null) {
            return 0;
        }
        int length = sArrBilling.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArrBilling[length] & 255);
        }
    }
}
