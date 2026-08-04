package defpackage;

/* JADX INFO: renamed from: lًَٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10307l extends Cnative {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Cstrictfp f21012l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Cstrictfp f21013l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C10198l f21014l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C10198l f21015l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cstrictfp f21016l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10198l f21017l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10198l f21018l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Cstrictfp f21019l;

    static {
        C10198l c10198l = new C10198l(InterfaceC4502l.billing, C14998l.f29509l);
        f21014l = c10198l;
        f21015l = new C10198l(InterfaceC0543l.f1864class, c10198l);
        f21012l = Cstrictfp.m4580private(20);
        f21013l = Cstrictfp.f36575l;
    }

    public C10307l(C10198l c10198l, C10198l c10198l2, Cstrictfp cstrictfp, Cstrictfp cstrictfp2) {
        this.f21018l = c10198l;
        this.f21017l = c10198l2;
        this.f21016l = cstrictfp;
        this.f21019l = cstrictfp2;
    }

    public static C10307l vip(Object obj) {
        if (obj instanceof C10307l) {
            return (C10307l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C10307l c10307l = new C10307l();
        c10307l.f21018l = f21014l;
        c10307l.f21017l = f21015l;
        c10307l.f21016l = f21012l;
        c10307l.f21019l = f21013l;
        for (int i = 0; i != cclassInmobi.size(); i++) {
            Cfinal cfinal = (Cfinal) cclassInmobi.mo173throws(i);
            int i2 = cfinal.f821l;
            ad adVar = Cclass.f503l;
            if (i2 == 0) {
                c10307l.f21018l = new C10198l((Cclass) adVar.m222l(cfinal, true));
            } else if (i2 == 1) {
                c10307l.f21017l = new C10198l((Cclass) adVar.m222l(cfinal, true));
            } else if (i2 == 2) {
                ad adVar2 = Cstrictfp.f36571l;
                AbstractC9027l.loadAd(cfinal);
                Ccase ccaseApplovin = cfinal.applovin(true, adVar2);
                adVar2.m230l(ccaseApplovin);
                c10307l.f21016l = (Cstrictfp) ccaseApplovin;
            } else {
                if (i2 != 3) {
                    C8339l.metrica("unknown tag");
                    return null;
                }
                ad adVar3 = Cstrictfp.f36571l;
                AbstractC9027l.loadAd(cfinal);
                Ccase ccaseApplovin2 = cfinal.applovin(true, adVar3);
                adVar3.m230l(ccaseApplovin2);
                c10307l.f21019l = (Cstrictfp) ccaseApplovin2;
            }
        }
        return c10307l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        Cstrictfp cstrictfp = this.f21019l;
        Cstrictfp cstrictfp2 = this.f21016l;
        C10198l c10198l = this.f21017l;
        appmetrica appmetricaVar = new appmetrica(4, 0);
        C10198l c10198l2 = this.f21018l;
        if (!c10198l2.equals(f21014l)) {
            appmetricaVar.purchase(new C9320l(true, 0, c10198l2));
        }
        if (!c10198l.equals(f21015l)) {
            appmetricaVar.purchase(new C9320l(true, 1, c10198l));
        }
        if (!cstrictfp2.ad(f21012l)) {
            appmetricaVar.purchase(new C9320l(true, 2, cstrictfp2));
        }
        if (!cstrictfp.ad(f21013l)) {
            appmetricaVar.purchase(new C9320l(true, 3, cstrictfp));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
