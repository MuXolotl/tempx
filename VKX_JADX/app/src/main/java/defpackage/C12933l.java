package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lّٜۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12933l implements InterfaceC9719l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final BigInteger f25380l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final BigInteger f25381l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final BigInteger f25382l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C8312l f25383l;

    public C12933l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, C8312l c8312l) {
        this.f25382l = bigInteger3;
        this.f25380l = bigInteger;
        this.f25381l = bigInteger2;
        this.f25383l = c8312l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12933l)) {
            return false;
        }
        C12933l c12933l = (C12933l) obj;
        return c12933l.f25380l.equals(this.f25380l) && c12933l.f25381l.equals(this.f25381l) && c12933l.f25382l.equals(this.f25382l);
    }

    public final int hashCode() {
        return this.f25382l.hashCode() ^ (this.f25380l.hashCode() ^ this.f25381l.hashCode());
    }

    public C12933l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f25382l = bigInteger3;
        this.f25380l = bigInteger;
        this.f25381l = bigInteger2;
    }
}
