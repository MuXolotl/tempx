package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lُٚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11144l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cstrictfp f22395l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public signatures f22396l;

    public static C11144l vip(Object obj) {
        if (obj instanceof C11144l) {
            return (C11144l) obj;
        }
        if (obj instanceof C8932l) {
            C8932l c8932l = (C8932l) obj;
            int i = C8932l.crashlytics;
            try {
                return vip(Ccase.advert(c8932l.loadAd.f36593l));
            } catch (IOException e) {
                C1759l.ads(e, "can't convert extension: ");
                return null;
            }
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C11144l c11144l = new C11144l();
        c11144l.f22396l = signatures.f36565l;
        c11144l.f22395l = null;
        if (cclassInmobi.size() == 0) {
            c11144l.f22396l = null;
            c11144l.f22395l = null;
            return c11144l;
        }
        if (cclassInmobi.mo173throws(0) instanceof signatures) {
            c11144l.f22396l = signatures.applovin(cclassInmobi.mo173throws(0));
        } else {
            c11144l.f22396l = null;
            c11144l.f22395l = Cstrictfp.premium(cclassInmobi.mo173throws(0));
        }
        if (cclassInmobi.size() <= 1) {
            return c11144l;
        }
        if (c11144l.f22396l != null) {
            c11144l.f22395l = Cstrictfp.premium(cclassInmobi.mo173throws(1));
            return c11144l;
        }
        C8339l.metrica("wrong sequence in constructor");
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(2, 0);
        signatures signaturesVar = this.f22396l;
        if (signaturesVar != null) {
            appmetricaVar.purchase(signaturesVar);
        }
        Cstrictfp cstrictfp = this.f22395l;
        if (cstrictfp != null) {
            appmetricaVar.purchase(cstrictfp);
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public final boolean metrica() {
        signatures signaturesVar = this.f22396l;
        return signaturesVar != null && signaturesVar.appmetrica();
    }

    public final String toString() {
        Cstrictfp cstrictfp = this.f22395l;
        if (cstrictfp == null) {
            return "BasicConstraints: isCa(" + metrica() + ")";
        }
        return "BasicConstraints: isCa(" + metrica() + "), pathLenConstraint = " + cstrictfp.appmetrica();
    }
}
