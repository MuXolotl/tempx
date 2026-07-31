package defpackage;

/* JADX INFO: renamed from: lٔٝۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15044l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f29563l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f29564l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final byte[] f29565l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f29566l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f29567l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f29568l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f29569l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f29570l;

    public C15044l(Cclass cclass) {
        long jM4583native;
        Cstrictfp cstrictfpPremium = Cstrictfp.premium(cclass.mo173throws(0));
        if (!cstrictfpPremium.inmobi(0) && !cstrictfpPremium.inmobi(1)) {
            C8339l.metrica("unknown version of sequence");
            throw null;
        }
        this.f29567l = cstrictfpPremium.m4585strictfp();
        if (cclass.size() != 2 && cclass.size() != 3) {
            C8339l.metrica("key sequence wrong size");
            throw null;
        }
        Cclass cclassInmobi = Cclass.inmobi(cclass.mo173throws(1));
        this.f29566l = Cstrictfp.premium(cclassInmobi.mo173throws(0)).m4583native();
        this.f29569l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(1)).f36593l);
        this.f29568l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(2)).f36593l);
        this.f29570l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(3)).f36593l);
        this.f29564l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(4)).f36593l);
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
            jM4583native = ((Cstrictfp) ccaseApplovin).m4583native();
        } else {
            if (cclassInmobi.size() != 5) {
                C8339l.metrica("keySeq should be 5 or 6 in length");
                throw null;
            }
            jM4583native = -1;
        }
        this.f29563l = jM4583native;
        if (cclass.size() != 3) {
            this.f29565l = null;
        } else {
            this.f29565l = AbstractC14024l.crashlytics(((Cthrow) Cthrow.f36592l.m222l(Cfinal.inmobi(cclass.mo173throws(2)), true)).f36593l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        Cstrictfp cstrictfp;
        Cstrictfp cstrictfp2;
        appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
        long j = this.f29563l;
        appmetricaVar.purchase(j >= 0 ? Cstrictfp.f36575l : Cstrictfp.f36573l);
        appmetrica appmetricaVar2 = new appmetrica((byte) 0, 0);
        long j2 = this.f29566l;
        if (j2 >= 0) {
            Cstrictfp[] cstrictfpArr = Cstrictfp.f36574l;
            if (j2 < 17) {
                cstrictfp = cstrictfpArr[(int) j2];
            } else {
                cstrictfp = new Cstrictfp(j2);
            }
        } else {
            cstrictfp = new Cstrictfp(j2);
        }
        appmetricaVar2.purchase(cstrictfp);
        appmetricaVar2.purchase(new C11327l(this.f29569l));
        appmetricaVar2.purchase(new C11327l(this.f29568l));
        appmetricaVar2.purchase(new C11327l(this.f29570l));
        appmetricaVar2.purchase(new C11327l(this.f29564l));
        if (j >= 0) {
            if (j >= 0) {
                Cstrictfp[] cstrictfpArr2 = Cstrictfp.f36574l;
                if (j < 17) {
                    cstrictfp2 = cstrictfpArr2[(int) j];
                } else {
                    cstrictfp2 = new Cstrictfp(j);
                }
            } else {
                cstrictfp2 = new Cstrictfp(j);
            }
            appmetricaVar2.purchase(new C9320l(2, 128, 0, cstrictfp2));
        }
        C11138l c11138l = new C11138l(appmetricaVar2);
        c11138l.f22357l = -1;
        appmetricaVar.purchase(c11138l);
        appmetricaVar.purchase(new C9320l(true, 0, new C11327l(this.f29565l)));
        C11138l c11138l2 = new C11138l(appmetricaVar);
        c11138l2.f22357l = -1;
        return c11138l2;
    }

    public C15044l(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.f29567l = 1;
        this.f29566l = j;
        this.f29569l = AbstractC14024l.crashlytics(bArr);
        this.f29568l = AbstractC14024l.crashlytics(bArr2);
        this.f29570l = AbstractC14024l.crashlytics(bArr3);
        this.f29564l = AbstractC14024l.crashlytics(bArr4);
        this.f29565l = AbstractC14024l.crashlytics(bArr5);
        this.f29563l = j2;
    }

    public C15044l(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f29567l = 0;
        this.f29566l = j;
        this.f29569l = AbstractC14024l.crashlytics(bArr);
        this.f29568l = AbstractC14024l.crashlytics(bArr2);
        this.f29570l = AbstractC14024l.crashlytics(bArr3);
        this.f29564l = AbstractC14024l.crashlytics(bArr4);
        this.f29565l = AbstractC14024l.crashlytics(bArr5);
        this.f29563l = -1L;
    }
}
