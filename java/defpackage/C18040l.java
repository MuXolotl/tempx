package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: l٘ٛۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18040l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Cstrictfp f35332l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Cstrictfp f35333l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cstrictfp f35334l;

    public C18040l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f35334l = new Cstrictfp(bigInteger);
        this.f35333l = new Cstrictfp(bigInteger2);
        this.f35332l = new Cstrictfp(bigInteger3);
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(4, 0);
        appmetricaVar.purchase(Cstrictfp.m4580private(1024));
        appmetricaVar.purchase(this.f35334l);
        appmetricaVar.purchase(this.f35333l);
        appmetricaVar.purchase(this.f35332l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
