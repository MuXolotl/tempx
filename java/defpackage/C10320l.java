package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lَٕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10320l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cstrictfp f21044l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C9018l f21045l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cthrow f21046l;

    public static C10320l vip(Object obj) {
        if (obj instanceof C10320l) {
            return (C10320l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C10320l c10320l = new C10320l();
        c10320l.f21046l = null;
        c10320l.f21045l = null;
        c10320l.f21044l = null;
        Enumeration enumerationMo170package = cclassInmobi.mo170package();
        while (enumerationMo170package.hasMoreElements()) {
            Cfinal cfinalInmobi = Cfinal.inmobi(enumerationMo170package.nextElement());
            int i = cfinalInmobi.f821l;
            if (i == 0) {
                AbstractC9027l.loadAd(cfinalInmobi);
                ad adVar = Cthrow.f36592l;
                Ccase ccaseApplovin = cfinalInmobi.applovin(false, adVar);
                adVar.m230l(ccaseApplovin);
                c10320l.f21046l = (Cthrow) ccaseApplovin;
            } else if (i == 1) {
                c10320l.f21045l = new C9018l((Cclass) Cclass.f503l.m222l(cfinalInmobi, false));
            } else {
                if (i != 2) {
                    C8339l.metrica("illegal tag");
                    return null;
                }
                ad adVar2 = Cstrictfp.f36571l;
                AbstractC9027l.loadAd(cfinalInmobi);
                Ccase ccaseApplovin2 = cfinalInmobi.applovin(false, adVar2);
                adVar2.m230l(ccaseApplovin2);
                c10320l.f21044l = (Cstrictfp) ccaseApplovin2;
            }
        }
        return c10320l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        Cthrow cthrow = this.f21046l;
        if (cthrow != null) {
            appmetricaVar.purchase(new C9320l(false, 0, cthrow));
        }
        C9018l c9018l = this.f21045l;
        if (c9018l != null) {
            appmetricaVar.purchase(new C9320l(false, 1, c9018l));
        }
        Cstrictfp cstrictfp = this.f21044l;
        if (cstrictfp != null) {
            appmetricaVar.purchase(new C9320l(false, 2, cstrictfp));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public final String toString() {
        String strPurchase;
        Cthrow cthrow = this.f21046l;
        if (cthrow != null) {
            byte[] bArr = cthrow.f36593l;
            C1561l c1561l = AbstractC8535l.yandex;
            strPurchase = AbstractC8535l.purchase(0, bArr.length, bArr);
        } else {
            strPurchase = "null";
        }
        return AbstractC15560l.Signature("AuthorityKeyIdentifier: KeyID(", strPurchase, ")");
    }
}
