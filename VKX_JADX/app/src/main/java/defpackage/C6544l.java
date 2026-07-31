package defpackage;

/* JADX INFO: renamed from: lؙْٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6544l implements InterfaceC17435l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f13661l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f13662l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f13663l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f13664l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f13665l;

    @Override // defpackage.InterfaceC17435l
    public boolean firebase(long j, C11379l c11379l, int i) {
        C12217l c12217l = (C12217l) this.f13664l;
        C0327l c0327lCrashlytics = c12217l.loadAd.crashlytics();
        if (!c12217l.isPro || c0327lCrashlytics == null || c12217l.yandex.amazon().f12057l.length() == 0) {
            return false;
        }
        this.f13661l = i >= 2;
        c12217l.ads.setValue(EnumC11107l.f22310l);
        ((C5514l) this.f13665l).invoke();
        c12217l.pro = -1;
        this.f13663l = -1;
        this.f13662l = j;
        this.f13663l = (int) (loadAd(j, c11379l, c0327lCrashlytics, true) >> 32);
        return true;
    }

    public long loadAd(long j, C11379l c11379l, C0327l c0327l, boolean z) {
        C12217l c12217l = (C12217l) this.f13664l;
        int length = c0327l.yandex.yandex.f7563l.length();
        int iAmazon = this.f13663l;
        if (iAmazon < 0 || iAmazon > length) {
            iAmazon = c12217l.loadAd.amazon(this.f13662l, false);
        }
        int i = iAmazon;
        long jSignatures = c12217l.signatures(c12217l.yandex.amazon(), i, c12217l.loadAd.amazon(j, false), false, c11379l, false, z, null);
        if (this.f13663l == -1 && !C12814l.amazon(jSignatures)) {
            this.f13663l = (int) (jSignatures >> 32);
        }
        if (C12814l.admob(jSignatures)) {
            jSignatures = AbstractC2296l.loadAd((int) (4294967295L & jSignatures), (int) (jSignatures >> 32));
        }
        c12217l.yandex.isPro(jSignatures);
        c12217l.pro(EnumC6775l.f14199l);
        return jSignatures;
    }

    @Override // defpackage.InterfaceC17435l
    public boolean remoteconfig(long j, C11379l c11379l) {
        C12217l c12217l = (C12217l) this.f13664l;
        C10312l c10312l = c12217l.loadAd;
        C16328l c16328l = c12217l.yandex;
        C0327l c0327lCrashlytics = c10312l.crashlytics();
        if (!c12217l.isPro || c0327lCrashlytics == null || c16328l.amazon().f12057l.length() == 0) {
            return false;
        }
        if (C12814l.crashlytics(c16328l.amazon().f12061l, loadAd(j, c11379l, c0327lCrashlytics, false))) {
            return true;
        }
        this.f13661l = false;
        return true;
    }

    @Override // defpackage.InterfaceC17435l
    public void subs() {
        C12217l c12217l = (C12217l) this.f13664l;
        c12217l.ads.setValue(EnumC11107l.f22312l);
        if (this.f13661l) {
            c12217l.ads();
        }
    }

    @Override // defpackage.InterfaceC17435l
    public boolean vip(long j) {
        C12217l c12217l = (C12217l) this.f13664l;
        C0327l c0327lCrashlytics = c12217l.loadAd.crashlytics();
        if (!c12217l.isPro || c0327lCrashlytics == null || c12217l.yandex.amazon().f12057l.length() == 0) {
            return false;
        }
        this.f13661l = false;
        ((C5514l) this.f13665l).invoke();
        loadAd(j, C1461l.f3667l, c0327lCrashlytics, false);
        return true;
    }

    @Override // defpackage.InterfaceC17435l
    public boolean yandex(long j) {
        return true;
    }
}
