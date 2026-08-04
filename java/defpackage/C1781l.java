package defpackage;

/* JADX INFO: renamed from: lُؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1781l extends Cnative {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cclass f4206l;

    public static C1781l metrica(Object obj) {
        if (obj instanceof C1781l) {
            return (C1781l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C1781l c1781l = new C1781l();
        c1781l.f4206l = cclassInmobi;
        return c1781l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f4206l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CRLDistPoint:");
        String str = AbstractC9008l.yandex;
        sb.append(str);
        C0179l[] c0179lArrVip = vip();
        for (int i = 0; i != c0179lArrVip.length; i++) {
            sb.append("    ");
            sb.append(c0179lArrVip[i]);
            sb.append(str);
        }
        return sb.toString();
    }

    public final C0179l[] vip() {
        C0179l c0179l;
        Cclass cclass = this.f4206l;
        C0179l[] c0179lArr = new C0179l[cclass.size()];
        for (int i = 0; i != cclass.size(); i++) {
            applovin applovinVarMo173throws = cclass.mo173throws(i);
            if (applovinVarMo173throws == null || (applovinVarMo173throws instanceof C0179l)) {
                c0179l = (C0179l) applovinVarMo173throws;
            } else {
                if (!(applovinVarMo173throws instanceof Cclass)) {
                    C8339l.metrica("Invalid DistributionPoint: ".concat(applovinVarMo173throws.getClass().getName()));
                    return null;
                }
                Cclass cclass2 = (Cclass) applovinVarMo173throws;
                c0179l = new C0179l();
                for (int i2 = 0; i2 != cclass2.size(); i2++) {
                    Cfinal cfinalInmobi = Cfinal.inmobi(cclass2.mo173throws(i2));
                    int i3 = cfinalInmobi.f821l;
                    if (i3 == 0) {
                        c0179l.f1128l = C18707l.metrica(cfinalInmobi);
                    } else if (i3 == 1) {
                        AbstractC9027l.loadAd(cfinalInmobi);
                        ad adVar = advert.f9l;
                        Ccase ccaseApplovin = cfinalInmobi.applovin(false, adVar);
                        adVar.m230l(ccaseApplovin);
                        c0179l.f1127l = new C2095l((advert) ccaseApplovin);
                    } else {
                        if (i3 != 2) {
                            C10754l.smaato(cfinalInmobi.f821l, "Unknown tag encountered in structure: ");
                            return null;
                        }
                        c0179l.f1126l = new C9018l((Cclass) Cclass.f503l.m222l(cfinalInmobi, false));
                    }
                }
            }
            c0179lArr[i] = c0179l;
        }
        return c0179lArr;
    }
}
