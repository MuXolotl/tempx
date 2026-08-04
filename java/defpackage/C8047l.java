package defpackage;

/* JADX INFO: renamed from: lًٗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8047l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public applovin f16750l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cfor f16751l;

    public static C8047l vip(applovin applovinVar) {
        if (applovinVar instanceof C8047l) {
            return (C8047l) applovinVar;
        }
        if (applovinVar == null) {
            C8339l.metrica("null value in getInstance()");
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(applovinVar);
        C8047l c8047l = new C8047l();
        c8047l.f16751l = (Cfor) cclassInmobi.mo173throws(0);
        c8047l.f16750l = cclassInmobi.mo173throws(1);
        return c8047l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f16751l, this.f16750l);
    }
}
