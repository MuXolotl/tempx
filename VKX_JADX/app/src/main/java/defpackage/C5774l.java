package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lؘٙٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5774l extends Cnative implements InterfaceC0543l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10198l f12173l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10198l f12174l;

    public static C5774l vip(Object obj) {
        if (obj instanceof C5774l) {
            return (C5774l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C5774l c5774l = new C5774l();
        Enumeration enumerationMo170package = cclassInmobi.mo170package();
        Cclass cclassInmobi2 = Cclass.inmobi(((applovin) enumerationMo170package.nextElement()).billing());
        applovin applovinVarMo173throws = cclassInmobi2.mo173throws(0);
        Cfor cfor = InterfaceC0543l.f1923transient;
        if (applovinVarMo173throws.equals(cfor)) {
            c5774l.f12174l = new C10198l(cfor, C16770l.vip(cclassInmobi2.mo173throws(1)));
        } else {
            c5774l.f12174l = C10198l.vip(cclassInmobi2);
        }
        c5774l.f12173l = C10198l.vip(enumerationMo170package.nextElement());
        return c5774l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f12174l, this.f12173l);
    }
}
