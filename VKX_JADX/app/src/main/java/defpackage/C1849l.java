package defpackage;

/* JADX INFO: renamed from: lؓٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1849l implements InterfaceC16090l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C2139l f4250l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18476l f4251l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14189l f4252l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f4253l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f4254l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f4255l;

    public C1849l(InterfaceC14189l interfaceC14189l) {
        this.f4252l = interfaceC14189l;
        C18476l c18476lCrashlytics = interfaceC14189l.crashlytics();
        this.f4251l = c18476lCrashlytics;
        C2139l c2139l = c18476lCrashlytics.f36081l;
        this.f4250l = c2139l;
        this.f4254l = c2139l != null ? c2139l.loadAd : -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f4253l = true;
    }

    @Override // defpackage.InterfaceC16090l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final long mo1064extends(C18476l c18476l, long j) {
        C2139l c2139l;
        C2139l c2139l2;
        if (this.f4253l) {
            C8339l.smaato("Source is closed.");
            return 0L;
        }
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.subscription(j, "byteCount (", ") < 0"));
            return 0L;
        }
        C2139l c2139l3 = this.f4250l;
        C18476l c18476l2 = this.f4251l;
        if (c2139l3 != null && (c2139l3 != (c2139l2 = c18476l2.f36081l) || this.f4254l != c2139l2.loadAd)) {
            C8339l.smaato("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f4252l.request(this.f4255l + 1)) {
            return -1L;
        }
        if (this.f4250l == null && (c2139l = c18476l2.f36081l) != null) {
            this.f4250l = c2139l;
            this.f4254l = c2139l.loadAd;
        }
        long jMin = Math.min(j, c18476l2.f36079l - this.f4255l);
        long j2 = this.f4255l;
        long j3 = j2 + jMin;
        AbstractC17463l.crashlytics(c18476l2.f36079l, j2, j3);
        if (j2 != j3) {
            long j4 = j3 - j2;
            c18476l.f36079l += j4;
            C2139l c2139l4 = c18476l2.f36081l;
            while (true) {
                long j5 = c2139l4.crashlytics - c2139l4.loadAd;
                if (j2 < j5) {
                    break;
                }
                j2 -= j5;
                c2139l4 = c2139l4.billing;
            }
            while (j4 > 0) {
                C2139l c2139lPurchase = c2139l4.purchase();
                int i = c2139lPurchase.loadAd + ((int) j2);
                c2139lPurchase.loadAd = i;
                c2139lPurchase.crashlytics = Math.min(i + ((int) j4), c2139lPurchase.crashlytics);
                if (c18476l.f36081l == null) {
                    c18476l.f36081l = c2139lPurchase;
                    c18476l.f36080l = c2139lPurchase;
                } else {
                    c18476l.f36080l.amazon(c2139lPurchase);
                    c18476l.f36080l = c2139lPurchase;
                }
                j4 -= (long) (c2139lPurchase.crashlytics - c2139lPurchase.loadAd);
                c2139l4 = c2139l4.billing;
                j2 = 0;
            }
        }
        this.f4255l += jMin;
        return jMin;
    }
}
