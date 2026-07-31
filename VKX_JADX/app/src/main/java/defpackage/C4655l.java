package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lؗؕۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4655l extends Cnative implements InterfaceC0543l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C9748l f9472l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C18282l f9473l;

    public C4655l(C18282l c18282l, C9748l c9748l) {
        this.f9473l = c18282l;
        this.f9472l = c9748l;
    }

    public static C4655l vip(Object obj) {
        C18282l c18282l;
        if (obj instanceof C4655l) {
            return (C4655l) obj;
        }
        C9748l c9748l = null;
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C4655l c4655l = new C4655l();
        Enumeration enumerationMo170package = cclassInmobi.mo170package();
        Cclass cclassInmobi2 = Cclass.inmobi(((applovin) enumerationMo170package.nextElement()).billing());
        applovin applovinVarMo173throws = cclassInmobi2.mo173throws(0);
        Cfor cfor = InterfaceC0543l.f1923transient;
        if (applovinVarMo173throws.equals(cfor)) {
            c18282l = new C18282l(cfor, C16770l.vip(cclassInmobi2.mo173throws(1)));
        } else {
            Cclass cclassInmobi3 = Cclass.inmobi(cclassInmobi2);
            c18282l = new C18282l();
            c18282l.f35779l = C10198l.vip(cclassInmobi3);
        }
        c4655l.f9473l = c18282l;
        Object objNextElement = enumerationMo170package.nextElement();
        if (objNextElement instanceof C9748l) {
            c9748l = (C9748l) objNextElement;
        } else if (objNextElement != null) {
            Cclass cclassInmobi4 = Cclass.inmobi(objNextElement);
            c9748l = new C9748l();
            c9748l.f19885l = C10198l.vip(cclassInmobi4);
        }
        c4655l.f9472l = c9748l;
        return c4655l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f9473l, this.f9472l);
    }
}
