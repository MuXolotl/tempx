package defpackage;

/* JADX INFO: renamed from: lٌٗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8843l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cthrow f18174l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cfor f18175l;

    public static C8843l vip(Cnative cnative) {
        if (cnative instanceof C8843l) {
            return (C8843l) cnative;
        }
        if (cnative == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(cnative);
        C8843l c8843l = new C8843l();
        c8843l.f18175l = (Cfor) cclassInmobi.mo173throws(0);
        c8843l.f18174l = (Cthrow) cclassInmobi.mo173throws(1);
        return c8843l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f18175l, this.f18174l);
    }
}
