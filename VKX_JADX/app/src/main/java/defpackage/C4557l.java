package defpackage;

/* JADX INFO: renamed from: lؖۨۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4557l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f9224l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f9225l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f9226l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C2436l f9227l;

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
        appmetricaVar.purchase(Cstrictfp.m4580private(this.f9226l));
        appmetricaVar.purchase(new C11327l(this.f9225l));
        appmetricaVar.purchase(new C11327l(this.f9224l));
        C2436l c2436l = this.f9227l;
        if (c2436l != null) {
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c2436l.f5211l);
            byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(c2436l.f5210l);
            C2436l c2436l2 = new C2436l();
            c2436l2.f5211l = bArrCrashlytics;
            c2436l2.f5210l = bArrCrashlytics2;
            appmetricaVar.purchase(c2436l2);
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
