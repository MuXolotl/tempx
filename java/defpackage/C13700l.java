package defpackage;

/* JADX INFO: renamed from: lْ۟ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13700l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f26754l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f26755l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cstrictfp f26756l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10198l f26757l;

    public C13700l(Cclass cclass) {
        this.f26756l = Cstrictfp.premium(cclass.mo173throws(0));
        this.f26755l = Cstrictfp.premium(cclass.mo173throws(1)).m4585strictfp();
        this.f26754l = Cstrictfp.premium(cclass.mo173throws(2)).m4585strictfp();
        this.f26757l = C10198l.vip(cclass.mo173throws(3));
    }

    public static C13700l vip(Object obj) {
        if (obj instanceof C13700l) {
            return (C13700l) obj;
        }
        if (obj != null) {
            return new C13700l(Cclass.inmobi(obj));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(4, 0);
        appmetricaVar.purchase(this.f26756l);
        appmetricaVar.purchase(Cstrictfp.m4580private(this.f26755l));
        appmetricaVar.purchase(Cstrictfp.m4580private(this.f26754l));
        appmetricaVar.purchase(this.f26757l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public C13700l(int i, int i2, C10198l c10198l) {
        this.f26756l = Cstrictfp.f36573l;
        this.f26755l = i;
        this.f26754l = i2;
        this.f26757l = c10198l;
    }
}
