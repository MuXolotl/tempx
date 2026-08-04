package defpackage;

/* JADX INFO: renamed from: lّٚٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12692l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final advert f25014l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Cclass f25015l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10198l f25016l;

    public C12692l(Cclass cclass) {
        this.f25016l = C10198l.vip(cclass.mo173throws(0));
        int i = 1;
        if (cclass.mo173throws(1) instanceof Cfinal) {
            this.f25015l = Cclass.inmobi(Cfinal.inmobi(cclass.mo173throws(1)).premium(16));
            i = 2;
        } else {
            this.f25015l = null;
        }
        this.f25014l = advert.appmetrica(cclass.mo173throws(i));
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(this.f25016l);
        Cclass cclass = this.f25015l;
        if (cclass != null) {
            appmetricaVar.purchase(new C9320l(true, 0, cclass));
        }
        appmetricaVar.purchase(this.f25014l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
