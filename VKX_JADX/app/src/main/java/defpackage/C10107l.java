package defpackage;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lَؗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10107l {
    public static final Logger billing = Logger.getLogger(C10107l.class.getName());
    public static final boolean mopub = AbstractC0357l.purchase;
    public int amazon;
    public final int crashlytics;
    public final byte[] loadAd;
    public final OutputStream purchase;
    public C7972l yandex;

    public C10107l(OutputStream outputStream, int i) {
        if (i < 0) {
            C8339l.metrica("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.loadAd = new byte[iMax];
        this.crashlytics = iMax;
        if (outputStream != null) {
            this.purchase = outputStream;
        } else {
            C6541l.subs("out");
            throw null;
        }
    }

    public static int admob(int i) {
        return subs(i << 3);
    }

    public static int billing(int i, C4966l c4966l) {
        int iAdmob = admob(i);
        int size = c4966l.size();
        return subs(size) + size + iAdmob;
    }

    public static int isPro(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int mopub(String str) {
        int length;
        try {
            length = AbstractC14741l.yandex(str);
        } catch (C8255l unused) {
            length = str.getBytes(AbstractC4579l.yandex).length;
        }
        return subs(length) + length;
    }

    public static int subs(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void Signature(long j) {
        smaato(8);
        loadAd(j);
    }

    public final void ad(int i, int i2, byte[] bArr) {
        vip(bArr, i, i2);
    }

    public final void adcel(C4966l c4966l) {
        applovin(c4966l.size());
        ad(c4966l.firebase(), c4966l.size(), c4966l.f10112l);
    }

    public final void ads(int i, int i2) {
        smaato(14);
        crashlytics(i, 5);
        yandex(i2);
    }

    public final void advert(int i, String str) {
        signatures(i, 2);
        isVip(str);
    }

    public final void amazon(int i) {
        boolean z = mopub;
        byte[] bArr = this.loadAd;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.amazon;
                if (i2 == 0) {
                    this.amazon = i3 + 1;
                    AbstractC0357l.isPro(bArr, i3, (byte) i);
                    return;
                } else {
                    this.amazon = i3 + 1;
                    AbstractC0357l.isPro(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.amazon;
                if (i4 == 0) {
                    this.amazon = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.amazon = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void applovin(int i) {
        smaato(5);
        amazon(i);
    }

    public final void appmetrica(int i, long j) {
        smaato(20);
        crashlytics(i, 0);
        purchase(j);
    }

    public final void crashlytics(int i, int i2) {
        amazon((i << 3) | i2);
    }

    public final void firebase() {
        this.purchase.write(this.loadAd, 0, this.amazon);
        this.amazon = 0;
    }

    public final void inmobi(long j) {
        smaato(10);
        purchase(j);
    }

    public final void isVip(String str) {
        try {
            int length = str.length() * 3;
            int iSubs = subs(length);
            int i = iSubs + length;
            int i2 = this.crashlytics;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iAmazon = AbstractC14741l.yandex.amazon(str, bArr, 0, length);
                applovin(iAmazon);
                vip(bArr, 0, iAmazon);
                return;
            }
            if (i > i2 - this.amazon) {
                firebase();
            }
            int iSubs2 = subs(str.length());
            int i3 = this.amazon;
            byte[] bArr2 = this.loadAd;
            try {
                try {
                    if (iSubs2 == iSubs) {
                        int i4 = i3 + iSubs2;
                        this.amazon = i4;
                        int iAmazon2 = AbstractC14741l.yandex.amazon(str, bArr2, i4, i2 - i4);
                        this.amazon = i3;
                        amazon((iAmazon2 - i3) - iSubs2);
                        this.amazon = iAmazon2;
                    } else {
                        int iYandex = AbstractC14741l.yandex(str);
                        amazon(iYandex);
                        this.amazon = AbstractC14741l.yandex.amazon(str, bArr2, this.amazon, iYandex);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new C8413l((IndexOutOfBoundsException) e);
                }
            } catch (C8255l e2) {
                this.amazon = i3;
                throw e2;
            }
        } catch (C8255l e3) {
            billing.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC4579l.yandex);
            try {
                applovin(bytes.length);
                ad(0, bytes.length, bytes);
            } catch (IndexOutOfBoundsException e4) {
                throw new C8413l(e4);
            }
        }
    }

    public final void license(int i, int i2) {
        smaato(20);
        crashlytics(i, 0);
        if (i2 >= 0) {
            amazon(i2);
        } else {
            purchase(i2);
        }
    }

    public final void loadAd(long j) {
        int i = this.amazon;
        byte[] bArr = this.loadAd;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.amazon = i + 8;
    }

    public final void metrica(int i, boolean z) {
        smaato(11);
        crashlytics(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.amazon;
        this.loadAd[i2] = b;
        this.amazon = i2 + 1;
    }

    public final void premium(int i, int i2) {
        smaato(20);
        crashlytics(i, 0);
        amazon(i2);
    }

    public final void pro(int i) {
        if (i >= 0) {
            applovin(i);
        } else {
            inmobi(i);
        }
    }

    public final void purchase(long j) {
        boolean z = mopub;
        byte[] bArr = this.loadAd;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.amazon;
                if (j2 == 0) {
                    this.amazon = i + 1;
                    AbstractC0357l.isPro(bArr, i, (byte) j);
                    return;
                } else {
                    this.amazon = i + 1;
                    AbstractC0357l.isPro(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.amazon;
                if (j3 == 0) {
                    this.amazon = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.amazon = i2 + 1;
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void remoteconfig(byte b) {
        if (this.amazon == this.crashlytics) {
            firebase();
        }
        int i = this.amazon;
        this.loadAd[i] = b;
        this.amazon = i + 1;
    }

    public final void signatures(int i, int i2) {
        applovin((i << 3) | i2);
    }

    public final void smaato(int i) {
        if (this.crashlytics - this.amazon < i) {
            firebase();
        }
    }

    public final void startapp(int i, C4966l c4966l) {
        signatures(i, 2);
        adcel(c4966l);
    }

    public final void subscription(int i) {
        smaato(4);
        yandex(i);
    }

    public final void tapsense(int i, long j) {
        smaato(18);
        crashlytics(i, 1);
        loadAd(j);
    }

    public final void vip(byte[] bArr, int i, int i2) {
        int i3 = this.amazon;
        int i4 = this.crashlytics;
        int i5 = i4 - i3;
        byte[] bArr2 = this.loadAd;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.amazon += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.amazon = i4;
        firebase();
        if (i7 > i4) {
            this.purchase.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.amazon = i7;
        }
    }

    public final void yandex(int i) {
        int i2 = this.amazon;
        byte[] bArr = this.loadAd;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.amazon = i2 + 4;
    }
}
