package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٌؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8629l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final BigInteger f17783l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final BigInteger f17784l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f17785l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final BigInteger f17786l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final BigInteger f17787l;

    public C8629l(Cclass cclass) {
        if (cclass.size() != 4 && cclass.size() != 5) {
            C8339l.metrica(AbstractC4338l.ad(cclass, new StringBuilder("invalid sequence: size = ")));
            throw null;
        }
        this.f17785l = AbstractC14024l.crashlytics(Cthrow.premium(cclass.mo173throws(0)).f36593l);
        this.f17784l = Cstrictfp.premium(cclass.mo173throws(1)).appmetrica();
        this.f17783l = Cstrictfp.premium(cclass.mo173throws(2)).appmetrica();
        this.f17787l = Cstrictfp.premium(cclass.mo173throws(3)).appmetrica();
        if (cclass.size() == 5) {
            this.f17786l = Cstrictfp.premium(cclass.mo173throws(4)).appmetrica();
        } else {
            this.f17786l = null;
        }
    }

    public static C8629l vip(Object obj) {
        if (obj instanceof C8629l) {
            return (C8629l) obj;
        }
        if (obj != null) {
            return new C8629l(Cclass.inmobi(obj));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(5, 0);
        appmetricaVar.purchase(new C11327l(this.f17785l));
        appmetricaVar.purchase(new Cstrictfp(this.f17784l));
        appmetricaVar.purchase(new Cstrictfp(this.f17783l));
        appmetricaVar.purchase(new Cstrictfp(this.f17787l));
        BigInteger bigInteger = this.f17786l;
        if (bigInteger != null) {
            appmetricaVar.purchase(new Cstrictfp(bigInteger));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public C8629l(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f17785l = AbstractC14024l.crashlytics(bArr);
        this.f17784l = bigInteger;
        this.f17783l = bigInteger2;
        this.f17787l = bigInteger3;
        this.f17786l = bigInteger4;
    }
}
