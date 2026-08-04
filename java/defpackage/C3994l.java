package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٌؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3994l implements Cloneable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public /* synthetic */ Object[] f8207l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public /* synthetic */ long[] f8208l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public /* synthetic */ boolean f8209l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ int f8210l;

    public C3994l(int i) {
        if (i == 0) {
            this.f8208l = AbstractC4918l.loadAd;
            this.f8207l = AbstractC4918l.crashlytics;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.f8208l = new long[i5];
        this.f8207l = new Object[i5];
    }

    public final long admob(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f8210l)) {
            AbstractC13082l.crashlytics("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f8209l) {
            long[] jArr = this.f8208l;
            Object[] objArr = this.f8207l;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC3324l.yandex) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f8209l = false;
            this.f8210l = i3;
        }
        return this.f8208l[i];
    }

    public final Object amazon(long j) {
        Object obj;
        int iCrashlytics = AbstractC4918l.crashlytics(this.f8210l, j, this.f8208l);
        if (iCrashlytics < 0 || (obj = this.f8207l[iCrashlytics]) == AbstractC3324l.yandex) {
            return null;
        }
        return obj;
    }

    public final int billing(long j) {
        if (this.f8209l) {
            int i = this.f8210l;
            long[] jArr = this.f8208l;
            Object[] objArr = this.f8207l;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC3324l.yandex) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f8209l = false;
            this.f8210l = i2;
        }
        return AbstractC4918l.crashlytics(this.f8210l, j, this.f8208l);
    }

    /* JADX INFO: renamed from: crashlytics, reason: merged with bridge method [inline-methods] */
    public final C3994l clone() {
        C3994l c3994l = (C3994l) super.clone();
        c3994l.f8208l = (long[]) this.f8208l.clone();
        c3994l.f8207l = (Object[]) this.f8207l.clone();
        return c3994l;
    }

    public final int firebase() {
        if (this.f8209l) {
            int i = this.f8210l;
            long[] jArr = this.f8208l;
            Object[] objArr = this.f8207l;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC3324l.yandex) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f8209l = false;
            this.f8210l = i2;
        }
        return this.f8210l;
    }

    public final void isPro(long j) {
        int iCrashlytics = AbstractC4918l.crashlytics(this.f8210l, j, this.f8208l);
        if (iCrashlytics >= 0) {
            Object[] objArr = this.f8207l;
            Object obj = objArr[iCrashlytics];
            Object obj2 = AbstractC3324l.yandex;
            if (obj != obj2) {
                objArr[iCrashlytics] = obj2;
                this.f8209l = true;
            }
        }
    }

    public final void loadAd() {
        int i = this.f8210l;
        Object[] objArr = this.f8207l;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f8210l = 0;
        this.f8209l = false;
    }

    public final Object purchase(long j) {
        Object obj;
        int iCrashlytics = AbstractC4918l.crashlytics(this.f8210l, j, this.f8208l);
        if (iCrashlytics < 0 || (obj = this.f8207l[iCrashlytics]) == AbstractC3324l.yandex) {
            return -1L;
        }
        return obj;
    }

    public final Object smaato(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f8210l)) {
            AbstractC13082l.crashlytics("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f8209l) {
            long[] jArr = this.f8208l;
            Object[] objArr = this.f8207l;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC3324l.yandex) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f8209l = false;
            this.f8210l = i3;
        }
        return this.f8207l[i];
    }

    public final void subs(long j, Object obj) {
        int iCrashlytics = AbstractC4918l.crashlytics(this.f8210l, j, this.f8208l);
        if (iCrashlytics >= 0) {
            this.f8207l[iCrashlytics] = obj;
            return;
        }
        int i = ~iCrashlytics;
        int i2 = this.f8210l;
        Object obj2 = AbstractC3324l.yandex;
        if (i < i2) {
            Object[] objArr = this.f8207l;
            if (objArr[i] == obj2) {
                this.f8208l[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f8209l) {
            long[] jArr = this.f8208l;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f8207l;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f8209l = false;
                this.f8210l = i3;
                i = ~AbstractC4918l.crashlytics(i3, j, this.f8208l);
            }
        }
        int i5 = this.f8210l;
        if (i5 >= this.f8208l.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.f8208l = Arrays.copyOf(this.f8208l, i9);
            this.f8207l = Arrays.copyOf(this.f8207l, i9);
        }
        int i10 = this.f8210l;
        if (i10 - i != 0) {
            long[] jArr2 = this.f8208l;
            int i11 = i + 1;
            AbstractC8669l.license(i11, i, i10, jArr2, jArr2);
            Object[] objArr3 = this.f8207l;
            AbstractC8669l.pro(i11, i, this.f8210l, objArr3, objArr3);
        }
        this.f8208l[i] = j;
        this.f8207l[i] = obj;
        this.f8210l++;
    }

    public final String toString() {
        if (firebase() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8210l * 28);
        sb.append('{');
        int i = this.f8210l;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(admob(i2));
            sb.append('=');
            Object objSmaato = smaato(i2);
            if (objSmaato != sb) {
                sb.append(objSmaato);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void yandex(long j, Long l) {
        int i = this.f8210l;
        if (i != 0 && j <= this.f8208l[i - 1]) {
            subs(j, l);
            return;
        }
        if (this.f8209l) {
            long[] jArr = this.f8208l;
            if (i >= jArr.length) {
                Object[] objArr = this.f8207l;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != AbstractC3324l.yandex) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.f8209l = false;
                this.f8210l = i2;
            }
        }
        int i4 = this.f8210l;
        if (i4 >= this.f8208l.length) {
            int i5 = (i4 + 1) * 8;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 8;
            this.f8208l = Arrays.copyOf(this.f8208l, i8);
            this.f8207l = Arrays.copyOf(this.f8207l, i8);
        }
        this.f8208l[i4] = j;
        this.f8207l[i4] = l;
        this.f8210l = i4 + 1;
    }

    public /* synthetic */ C3994l(Object obj) {
        this(10);
    }
}
