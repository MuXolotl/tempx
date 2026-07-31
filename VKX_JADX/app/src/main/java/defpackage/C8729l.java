package defpackage;

/* JADX INFO: renamed from: lٌِۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8729l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f17955l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f17956l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final byte[] f17957l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final byte[] f17958l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f17959l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f17960l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final byte[] f17961l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f17962l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f17963l;

    public C8729l(C13812l c13812l, byte[] bArr, C4124l c4124l) {
        super((Object) c13812l, true);
        C5775l c5775lAmazon = C5775l.amazon(c13812l, null);
        int i = c5775lAmazon.billing;
        int i2 = c5775lAmazon.purchase;
        if (bArr.length == 32) {
            byte[][] bArrLoadAd = c5775lAmazon.loadAd(bArr);
            this.f17955l = bArrLoadAd[0];
            this.f17960l = bArrLoadAd[1];
            this.f17959l = bArrLoadAd[2];
            this.f17962l = bArrLoadAd[3];
            this.f17956l = bArrLoadAd[4];
            this.f17957l = bArrLoadAd[5];
            this.f17961l = bArrLoadAd[6];
            this.f17958l = bArrLoadAd[7];
        } else {
            byte[] bArrVip = AbstractC14024l.vip(0, 32, bArr);
            this.f17955l = bArrVip;
            this.f17960l = AbstractC14024l.vip(32, 64, bArr);
            this.f17959l = AbstractC14024l.vip(64, 128, bArr);
            int i3 = (c5775lAmazon.mopub * i2) + 128;
            byte[] bArrVip2 = AbstractC14024l.vip(128, i3, bArr);
            this.f17962l = bArrVip2;
            int i4 = (i2 * i) + i3;
            byte[] bArrVip3 = AbstractC14024l.vip(i3, i4, bArr);
            this.f17956l = bArrVip3;
            byte[] bArrVip4 = AbstractC14024l.vip(i4, (i * 416) + i4, bArr);
            this.f17957l = bArrVip4;
            C3316l c3316l = new C3316l(c5775lAmazon);
            C1770l c1770l = new C1770l(c5775lAmazon);
            C10975l c10975l = new C10975l(c5775lAmazon);
            C10975l c10975l2 = new C10975l(c5775lAmazon);
            C10975l c10975l3 = new C10975l(c5775lAmazon);
            C2287l.smaato(c10975l3, c1770l, c10975l, bArrVip4, bArrVip2, bArrVip3, c5775lAmazon);
            c3316l.smaato(bArrVip);
            C1770l c1770l2 = new C1770l(c5775lAmazon);
            c1770l.subs(c1770l2);
            c1770l2.remoteconfig();
            c3316l.metrica(c10975l2, c1770l2);
            c10975l2.m3012case();
            c10975l2.appmetrica();
            c10975l2.isVip(c10975l);
            c10975l2.signatures();
            c10975l2.m3021private(c10975l3);
            this.f17961l = C2287l.firebase(c10975l2, c5775lAmazon);
            this.f17958l = null;
        }
        if (c4124l == null || AbstractC14024l.smaato(this.f17961l, AbstractC14024l.crashlytics(c4124l.f8489l))) {
            this.f17963l = this.f17958l != null ? 0 : 2;
        } else {
            C8339l.metrica("passed in public key does not match private values");
            throw null;
        }
    }

    public final C8729l billing(int i) {
        if (this.f17963l == i) {
            return this;
        }
        if (i == 0 || i == 1) {
            if (this.f17958l == null) {
                C8339l.smaato("no seed available");
                return null;
            }
        } else if (i != 2) {
            C8339l.metrica("unknown format");
            return null;
        }
        return new C8729l(this, i);
    }

    public final byte[] getEncoded() {
        return AbstractC14024l.isPro(new byte[][]{this.f17955l, this.f17960l, this.f17959l, this.f17962l, this.f17956l, this.f17957l});
    }

    public C8729l(C13812l c13812l, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        super((Object) c13812l, true);
        this.f17955l = AbstractC14024l.crashlytics(bArr);
        this.f17960l = AbstractC14024l.crashlytics(bArr2);
        this.f17959l = AbstractC14024l.crashlytics(bArr3);
        this.f17962l = AbstractC14024l.crashlytics(bArr4);
        this.f17956l = AbstractC14024l.crashlytics(bArr5);
        this.f17957l = AbstractC14024l.crashlytics(bArr6);
        this.f17961l = AbstractC14024l.crashlytics(bArr7);
        this.f17958l = AbstractC14024l.crashlytics(bArr8);
        this.f17963l = bArr8 != null ? 0 : 2;
    }

    public C8729l(C8729l c8729l, int i) {
        super(c8729l.f16541l, true);
        this.f17955l = c8729l.f17955l;
        this.f17960l = c8729l.f17960l;
        this.f17959l = c8729l.f17959l;
        this.f17962l = c8729l.f17962l;
        this.f17956l = c8729l.f17956l;
        this.f17957l = c8729l.f17957l;
        this.f17961l = c8729l.f17961l;
        this.f17958l = c8729l.f17958l;
        this.f17963l = i;
    }
}
