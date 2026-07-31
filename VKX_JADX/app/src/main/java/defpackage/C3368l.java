package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: renamed from: lْؕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3368l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Cfor f7170l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Hashtable f7172l = new Hashtable();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Vector f7171l = new Vector();

    static {
        new Cfor("2.5.29.9");
        new Cfor("2.5.29.14");
        new Cfor("2.5.29.15");
        new Cfor("2.5.29.16");
        new Cfor("2.5.29.17");
        new Cfor("2.5.29.18");
        new Cfor("2.5.29.19");
        new Cfor("2.5.29.20");
        new Cfor("2.5.29.21");
        new Cfor("2.5.29.23");
        new Cfor("2.5.29.24");
        new Cfor("2.5.29.27");
        new Cfor("2.5.29.28");
        new Cfor("2.5.29.29");
        new Cfor("2.5.29.30");
        new Cfor("2.5.29.31");
        new Cfor("2.5.29.32");
        new Cfor("2.5.29.33");
        new Cfor("2.5.29.35");
        new Cfor("2.5.29.36");
        new Cfor("2.5.29.37");
        new Cfor("2.5.29.46");
        new Cfor("2.5.29.54");
        new Cfor("1.3.6.1.5.5.7.1.1");
        new Cfor("1.3.6.1.5.5.7.1.11");
        new Cfor("1.3.6.1.5.5.7.1.12");
        new Cfor("1.3.6.1.5.5.7.1.2");
        new Cfor("1.3.6.1.5.5.7.1.3");
        new Cfor("1.3.6.1.5.5.7.1.4");
        f7170l = new Cfor("2.5.29.56");
        new Cfor("2.5.29.55");
    }

    public C3368l(Cclass cclass) {
        Enumeration enumerationMo170package = cclass.mo170package();
        while (enumerationMo170package.hasMoreElements()) {
            Cclass cclassInmobi = Cclass.inmobi(enumerationMo170package.nextElement());
            if (cclassInmobi.size() == 3) {
                Hashtable hashtable = this.f7172l;
                applovin applovinVarMo173throws = cclassInmobi.mo173throws(0);
                signatures signaturesVarApplovin = signatures.applovin(cclassInmobi.mo173throws(1));
                Cthrow cthrowPremium = Cthrow.premium(cclassInmobi.mo173throws(2));
                C8932l c8932l = new C8932l();
                c8932l.yandex = signaturesVarApplovin.appmetrica();
                c8932l.loadAd = cthrowPremium;
                hashtable.put(applovinVarMo173throws, c8932l);
            } else {
                if (cclassInmobi.size() != 2) {
                    C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
                    throw null;
                }
                Hashtable hashtable2 = this.f7172l;
                applovin applovinVarMo173throws2 = cclassInmobi.mo173throws(0);
                Cthrow cthrowPremium2 = Cthrow.premium(cclassInmobi.mo173throws(1));
                C8932l c8932l2 = new C8932l();
                c8932l2.yandex = false;
                c8932l2.loadAd = cthrowPremium2;
                hashtable2.put(applovinVarMo173throws2, c8932l2);
            }
            this.f7171l.addElement(cclassInmobi.mo173throws(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C3368l vip(Ccase ccase) {
        if (ccase == 0) {
            return (C3368l) ccase;
        }
        if (ccase instanceof Cclass) {
            return new C3368l((Cclass) ccase);
        }
        if (!(ccase instanceof Cfinal)) {
            C8339l.metrica("illegal object in getInstance: ".concat(ccase.getClass().getName()));
            return null;
        }
        Cfinal cfinalInmobi = Cfinal.inmobi(ccase);
        AbstractC9027l.loadAd(cfinalInmobi);
        applovin applovinVar = cfinalInmobi.f824l;
        return vip((applovinVar instanceof Cnative ? (Cnative) applovinVar : applovinVar.billing()).billing());
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        Vector vector = this.f7171l;
        appmetrica appmetricaVar = new appmetrica(vector.size(), 0);
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            appmetrica appmetricaVar2 = new appmetrica(3, 0);
            Cfor cfor = (Cfor) enumerationElements.nextElement();
            C8932l c8932l = (C8932l) this.f7172l.get(cfor);
            appmetricaVar2.purchase(cfor);
            if (c8932l.yandex) {
                appmetricaVar2.purchase(signatures.f36567l);
            }
            appmetricaVar2.purchase(c8932l.loadAd);
            C11138l c11138l = new C11138l(appmetricaVar2);
            c11138l.f22357l = -1;
            appmetricaVar.purchase(c11138l);
        }
        C11138l c11138l2 = new C11138l(appmetricaVar);
        c11138l2.f22357l = -1;
        return c11138l2;
    }
}
