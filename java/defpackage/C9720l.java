package defpackage;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lٍٞۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9720l extends AbstractC7741l {
    public final byte[] amazon;
    public int billing;
    public C2290l crashlytics;
    public final int purchase;
    public static final Logger mopub = Logger.getLogger(C9720l.class.getName());
    public static final boolean admob = AbstractC1851l.purchase;

    public C9720l(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            C8339l.metrica(AbstractC12589l.premium(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.amazon = bArr;
        this.billing = 0;
        this.purchase = i;
    }

    public static int isVip(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int premium(String str) {
        int length;
        try {
            length = AbstractC17165l.yandex(str);
        } catch (C9443l unused) {
            length = str.getBytes(AbstractC11966l.yandex).length;
        }
        return isVip(length) + length;
    }

    public static int signatures(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void Signature(int i) throws C8413l {
        int i2;
        int i3 = this.billing;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.amazon;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.billing = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new C8413l(i2, this.purchase, 1, e, 18);
                }
            }
            throw new C8413l(i2, this.purchase, 1, e, 18);
        }
    }

    public final void ad(long j) throws C8413l {
        int i = this.billing;
        try {
            byte[] bArr = this.amazon;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.billing = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(i, this.purchase, 8, e, 18);
        }
    }

    public final void adcel(int i, long j) throws C8413l {
        Signature(i << 3);
        pro(j);
    }

    public final void ads(int i, long j) throws C8413l {
        Signature((i << 3) | 1);
        ad(j);
    }

    public final void advert(int i, byte[] bArr) throws C8413l {
        try {
            System.arraycopy(bArr, 0, this.amazon, this.billing, i);
            this.billing += i;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(this.billing, this.purchase, i, e, 18);
        }
    }

    public final void license(int i) throws C8413l {
        int i2 = this.billing;
        try {
            byte[] bArr = this.amazon;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.billing = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(i2, this.purchase, 4, e, 18);
        }
    }

    public final void metrica(int i, int i2) throws C8413l {
        Signature(i << 3);
        Signature(i2);
    }

    public final void pro(long j) throws C8413l {
        int i;
        int i2 = this.billing;
        byte[] bArr = this.amazon;
        int i3 = this.purchase;
        if (!admob || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new C8413l(i, i3, 1, e, 18);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new C8413l(i, i3, 1, e, 18);
            }
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                AbstractC1851l.crashlytics.loadAd(bArr, AbstractC1851l.billing + ((long) i2), (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            AbstractC1851l.crashlytics.loadAd(bArr, AbstractC1851l.billing + ((long) i2), (byte) j3);
        }
        this.billing = i;
    }

    public final void remoteconfig(int i, int i2) throws C8413l {
        Signature((i << 3) | i2);
    }

    public final void startapp(int i, int i2) throws C8413l {
        Signature((i << 3) | 5);
        license(i2);
    }

    public final void subscription(int i, String str) throws C8413l {
        Signature((i << 3) | 2);
        int i2 = this.billing;
        try {
            int iIsVip = isVip(str.length() * 3);
            int iIsVip2 = isVip(str.length());
            int i3 = this.purchase;
            byte[] bArr = this.amazon;
            if (iIsVip2 != iIsVip) {
                Signature(AbstractC17165l.yandex(str));
                int i4 = this.billing;
                this.billing = AbstractC17165l.loadAd(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + iIsVip2;
                this.billing = i5;
                int iLoadAd = AbstractC17165l.loadAd(str, bArr, i5, i3 - i5);
                this.billing = i2;
                Signature((iLoadAd - i2) - iIsVip2);
                this.billing = iLoadAd;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(e);
        } catch (C9443l e2) {
            this.billing = i2;
            mopub.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(AbstractC11966l.yandex);
            try {
                int length = bytes.length;
                Signature(length);
                advert(length, bytes);
            } catch (IndexOutOfBoundsException e3) {
                throw new C8413l(e3);
            }
        }
    }

    public final void tapsense(int i) throws C8413l {
        if (i >= 0) {
            Signature(i);
        } else {
            pro(i);
        }
    }

    public final void vip(int i, int i2) throws C8413l {
        Signature(i << 3);
        tapsense(i2);
    }
}
