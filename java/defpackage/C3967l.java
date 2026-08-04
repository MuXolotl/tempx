package defpackage;

/* JADX INFO: renamed from: lؙؚؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3967l extends Cnative {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte[] f8150l;

    public C3967l(byte[] bArr) {
        this.f8150l = bArr;
    }

    public static C3967l vip(applovin applovinVar) {
        if (applovinVar instanceof C3967l) {
            return (C3967l) applovinVar;
        }
        if (applovinVar == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(applovinVar);
        C3967l c3967l = new C3967l();
        c3967l.f8150l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(0)).f36593l);
        return c3967l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
        appmetricaVar.purchase(new C11327l(this.f8150l));
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
