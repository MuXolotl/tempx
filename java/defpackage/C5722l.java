package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؘٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5722l extends Cnative {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ int f12101l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cstrictfp f12102l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cstrictfp f12103l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C12378l f12104l;

    static {
        BigInteger.valueOf(0L);
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(this.f12104l);
        Cstrictfp cstrictfp = this.f12103l;
        if (cstrictfp != null && !cstrictfp.inmobi(0)) {
            appmetricaVar.purchase(new C9320l(false, 0, cstrictfp));
        }
        Cstrictfp cstrictfp2 = this.f12102l;
        if (cstrictfp2 != null) {
            appmetricaVar.purchase(new C9320l(false, 1, cstrictfp2));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
