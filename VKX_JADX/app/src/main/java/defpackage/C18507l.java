package defpackage;

/* JADX INFO: renamed from: lۖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18507l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10198l f36130l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cstrictfp f36131l;

    public C18507l(Cclass cclass) {
        this.f36131l = Cstrictfp.premium(cclass.mo173throws(0));
        this.f36130l = C10198l.vip(cclass.mo173throws(1));
    }

    public static final C18507l vip(Object obj) {
        if (obj instanceof C18507l) {
            return (C18507l) obj;
        }
        if (obj != null) {
            return new C18507l(Cclass.inmobi(obj));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
        appmetricaVar.purchase(this.f36131l);
        appmetricaVar.purchase(this.f36130l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public C18507l(C10198l c10198l) {
        this.f36131l = Cstrictfp.f36573l;
        this.f36130l = c10198l;
    }
}
