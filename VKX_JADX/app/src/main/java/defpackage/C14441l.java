package defpackage;

/* JADX INFO: renamed from: lٓ۟ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14441l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C13353l f28283l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10198l f28284l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C2857l f28285l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Cclass f28286l;

    public static C14441l vip(Object obj) {
        if (obj instanceof C14441l) {
            return (C14441l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C14441l c14441l = new C14441l();
        c14441l.f28285l = C2857l.vip(cclassInmobi.mo173throws(0));
        c14441l.f28284l = C10198l.vip(cclassInmobi.mo173throws(1));
        c14441l.f28283l = (C13353l) cclassInmobi.mo173throws(2);
        if (cclassInmobi.size() > 3) {
            c14441l.f28286l = Cclass.appmetrica((Cfinal) cclassInmobi.mo173throws(3), true);
        }
        return c14441l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(4, 0);
        appmetricaVar.purchase(this.f28285l);
        appmetricaVar.purchase(this.f28284l);
        appmetricaVar.purchase(this.f28283l);
        Cclass cclass = this.f28286l;
        if (cclass != null) {
            appmetricaVar.purchase(new C9320l(true, 0, cclass));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
