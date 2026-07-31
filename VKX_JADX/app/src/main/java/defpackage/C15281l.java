package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: renamed from: lًٔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15281l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cstrictfp f29881l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cstrictfp f29882l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cstrictfp f29883l;

    public C15281l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f29883l = new Cstrictfp(bigInteger);
        this.f29882l = new Cstrictfp(bigInteger2);
        this.f29881l = new Cstrictfp(bigInteger3);
    }

    public static C15281l vip(Object obj) {
        if (obj instanceof C15281l) {
            return (C15281l) obj;
        }
        if (obj != null) {
            Cclass cclassInmobi = Cclass.inmobi(obj);
            C15281l c15281l = new C15281l();
            if (cclassInmobi.size() == 3) {
                Enumeration enumerationMo170package = cclassInmobi.mo170package();
                c15281l.f29883l = Cstrictfp.premium(enumerationMo170package.nextElement());
                c15281l.f29882l = Cstrictfp.premium(enumerationMo170package.nextElement());
                c15281l.f29881l = Cstrictfp.premium(enumerationMo170package.nextElement());
                return c15281l;
            }
            C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(this.f29883l);
        appmetricaVar.purchase(this.f29882l);
        appmetricaVar.purchase(this.f29881l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
