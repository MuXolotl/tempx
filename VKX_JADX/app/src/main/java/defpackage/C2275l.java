package defpackage;

/* JADX INFO: renamed from: lؓۧ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2275l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f4965l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Cclass f4966l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f4967l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C18707l f4968l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f4969l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C2095l f4970l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f4971l;

    public static C2275l metrica(Object obj) {
        if (obj instanceof C2275l) {
            return (C2275l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C2275l c2275l = new C2275l();
        c2275l.f4966l = cclassInmobi;
        for (int i = 0; i != cclassInmobi.size(); i++) {
            Cfinal cfinalInmobi = Cfinal.inmobi(cclassInmobi.mo173throws(i));
            int i2 = cfinalInmobi.f821l;
            if (i2 != 0) {
                ad adVar = signatures.f36566l;
                if (i2 == 1) {
                    AbstractC9027l.loadAd(cfinalInmobi);
                    Ccase ccaseApplovin = cfinalInmobi.applovin(false, adVar);
                    adVar.m230l(ccaseApplovin);
                    c2275l.f4967l = ((signatures) ccaseApplovin).appmetrica();
                } else if (i2 == 2) {
                    AbstractC9027l.loadAd(cfinalInmobi);
                    Ccase ccaseApplovin2 = cfinalInmobi.applovin(false, adVar);
                    adVar.m230l(ccaseApplovin2);
                    c2275l.f4965l = ((signatures) ccaseApplovin2).appmetrica();
                } else if (i2 == 3) {
                    AbstractC9027l.loadAd(cfinalInmobi);
                    ad adVar2 = advert.f9l;
                    Ccase ccaseApplovin3 = cfinalInmobi.applovin(false, adVar2);
                    adVar2.m230l(ccaseApplovin3);
                    c2275l.f4970l = new C2095l((advert) ccaseApplovin3);
                } else if (i2 == 4) {
                    AbstractC9027l.loadAd(cfinalInmobi);
                    Ccase ccaseApplovin4 = cfinalInmobi.applovin(false, adVar);
                    adVar.m230l(ccaseApplovin4);
                    c2275l.f4969l = ((signatures) ccaseApplovin4).appmetrica();
                } else {
                    if (i2 != 5) {
                        C8339l.metrica("unknown tag in IssuingDistributionPoint");
                        return null;
                    }
                    AbstractC9027l.loadAd(cfinalInmobi);
                    Ccase ccaseApplovin5 = cfinalInmobi.applovin(false, adVar);
                    adVar.m230l(ccaseApplovin5);
                    c2275l.f4971l = ((signatures) ccaseApplovin5).appmetrica();
                }
            } else {
                c2275l.f4968l = C18707l.metrica(cfinalInmobi);
            }
        }
        return c2275l;
    }

    public static void vip(StringBuilder sb, String str, String str2, String str3) {
        AbstractC9361l.appmetrica(sb, "    ", str2, ":", str);
        AbstractC9361l.appmetrica(sb, "    ", "    ", str3, str);
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f4966l;
    }

    public final String toString() {
        String str = AbstractC9008l.yandex;
        StringBuilder sbAdvert = AbstractC5020l.advert("IssuingDistributionPoint: [", str);
        C18707l c18707l = this.f4968l;
        if (c18707l != null) {
            vip(sbAdvert, str, "distributionPoint", c18707l.toString());
        }
        boolean z = this.f4967l;
        if (z) {
            vip(sbAdvert, str, "onlyContainsUserCerts", z ? "true" : "false");
        }
        boolean z2 = this.f4965l;
        if (z2) {
            vip(sbAdvert, str, "onlyContainsCACerts", z2 ? "true" : "false");
        }
        C2095l c2095l = this.f4970l;
        if (c2095l != null) {
            vip(sbAdvert, str, "onlySomeReasons", c2095l.mopub());
        }
        boolean z3 = this.f4971l;
        if (z3) {
            vip(sbAdvert, str, "onlyContainsAttributeCerts", z3 ? "true" : "false");
        }
        boolean z4 = this.f4969l;
        if (z4) {
            vip(sbAdvert, str, "indirectCRL", z4 ? "true" : "false");
        }
        return AbstractC0653l.ads(sbAdvert, "]", str);
    }
}
