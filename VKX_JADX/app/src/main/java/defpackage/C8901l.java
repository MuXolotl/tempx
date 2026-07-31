package defpackage;

import java.math.BigInteger;
import java.util.Date;

/* JADX INFO: renamed from: lٌٛؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8901l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Cpackage f18288l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10198l f18289l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final BigInteger f18290l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C9775l f18291l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Cpackage f18292l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f18293l;

    public C8901l(Cclass cclass) {
        C9775l c9775l;
        this.f18290l = Cstrictfp.premium(cclass.mo173throws(0)).appmetrica();
        this.f18289l = C10198l.vip(cclass.mo173throws(1));
        this.f18288l = Cpackage.inmobi(cclass.mo173throws(2));
        this.f18292l = Cpackage.inmobi(cclass.mo173throws(3));
        applovin applovinVarMo173throws = cclass.mo173throws(4);
        if (applovinVarMo173throws instanceof C9775l) {
            c9775l = (C9775l) applovinVarMo173throws;
        } else {
            c9775l = applovinVarMo173throws != null ? new C9775l(Cclass.inmobi(applovinVarMo173throws)) : null;
        }
        this.f18291l = c9775l;
        this.f18293l = cclass.size() == 6 ? C17283l.premium(cclass.mo173throws(5)).mopub() : null;
    }

    public static C8901l vip(Object obj) {
        if (obj instanceof C8901l) {
            return (C8901l) obj;
        }
        if (obj != null) {
            return new C8901l(Cclass.inmobi(obj));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(6, 0);
        appmetricaVar.purchase(new Cstrictfp(this.f18290l));
        appmetricaVar.purchase(this.f18289l);
        appmetricaVar.purchase(this.f18288l);
        appmetricaVar.purchase(this.f18292l);
        appmetricaVar.purchase(this.f18291l);
        String str = this.f18293l;
        if (str != null) {
            appmetricaVar.purchase(new C17283l(str));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public C8901l(C10198l c10198l, Date date, Date date2, C9775l c9775l) {
        this.f18290l = BigInteger.valueOf(1L);
        this.f18289l = c10198l;
        this.f18288l = new C4472l(date);
        this.f18292l = new C4472l(date2);
        this.f18291l = c9775l;
        this.f18293l = null;
    }
}
