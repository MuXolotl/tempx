package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؘۧۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6129l {
    public int loadAd;
    public byte[] yandex;

    public C6129l() {
        this.yandex = new byte[32];
    }

    public static void subs(C6129l c6129l, byte[] bArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = bArr.length;
        }
        c6129l.getClass();
        if (bArr.length < 0 || i < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            return;
        }
        c6129l.yandex(i);
        AbstractC8669l.advert(bArr, c6129l.loadAd, 0, c6129l.yandex, i);
        c6129l.loadAd += i;
    }

    public void admob(int i) {
        yandex(1);
        byte[] bArr = this.yandex;
        int i2 = this.loadAd;
        this.loadAd = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public byte[] amazon() {
        int iBilling = billing();
        if (iBilling == 0) {
            return new byte[0];
        }
        byte[] bArr = this.yandex;
        int length = bArr.length;
        int i = this.loadAd;
        if (iBilling > length - i) {
            C8339l.metrica("not enough data for block");
            return null;
        }
        int i2 = iBilling + i;
        this.loadAd = i2;
        return AbstractC14024l.vip(i, i2, bArr);
    }

    public int billing() {
        int i = this.loadAd;
        byte[] bArr = this.yandex;
        if (i > bArr.length - 4) {
            C8339l.metrica("4 bytes for U32 exceeds buffer.");
            return 0;
        }
        int iYandex = AbstractC10000l.yandex(i, bArr);
        this.loadAd += 4;
        return iYandex;
    }

    public BigInteger crashlytics() {
        int iBilling = billing();
        byte[] bArr = this.yandex;
        int length = bArr.length;
        int i = this.loadAd;
        if (iBilling > length - i) {
            C8339l.metrica("not enough data for big num");
            return null;
        }
        int i2 = iBilling + i;
        this.loadAd = i2;
        return new BigInteger(1, AbstractC14024l.vip(i, i2, bArr));
    }

    public int loadAd() {
        int i = this.loadAd;
        byte[] bArr = this.yandex;
        if (i >= bArr.length) {
            return -1;
        }
        this.loadAd = i + 1;
        return bArr[i] & 255;
    }

    public void mopub() {
        int iBilling = billing();
        int length = this.yandex.length;
        int i = this.loadAd;
        if (iBilling <= length - i) {
            this.loadAd = i + iBilling;
        } else {
            C8339l.metrica("not enough data for block");
        }
    }

    public String purchase() {
        return AbstractC9008l.yandex(amazon());
    }

    public void yandex(int i) {
        int i2 = this.loadAd + i;
        if (i2 <= this.yandex.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i2) << 1];
        AbstractC8669l.applovin(this.yandex, 0, 0, bArr, 0, 14);
        this.yandex = bArr;
    }

    public C6129l(byte[] bArr) {
        this.loadAd = 0;
        this.yandex = bArr;
    }

    public C6129l(int i, byte[] bArr) {
        this.loadAd = i;
        this.yandex = bArr;
    }
}
