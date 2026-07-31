package defpackage;

/* JADX INFO: renamed from: lُۣ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11388l extends Cnative implements premium {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Ccase f22966l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cnative f22967l;

    public C11388l(C2927l c2927l) {
        this.f22967l = c2927l;
        this.f22966l = new C9320l(2, 128, 0, c2927l);
    }

    public static C11388l vip(applovin applovinVar) {
        if (applovinVar == null || (applovinVar instanceof C11388l)) {
            return (C11388l) applovinVar;
        }
        if (applovinVar instanceof C2927l) {
            return new C11388l(C2927l.vip(applovinVar));
        }
        if (applovinVar instanceof C9018l) {
            return new C11388l((C9018l) applovinVar);
        }
        if (applovinVar instanceof Cfinal) {
            return new C11388l(C2927l.vip((Cclass) Cclass.f503l.m222l((Cfinal) applovinVar, false)));
        }
        if (applovinVar instanceof Cclass) {
            return new C11388l(C9018l.vip(applovinVar));
        }
        C8339l.metrica("unknown object in factory: ".concat(applovinVar.getClass().getName()));
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f22966l;
    }

    public C11388l(C9018l c9018l) {
        this.f22967l = c9018l;
        this.f22966l = c9018l.billing();
    }
}
