package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٌّْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8739l implements Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C8739l f17990l = new C8739l(0, 0, 0, null);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f17991l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f17992l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f17993l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long[] f17994l;

    public C8739l(long j, long j2, long j3, long[] jArr) {
        this.f17993l = j;
        this.f17992l = j2;
        this.f17991l = j3;
        this.f17994l = jArr;
    }

    public final C8739l admob(C8739l c8739l) {
        C8739l c8739lFirebase;
        long[] jArr;
        C8739l c8739lFirebase2 = this;
        C8739l c8739l2 = f17990l;
        if (c8739l == c8739l2) {
            return c8739lFirebase2;
        }
        if (c8739lFirebase2 == c8739l2) {
            return c8739l;
        }
        long j = c8739l.f17991l;
        long j2 = c8739l.f17991l;
        long[] jArr2 = c8739l.f17994l;
        long j3 = c8739l.f17992l;
        long j4 = c8739l.f17993l;
        long j5 = c8739lFirebase2.f17991l;
        long j6 = c8739lFirebase2.f17992l;
        long j7 = c8739lFirebase2.f17993l;
        if (j == j5 && jArr2 == (jArr = c8739lFirebase2.f17994l)) {
            return new C8739l(j7 | j4, j6 | j3, j5, jArr);
        }
        long[] jArr3 = c8739lFirebase2.f17994l;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    c8739lFirebase2 = c8739lFirebase2.firebase(j8);
                }
            }
            if (j3 != 0) {
                for (int i = 0; i < 64; i++) {
                    if (((1 << i) & j3) != 0) {
                        c8739lFirebase2 = c8739lFirebase2.firebase(((long) i) + j2);
                    }
                }
            }
            if (j4 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j4) != 0) {
                        c8739lFirebase2 = c8739lFirebase2.firebase(((long) i2) + j2 + 64);
                    }
                }
            }
            return c8739lFirebase2;
        }
        if (jArr3 != null) {
            c8739lFirebase = c8739l;
            for (long j9 : jArr3) {
                c8739lFirebase = c8739lFirebase.firebase(j9);
            }
        } else {
            c8739lFirebase = c8739l;
        }
        long j10 = c8739lFirebase2.f17991l;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    c8739lFirebase = c8739lFirebase.firebase(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j7) != 0) {
                    c8739lFirebase = c8739lFirebase.firebase(((long) i4) + j10 + 64);
                }
            }
        }
        return c8739lFirebase;
    }

    public final C8739l amazon(C8739l c8739l) {
        long[] jArr;
        C8739l c8739lBilling = this;
        C8739l c8739l2 = f17990l;
        if (c8739l == c8739l2) {
            return c8739lBilling;
        }
        if (c8739lBilling == c8739l2) {
            return c8739l2;
        }
        long j = c8739l.f17991l;
        long j2 = c8739l.f17991l;
        long[] jArr2 = c8739l.f17994l;
        long j3 = c8739l.f17992l;
        long j4 = c8739l.f17993l;
        long j5 = c8739lBilling.f17991l;
        if (j == j5 && jArr2 == (jArr = c8739lBilling.f17994l)) {
            return new C8739l(c8739lBilling.f17993l & (~j4), c8739lBilling.f17992l & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                c8739lBilling = c8739lBilling.billing(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    c8739lBilling = c8739lBilling.billing(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    c8739lBilling = c8739lBilling.billing(((long) i2) + j2 + 64);
                }
            }
        }
        return c8739lBilling;
    }

    public final C8739l billing(long j) {
        long[] jArr;
        int iBilling;
        long[] jArr2;
        long j2 = j - this.f17991l;
        if (AbstractC8576l.isPro(j2, 0L) >= 0 && AbstractC8576l.isPro(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f17992l;
            if ((j4 & j3) != 0) {
                return new C8739l(this.f17993l, j4 & (~j3), this.f17991l, this.f17994l);
            }
        } else if (AbstractC8576l.isPro(j2, 64L) >= 0 && AbstractC8576l.isPro(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.f17993l;
            if ((j6 & j5) != 0) {
                return new C8739l(j6 & (~j5), this.f17992l, this.f17991l, this.f17994l);
            }
        } else if (AbstractC8576l.isPro(j2, 0L) < 0 && (jArr = this.f17994l) != null && (iBilling = AbstractC9464l.billing(j, jArr)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iBilling > 0) {
                    AbstractC8669l.license(0, 0, iBilling, jArr, jArr3);
                }
                if (iBilling < i) {
                    AbstractC8669l.license(iBilling, iBilling + 1, length, jArr, jArr3);
                }
                jArr2 = jArr3;
            }
            return new C8739l(this.f17993l, this.f17992l, this.f17991l, jArr2);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    public final C8739l firebase(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4 = this.f17991l;
        long j5 = j - j4;
        long j6 = 0;
        int iIsPro = AbstractC8576l.isPro(j5, 0L);
        long j7 = this.f17992l;
        if (iIsPro < 0 || AbstractC8576l.isPro(j5, 64L) >= 0) {
            int iIsPro2 = AbstractC8576l.isPro(j5, 64L);
            long j8 = this.f17993l;
            int i2 = 64;
            if (iIsPro2 < 0 || AbstractC8576l.isPro(j5, 128L) >= 0) {
                int iIsPro3 = AbstractC8576l.isPro(j5, 128L);
                long[] jArr3 = this.f17994l;
                if (iIsPro3 < 0) {
                    if (jArr3 == null) {
                        return new C8739l(this.f17993l, this.f17992l, this.f17991l, new long[]{j});
                    }
                    int iBilling = AbstractC9464l.billing(j, jArr3);
                    if (iBilling < 0) {
                        int i3 = -(iBilling + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        AbstractC8669l.license(0, 0, i3, jArr3, jArr4);
                        AbstractC8669l.license(i3 + 1, i3, length, jArr3, jArr4);
                        jArr4[i3] = j;
                        return new C8739l(this.f17993l, this.f17992l, this.f17991l, jArr4);
                    }
                } else if (!mopub(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (AbstractC8576l.isPro(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    C10975l c10975l = null;
                    while (true) {
                        if (AbstractC8576l.isPro(j4, j9) >= 0) {
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (c10975l == null) {
                                c10975l = new C10975l(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j7 & (1 << i4)) != j6) {
                                    ((C9571l) c10975l.f22121l).yandex(((long) i4) + j4);
                                }
                                i4++;
                                j6 = j6;
                            }
                        } else {
                            i = i2;
                        }
                        long j11 = j6;
                        if (j10 == j11) {
                            j2 = j9;
                            j3 = j11;
                            break;
                        }
                        j4 += 64;
                        j6 = j11;
                        j7 = j10;
                        i2 = i;
                        j10 = j6;
                    }
                    if (c10975l == null) {
                        jArr = jArr3;
                    } else {
                        C9571l c9571l = (C9571l) c10975l.f22121l;
                        int i5 = c9571l.loadAd;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = c9571l.yandex;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new C8739l(j10, j3, j2, jArr).firebase(j);
                }
            } else {
                long j12 = 1 << (((int) j5) - 64);
                if ((j8 & j12) == 0) {
                    return new C8739l(j8 | j12, this.f17992l, this.f17991l, this.f17994l);
                }
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new C8739l(this.f17993l, j7 | j13, this.f17991l, this.f17994l);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC6900l.purchase(new C9227l(this, null));
    }

    public final boolean mopub(long j) {
        long[] jArr;
        long j2 = j - this.f17991l;
        if (AbstractC8576l.isPro(j2, 0L) >= 0 && AbstractC8576l.isPro(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.f17992l) != 0;
        }
        if (AbstractC8576l.isPro(j2, 64L) < 0 || AbstractC8576l.isPro(j2, 128L) >= 0) {
            return AbstractC8576l.isPro(j2, 0L) <= 0 && (jArr = this.f17994l) != null && AbstractC9464l.billing(j, jArr) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.f17993l) != 0;
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return string + " [" + sb.toString() + "]";
    }
}
