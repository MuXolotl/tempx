package defpackage;

/* JADX INFO: renamed from: lؖ۟ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4438l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f9032l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f9033l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final byte[] f9034l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f9035l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f9036l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f9037l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f9038l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f9039l;

    public C4438l(Cclass cclass) {
        int iM4585strictfp;
        Cstrictfp cstrictfpPremium = Cstrictfp.premium(cclass.mo173throws(0));
        if (!cstrictfpPremium.inmobi(0) && !cstrictfpPremium.inmobi(1)) {
            C8339l.metrica("unknown version of sequence");
            throw null;
        }
        this.f9036l = cstrictfpPremium.m4585strictfp();
        if (cclass.size() != 2 && cclass.size() != 3) {
            C8339l.metrica("key sequence wrong size");
            throw null;
        }
        Cclass cclassInmobi = Cclass.inmobi(cclass.mo173throws(1));
        this.f9035l = Cstrictfp.premium(cclassInmobi.mo173throws(0)).m4585strictfp();
        this.f9032l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(1)).f36593l);
        this.f9038l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(2)).f36593l);
        this.f9037l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(3)).f36593l);
        this.f9039l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(4)).f36593l);
        if (cclassInmobi.size() == 6) {
            Cfinal cfinalInmobi = Cfinal.inmobi(cclassInmobi.mo173throws(5));
            if (cfinalInmobi.f821l != 0) {
                C8339l.metrica("unknown tag in XMSSPrivateKey");
                throw null;
            }
            ad adVar = Cstrictfp.f36571l;
            AbstractC9027l.loadAd(cfinalInmobi);
            Ccase ccaseApplovin = cfinalInmobi.applovin(false, adVar);
            adVar.m230l(ccaseApplovin);
            iM4585strictfp = ((Cstrictfp) ccaseApplovin).m4585strictfp();
        } else {
            if (cclassInmobi.size() != 5) {
                C8339l.metrica("keySeq should be 5 or 6 in length");
                throw null;
            }
            iM4585strictfp = -1;
        }
        this.f9033l = iM4585strictfp;
        if (cclass.size() != 3) {
            this.f9034l = null;
        } else {
            this.f9034l = AbstractC14024l.crashlytics(((Cthrow) Cthrow.f36592l.m222l(Cfinal.inmobi(cclass.mo173throws(2)), true)).f36593l);
        }
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        int i = this.f9033l;
        appmetricaVar.purchase(i >= 0 ? Cstrictfp.f36575l : Cstrictfp.f36573l);
        appmetrica appmetricaVar2 = new appmetrica((byte) 0, 0);
        appmetricaVar2.purchase(Cstrictfp.m4580private(this.f9035l));
        appmetricaVar2.purchase(new C11327l(this.f9032l));
        appmetricaVar2.purchase(new C11327l(this.f9038l));
        appmetricaVar2.purchase(new C11327l(this.f9037l));
        appmetricaVar2.purchase(new C11327l(this.f9039l));
        if (i >= 0) {
            appmetricaVar2.purchase(new C9320l(false, 0, Cstrictfp.m4580private(i)));
        }
        C11138l c11138l = new C11138l(appmetricaVar2);
        c11138l.f22357l = -1;
        appmetricaVar.purchase(c11138l);
        appmetricaVar.purchase(new C9320l(true, 0, new C11327l(this.f9034l)));
        C11138l c11138l2 = new C11138l(appmetricaVar);
        c11138l2.f22357l = -1;
        return c11138l2;
    }

    public C4438l(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.f9036l = 1;
        this.f9035l = i;
        this.f9032l = AbstractC14024l.crashlytics(bArr);
        this.f9038l = AbstractC14024l.crashlytics(bArr2);
        this.f9037l = AbstractC14024l.crashlytics(bArr3);
        this.f9039l = AbstractC14024l.crashlytics(bArr4);
        this.f9034l = AbstractC14024l.crashlytics(bArr5);
        this.f9033l = i2;
    }

    public C4438l(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f9036l = 0;
        this.f9035l = i;
        this.f9032l = AbstractC14024l.crashlytics(bArr);
        this.f9038l = AbstractC14024l.crashlytics(bArr2);
        this.f9037l = AbstractC14024l.crashlytics(bArr3);
        this.f9039l = AbstractC14024l.crashlytics(bArr4);
        this.f9034l = AbstractC14024l.crashlytics(bArr5);
        this.f9033l = -1;
    }
}
