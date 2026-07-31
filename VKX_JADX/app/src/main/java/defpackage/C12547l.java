package defpackage;

/* JADX INFO: renamed from: lِّٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12547l extends Cnative {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C10198l f24731l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C10198l f24732l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C10198l f24733l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C10198l f24734l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10198l f24735l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10198l f24736l;

    static {
        C10198l c10198l = new C10198l(InterfaceC4502l.billing, C14998l.f29509l);
        f24732l = c10198l;
        f24731l = new C10198l(InterfaceC0543l.f1864class, c10198l);
        f24733l = new C10198l(InterfaceC0543l.f1875interface, new C11327l(new byte[0]));
    }

    public static C12547l vip(Object obj) {
        if (obj instanceof C12547l) {
            return (C12547l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C12547l c12547l = new C12547l();
        c12547l.f24736l = f24732l;
        c12547l.f24735l = f24731l;
        c12547l.f24734l = f24733l;
        for (int i = 0; i != cclassInmobi.size(); i++) {
            Cfinal cfinal = (Cfinal) cclassInmobi.mo173throws(i);
            int i2 = cfinal.f821l;
            if (i2 == 0) {
                c12547l.f24736l = new C10198l(Cclass.appmetrica(cfinal, true));
            } else if (i2 == 1) {
                c12547l.f24735l = new C10198l(Cclass.appmetrica(cfinal, true));
            } else {
                if (i2 != 2) {
                    C8339l.metrica("unknown tag");
                    return null;
                }
                c12547l.f24734l = new C10198l(Cclass.appmetrica(cfinal, true));
            }
        }
        return c12547l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        C10198l c10198l = this.f24734l;
        C10198l c10198l2 = this.f24735l;
        appmetrica appmetricaVar = new appmetrica(3, 0);
        C10198l c10198l3 = this.f24736l;
        if (!c10198l3.equals(f24732l)) {
            appmetricaVar.purchase(new C9320l(true, 0, c10198l3));
        }
        if (!c10198l2.equals(f24731l)) {
            appmetricaVar.purchase(new C9320l(true, 1, c10198l2));
        }
        if (!c10198l.equals(f24733l)) {
            appmetricaVar.purchase(new C9320l(true, 2, c10198l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
