package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: renamed from: lُؗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5199l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public BigInteger f11273l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public BigInteger f11274l;

    public C5199l(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f11274l = bigInteger;
        this.f11273l = bigInteger2;
    }

    public static C5199l vip(Ccase ccase) {
        if (ccase != null) {
            Cclass cclassInmobi = Cclass.inmobi(ccase);
            C5199l c5199l = new C5199l();
            if (cclassInmobi.size() == 2) {
                Enumeration enumerationMo170package = cclassInmobi.mo170package();
                c5199l.f11274l = Cstrictfp.premium(enumerationMo170package.nextElement()).applovin();
                c5199l.f11273l = Cstrictfp.premium(enumerationMo170package.nextElement()).applovin();
                return c5199l;
            }
            C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        C11138l c11138l = new C11138l(new Cstrictfp(this.f11274l), new Cstrictfp(this.f11273l));
        c11138l.f22357l = -1;
        return c11138l;
    }
}
