package defpackage;

/* JADX INFO: renamed from: lؗؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4640l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public advert f9440l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10198l f9441l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C9737l f9442l;

    public static C4640l vip(Ccase ccase) {
        int i;
        C9737l c9737l = null;
        C17523l c17523l = null;
        if (ccase != null) {
            Cclass cclassInmobi = Cclass.inmobi(ccase);
            C4640l c4640l = new C4640l();
            if (cclassInmobi.size() == 3) {
                applovin applovinVarMo173throws = cclassInmobi.mo173throws(0);
                if (applovinVarMo173throws instanceof C9737l) {
                    c9737l = (C9737l) applovinVarMo173throws;
                } else if (applovinVarMo173throws != null) {
                    Cclass cclassInmobi2 = Cclass.inmobi(applovinVarMo173throws);
                    C9737l c9737l2 = new C9737l();
                    if (cclassInmobi2.size() < 6 || cclassInmobi2.size() > 9) {
                        C8339l.metrica(AbstractC4338l.ad(cclassInmobi2, new StringBuilder("Bad sequence size: ")));
                        return null;
                    }
                    if (cclassInmobi2.mo173throws(0) instanceof Cstrictfp) {
                        c9737l2.f19872l = Cstrictfp.premium(cclassInmobi2.mo173throws(0));
                        i = 1;
                    } else {
                        c9737l2.f19872l = Cstrictfp.f36573l;
                        i = 0;
                    }
                    c9737l2.f19871l = C17146l.vip(cclassInmobi2.mo173throws(i));
                    c9737l2.f19868l = C11388l.vip(cclassInmobi2.mo173throws(i + 1));
                    c9737l2.f19874l = C10198l.vip(cclassInmobi2.mo173throws(i + 2));
                    c9737l2.f19873l = Cstrictfp.premium(cclassInmobi2.mo173throws(i + 3));
                    applovin applovinVarMo173throws2 = cclassInmobi2.mo173throws(i + 4);
                    if (applovinVarMo173throws2 instanceof C17523l) {
                        c17523l = (C17523l) applovinVarMo173throws2;
                    } else if (applovinVarMo173throws2 != null) {
                        Cclass cclassInmobi3 = Cclass.inmobi(applovinVarMo173throws2);
                        C17523l c17523l2 = new C17523l();
                        if (cclassInmobi3.size() != 2) {
                            C8339l.metrica(AbstractC4338l.ad(cclassInmobi3, new StringBuilder("Bad sequence size: ")));
                            return null;
                        }
                        c17523l2.f34142l = Cpackage.inmobi(cclassInmobi3.mo173throws(0));
                        c17523l2.f34141l = Cpackage.inmobi(cclassInmobi3.mo173throws(1));
                        c17523l = c17523l2;
                    }
                    c9737l2.f19876l = c17523l;
                    c9737l2.f19869l = Cclass.inmobi(cclassInmobi2.mo173throws(i + 5));
                    for (int i2 = i + 6; i2 < cclassInmobi2.size(); i2++) {
                        applovin applovinVarMo173throws3 = cclassInmobi2.mo173throws(i2);
                        if (applovinVarMo173throws3 instanceof advert) {
                            c9737l2.f19870l = advert.appmetrica(cclassInmobi2.mo173throws(i2));
                        } else if ((applovinVarMo173throws3 instanceof Cclass) || (applovinVarMo173throws3 instanceof C1074l)) {
                            c9737l2.f19875l = C1074l.ads(cclassInmobi2.mo173throws(i2));
                        }
                    }
                    c9737l = c9737l2;
                }
                c4640l.f9442l = c9737l;
                c4640l.f9441l = C10198l.vip(cclassInmobi.mo173throws(1));
                c4640l.f9440l = advert.appmetrica(cclassInmobi.mo173throws(2));
                return c4640l;
            }
            C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(this.f9442l);
        appmetricaVar.purchase(this.f9441l);
        appmetricaVar.purchase(this.f9440l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
