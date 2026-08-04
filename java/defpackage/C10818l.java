package defpackage;

/* JADX INFO: renamed from: lُؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10818l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C10198l f21864l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C17967l f21865l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cclass f21866l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public advert f21867l;

    public static C10818l vip(Object obj) {
        if (obj instanceof C10818l) {
            return (C10818l) obj;
        }
        if (obj != null) {
            Cclass cclassInmobi = Cclass.inmobi(obj);
            C10818l c10818l = new C10818l();
            c10818l.f21866l = cclassInmobi;
            if (cclassInmobi.size() == 3) {
                c10818l.f21865l = C17967l.vip(cclassInmobi.mo173throws(0));
                c10818l.f21864l = C10198l.vip(cclassInmobi.mo173throws(1));
                c10818l.f21867l = advert.appmetrica(cclassInmobi.mo173throws(2));
                return c10818l;
            }
            C8339l.metrica("sequence wrong size for a certificate");
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f21866l;
    }
}
