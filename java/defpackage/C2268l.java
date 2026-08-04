package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2268l extends AbstractC15029l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f4948l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f4949l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f4950l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f4951l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f4952l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f4953l = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f4954l;

    public C2268l(byte[] bArr, int i, int i2, boolean z) {
        this.f4948l = bArr;
        this.f4952l = i2 + i;
        this.f4954l = i;
        this.f4949l = i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // defpackage.AbstractC15029l
    public final C14809l Signature() throws C2297l {
        byte[] bArrCopyOfRange;
        int iM1125throw = m1125throw();
        byte[] bArr = this.f4948l;
        if (iM1125throw > 0) {
            int i = this.f4952l;
            int i2 = this.f4954l;
            if (iM1125throw <= i - i2) {
                C14809l c14809lMopub = AbstractC15257l.mopub(i2, iM1125throw, bArr);
                this.f4954l += iM1125throw;
                return c14809lMopub;
            }
        }
        if (iM1125throw == 0) {
            return AbstractC15257l.f29847l;
        }
        if (iM1125throw > 0) {
            int i3 = this.f4952l;
            int i4 = this.f4954l;
            if (iM1125throw <= i3 - i4) {
                int i5 = iM1125throw + i4;
                this.f4954l = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM1125throw <= 0) {
                    throw C2297l.mopub();
                }
                if (iM1125throw == 0) {
                    throw C2297l.purchase();
                }
                bArrCopyOfRange = AbstractC6061l.loadAd;
            }
        } else {
            if (iM1125throw <= 0) {
                throw C2297l.mopub();
            }
            if (iM1125throw == 0) {
                throw C2297l.purchase();
            }
            bArrCopyOfRange = AbstractC6061l.loadAd;
        }
        C14809l c14809l = AbstractC15257l.f29847l;
        return new C14809l(bArrCopyOfRange);
    }

    @Override // defpackage.AbstractC15029l
    public final int ad() {
        return m1123extends();
    }

    @Override // defpackage.AbstractC15029l
    public final int admob() {
        return this.f4954l - this.f4949l;
    }

    @Override // defpackage.AbstractC15029l
    public final int ads(int i) throws C2297l {
        if (i < 0) {
            throw C2297l.purchase();
        }
        int iAdmob = admob() + i;
        if (iAdmob < 0) {
            throw new C2297l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.f4953l;
        if (iAdmob > i2) {
            throw C2297l.mopub();
        }
        this.f4953l = iAdmob;
        m1120case();
        return i2;
    }

    @Override // defpackage.AbstractC15029l
    public final long advert() {
        return m1124for();
    }

    @Override // defpackage.AbstractC15029l
    public final int applovin() {
        return m1123extends();
    }

    @Override // defpackage.AbstractC15029l
    public final long appmetrica() {
        return m1124for();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m1120case() {
        int i = this.f4952l + this.f4951l;
        this.f4952l = i;
        int i2 = i - this.f4949l;
        int i3 = this.f4953l;
        if (i2 <= i3) {
            this.f4951l = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f4951l = i4;
        this.f4952l = i - i4;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final long m1121catch() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f4954l;
        int i2 = this.f4952l;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f4948l;
            byte b = bArr[i];
            if (b >= 0) {
                this.f4954l = i3;
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
                this.f4954l = i4;
                return j;
            }
        }
        return m1122else();
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final long m1122else() throws C2297l {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f4954l;
            if (i2 == this.f4952l) {
                throw C2297l.mopub();
            }
            this.f4954l = i2 + 1;
            byte b = this.f4948l[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw C2297l.amazon();
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final int m1123extends() throws C2297l {
        int i = this.f4954l;
        if (this.f4952l - i < 4) {
            throw C2297l.mopub();
        }
        this.f4954l = i + 4;
        byte[] bArr = this.f4948l;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final long m1124for() throws C2297l {
        int i = this.f4954l;
        if (this.f4952l - i < 8) {
            throw C2297l.mopub();
        }
        this.f4954l = i + 8;
        byte[] bArr = this.f4948l;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.AbstractC15029l
    public final int inmobi() {
        return AbstractC15029l.purchase(m1125throw());
    }

    @Override // defpackage.AbstractC15029l
    public final float isVip() {
        return Float.intBitsToFloat(m1123extends());
    }

    @Override // defpackage.AbstractC15029l
    public final double license() {
        return Double.longBitsToDouble(m1124for());
    }

    @Override // defpackage.AbstractC15029l
    public final void loadAd(int i) throws C2297l {
        if (this.f4950l != i) {
            throw new C2297l("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: native */
    public final long mo1020native() {
        return m1121catch();
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: package */
    public final String mo1021package() throws C2297l {
        int iM1125throw = m1125throw();
        if (iM1125throw > 0) {
            int i = this.f4952l;
            int i2 = this.f4954l;
            if (iM1125throw <= i - i2) {
                String str = new String(this.f4948l, i2, iM1125throw, AbstractC6061l.yandex);
                this.f4954l += iM1125throw;
                return str;
            }
        }
        if (iM1125throw == 0) {
            return "";
        }
        if (iM1125throw < 0) {
            throw C2297l.purchase();
        }
        throw C2297l.mopub();
    }

    @Override // defpackage.AbstractC15029l
    public final long premium() {
        return m1121catch();
    }

    @Override // defpackage.AbstractC15029l
    public final int pro() {
        return m1125throw();
    }

    @Override // defpackage.AbstractC15029l
    public final int signatures() {
        return m1125throw();
    }

    @Override // defpackage.AbstractC15029l
    public final void startapp(int i) {
        this.f4953l = i;
        m1120case();
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: strictfp */
    public final int mo1023strictfp() throws C2297l {
        if (subs()) {
            this.f4950l = 0;
            return 0;
        }
        int iM1125throw = m1125throw();
        this.f4950l = iM1125throw;
        if ((iM1125throw >>> 3) != 0) {
            return iM1125throw;
        }
        throw C2297l.yandex();
    }

    @Override // defpackage.AbstractC15029l
    public final boolean subs() {
        return this.f4954l == this.f4952l;
    }

    @Override // defpackage.AbstractC15029l
    public final boolean subscription() {
        return m1121catch() != 0;
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: synchronized */
    public final String mo1025synchronized() throws C2297l {
        int iM1125throw = m1125throw();
        if (iM1125throw > 0) {
            int i = this.f4952l;
            int i2 = this.f4954l;
            if (iM1125throw <= i - i2) {
                String strPurchase = AbstractC3472l.yandex.purchase(i2, iM1125throw, this.f4948l);
                this.f4954l += iM1125throw;
                return strPurchase;
            }
        }
        if (iM1125throw == 0) {
            return "";
        }
        if (iM1125throw <= 0) {
            throw C2297l.purchase();
        }
        throw C2297l.mopub();
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final int m1125throw() {
        int i;
        int i2 = this.f4954l;
        int i3 = this.f4952l;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f4948l;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f4954l = i4;
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
                this.f4954l = i5;
                return i;
            }
        }
        return (int) m1122else();
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: throws */
    public final long mo1027throws() {
        return AbstractC15029l.mopub(m1121catch());
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: volatile */
    public final int mo1028volatile() {
        return m1125throw();
    }
}
