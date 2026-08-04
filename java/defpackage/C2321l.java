package defpackage;

/* JADX INFO: renamed from: lٖؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2321l extends Cnative {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Cstrictfp f5028l = Cstrictfp.f36573l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C1074l f5029l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C11138l f5030l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cstrictfp f5031l = f5028l;

    public C2321l(C11138l c11138l, C1074l c1074l) {
        this.f5030l = c11138l;
        this.f5029l = c1074l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(4, 0);
        Cstrictfp cstrictfp = f5028l;
        Cstrictfp cstrictfp2 = this.f5031l;
        if (!cstrictfp2.ad(cstrictfp)) {
            appmetricaVar.purchase(new C9320l(true, 0, cstrictfp2));
        }
        appmetricaVar.purchase(this.f5030l);
        C1074l c1074l = this.f5029l;
        if (c1074l != null) {
            appmetricaVar.purchase(new C9320l(true, 2, c1074l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
