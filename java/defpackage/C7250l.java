package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؚٓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7250l {
    public static final C7250l purchase = new C7250l(0, 0, new Object[0], null);
    public Object[] amazon;
    public final C6760l crashlytics;
    public int loadAd;
    public int yandex;

    public C7250l(int i, int i2, Object[] objArr, C6760l c6760l) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = c6760l;
        this.amazon = objArr;
    }

    public static C7250l isPro(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C6760l c6760l) {
        if (i3 > 30) {
            return new C7250l(0, 0, new Object[]{obj, obj2, obj3, obj4}, c6760l);
        }
        int iAdmob = AbstractC7822l.admob(i, i3);
        int iAdmob2 = AbstractC7822l.admob(i2, i3);
        if (iAdmob != iAdmob2) {
            return new C7250l((1 << iAdmob) | (1 << iAdmob2), 0, iAdmob < iAdmob2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c6760l);
        }
        return new C7250l(0, 1 << iAdmob, new Object[]{isPro(i, obj, obj2, i2, obj3, obj4, i3 + 5, c6760l)}, c6760l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r14.f28907l = pro(r7, r2, (defpackage.C7250l) r14.f28907l);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C14785l Signature(int r14, java.lang.Object r15, java.lang.Object r16, int r17) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7250l.Signature(int, java.lang.Object, java.lang.Object, int):lٍٔؔ");
    }

    public final Object ad(int i) {
        return this.amazon[i + 1];
    }

    public final C7250l adcel(C7250l c7250l, C7250l c7250l2, int i, int i2, C6760l c6760l) {
        C6760l c6760l2 = this.crashlytics;
        if (c7250l2 != null) {
            return (c6760l2 == c6760l || c7250l != c7250l2) ? ads(i, c7250l2, c6760l) : this;
        }
        Object[] objArr = this.amazon;
        if (objArr.length == 1) {
            return null;
        }
        if (c6760l2 != c6760l) {
            return new C7250l(this.yandex, this.loadAd ^ i2, AbstractC7822l.mopub(i, objArr), c6760l);
        }
        this.amazon = AbstractC7822l.mopub(i, objArr);
        this.loadAd ^= i2;
        return this;
    }

    public final boolean admob(int i) {
        return (this.yandex & i) != 0;
    }

    public final C7250l ads(int i, C7250l c7250l, C6760l c6760l) {
        Object[] objArr = this.amazon;
        if (objArr.length == 1 && c7250l.amazon.length == 2 && c7250l.loadAd == 0) {
            c7250l.yandex = this.loadAd;
            return c7250l;
        }
        if (this.crashlytics == c6760l) {
            objArr[i] = c7250l;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = c7250l;
        return new C7250l(this.yandex, this.loadAd, objArrCopyOf, c6760l);
    }

    public final boolean amazon(int i, int i2, Object obj) {
        int iAdmob = 1 << AbstractC7822l.admob(i, i2);
        if (admob(iAdmob)) {
            return AbstractC8576l.yandex(obj, this.amazon[billing(iAdmob)]);
        }
        if (!subs(iAdmob)) {
            return false;
        }
        C7250l c7250lSubscription = subscription(tapsense(iAdmob));
        return i2 == 30 ? c7250lSubscription.crashlytics(obj) : c7250lSubscription.amazon(i, i2 + 5, obj);
    }

    public final int billing(int i) {
        return Integer.bitCount(this.yandex & (i - 1)) * 2;
    }

    public final boolean crashlytics(Object obj) {
        C7488l c7488lStartapp = AbstractC8576l.startapp(2, AbstractC8576l.adcel(0, this.amazon.length));
        int i = c7488lStartapp.f15488l;
        int i2 = c7488lStartapp.f15487l;
        int i3 = c7488lStartapp.f15486l;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!AbstractC8576l.yandex(obj, this.amazon[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final C7250l firebase(int i, C0046l c0046l) {
        c0046l.admob(c0046l.f913l - 1);
        c0046l.f912l = ad(i);
        Object[] objArr = this.amazon;
        if (objArr.length == 2) {
            return null;
        }
        if (this.crashlytics != c0046l.f909l) {
            return new C7250l(0, 0, AbstractC7822l.billing(i, objArr), c0046l.f909l);
        }
        this.amazon = AbstractC7822l.billing(i, objArr);
        return this;
    }

    public final C7250l license(int i, int i2, Object obj) {
        C7250l c7250lLicense;
        int iAdmob = 1 << AbstractC7822l.admob(i, i2);
        if (admob(iAdmob)) {
            int iBilling = billing(iAdmob);
            if (!AbstractC8576l.yandex(obj, this.amazon[iBilling])) {
                return this;
            }
            Object[] objArr = this.amazon;
            if (objArr.length != 2) {
                return new C7250l(this.yandex ^ iAdmob, this.loadAd, AbstractC7822l.billing(iBilling, objArr), null);
            }
        } else {
            if (!subs(iAdmob)) {
                return this;
            }
            int iTapsense = tapsense(iAdmob);
            C7250l c7250lSubscription = subscription(iTapsense);
            if (i2 == 30) {
                C7488l c7488lStartapp = AbstractC8576l.startapp(2, AbstractC8576l.adcel(0, c7250lSubscription.amazon.length));
                int i3 = c7488lStartapp.f15488l;
                int i4 = c7488lStartapp.f15487l;
                int i5 = c7488lStartapp.f15486l;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!AbstractC8576l.yandex(obj, c7250lSubscription.amazon[i3])) {
                            if (i3 == i4) {
                                c7250lLicense = c7250lSubscription;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = c7250lSubscription.amazon;
                            if (objArr2.length != 2) {
                                c7250lLicense = new C7250l(0, 0, AbstractC7822l.billing(i3, objArr2), null);
                                break;
                            }
                            c7250lLicense = null;
                            break;
                        }
                    }
                } else {
                    c7250lLicense = c7250lSubscription;
                    break;
                }
            } else {
                c7250lLicense = c7250lSubscription.license(i, i2 + 5, obj);
            }
            if (c7250lLicense != null) {
                return c7250lSubscription != c7250lLicense ? pro(iTapsense, iAdmob, c7250lLicense) : this;
            }
            Object[] objArr3 = this.amazon;
            if (objArr3.length != 1) {
                return new C7250l(this.yandex, this.loadAd ^ iAdmob, AbstractC7822l.mopub(iTapsense, objArr3), null);
            }
        }
        return null;
    }

    public final int loadAd() {
        if (this.loadAd == 0) {
            return this.amazon.length / 2;
        }
        int iBitCount = Integer.bitCount(this.yandex);
        int length = this.amazon.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += subscription(i).loadAd();
        }
        return iBitCount;
    }

    public final C7250l metrica(int i, Object obj, Object obj2, int i2, C0046l c0046l) {
        C0046l c0046l2;
        C7250l c7250lMetrica;
        int iAdmob = 1 << AbstractC7822l.admob(i, i2);
        if (admob(iAdmob)) {
            int iBilling = billing(iAdmob);
            return (AbstractC8576l.yandex(obj, this.amazon[iBilling]) && AbstractC8576l.yandex(obj2, ad(iBilling))) ? startapp(iBilling, iAdmob, c0046l) : this;
        }
        if (!subs(iAdmob)) {
            return this;
        }
        int iTapsense = tapsense(iAdmob);
        C7250l c7250lSubscription = subscription(iTapsense);
        if (i2 == 30) {
            C7488l c7488lStartapp = AbstractC8576l.startapp(2, AbstractC8576l.adcel(0, c7250lSubscription.amazon.length));
            int i3 = c7488lStartapp.f15488l;
            int i4 = c7488lStartapp.f15487l;
            int i5 = c7488lStartapp.f15486l;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!AbstractC8576l.yandex(obj, c7250lSubscription.amazon[i3]) || !AbstractC8576l.yandex(obj2, c7250lSubscription.ad(i3))) {
                        if (i3 == i4) {
                            c7250lMetrica = c7250lSubscription;
                            break;
                        }
                        i3 += i5;
                    } else {
                        c7250lMetrica = c7250lSubscription.firebase(i3, c0046l);
                        break;
                    }
                }
            } else {
                c7250lMetrica = c7250lSubscription;
                break;
            }
            c0046l2 = c0046l;
        } else {
            c0046l2 = c0046l;
            c7250lMetrica = c7250lSubscription.metrica(i, obj, obj2, i2 + 5, c0046l2);
        }
        return adcel(c7250lSubscription, c7250lMetrica, iTapsense, iAdmob, c0046l2.f909l);
    }

    public final Object mopub(int i, int i2, Object obj) {
        int iAdmob = 1 << AbstractC7822l.admob(i, i2);
        if (admob(iAdmob)) {
            int iBilling = billing(iAdmob);
            if (AbstractC8576l.yandex(obj, this.amazon[iBilling])) {
                return ad(iBilling);
            }
            return null;
        }
        if (!subs(iAdmob)) {
            return null;
        }
        C7250l c7250lSubscription = subscription(tapsense(iAdmob));
        if (i2 != 30) {
            return c7250lSubscription.mopub(i, i2 + 5, obj);
        }
        C7488l c7488lStartapp = AbstractC8576l.startapp(2, AbstractC8576l.adcel(0, c7250lSubscription.amazon.length));
        int i3 = c7488lStartapp.f15488l;
        int i4 = c7488lStartapp.f15487l;
        int i5 = c7488lStartapp.f15486l;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!AbstractC8576l.yandex(obj, c7250lSubscription.amazon[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return c7250lSubscription.ad(i3);
    }

    public final C7250l pro(int i, int i2, C7250l c7250l) {
        Object[] objArr = c7250l.amazon;
        if (objArr.length != 2 || c7250l.loadAd != 0) {
            Object[] objArr2 = this.amazon;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = c7250l;
            return new C7250l(this.yandex, this.loadAd, objArrCopyOf, null);
        }
        if (this.amazon.length == 1) {
            c7250l.yandex = this.loadAd;
            return c7250l;
        }
        int iBilling = billing(i2);
        Object[] objArr3 = this.amazon;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC8669l.pro(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        AbstractC8669l.pro(iBilling + 2, iBilling, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iBilling] = obj;
        objArrCopyOf2[iBilling + 1] = obj2;
        return new C7250l(this.yandex ^ i2, this.loadAd ^ i2, objArrCopyOf2, null);
    }

    public final boolean purchase(C7250l c7250l) {
        if (this == c7250l) {
            return true;
        }
        if (this.loadAd != c7250l.loadAd || this.yandex != c7250l.yandex) {
            return false;
        }
        int length = this.amazon.length;
        for (int i = 0; i < length; i++) {
            if (this.amazon[i] != c7250l.amazon[i]) {
                return false;
            }
        }
        return true;
    }

    public final C7250l remoteconfig(C7250l c7250l, int i, C5559l c5559l, C0046l c0046l) {
        C7250l c7250l2;
        Object[] objArr;
        C7250l c7250lIsPro;
        if (this == c7250l) {
            c5559l.yandex += loadAd();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            C6760l c6760l = c0046l.f909l;
            int i3 = c7250l.loadAd;
            Object[] objArr2 = this.amazon;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + c7250l.amazon.length);
            int length = this.amazon.length;
            C7488l c7488lStartapp = AbstractC8576l.startapp(2, AbstractC8576l.adcel(0, c7250l.amazon.length));
            int i4 = c7488lStartapp.f15488l;
            int i5 = c7488lStartapp.f15487l;
            int i6 = c7488lStartapp.f15486l;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (crashlytics(c7250l.amazon[i4])) {
                        c5559l.yandex++;
                    } else {
                        Object[] objArr3 = c7250l.amazon;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.amazon.length) {
                if (length == c7250l.amazon.length) {
                    return c7250l;
                }
                return length == objArrCopyOf.length ? new C7250l(0, 0, objArrCopyOf, c6760l) : new C7250l(0, 0, Arrays.copyOf(objArrCopyOf, length), c6760l);
            }
        } else {
            int i7 = this.loadAd | c7250l.loadAd;
            int i8 = this.yandex;
            int i9 = c7250l.yandex;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (AbstractC8576l.yandex(this.amazon[billing(iLowestOneBit)], c7250l.amazon[c7250l.billing(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                AbstractC5363l.loadAd("Check failed.");
            }
            if (AbstractC8576l.yandex(this.crashlytics, c0046l.f909l) && this.yandex == i12 && this.loadAd == i7) {
                c7250l2 = this;
            } else {
                c7250l2 = new C7250l(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = c7250l2.amazon;
                int length2 = (objArr4.length - 1) - i14;
                if (subs(iLowestOneBit2)) {
                    c7250lIsPro = subscription(tapsense(iLowestOneBit2));
                    if (c7250l.subs(iLowestOneBit2)) {
                        c7250lIsPro = c7250lIsPro.remoteconfig(c7250l.subscription(c7250l.tapsense(iLowestOneBit2)), i + 5, c5559l, c0046l);
                        objArr = objArr4;
                    } else if (c7250l.admob(iLowestOneBit2)) {
                        int iBilling = c7250l.billing(iLowestOneBit2);
                        Object obj = c7250l.amazon[iBilling];
                        Object objAd = c7250l.ad(iBilling);
                        int i15 = c0046l.f913l;
                        objArr = objArr4;
                        c7250lIsPro = c7250lIsPro.smaato(obj != null ? obj.hashCode() : i2, obj, objAd, i + 5, c0046l);
                        if (c0046l.f913l == i15) {
                            c5559l.yandex++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (c7250l.subs(iLowestOneBit2)) {
                        C7250l c7250lSubscription = c7250l.subscription(c7250l.tapsense(iLowestOneBit2));
                        if (admob(iLowestOneBit2)) {
                            int iBilling2 = billing(iLowestOneBit2);
                            Object obj2 = this.amazon[iBilling2];
                            int i16 = i + 5;
                            if (c7250lSubscription.amazon(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                c5559l.yandex++;
                                c7250lIsPro = c7250lSubscription;
                            } else {
                                c7250lIsPro = c7250lSubscription.smaato(obj2 != null ? obj2.hashCode() : 0, obj2, ad(iBilling2), i16, c0046l);
                            }
                        } else {
                            c7250lIsPro = c7250lSubscription;
                        }
                    } else {
                        int iBilling3 = billing(iLowestOneBit2);
                        Object obj3 = this.amazon[iBilling3];
                        Object objAd2 = ad(iBilling3);
                        int iBilling4 = c7250l.billing(iLowestOneBit2);
                        Object obj4 = c7250l.amazon[iBilling4];
                        c7250lIsPro = isPro(obj3 != null ? obj3.hashCode() : 0, obj3, objAd2, obj4 != null ? obj4.hashCode() : 0, obj4, c7250l.ad(iBilling4), i + 5, c0046l.f909l);
                    }
                }
                objArr[length2] = c7250lIsPro;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (c7250l.admob(iLowestOneBit3)) {
                    int iBilling5 = c7250l.billing(iLowestOneBit3);
                    Object[] objArr5 = c7250l2.amazon;
                    objArr5[i18] = c7250l.amazon[iBilling5];
                    objArr5[i18 + 1] = c7250l.ad(iBilling5);
                    if (admob(iLowestOneBit3)) {
                        c5559l.yandex++;
                    }
                } else {
                    int iBilling6 = billing(iLowestOneBit3);
                    Object[] objArr6 = c7250l2.amazon;
                    objArr6[i18] = this.amazon[iBilling6];
                    objArr6[i18 + 1] = ad(iBilling6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!purchase(c7250l2)) {
                return c7250l.purchase(c7250l2) ? c7250l : c7250l2;
            }
        }
        return this;
    }

    public final C7250l smaato(int i, Object obj, Object obj2, int i2, C0046l c0046l) {
        C0046l c0046l2;
        C7250l c7250lSmaato;
        int iAdmob = 1 << AbstractC7822l.admob(i, i2);
        boolean zAdmob = admob(iAdmob);
        C6760l c6760l = this.crashlytics;
        if (zAdmob) {
            int iBilling = billing(iAdmob);
            if (!AbstractC8576l.yandex(obj, this.amazon[iBilling])) {
                c0046l.admob(c0046l.f913l + 1);
                C6760l c6760l2 = c0046l.f909l;
                if (c6760l != c6760l2) {
                    return new C7250l(this.yandex ^ iAdmob, this.loadAd | iAdmob, yandex(iBilling, iAdmob, i, obj, obj2, i2, c6760l2), c6760l2);
                }
                this.amazon = yandex(iBilling, iAdmob, i, obj, obj2, i2, c6760l2);
                this.yandex ^= iAdmob;
                this.loadAd |= iAdmob;
                return this;
            }
            c0046l.f912l = ad(iBilling);
            if (ad(iBilling) == obj2) {
                return this;
            }
            if (c6760l == c0046l.f909l) {
                this.amazon[iBilling + 1] = obj2;
                return this;
            }
            c0046l.f911l++;
            Object[] objArr = this.amazon;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iBilling + 1] = obj2;
            return new C7250l(this.yandex, this.loadAd, objArrCopyOf, c0046l.f909l);
        }
        if (!subs(iAdmob)) {
            c0046l.admob(c0046l.f913l + 1);
            C6760l c6760l3 = c0046l.f909l;
            int iBilling2 = billing(iAdmob);
            Object[] objArr2 = this.amazon;
            if (c6760l != c6760l3) {
                return new C7250l(this.yandex | iAdmob, this.loadAd, AbstractC7822l.crashlytics(objArr2, iBilling2, obj, obj2), c6760l3);
            }
            this.amazon = AbstractC7822l.crashlytics(objArr2, iBilling2, obj, obj2);
            this.yandex |= iAdmob;
            return this;
        }
        int iTapsense = tapsense(iAdmob);
        C7250l c7250lSubscription = subscription(iTapsense);
        if (i2 == 30) {
            C7488l c7488lStartapp = AbstractC8576l.startapp(2, AbstractC8576l.adcel(0, c7250lSubscription.amazon.length));
            int i3 = c7488lStartapp.f15488l;
            int i4 = c7488lStartapp.f15487l;
            int i5 = c7488lStartapp.f15486l;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!AbstractC8576l.yandex(obj, c7250lSubscription.amazon[i3])) {
                        if (i3 == i4) {
                            c0046l.admob(c0046l.f913l + 1);
                            c7250lSmaato = new C7250l(0, 0, AbstractC7822l.crashlytics(c7250lSubscription.amazon, 0, obj, obj2), c0046l.f909l);
                            break;
                        }
                        i3 += i5;
                    } else {
                        c0046l.f912l = c7250lSubscription.ad(i3);
                        if (c7250lSubscription.crashlytics != c0046l.f909l) {
                            c0046l.f911l++;
                            Object[] objArr3 = c7250lSubscription.amazon;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            c7250lSmaato = new C7250l(0, 0, objArrCopyOf2, c0046l.f909l);
                            break;
                        }
                        c7250lSubscription.amazon[i3 + 1] = obj2;
                        c7250lSmaato = c7250lSubscription;
                        break;
                    }
                }
            } else {
                c0046l.admob(c0046l.f913l + 1);
                c7250lSmaato = new C7250l(0, 0, AbstractC7822l.crashlytics(c7250lSubscription.amazon, 0, obj, obj2), c0046l.f909l);
                break;
            }
            c0046l2 = c0046l;
        } else {
            c0046l2 = c0046l;
            c7250lSmaato = c7250lSubscription.smaato(i, obj, obj2, i2 + 5, c0046l2);
        }
        return c7250lSubscription == c7250lSmaato ? this : ads(iTapsense, c7250lSmaato, c0046l2.f909l);
    }

    public final C7250l startapp(int i, int i2, C0046l c0046l) {
        c0046l.admob(c0046l.f913l - 1);
        c0046l.f912l = ad(i);
        Object[] objArr = this.amazon;
        if (objArr.length == 2) {
            return null;
        }
        if (this.crashlytics != c0046l.f909l) {
            return new C7250l(i2 ^ this.yandex, this.loadAd, AbstractC7822l.billing(i, objArr), c0046l.f909l);
        }
        this.amazon = AbstractC7822l.billing(i, objArr);
        this.yandex ^= i2;
        return this;
    }

    public final boolean subs(int i) {
        return (this.loadAd & i) != 0;
    }

    public final C7250l subscription(int i) {
        return (C7250l) this.amazon[i];
    }

    public final int tapsense(int i) {
        return (this.amazon.length - 1) - Integer.bitCount(this.loadAd & (i - 1));
    }

    public final C7250l vip(int i, Object obj, int i2, C0046l c0046l) {
        C7250l c7250lVip;
        int iAdmob = 1 << AbstractC7822l.admob(i, i2);
        if (admob(iAdmob)) {
            int iBilling = billing(iAdmob);
            if (AbstractC8576l.yandex(obj, this.amazon[iBilling])) {
                return startapp(iBilling, iAdmob, c0046l);
            }
        } else if (subs(iAdmob)) {
            int iTapsense = tapsense(iAdmob);
            C7250l c7250lSubscription = subscription(iTapsense);
            if (i2 == 30) {
                C7488l c7488lStartapp = AbstractC8576l.startapp(2, AbstractC8576l.adcel(0, c7250lSubscription.amazon.length));
                int i3 = c7488lStartapp.f15488l;
                int i4 = c7488lStartapp.f15487l;
                int i5 = c7488lStartapp.f15486l;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!AbstractC8576l.yandex(obj, c7250lSubscription.amazon[i3])) {
                            if (i3 == i4) {
                                c7250lVip = c7250lSubscription;
                                break;
                            }
                            i3 += i5;
                        } else {
                            c7250lVip = c7250lSubscription.firebase(i3, c0046l);
                            break;
                        }
                    }
                } else {
                    c7250lVip = c7250lSubscription;
                    break;
                }
            } else {
                c7250lVip = c7250lSubscription.vip(i, obj, i2 + 5, c0046l);
            }
            return adcel(c7250lSubscription, c7250lVip, iTapsense, iAdmob, c0046l.f909l);
        }
        return this;
    }

    public final Object[] yandex(int i, int i2, int i3, Object obj, Object obj2, int i4, C6760l c6760l) {
        Object obj3 = this.amazon[i];
        C7250l c7250lIsPro = isPro(obj3 != null ? obj3.hashCode() : 0, obj3, ad(i), i3, obj, obj2, i4 + 5, c6760l);
        int iTapsense = tapsense(i2);
        int i5 = iTapsense + 1;
        Object[] objArr = this.amazon;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC8669l.signatures(0, i, 6, objArr, objArr2);
        AbstractC8669l.pro(i, i + 2, i5, objArr, objArr2);
        objArr2[iTapsense - 1] = c7250lIsPro;
        AbstractC8669l.pro(iTapsense, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }
}
