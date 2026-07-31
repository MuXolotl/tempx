package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: renamed from: lٕۖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15860l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public BigInteger f31120l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public BigInteger f31121l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public BigInteger f31122l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public BigInteger f31123l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public BigInteger f31126l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public BigInteger f31127l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public BigInteger f31128l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public BigInteger f31129l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Cclass f31125l = null;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public BigInteger f31124l = BigInteger.valueOf(0);

    public C15860l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.f31123l = bigInteger;
        this.f31120l = bigInteger2;
        this.f31127l = bigInteger3;
        this.f31126l = bigInteger4;
        this.f31129l = bigInteger5;
        this.f31121l = bigInteger6;
        this.f31122l = bigInteger7;
        this.f31128l = bigInteger8;
    }

    public static C15860l vip(Object obj) {
        if (obj instanceof C15860l) {
            return (C15860l) obj;
        }
        if (obj != null) {
            Cclass cclassInmobi = Cclass.inmobi(obj);
            C15860l c15860l = new C15860l();
            c15860l.f31125l = null;
            Enumeration enumerationMo170package = cclassInmobi.mo170package();
            Cstrictfp cstrictfp = (Cstrictfp) enumerationMo170package.nextElement();
            int iM4585strictfp = cstrictfp.m4585strictfp();
            if (iM4585strictfp >= 0 && iM4585strictfp <= 1) {
                c15860l.f31124l = cstrictfp.appmetrica();
                c15860l.f31123l = ((Cstrictfp) enumerationMo170package.nextElement()).appmetrica();
                c15860l.f31120l = ((Cstrictfp) enumerationMo170package.nextElement()).appmetrica();
                c15860l.f31127l = ((Cstrictfp) enumerationMo170package.nextElement()).appmetrica();
                c15860l.f31126l = ((Cstrictfp) enumerationMo170package.nextElement()).appmetrica();
                c15860l.f31129l = ((Cstrictfp) enumerationMo170package.nextElement()).appmetrica();
                c15860l.f31121l = ((Cstrictfp) enumerationMo170package.nextElement()).appmetrica();
                c15860l.f31122l = ((Cstrictfp) enumerationMo170package.nextElement()).appmetrica();
                c15860l.f31128l = ((Cstrictfp) enumerationMo170package.nextElement()).appmetrica();
                if (enumerationMo170package.hasMoreElements()) {
                    c15860l.f31125l = (Cclass) enumerationMo170package.nextElement();
                }
                return c15860l;
            }
            C8339l.metrica("wrong version for RSA private key");
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(10, 0);
        appmetricaVar.purchase(new Cstrictfp(this.f31124l));
        appmetricaVar.purchase(new Cstrictfp(this.f31123l));
        appmetricaVar.purchase(new Cstrictfp(this.f31120l));
        appmetricaVar.purchase(new Cstrictfp(this.f31127l));
        appmetricaVar.purchase(new Cstrictfp(this.f31126l));
        appmetricaVar.purchase(new Cstrictfp(this.f31129l));
        appmetricaVar.purchase(new Cstrictfp(this.f31121l));
        appmetricaVar.purchase(new Cstrictfp(this.f31122l));
        appmetricaVar.purchase(new Cstrictfp(this.f31128l));
        Cclass cclass = this.f31125l;
        if (cclass != null) {
            appmetricaVar.purchase(cclass);
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
