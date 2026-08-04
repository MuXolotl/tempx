package defpackage;

/* JADX INFO: renamed from: lؓؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1550l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f3835l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f3836l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f3837l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f3838l;

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        int i = this.f3836l;
        appmetrica appmetricaVar = new appmetrica(2, 0);
        appmetricaVar.purchase(Cstrictfp.m4580private(this.f3837l));
        int i2 = this.f3835l;
        if (i2 == 0) {
            appmetricaVar.purchase(Cstrictfp.m4580private(i));
        } else {
            appmetrica appmetricaVar2 = new appmetrica(3, 0);
            appmetricaVar2.purchase(Cstrictfp.m4580private(i));
            appmetricaVar2.purchase(Cstrictfp.m4580private(i2));
            appmetricaVar2.purchase(Cstrictfp.m4580private(this.f3838l));
            C11138l c11138l = new C11138l(appmetricaVar2);
            c11138l.f22357l = -1;
            appmetricaVar.purchase(c11138l);
        }
        C11138l c11138l2 = new C11138l(appmetricaVar);
        c11138l2.f22357l = -1;
        return c11138l2;
    }
}
