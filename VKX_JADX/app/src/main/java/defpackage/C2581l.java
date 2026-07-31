package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lّؔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2581l {
    public final C0554l crashlytics;
    public final C1846l loadAd;
    public int yandex = 0;
    public int amazon = 8;
    public int[] purchase = new int[8];
    public int[] billing = new int[8];
    public float[] mopub = new float[8];
    public int admob = -1;
    public int subs = -1;
    public boolean isPro = false;

    public C2581l(C1846l c1846l, C0554l c0554l) {
        this.loadAd = c1846l;
        this.crashlytics = c0554l;
    }

    public final float admob(C4657l c4657l, boolean z) {
        int i = this.admob;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.yandex) {
            if (this.purchase[i] == c4657l.f9477l) {
                int i4 = this.admob;
                int[] iArr = this.billing;
                if (i == i4) {
                    this.admob = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c4657l.loadAd(this.loadAd);
                }
                c4657l.f9485l--;
                this.yandex--;
                this.purchase[i] = -1;
                if (this.isPro) {
                    this.subs = i;
                }
                return this.mopub[i];
            }
            i2++;
            i3 = i;
            i = this.billing[i];
        }
        return 0.0f;
    }

    public final int amazon() {
        return this.yandex;
    }

    public final float billing(int i) {
        int i2 = this.admob;
        for (int i3 = 0; i2 != -1 && i3 < this.yandex; i3++) {
            if (i3 == i) {
                return this.mopub[i2];
            }
            i2 = this.billing[i2];
        }
        return 0.0f;
    }

    public final float crashlytics(C4657l c4657l) {
        int i = this.admob;
        for (int i2 = 0; i != -1 && i2 < this.yandex; i2++) {
            if (this.purchase[i] == c4657l.f9477l) {
                return this.mopub[i];
            }
            i = this.billing[i];
        }
        return 0.0f;
    }

    public final void loadAd() {
        int i = this.admob;
        for (int i2 = 0; i != -1 && i2 < this.yandex; i2++) {
            C4657l c4657l = ((C4657l[]) this.crashlytics.f1956l)[this.purchase[i]];
            if (c4657l != null) {
                c4657l.loadAd(this.loadAd);
            }
            i = this.billing[i];
        }
        this.admob = -1;
        this.subs = -1;
        this.isPro = false;
        this.yandex = 0;
    }

    public final void mopub(C4657l c4657l, float f) {
        if (f == 0.0f) {
            admob(c4657l, true);
            return;
        }
        int i = this.admob;
        C1846l c1846l = this.loadAd;
        if (i == -1) {
            this.admob = 0;
            this.mopub[0] = f;
            this.purchase[0] = c4657l.f9477l;
            this.billing[0] = -1;
            c4657l.f9485l++;
            c4657l.yandex(c1846l);
            this.yandex++;
            if (this.isPro) {
                return;
            }
            int i2 = this.subs + 1;
            this.subs = i2;
            int[] iArr = this.purchase;
            if (i2 >= iArr.length) {
                this.isPro = true;
                this.subs = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.yandex; i4++) {
            int i5 = this.purchase[i];
            int i6 = c4657l.f9477l;
            if (i5 == i6) {
                this.mopub[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.billing[i];
        }
        int length = this.subs;
        int i7 = length + 1;
        if (this.isPro) {
            int[] iArr2 = this.purchase;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.purchase;
        if (length >= iArr3.length && this.yandex < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.purchase;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.purchase;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.amazon * 2;
            this.amazon = i9;
            this.isPro = false;
            this.subs = length - 1;
            this.mopub = Arrays.copyOf(this.mopub, i9);
            this.purchase = Arrays.copyOf(this.purchase, this.amazon);
            this.billing = Arrays.copyOf(this.billing, this.amazon);
        }
        this.purchase[length] = c4657l.f9477l;
        this.mopub[length] = f;
        int[] iArr6 = this.billing;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.admob;
            this.admob = length;
        }
        c4657l.f9485l++;
        c4657l.yandex(c1846l);
        int i10 = this.yandex + 1;
        this.yandex = i10;
        if (!this.isPro) {
            this.subs++;
        }
        int[] iArr7 = this.purchase;
        if (i10 >= iArr7.length) {
            this.isPro = true;
        }
        if (this.subs >= iArr7.length) {
            this.isPro = true;
            this.subs = iArr7.length - 1;
        }
    }

    public final C4657l purchase(int i) {
        int i2 = this.admob;
        for (int i3 = 0; i2 != -1 && i3 < this.yandex; i3++) {
            if (i3 == i) {
                return ((C4657l[]) this.crashlytics.f1956l)[this.purchase[i2]];
            }
            i2 = this.billing[i2];
        }
        return null;
    }

    public final String toString() {
        int i = this.admob;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.yandex; i2++) {
            StringBuilder sbAd = AbstractC5020l.ad(string.concat(" -> "));
            sbAd.append(this.mopub[i]);
            sbAd.append(" : ");
            StringBuilder sbAd2 = AbstractC5020l.ad(sbAd.toString());
            sbAd2.append(((C4657l[]) this.crashlytics.f1956l)[this.purchase[i]]);
            string = sbAd2.toString();
            i = this.billing[i];
        }
        return string;
    }

    public final void yandex(C4657l c4657l, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.admob;
            C1846l c1846l = this.loadAd;
            if (i == -1) {
                this.admob = 0;
                this.mopub[0] = f;
                this.purchase[0] = c4657l.f9477l;
                this.billing[0] = -1;
                c4657l.f9485l++;
                c4657l.yandex(c1846l);
                this.yandex++;
                if (this.isPro) {
                    return;
                }
                int i2 = this.subs + 1;
                this.subs = i2;
                int[] iArr = this.purchase;
                if (i2 >= iArr.length) {
                    this.isPro = true;
                    this.subs = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.yandex; i4++) {
                int i5 = this.purchase[i];
                int i6 = c4657l.f9477l;
                if (i5 == i6) {
                    float[] fArr = this.mopub;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.admob;
                        int[] iArr2 = this.billing;
                        if (i == i7) {
                            this.admob = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c4657l.loadAd(c1846l);
                        }
                        if (this.isPro) {
                            this.subs = i;
                        }
                        c4657l.f9485l--;
                        this.yandex--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.billing[i];
            }
            int length = this.subs;
            int i8 = length + 1;
            if (this.isPro) {
                int[] iArr3 = this.purchase;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.purchase;
            if (length >= iArr4.length && this.yandex < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.purchase;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.purchase;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.amazon * 2;
                this.amazon = i10;
                this.isPro = false;
                this.subs = length - 1;
                this.mopub = Arrays.copyOf(this.mopub, i10);
                this.purchase = Arrays.copyOf(this.purchase, this.amazon);
                this.billing = Arrays.copyOf(this.billing, this.amazon);
            }
            this.purchase[length] = c4657l.f9477l;
            this.mopub[length] = f;
            int[] iArr7 = this.billing;
            if (i3 != -1) {
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                iArr7[length] = this.admob;
                this.admob = length;
            }
            c4657l.f9485l++;
            c4657l.yandex(c1846l);
            this.yandex++;
            if (!this.isPro) {
                this.subs++;
            }
            int i11 = this.subs;
            int[] iArr8 = this.purchase;
            if (i11 >= iArr8.length) {
                this.isPro = true;
                this.subs = iArr8.length - 1;
            }
        }
    }
}
