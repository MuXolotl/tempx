package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘّٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12416l extends AbstractC15029l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f24509l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f24510l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f24511l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f24512l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f24513l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f24514l = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f24515l;

    public C12416l(byte[] bArr, int i, int i2, boolean z) {
        this.f24509l = bArr;
        this.f24513l = i2 + i;
        this.f24515l = i;
        this.f24510l = i;
    }

    @Override // defpackage.AbstractC15029l
    public final int ad() {
        return m3380extends();
    }

    @Override // defpackage.AbstractC15029l
    public final int admob() {
        return this.f24515l - this.f24510l;
    }

    @Override // defpackage.AbstractC15029l
    public final int ads(int i) throws C0803l {
        if (i < 0) {
            throw C0803l.purchase();
        }
        int iAdmob = admob() + i;
        if (iAdmob < 0) {
            throw C0803l.billing();
        }
        int i2 = this.f24514l;
        if (iAdmob > i2) {
            throw C0803l.mopub();
        }
        this.f24514l = iAdmob;
        m3377case();
        return i2;
    }

    @Override // defpackage.AbstractC15029l
    public final long advert() {
        return m3381for();
    }

    @Override // defpackage.AbstractC15029l
    public final int applovin() {
        return m3380extends();
    }

    @Override // defpackage.AbstractC15029l
    public final long appmetrica() {
        return m3381for();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m3377case() {
        int i = this.f24513l + this.f24512l;
        this.f24513l = i;
        int i2 = i - this.f24510l;
        int i3 = this.f24514l;
        if (i2 <= i3) {
            this.f24512l = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f24512l = i4;
        this.f24513l = i - i4;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final long m3378catch() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f24515l;
        int i2 = this.f24513l;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f24509l;
            byte b = bArr[i];
            if (b >= 0) {
                this.f24515l = i3;
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
                this.f24515l = i4;
                return j;
            }
        }
        return m3379else();
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final long m3379else() throws C0803l {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f24515l;
            if (i2 == this.f24513l) {
                throw C0803l.mopub();
            }
            this.f24515l = i2 + 1;
            byte b = this.f24509l[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw C0803l.amazon();
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final int m3380extends() throws C0803l {
        int i = this.f24515l;
        if (this.f24513l - i < 4) {
            throw C0803l.mopub();
        }
        this.f24515l = i + 4;
        byte[] bArr = this.f24509l;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final long m3381for() throws C0803l {
        int i = this.f24515l;
        if (this.f24513l - i < 8) {
            throw C0803l.mopub();
        }
        this.f24515l = i + 8;
        byte[] bArr = this.f24509l;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.AbstractC15029l
    public final int inmobi() {
        return AbstractC15029l.amazon(m3382throw());
    }

    @Override // defpackage.AbstractC15029l
    public final float isVip() {
        return Float.intBitsToFloat(m3380extends());
    }

    @Override // defpackage.AbstractC15029l
    public final double license() {
        return Double.longBitsToDouble(m3381for());
    }

    @Override // defpackage.AbstractC15029l
    public final void loadAd(int i) throws C0803l {
        if (this.f24511l != i) {
            throw new C0803l("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: native */
    public final long mo1020native() {
        return m3378catch();
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: package */
    public final String mo1021package() throws C0803l {
        int iM3382throw = m3382throw();
        if (iM3382throw > 0) {
            int i = this.f24513l;
            int i2 = this.f24515l;
            if (iM3382throw <= i - i2) {
                String str = new String(this.f24509l, i2, iM3382throw, AbstractC6320l.yandex);
                this.f24515l += iM3382throw;
                return str;
            }
        }
        if (iM3382throw == 0) {
            return "";
        }
        if (iM3382throw < 0) {
            throw C0803l.purchase();
        }
        throw C0803l.mopub();
    }

    @Override // defpackage.AbstractC15029l
    public final long premium() {
        return m3378catch();
    }

    @Override // defpackage.AbstractC15029l
    public final int pro() {
        return m3382throw();
    }

    @Override // defpackage.AbstractC15029l
    public final int signatures() {
        return m3382throw();
    }

    @Override // defpackage.AbstractC15029l
    public final void startapp(int i) {
        this.f24514l = i;
        m3377case();
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: strictfp */
    public final int mo1023strictfp() throws C0803l {
        if (subs()) {
            this.f24511l = 0;
            return 0;
        }
        int iM3382throw = m3382throw();
        this.f24511l = iM3382throw;
        if ((iM3382throw >>> 3) != 0) {
            return iM3382throw;
        }
        throw C0803l.yandex();
    }

    @Override // defpackage.AbstractC15029l
    public final boolean subs() {
        return this.f24515l == this.f24513l;
    }

    @Override // defpackage.AbstractC15029l
    public final boolean subscription() {
        return m3378catch() != 0;
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: synchronized */
    public final String mo1025synchronized() throws C0803l {
        int iM3382throw = m3382throw();
        if (iM3382throw > 0) {
            int i = this.f24513l;
            int i2 = this.f24515l;
            if (iM3382throw <= i - i2) {
                String strAmazon = AbstractC11523l.yandex.amazon(i2, iM3382throw, this.f24509l);
                this.f24515l += iM3382throw;
                return strAmazon;
            }
        }
        if (iM3382throw == 0) {
            return "";
        }
        if (iM3382throw <= 0) {
            throw C0803l.purchase();
        }
        throw C0803l.mopub();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // defpackage.AbstractC15029l
    public final C15379l tapsense() throws C0803l {
        byte[] bArrCopyOfRange;
        int iM3382throw = m3382throw();
        byte[] bArr = this.f24509l;
        if (iM3382throw > 0) {
            int i = this.f24513l;
            int i2 = this.f24515l;
            if (iM3382throw <= i - i2) {
                C15379l c15379lMopub = AbstractC16071l.mopub(i2, iM3382throw, bArr);
                this.f24515l += iM3382throw;
                return c15379lMopub;
            }
        }
        if (iM3382throw == 0) {
            return AbstractC16071l.f31494l;
        }
        if (iM3382throw > 0) {
            int i3 = this.f24513l;
            int i4 = this.f24515l;
            if (iM3382throw <= i3 - i4) {
                int i5 = iM3382throw + i4;
                this.f24515l = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM3382throw <= 0) {
                    throw C0803l.mopub();
                }
                if (iM3382throw == 0) {
                    throw C0803l.purchase();
                }
                bArrCopyOfRange = AbstractC6320l.loadAd;
            }
        } else {
            if (iM3382throw <= 0) {
                throw C0803l.mopub();
            }
            if (iM3382throw == 0) {
                throw C0803l.purchase();
            }
            bArrCopyOfRange = AbstractC6320l.loadAd;
        }
        C15379l c15379l = AbstractC16071l.f31494l;
        return new C15379l(bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final int m3382throw() {
        int i;
        int i2 = this.f24515l;
        int i3 = this.f24513l;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f24509l;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f24515l = i4;
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
                this.f24515l = i5;
                return i;
            }
        }
        return (int) m3379else();
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: throws */
    public final long mo1027throws() {
        return AbstractC15029l.billing(m3378catch());
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: volatile */
    public final int mo1028volatile() {
        return m3382throw();
    }
}
