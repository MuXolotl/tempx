package defpackage;

/* JADX INFO: renamed from: lؗۤؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5257l {
    public int amazon;
    public int crashlytics;
    public byte[] loadAd;
    public int purchase;
    public final /* synthetic */ int yandex;

    public C5257l(int i, int i2) {
        this.yandex = 0;
        this.crashlytics = i;
        this.amazon = i2;
        this.loadAd = new byte[(i2 * 2) - 1];
        this.purchase = 0;
    }

    public void admob(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.loadAd;
            int i4 = this.crashlytics;
            int i5 = i4 + 1;
            this.crashlytics = i5;
            byte b = bArr2[i4];
            int i6 = this.amazon;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.amazon;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.loadAd;
            int i9 = this.crashlytics;
            this.crashlytics = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.amazon = i8 - 8;
        }
        int i10 = this.amazon + i7;
        this.amazon = i10;
        byte[] bArr4 = this.loadAd;
        int i11 = this.crashlytics;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.amazon = 0;
            this.crashlytics = i11 + 1;
        }
        yandex();
    }

    public int amazon() {
        AbstractC12442l.subscription(this.amazon == 0);
        return this.crashlytics;
    }

    public boolean billing() {
        switch (this.yandex) {
            case 1:
                boolean z = (this.loadAd[this.crashlytics] & (128 >> this.amazon)) != 0;
                vip();
                return z;
            default:
                boolean z2 = (((this.loadAd[this.amazon] & 255) >> this.purchase) & 1) == 1;
                metrica(1);
                return z2;
        }
    }

    public void crashlytics() {
        if (this.amazon == 0) {
            return;
        }
        this.amazon = 0;
        this.crashlytics++;
        yandex();
    }

    public void firebase(int i, byte[] bArr) {
        this.loadAd = bArr;
        this.crashlytics = 0;
        this.amazon = 0;
        this.purchase = i;
    }

    public void isPro(int i, byte[] bArr) {
        AbstractC12442l.subscription(this.amazon == 0);
        System.arraycopy(this.loadAd, this.crashlytics, bArr, 0, i);
        this.crashlytics += i;
        yandex();
    }

    public int loadAd() {
        return ((this.purchase - this.crashlytics) * 8) - this.amazon;
    }

    public void metrica(int i) {
        int i2;
        switch (this.yandex) {
            case 1:
                int i3 = i / 8;
                int i4 = this.crashlytics + i3;
                this.crashlytics = i4;
                int i5 = (i - (i3 * 8)) + this.amazon;
                this.amazon = i5;
                if (i5 > 7) {
                    this.crashlytics = i4 + 1;
                    this.amazon = i5 - 8;
                }
                yandex();
                break;
            default:
                int i6 = i / 8;
                int i7 = this.amazon + i6;
                this.amazon = i7;
                int i8 = (i - (i6 * 8)) + this.purchase;
                this.purchase = i8;
                boolean z = true;
                if (i8 > 7) {
                    this.amazon = i7 + 1;
                    this.purchase = i8 - 8;
                }
                int i9 = this.amazon;
                if (i9 < 0 || (i9 >= (i2 = this.crashlytics) && (i9 != i2 || this.purchase != 0))) {
                    z = false;
                }
                AbstractC12442l.subscription(z);
                break;
        }
    }

    public int mopub(int i) {
        switch (this.yandex) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.amazon += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.amazon;
                    if (i3 <= 8) {
                        byte[] bArr = this.loadAd;
                        int i4 = this.crashlytics;
                        int i5 = ((-1) >>> (32 - i)) & (((255 & bArr[i4]) >> (8 - i3)) | i2);
                        if (i3 == 8) {
                            this.amazon = 0;
                            this.crashlytics = i4 + 1;
                        }
                        yandex();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.amazon = i6;
                    byte[] bArr2 = this.loadAd;
                    int i7 = this.crashlytics;
                    this.crashlytics = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
                break;
            default:
                int i8 = this.amazon;
                int iMin = Math.min(i, 8 - this.purchase);
                byte[] bArr3 = this.loadAd;
                int i9 = i8 + 1;
                int i10 = ((bArr3[i8] & 255) >> this.purchase) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i10 |= (bArr3[i9] & 255) << iMin;
                    iMin += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i));
                metrica(i);
                return i11;
        }
    }

    public int purchase() {
        return (this.crashlytics * 8) + this.amazon;
    }

    public void remoteconfig(int i) {
        int i2 = i / 8;
        this.crashlytics = i2;
        this.amazon = i - (i2 * 8);
        yandex();
    }

    public void smaato(C13143l c13143l) {
        firebase(c13143l.crashlytics, c13143l.yandex);
        remoteconfig(c13143l.loadAd * 8);
    }

    public void startapp(int i) {
        AbstractC12442l.subscription(this.amazon == 0);
        this.crashlytics += i;
        yandex();
    }

    public long subs(int i) {
        if (i <= 32) {
            int iMopub = mopub(i);
            String str = AbstractC15323l.yandex;
            return ((long) iMopub) & 4294967295L;
        }
        int iMopub2 = mopub(i - 32);
        int iMopub3 = mopub(32);
        String str2 = AbstractC15323l.yandex;
        return (((long) iMopub3) & 4294967295L) | ((((long) iMopub2) & 4294967295L) << 32);
    }

    public void vip() {
        int i = this.amazon + 1;
        this.amazon = i;
        if (i == 8) {
            this.amazon = 0;
            this.crashlytics++;
        }
        yandex();
    }

    public void yandex() {
        int i;
        int i2 = this.crashlytics;
        AbstractC12442l.subscription(i2 >= 0 && (i2 < (i = this.purchase) || (i2 == i && this.amazon == 0)));
    }

    public C5257l(byte[] bArr) {
        this.yandex = 2;
        this.loadAd = bArr;
        this.crashlytics = bArr.length;
    }

    public C5257l(byte[] bArr, int i) {
        this.yandex = 1;
        this.loadAd = bArr;
        this.purchase = i;
    }

    public C5257l() {
        this.yandex = 1;
        this.loadAd = AbstractC15323l.loadAd;
    }
}
