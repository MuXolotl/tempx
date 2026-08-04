package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌٔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14772l extends Cnative {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final byte[] f28855l = {-87, -42, -21, 69, -15, 60, 112, -126, -128, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f28856l = f28855l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C4301l f28857l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cfor f28858l;

    public C14772l(Cfor cfor) {
        this.f28858l = cfor;
    }

    public static C14772l vip(Object obj) {
        C14772l c14772l;
        C4301l c4301l;
        int i;
        C1550l c1550l;
        if (obj instanceof C14772l) {
            return (C14772l) obj;
        }
        if (obj == null) {
            C8339l.metrica("object parse error");
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        if (cclassInmobi.mo173throws(0) instanceof Cfor) {
            c14772l = new C14772l(Cfor.m192throws(cclassInmobi.mo173throws(0)));
        } else {
            applovin applovinVarMo173throws = cclassInmobi.mo173throws(0);
            if (applovinVarMo173throws instanceof C4301l) {
                c4301l = (C4301l) applovinVarMo173throws;
            } else if (applovinVarMo173throws != null) {
                Cclass cclassInmobi2 = Cclass.inmobi(applovinVarMo173throws);
                C4301l c4301l2 = new C4301l();
                c4301l2.f8828l = BigInteger.valueOf(0L);
                if (cclassInmobi2.mo173throws(0) instanceof Cfinal) {
                    Cfinal cfinal = (Cfinal) cclassInmobi2.mo173throws(0);
                    if (!cfinal.m187throws() || cfinal.f821l != 0) {
                        C8339l.metrica("object parse error");
                        return null;
                    }
                    c4301l2.f8828l = Cstrictfp.premium(cfinal).appmetrica();
                    i = 1;
                } else {
                    i = 0;
                }
                applovin applovinVarMo173throws2 = cclassInmobi2.mo173throws(i);
                if (applovinVarMo173throws2 instanceof C1550l) {
                    c1550l = (C1550l) applovinVarMo173throws2;
                } else if (applovinVarMo173throws2 != null) {
                    Cclass cclassInmobi3 = Cclass.inmobi(applovinVarMo173throws2);
                    C1550l c1550l2 = new C1550l();
                    c1550l2.f3837l = Cstrictfp.premium(cclassInmobi3.mo173throws(0)).m4584package();
                    if (cclassInmobi3.mo173throws(1) instanceof Cstrictfp) {
                        c1550l2.f3836l = ((Cstrictfp) cclassInmobi3.mo173throws(1)).m4584package();
                    } else {
                        if (!(cclassInmobi3.mo173throws(1) instanceof Cclass)) {
                            C8339l.metrica("object parse error");
                            return null;
                        }
                        Cclass cclassInmobi4 = Cclass.inmobi(cclassInmobi3.mo173throws(1));
                        c1550l2.f3836l = Cstrictfp.premium(cclassInmobi4.mo173throws(0)).m4584package();
                        c1550l2.f3835l = Cstrictfp.premium(cclassInmobi4.mo173throws(1)).m4584package();
                        c1550l2.f3838l = Cstrictfp.premium(cclassInmobi4.mo173throws(2)).m4584package();
                    }
                    c1550l = c1550l2;
                } else {
                    c1550l = null;
                }
                c4301l2.f8827l = c1550l;
                c4301l2.f8826l = Cstrictfp.premium(cclassInmobi2.mo173throws(i + 1));
                c4301l2.f8830l = Cthrow.premium(cclassInmobi2.mo173throws(i + 2));
                c4301l2.f8829l = Cstrictfp.premium(cclassInmobi2.mo173throws(i + 3));
                c4301l2.f8831l = Cthrow.premium(cclassInmobi2.mo173throws(i + 4));
                c4301l = c4301l2;
            } else {
                c4301l = null;
            }
            c14772l = new C14772l();
            c14772l.f28856l = f28855l;
            c14772l.f28857l = c4301l;
        }
        if (cclassInmobi.size() == 2) {
            byte[] bArr = Cthrow.premium(cclassInmobi.mo173throws(1)).f36593l;
            c14772l.f28856l = bArr;
            if (bArr.length != 64) {
                C8339l.metrica("object parse error");
                return null;
            }
        }
        return c14772l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(2, 0);
        applovin applovinVar = this.f28858l;
        if (applovinVar == null) {
            applovinVar = this.f28857l;
        }
        appmetricaVar.purchase(applovinVar);
        if (!Arrays.equals(this.f28856l, f28855l)) {
            appmetricaVar.purchase(new C11327l(this.f28856l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
