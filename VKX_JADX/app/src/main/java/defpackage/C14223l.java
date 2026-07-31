package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lِٓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14223l extends AbstractC14014l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final BigInteger f27824l;

    public C14223l(BigInteger bigInteger, C12425l c12425l) {
        super(false, c12425l);
        this.f27824l = bigInteger;
    }

    @Override // defpackage.AbstractC14014l
    public final boolean equals(Object obj) {
        return (obj instanceof C14223l) && ((C14223l) obj).f27824l.equals(this.f27824l) && super.equals(obj);
    }

    @Override // defpackage.AbstractC14014l
    public final int hashCode() {
        return super.hashCode() ^ this.f27824l.hashCode();
    }
}
