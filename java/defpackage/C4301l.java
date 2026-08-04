package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٟؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4301l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cstrictfp f8826l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C1550l f8827l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public BigInteger f8828l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Cstrictfp f8829l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Cthrow f8830l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Cthrow f8831l;

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(6, 0);
        BigInteger bigInteger = this.f8828l;
        if (bigInteger.compareTo(BigInteger.valueOf(0L)) != 0) {
            appmetricaVar.purchase(new C9320l(true, 0, new Cstrictfp(bigInteger)));
        }
        appmetricaVar.purchase(this.f8827l);
        appmetricaVar.purchase(this.f8826l);
        appmetricaVar.purchase(this.f8830l);
        appmetricaVar.purchase(this.f8829l);
        appmetricaVar.purchase(this.f8831l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
