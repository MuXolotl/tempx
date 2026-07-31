package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lّؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0277l implements InterfaceC9719l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final BigInteger f1275l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final BigInteger f1276l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final BigInteger f1277l;

    public C0277l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f1277l = bigInteger;
        this.f1276l = bigInteger2;
        this.f1275l = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0277l)) {
            return false;
        }
        C0277l c0277l = (C0277l) obj;
        return c0277l.f1277l.equals(this.f1277l) && c0277l.f1276l.equals(this.f1276l) && c0277l.f1275l.equals(this.f1275l);
    }

    public final int hashCode() {
        return this.f1275l.hashCode() ^ (this.f1277l.hashCode() ^ this.f1276l.hashCode());
    }

    public C0277l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this.f1275l = bigInteger3;
        this.f1277l = bigInteger;
        this.f1276l = bigInteger2;
    }
}
