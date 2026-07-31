package defpackage;

/* JADX INFO: renamed from: lؙؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1314l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cclass f3402l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cfor f3403l;

    public static C1314l vip(Object obj) {
        if (obj == null || (obj instanceof C1314l)) {
            return (C1314l) obj;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C1314l c1314l = new C1314l();
        if (cclassInmobi.size() < 1 || cclassInmobi.size() > 2) {
            C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
            return null;
        }
        c1314l.f3403l = Cfor.m192throws(cclassInmobi.mo173throws(0));
        if (cclassInmobi.size() > 1) {
            c1314l.f3402l = Cclass.inmobi(cclassInmobi.mo173throws(1));
        }
        return c1314l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(2, 0);
        appmetricaVar.purchase(this.f3403l);
        Cclass cclass = this.f3402l;
        if (cclass != null) {
            appmetricaVar.purchase(cclass);
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public final String toString() {
        C12392l c12392l;
        StringBuilder sb = new StringBuilder("Policy information: ");
        sb.append(this.f3403l);
        Cclass cclass = this.f3402l;
        if (cclass != null) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < cclass.size(); i++) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                applovin applovinVarMo173throws = cclass.mo173throws(i);
                if (applovinVarMo173throws instanceof C12392l) {
                    c12392l = (C12392l) applovinVarMo173throws;
                } else if (applovinVarMo173throws != null) {
                    Cclass cclassInmobi = Cclass.inmobi(applovinVarMo173throws);
                    C12392l c12392l2 = new C12392l();
                    if (cclassInmobi.size() != 2) {
                        C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
                        return null;
                    }
                    c12392l2.f24483l = Cfor.m192throws(cclassInmobi.mo173throws(0));
                    c12392l2.f24482l = cclassInmobi.mo173throws(1);
                    c12392l = c12392l2;
                } else {
                    c12392l = null;
                }
                sb2.append(c12392l);
            }
            sb.append("[");
            sb.append((CharSequence) sb2);
            sb.append("]");
        }
        return sb.toString();
    }
}
