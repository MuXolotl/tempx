package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: renamed from: lٍۨؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9975l extends Cnative implements InterfaceC0543l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C5942l f20365l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C14148l f20366l;

    public static C9975l vip(Ccase ccase) {
        C5942l c5942l = null;
        C17203l c17203l = null;
        if (ccase != null) {
            Cclass cclassInmobi = Cclass.inmobi(ccase);
            C9975l c9975l = new C9975l();
            c9975l.f20365l = null;
            if (Cstrictfp.premium(cclassInmobi.mo173throws(0)).inmobi(3)) {
                c9975l.f20366l = C14148l.vip(cclassInmobi.mo173throws(1));
                if (cclassInmobi.size() == 3) {
                    applovin applovinVarMo173throws = cclassInmobi.mo173throws(2);
                    BigInteger bigInteger = C5942l.f12506l;
                    if (applovinVarMo173throws instanceof C5942l) {
                        c5942l = (C5942l) applovinVarMo173throws;
                    } else if (applovinVarMo173throws != null) {
                        Cclass cclassInmobi2 = Cclass.inmobi(applovinVarMo173throws);
                        C5942l c5942l2 = new C5942l();
                        applovin applovinVarMo173throws2 = cclassInmobi2.mo173throws(0);
                        if (applovinVarMo173throws2 instanceof C17203l) {
                            c17203l = (C17203l) applovinVarMo173throws2;
                        } else if (applovinVarMo173throws2 != null) {
                            Cclass cclassInmobi3 = Cclass.inmobi(applovinVarMo173throws2);
                            c17203l = new C17203l();
                            Enumeration enumerationMo170package = cclassInmobi3.mo170package();
                            c17203l.f33384l = C10198l.vip(enumerationMo170package.nextElement());
                            c17203l.f33385l = Cthrow.premium(enumerationMo170package.nextElement()).f36593l;
                        }
                        c5942l2.f12509l = c17203l;
                        c5942l2.f12508l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi2.mo173throws(1)).f36593l);
                        c5942l2.f12507l = cclassInmobi2.size() == 3 ? Cstrictfp.premium(cclassInmobi2.mo173throws(2)).appmetrica() : C5942l.f12506l;
                        c5942l = c5942l2;
                    }
                    c9975l.f20365l = c5942l;
                }
                return c9975l;
            }
            C8339l.metrica("wrong version for PFX PDU");
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(Cstrictfp.f36572l);
        appmetricaVar.purchase(this.f20366l);
        C5942l c5942l = this.f20365l;
        if (c5942l != null) {
            appmetricaVar.purchase(c5942l);
        }
        return new C16472l(appmetricaVar);
    }
}
