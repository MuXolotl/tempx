package defpackage;

/* JADX INFO: renamed from: lًؚِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7127l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Cthrow f14932l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18282l f14933l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10198l f14934l;

    public C7127l(Cclass cclass) {
        C18282l c18282l;
        this.f14934l = C10198l.vip(cclass.mo173throws(0));
        applovin applovinVarMo173throws = cclass.mo173throws(1);
        if (applovinVarMo173throws instanceof C18282l) {
            c18282l = (C18282l) applovinVarMo173throws;
        } else if (applovinVarMo173throws != null) {
            Cclass cclassInmobi = Cclass.inmobi(applovinVarMo173throws);
            C18282l c18282l2 = new C18282l();
            c18282l2.f35779l = C10198l.vip(cclassInmobi);
            c18282l = c18282l2;
        } else {
            c18282l = null;
        }
        this.f14933l = c18282l;
        this.f14932l = Cthrow.premium(cclass.mo173throws(2));
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(this.f14934l);
        appmetricaVar.purchase(this.f14933l);
        appmetricaVar.purchase(this.f14932l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public C7127l(C10198l c10198l, C18282l c18282l, byte[] bArr) {
        this.f14934l = c10198l;
        this.f14933l = c18282l;
        this.f14932l = new C11327l(AbstractC14024l.crashlytics(bArr));
    }
}
