package defpackage;

/* JADX INFO: renamed from: lًؙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7823l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public advert f16347l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cstrictfp f16348l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C9018l f16349l;

    public static C7823l vip(Cfinal cfinal, boolean z) {
        Cclass cclass = (Cclass) Cclass.f503l.m222l(cfinal, z);
        if (cclass == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(cclass);
        C7823l c7823l = new C7823l();
        if (cclassInmobi.size() != 2 && cclassInmobi.size() != 3) {
            C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
            return null;
        }
        c7823l.f16349l = C9018l.vip(cclassInmobi.mo173throws(0));
        c7823l.f16348l = Cstrictfp.premium(cclassInmobi.mo173throws(1));
        if (cclassInmobi.size() == 3) {
            c7823l.f16347l = advert.appmetrica(cclassInmobi.mo173throws(2));
        }
        return c7823l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(this.f16349l);
        appmetricaVar.purchase(this.f16348l);
        advert advertVar = this.f16347l;
        if (advertVar != null) {
            appmetricaVar.purchase(advertVar);
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
