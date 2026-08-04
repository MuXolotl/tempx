package defpackage;

/* JADX INFO: renamed from: l٘۟ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18240l extends Cnative implements InterfaceC18049l, InterfaceC0543l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C10915l f35749l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10915l f35750l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cclass f35751l;

    public static C18240l vip(Ccase ccase) {
        int i;
        if (ccase == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(ccase);
        C18240l c18240l = new C18240l();
        c18240l.f35751l = cclassInmobi;
        if (cclassInmobi.mo173throws(0) instanceof Cfinal) {
            i = 0;
        } else {
            ad adVar = Cstrictfp.f36571l;
            i = -1;
        }
        Cstrictfp.premium(cclassInmobi.mo173throws(i + 1));
        C10198l.vip(cclassInmobi.mo173throws(i + 2));
        c18240l.f35750l = C10915l.metrica(cclassInmobi.mo173throws(i + 3));
        applovin applovinVarMo173throws = cclassInmobi.mo173throws(i + 4);
        if (!(applovinVarMo173throws instanceof C3719l) && applovinVarMo173throws != null) {
            Cclass cclassInmobi2 = Cclass.inmobi(applovinVarMo173throws);
            int size = cclassInmobi2.size();
            if (size != 2) {
                C8339l.metrica(AbstractC0653l.vip(size, "Bad sequence size: "));
                return null;
            }
            C2795l.metrica(cclassInmobi2.mo173throws(0));
            C2795l.metrica(cclassInmobi2.mo173throws(1));
        }
        c18240l.f35749l = C10915l.metrica(cclassInmobi.mo173throws(i + 5));
        int i2 = i + 6;
        C17029l.vip(cclassInmobi.mo173throws(i2));
        for (int size2 = (cclassInmobi.size() - i2) - 1; size2 > 0; size2--) {
            Cfinal cfinalInmobi = Cfinal.inmobi(cclassInmobi.mo173throws(i2 + size2));
            int i3 = cfinalInmobi.f821l;
            ad adVar2 = advert.f9l;
            if (i3 == 1 || i3 == 2) {
                AbstractC9027l.loadAd(cfinalInmobi);
                Ccase ccaseApplovin = cfinalInmobi.applovin(false, adVar2);
                adVar2.m230l(ccaseApplovin);
            } else if (i3 == 3) {
                C3368l.vip(cfinalInmobi);
            }
        }
        return c18240l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f35751l;
    }
}
