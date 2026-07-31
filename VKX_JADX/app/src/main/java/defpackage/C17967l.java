package defpackage;

/* JADX INFO: renamed from: lٖ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17967l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cstrictfp f34972l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C10915l f34973l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C17029l f34974l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cstrictfp f34975l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cclass f34976l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public advert f34977l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C10915l f34978l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C10198l f34979l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public advert f34980l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C3719l f34981l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C1074l f34982l;

    public static C17967l vip(Object obj) {
        int i;
        boolean z;
        boolean z2;
        C3719l c3719l;
        if (obj instanceof C17967l) {
            return (C17967l) obj;
        }
        if (obj != null) {
            Cclass cclassInmobi = Cclass.inmobi(obj);
            C17967l c17967l = new C17967l();
            c17967l.f34976l = cclassInmobi;
            if (cclassInmobi.mo173throws(0) instanceof Cfinal) {
                c17967l.f34975l = (Cstrictfp) Cstrictfp.f36571l.m222l((Cfinal) cclassInmobi.mo173throws(0), true);
                i = 0;
            } else {
                c17967l.f34975l = Cstrictfp.f36573l;
                i = -1;
            }
            if (c17967l.f34975l.inmobi(0)) {
                z2 = false;
                z = true;
            } else if (c17967l.f34975l.inmobi(1)) {
                z = false;
                z2 = true;
            } else if (c17967l.f34975l.inmobi(2)) {
                z = false;
                z2 = false;
            } else {
                C8339l.metrica("version number not recognised");
            }
            c17967l.f34972l = Cstrictfp.premium(cclassInmobi.mo173throws(i + 1));
            c17967l.f34979l = C10198l.vip(cclassInmobi.mo173throws(i + 2));
            c17967l.f34978l = C10915l.metrica(cclassInmobi.mo173throws(i + 3));
            applovin applovinVarMo173throws = cclassInmobi.mo173throws(i + 4);
            if (applovinVarMo173throws instanceof C3719l) {
                c3719l = (C3719l) applovinVarMo173throws;
            } else {
                c3719l = applovinVarMo173throws != null ? new C3719l(Cclass.inmobi(applovinVarMo173throws)) : null;
            }
            c17967l.f34981l = c3719l;
            c17967l.f34973l = C10915l.metrica(cclassInmobi.mo173throws(i + 5));
            int i2 = i + 6;
            c17967l.f34974l = C17029l.vip(cclassInmobi.mo173throws(i2));
            int size = (cclassInmobi.size() - i2) - 1;
            if (size != 0 && z) {
                C8339l.metrica("version 1 certificate contains extra data");
                return null;
            }
            while (size > 0) {
                Cfinal cfinal = (Cfinal) cclassInmobi.mo173throws(i2 + size);
                int i3 = cfinal.f821l;
                ad adVar = advert.f9l;
                if (i3 == 1) {
                    AbstractC9027l.loadAd(cfinal);
                    Ccase ccaseApplovin = cfinal.applovin(false, adVar);
                    adVar.m230l(ccaseApplovin);
                    c17967l.f34980l = (advert) ccaseApplovin;
                } else if (i3 == 2) {
                    AbstractC9027l.loadAd(cfinal);
                    Ccase ccaseApplovin2 = cfinal.applovin(false, adVar);
                    adVar.m230l(ccaseApplovin2);
                    c17967l.f34977l = (advert) ccaseApplovin2;
                } else {
                    if (i3 != 3) {
                        C10754l.smaato(cfinal.f821l, "Unknown tag encountered in structure: ");
                        return null;
                    }
                    if (z2) {
                        C8339l.metrica("version 2 certificate cannot contain extensions");
                        return null;
                    }
                    AbstractC9027l.loadAd(cfinal);
                    ad adVar2 = Cclass.f503l;
                    Ccase ccaseApplovin3 = cfinal.applovin(true, adVar2);
                    adVar2.m230l(ccaseApplovin3);
                    c17967l.f34982l = C1074l.ads((Cclass) ccaseApplovin3);
                }
                size--;
            }
            return c17967l;
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        Cstrictfp cstrictfp = this.f34975l;
        Cclass cclass = this.f34976l;
        if (cclass != null && (AbstractC8151l.loadAd("org.bouncycastle.x509.allow_non-der_tbscert") == null || AbstractC8151l.crashlytics("org.bouncycastle.x509.allow_non-der_tbscert"))) {
            return cclass;
        }
        appmetrica appmetricaVar = new appmetrica(10, 0);
        if (!cstrictfp.inmobi(0)) {
            appmetricaVar.purchase(new C9320l(true, 0, cstrictfp));
        }
        appmetricaVar.purchase(this.f34972l);
        appmetricaVar.purchase(this.f34979l);
        appmetricaVar.purchase(this.f34978l);
        appmetricaVar.purchase(this.f34981l);
        appmetricaVar.purchase(this.f34973l);
        appmetricaVar.purchase(this.f34974l);
        advert advertVar = this.f34980l;
        if (advertVar != null) {
            appmetricaVar.purchase(new C9320l(false, 1, advertVar));
        }
        advert advertVar2 = this.f34977l;
        if (advertVar2 != null) {
            appmetricaVar.purchase(new C9320l(false, 2, advertVar2));
        }
        C1074l c1074l = this.f34982l;
        if (c1074l != null) {
            appmetricaVar.purchase(new C9320l(true, 3, c1074l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
