package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؙؚّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7100l extends Cnative implements InterfaceC15427l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final BigInteger f14869l = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C16217l f14870l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C2976l f14871l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C14022l f14872l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public BigInteger f14873l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public BigInteger f14874l;

    public C7100l(AbstractC11918l abstractC11918l, C16217l c16217l, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        C14022l c14022l;
        C2976l c2976l = new C2976l();
        c2976l.f6463l = null;
        c2976l.f6465l = abstractC11918l;
        c2976l.f6464l = AbstractC14024l.crashlytics(bArr);
        InterfaceC3340l interfaceC3340l = abstractC11918l.yandex;
        boolean zFirebase = AbstractC6974l.firebase(interfaceC3340l);
        Cfor cfor = InterfaceC15427l.f30181l;
        if (zFirebase) {
            c2976l.f6463l = cfor;
        } else {
            if (interfaceC3340l.yandex() <= 1 || !interfaceC3340l.loadAd().equals(InterfaceC11695l.adcel) || !(interfaceC3340l instanceof C10044l)) {
                C8339l.metrica("This type of ECCurve is not implemented");
                throw null;
            }
            c2976l.f6463l = InterfaceC15427l.f30176l;
        }
        this.f14871l = c2976l;
        this.f14870l = c16217l;
        this.f14874l = bigInteger;
        this.f14873l = bigInteger2;
        if (AbstractC6974l.firebase(interfaceC3340l)) {
            BigInteger bigIntegerLoadAd = interfaceC3340l.loadAd();
            c14022l = new C14022l();
            c14022l.f27329l = cfor;
            c14022l.f27328l = new Cstrictfp(bigIntegerLoadAd);
        } else {
            if (interfaceC3340l.yandex() <= 1 || !interfaceC3340l.loadAd().equals(InterfaceC11695l.adcel) || !(interfaceC3340l instanceof C10044l)) {
                C8339l.metrica("'curve' is of an unsupported type");
                throw null;
            }
            int[] iArrAmazon = AbstractC14024l.amazon(((C10044l) interfaceC3340l).loadAd.yandex);
            if (iArrAmazon.length == 3) {
                c14022l = new C14022l(iArrAmazon[2], iArrAmazon[1], 0, 0);
            } else {
                if (iArrAmazon.length != 5) {
                    C8339l.metrica("Only trinomial and pentomial curves are supported");
                    throw null;
                }
                c14022l = new C14022l(iArrAmazon[4], iArrAmazon[1], iArrAmazon[2], iArrAmazon[3]);
            }
        }
        this.f14872l = c14022l;
    }

    public static C7100l vip(Object obj) {
        C14022l c14022l;
        int iM4585strictfp;
        int iM4585strictfp2;
        int i;
        if (obj instanceof C7100l) {
            return (C7100l) obj;
        }
        if (obj != null) {
            Cclass cclassInmobi = Cclass.inmobi(obj);
            C7100l c7100l = new C7100l();
            if ((cclassInmobi.mo173throws(0) instanceof Cstrictfp) && ((Cstrictfp) cclassInmobi.mo173throws(0)).inmobi(1)) {
                BigInteger bigIntegerAppmetrica = ((Cstrictfp) cclassInmobi.mo173throws(4)).appmetrica();
                c7100l.f14874l = bigIntegerAppmetrica;
                if (cclassInmobi.size() == 6) {
                    c7100l.f14873l = ((Cstrictfp) cclassInmobi.mo173throws(5)).appmetrica();
                }
                applovin applovinVarMo173throws = cclassInmobi.mo173throws(1);
                if (applovinVarMo173throws instanceof C14022l) {
                    c14022l = (C14022l) applovinVarMo173throws;
                } else if (applovinVarMo173throws != null) {
                    Cclass cclassInmobi2 = Cclass.inmobi(applovinVarMo173throws);
                    C14022l c14022l2 = new C14022l();
                    c14022l2.f27329l = Cfor.m192throws(cclassInmobi2.mo173throws(0));
                    c14022l2.f27328l = cclassInmobi2.mo173throws(1).billing();
                    c14022l = c14022l2;
                } else {
                    c14022l = null;
                }
                c7100l.f14872l = c14022l;
                BigInteger bigInteger = c7100l.f14873l;
                Cclass cclassInmobi3 = Cclass.inmobi(cclassInmobi.mo173throws(2));
                C2976l c2976l = new C2976l();
                c2976l.f6463l = null;
                Cfor cfor = c14022l.f27329l;
                Ccase ccase = c14022l.f27328l;
                c2976l.f6463l = cfor;
                if (cfor.ad(InterfaceC15427l.f30181l)) {
                    c2976l.f6465l = new C5277l(((Cstrictfp) ccase).appmetrica(), new BigInteger(1, Cthrow.premium(cclassInmobi3.mo173throws(0)).f36593l), new BigInteger(1, Cthrow.premium(cclassInmobi3.mo173throws(1)).f36593l), bigIntegerAppmetrica, bigInteger, false);
                } else {
                    if (!c2976l.f6463l.ad(InterfaceC15427l.f30176l)) {
                        C8339l.metrica("This type of ECCurve is not implemented");
                        return null;
                    }
                    Cclass cclassInmobi4 = Cclass.inmobi(ccase);
                    int iM4585strictfp3 = ((Cstrictfp) cclassInmobi4.mo173throws(0)).m4585strictfp();
                    Cfor cfor2 = (Cfor) cclassInmobi4.mo173throws(1);
                    if (cfor2.ad(InterfaceC15427l.f30153l)) {
                        iM4585strictfp2 = Cstrictfp.premium(cclassInmobi4.mo173throws(2)).m4585strictfp();
                        iM4585strictfp = 0;
                        i = 0;
                    } else {
                        if (!cfor2.ad(InterfaceC15427l.f30175l)) {
                            C8339l.metrica("This type of EC basis is not implemented");
                            return null;
                        }
                        Cclass cclassInmobi5 = Cclass.inmobi(cclassInmobi4.mo173throws(2));
                        int iM4585strictfp4 = Cstrictfp.premium(cclassInmobi5.mo173throws(0)).m4585strictfp();
                        int iM4585strictfp5 = Cstrictfp.premium(cclassInmobi5.mo173throws(1)).m4585strictfp();
                        iM4585strictfp = Cstrictfp.premium(cclassInmobi5.mo173throws(2)).m4585strictfp();
                        iM4585strictfp2 = iM4585strictfp4;
                        i = iM4585strictfp5;
                    }
                    c2976l.f6465l = new C6304l(iM4585strictfp3, iM4585strictfp2, i, iM4585strictfp, new BigInteger(1, Cthrow.premium(cclassInmobi3.mo173throws(0)).f36593l), new BigInteger(1, Cthrow.premium(cclassInmobi3.mo173throws(1)).f36593l), bigIntegerAppmetrica, bigInteger);
                }
                if (cclassInmobi3.size() == 3) {
                    c2976l.f6464l = ((C13353l) cclassInmobi3.mo173throws(2)).applovin();
                }
                c7100l.f14871l = c2976l;
                applovin applovinVarMo173throws2 = cclassInmobi.mo173throws(3);
                if (applovinVarMo173throws2 instanceof C16217l) {
                    c7100l.f14870l = (C16217l) applovinVarMo173throws2;
                    return c7100l;
                }
                c7100l.f14870l = new C16217l(c2976l.f6465l, ((Cthrow) applovinVarMo173throws2).f36593l);
                return c7100l;
            }
            C8339l.metrica("bad version in X9ECParameters");
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(6, 0);
        appmetricaVar.purchase(new Cstrictfp(f14869l));
        appmetricaVar.purchase(this.f14872l);
        appmetricaVar.purchase(this.f14871l);
        appmetricaVar.purchase(this.f14870l);
        appmetricaVar.purchase(new Cstrictfp(this.f14874l));
        BigInteger bigInteger = this.f14873l;
        if (bigInteger != null) {
            appmetricaVar.purchase(new Cstrictfp(bigInteger));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public final byte[] metrica() {
        return AbstractC14024l.crashlytics(this.f14871l.f6464l);
    }
}
