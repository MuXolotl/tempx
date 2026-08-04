package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lٍُٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10938l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10818l f22058l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10818l f22059l;

    /* JADX WARN: Multi-variable type inference failed */
    public static C10938l vip(Ccase ccase) {
        if (ccase == 0) {
            return (C10938l) ccase;
        }
        if (!(ccase instanceof Cclass)) {
            C8339l.metrica("illegal object in getInstance: ".concat(ccase.getClass().getName()));
            return null;
        }
        Cclass cclass = (Cclass) ccase;
        C10938l c10938l = new C10938l();
        if (cclass.size() != 1 && cclass.size() != 2) {
            C8339l.metrica(AbstractC4338l.ad(cclass, new StringBuilder("Bad sequence size: ")));
            return null;
        }
        Enumeration enumerationMo170package = cclass.mo170package();
        while (enumerationMo170package.hasMoreElements()) {
            Cfinal cfinalInmobi = Cfinal.inmobi(enumerationMo170package.nextElement());
            int i = cfinalInmobi.f821l;
            ad adVar = Cclass.f503l;
            if (i == 0) {
                c10938l.f22059l = C10818l.vip((Cclass) adVar.m222l(cfinalInmobi, true));
            } else {
                if (i != 1) {
                    C10754l.smaato(cfinalInmobi.f821l, "Bad tag number: ");
                    return null;
                }
                c10938l.f22058l = C10818l.vip((Cclass) adVar.m222l(cfinalInmobi, true));
            }
        }
        return c10938l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(2, 0);
        C10818l c10818l = this.f22059l;
        if (c10818l != null) {
            appmetricaVar.purchase(new C9320l(true, 0, c10818l));
        }
        C10818l c10818l2 = this.f22058l;
        if (c10818l2 != null) {
            appmetricaVar.purchase(new C9320l(true, 1, c10818l2));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
