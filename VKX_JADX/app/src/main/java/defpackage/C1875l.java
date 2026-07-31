package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: lٖؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1875l extends AbstractC9284l {
    public int admob;
    public final byte[] amazon;
    public int billing;
    public int subs = Alert.DURATION_SHOW_INDEFINITELY;
    public int purchase = 0;
    public int mopub = 0;

    public /* synthetic */ C1875l(byte[] bArr) {
        this.amazon = bArr;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final int mo1067abstract() {
        return AbstractC9284l.m2631strictfp(m1086protected());
    }

    @Override // defpackage.AbstractC9284l
    public final boolean applovin() {
        return this.mopub == this.purchase;
    }

    @Override // defpackage.AbstractC9284l
    public final int appmetrica() {
        return this.mopub;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final long m1068break() throws C9893l {
        int i = this.mopub;
        if (this.purchase - i < 8) {
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.mopub = i + 8;
        byte[] bArr = this.amazon;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final int mo1069case() {
        return m1086protected();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final long mo1070catch() {
        return mo1077finally();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final boolean mo1071class() {
        return mo1077finally() != 0;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final int mo1072continue() {
        return m1095try();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final C2530l mo1073default() throws C9893l {
        int iM1086protected = m1086protected();
        if (iM1086protected > 0) {
            int i = this.purchase;
            int i2 = this.mopub;
            if (iM1086protected <= i - i2) {
                C2530l c2530lMetrica = AbstractC15619l.metrica(i2, iM1086protected, this.amazon);
                this.mopub += iM1086protected;
                return c2530lMetrica;
            }
        }
        if (iM1086protected == 0) {
            return AbstractC15619l.f30516l;
        }
        byte[] bArrM1094transient = m1094transient(iM1086protected);
        C2530l c2530l = AbstractC15619l.f30516l;
        return bArrM1094transient.length == 0 ? AbstractC15619l.f30516l : new C2530l(bArrM1094transient);
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final long mo1074else() {
        return mo1077finally();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final boolean mo1075extends(int i) throws C9893l {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                mo1093throws(8);
                return true;
            }
            if (i2 == 2) {
                mo1093throws(m1086protected());
                return true;
            }
            if (i2 == 3) {
                m2633synchronized();
                mo1085private(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.loadAd == 0) {
                    mo1085private(0);
                }
                return false;
            }
            if (i2 == 5) {
                mo1093throws(4);
                return true;
            }
            C11586l.mopub();
            return false;
        }
        int i3 = this.purchase - this.mopub;
        byte[] bArr = this.amazon;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.mopub;
                this.mopub = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            C11586l.admob("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            int i7 = this.mopub;
            if (i7 == this.purchase) {
                C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.mopub = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        C11586l.admob("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final byte[] mo1076final() {
        return m1094transient(m1086protected());
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final long mo1077finally() {
        long j;
        long j2;
        long j3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i8]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (((long) bArr[i6]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (((long) bArr[i6]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (((long) bArr[i6]) << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.mopub = i4;
                return j;
            }
        }
        return m1091this();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final double mo1078for() {
        return Double.longBitsToDouble(m1068break());
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final int mo1079goto() {
        return m1086protected();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final long mo1080import() {
        return m1068break();
    }

    @Override // defpackage.AbstractC9284l
    public final int inmobi(int i, int i2, byte[] bArr) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, this.purchase - this.mopub);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.amazon, this.mopub, bArr, i, iMin);
        this.mopub += iMin;
        return iMin;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final long mo1081instanceof() {
        return AbstractC9284l.m2632volatile(mo1077finally());
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final String mo1082interface() throws C9893l {
        int iM1086protected = m1086protected();
        if (iM1086protected > 0) {
            int i = this.purchase;
            int i2 = this.mopub;
            if (iM1086protected <= i - i2) {
                String str = new String(this.amazon, i2, iM1086protected, StandardCharsets.UTF_8);
                this.mopub += iM1086protected;
                return str;
            }
        }
        if (iM1086protected == 0) {
            return "";
        }
        if (iM1086protected < 0) {
            C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.AbstractC9284l
    public final int isVip(int i) throws C9893l {
        if (i < 0) {
            C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = i + this.mopub;
        if (i2 < 0) {
            C11586l.admob("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.subs;
        if (i2 > i3) {
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.subs = i2;
        int i4 = this.purchase + this.billing;
        this.purchase = i4;
        if (i4 <= i2) {
            this.billing = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.billing = i5;
        this.purchase = i4 - i5;
        return i3;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final int mo1083native() throws C9893l {
        if (applovin()) {
            this.admob = 0;
            return 0;
        }
        int iM1086protected = m1086protected();
        this.admob = iM1086protected;
        if ((iM1086protected >>> 3) != 0) {
            return iM1086protected;
        }
        C11586l.admob("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final int mo1084new() {
        return m1086protected();
    }

    @Override // defpackage.AbstractC9284l
    public final int premium() {
        int i = this.subs;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.mopub;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void mo1085private(int i) throws C9893l {
        if (this.admob == i) {
            return;
        }
        C11586l.admob("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final int m1086protected() {
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
        return (int) m1091this();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final int mo1087public() {
        return m1086protected();
    }

    @Override // defpackage.AbstractC9284l
    public final void signatures(int i) {
        this.subs = i;
        int i2 = this.purchase + this.billing;
        this.purchase = i2;
        if (i2 <= i) {
            this.billing = 0;
            return;
        }
        int i3 = i2 - i;
        this.billing = i3;
        this.purchase = i2 - i3;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final String mo1088static() throws C9893l {
        int iM1086protected = m1086protected();
        if (iM1086protected > 0) {
            int i = this.purchase;
            int i2 = this.mopub;
            if (iM1086protected <= i - i2) {
                String strAmazon = AbstractC13388l.amazon(i2, iM1086protected, this.amazon);
                this.mopub += iM1086protected;
                return strAmazon;
            }
        }
        if (iM1086protected == 0) {
            return "";
        }
        if (iM1086protected <= 0) {
            C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final int mo1089super() {
        return m1095try();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final long mo1090switch() {
        return m1068break();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final long m1091this() throws C9893l {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.mopub;
            if (i2 == this.purchase) {
                C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.mopub = i2 + 1;
            byte b = this.amazon[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        C11586l.admob("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final float mo1092throw() {
        return Float.intBitsToFloat(m1095try());
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void mo1093throws(int i) throws C9893l {
        if (i >= 0) {
            int i2 = this.purchase;
            int i3 = this.mopub;
            if (i <= i2 - i3) {
                this.mopub = i3 + i;
                return;
            }
        }
        if (i < 0) {
            C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final byte[] m1094transient(int i) throws C9893l {
        if (i > 0) {
            int i2 = this.purchase;
            int i3 = this.mopub;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.mopub = i4;
                return Arrays.copyOfRange(this.amazon, i3, i4);
            }
        }
        if (i > 0) {
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        if (i == 0) {
            return AbstractC16728l.yandex;
        }
        C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final int m1095try() throws C9893l {
        int i = this.mopub;
        if (this.purchase - i < 4) {
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.mopub = i + 4;
        byte[] bArr = this.amazon;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }
}
