package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lَُٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17029l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public advert f33174l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10198l f33175l;

    public C17029l(C10198l c10198l, applovin applovinVar) {
        this.f33174l = new C13353l(applovinVar.billing().remoteconfig("DER"), 0);
        this.f33175l = c10198l;
    }

    public static C17029l vip(Object obj) {
        if (obj instanceof C17029l) {
            return (C17029l) obj;
        }
        if (obj != null) {
            Cclass cclassInmobi = Cclass.inmobi(obj);
            C17029l c17029l = new C17029l();
            if (cclassInmobi.size() == 2) {
                Enumeration enumerationMo170package = cclassInmobi.mo170package();
                c17029l.f33175l = C10198l.vip(enumerationMo170package.nextElement());
                c17029l.f33174l = advert.appmetrica(enumerationMo170package.nextElement());
                return c17029l;
            }
            C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f33175l, this.f33174l);
    }

    public final Ccase metrica() {
        return Ccase.advert(this.f33174l.inmobi());
    }

    public C17029l(C10198l c10198l, advert advertVar) {
        this.f33174l = advertVar;
        this.f33175l = c10198l;
    }

    public C17029l(C10198l c10198l, byte[] bArr) {
        this.f33174l = new C13353l(bArr, 0);
        this.f33175l = c10198l;
    }
}
