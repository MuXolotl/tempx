package defpackage;

/* JADX INFO: renamed from: lؙۦٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6890l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C10198l f14427l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cfor f14428l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public inmobi f14429l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public advert f14430l;

    public static C6890l vip(Cfinal cfinal) {
        int i = 0;
        Cclass cclass = (Cclass) Cclass.f503l.m222l(cfinal, false);
        if (cclass != null) {
            Cclass cclassInmobi = Cclass.inmobi(cclass);
            C6890l c6890l = new C6890l();
            if (cclassInmobi.size() <= 4 && cclassInmobi.size() >= 3) {
                c6890l.f14429l = inmobi.applovin(cclassInmobi.mo173throws(0));
                if (cclassInmobi.size() == 4) {
                    i = 1;
                    c6890l.f14428l = Cfor.m192throws(cclassInmobi.mo173throws(1));
                }
                c6890l.f14427l = C10198l.vip(cclassInmobi.mo173throws(i + 1));
                c6890l.f14430l = advert.appmetrica(cclassInmobi.mo173throws(i + 2));
                return c6890l;
            }
            C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(4, 0);
        appmetricaVar.purchase(this.f14429l);
        Cfor cfor = this.f14428l;
        if (cfor != null) {
            appmetricaVar.purchase(cfor);
        }
        appmetricaVar.purchase(this.f14427l);
        appmetricaVar.purchase(this.f14430l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
