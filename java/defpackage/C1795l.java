package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lِؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1795l extends AbstractC14014l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final BigInteger f4209l;

    public C1795l(BigInteger bigInteger, C12425l c12425l) {
        super(true, c12425l);
        this.f4209l = bigInteger;
    }

    @Override // defpackage.AbstractC14014l
    public final boolean equals(Object obj) {
        if ((obj instanceof C1795l) && ((C1795l) obj).f4209l.equals(this.f4209l)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.AbstractC14014l
    public final int hashCode() {
        return this.f4209l.hashCode();
    }
}
