package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٍؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7154l extends Cnative {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cclass f14964l;

    public C7154l(int i, BigInteger bigInteger, advert advertVar, C7130l c7130l) {
        byte[] bArrYandex = AbstractC16784l.yandex((i + 7) / 8, bigInteger);
        appmetrica appmetricaVar = new appmetrica(4, 0);
        appmetricaVar.purchase(Cstrictfp.f36575l);
        appmetricaVar.purchase(new C11327l(bArrYandex));
        if (c7130l != null) {
            appmetricaVar.purchase(new C9320l(true, 0, c7130l));
        }
        if (advertVar != null) {
            appmetricaVar.purchase(new C9320l(true, 1, advertVar));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        this.f14964l = c11138l;
    }

    public static C7154l vip(Object obj) {
        if (obj instanceof C7154l) {
            return (C7154l) obj;
        }
        if (obj != null) {
            return new C7154l(Cclass.inmobi(obj));
        }
        return null;
    }

    public final Ccase ads(int i, int i2) {
        Cclass cclass = this.f14964l;
        int size = cclass.size();
        int i3 = 0;
        while (true) {
            Cfinal cfinal = null;
            if (i3 < size) {
                applovin applovinVarMo173throws = cclass.mo173throws(i3);
                if (applovinVarMo173throws == null) {
                    C6541l.subs("'element' cannot be null");
                    break;
                }
                Cfinal cfinal2 = applovinVarMo173throws instanceof Cfinal ? (Cfinal) applovinVarMo173throws : null;
                if (cfinal2 != null && cfinal2.f822l == 128 && cfinal2.f821l == i) {
                    cfinal = cfinal2;
                }
                if (cfinal != null) {
                    return i2 < 0 ? cfinal.appmetrica().billing() : cfinal.premium(i2);
                }
                i3++;
            } else {
                break;
            }
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f14964l;
    }

    public final BigInteger metrica() {
        return new BigInteger(1, ((Cthrow) this.f14964l.mo173throws(1)).f36593l);
    }

    public final advert tapsense() {
        return (advert) ads(1, 3);
    }

    public C7154l(Cthrow cthrow, Ccase ccase) {
        appmetrica appmetricaVar = new appmetrica(4, 0);
        appmetricaVar.purchase(Cstrictfp.f36575l);
        appmetricaVar.purchase(cthrow);
        if (ccase != null) {
            appmetricaVar.purchase(new C9320l(true, 0, ccase));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        this.f14964l = c11138l;
    }

    public C7154l(Cclass cclass) {
        this.f14964l = cclass;
    }
}
