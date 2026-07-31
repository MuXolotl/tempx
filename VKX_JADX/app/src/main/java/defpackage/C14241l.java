package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lٓٚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14241l extends AbstractC9284l {
    public int admob;
    public final InputStream amazon;
    public int billing;
    public int firebase = Alert.DURATION_SHOW_INDEFINITELY;
    public int isPro;
    public int mopub;
    public final byte[] purchase;
    public int subs;

    public /* synthetic */ C14241l(InputStream inputStream, int i) {
        this.amazon = inputStream;
        this.purchase = new byte[i < 8 ? 8 : i];
        this.billing = 0;
        this.admob = 0;
        this.isPro = 0;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: abstract */
    public final int mo1067abstract() {
        return AbstractC9284l.m2631strictfp(mo1087public());
    }

    @Override // defpackage.AbstractC9284l
    public final boolean applovin() {
        return this.admob == this.billing && !m3837break(1);
    }

    @Override // defpackage.AbstractC9284l
    public final int appmetrica() {
        return this.isPro + this.admob;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final boolean m3837break(int i) throws IOException {
        InputStream inputStream = this.amazon;
        int i2 = this.admob;
        int i3 = i2 + i;
        int i4 = this.billing;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i5 = this.isPro;
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 && i5 + i2 + i <= this.firebase) {
            byte[] bArr = this.purchase;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.isPro + i2;
                this.isPro = i5;
                i4 = this.billing - i2;
                this.billing = i4;
                this.admob = 0;
            }
            try {
                int i6 = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Alert.DURATION_SHOW_INDEFINITELY - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    String strValueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + strValueOf.length() + 39 + 41);
                    sb2.append(strValueOf);
                    sb2.append("#read(byte[]) returned invalid result: ");
                    sb2.append(i6);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                }
                if (i6 > 0) {
                    this.billing += i6;
                    m3842this();
                    if (this.billing >= i || m3837break(i)) {
                        return true;
                    }
                }
            } catch (C9893l e) {
                e.f20129l = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: case */
    public final int mo1069case() {
        return mo1087public();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: catch */
    public final long mo1070catch() {
        return mo1077finally();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: class */
    public final boolean mo1071class() {
        return mo1077finally() != 0;
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final int m3838const() throws C9893l {
        int i = this.admob;
        if (this.billing - i < 4) {
            m3844try(4);
            i = this.admob;
        }
        this.admob = i + 4;
        byte[] bArr = this.purchase;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: continue */
    public final int mo1072continue() {
        return m3838const();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: default */
    public final C2530l mo1073default() throws IOException {
        int iMo1087public = mo1087public();
        int i = this.billing;
        int i2 = this.admob;
        int i3 = i - i2;
        byte[] bArr = this.purchase;
        if (iMo1087public <= i3 && iMo1087public > 0) {
            C2530l c2530lMetrica = AbstractC15619l.metrica(i2, iMo1087public, bArr);
            this.admob += iMo1087public;
            return c2530lMetrica;
        }
        if (iMo1087public == 0) {
            return AbstractC15619l.f30516l;
        }
        if (iMo1087public < 0) {
            C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] bArrM3840protected = m3840protected(iMo1087public);
        if (bArrM3840protected != null) {
            return AbstractC15619l.metrica(0, bArrM3840protected.length, bArrM3840protected);
        }
        int i4 = this.admob;
        int i5 = this.billing;
        int i6 = i5 - i4;
        this.isPro += i5;
        this.admob = 0;
        this.billing = 0;
        ArrayList<byte[]> arrayListM3845while = m3845while(iMo1087public - i6);
        byte[] bArr2 = new byte[iMo1087public];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        for (byte[] bArr3 : arrayListM3845while) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        try {
            C2530l c2530l = AbstractC15619l.f30516l;
            return iMo1087public == 0 ? AbstractC15619l.f30516l : new C2530l(bArr2);
        } catch (C9893l e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: else */
    public final long mo1074else() {
        return mo1077finally();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: extends */
    public final boolean mo1075extends(int i) throws C9893l {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                mo1093throws(8);
                return true;
            }
            if (i2 == 2) {
                mo1093throws(mo1087public());
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
        int i3 = this.billing - this.admob;
        byte[] bArr = this.purchase;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.admob;
                this.admob = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            C11586l.admob("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.admob == this.billing) {
                m3844try(1);
            }
            int i7 = this.admob;
            this.admob = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        C11586l.admob("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: final */
    public final byte[] mo1076final() throws C9893l {
        int iMo1087public = mo1087public();
        int i = this.billing;
        int i2 = this.admob;
        if (iMo1087public <= i - i2 && iMo1087public > 0) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.purchase, i2, i2 + iMo1087public);
            this.admob += iMo1087public;
            return bArrCopyOfRange;
        }
        if (iMo1087public >= 0) {
            return m3843transient(iMo1087public);
        }
        C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: finally */
    public final long mo1077finally() {
        long j;
        long j2;
        long j3;
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
                this.admob = i4;
                return j;
            }
        }
        return m3839implements();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: for */
    public final double mo1078for() {
        return Double.longBitsToDouble(m3841return());
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: goto */
    public final int mo1079goto() {
        return mo1087public();
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final long m3839implements() throws C9893l {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.admob == this.billing) {
                m3844try(1);
            }
            int i2 = this.admob;
            this.admob = i2 + 1;
            byte b = this.purchase[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        C11586l.admob("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: import */
    public final long mo1080import() {
        return m3841return();
    }

    @Override // defpackage.AbstractC9284l
    public final int inmobi(int i, int i2, byte[] bArr) throws IOException {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.billing;
        int i4 = this.admob;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int iMin = Math.min(i2, i5);
            System.arraycopy(this.purchase, this.admob, bArr, i, iMin);
            this.admob += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i2, (this.firebase - this.isPro) - i4);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i6 = this.amazon.read(bArr, i, iMin2);
            if (i6 != -1) {
                this.isPro += i6;
            }
            return i6;
        } catch (C9893l e) {
            e.f20129l = true;
            throw e;
        }
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: instanceof */
    public final long mo1081instanceof() {
        return AbstractC9284l.m2632volatile(mo1077finally());
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: interface */
    public final String mo1082interface() throws C9893l {
        int iMo1087public = mo1087public();
        byte[] bArr = this.purchase;
        if (iMo1087public > 0) {
            int i = this.billing;
            int i2 = this.admob;
            if (iMo1087public <= i - i2) {
                String str = new String(bArr, i2, iMo1087public, StandardCharsets.UTF_8);
                this.admob += iMo1087public;
                return str;
            }
        }
        if (iMo1087public == 0) {
            return "";
        }
        if (iMo1087public < 0) {
            C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (iMo1087public > this.billing) {
            return new String(m3843transient(iMo1087public), StandardCharsets.UTF_8);
        }
        m3844try(iMo1087public);
        String str2 = new String(bArr, this.admob, iMo1087public, StandardCharsets.UTF_8);
        this.admob += iMo1087public;
        return str2;
    }

    @Override // defpackage.AbstractC9284l
    public final int isVip(int i) throws C9893l {
        if (i < 0) {
            C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.isPro + this.admob + i;
        if (i2 < 0) {
            C11586l.admob("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.firebase;
        if (i2 > i3) {
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.firebase = i2;
        m3842this();
        return i3;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: native */
    public final int mo1083native() throws C9893l {
        if (applovin()) {
            this.subs = 0;
            return 0;
        }
        int iMo1087public = mo1087public();
        this.subs = iMo1087public;
        if ((iMo1087public >>> 3) != 0) {
            return iMo1087public;
        }
        C11586l.admob("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: new */
    public final int mo1084new() {
        return mo1087public();
    }

    @Override // defpackage.AbstractC9284l
    public final int premium() {
        int i = this.firebase;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.isPro + this.admob);
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: private */
    public final void mo1085private(int i) throws C9893l {
        if (this.subs == i) {
            return;
        }
        C11586l.admob("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final byte[] m3840protected(int i) throws IOException {
        if (i == 0) {
            return AbstractC16728l.yandex;
        }
        int i2 = this.isPro;
        int i3 = this.admob;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            C11586l.admob("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.firebase;
        if (i4 > i5) {
            mo1093throws((i5 - i2) - i3);
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.billing - i3;
        int i7 = i - i6;
        InputStream inputStream = this.amazon;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (C9893l e) {
                e.f20129l = true;
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
                    C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.isPro += i8;
                i6 += i8;
            } catch (C9893l e2) {
                e2.f20129l = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: public */
    public final int mo1087public() {
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
        return (int) m3839implements();
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final long m3841return() throws C9893l {
        int i = this.admob;
        if (this.billing - i < 8) {
            m3844try(8);
            i = this.admob;
        }
        this.admob = i + 8;
        byte[] bArr = this.purchase;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.AbstractC9284l
    public final void signatures(int i) {
        this.firebase = i;
        m3842this();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: static */
    public final String mo1088static() throws IOException {
        int iMo1087public = mo1087public();
        int i = this.admob;
        int i2 = this.billing;
        int i3 = i2 - i;
        byte[] bArrM3843transient = this.purchase;
        if (iMo1087public <= i3 && iMo1087public > 0) {
            this.admob = i + iMo1087public;
        } else {
            if (iMo1087public == 0) {
                return "";
            }
            if (iMo1087public < 0) {
                C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (iMo1087public <= i2) {
                m3844try(iMo1087public);
                this.admob = iMo1087public;
            } else {
                bArrM3843transient = m3843transient(iMo1087public);
            }
        }
        return AbstractC13388l.amazon(i, iMo1087public, bArrM3843transient);
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: super */
    public final int mo1089super() {
        return m3838const();
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: switch */
    public final long mo1090switch() {
        return m3841return();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m3842this() {
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
    /* JADX INFO: renamed from: throw */
    public final float mo1092throw() {
        return Float.intBitsToFloat(m3838const());
    }

    @Override // defpackage.AbstractC9284l
    /* JADX INFO: renamed from: throws */
    public final void mo1093throws(int i) throws C9893l {
        InputStream inputStream = this.amazon;
        int i2 = this.billing;
        int i3 = this.admob;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.admob = i3 + i;
            return;
        }
        if (i < 0) {
            C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.isPro;
        int i6 = i5 + i3;
        int i7 = this.firebase;
        if (i6 + i > i7) {
            mo1093throws((i7 - i5) - i3);
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.isPro = i6;
        this.billing = 0;
        this.admob = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (C9893l e) {
                    e.f20129l = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.isPro += i4;
                m3842this();
                throw th;
            }
        }
        this.isPro += i4;
        m3842this();
        if (i4 >= i) {
            return;
        }
        int i8 = this.billing;
        int i9 = i8 - this.admob;
        this.admob = i8;
        m3844try(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.billing;
            if (i10 <= i11) {
                this.admob = i10;
                return;
            } else {
                i9 += i11;
                this.admob = i11;
                m3844try(1);
            }
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final byte[] m3843transient(int i) throws IOException {
        byte[] bArrM3840protected = m3840protected(i);
        if (bArrM3840protected != null) {
            return bArrM3840protected;
        }
        int i2 = this.admob;
        int i3 = this.billing;
        int i4 = i3 - i2;
        this.isPro += i3;
        this.admob = 0;
        this.billing = 0;
        ArrayList<byte[]> arrayListM3845while = m3845while(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.purchase, i2, bArr, 0, i4);
        for (byte[] bArr2 : arrayListM3845while) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m3844try(int i) throws C9893l {
        if (m3837break(i)) {
            return;
        }
        if (i > (Alert.DURATION_SHOW_INDEFINITELY - this.isPro) - this.admob) {
            C11586l.admob("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final ArrayList m3845while(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.amazon.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.isPro += i3;
                    i2 += i3;
                } catch (C9893l e) {
                    e.f20129l = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }
}
