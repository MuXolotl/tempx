package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lٓۤۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14531l implements PrivateKey, Key {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient Cinterface f28452l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient C10075l f28453l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient Cfor f28454l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14531l) {
            C14531l c14531l = (C14531l) obj;
            if (this.f28454l.ad(c14531l.f28454l) && Arrays.equals(AbstractC14024l.crashlytics(this.f28453l.f20551l), AbstractC14024l.crashlytics(c14531l.f28453l.f20551l))) {
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
            C10075l c10075l = this.f28453l;
            String str = c10075l.f25990l;
            return AbstractC17291l.purchase(c10075l, this.f28452l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (AbstractC14024l.ads(AbstractC14024l.crashlytics(this.f28453l.f20551l)) * 37) + AbstractC14024l.ads(this.f28454l.f832l);
    }
}
