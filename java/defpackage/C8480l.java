package defpackage;

import java.math.BigInteger;
import java.util.Date;

/* JADX INFO: renamed from: lٌَؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8480l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Cpackage f17523l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f17524l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final BigInteger f17525l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Cthrow f17526l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Cpackage f17527l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f17528l;

    public C8480l(Cclass cclass) {
        this.f17525l = Cstrictfp.premium(cclass.mo173throws(0)).appmetrica();
        this.f17524l = C17283l.premium(cclass.mo173throws(1)).mopub();
        this.f17523l = Cpackage.inmobi(cclass.mo173throws(2));
        this.f17527l = Cpackage.inmobi(cclass.mo173throws(3));
        this.f17526l = Cthrow.premium(cclass.mo173throws(4));
        this.f17528l = cclass.size() == 6 ? C17283l.premium(cclass.mo173throws(5)).mopub() : null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(6, 0);
        appmetricaVar.purchase(new Cstrictfp(this.f17525l));
        appmetricaVar.purchase(new C17283l(this.f17524l));
        appmetricaVar.purchase(this.f17523l);
        appmetricaVar.purchase(this.f17527l);
        appmetricaVar.purchase(this.f17526l);
        String str = this.f17528l;
        if (str != null) {
            appmetricaVar.purchase(new C17283l(str));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public final byte[] vip() {
        return AbstractC14024l.crashlytics(this.f17526l.f36593l);
    }

    public C8480l(BigInteger bigInteger, String str, Date date, Date date2, byte[] bArr) {
        this.f17525l = bigInteger;
        this.f17524l = str;
        this.f17523l = new C4472l(date);
        this.f17527l = new C4472l(date2);
        this.f17526l = new C11327l(AbstractC14024l.crashlytics(bArr));
        this.f17528l = null;
    }
}
