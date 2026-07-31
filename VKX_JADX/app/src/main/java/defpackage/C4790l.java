package defpackage;

/* JADX INFO: renamed from: lٍؗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4790l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C18346l f9831l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C0869l f9832l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC9473l f9833l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f9834l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f9835l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f9836l;

    public C4790l(InterfaceC9473l interfaceC9473l) {
        this.f9833l = interfaceC9473l;
        C0869l c0869lCrashlytics = interfaceC9473l.crashlytics();
        this.f9832l = c0869lCrashlytics;
        C18346l c18346l = c0869lCrashlytics.f2527l;
        this.f9831l = c18346l;
        this.f9835l = c18346l != null ? c18346l.loadAd : -1;
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) {
        C18346l c18346l;
        C18346l c18346l2;
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f9834l) {
            C8339l.smaato("closed");
            return 0L;
        }
        C18346l c18346l3 = this.f9831l;
        C0869l c0869l2 = this.f9832l;
        if (c18346l3 != null && (c18346l3 != (c18346l2 = c0869l2.f2527l) || this.f9835l != c18346l2.loadAd)) {
            C8339l.smaato("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f9833l.request(this.f9836l + 1)) {
            return -1L;
        }
        if (this.f9831l == null && (c18346l = c0869l2.f2527l) != null) {
            this.f9831l = c18346l;
            this.f9835l = c18346l.loadAd;
        }
        long jMin = Math.min(j, c0869l2.f2526l - this.f9836l);
        this.f9832l.adcel(this.f9836l, jMin, c0869l);
        this.f9836l += jMin;
        return jMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9834l = true;
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return this.f9833l.isPro();
    }
}
