package defpackage;

/* JADX INFO: renamed from: lٔۙۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15143l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cnative f29696l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cfor f29697l;

    public static C15143l vip(Cnative cnative) {
        if (cnative instanceof C15143l) {
            return (C15143l) cnative;
        }
        if (cnative == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(cnative);
        C15143l c15143l = new C15143l();
        c15143l.f29697l = Cfor.m192throws(cclassInmobi.mo173throws(0));
        c15143l.f29696l = Cfinal.inmobi(cclassInmobi.mo173throws(1)).appmetrica();
        return c15143l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        C11138l c11138l = new C11138l(this.f29697l, new C9320l(true, 0, this.f29696l));
        c11138l.f22357l = -1;
        return c11138l;
    }
}
