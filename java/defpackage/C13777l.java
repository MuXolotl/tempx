package defpackage;

/* JADX INFO: renamed from: lْۤٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13777l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cfor f26891l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cfor f26892l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cfor f26893l;

    public C13777l(Cfor cfor, Cfor cfor2) {
        this.f26893l = cfor;
        this.f26892l = cfor2;
        this.f26891l = null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    public static C13777l vip(Object obj) {
        if (obj instanceof C13777l) {
            return (C13777l) obj;
        }
        if (obj != null) {
            Cclass cclassInmobi = Cclass.inmobi(obj);
            C13777l c13777l = new C13777l();
            Cfor cforM192throws = Cfor.m192throws(cclassInmobi.mo173throws(0));
            c13777l.f26893l = cforM192throws;
            if (cforM192throws.ad(InterfaceC18410l.firebase)) {
                if (cclassInmobi.size() > 1) {
                    c13777l.f26892l = Cfor.m192throws(cclassInmobi.mo173throws(1));
                }
            } else if (cforM192throws.ad(InterfaceC18410l.smaato) || cforM192throws.ad(InterfaceC18410l.remoteconfig) || cforM192throws.ad(InterfaceC18410l.vip)) {
                if (cclassInmobi.size() > 1) {
                    C8339l.metrica("digestParamSet expected to be absent");
                }
            } else if (cclassInmobi.size() > 1) {
                c13777l.f26892l = Cfor.m192throws(cclassInmobi.mo173throws(1));
            }
            if (cclassInmobi.size() > 2) {
                c13777l.f26891l = (Cfor) cclassInmobi.mo173throws(2);
            }
            return c13777l;
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(this.f26893l);
        Cfor cfor = this.f26892l;
        if (cfor != null) {
            appmetricaVar.purchase(cfor);
        }
        Cfor cfor2 = this.f26891l;
        if (cfor2 != null) {
            appmetricaVar.purchase(cfor2);
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public C13777l(Cfor cfor, Cfor cfor2, Cfor cfor3) {
        this.f26893l = cfor;
        this.f26892l = cfor2;
        this.f26891l = cfor3;
    }
}
