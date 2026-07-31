package defpackage;

/* JADX INFO: renamed from: lۦۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18707l extends Cnative implements premium {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f36468l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cnative f36469l;

    public C18707l(Cfinal cfinal) {
        int i = cfinal.f821l;
        this.f36468l = i;
        int i2 = cfinal.f822l;
        if (i2 == 128 && i == 0) {
            this.f36469l = new C9018l((Cclass) Cclass.f503l.m222l(cfinal, false));
            return;
        }
        if (i2 != 128 || i != 1) {
            C8339l.metrica("unknown tag: ".concat(AbstractC9027l.crashlytics(i2, i)));
            throw null;
        }
        AbstractC9027l.loadAd(cfinal);
        ad adVar = Cinterface.f840l;
        Ccase ccaseApplovin = cfinal.applovin(false, adVar);
        adVar.m230l(ccaseApplovin);
        this.f36469l = (Cinterface) ccaseApplovin;
    }

    public static C18707l metrica(Cfinal cfinal) {
        AbstractC9027l.loadAd(cfinal);
        Cnative cnativeAppmetrica = cfinal.appmetrica();
        if (cnativeAppmetrica == null || (cnativeAppmetrica instanceof C18707l)) {
            return (C18707l) cnativeAppmetrica;
        }
        if (cnativeAppmetrica instanceof Cfinal) {
            return new C18707l((Cfinal) cnativeAppmetrica);
        }
        C8339l.metrica("unknown object in factory: ".concat(cnativeAppmetrica.getClass().getName()));
        return null;
    }

    public static void vip(StringBuilder sb, String str, String str2, String str3) {
        AbstractC9361l.appmetrica(sb, "    ", str2, ":", str);
        AbstractC9361l.appmetrica(sb, "    ", "    ", str3, str);
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C9320l(2, 128, this.f36468l, this.f36469l);
    }

    public final String toString() {
        String str = AbstractC9008l.yandex;
        StringBuilder sbAdvert = AbstractC5020l.advert("DistributionPointName: [", str);
        vip(sbAdvert, str, this.f36468l == 0 ? "fullName" : "nameRelativeToCRLIssuer", this.f36469l.toString());
        return AbstractC0653l.ads(sbAdvert, "]", str);
    }

    public C18707l(C9018l c9018l) {
        this.f36468l = 0;
        this.f36469l = c9018l;
    }
}
