package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lًٌۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8374l extends AbstractC2017l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final BigInteger f17335l;

    public C8374l(BigInteger bigInteger, C7838l c7838l) {
        super(true, c7838l);
        if (bigInteger == null) {
            C6541l.subs("Scalar cannot be null");
            throw null;
        }
        if (bigInteger.compareTo(InterfaceC11695l.startapp) < 0 || bigInteger.compareTo(c7838l.f16362l) >= 0) {
            C8339l.metrica("Scalar is not in the interval [1, n - 1]");
            throw null;
        }
        this.f17335l = bigInteger;
    }
}
