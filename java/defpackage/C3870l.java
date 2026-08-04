package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؖؓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3870l extends AbstractC9284l {
    public int admob;
    public final InputStream amazon;
    public int billing;
    public int firebase = Alert.DURATION_SHOW_INDEFINITELY;
    public int isPro;
    public int mopub;
    public final byte[] purchase;
    public int subs;

    public C3870l(InputStream inputStream) {
        AbstractC4579l.yandex(inputStream, "input");
        this.amazon = inputStream;
        this.purchase = new byte[4096];
        this.billing = 0;
        this.admob = 0;
        this.isPro = 0;
    }

    @Override // defpackage.AbstractC9284l
    public final int Signature() throws C5957l {
        if (crashlytics()) {
            this.subs = 0;
            return 0;
        }
        int iM1443while = m1443while();
        this.subs = iM1443while;
        if ((iM1443while >>> 3) != 0) {
            return iM1443while;
        }
        throw new C5957l("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.AbstractC9284l
    public final boolean ad(int i) throws C5957l {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m1435l(8);
                return true;
            }
            if (i2 == 2) {
                m1435l(m1443while());
                return true;
            }
            if (i2 == 3) {
                advert();
                yandex(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.loadAd == 0) {
                    yandex(0);
                }
                return false;
            }
            if (i2 != 5) {
                throw C5957l.loadAd();
            }
            m1435l(4);
            return true;
        }
        int i4 = this.billing - this.admob;
        byte[] bArr = this.purchase;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.admob;
                this.admob = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw C5957l.crashlytics();
        }
        while (i3 < 10) {
            if (this.admob == this.billing) {
                m1437l(1);
            }
            int i6 = this.admob;
            this.admob = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw C5957l.crashlytics();
        return true;
    }

    @Override // defpackage.AbstractC9284l
    public final int adcel() {
        int iM1443while = m1443while();
        return (-(iM1443while & 1)) ^ (iM1443while >>> 1);
    }

    @Override // defpackage.AbstractC9284l
    public final double admob() {
        return Double.longBitsToDouble(m1438protected());
    }

    @Override // defpackage.AbstractC9284l
    public final long ads() {
        long jM1434implements = m1434implements();
        return (-(jM1434implements & 1)) ^ (jM1434implements >>> 1);
    }

    @Override // defpackage.AbstractC9284l
    public final void amazon(int i) {
        this.firebase = i;
        m1439return();
    }

    @Override // defpackage.AbstractC9284l
    public final boolean billing() {
        return m1434implements() != 0;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final ArrayList m1432break(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.amazon.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw C5957l.purchase();
                }
                this.isPro += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final long m1433const() throws C5957l {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.admob == this.billing) {
                m1437l(1);
            }
            int i2 = this.admob;
            this.admob = i2 + 1;
            byte b = this.purchase[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw C5957l.crashlytics();
    }

    @Override // defpackage.AbstractC9284l
    public final boolean crashlytics() {
        return this.admob == this.billing && !m1436l(1);
    }

    @Override // defpackage.AbstractC9284l
    public final long firebase() {
        return m1438protected();
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final long m1434implements() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.admob;
        int i2 = this.billing;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.purchase;
            byte b = bArr[i];
            if (b >= 0) {
                this.admob = i3;
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
                this.admob = i4;
                return j;
            }
        }
        return m1433const();
    }

    @Override // defpackage.AbstractC9284l
    public final int isPro() {
        return m1441transient();
    }

    @Override // defpackage.AbstractC9284l
    public final int license() {
        return m1443while();
    }

    @Override // defpackage.AbstractC9284l
    public final int loadAd() {
        return this.isPro + this.admob;
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final void m1435l(int i) throws C5957l {
        int i2 = this.billing;
        int i3 = this.admob;
        if (i <= i2 - i3 && i >= 0) {
            this.admob = i3 + i;
            return;
        }
        InputStream inputStream = this.amazon;
        if (i < 0) {
            throw C5957l.amazon();
        }
        int i4 = this.isPro;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.firebase;
        if (i6 > i7) {
            m1435l((i7 - i4) - i3);
            throw C5957l.purchase();
        }
        this.isPro = i5;
        int i8 = i2 - i3;
        this.billing = 0;
        this.admob = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (C5957l e) {
                    e.f12562l = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.isPro += i8;
                m1439return();
                throw th;
            }
        }
        this.isPro += i8;
        m1439return();
        if (i8 >= i) {
            return;
        }
        int i9 = this.billing;
        int i10 = i9 - this.admob;
        this.admob = i9;
        m1437l(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.billing;
            if (i11 <= i12) {
                this.admob = i11;
                return;
            } else {
                i10 += i12;
                this.admob = i12;
                m1437l(1);
            }
        }
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final boolean m1436l(int i) throws IOException {
        InputStream inputStream = this.amazon;
        int i2 = this.admob;
        int i3 = i2 + i;
        int i4 = this.billing;
        if (i3 <= i4) {
            C8339l.smaato(AbstractC15560l.tapsense("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.isPro;
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 && i5 + i2 + i <= this.firebase) {
            byte[] bArr = this.purchase;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.isPro += i2;
                this.billing -= i2;
                this.admob = 0;
            }
            int i6 = this.billing;
            try {
                int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Alert.DURATION_SHOW_INDEFINITELY - this.isPro) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.billing += i7;
                    m1439return();
                    if (this.billing >= i || m1436l(i)) {
                        return true;
                    }
                }
            } catch (C5957l e) {
                e.f12562l = true;
                throw e;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final void m1437l(int i) throws C5957l {
        if (m1436l(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.isPro) - this.admob) {
            throw C5957l.purchase();
        }
        throw new C5957l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    @Override // defpackage.AbstractC9284l
    public final int metrica() {
        return m1441transient();
    }

    @Override // defpackage.AbstractC9284l
    public final C4966l mopub() throws IOException {
        int iM1443while = m1443while();
        int i = this.billing;
        int i2 = this.admob;
        int i3 = i - i2;
        byte[] bArr = this.purchase;
        if (iM1443while <= i3 && iM1443while > 0) {
            C4966l c4966lMopub = C4966l.mopub(i2, iM1443while, bArr);
            this.admob += iM1443while;
            return c4966lMopub;
        }
        if (iM1443while == 0) {
            return C4966l.f10110l;
        }
        if (iM1443while < 0) {
            throw C5957l.amazon();
        }
        byte[] bArrM1442try = m1442try(iM1443while);
        if (bArrM1442try != null) {
            return C4966l.mopub(0, bArrM1442try.length, bArrM1442try);
        }
        int i4 = this.admob;
        int i5 = this.billing;
        int length = i5 - i4;
        this.isPro += i5;
        this.admob = 0;
        this.billing = 0;
        ArrayList<byte[]> arrayListM1432break = m1432break(iM1443while - length);
        byte[] bArr2 = new byte[iM1443while];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM1432break) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C4966l c4966l = C4966l.f10110l;
        return new C4966l(bArr2);
    }

    @Override // defpackage.AbstractC9284l
    public final long pro() {
        return m1434implements();
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final long m1438protected() throws C5957l {
        int i = this.admob;
        if (this.billing - i < 8) {
            m1437l(8);
            i = this.admob;
        }
        this.admob = i + 8;
        byte[] bArr = this.purchase;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.AbstractC9284l
    public final int purchase(int i) throws C5957l {
        if (i < 0) {
            throw C5957l.amazon();
        }
        int i2 = this.isPro + this.admob + i;
        if (i2 < 0) {
            throw new C5957l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.firebase;
        if (i2 > i3) {
            throw C5957l.purchase();
        }
        this.firebase = i2;
        m1439return();
        return i3;
    }

    @Override // defpackage.AbstractC9284l
    public final int remoteconfig() {
        return m1443while();
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final void m1439return() {
        int i = this.billing + this.mopub;
        this.billing = i;
        int i2 = this.isPro + i;
        int i3 = this.firebase;
        if (i2 <= i3) {
            this.mopub = 0;
            return;
        }
        int i4 = i2 - i3;
        this.mopub = i4;
        this.billing = i - i4;
    }

    @Override // defpackage.AbstractC9284l
    public final float smaato() {
        return Float.intBitsToFloat(m1441transient());
    }

    @Override // defpackage.AbstractC9284l
    public final long startapp() {
        return m1438protected();
    }

    @Override // defpackage.AbstractC9284l
    public final int subs() {
        return m1443while();
    }

    @Override // defpackage.AbstractC9284l
    public final String subscription() throws C5957l {
        int iM1443while = m1443while();
        byte[] bArr = this.purchase;
        if (iM1443while > 0) {
            int i = this.billing;
            int i2 = this.admob;
            if (iM1443while <= i - i2) {
                String str = new String(bArr, i2, iM1443while, AbstractC4579l.yandex);
                this.admob += iM1443while;
                return str;
            }
        }
        if (iM1443while == 0) {
            return "";
        }
        if (iM1443while < 0) {
            throw C5957l.amazon();
        }
        if (iM1443while > this.billing) {
            return new String(m1440this(iM1443while), AbstractC4579l.yandex);
        }
        m1437l(iM1443while);
        String str2 = new String(bArr, this.admob, iM1443while, AbstractC4579l.yandex);
        this.admob += iM1443while;
        return str2;
    }

    @Override // defpackage.AbstractC9284l
    public final String tapsense() throws IOException {
        int iM1443while = m1443while();
        int i = this.admob;
        int i2 = this.billing;
        int i3 = i2 - i;
        byte[] bArrM1440this = this.purchase;
        if (iM1443while <= i3 && iM1443while > 0) {
            this.admob = i + iM1443while;
        } else {
            if (iM1443while == 0) {
                return "";
            }
            if (iM1443while < 0) {
                throw C5957l.amazon();
            }
            i = 0;
            if (iM1443while <= i2) {
                m1437l(iM1443while);
                this.admob = iM1443while;
            } else {
                bArrM1440this = m1440this(iM1443while);
            }
        }
        return AbstractC14741l.yandex.crashlytics(i, iM1443while, bArrM1440this);
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final byte[] m1440this(int i) throws IOException {
        byte[] bArrM1442try = m1442try(i);
        if (bArrM1442try != null) {
            return bArrM1442try;
        }
        int i2 = this.admob;
        int i3 = this.billing;
        int length = i3 - i2;
        this.isPro += i3;
        this.admob = 0;
        this.billing = 0;
        ArrayList<byte[]> arrayListM1432break = m1432break(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.purchase, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM1432break) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final int m1441transient() throws C5957l {
        int i = this.admob;
        if (this.billing - i < 4) {
            m1437l(4);
            i = this.admob;
        }
        this.admob = i + 4;
        byte[] bArr = this.purchase;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final byte[] m1442try(int i) throws IOException {
        if (i == 0) {
            return AbstractC4579l.loadAd;
        }
        if (i < 0) {
            throw C5957l.amazon();
        }
        int i2 = this.isPro;
        int i3 = this.admob;
        int i4 = i2 + i3 + i;
        if (i4 - Alert.DURATION_SHOW_INDEFINITELY > 0) {
            throw new C5957l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.firebase;
        if (i4 > i5) {
            m1435l((i5 - i2) - i3);
            throw C5957l.purchase();
        }
        int i6 = this.billing - i3;
        int i7 = i - i6;
        InputStream inputStream = this.amazon;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (C5957l e) {
                e.f12562l = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.purchase, this.admob, bArr, 0, i6);
        this.isPro += this.billing;
        this.admob = 0;
        this.billing = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw C5957l.purchase();
                }
                this.isPro += i8;
                i6 += i8;
            } catch (C5957l e2) {
                e2.f12562l = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // defpackage.AbstractC9284l
    public final long vip() {
        return m1434implements();
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final int m1443while() {
        int i;
        int i2 = this.admob;
        int i3 = this.billing;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.purchase;
            byte b = bArr[i2];
            if (b >= 0) {
                this.admob = i4;
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
                this.admob = i5;
                return i;
            }
        }
        return (int) m1433const();
    }

    @Override // defpackage.AbstractC9284l
    public final void yandex(int i) throws C5957l {
        if (this.subs != i) {
            throw new C5957l("Protocol message end-group tag did not match expected tag.");
        }
    }
}
