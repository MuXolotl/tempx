package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: renamed from: lًۦٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8414l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cstrictfp f17420l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cstrictfp f17421l;

    public C8414l(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f17421l = new Cstrictfp(bigInteger);
        this.f17420l = new Cstrictfp(bigInteger2);
    }

    public static C8414l vip(Object obj) {
        if (obj instanceof C8414l) {
            return (C8414l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C8414l c8414l = new C8414l();
        Enumeration enumerationMo170package = cclassInmobi.mo170package();
        c8414l.f17421l = (Cstrictfp) enumerationMo170package.nextElement();
        c8414l.f17420l = (Cstrictfp) enumerationMo170package.nextElement();
        return c8414l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f17421l, this.f17420l);
    }
}
