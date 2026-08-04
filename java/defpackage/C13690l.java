package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: renamed from: lْ۟ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13690l extends AbstractC9284l {
    public final int admob;
    public final byte[] amazon;
    public int billing;
    public int isPro = Alert.DURATION_SHOW_INDEFINITELY;
    public int mopub;
    public int purchase;
    public int subs;

    public C13690l(byte[] bArr, int i, int i2, boolean z) {
        this.amazon = bArr;
        this.purchase = i2 + i;
        this.mopub = i;
        this.admob = i;
    }

    @Override // defpackage.AbstractC9284l
    public final int Signature() throws C5957l {
        if (crashlytics()) {
            this.subs = 0;
            return 0;
        }
        int iM3655break = m3655break();
        this.subs = iM3655break;
        if ((iM3655break >>> 3) != 0) {
            return iM3655break;
        }
        throw new C5957l("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.AbstractC9284l
    public final boolean ad(int i) throws C5957l {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m3656implements(8);
                return true;
            }
            if (i2 == 2) {
                m3656implements(m3655break());
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
            m3656implements(4);
            return true;
        }
        int i4 = this.purchase - this.mopub;
        byte[] bArr = this.amazon;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.mopub;
                this.mopub = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw C5957l.crashlytics();
        }
        while (i3 < 10) {
            int i6 = this.mopub;
            if (i6 == this.purchase) {
                throw C5957l.purchase();
            }
            this.mopub = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw C5957l.crashlytics();
        return true;
    }

    @Override // defpackage.AbstractC9284l
    public final int adcel() {
        int iM3655break = m3655break();
        return (-(iM3655break & 1)) ^ (iM3655break >>> 1);
    }

    @Override // defpackage.AbstractC9284l
    public final double admob() {
        return Double.longBitsToDouble(m3660try());
    }

    @Override // defpackage.AbstractC9284l
    public final long ads() {
        long jM3659transient = m3659transient();
        return (-(jM3659transient & 1)) ^ (jM3659transient >>> 1);
    }

    @Override // defpackage.AbstractC9284l
    public final void amazon(int i) {
        this.isPro = i;
        m3661while();
    }

    @Override // defpackage.AbstractC9284l
    public final boolean billing() {
        return m3659transient() != 0;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final int m3655break() {
        int i;
        int i2 = this.mopub;
        int i3 = this.purchase;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.amazon;
            byte b = bArr[i2];
            if (b >= 0) {
                this.mopub = i4;
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
                this.mopub = i5;
                return i;
            }
        }
        return (int) m3657protected();
    }

    @Override // defpackage.AbstractC9284l
    public final boolean crashlytics() {
        return this.mopub == this.purchase;
    }

    @Override // defpackage.AbstractC9284l
    public final long firebase() {
        return m3660try();
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final void m3656implements(int i) throws C5957l {
        if (i >= 0) {
            int i2 = this.purchase;
            int i3 = this.mopub;
            if (i <= i2 - i3) {
                this.mopub = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw C5957l.purchase();
        }
        throw C5957l.amazon();
    }

    @Override // defpackage.AbstractC9284l
    public final int isPro() {
        return m3658this();
    }

    @Override // defpackage.AbstractC9284l
    public final int license() {
        return m3655break();
    }

    @Override // defpackage.AbstractC9284l
    public final int loadAd() {
        return this.mopub - this.admob;
    }

    @Override // defpackage.AbstractC9284l
    public final int metrica() {
        return m3658this();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // defpackage.AbstractC9284l
    public final C4966l mopub() throws C5957l {
        byte[] bArrCopyOfRange;
        int iM3655break = m3655break();
        byte[] bArr = this.amazon;
        if (iM3655break > 0) {
            int i = this.purchase;
            int i2 = this.mopub;
            if (iM3655break <= i - i2) {
                C4966l c4966lMopub = C4966l.mopub(i2, iM3655break, bArr);
                this.mopub += iM3655break;
                return c4966lMopub;
            }
        }
        if (iM3655break == 0) {
            return C4966l.f10110l;
        }
        if (iM3655break > 0) {
            int i3 = this.purchase;
            int i4 = this.mopub;
            if (iM3655break <= i3 - i4) {
                int i5 = iM3655break + i4;
                this.mopub = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM3655break <= 0) {
                    throw C5957l.purchase();
                }
                if (iM3655break == 0) {
                    throw C5957l.amazon();
                }
                bArrCopyOfRange = AbstractC4579l.loadAd;
            }
        } else {
            if (iM3655break <= 0) {
                throw C5957l.purchase();
            }
            if (iM3655break == 0) {
                throw C5957l.amazon();
            }
            bArrCopyOfRange = AbstractC4579l.loadAd;
        }
        C4966l c4966l = C4966l.f10110l;
        return new C4966l(bArrCopyOfRange);
    }

    @Override // defpackage.AbstractC9284l
    public final long pro() {
        return m3659transient();
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final long m3657protected() throws C5957l {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.mopub;
            if (i2 == this.purchase) {
                throw C5957l.purchase();
            }
            this.mopub = i2 + 1;
            byte b = this.amazon[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw C5957l.crashlytics();
    }

    @Override // defpackage.AbstractC9284l
    public final int purchase(int i) {
        if (i < 0) {
            throw C5957l.amazon();
        }
        int iLoadAd = loadAd() + i;
        if (iLoadAd < 0) {
            throw new C5957l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.isPro;
        if (iLoadAd > i2) {
            throw C5957l.purchase();
        }
        this.isPro = iLoadAd;
        m3661while();
        return i2;
    }

    @Override // defpackage.AbstractC9284l
    public final int remoteconfig() {
        return m3655break();
    }

    @Override // defpackage.AbstractC9284l
    public final float smaato() {
        return Float.intBitsToFloat(m3658this());
    }

    @Override // defpackage.AbstractC9284l
    public final long startapp() {
        return m3660try();
    }

    @Override // defpackage.AbstractC9284l
    public final int subs() {
        return m3655break();
    }

    @Override // defpackage.AbstractC9284l
    public final String subscription() throws C5957l {
        int iM3655break = m3655break();
        if (iM3655break > 0) {
            int i = this.purchase;
            int i2 = this.mopub;
            if (iM3655break <= i - i2) {
                String str = new String(this.amazon, i2, iM3655break, AbstractC4579l.yandex);
                this.mopub += iM3655break;
                return str;
            }
        }
        if (iM3655break == 0) {
            return "";
        }
        if (iM3655break < 0) {
            throw C5957l.amazon();
        }
        throw C5957l.purchase();
    }

    @Override // defpackage.AbstractC9284l
    public final String tapsense() throws C5957l {
        int iM3655break = m3655break();
        if (iM3655break > 0) {
            int i = this.purchase;
            int i2 = this.mopub;
            if (iM3655break <= i - i2) {
                String strCrashlytics = AbstractC14741l.yandex.crashlytics(i2, iM3655break, this.amazon);
                this.mopub += iM3655break;
                return strCrashlytics;
            }
        }
        if (iM3655break == 0) {
            return "";
        }
        if (iM3655break <= 0) {
            throw C5957l.amazon();
        }
        throw C5957l.purchase();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final int m3658this() throws C5957l {
        int i = this.mopub;
        if (this.purchase - i < 4) {
            throw C5957l.purchase();
        }
        this.mopub = i + 4;
        byte[] bArr = this.amazon;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final long m3659transient() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.mopub;
        int i2 = this.purchase;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.amazon;
            byte b = bArr[i];
            if (b >= 0) {
                this.mopub = i3;
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
                this.mopub = i4;
                return j;
            }
        }
        return m3657protected();
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final long m3660try() throws C5957l {
        int i = this.mopub;
        if (this.purchase - i < 8) {
            throw C5957l.purchase();
        }
        this.mopub = i + 8;
        byte[] bArr = this.amazon;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.AbstractC9284l
    public final long vip() {
        return m3659transient();
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final void m3661while() {
        int i = this.purchase + this.billing;
        this.purchase = i;
        int i2 = i - this.admob;
        int i3 = this.isPro;
        if (i2 <= i3) {
            this.billing = 0;
            return;
        }
        int i4 = i2 - i3;
        this.billing = i4;
        this.purchase = i - i4;
    }

    @Override // defpackage.AbstractC9284l
    public final void yandex(int i) throws C5957l {
        if (this.subs != i) {
            throw new C5957l("Protocol message end-group tag did not match expected tag.");
        }
    }
}
