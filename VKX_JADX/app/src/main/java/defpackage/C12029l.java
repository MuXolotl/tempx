package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lِۖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12029l extends AbstractC11721l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final BigInteger f23959l;

    public C12029l(BigInteger bigInteger, C2396l c2396l) {
        super(true, c2396l);
        this.f23959l = bigInteger;
    }

    @Override // defpackage.AbstractC11721l
    public final boolean equals(Object obj) {
        return (obj instanceof C12029l) && ((C12029l) obj).f23959l.equals(this.f23959l) && super.equals(obj);
    }

    @Override // defpackage.AbstractC11721l
    public final int hashCode() {
        return super.hashCode() ^ this.f23959l.hashCode();
    }
}
