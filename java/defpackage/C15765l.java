package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lٕٙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15765l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C5722l[] f30946l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C5722l[] f30947l;

    public static C15765l metrica(Cclass cclass) {
        Cclass cclassInmobi = Cclass.inmobi(cclass);
        C15765l c15765l = new C15765l();
        Enumeration enumerationMo170package = cclassInmobi.mo170package();
        while (enumerationMo170package.hasMoreElements()) {
            Cfinal cfinalInmobi = Cfinal.inmobi(enumerationMo170package.nextElement());
            int i = cfinalInmobi.f821l;
            ad adVar = Cclass.f503l;
            if (i == 0) {
                AbstractC9027l.loadAd(cfinalInmobi);
                Ccase ccaseApplovin = cfinalInmobi.applovin(false, adVar);
                adVar.m230l(ccaseApplovin);
                c15765l.f30947l = vip((Cclass) ccaseApplovin);
            } else {
                if (i != 1) {
                    C10754l.smaato(cfinalInmobi.f821l, "Unknown tag encountered: ");
                    return null;
                }
                AbstractC9027l.loadAd(cfinalInmobi);
                Ccase ccaseApplovin2 = cfinalInmobi.applovin(false, adVar);
                adVar.m230l(ccaseApplovin2);
                c15765l.f30946l = vip((Cclass) ccaseApplovin2);
            }
        }
        return c15765l;
    }

    public static C5722l[] vip(Cclass cclass) {
        Ccase ccaseApplovin;
        int size = cclass.size();
        C5722l[] c5722lArr = new C5722l[size];
        for (int i = 0; i != size; i++) {
            applovin applovinVarMo173throws = cclass.mo173throws(i);
            int i2 = C5722l.f12101l;
            C5722l c5722l = null;
            if (applovinVarMo173throws != null) {
                if (applovinVarMo173throws instanceof C5722l) {
                    c5722l = (C5722l) applovinVarMo173throws;
                } else {
                    Cclass cclassInmobi = Cclass.inmobi(applovinVarMo173throws);
                    C5722l c5722l2 = new C5722l();
                    c5722l2.f12104l = C12378l.vip(cclassInmobi.mo173throws(0));
                    int size2 = cclassInmobi.size();
                    if (size2 != 1) {
                        if (size2 == 2) {
                            Cfinal cfinalInmobi = Cfinal.inmobi(cclassInmobi.mo173throws(1));
                            int i3 = cfinalInmobi.f821l;
                            if (i3 == 0) {
                                ad adVar = Cstrictfp.f36571l;
                                AbstractC9027l.loadAd(cfinalInmobi);
                                Ccase ccaseApplovin2 = cfinalInmobi.applovin(false, adVar);
                                adVar.m230l(ccaseApplovin2);
                                c5722l2.f12103l = (Cstrictfp) ccaseApplovin2;
                            } else {
                                if (i3 != 1) {
                                    C10754l.smaato(cfinalInmobi.f821l, "Bad tag number: ");
                                    return null;
                                }
                                ad adVar2 = Cstrictfp.f36571l;
                                AbstractC9027l.loadAd(cfinalInmobi);
                                ccaseApplovin = cfinalInmobi.applovin(false, adVar2);
                                adVar2.m230l(ccaseApplovin);
                            }
                        } else {
                            if (size2 != 3) {
                                C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
                                return null;
                            }
                            Cfinal cfinalInmobi2 = Cfinal.inmobi(cclassInmobi.mo173throws(1));
                            if (cfinalInmobi2.f821l != 0) {
                                C10754l.smaato(cfinalInmobi2.f821l, "Bad tag number for 'minimum': ");
                                return null;
                            }
                            ad adVar3 = Cstrictfp.f36571l;
                            AbstractC9027l.loadAd(cfinalInmobi2);
                            Ccase ccaseApplovin3 = cfinalInmobi2.applovin(false, adVar3);
                            adVar3.m230l(ccaseApplovin3);
                            c5722l2.f12103l = (Cstrictfp) ccaseApplovin3;
                            Cfinal cfinalInmobi3 = Cfinal.inmobi(cclassInmobi.mo173throws(2));
                            if (cfinalInmobi3.f821l != 1) {
                                C10754l.smaato(cfinalInmobi3.f821l, "Bad tag number for 'maximum': ");
                                return null;
                            }
                            AbstractC9027l.loadAd(cfinalInmobi3);
                            ccaseApplovin = cfinalInmobi3.applovin(false, adVar3);
                            adVar3.m230l(ccaseApplovin);
                        }
                        c5722l2.f12102l = (Cstrictfp) ccaseApplovin;
                    }
                    c5722l = c5722l2;
                }
            }
            c5722lArr[i] = c5722l;
        }
        return c5722lArr;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(2, 0);
        C5722l[] c5722lArr = this.f30947l;
        if (c5722lArr != null) {
            appmetricaVar.purchase(new C9320l(false, 0, new C11138l(c5722lArr)));
        }
        C5722l[] c5722lArr2 = this.f30946l;
        if (c5722lArr2 != null) {
            appmetricaVar.purchase(new C9320l(false, 1, new C11138l(c5722lArr2)));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
