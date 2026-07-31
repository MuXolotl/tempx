package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lّؗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4848l extends Ccase {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final ad f9892l = new ad(4, C4848l.class);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Ccase f9893l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cstrictfp f9894l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cfor f9895l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Ccase f9896l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f9897l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f9898l;

    public C4848l(Cclass cclass, int i) {
        int i2;
        Ccase ccaseBilling;
        this.f9898l = i;
        Ccase ccaseApplovin = applovin(cclass, 0);
        if (ccaseApplovin instanceof Cfor) {
            this.f9895l = (Cfor) ccaseApplovin;
            ccaseApplovin = applovin(cclass, 1);
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (ccaseApplovin instanceof Cstrictfp) {
            this.f9894l = (Cstrictfp) ccaseApplovin;
            i2++;
            ccaseApplovin = applovin(cclass, i2);
        }
        if (!(ccaseApplovin instanceof Cfinal)) {
            this.f9893l = ccaseApplovin;
            i2++;
            ccaseApplovin = applovin(cclass, i2);
        }
        if (cclass.size() != i2 + 1) {
            C8339l.metrica("input sequence too large");
            throw null;
        }
        if (!(ccaseApplovin instanceof Cfinal)) {
            C8339l.metrica("No tagged object found in sequence. Structure doesn't seem to be of type External");
            throw null;
        }
        Cfinal cfinal = (Cfinal) ccaseApplovin;
        int i3 = cfinal.f821l;
        if (i3 < 0 || i3 > 2) {
            C8339l.metrica(AbstractC0653l.vip(i3, "invalid encoding value: "));
            throw null;
        }
        this.f9897l = i3;
        AbstractC9027l.loadAd(cfinal);
        if (i3 == 0) {
            ccaseBilling = cfinal.appmetrica().billing();
        } else if (i3 == 1) {
            AbstractC9027l.loadAd(cfinal);
            ad adVar = Cthrow.f36592l;
            Ccase ccaseApplovin2 = cfinal.applovin(false, adVar);
            adVar.m230l(ccaseApplovin2);
            ccaseBilling = (Cthrow) ccaseApplovin2;
        } else {
            if (i3 != 2) {
                C8339l.metrica("invalid tag: ".concat(AbstractC9027l.crashlytics(cfinal.f822l, i3)));
                throw null;
            }
            AbstractC9027l.loadAd(cfinal);
            ad adVar2 = advert.f9l;
            Ccase ccaseApplovin3 = cfinal.applovin(false, adVar2);
            adVar2.m230l(ccaseApplovin3);
            ccaseBilling = (advert) ccaseApplovin3;
        }
        this.f9896l = ccaseBilling;
    }

    public static Ccase applovin(Cclass cclass, int i) {
        if (cclass.size() > i) {
            return cclass.mo173throws(i).billing();
        }
        C8339l.metrica("too few objects in input sequence");
        return null;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return premium().Signature(z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return true;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        Cfor cfor = this.f9895l;
        int iHashCode = cfor == null ? 0 : cfor.hashCode();
        Cstrictfp cstrictfp = this.f9894l;
        int iHashCode2 = iHashCode ^ (cstrictfp == null ? 0 : cstrictfp.hashCode());
        Ccase ccase = this.f9893l;
        return this.f9896l.hashCode() ^ ((iHashCode2 ^ (ccase != null ? ccase.hashCode() : 0)) ^ this.f9897l);
    }

    @Override // defpackage.Ccase
    public Ccase isVip() {
        switch (this.f9898l) {
            case 0:
                return this;
            default:
                Cfor cfor = this.f9895l;
                Cstrictfp cstrictfp = this.f9894l;
                Ccase ccase = this.f9893l;
                int i = this.f9897l;
                Ccase ccase2 = this.f9896l;
                C4848l c4848l = new C4848l();
                c4848l.f9895l = cfor;
                c4848l.f9894l = cstrictfp;
                c4848l.f9893l = ccase;
                if (i < 0 || i > 2) {
                    C8339l.metrica(AbstractC0653l.vip(i, "invalid encoding value: "));
                } else {
                    c4848l.f9897l = i;
                    if (i == 1 ? Cthrow.class.isInstance(ccase2) : !(i == 2 && !advert.class.isInstance(ccase2))) {
                        c4848l.f9896l = ccase2;
                        return c4848l;
                    }
                    C8339l.smaato("unexpected object: ".concat(ccase2.getClass().getName()));
                }
                return null;
        }
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        c7972l.m2248try(40, z);
        premium().metrica(c7972l, false);
    }

    public final Cclass premium() {
        switch (this.f9898l) {
            case 0:
                appmetrica appmetricaVar = new appmetrica(4, 0);
                Cfor cfor = this.f9895l;
                if (cfor != null) {
                    appmetricaVar.purchase(cfor);
                }
                Cstrictfp cstrictfp = this.f9894l;
                if (cstrictfp != null) {
                    appmetricaVar.purchase(cstrictfp);
                }
                Ccase ccase = this.f9893l;
                if (ccase != null) {
                    appmetricaVar.purchase(ccase.isVip());
                }
                int i = this.f9897l;
                appmetricaVar.purchase(new C9320l(i == 0, i, this.f9896l));
                C11138l c11138l = new C11138l(appmetricaVar);
                c11138l.f22357l = -1;
                return c11138l;
            default:
                appmetrica appmetricaVar2 = new appmetrica(4, 0);
                Cfor cfor2 = this.f9895l;
                if (cfor2 != null) {
                    appmetricaVar2.purchase(cfor2);
                }
                Cstrictfp cstrictfp2 = this.f9894l;
                if (cstrictfp2 != null) {
                    appmetricaVar2.purchase(cstrictfp2);
                }
                Ccase ccase2 = this.f9893l;
                if (ccase2 != null) {
                    appmetricaVar2.purchase(ccase2.signatures());
                }
                int i2 = this.f9897l;
                appmetricaVar2.purchase(new C7332l(i2 == 0, i2, this.f9896l));
                C3884l c3884l = new C3884l(appmetricaVar2);
                c3884l.f8024l = -1;
                return c3884l;
        }
    }

    @Override // defpackage.Ccase
    public final Ccase signatures() {
        int i = this.f9898l;
        return this;
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (this == ccase) {
            return true;
        }
        if (!(ccase instanceof C4848l)) {
            return false;
        }
        C4848l c4848l = (C4848l) ccase;
        return AbstractC16570l.loadAd(this.f9895l, c4848l.f9895l) && AbstractC16570l.loadAd(this.f9894l, c4848l.f9894l) && AbstractC16570l.loadAd(this.f9893l, c4848l.f9893l) && this.f9897l == c4848l.f9897l && this.f9896l.ad(c4848l.f9896l);
    }

    public /* synthetic */ C4848l() {
        this.f9898l = 0;
    }
}
