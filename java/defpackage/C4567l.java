package defpackage;

/* JADX INFO: renamed from: lًؗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4567l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cthrow f9264l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cthrow f9265l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10198l f9266l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Cstrictfp f9267l;

    public static C4567l vip(applovin applovinVar) {
        if (applovinVar instanceof C4567l) {
            return (C4567l) applovinVar;
        }
        if (applovinVar == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(applovinVar);
        C4567l c4567l = new C4567l();
        c4567l.f9266l = C10198l.vip(cclassInmobi.mo173throws(0));
        c4567l.f9265l = (Cthrow) cclassInmobi.mo173throws(1);
        c4567l.f9264l = (Cthrow) cclassInmobi.mo173throws(2);
        c4567l.f9267l = (Cstrictfp) cclassInmobi.mo173throws(3);
        return c4567l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(4, 0);
        appmetricaVar.purchase(this.f9266l);
        appmetricaVar.purchase(this.f9265l);
        appmetricaVar.purchase(this.f9264l);
        appmetricaVar.purchase(this.f9267l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    @Override // defpackage.Cnative
    public final boolean equals(Object obj) {
        boolean zEquals;
        C10198l c10198l = this.f9266l;
        if (this != obj) {
            if (!(obj instanceof applovin)) {
                return false;
            }
            try {
                C4567l c4567lVip = vip((applovin) obj);
                if (!c10198l.f20787l.ad(c4567lVip.f9266l.f20787l)) {
                    return false;
                }
                applovin applovinVar = c10198l.f20786l;
                applovin applovinVar2 = c4567lVip.f9266l.f20786l;
                C14998l c14998l = C14998l.f29509l;
                if (applovinVar != applovinVar2) {
                    if (applovinVar == null) {
                        zEquals = c14998l.pro(applovinVar2);
                    } else {
                        zEquals = (c14998l.pro(applovinVar) && applovinVar2 == null) ? true : applovinVar.equals(applovinVar2);
                    }
                }
                if (!zEquals || !this.f9265l.ad(c4567lVip.f9265l) || !this.f9264l.ad(c4567lVip.f9264l) || !this.f9267l.ad(c4567lVip.f9267l)) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.Cnative
    public final int hashCode() {
        C10198l c10198l = this.f9266l;
        applovin applovinVar = c10198l.f20786l;
        return (((((((AbstractC14024l.ads(this.f9267l.f36577l) * 7) + AbstractC14024l.ads(this.f9264l.f36593l)) * 7) + AbstractC14024l.ads(this.f9265l.f36593l)) * 7) + AbstractC14024l.ads(c10198l.f20787l.f832l)) * 7) + ((applovinVar == null || C14998l.f29509l.pro(applovinVar)) ? 0 : applovinVar.hashCode());
    }
}
