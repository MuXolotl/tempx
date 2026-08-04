package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lْؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13143l {
    public int crashlytics;
    public int loadAd;
    public byte[] yandex;
    public static final char[] amazon = {'\r', '\n'};
    public static final char[] purchase = {'\n'};
    public static final AbstractC8481l billing = AbstractC8481l.metrica(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean mopub = new AtomicBoolean();

    public C13143l(int i) {
        this.yandex = new byte[i];
        this.crashlytics = i;
    }

    public static int amazon(Charset charset) {
        AbstractC12442l.isPro(billing.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static int loadAd(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return AbstractC9966l.mopub((byte) 0, AbstractC1762l.loadAd(((i & 7) << 2) | ((i2 & 48) >> 4)), AbstractC1762l.loadAd(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), AbstractC1762l.loadAd(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    public static boolean purchase(byte b) {
        return (b & 192) == 128;
    }

    public final long Signature() {
        billing(8);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.loadAd = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.loadAd = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.loadAd = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.loadAd = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.loadAd = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.loadAd = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.loadAd = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    public final short ad() {
        billing(2);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.loadAd = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final short adcel() {
        billing(2);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        int i3 = bArr[i] & 255;
        this.loadAd = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final int admob(Charset charset) {
        int codePoint;
        int i;
        AbstractC12442l.isPro(billing.contains(charset), "Unsupported charset: %s", charset);
        if (yandex() < amazon(charset)) {
            C11467l.startapp(this.loadAd, this.crashlytics, ", limit=", "position=");
            return 0;
        }
        int i2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.yandex[this.loadAd];
            if ((b & 128) == 0) {
                codePoint = b & 255;
                return (codePoint << 8) | i2;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.yandex[this.loadAd];
            if ((b2 & 128) == 0) {
                i = 1;
            } else if ((b2 & 224) == 192 && yandex() >= 2 && purchase(this.yandex[this.loadAd + 1])) {
                i = 2;
            } else if ((this.yandex[this.loadAd] & 240) == 224 && yandex() >= 3 && purchase(this.yandex[this.loadAd + 1]) && purchase(this.yandex[this.loadAd + 2])) {
                i = 3;
            } else {
                i = ((this.yandex[this.loadAd] & 248) == 240 && yandex() >= 4 && purchase(this.yandex[this.loadAd + 1]) && purchase(this.yandex[this.loadAd + 2]) && purchase(this.yandex[this.loadAd + 3])) ? 4 : 0;
            }
            if (i == 1) {
                codePoint = this.yandex[this.loadAd] & 255;
            } else if (i == 2) {
                byte[] bArr = this.yandex;
                int i3 = this.loadAd;
                codePoint = loadAd(0, 0, bArr[i3], bArr[i3 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr2 = this.yandex;
                        int i4 = this.loadAd;
                        codePoint = loadAd(bArr2[i4], bArr2[i4 + 1], bArr2[i4 + 2], bArr2[i4 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.yandex;
                int i5 = this.loadAd;
                codePoint = loadAd(0, bArr3[i5] & 15, bArr3[i5 + 1], bArr3[i5 + 2]);
            }
            i2 = i;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cMopub = mopub(0, byteOrder);
            if (!Character.isHighSurrogate(cMopub) || yandex() < 4) {
                codePoint = cMopub;
                i2 = 2;
            } else {
                codePoint = Character.toCodePoint(cMopub, mopub(2, byteOrder));
                i2 = 4;
            }
        }
        return (codePoint << 8) | i2;
    }

    public final long ads() {
        billing(4);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.loadAd = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.loadAd = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.loadAd = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    public final String advert(int i, Charset charset) {
        billing(i);
        String str = new String(this.yandex, this.loadAd, i, charset);
        this.loadAd += i;
        return str;
    }

    public final long applovin() {
        billing(4);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.loadAd = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.loadAd = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.loadAd = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    public final int appmetrica() {
        billing(3);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.loadAd = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.loadAd = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public final void billing(int i) {
        if (!mopub.get() || yandex() >= i) {
            return;
        }
        C11983l.mopub(yandex(), AbstractC2812l.Signature("bytesNeeded= ", i, ", bytesLeft="));
    }

    public final void crashlytics(int i) {
        byte[] bArr = this.yandex;
        if (i > bArr.length) {
            this.yandex = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m3561extends(int i) {
        AbstractC12442l.admob(i >= 0 && i <= this.yandex.length);
        this.crashlytics = i;
    }

    public final void firebase(int i, int i2, byte[] bArr) {
        billing(i2);
        System.arraycopy(this.yandex, this.loadAd, bArr, i, i2);
        this.loadAd += i2;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m3562for(int i) {
        AbstractC12442l.admob(i >= 0 && i <= this.crashlytics);
        this.loadAd = i;
    }

    public final int inmobi() {
        int iRemoteconfig = remoteconfig();
        if (iRemoteconfig >= 0) {
            return iRemoteconfig;
        }
        C8339l.smaato(AbstractC0653l.vip(iRemoteconfig, "Top bit not zero: "));
        return 0;
    }

    public final int isPro() {
        billing(1);
        return this.yandex[this.loadAd] & 255;
    }

    public final int isVip() {
        return signatures() | (signatures() << 21) | (signatures() << 14) | (signatures() << 7);
    }

    public final String license() {
        if (yandex() == 0) {
            return null;
        }
        int i = this.loadAd;
        while (i < this.crashlytics && this.yandex[i] != 0) {
            i++;
        }
        byte[] bArr = this.yandex;
        int i2 = this.loadAd;
        String str = AbstractC15323l.yandex;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.loadAd = i;
        if (i < this.crashlytics) {
            this.loadAd = i + 1;
        }
        return str2;
    }

    public final int metrica() {
        billing(4);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.loadAd = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.loadAd = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.loadAd = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final char mopub(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        billing(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.yandex;
        int i2 = this.loadAd;
        if (byteOrder == byteOrder2) {
            int i3 = i2 + i;
            b = bArr[i3];
            b2 = bArr[i3 + 1];
        } else {
            int i4 = i2 + i;
            b = bArr[i4 + 1];
            b2 = bArr[i4];
        }
        return (char) ((b2 & 255) | (b << 8));
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m3563native(int i) {
        byte[] bArr = this.yandex;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m3565private(i, bArr);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final long m3564package() {
        long jSignature = Signature();
        if (jSignature >= 0) {
            return jSignature;
        }
        C8339l.smaato(AbstractC2812l.ads(jSignature, "Top bit not zero: "));
        return 0L;
    }

    public final int premium() {
        billing(4);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.loadAd = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.loadAd = i + 4;
        return i4;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m3565private(int i, byte[] bArr) {
        this.yandex = bArr;
        this.crashlytics = i;
        this.loadAd = 0;
    }

    public final String pro(int i) {
        billing(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.loadAd;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.crashlytics || this.yandex[i3] != 0) ? i : i - 1;
        byte[] bArr = this.yandex;
        String str = AbstractC15323l.yandex;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.loadAd += i;
        return str2;
    }

    public final int remoteconfig() {
        billing(4);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.loadAd = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.loadAd = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.loadAd = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public final int signatures() {
        billing(1);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        this.loadAd = i + 1;
        return bArr[i] & 255;
    }

    public final char smaato(Charset charset, char[] cArr) {
        int iAdmob;
        if (yandex() >= amazon(charset) && (iAdmob = admob(charset)) != 0) {
            long j = iAdmob >>> 8;
            AbstractC12442l.billing(j, "out of range: %s", (j >> 32) == 0);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                AbstractC12442l.billing(j2, "Out of range: %s", ((long) c) == j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.loadAd = AbstractC9966l.loadAd(iAdmob & 255) + this.loadAd;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final long startapp() {
        billing(8);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.loadAd = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.loadAd = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.loadAd = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.loadAd = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.loadAd = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.loadAd = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.loadAd = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final long m3566strictfp() {
        int i;
        billing(1);
        long j = this.yandex[this.loadAd];
        int i2 = 7;
        while (true) {
            if (i2 >= 0) {
                int i3 = 1 << i2;
                if ((((long) i3) & j) == 0) {
                    if (i2 < 6) {
                        j &= (long) (i3 - 1);
                        i = 7 - i2;
                        break;
                    }
                    if (i2 == 7) {
                        i = 1;
                        break;
                    }
                } else {
                    i2--;
                }
            }
            i = 0;
            break;
        }
        if (i == 0) {
            throw new NumberFormatException(AbstractC2812l.ads(j, "Invalid UTF-8 sequence first byte: "));
        }
        billing(i);
        for (int i4 = 1; i4 < i; i4++) {
            byte b = this.yandex[this.loadAd + i4];
            if ((b & 192) != 128) {
                throw new NumberFormatException(AbstractC2812l.ads(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.loadAd += i;
        return j;
    }

    public final int subs() {
        if (yandex() < 4) {
            C11467l.startapp(this.loadAd, this.crashlytics, ", limit=", "position=");
            return 0;
        }
        int iRemoteconfig = remoteconfig();
        this.loadAd -= 4;
        return iRemoteconfig;
    }

    public final int subscription() {
        int iMetrica = metrica();
        if (iMetrica >= 0) {
            return iMetrica;
        }
        C8339l.smaato(AbstractC0653l.vip(iMetrica, "Top bit not zero: "));
        return 0;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final int m3567synchronized() {
        billing(2);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.loadAd = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final int tapsense() {
        billing(2);
        byte[] bArr = this.yandex;
        int i = this.loadAd;
        int i2 = i + 1;
        this.loadAd = i2;
        int i3 = bArr[i] & 255;
        this.loadAd = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m3568throw(int i) {
        m3562for(this.loadAd + i);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m3569throws() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.loadAd == this.crashlytics) {
                C8339l.smaato("Attempting to read a byte over the limit.");
                return 0;
            }
            long jSignatures = signatures();
            j |= (127 & jSignatures) << (i * 7);
            if ((jSignatures & 128) == 0) {
                break;
            }
        }
        return AbstractC9966l.loadAd(j);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae A[SYNTHETIC] */
    public final String vip(Charset charset) {
        int i;
        byte[] bArr;
        AbstractC12442l.isPro(billing.contains(charset), "Unsupported charset: %s", charset);
        if (yandex() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m3570volatile();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                C1759l.ads(charset, "Unsupported charset: ");
                return null;
            }
            i = 2;
        }
        int i2 = this.loadAd;
        while (true) {
            int i3 = this.crashlytics;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && AbstractC15323l.m3960catch(this.yandex[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.yandex;
                if (bArr2[i2] == 0 && AbstractC15323l.m3960catch(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.yandex;
                    if (bArr[i2 + 1] == 0 && AbstractC15323l.m3960catch(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.yandex;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strAdvert = advert(i2 - this.loadAd, charset);
        if (this.loadAd != this.crashlytics && smaato(charset, amazon) == '\r') {
            smaato(charset, purchase);
        }
        return strAdvert;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final Charset m3570volatile() {
        if (yandex() >= 3) {
            byte[] bArr = this.yandex;
            int i = this.loadAd;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.loadAd = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (yandex() < 2) {
            return null;
        }
        byte[] bArr2 = this.yandex;
        int i2 = this.loadAd;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.loadAd = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.loadAd = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final int yandex() {
        return Math.max(this.crashlytics - this.loadAd, 0);
    }

    public C13143l() {
        this.yandex = AbstractC15323l.loadAd;
    }

    public C13143l(byte[] bArr) {
        this.yandex = bArr;
        this.crashlytics = bArr.length;
    }

    public C13143l(byte[] bArr, int i) {
        this.yandex = bArr;
        this.crashlytics = i;
    }
}
