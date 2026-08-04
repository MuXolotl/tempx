package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: renamed from: lؑۖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0500l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Cstrictfp f1809l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Cstrictfp f1810l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cstrictfp f1811l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C14839l f1812l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Cstrictfp f1813l;

    public C0500l(Cclass cclass) {
        C14839l c14839l = null;
        if (cclass.size() < 3 || cclass.size() > 5) {
            C8339l.metrica(AbstractC4338l.ad(cclass, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        Enumeration enumerationMo170package = cclass.mo170package();
        this.f1811l = Cstrictfp.premium(enumerationMo170package.nextElement());
        this.f1810l = Cstrictfp.premium(enumerationMo170package.nextElement());
        this.f1809l = Cstrictfp.premium(enumerationMo170package.nextElement());
        applovin applovinVar = enumerationMo170package.hasMoreElements() ? (applovin) enumerationMo170package.nextElement() : null;
        if (applovinVar == null || !(applovinVar instanceof Cstrictfp)) {
            this.f1813l = null;
        } else {
            this.f1813l = Cstrictfp.premium(applovinVar);
            applovinVar = enumerationMo170package.hasMoreElements() ? (applovin) enumerationMo170package.nextElement() : null;
        }
        if (applovinVar == null) {
            this.f1812l = null;
            return;
        }
        Ccase ccaseBilling = applovinVar.billing();
        if (ccaseBilling != null) {
            Cclass cclassInmobi = Cclass.inmobi(ccaseBilling);
            C14839l c14839l2 = new C14839l();
            if (cclassInmobi.size() != 2) {
                C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
                throw null;
            }
            c14839l2.f29052l = advert.appmetrica(cclassInmobi.mo173throws(0));
            c14839l2.f29051l = Cstrictfp.premium(cclassInmobi.mo173throws(1));
            c14839l = c14839l2;
        }
        this.f1812l = c14839l;
    }

    public static C0500l vip(Object obj) {
        if (obj instanceof C0500l) {
            return (C0500l) obj;
        }
        if (obj != null) {
            return new C0500l(Cclass.inmobi(obj));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(5, 0);
        appmetricaVar.purchase(this.f1811l);
        appmetricaVar.purchase(this.f1810l);
        appmetricaVar.purchase(this.f1809l);
        Cstrictfp cstrictfp = this.f1813l;
        if (cstrictfp != null) {
            appmetricaVar.purchase(cstrictfp);
        }
        C14839l c14839l = this.f1812l;
        if (c14839l != null) {
            appmetricaVar.purchase(c14839l);
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public final BigInteger metrica() {
        Cstrictfp cstrictfp = this.f1813l;
        if (cstrictfp == null) {
            return null;
        }
        return cstrictfp.applovin();
    }
}
