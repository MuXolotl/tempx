package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: renamed from: lْؑۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13061l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cstrictfp f25572l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cstrictfp f25573l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cstrictfp f25574l;

    public C13061l(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        this.f25574l = new Cstrictfp(bigInteger);
        this.f25573l = new Cstrictfp(bigInteger2);
        this.f25572l = i != 0 ? Cstrictfp.m4580private(i) : null;
    }

    public static C13061l vip(Object obj) {
        if (obj instanceof C13061l) {
            return (C13061l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C13061l c13061l = new C13061l();
        Enumeration enumerationMo170package = cclassInmobi.mo170package();
        c13061l.f25574l = Cstrictfp.premium(enumerationMo170package.nextElement());
        c13061l.f25573l = Cstrictfp.premium(enumerationMo170package.nextElement());
        if (enumerationMo170package.hasMoreElements()) {
            c13061l.f25572l = (Cstrictfp) enumerationMo170package.nextElement();
            return c13061l;
        }
        c13061l.f25572l = null;
        return c13061l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(this.f25574l);
        appmetricaVar.purchase(this.f25573l);
        if (metrica() != null) {
            appmetricaVar.purchase(this.f25572l);
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public final BigInteger metrica() {
        Cstrictfp cstrictfp = this.f25572l;
        if (cstrictfp == null) {
            return null;
        }
        return cstrictfp.applovin();
    }
}
