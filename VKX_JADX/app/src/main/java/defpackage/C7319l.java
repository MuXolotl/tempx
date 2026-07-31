package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: renamed from: lؚ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7319l extends AbstractC13869l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f15173l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C3892l f15174l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final int[] f15175l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f15176l;

    public C7319l(int i, int[] iArr, C3892l c3892l) {
        super(3);
        this.f15176l = i;
        this.f15173l = iArr.length == 1 ? 2 : 3;
        this.f15175l = iArr;
        this.f15174l = c3892l;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l Signature() {
        C3892l c3892l = this.f15174l;
        for (long j : c3892l.f8035l) {
            if (j != 0) {
                if (c3892l.remoteconfig()) {
                    break;
                }
                return ad(this.f15176l - 1);
            }
        }
        return this;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ad(int i) {
        if (i < 1) {
            return this;
        }
        C3892l c3892l = this.f15174l;
        int iFirebase = c3892l.firebase();
        int i2 = this.f15176l;
        int[] iArr = this.f15175l;
        if (iFirebase != 0) {
            int i3 = ((i2 + 63) >>> 6) << 1;
            long[] jArr = new long[i3];
            System.arraycopy(c3892l.f8035l, 0, jArr, 0, iFirebase);
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i4 = iFirebase << 1;
                while (true) {
                    iFirebase--;
                    if (iFirebase >= 0) {
                        long j = jArr[iFirebase];
                        jArr[i4 - 1] = C3892l.smaato((int) (j >>> 32));
                        i4 -= 2;
                        jArr[i4] = C3892l.smaato((int) j);
                    }
                }
                iFirebase = C3892l.startapp(jArr, i3, i2, iArr);
            }
            c3892l = new C3892l(jArr, iFirebase);
        }
        return new C7319l(i2, iArr, c3892l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l adcel(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l abstractC2426l3) {
        return ads(abstractC2426l, abstractC2426l2, abstractC2426l3);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l admob(AbstractC2426l abstractC2426l) {
        return startapp(abstractC2426l.remoteconfig());
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l ads(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l abstractC2426l3) {
        C3892l c3892l = ((C7319l) abstractC2426l).f15174l;
        C3892l c3892l2 = ((C7319l) abstractC2426l2).f15174l;
        C3892l c3892l3 = ((C7319l) abstractC2426l3).f15174l;
        C3892l c3892l4 = this.f15174l;
        C3892l c3892lVip = c3892l4.vip(c3892l);
        C3892l c3892lVip2 = c3892l2.vip(c3892l3);
        if (c3892lVip == c3892l4 || c3892lVip == c3892l) {
            c3892lVip = (C3892l) c3892lVip.clone();
        }
        c3892lVip.crashlytics(c3892lVip2);
        long[] jArr = c3892lVip.f8035l;
        int length = jArr.length;
        int i = this.f15176l;
        int[] iArr = this.f15175l;
        int iStartapp = C3892l.startapp(jArr, length, i, iArr);
        if (iStartapp < jArr.length) {
            long[] jArr2 = new long[iStartapp];
            c3892lVip.f8035l = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, iStartapp);
        }
        return new C7319l(i, iArr, c3892lVip);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l amazon(AbstractC2426l abstractC2426l) {
        C3892l c3892l = (C3892l) this.f15174l.clone();
        c3892l.crashlytics(((C7319l) abstractC2426l).f15174l);
        return new C7319l(this.f15176l, this.f15175l, c3892l);
    }

    @Override // defpackage.AbstractC2426l
    public final int billing() {
        return this.f15174l.purchase();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7319l)) {
            return false;
        }
        C7319l c7319l = (C7319l) obj;
        return this.f15176l == c7319l.f15176l && this.f15173l == c7319l.f15173l && Arrays.equals(this.f15175l, c7319l.f15175l) && this.f15174l.equals(c7319l.f15174l);
    }

    public final int hashCode() {
        int iHashCode = this.f15174l.hashCode() ^ this.f15176l;
        int[] iArr = this.f15175l;
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode ^ i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    @Override // defpackage.AbstractC2426l
    public final boolean isVip() {
        long[] jArr = this.f15174l.f8035l;
        return jArr.length > 0 && (jArr[0] & 1) != 0;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l license() {
        C3892l c3892l = this.f15174l;
        int iFirebase = c3892l.firebase();
        int i = this.f15176l;
        int[] iArr = this.f15175l;
        if (iFirebase != 0) {
            int i2 = iFirebase << 1;
            long[] jArr = new long[i2];
            int i3 = 0;
            while (i3 < i2) {
                long j = c3892l.f8035l[i3 >>> 1];
                int i4 = i3 + 1;
                jArr[i3] = C3892l.smaato((int) j);
                i3 += 2;
                jArr[i4] = C3892l.smaato((int) (j >>> 32));
            }
            c3892l = new C3892l(jArr, C3892l.startapp(jArr, i2, i, iArr));
        }
        return new C7319l(i, iArr, c3892l);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean metrica() {
        for (long j : this.f15174l.f8035l) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l pro(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        C3892l c3892l;
        C3892l c3892l2 = ((C7319l) abstractC2426l).f15174l;
        C3892l c3892l3 = ((C7319l) abstractC2426l2).f15174l;
        C3892l c3892l4 = this.f15174l;
        int iFirebase = c3892l4.firebase();
        if (iFirebase == 0) {
            c3892l = c3892l4;
        } else {
            int i = iFirebase << 1;
            long[] jArr = new long[i];
            int i2 = 0;
            while (i2 < i) {
                long j = c3892l4.f8035l[i2 >>> 1];
                int i3 = i2 + 1;
                jArr[i2] = C3892l.smaato((int) j);
                i2 += 2;
                jArr[i3] = C3892l.smaato((int) (j >>> 32));
            }
            c3892l = new C3892l(jArr, i);
        }
        C3892l c3892lVip = c3892l2.vip(c3892l3);
        if (c3892l == c3892l4) {
            c3892l = (C3892l) c3892l.clone();
        }
        c3892l.crashlytics(c3892lVip);
        long[] jArr2 = c3892l.f8035l;
        int length = jArr2.length;
        int i4 = this.f15176l;
        int[] iArr = this.f15175l;
        int iStartapp = C3892l.startapp(jArr2, length, i4, iArr);
        if (iStartapp < jArr2.length) {
            long[] jArr3 = new long[iStartapp];
            c3892l.f8035l = jArr3;
            System.arraycopy(jArr2, 0, jArr3, 0, iStartapp);
        }
        return new C7319l(i4, iArr, c3892l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l purchase() {
        C3892l c3892l;
        C3892l c3892l2 = this.f15174l;
        if (c3892l2.f8035l.length == 0) {
            c3892l = new C3892l(new long[]{1});
        } else {
            int iMax = Math.max(1, c3892l2.firebase());
            long[] jArr = new long[iMax];
            long[] jArr2 = c3892l2.f8035l;
            System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, iMax));
            jArr[0] = jArr[0] ^ 1;
            c3892l = new C3892l(jArr);
        }
        return new C7319l(this.f15176l, this.f15175l, c3892l);
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l remoteconfig() {
        int i;
        C3892l c3892l = this.f15174l;
        int iPurchase = c3892l.purchase();
        if (iPurchase == 0) {
            C18073l.admob();
            return null;
        }
        int i2 = this.f15176l;
        int[] iArr = this.f15175l;
        int i3 = 1;
        if (iPurchase != 1) {
            C3892l c3892l2 = (C3892l) c3892l.clone();
            int i4 = (i2 + 63) >>> 6;
            C3892l c3892l3 = new C3892l(i4);
            long[] jArr = c3892l3.f8035l;
            C3892l.admob(jArr, i2);
            int length = iArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                C3892l.admob(jArr, iArr[length]);
            }
            int iBilling = 0;
            C3892l.admob(jArr, 0);
            C3892l c3892l4 = new C3892l(i4);
            c3892l4.f8035l[0] = 1;
            C3892l c3892l5 = new C3892l(i4);
            int[] iArr2 = new int[2];
            iArr2[0] = iPurchase;
            iArr2[1] = i2 + 1;
            C3892l[] c3892lArr = {c3892l2, c3892l3};
            int[] iArr3 = new int[2];
            iArr3[0] = 1;
            iArr3[1] = 0;
            C3892l[] c3892lArr2 = {c3892l4, c3892l5};
            int i5 = iArr2[1];
            int i6 = i5 - iArr2[0];
            while (true) {
                if (i6 < 0) {
                    i6 = -i6;
                    iArr2[i3] = i5;
                    iArr3[i3] = iBilling;
                    i3 = 1 - i3;
                    i5 = iArr2[i3];
                    iBilling = iArr3[i3];
                }
                i = 1 - i3;
                c3892lArr[i3].loadAd(c3892lArr[i], iArr2[i], i6);
                int iBilling2 = c3892lArr[i3].billing(i5);
                if (iBilling2 == 0) {
                    break;
                }
                int i7 = iArr3[i];
                c3892lArr2[i3].loadAd(c3892lArr2[i], i7, i6);
                int i8 = i7 + i6;
                if (i8 > iBilling) {
                    iBilling = i8;
                } else if (i8 == iBilling) {
                    iBilling = c3892lArr2[i3].billing(iBilling);
                }
                i6 += iBilling2 - i5;
                i5 = iBilling2;
            }
            c3892l = c3892lArr2[i];
        }
        return new C7319l(i2, iArr, c3892l);
    }

    @Override // defpackage.AbstractC2426l
    public final BigInteger signatures() {
        C3892l c3892l = this.f15174l;
        int iFirebase = c3892l.firebase();
        if (iFirebase == 0) {
            return InterfaceC11695l.metrica;
        }
        int i = iFirebase - 1;
        long j = c3892l.f8035l[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        boolean z = false;
        for (int i3 = 7; i3 >= 0; i3--) {
            byte b = (byte) (j >>> (i3 * 8));
            if (z || b != 0) {
                bArr[i2] = b;
                i2++;
                z = true;
            }
        }
        byte[] bArr2 = new byte[(i * 8) + i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = bArr[i4];
        }
        for (int i5 = iFirebase - 2; i5 >= 0; i5--) {
            long j2 = c3892l.f8035l[i5];
            int i6 = 7;
            while (i6 >= 0) {
                bArr2[i2] = (byte) (j2 >>> (i6 * 8));
                i6--;
                i2++;
            }
        }
        return new BigInteger(1, bArr2);
    }

    @Override // defpackage.AbstractC2426l
    public final int smaato() {
        return this.f15176l;
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l startapp(AbstractC2426l abstractC2426l) {
        int i;
        long[] jArr;
        int i2;
        C3892l c3892l = ((C7319l) abstractC2426l).f15174l;
        C3892l c3892l2 = this.f15174l;
        int iPurchase = c3892l2.purchase();
        int i3 = this.f15176l;
        int[] iArr = this.f15175l;
        if (iPurchase != 0) {
            int iPurchase2 = c3892l.purchase();
            if (iPurchase2 != 0) {
                if (iPurchase > iPurchase2) {
                    c3892l2 = c3892l;
                    c3892l = c3892l2;
                    iPurchase2 = iPurchase;
                    iPurchase = iPurchase2;
                }
                int i4 = (iPurchase + 63) >>> 6;
                int i5 = (iPurchase2 + 63) >>> 6;
                int i6 = ((iPurchase + iPurchase2) + 62) >>> 6;
                if (i4 == 1) {
                    long j = c3892l2.f8035l[0];
                    if (j != 1) {
                        long[] jArr2 = new long[i6];
                        C3892l.metrica(j, c3892l.f8035l, i5, jArr2);
                        c3892l = new C3892l(jArr2, C3892l.startapp(jArr2, i6, i3, iArr));
                    }
                } else {
                    int i7 = (iPurchase2 + 70) >>> 6;
                    int[] iArr2 = new int[16];
                    int i8 = i7 << 4;
                    long[] jArr3 = new long[i8];
                    iArr2[1] = i7;
                    System.arraycopy(c3892l.f8035l, 0, jArr3, i7, i5);
                    int i9 = 2;
                    int i10 = i7;
                    while (i9 < 16) {
                        int i11 = i10 + i7;
                        iArr2[i9] = i11;
                        if ((i9 & 1) == 0) {
                            C3892l.adcel(jArr3, i11 >>> 1, jArr3, i11, i7, 1);
                        } else {
                            int i12 = i11 - i7;
                            for (int i13 = 0; i13 < i7; i13++) {
                                jArr3[i11 + i13] = jArr3[i7 + i13] ^ jArr3[i12 + i13];
                            }
                        }
                        i9++;
                        i10 = i11;
                    }
                    long[] jArr4 = new long[i8];
                    C3892l.adcel(jArr3, 0, jArr4, 0, i8, 4);
                    long[] jArr5 = c3892l2.f8035l;
                    int i14 = i6 << 3;
                    long[] jArr6 = new long[i14];
                    int i15 = 0;
                    while (i15 < i4) {
                        int i16 = i3;
                        int i17 = i15;
                        long j2 = jArr5[i15];
                        while (true) {
                            jArr = jArr5;
                            i2 = i14;
                            int i18 = iArr2[((int) j2) & 15];
                            int i19 = iArr2[((int) (j2 >>> 4)) & 15];
                            for (int i20 = 0; i20 < i7; i20++) {
                                int i21 = i17 + i20;
                                jArr6[i21] = jArr6[i21] ^ (jArr3[i18 + i20] ^ jArr4[i19 + i20]);
                            }
                            j2 >>>= 8;
                            if (j2 == 0) {
                                break;
                            }
                            i17 += i6;
                            i14 = i2;
                            jArr5 = jArr;
                        }
                        i15++;
                        i14 = i2;
                        i3 = i16;
                        jArr5 = jArr;
                    }
                    i = i3;
                    while (true) {
                        int i22 = i14 - i6;
                        if (i22 == 0) {
                            break;
                        }
                        C3892l.amazon(jArr6, i22 - i6, jArr6, i22, i6, 8);
                        i14 = i22;
                    }
                    c3892l = new C3892l(jArr6, C3892l.startapp(jArr6, i6, i, iArr));
                }
            }
            return new C7319l(i, iArr, c3892l);
        }
        c3892l = c3892l2;
        i = i3;
        return new C7319l(i, iArr, c3892l);
    }

    @Override // defpackage.AbstractC2426l
    public final boolean vip() {
        return this.f15174l.remoteconfig();
    }

    @Override // defpackage.AbstractC2426l
    public final AbstractC2426l subscription() {
        return this;
    }
}
