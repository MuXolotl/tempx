package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: renamed from: lٌٞۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8953l extends Cnative {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public inmobi f18468l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final String[] f18467l = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Hashtable f18466l = new Hashtable();

    public static C8953l vip(inmobi inmobiVar) {
        if (inmobiVar == null) {
            return null;
        }
        int iAppmetrica = inmobi.applovin(inmobiVar).appmetrica();
        Integer numValueOf = Integer.valueOf(iAppmetrica);
        Hashtable hashtable = f18466l;
        if (!hashtable.containsKey(numValueOf)) {
            C8953l c8953l = new C8953l();
            if (iAppmetrica < 0) {
                C8339l.metrica("Invalid CRL reason : not in (0..MAX)");
                return null;
            }
            c8953l.f18468l = new inmobi(iAppmetrica);
            hashtable.put(numValueOf, c8953l);
        }
        return (C8953l) hashtable.get(numValueOf);
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f18468l;
    }

    public final String toString() {
        inmobi inmobiVar = this.f18468l;
        inmobiVar.getClass();
        int iIntValue = new BigInteger(inmobiVar.f838l).intValue();
        return AbstractC14814l.startapp("CRLReason: ", (iIntValue < 0 || iIntValue > 10) ? "invalid" : f18467l[iIntValue]);
    }
}
