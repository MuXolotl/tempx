package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: renamed from: lّْٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14849l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cclass f29079l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Hashtable f29080l;

    public static C14849l vip(Object obj) {
        if (obj instanceof C14849l) {
            return (C14849l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C14849l c14849l = new C14849l();
        c14849l.f29080l = new Hashtable();
        c14849l.f29079l = cclassInmobi;
        Enumeration enumerationMo170package = cclassInmobi.mo170package();
        while (enumerationMo170package.hasMoreElements()) {
            applovin applovinVar = (applovin) enumerationMo170package.nextElement();
            if (!(applovinVar.billing() instanceof Cfor)) {
                C8339l.metrica("Only ASN1ObjectIdentifiers allowed in ExtendedKeyUsage.");
                return null;
            }
            c14849l.f29080l.put(applovinVar, applovinVar);
        }
        return c14849l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f29079l;
    }

    public final C14512l[] metrica() {
        C14512l c14512l;
        Cclass cclass = this.f29079l;
        C14512l[] c14512lArr = new C14512l[cclass.size()];
        Enumeration enumerationMo170package = cclass.mo170package();
        int i = 0;
        while (enumerationMo170package.hasMoreElements()) {
            int i2 = i + 1;
            Object objNextElement = enumerationMo170package.nextElement();
            C14512l c14512l2 = C14512l.f28385l;
            if (objNextElement instanceof C14512l) {
                c14512l = (C14512l) objNextElement;
            } else {
                c14512l = objNextElement != null ? new C14512l(Cfor.m192throws(objNextElement)) : null;
            }
            c14512lArr[i] = c14512l;
            i = i2;
        }
        return c14512lArr;
    }
}
