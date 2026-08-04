package defpackage;

/* JADX INFO: renamed from: lًٌُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10915l extends Cnative implements premium {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C9548l f22034l = C9548l.f19455l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC11126l f22035l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f22036l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f22037l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C11138l f22038l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C16138l[] f22039l;

    public C10915l(InterfaceC11126l interfaceC11126l, Cclass cclass) {
        int size = cclass.size();
        this.f22035l = interfaceC11126l;
        this.f22039l = new C16138l[size];
        boolean z = true;
        for (int i = 0; i < size; i++) {
            applovin applovinVarMo173throws = cclass.mo173throws(i);
            C16138l c16138lMetrica = C16138l.metrica(applovinVarMo173throws);
            z &= c16138lMetrica == applovinVarMo173throws;
            this.f22039l[i] = c16138lMetrica;
        }
        this.f22038l = z ? (C11138l) cclass.isVip() : new C11138l(this.f22039l);
    }

    public static C10915l metrica(Object obj) {
        if (obj instanceof C10915l) {
            return (C10915l) obj;
        }
        if (obj == null) {
            return null;
        }
        return new C10915l(f22034l, Cclass.inmobi(obj));
    }

    public static C10915l vip(InterfaceC11126l interfaceC11126l, Object obj) {
        if (!(obj instanceof C10915l)) {
            if (obj != null) {
                return new C10915l(interfaceC11126l, Cclass.inmobi(obj));
            }
            return null;
        }
        C10915l c10915l = (C10915l) obj;
        C10915l c10915l2 = new C10915l();
        c10915l2.f22035l = interfaceC11126l;
        c10915l2.f22039l = c10915l.f22039l;
        c10915l2.f22038l = c10915l.f22038l;
        return c10915l2;
    }

    public final C16138l[] ads() {
        return (C16138l[]) this.f22039l.clone();
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f22038l;
    }

    @Override // defpackage.Cnative
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10915l) && !(obj instanceof Cclass)) {
            return false;
        }
        if (this.f22038l.ad(((applovin) obj).billing())) {
            return true;
        }
        try {
            return this.f22035l.loadAd(this, metrica(obj));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.Cnative
    public final int hashCode() {
        if (this.f22037l) {
            return this.f22036l;
        }
        this.f22037l = true;
        ((AbstractC2426l) this.f22035l).getClass();
        C16138l[] c16138lArrAds = ads();
        int iAds = 0;
        for (int i = 0; i != c16138lArrAds.length; i++) {
            C16138l c16138l = c16138lArrAds[i];
            if (c16138l.f31596l.f842l.length > 1) {
                C8047l[] c8047lArrAds = c16138l.ads();
                for (int i2 = 0; i2 != c8047lArrAds.length; i2++) {
                    iAds = (iAds ^ AbstractC14024l.ads(c8047lArrAds[i2].f16751l.f832l)) ^ AbstractC11342l.amazon(c8047lArrAds[i2].f16750l).hashCode();
                }
            } else {
                C8047l c8047lVip = c16138l.vip();
                iAds = (iAds ^ AbstractC14024l.ads(c8047lVip.f16751l.f832l)) ^ AbstractC11342l.amazon(c8047lVip.f16750l).hashCode();
            }
        }
        this.f22036l = iAds;
        return iAds;
    }

    public final String toString() {
        return this.f22035l.yandex(this);
    }
}
