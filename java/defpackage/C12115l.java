package defpackage;

/* JADX INFO: renamed from: lِؚۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12115l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10198l f24092l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f24093l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cstrictfp f24094l;

    public C12115l(Cclass cclass) {
        this.f24094l = Cstrictfp.premium(cclass.mo173throws(0));
        this.f24093l = Cstrictfp.premium(cclass.mo173throws(1)).m4585strictfp();
        this.f24092l = C10198l.vip(cclass.mo173throws(2));
    }

    public static C12115l vip(Object obj) {
        if (obj instanceof C12115l) {
            return (C12115l) obj;
        }
        if (obj != null) {
            return new C12115l(Cclass.inmobi(obj));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
        appmetricaVar.purchase(this.f24094l);
        appmetricaVar.purchase(Cstrictfp.m4580private(this.f24093l));
        appmetricaVar.purchase(this.f24092l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public C12115l(int i, C10198l c10198l) {
        this.f24094l = Cstrictfp.f36573l;
        this.f24093l = i;
        this.f24092l = c10198l;
    }
}
