package defpackage;

/* JADX INFO: renamed from: lؚِٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7200l {
    public int amazon = 0;
    public int crashlytics;
    public int loadAd;
    public byte[] purchase;
    public int yandex;

    public C7200l(byte[] bArr, int i, int i2) {
        this.purchase = bArr;
        this.loadAd = i;
        this.crashlytics = i;
        this.yandex = i2;
        yandex();
    }

    public boolean admob(int i) {
        int i2 = i - 2;
        if (this.loadAd > i2 || i >= this.yandex) {
            return false;
        }
        byte[] bArr = this.purchase;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    public boolean amazon() {
        boolean z = (this.purchase[this.crashlytics] & (128 >> this.amazon)) != 0;
        subs();
        return z;
    }

    public int billing() {
        int i = 0;
        while (!amazon()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? purchase(i) : 0);
    }

    public boolean crashlytics() {
        int i = this.crashlytics;
        int i2 = this.amazon;
        int i3 = 0;
        while (this.crashlytics < this.yandex && !amazon()) {
            i3++;
        }
        boolean z = this.crashlytics == this.yandex;
        this.crashlytics = i;
        this.amazon = i2;
        return !z && loadAd((i3 * 2) + 1);
    }

    public void isPro(int i) {
        int i2 = this.crashlytics;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.crashlytics = i4;
        int i5 = (i - (i3 * 8)) + this.amazon;
        this.amazon = i5;
        if (i5 > 7) {
            this.crashlytics = i4 + 1;
            this.amazon = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.crashlytics) {
                yandex();
                return;
            } else if (admob(i2)) {
                this.crashlytics++;
                i2 += 2;
            }
        }
    }

    public boolean loadAd(int i) {
        int i2 = this.crashlytics;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.amazon + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.yandex) {
                break;
            }
            if (admob(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.yandex;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public int mopub() {
        int iBilling = billing();
        return ((iBilling + 1) / 2) * (iBilling % 2 == 0 ? -1 : 1);
    }

    public int purchase(int i) {
        int i2;
        this.amazon += i;
        int i3 = 0;
        while (true) {
            i2 = this.amazon;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.amazon = i5;
            byte[] bArr = this.purchase;
            int i6 = this.crashlytics;
            i3 |= (bArr[i6] & 255) << i5;
            if (!admob(i6 + 1)) {
                i4 = 1;
            }
            this.crashlytics = i6 + i4;
        }
        byte[] bArr2 = this.purchase;
        int i7 = this.crashlytics;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.amazon = 0;
            this.crashlytics = i7 + (admob(i7 + 1) ? 2 : 1);
        }
        yandex();
        return i8;
    }

    public void subs() {
        int i = this.amazon + 1;
        this.amazon = i;
        if (i == 8) {
            this.amazon = 0;
            int i2 = this.crashlytics;
            this.crashlytics = i2 + (admob(i2 + 1) ? 2 : 1);
        }
        yandex();
    }

    public void yandex() {
        int i;
        int i2 = this.crashlytics;
        AbstractC12442l.subscription(i2 >= 0 && (i2 < (i = this.yandex) || (i2 == i && this.amazon == 0)));
    }
}
