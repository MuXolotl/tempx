package defpackage;

/* JADX INFO: renamed from: lٕٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17146l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C6890l f33331l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C9018l f33332l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C7823l f33333l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f33334l;

    public static C17146l vip(applovin applovinVar) {
        if (applovinVar instanceof C17146l) {
            return (C17146l) applovinVar;
        }
        boolean z = applovinVar instanceof Cfinal;
        ad adVar = Cclass.f503l;
        if (z) {
            Cfinal cfinalInmobi = Cfinal.inmobi(applovinVar);
            C17146l c17146l = new C17146l();
            c17146l.f33334l = 1;
            int i = cfinalInmobi.f821l;
            if (i == 0) {
                c17146l.f33333l = C7823l.vip(cfinalInmobi, true);
            } else {
                if (i != 1) {
                    C8339l.metrica("unknown tag in Holder");
                    return null;
                }
                c17146l.f33332l = new C9018l((Cclass) adVar.m222l(cfinalInmobi, true));
            }
            c17146l.f33334l = 0;
            return c17146l;
        }
        if (applovinVar != null) {
            Cclass cclassInmobi = Cclass.inmobi(applovinVar);
            C17146l c17146l2 = new C17146l();
            c17146l2.f33334l = 1;
            if (cclassInmobi.size() <= 3) {
                for (int i2 = 0; i2 != cclassInmobi.size(); i2++) {
                    Cfinal cfinalInmobi2 = Cfinal.inmobi(cclassInmobi.mo173throws(i2));
                    int i3 = cfinalInmobi2.f821l;
                    if (i3 == 0) {
                        c17146l2.f33333l = C7823l.vip(cfinalInmobi2, false);
                    } else if (i3 == 1) {
                        c17146l2.f33332l = new C9018l((Cclass) adVar.m222l(cfinalInmobi2, false));
                    } else {
                        if (i3 != 2) {
                            C8339l.metrica("unknown tag in Holder");
                            return null;
                        }
                        c17146l2.f33331l = C6890l.vip(cfinalInmobi2);
                    }
                }
                c17146l2.f33334l = 1;
                return c17146l2;
            }
            C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        C9018l c9018l = this.f33332l;
        C7823l c7823l = this.f33333l;
        if (this.f33334l != 1) {
            return c9018l != null ? new C9320l(true, 1, c9018l) : new Cfinal(true, 0, c7823l);
        }
        appmetrica appmetricaVar = new appmetrica(3, 0);
        if (c7823l != null) {
            appmetricaVar.purchase(new C9320l(2, 128, 0, c7823l));
        }
        if (c9018l != null) {
            appmetricaVar.purchase(new C9320l(2, 128, 1, c9018l));
        }
        C6890l c6890l = this.f33331l;
        if (c6890l != null) {
            appmetricaVar.purchase(new C9320l(2, 128, 2, c6890l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
