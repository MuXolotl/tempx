package defpackage;

/* JADX INFO: renamed from: lِِ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11778l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cpackage f23573l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C4541l f23574l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C4567l f23575l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C1074l f23576l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Cpackage f23577l;

    public static C11778l vip(applovin applovinVar) {
        C4541l c4541l;
        Cnative cnativeVip;
        if (applovinVar instanceof C11778l) {
            return (C11778l) applovinVar;
        }
        if (applovinVar == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(applovinVar);
        C11778l c11778l = new C11778l();
        c11778l.f23575l = C4567l.vip(cclassInmobi.mo173throws(0));
        applovin applovinVarMo173throws = cclassInmobi.mo173throws(1);
        ad adVar = Cclass.f503l;
        if (applovinVarMo173throws == null || (applovinVarMo173throws instanceof C4541l)) {
            c4541l = (C4541l) applovinVarMo173throws;
        } else {
            if (!(applovinVarMo173throws instanceof Cfinal)) {
                C8339l.metrica("unknown object in factory: ".concat(applovinVarMo173throws.getClass().getName()));
                return null;
            }
            Cfinal cfinal = (Cfinal) applovinVarMo173throws;
            c4541l = new C4541l();
            int i = cfinal.f821l;
            ad adVar2 = Cvolatile.f36859l;
            if (i == 0) {
                AbstractC9027l.loadAd(cfinal);
                Ccase ccaseApplovin = cfinal.applovin(false, adVar2);
                adVar2.m230l(ccaseApplovin);
                cnativeVip = (Cvolatile) ccaseApplovin;
            } else if (i != 1) {
                if (i != 2) {
                    C8339l.metrica("Unknown tag encountered: ".concat(AbstractC9027l.crashlytics(cfinal.f822l, i)));
                    return null;
                }
                AbstractC9027l.loadAd(cfinal);
                Ccase ccaseApplovin2 = cfinal.applovin(false, adVar2);
                adVar2.m230l(ccaseApplovin2);
                cnativeVip = (Cvolatile) ccaseApplovin2;
            } else {
                cnativeVip = C15819l.vip((Cclass) adVar.m222l(cfinal, false));
            }
            c4541l.f9176l = cnativeVip;
            c4541l.f9177l = i;
        }
        c11778l.f23574l = c4541l;
        c11778l.f23573l = Cpackage.inmobi(cclassInmobi.mo173throws(2));
        int size = cclassInmobi.size();
        ad adVar3 = Cpackage.f36535l;
        if (size > 4) {
            c11778l.f23577l = (Cpackage) adVar3.m222l((Cfinal) cclassInmobi.mo173throws(3), true);
            c11778l.f23576l = C1074l.ads(Cclass.appmetrica((Cfinal) cclassInmobi.mo173throws(4), true));
            return c11778l;
        }
        if (cclassInmobi.size() > 3) {
            Cfinal cfinal2 = (Cfinal) cclassInmobi.mo173throws(3);
            if (cfinal2.f821l == 0) {
                AbstractC9027l.loadAd(cfinal2);
                Ccase ccaseApplovin3 = cfinal2.applovin(true, adVar3);
                adVar3.m230l(ccaseApplovin3);
                c11778l.f23577l = (Cpackage) ccaseApplovin3;
                return c11778l;
            }
            c11778l.f23576l = C1074l.ads((Cclass) adVar.m222l(cfinal2, true));
        }
        return c11778l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(5, 0);
        appmetricaVar.purchase(this.f23575l);
        appmetricaVar.purchase(this.f23574l);
        appmetricaVar.purchase(this.f23573l);
        Cpackage cpackage = this.f23577l;
        if (cpackage != null) {
            appmetricaVar.purchase(new C9320l(true, 0, cpackage));
        }
        C1074l c1074l = this.f23576l;
        if (c1074l != null) {
            appmetricaVar.purchase(new C9320l(true, 1, c1074l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
