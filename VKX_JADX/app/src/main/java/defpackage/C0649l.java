package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lؑۡۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0649l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public advert f2107l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10198l f2108l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C5963l f2109l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f2110l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f2111l;

    public static C0649l vip(applovin applovinVar) {
        if (applovinVar instanceof C0649l) {
            return (C0649l) applovinVar;
        }
        C5963l c5963l = null;
        if (applovinVar != null) {
            Cclass cclassInmobi = Cclass.inmobi(applovinVar);
            C0649l c0649l = new C0649l();
            int i = 0;
            c0649l.f2111l = false;
            if (cclassInmobi.size() == 3) {
                applovin applovinVarMo173throws = cclassInmobi.mo173throws(0);
                if (applovinVarMo173throws instanceof C5963l) {
                    c5963l = (C5963l) applovinVarMo173throws;
                } else if (applovinVarMo173throws != null) {
                    Cclass cclassInmobi2 = Cclass.inmobi(applovinVarMo173throws);
                    C5963l c5963l2 = new C5963l();
                    if (cclassInmobi2.size() < 3 || cclassInmobi2.size() > 7) {
                        C8339l.metrica(AbstractC4338l.ad(cclassInmobi2, new StringBuilder("Bad sequence size: ")));
                        return null;
                    }
                    if (cclassInmobi2.mo173throws(0) instanceof Cstrictfp) {
                        c5963l2.f12569l = Cstrictfp.premium(cclassInmobi2.mo173throws(0));
                        i = 1;
                    } else {
                        c5963l2.f12569l = null;
                    }
                    c5963l2.f12568l = C10198l.vip(cclassInmobi2.mo173throws(i));
                    c5963l2.f12566l = C10915l.metrica(cclassInmobi2.mo173throws(i + 1));
                    int i2 = i + 3;
                    c5963l2.f12571l = C2795l.metrica(cclassInmobi2.mo173throws(i + 2));
                    if (i2 < cclassInmobi2.size() && ((cclassInmobi2.mo173throws(i2) instanceof Cnew) || (cclassInmobi2.mo173throws(i2) instanceof Cpackage) || (cclassInmobi2.mo173throws(i2) instanceof C2795l))) {
                        c5963l2.f12570l = C2795l.metrica(cclassInmobi2.mo173throws(i2));
                        i2 = i + 4;
                    }
                    if (i2 < cclassInmobi2.size() && !(cclassInmobi2.mo173throws(i2) instanceof Cfinal)) {
                        c5963l2.f12572l = Cclass.inmobi(cclassInmobi2.mo173throws(i2));
                        i2++;
                    }
                    if (i2 < cclassInmobi2.size() && (cclassInmobi2.mo173throws(i2) instanceof Cfinal)) {
                        c5963l2.f12567l = C1074l.ads(Cclass.appmetrica((Cfinal) cclassInmobi2.mo173throws(i2), true));
                    }
                    c5963l = c5963l2;
                }
                c0649l.f2109l = c5963l;
                c0649l.f2108l = C10198l.vip(cclassInmobi.mo173throws(1));
                c0649l.f2107l = advert.appmetrica(cclassInmobi.mo173throws(2));
                return c0649l;
            }
            C8339l.metrica("sequence wrong size for CertificateList");
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(this.f2109l);
        appmetricaVar.purchase(this.f2108l);
        appmetricaVar.purchase(this.f2107l);
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    @Override // defpackage.Cnative
    public final int hashCode() {
        if (!this.f2111l) {
            this.f2110l = super.hashCode();
            this.f2111l = true;
        }
        return this.f2110l;
    }

    public final Enumeration metrica() {
        Cclass cclass = this.f2109l.f12572l;
        return cclass == null ? new C18102l() : new C9666l(cclass.mo170package());
    }
}
