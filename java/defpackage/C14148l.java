package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lٌٓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14148l extends Cnative implements InterfaceC0543l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f27663l = true;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public applovin f27664l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cfor f27665l;

    public C14148l(Cfor cfor, Cnative cnative) {
        this.f27665l = cfor;
        this.f27664l = cnative;
    }

    public static C14148l vip(Object obj) {
        if (obj instanceof C14148l) {
            return (C14148l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C14148l c14148l = new C14148l();
        c14148l.f27663l = true;
        Enumeration enumerationMo170package = cclassInmobi.mo170package();
        c14148l.f27665l = (Cfor) enumerationMo170package.nextElement();
        if (enumerationMo170package.hasMoreElements()) {
            c14148l.f27664l = ((Cfinal) enumerationMo170package.nextElement()).appmetrica();
        }
        c14148l.f27663l = cclassInmobi instanceof C16472l;
        return c14148l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(2, 0);
        appmetricaVar.purchase(this.f27665l);
        applovin applovinVar = this.f27664l;
        if (applovinVar != null) {
            appmetricaVar.purchase(new C10411l(true, 0, applovinVar));
        }
        if (this.f27663l) {
            return new C16472l(appmetricaVar);
        }
        C3884l c3884l = new C3884l(appmetricaVar);
        c3884l.f8024l = -1;
        return c3884l;
    }
}
