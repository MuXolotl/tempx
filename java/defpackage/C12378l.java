package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lّؕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12378l extends Cnative implements premium {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f24469l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final applovin f24470l;

    public C12378l(C10915l c10915l) {
        this.f24470l = c10915l;
        this.f24469l = 4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    public static C12378l vip(Object obj) {
        Cfor cforAppmetrica;
        if (obj == null || (obj instanceof C12378l)) {
            return (C12378l) obj;
        }
        if (!(obj instanceof Cfinal)) {
            if (!(obj instanceof byte[])) {
                C8339l.metrica("unknown object in getInstance: ".concat(obj.getClass().getName()));
                return null;
            }
            try {
                return vip(Ccase.advert((byte[]) obj));
            } catch (IOException unused) {
                C8339l.metrica("unable to parse encoded general name");
                return null;
            }
        }
        Cfinal cfinal = (Cfinal) obj;
        int i = cfinal.f821l;
        ad adVar = Cclass.f503l;
        switch (i) {
            case 0:
            case 3:
            case 5:
                AbstractC9027l.loadAd(cfinal);
                Ccase ccaseApplovin = cfinal.applovin(false, adVar);
                adVar.m230l(ccaseApplovin);
                return new C12378l(i, (Cclass) ccaseApplovin);
            case 1:
            case 2:
            case 6:
                AbstractC9027l.loadAd(cfinal);
                ad adVar2 = C10604l.f21524l;
                Ccase ccaseApplovin2 = cfinal.applovin(false, adVar2);
                adVar2.m230l(ccaseApplovin2);
                return new C12378l(i, (C10604l) ccaseApplovin2);
            case 4:
                C9548l c9548l = C10915l.f22034l;
                return new C12378l(i, C10915l.metrica((Cclass) adVar.m222l(cfinal, true)));
            case 7:
                AbstractC9027l.loadAd(cfinal);
                ad adVar3 = Cthrow.f36592l;
                Ccase ccaseApplovin3 = cfinal.applovin(false, adVar3);
                adVar3.m230l(ccaseApplovin3);
                return new C12378l(i, (Cthrow) ccaseApplovin3);
            case 8:
                ad adVar4 = Cfor.f829l;
                int i2 = cfinal.f823l;
                if (i2 == 3 || i2 == 4 || cfinal.f822l != 128) {
                    ad adVar5 = Cfor.f829l;
                    AbstractC9027l.loadAd(cfinal);
                    Ccase ccaseApplovin4 = cfinal.applovin(false, adVar5);
                    adVar5.m230l(ccaseApplovin4);
                    cforAppmetrica = (Cfor) ccaseApplovin4;
                } else {
                    applovin applovinVar = cfinal.f824l;
                    Ccase ccaseBilling = (applovinVar instanceof Cnative ? (Cnative) applovinVar : applovinVar.billing()).billing();
                    if (ccaseBilling instanceof Cfor) {
                        ad adVar6 = Cfor.f829l;
                        AbstractC9027l.loadAd(cfinal);
                        Ccase ccaseApplovin5 = cfinal.applovin(false, adVar6);
                        adVar6.m230l(ccaseApplovin5);
                        cforAppmetrica = (Cfor) ccaseApplovin5;
                    } else {
                        byte[] bArr = Cthrow.premium(ccaseBilling).f36593l;
                        if (bArr == null) {
                            C6541l.subs("'contents' cannot be null");
                            return null;
                        }
                        cforAppmetrica = Cfor.appmetrica(true, bArr);
                    }
                }
                return new C12378l(i, cforAppmetrica);
            default:
                C8339l.metrica(AbstractC0653l.vip(i, "unknown tag: "));
                return null;
        }
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        int i = this.f24469l;
        return new C9320l(i == 4, i, this.f24470l);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    public final String toString() {
        String strYandex;
        StringBuilder sb = new StringBuilder();
        int i = this.f24469l;
        sb.append(i);
        sb.append(": ");
        applovin applovinVar = this.f24470l;
        if (i == 1 || i == 2) {
            strYandex = AbstractC9008l.yandex(C10604l.premium(applovinVar).f21525l);
            sb.append(strYandex);
        } else if (i == 4) {
            C10915l c10915lMetrica = C10915l.metrica(applovinVar);
            strYandex = c10915lMetrica.f22035l.yandex(c10915lMetrica);
            sb.append(strYandex);
        } else if (i != 6) {
            sb.append(applovinVar.toString());
        } else {
            strYandex = AbstractC9008l.yandex(C10604l.premium(applovinVar).f21525l);
            sb.append(strYandex);
        }
        return sb.toString();
    }

    public C12378l(int i, Cnative cnative) {
        this.f24470l = cnative;
        this.f24469l = i;
    }
}
