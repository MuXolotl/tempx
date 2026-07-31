package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: lَؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1752l extends AbstractC15029l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InputStream f4158l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f4159l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f4160l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f4161l = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f4162l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f4163l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f4164l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f4165l;

    public C1752l(InputStream inputStream) {
        AbstractC6320l.yandex(inputStream, "input");
        this.f4158l = inputStream;
        this.f4163l = new byte[4096];
        this.f4162l = 0;
        this.f4159l = 0;
        this.f4164l = 0;
    }

    @Override // defpackage.AbstractC15029l
    public final int ad() {
        return m1012catch();
    }

    @Override // defpackage.AbstractC15029l
    public final int admob() {
        return this.f4164l + this.f4159l;
    }

    @Override // defpackage.AbstractC15029l
    public final int ads(int i) throws C0803l {
        if (i < 0) {
            throw C0803l.purchase();
        }
        int i2 = this.f4164l + this.f4159l + i;
        if (i2 < 0) {
            throw C0803l.billing();
        }
        int i3 = this.f4161l;
        if (i2 > i3) {
            throw C0803l.mopub();
        }
        this.f4161l = i2;
        m1013class();
        return i3;
    }

    @Override // defpackage.AbstractC15029l
    public final long advert() {
        return m1016else();
    }

    @Override // defpackage.AbstractC15029l
    public final int applovin() {
        return m1012catch();
    }

    @Override // defpackage.AbstractC15029l
    public final long appmetrica() {
        return m1016else();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final int m1011case() {
        int i;
        int i2 = this.f4159l;
        int i3 = this.f4162l;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f4163l;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f4159l = i4;
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
                this.f4159l = i5;
                return i;
            }
        }
        return (int) m1014continue();
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final int m1012catch() throws C0803l {
        int i = this.f4159l;
        if (this.f4162l - i < 4) {
            m1019interface(4);
            i = this.f4159l;
        }
        this.f4159l = i + 4;
        byte[] bArr = this.f4163l;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void m1013class() {
        int i = this.f4162l + this.f4165l;
        this.f4162l = i;
        int i2 = this.f4164l + i;
        int i3 = this.f4161l;
        if (i2 <= i3) {
            this.f4165l = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f4165l = i4;
        this.f4162l = i - i4;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final long m1014continue() throws C0803l {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f4159l == this.f4162l) {
                m1019interface(1);
            }
            int i2 = this.f4159l;
            this.f4159l = i2 + 1;
            byte b = this.f4163l[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw C0803l.amazon();
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final boolean m1015default(int i) throws IOException {
        InputStream inputStream = this.f4158l;
        int i2 = this.f4159l;
        int i3 = i2 + i;
        int i4 = this.f4162l;
        if (i3 <= i4) {
            C8339l.smaato(AbstractC15560l.tapsense("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.f4164l;
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 && i5 + i2 + i <= this.f4161l) {
            byte[] bArr = this.f4163l;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f4164l += i2;
                this.f4162l -= i2;
                this.f4159l = 0;
            }
            int i6 = this.f4162l;
            try {
                int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Alert.DURATION_SHOW_INDEFINITELY - this.f4164l) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f4162l += i7;
                    m1013class();
                    if (this.f4162l >= i) {
                        return true;
                    }
                    return m1015default(i);
                }
            } catch (C0803l e) {
                e.f2425l = true;
                throw e;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final long m1016else() throws C0803l {
        int i = this.f4159l;
        if (this.f4162l - i < 8) {
            m1019interface(8);
            i = this.f4159l;
        }
        this.f4159l = i + 8;
        byte[] bArr = this.f4163l;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final byte[] m1017extends(int i) throws IOException {
        byte[] bArrM1018for = m1018for(i);
        if (bArrM1018for != null) {
            return bArrM1018for;
        }
        int i2 = this.f4159l;
        int i3 = this.f4162l;
        int length = i3 - i2;
        this.f4164l += i3;
        this.f4159l = 0;
        this.f4162l = 0;
        ArrayList<byte[]> arrayListM1026throw = m1026throw(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4163l, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM1026throw) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final byte[] m1018for(int i) throws IOException {
        if (i == 0) {
            return AbstractC6320l.loadAd;
        }
        if (i < 0) {
            throw C0803l.purchase();
        }
        int i2 = this.f4164l;
        int i3 = this.f4159l;
        int i4 = i2 + i3 + i;
        if (i4 - Alert.DURATION_SHOW_INDEFINITELY > 0) {
            throw new C0803l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f4161l;
        if (i4 > i5) {
            m1022static((i5 - i2) - i3);
            throw C0803l.mopub();
        }
        int i6 = this.f4162l - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f4158l;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (C0803l e) {
                e.f2425l = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4163l, this.f4159l, bArr, 0, i6);
        this.f4164l += this.f4162l;
        this.f4159l = 0;
        this.f4162l = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw C0803l.mopub();
                }
                this.f4164l += i8;
                i6 += i8;
            } catch (C0803l e2) {
                e2.f2425l = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // defpackage.AbstractC15029l
    public final int inmobi() {
        return AbstractC15029l.amazon(m1011case());
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final void m1019interface(int i) throws C0803l {
        if (m1015default(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.f4164l) - this.f4159l) {
            throw C0803l.mopub();
        }
        throw new C0803l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // defpackage.AbstractC15029l
    public final float isVip() {
        return Float.intBitsToFloat(m1012catch());
    }

    @Override // defpackage.AbstractC15029l
    public final double license() {
        return Double.longBitsToDouble(m1016else());
    }

    @Override // defpackage.AbstractC15029l
    public final void loadAd(int i) throws C0803l {
        if (this.f4160l != i) {
            throw new C0803l("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final long mo1020native() {
        return m1024switch();
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final String mo1021package() throws C0803l {
        int iM1011case = m1011case();
        byte[] bArr = this.f4163l;
        if (iM1011case > 0) {
            int i = this.f4162l;
            int i2 = this.f4159l;
            if (iM1011case <= i - i2) {
                String str = new String(bArr, i2, iM1011case, AbstractC6320l.yandex);
                this.f4159l += iM1011case;
                return str;
            }
        }
        if (iM1011case == 0) {
            return "";
        }
        if (iM1011case < 0) {
            throw C0803l.purchase();
        }
        if (iM1011case > this.f4162l) {
            return new String(m1017extends(iM1011case), AbstractC6320l.yandex);
        }
        m1019interface(iM1011case);
        String str2 = new String(bArr, this.f4159l, iM1011case, AbstractC6320l.yandex);
        this.f4159l += iM1011case;
        return str2;
    }

    @Override // defpackage.AbstractC15029l
    public final long premium() {
        return m1024switch();
    }

    @Override // defpackage.AbstractC15029l
    public final int pro() {
        return m1011case();
    }

    @Override // defpackage.AbstractC15029l
    public final int signatures() {
        return m1011case();
    }

    @Override // defpackage.AbstractC15029l
    public final void startapp(int i) {
        this.f4161l = i;
        m1013class();
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final void m1022static(int i) throws C0803l {
        int i2 = this.f4162l;
        int i3 = this.f4159l;
        if (i <= i2 - i3 && i >= 0) {
            this.f4159l = i3 + i;
            return;
        }
        InputStream inputStream = this.f4158l;
        if (i < 0) {
            throw C0803l.purchase();
        }
        int i4 = this.f4164l;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f4161l;
        if (i6 > i7) {
            m1022static((i7 - i4) - i3);
            throw C0803l.mopub();
        }
        this.f4164l = i5;
        int i8 = i2 - i3;
        this.f4162l = 0;
        this.f4159l = 0;
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
                } catch (C0803l e) {
                    e.f2425l = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f4164l += i8;
                m1013class();
                throw th;
            }
        }
        this.f4164l += i8;
        m1013class();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f4162l;
        int i10 = i9 - this.f4159l;
        this.f4159l = i9;
        m1019interface(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f4162l;
            if (i11 <= i12) {
                this.f4159l = i11;
                return;
            } else {
                i10 += i12;
                this.f4159l = i12;
                m1019interface(1);
            }
        }
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final int mo1023strictfp() throws C0803l {
        if (subs()) {
            this.f4160l = 0;
            return 0;
        }
        int iM1011case = m1011case();
        this.f4160l = iM1011case;
        if ((iM1011case >>> 3) != 0) {
            return iM1011case;
        }
        throw C0803l.yandex();
    }

    @Override // defpackage.AbstractC15029l
    public final boolean subs() {
        return this.f4159l == this.f4162l && !m1015default(1);
    }

    @Override // defpackage.AbstractC15029l
    public final boolean subscription() {
        return m1024switch() != 0;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final long m1024switch() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f4159l;
        int i2 = this.f4162l;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f4163l;
            byte b = bArr[i];
            if (b >= 0) {
                this.f4159l = i3;
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
                this.f4159l = i4;
                return j;
            }
        }
        return m1014continue();
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final String mo1025synchronized() throws IOException {
        int iM1011case = m1011case();
        int i = this.f4159l;
        int i2 = this.f4162l;
        int i3 = i2 - i;
        byte[] bArrM1017extends = this.f4163l;
        if (iM1011case <= i3 && iM1011case > 0) {
            this.f4159l = i + iM1011case;
        } else {
            if (iM1011case == 0) {
                return "";
            }
            if (iM1011case < 0) {
                throw C0803l.purchase();
            }
            i = 0;
            if (iM1011case <= i2) {
                m1019interface(iM1011case);
                this.f4159l = iM1011case;
            } else {
                bArrM1017extends = m1017extends(iM1011case);
            }
        }
        return AbstractC11523l.yandex.amazon(i, iM1011case, bArrM1017extends);
    }

    @Override // defpackage.AbstractC15029l
    public final C15379l tapsense() throws IOException {
        int iM1011case = m1011case();
        int i = this.f4162l;
        int i2 = this.f4159l;
        int i3 = i - i2;
        byte[] bArr = this.f4163l;
        if (iM1011case <= i3 && iM1011case > 0) {
            C15379l c15379lMopub = AbstractC16071l.mopub(i2, iM1011case, bArr);
            this.f4159l += iM1011case;
            return c15379lMopub;
        }
        if (iM1011case == 0) {
            return AbstractC16071l.f31494l;
        }
        if (iM1011case < 0) {
            throw C0803l.purchase();
        }
        byte[] bArrM1018for = m1018for(iM1011case);
        if (bArrM1018for != null) {
            return AbstractC16071l.mopub(0, bArrM1018for.length, bArrM1018for);
        }
        int i4 = this.f4159l;
        int i5 = this.f4162l;
        int length = i5 - i4;
        this.f4164l += i5;
        this.f4159l = 0;
        this.f4162l = 0;
        ArrayList<byte[]> arrayListM1026throw = m1026throw(iM1011case - length);
        byte[] bArr2 = new byte[iM1011case];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM1026throw) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C15379l c15379l = AbstractC16071l.f31494l;
        return new C15379l(bArr2);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final ArrayList m1026throw(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f4158l.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw C0803l.mopub();
                }
                this.f4164l += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final long mo1027throws() {
        return AbstractC15029l.billing(m1024switch());
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final int mo1028volatile() {
        return m1011case();
    }
}
