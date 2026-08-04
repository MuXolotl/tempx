package defpackage;

/* JADX INFO: renamed from: lّؔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2857l extends Cnative {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Cstrictfp f6210l = Cstrictfp.f36573l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C16521l f6211l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cstrictfp f6212l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f6213l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Cclass f6214l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Cpackage f6215l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C1074l f6216l;

    public static C2857l vip(Object obj) {
        C16521l c16521l;
        C16521l c16521l2;
        if (obj instanceof C2857l) {
            return (C2857l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C2857l c2857l = new C2857l();
        int i = 0;
        boolean z = cclassInmobi.mo173throws(0) instanceof Cfinal;
        Cstrictfp cstrictfp = f6210l;
        if (z && ((Cfinal) cclassInmobi.mo173throws(0)).f821l == 0) {
            c2857l.f6213l = true;
            c2857l.f6212l = (Cstrictfp) Cstrictfp.f36571l.m222l((Cfinal) cclassInmobi.mo173throws(0), true);
            i = 1;
        } else {
            c2857l.f6212l = cstrictfp;
        }
        int i2 = i + 1;
        applovin applovinVarMo173throws = cclassInmobi.mo173throws(i);
        if (applovinVarMo173throws instanceof C16521l) {
            c16521l2 = (C16521l) applovinVarMo173throws;
        } else {
            if (applovinVarMo173throws instanceof C11327l) {
                c16521l = new C16521l((C11327l) applovinVarMo173throws);
            } else if (applovinVarMo173throws instanceof Cfinal) {
                Cfinal cfinal = (Cfinal) applovinVarMo173throws;
                if (cfinal.f821l == 1) {
                    C9548l c9548l = C10915l.f22034l;
                    c16521l = new C16521l(C10915l.metrica((Cclass) Cclass.f503l.m222l(cfinal, true)));
                } else {
                    AbstractC9027l.loadAd(cfinal);
                    ad adVar = Cthrow.f36592l;
                    Ccase ccaseApplovin = cfinal.applovin(true, adVar);
                    adVar.m230l(ccaseApplovin);
                    c16521l = new C16521l((Cthrow) ccaseApplovin);
                }
            } else {
                c16521l = new C16521l(C10915l.metrica(applovinVarMo173throws));
            }
            c16521l2 = c16521l;
        }
        c2857l.f6211l = c16521l2;
        int i3 = i + 2;
        c2857l.f6215l = Cpackage.inmobi(cclassInmobi.mo173throws(i2));
        int i4 = i + 3;
        c2857l.f6214l = (Cclass) cclassInmobi.mo173throws(i3);
        if (cclassInmobi.size() > i4) {
            c2857l.f6216l = C1074l.ads(Cclass.appmetrica((Cfinal) cclassInmobi.mo173throws(i4), true));
        }
        return c2857l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        Cstrictfp cstrictfp = this.f6212l;
        appmetrica appmetricaVar = new appmetrica(5, 0);
        if (this.f6213l || !cstrictfp.ad(f6210l)) {
            appmetricaVar.purchase(new C9320l(true, 0, cstrictfp));
        }
        appmetricaVar.purchase(this.f6211l);
        appmetricaVar.purchase(this.f6215l);
        appmetricaVar.purchase(this.f6214l);
        C1074l c1074l = this.f6216l;
        if (c1074l != null) {
            appmetricaVar.purchase(new C9320l(true, 1, c1074l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
