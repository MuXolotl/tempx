package defpackage;

/* JADX INFO: renamed from: lؚؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6949l extends AbstractC4634l implements Comparable {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f14575l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f14576l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f14577l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f14578l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f14579l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final int f14580l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f14581l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f14582l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f14583l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final boolean f14584l;

    public C6949l(int i, C11916l c11916l, int i2, C9205l c9205l, int i3, String str, String str2) {
        int iMopub;
        super(i, c11916l, i2);
        int i4 = 0;
        this.f14582l = AbstractC4338l.tapsense(i3, false);
        int i5 = this.f9432l.purchase;
        int i6 = c9205l.applovin;
        AbstractC1186l abstractC1186l = c9205l.advert;
        int i7 = i5 & (~i6);
        this.f14576l = (i7 & 1) != 0;
        this.f14577l = (i7 & 2) != 0;
        AbstractC1186l abstractC1186lIsVip = str2 != null ? AbstractC1186l.isVip(str2) : abstractC1186l.isEmpty() ? AbstractC1186l.isVip("") : abstractC1186l;
        int i8 = 0;
        while (true) {
            if (i8 >= abstractC1186lIsVip.size()) {
                iMopub = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iMopub = C16717l.mopub(this.f9432l, (String) abstractC1186lIsVip.get(i8), c9205l.appmetrica);
                if (iMopub > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f14581l = i8;
        this.f14578l = iMopub;
        int i9 = str2 != null ? 1088 : c9205l.signatures;
        int i10 = this.f9432l.billing;
        AbstractC9743l abstractC9743l = C16717l.firebase;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.f14583l = iBitCount;
        C5978l c5978l = this.f9432l;
        this.f14584l = (1088 & c5978l.billing) != 0;
        int iYandex = C16717l.yandex(c5978l, c9205l.isVip);
        this.f14580l = iYandex;
        int iMopub2 = C16717l.mopub(this.f9432l, str, C16717l.isPro(str) == null);
        this.f14575l = iMopub2;
        boolean z = iMopub > 0 || (abstractC1186l.isEmpty() && iBitCount > 0) || ((abstractC1186l.isEmpty() && iYandex != Integer.MAX_VALUE) || this.f14576l || ((this.f14577l && iMopub2 > 0) || c9205l.ad));
        if (AbstractC4338l.tapsense(i3, c9205l.f18945l) && z) {
            i4 = 1;
        }
        this.f14579l = i4;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: crashlytics, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C6949l c6949l) {
        AbstractC12716l abstractC12716lCrashlytics = AbstractC12716l.yandex.crashlytics(this.f14582l, c6949l.f14582l);
        Integer numValueOf = Integer.valueOf(this.f14581l);
        Integer numValueOf2 = Integer.valueOf(c6949l.f14581l);
        C0058l c0058l = C0058l.f957l;
        C0058l c0058l2 = C0058l.f956l;
        AbstractC12716l abstractC12716lLoadAd = abstractC12716lCrashlytics.loadAd(numValueOf, numValueOf2, c0058l2);
        int i = c6949l.f14578l;
        int i2 = this.f14578l;
        AbstractC12716l abstractC12716lYandex = abstractC12716lLoadAd.yandex(i2, i);
        int i3 = c6949l.f14583l;
        int i4 = this.f14583l;
        AbstractC12716l abstractC12716lCrashlytics2 = abstractC12716lYandex.yandex(i4, i3).loadAd(Integer.valueOf(this.f14580l), Integer.valueOf(c6949l.f14580l), c0058l2).crashlytics(this.f14576l, c6949l.f14576l);
        Boolean boolValueOf = Boolean.valueOf(this.f14577l);
        Boolean boolValueOf2 = Boolean.valueOf(c6949l.f14577l);
        if (i2 != 0) {
            c0058l = c0058l2;
        }
        AbstractC12716l abstractC12716lYandex2 = abstractC12716lCrashlytics2.loadAd(boolValueOf, boolValueOf2, c0058l).yandex(this.f14575l, c6949l.f14575l);
        if (i4 == 0) {
            abstractC12716lYandex2 = abstractC12716lYandex2.amazon(this.f14584l, c6949l.f14584l);
        }
        return abstractC12716lYandex2.purchase();
    }

    @Override // defpackage.AbstractC4634l
    public final /* bridge */ /* synthetic */ boolean loadAd(AbstractC4634l abstractC4634l) {
        return false;
    }

    @Override // defpackage.AbstractC4634l
    public final int yandex() {
        return this.f14579l;
    }
}
