package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: renamed from: lٕؒۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1074l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Vector f2957l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Hashtable f2958l;

    public static C1074l ads(applovin applovinVar) {
        C18229l c18229l;
        applovin applovinVarMo173throws;
        if (applovinVar instanceof C1074l) {
            return (C1074l) applovinVar;
        }
        if (applovinVar == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(applovinVar);
        C1074l c1074l = new C1074l();
        c1074l.f2958l = new Hashtable();
        c1074l.f2957l = new Vector();
        Enumeration enumerationMo170package = cclassInmobi.mo170package();
        while (enumerationMo170package.hasMoreElements()) {
            Object objNextElement = enumerationMo170package.nextElement();
            Cfor cfor = C18229l.f35725l;
            if (objNextElement instanceof C18229l) {
                c18229l = (C18229l) objNextElement;
            } else if (objNextElement != null) {
                Cclass cclassInmobi2 = Cclass.inmobi(objNextElement);
                C18229l c18229l2 = new C18229l();
                if (cclassInmobi2.size() == 2) {
                    c18229l2.f35735l = Cfor.m192throws(cclassInmobi2.mo173throws(0));
                    c18229l2.f35734l = false;
                    applovinVarMo173throws = cclassInmobi2.mo173throws(1);
                } else {
                    if (cclassInmobi2.size() != 3) {
                        C8339l.metrica(AbstractC4338l.ad(cclassInmobi2, new StringBuilder("Bad sequence size: ")));
                        return null;
                    }
                    c18229l2.f35735l = Cfor.m192throws(cclassInmobi2.mo173throws(0));
                    c18229l2.f35734l = signatures.applovin(cclassInmobi2.mo173throws(1)).appmetrica();
                    applovinVarMo173throws = cclassInmobi2.mo173throws(2);
                }
                c18229l2.f35733l = Cthrow.premium(applovinVarMo173throws);
                c18229l = c18229l2;
            } else {
                c18229l = null;
            }
            Hashtable hashtable = c1074l.f2958l;
            Cfor cfor2 = c18229l.f35735l;
            if (hashtable.containsKey(cfor2) && !AbstractC8151l.crashlytics("org.bouncycastle.x509.ignore_repeated_extensions")) {
                C8339l.metrica(AbstractC9361l.license("repeated extension found: ", cfor2));
                return null;
            }
            c1074l.f2958l.put(cfor2, c18229l);
            c1074l.f2957l.addElement(cfor2);
        }
        return c1074l;
    }

    public static Cthrow metrica(C1074l c1074l, Cfor cfor) {
        C18229l c18229lVip;
        if (c1074l == null || (c18229lVip = c1074l.vip(cfor)) == null) {
            return null;
        }
        return c18229lVip.f35733l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        Vector vector = this.f2957l;
        appmetrica appmetricaVar = new appmetrica(vector.size(), 0);
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            appmetricaVar.purchase((C18229l) this.f2958l.get((Cfor) enumerationElements.nextElement()));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public final boolean tapsense() {
        Vector vector = this.f2957l;
        for (int i = 0; i != vector.size(); i++) {
            if (((C18229l) this.f2958l.get(vector.elementAt(i))).f35734l) {
                return true;
            }
        }
        return false;
    }

    public final C18229l vip(Cfor cfor) {
        return (C18229l) this.f2958l.get(cfor);
    }
}
