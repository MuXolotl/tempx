package defpackage;

/* JADX INFO: renamed from: lّۨؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13016l extends Cnative {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cclass f25489l;

    public static C13016l vip(applovin applovinVar) {
        if (applovinVar instanceof C13016l) {
            return (C13016l) applovinVar;
        }
        Cclass cclassInmobi = Cclass.inmobi(applovinVar);
        C13016l c13016l = new C13016l();
        if (((Cstrictfp) cclassInmobi.mo173throws(0)).inmobi(0)) {
            c13016l.f25489l = Cclass.inmobi(cclassInmobi.mo173throws(1));
            return c13016l;
        }
        C8339l.metrica("sequence not version 0");
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C16472l(Cstrictfp.f36573l, this.f25489l);
    }
}
