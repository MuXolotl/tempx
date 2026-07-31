package defpackage;

/* JADX INFO: renamed from: l٘ۥۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18346l {
    public boolean amazon;
    public C18346l billing;
    public int crashlytics;
    public int loadAd;
    public C18346l mopub;
    public final boolean purchase;
    public final byte[] yandex;

    public C18346l() {
        this.yandex = new byte[8192];
        this.purchase = true;
        this.amazon = false;
    }

    public final void amazon(C18346l c18346l, int i) {
        if (!c18346l.purchase) {
            C8339l.smaato("only owner can write");
            return;
        }
        int i2 = c18346l.crashlytics;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c18346l.amazon) {
                C11983l.crashlytics();
                return;
            }
            int i4 = c18346l.loadAd;
            if (i3 - i4 > 8192) {
                C11983l.crashlytics();
                return;
            }
            byte[] bArr = c18346l.yandex;
            AbstractC8669l.applovin(bArr, 0, i4, bArr, i2, 2);
            c18346l.crashlytics -= c18346l.loadAd;
            c18346l.loadAd = 0;
        }
        byte[] bArr2 = c18346l.yandex;
        int i5 = c18346l.crashlytics;
        int i6 = this.loadAd;
        AbstractC8669l.advert(this.yandex, i5, i6, bArr2, i6 + i);
        c18346l.crashlytics += i;
        this.loadAd += i;
    }

    public final C18346l crashlytics() {
        this.amazon = true;
        return new C18346l(this.yandex, this.loadAd, this.crashlytics, true, false);
    }

    public final void loadAd(C18346l c18346l) {
        c18346l.mopub = this;
        c18346l.billing = this.billing;
        this.billing.mopub = c18346l;
        this.billing = c18346l;
    }

    public final C18346l yandex() {
        C18346l c18346l = this.billing;
        C18346l c18346l2 = c18346l != this ? c18346l : null;
        C18346l c18346l3 = this.mopub;
        c18346l3.billing = c18346l;
        this.billing.mopub = c18346l3;
        this.billing = null;
        this.mopub = null;
        return c18346l2;
    }

    public C18346l(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.yandex = bArr;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = z;
        this.purchase = z2;
    }
}
