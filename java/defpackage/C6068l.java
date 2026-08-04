package defpackage;

import androidx.car.app.model.Alert;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؘۤؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6068l extends AbstractC15029l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ByteArrayInputStream f12837l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f12838l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f12839l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f12840l = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f12841l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f12842l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f12843l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f12844l;

    public C6068l(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = AbstractC6061l.yandex;
        this.f12837l = byteArrayInputStream;
        this.f12842l = new byte[4096];
        this.f12841l = 0;
        this.f12838l = 0;
        this.f12843l = 0;
    }

    @Override // defpackage.AbstractC15029l
    public final C14809l Signature() throws IOException {
        int iM1926case = m1926case();
        int i = this.f12841l;
        int i2 = this.f12838l;
        int i3 = i - i2;
        byte[] bArr = this.f12842l;
        if (iM1926case <= i3 && iM1926case > 0) {
            C14809l c14809lMopub = AbstractC15257l.mopub(i2, iM1926case, bArr);
            this.f12838l += iM1926case;
            return c14809lMopub;
        }
        if (iM1926case == 0) {
            return AbstractC15257l.f29847l;
        }
        if (iM1926case < 0) {
            throw C2297l.purchase();
        }
        byte[] bArrM1933for = m1933for(iM1926case);
        if (bArrM1933for != null) {
            return AbstractC15257l.mopub(0, bArrM1933for.length, bArrM1933for);
        }
        int i4 = this.f12838l;
        int i5 = this.f12841l;
        int length = i5 - i4;
        this.f12843l += i5;
        this.f12838l = 0;
        this.f12841l = 0;
        ArrayList<byte[]> arrayListM1937throw = m1937throw(iM1926case - length);
        byte[] bArr2 = new byte[iM1926case];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM1937throw) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C14809l c14809l = AbstractC15257l.f29847l;
        return new C14809l(bArr2);
    }

    @Override // defpackage.AbstractC15029l
    public final int ad() {
        return m1927catch();
    }

    @Override // defpackage.AbstractC15029l
    public final int admob() {
        return this.f12843l + this.f12838l;
    }

    @Override // defpackage.AbstractC15029l
    public final int ads(int i) throws C2297l {
        if (i < 0) {
            throw C2297l.purchase();
        }
        int i2 = this.f12843l + this.f12838l + i;
        if (i2 < 0) {
            throw new C2297l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.f12840l;
        if (i2 > i3) {
            throw C2297l.mopub();
        }
        this.f12840l = i2;
        m1928class();
        return i3;
    }

    @Override // defpackage.AbstractC15029l
    public final long advert() {
        return m1931else();
    }

    @Override // defpackage.AbstractC15029l
    public final int applovin() {
        return m1927catch();
    }

    @Override // defpackage.AbstractC15029l
    public final long appmetrica() {
        return m1931else();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final int m1926case() {
        int i;
        int i2 = this.f12838l;
        int i3 = this.f12841l;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f12842l;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f12838l = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f12838l = i5;
                return i;
            }
        }
        return (int) m1929continue();
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final int m1927catch() throws C2297l {
        int i = this.f12838l;
        if (this.f12841l - i < 4) {
            m1934interface(4);
            i = this.f12838l;
        }
        this.f12838l = i + 4;
        byte[] bArr = this.f12842l;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void m1928class() {
        int i = this.f12841l + this.f12844l;
        this.f12841l = i;
        int i2 = this.f12843l + i;
        int i3 = this.f12840l;
        if (i2 <= i3) {
            this.f12844l = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f12844l = i4;
        this.f12841l = i - i4;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final long m1929continue() throws C2297l {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f12838l == this.f12841l) {
                m1934interface(1);
            }
            int i2 = this.f12838l;
            this.f12838l = i2 + 1;
            byte b = this.f12842l[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw C2297l.amazon();
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final boolean m1930default(int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f12837l;
        int i2 = this.f12838l;
        int i3 = i2 + i;
        int i4 = this.f12841l;
        if (i3 <= i4) {
            C8339l.smaato(AbstractC15560l.tapsense("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.f12843l;
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 && i5 + i2 + i <= this.f12840l) {
            byte[] bArr = this.f12842l;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f12843l += i2;
                this.f12841l -= i2;
                this.f12838l = 0;
            }
            int i6 = this.f12841l;
            try {
                int i7 = byteArrayInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Alert.DURATION_SHOW_INDEFINITELY - this.f12843l) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(String.valueOf(byteArrayInputStream.getClass()) + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f12841l += i7;
                    m1928class();
                    if (this.f12841l >= i || m1930default(i)) {
                        return true;
                    }
                }
            } catch (C2297l e) {
                e.f4988l = true;
                throw e;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final long m1931else() throws C2297l {
        int i = this.f12838l;
        if (this.f12841l - i < 8) {
            m1934interface(8);
            i = this.f12838l;
        }
        this.f12838l = i + 8;
        byte[] bArr = this.f12842l;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final byte[] m1932extends(int i) throws IOException {
        byte[] bArrM1933for = m1933for(i);
        if (bArrM1933for != null) {
            return bArrM1933for;
        }
        int i2 = this.f12838l;
        int i3 = this.f12841l;
        int length = i3 - i2;
        this.f12843l += i3;
        this.f12838l = 0;
        this.f12841l = 0;
        ArrayList<byte[]> arrayListM1937throw = m1937throw(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f12842l, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM1937throw) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final byte[] m1933for(int i) throws IOException {
        if (i == 0) {
            return AbstractC6061l.loadAd;
        }
        if (i < 0) {
            throw C2297l.purchase();
        }
        int i2 = this.f12843l;
        int i3 = this.f12838l;
        int i4 = i2 + i3 + i;
        if (i4 - Alert.DURATION_SHOW_INDEFINITELY > 0) {
            throw new C2297l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.f12840l;
        if (i4 > i5) {
            m1935static((i5 - i2) - i3);
            throw C2297l.mopub();
        }
        int i6 = this.f12841l - i3;
        int i7 = i - i6;
        ByteArrayInputStream byteArrayInputStream = this.f12837l;
        if (i7 >= 4096) {
            try {
                if (i7 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (C2297l e) {
                e.f4988l = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f12842l, this.f12838l, bArr, 0, i6);
        this.f12843l += this.f12841l;
        this.f12838l = 0;
        this.f12841l = 0;
        while (i6 < i) {
            try {
                int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw C2297l.mopub();
                }
                this.f12843l += i8;
                i6 += i8;
            } catch (C2297l e2) {
                e2.f4988l = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // defpackage.AbstractC15029l
    public final int inmobi() {
        return AbstractC15029l.purchase(m1926case());
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final void m1934interface(int i) throws C2297l {
        if (m1930default(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.f12843l) - this.f12838l) {
            throw C2297l.mopub();
        }
        throw new C2297l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    @Override // defpackage.AbstractC15029l
    public final float isVip() {
        return Float.intBitsToFloat(m1927catch());
    }

    @Override // defpackage.AbstractC15029l
    public final double license() {
        return Double.longBitsToDouble(m1931else());
    }

    @Override // defpackage.AbstractC15029l
    public final void loadAd(int i) throws C2297l {
        if (this.f12839l != i) {
            throw new C2297l("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: native */
    public final long mo1020native() {
        return m1936switch();
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: package */
    public final String mo1021package() throws C2297l {
        int iM1926case = m1926case();
        byte[] bArr = this.f12842l;
        if (iM1926case > 0) {
            int i = this.f12841l;
            int i2 = this.f12838l;
            if (iM1926case <= i - i2) {
                String str = new String(bArr, i2, iM1926case, AbstractC6061l.yandex);
                this.f12838l += iM1926case;
                return str;
            }
        }
        if (iM1926case == 0) {
            return "";
        }
        if (iM1926case < 0) {
            throw C2297l.purchase();
        }
        if (iM1926case > this.f12841l) {
            return new String(m1932extends(iM1926case), AbstractC6061l.yandex);
        }
        m1934interface(iM1926case);
        String str2 = new String(bArr, this.f12838l, iM1926case, AbstractC6061l.yandex);
        this.f12838l += iM1926case;
        return str2;
    }

    @Override // defpackage.AbstractC15029l
    public final long premium() {
        return m1936switch();
    }

    @Override // defpackage.AbstractC15029l
    public final int pro() {
        return m1926case();
    }

    @Override // defpackage.AbstractC15029l
    public final int signatures() {
        return m1926case();
    }

    @Override // defpackage.AbstractC15029l
    public final void startapp(int i) {
        this.f12840l = i;
        m1928class();
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final void m1935static(int i) throws C2297l {
        int i2 = this.f12841l;
        int i3 = this.f12838l;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f12838l = i3 + i;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f12837l;
        if (i < 0) {
            throw C2297l.purchase();
        }
        int i5 = this.f12843l;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f12840l;
        if (i7 > i8) {
            m1935static((i8 - i5) - i3);
            throw C2297l.mopub();
        }
        this.f12843l = i6;
        this.f12841l = 0;
        this.f12838l = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(byteArrayInputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (C2297l e) {
                    e.f4988l = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f12843l += i4;
                m1928class();
                throw th;
            }
        }
        this.f12843l += i4;
        m1928class();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f12841l;
        int i10 = i9 - this.f12838l;
        this.f12838l = i9;
        m1934interface(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f12841l;
            if (i11 <= i12) {
                this.f12838l = i11;
                return;
            } else {
                i10 += i12;
                this.f12838l = i12;
                m1934interface(1);
            }
        }
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: strictfp */
    public final int mo1023strictfp() throws C2297l {
        if (subs()) {
            this.f12839l = 0;
            return 0;
        }
        int iM1926case = m1926case();
        this.f12839l = iM1926case;
        if ((iM1926case >>> 3) != 0) {
            return iM1926case;
        }
        throw C2297l.yandex();
    }

    @Override // defpackage.AbstractC15029l
    public final boolean subs() {
        return this.f12838l == this.f12841l && !m1930default(1);
    }

    @Override // defpackage.AbstractC15029l
    public final boolean subscription() {
        return m1936switch() != 0;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final long m1936switch() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f12838l;
        int i2 = this.f12841l;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f12842l;
            byte b = bArr[i];
            if (b >= 0) {
                this.f12838l = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f12838l = i4;
                return j;
            }
        }
        return m1929continue();
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: synchronized */
    public final String mo1025synchronized() throws IOException {
        int iM1926case = m1926case();
        int i = this.f12838l;
        int i2 = this.f12841l;
        int i3 = i2 - i;
        byte[] bArrM1932extends = this.f12842l;
        if (iM1926case <= i3 && iM1926case > 0) {
            this.f12838l = i + iM1926case;
        } else {
            if (iM1926case == 0) {
                return "";
            }
            if (iM1926case < 0) {
                throw C2297l.purchase();
            }
            i = 0;
            if (iM1926case <= i2) {
                m1934interface(iM1926case);
                this.f12838l = iM1926case;
            } else {
                bArrM1932extends = m1932extends(iM1926case);
            }
        }
        return AbstractC3472l.yandex.purchase(i, iM1926case, bArrM1932extends);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final ArrayList m1937throw(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f12837l.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw C2297l.mopub();
                }
                this.f12843l += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: throws */
    public final long mo1027throws() {
        return AbstractC15029l.mopub(m1936switch());
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: volatile */
    public final int mo1028volatile() {
        return m1926case();
    }
}
