package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lٍۖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9747l {
    public int amazon;
    public final int crashlytics;
    public final byte[] loadAd;
    public C0770l yandex;
    public static final Logger purchase = Logger.getLogger(C9747l.class.getName());
    public static final boolean billing = AbstractC10611l.purchase;

    public C9747l(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            C18073l.adcel("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.loadAd = bArr;
        this.amazon = 0;
        this.crashlytics = i;
    }

    public static int ads(String str) {
        int length;
        try {
            length = AbstractC0405l.crashlytics(str);
        } catch (C14040l unused) {
            length = str.getBytes(AbstractC11565l.yandex).length;
        }
        return yandex(length) + length;
    }

    public static int loadAd(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int yandex(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void adcel(long j) throws C8413l {
        boolean z = billing;
        byte[] bArr = this.loadAd;
        int i = this.crashlytics;
        if (!z || i - this.amazon < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.amazon;
                if (j2 == 0) {
                    this.amazon = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.amazon = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.amazon), Integer.valueOf(i), 1), e, 15);
                    }
                }
                throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.amazon), Integer.valueOf(i), 1), e, 15);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = (int) j;
            int i4 = this.amazon;
            if (j3 == 0) {
                this.amazon = i4 + 1;
                AbstractC10611l.crashlytics.mopub(bArr, AbstractC10611l.billing + ((long) i4), (byte) i3);
                return;
            } else {
                this.amazon = i4 + 1;
                AbstractC10611l.crashlytics.mopub(bArr, AbstractC10611l.billing + ((long) i4), (byte) ((i3 | 128) & 255));
                j >>>= 7;
            }
        }
    }

    public final void admob(int i, long j) throws C8413l {
        metrica((i << 3) | 1);
        subs(j);
    }

    public final void amazon(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.loadAd, this.amazon, i2);
            this.amazon += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.amazon), Integer.valueOf(this.crashlytics), Integer.valueOf(i2)), e, 15);
        }
    }

    public final void billing(int i, int i2) throws C8413l {
        metrica((i << 3) | 5);
        mopub(i2);
    }

    public final void crashlytics(byte b) throws C8413l {
        try {
            byte[] bArr = this.loadAd;
            int i = this.amazon;
            this.amazon = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.amazon), Integer.valueOf(this.crashlytics), 1), e, 15);
        }
    }

    public final void firebase(int i) throws C8413l {
        if (i >= 0) {
            metrica(i);
        } else {
            adcel(i);
        }
    }

    public final void isPro(int i, int i2) throws C8413l {
        metrica(i << 3);
        firebase(i2);
    }

    public final void metrica(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.amazon;
            byte[] bArr = this.loadAd;
            if (i2 == 0) {
                this.amazon = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.amazon = i3 + 1;
                    bArr[i3] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.amazon), Integer.valueOf(this.crashlytics), 1), e, 15);
                }
            }
            throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.amazon), Integer.valueOf(this.crashlytics), 1), e, 15);
        }
    }

    public final void mopub(int i) throws C8413l {
        try {
            byte[] bArr = this.loadAd;
            int i2 = this.amazon;
            int i3 = i2 + 1;
            this.amazon = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.amazon = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.amazon = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.amazon = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.amazon), Integer.valueOf(this.crashlytics), 1), e, 15);
        }
    }

    public final void purchase(int i, AbstractC1096l abstractC1096l) {
        metrica((i << 3) | 2);
        metrica(abstractC1096l.admob());
        abstractC1096l.Signature(this);
    }

    public final void remoteconfig(int i, int i2) {
        metrica((i << 3) | i2);
    }

    public final void smaato(int i, String str) throws C8413l {
        metrica((i << 3) | 2);
        int i2 = this.amazon;
        try {
            int iYandex = yandex(str.length() * 3);
            int iYandex2 = yandex(str.length());
            int i3 = this.crashlytics;
            byte[] bArr = this.loadAd;
            if (iYandex2 != iYandex) {
                metrica(AbstractC0405l.crashlytics(str));
                int i4 = this.amazon;
                this.amazon = AbstractC0405l.loadAd(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + iYandex2;
                this.amazon = i5;
                int iLoadAd = AbstractC0405l.loadAd(str, bArr, i5, i3 - i5);
                this.amazon = i2;
                metrica((iLoadAd - i2) - iYandex2);
                this.amazon = iLoadAd;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(e);
        } catch (C14040l e2) {
            this.amazon = i2;
            purchase.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(AbstractC11565l.yandex);
            try {
                int length = bytes.length;
                metrica(length);
                amazon(0, length, bytes);
            } catch (IndexOutOfBoundsException e3) {
                throw new C8413l(e3);
            }
        }
    }

    public final void startapp(int i, long j) throws C8413l {
        metrica(i << 3);
        adcel(j);
    }

    public final void subs(long j) throws C8413l {
        try {
            byte[] bArr = this.loadAd;
            int i = this.amazon;
            int i2 = i + 1;
            this.amazon = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.amazon = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.amazon = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.amazon = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.amazon = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.amazon = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.amazon = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.amazon = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.amazon), Integer.valueOf(this.crashlytics), 1), e, 15);
        }
    }

    public final void vip(int i, int i2) {
        metrica(i << 3);
        metrica(i2);
    }
}
