package defpackage;

/* JADX INFO: renamed from: lؑۜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0610l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f2064l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10198l f2065l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C9018l f2066l;

    public C0610l(Cclass cclass) {
        if (cclass.size() != 3) {
            C8339l.metrica("unknown sequence");
            throw null;
        }
        this.f2066l = C9018l.vip(cclass.mo173throws(0));
        this.f2065l = C10198l.vip(cclass.mo173throws(1));
        boolean z = cclass.mo173throws(2) instanceof advert;
        applovin applovinVarMo173throws = cclass.mo173throws(2);
        if (z) {
            this.f2064l = advert.appmetrica(applovinVarMo173throws).inmobi();
        } else {
            this.f2064l = Cthrow.premium(applovinVarMo173throws).f36593l;
        }
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
        appmetricaVar.purchase(this.f2066l);
        appmetricaVar.purchase(this.f2065l);
        appmetricaVar.purchase(new C11327l(this.f2064l));
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
