package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؙّؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12425l implements InterfaceC9719l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f24532l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final BigInteger f24533l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final BigInteger f24534l;

    public C12425l(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        this.f24534l = bigInteger2;
        this.f24533l = bigInteger;
        this.f24532l = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12425l)) {
            return false;
        }
        C12425l c12425l = (C12425l) obj;
        return c12425l.f24533l.equals(this.f24533l) && c12425l.f24534l.equals(this.f24534l) && c12425l.f24532l == this.f24532l;
    }

    public final int hashCode() {
        return (this.f24533l.hashCode() ^ this.f24534l.hashCode()) + this.f24532l;
    }
}
