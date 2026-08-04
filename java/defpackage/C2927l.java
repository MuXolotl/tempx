package defpackage;

/* JADX INFO: renamed from: lۣؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2927l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C6890l f6378l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C7823l f6379l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C9018l f6380l;

    public static C2927l vip(Object obj) {
        int i;
        if (obj instanceof C2927l) {
            return (C2927l) obj;
        }
        if (obj != null) {
            Cclass cclassInmobi = Cclass.inmobi(obj);
            C2927l c2927l = new C2927l();
            if (cclassInmobi.size() <= 3) {
                if (cclassInmobi.mo173throws(0) instanceof Cfinal) {
                    i = 0;
                } else {
                    c2927l.f6380l = C9018l.vip(cclassInmobi.mo173throws(0));
                    i = 1;
                }
                while (i != cclassInmobi.size()) {
                    Cfinal cfinalInmobi = Cfinal.inmobi(cclassInmobi.mo173throws(i));
                    int i2 = cfinalInmobi.f821l;
                    if (i2 == 0) {
                        c2927l.f6379l = C7823l.vip(cfinalInmobi, false);
                    } else {
                        if (i2 != 1) {
                            C10754l.smaato(cfinalInmobi.f821l, "Bad tag number: ");
                            return null;
                        }
                        c2927l.f6378l = C6890l.vip(cfinalInmobi);
                    }
                    i++;
                }
                return c2927l;
            }
            C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        C9018l c9018l = this.f6380l;
        if (c9018l != null) {
            appmetricaVar.purchase(c9018l);
        }
        C7823l c7823l = this.f6379l;
        if (c7823l != null) {
            appmetricaVar.purchase(new C9320l(false, 0, c7823l));
        }
        C6890l c6890l = this.f6378l;
        if (c6890l != null) {
            appmetricaVar.purchase(new C9320l(false, 1, c6890l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
