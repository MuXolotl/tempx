package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: renamed from: lُۦۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11500l extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C15696l f23112l = new C15696l(0);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C4861l f23114l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C4861l f23115l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f23119l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f23118l = 0;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Comparator f23117l = f23112l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C17512l f23113l = new C17512l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C17512l[] f23116l = new C17512l[16];

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f23120l = 12;

    public final void amazon(C17512l c17512l, C17512l c17512l2) {
        C17512l c17512l3 = c17512l.f34127l;
        c17512l.f34127l = null;
        if (c17512l2 != null) {
            c17512l2.f34127l = c17512l3;
        }
        if (c17512l3 == null) {
            int i = c17512l.f34124l;
            C17512l[] c17512lArr = this.f23116l;
            c17512lArr[i & (c17512lArr.length - 1)] = c17512l2;
        } else if (c17512l3.f34126l == c17512l) {
            c17512l3.f34126l = c17512l2;
        } else {
            c17512l3.f34123l = c17512l2;
        }
    }

    public final void billing(C17512l c17512l) {
        C17512l c17512l2 = c17512l.f34126l;
        C17512l c17512l3 = c17512l.f34123l;
        C17512l c17512l4 = c17512l2.f34126l;
        C17512l c17512l5 = c17512l2.f34123l;
        c17512l.f34126l = c17512l5;
        if (c17512l5 != null) {
            c17512l5.f34127l = c17512l;
        }
        amazon(c17512l, c17512l2);
        c17512l2.f34123l = c17512l;
        c17512l.f34127l = c17512l2;
        int iMax = Math.max(c17512l3 != null ? c17512l3.f34130l : 0, c17512l5 != null ? c17512l5.f34130l : 0) + 1;
        c17512l.f34130l = iMax;
        c17512l2.f34130l = Math.max(iMax, c17512l4 != null ? c17512l4.f34130l : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f23116l, (Object) null);
        this.f23119l = 0;
        this.f23118l++;
        C17512l c17512l = this.f23113l;
        C17512l c17512l2 = c17512l.f34129l;
        while (c17512l2 != c17512l) {
            C17512l c17512l3 = c17512l2.f34129l;
            c17512l2.f34128l = null;
            c17512l2.f34129l = null;
            c17512l2 = c17512l3;
        }
        c17512l.f34128l = c17512l;
        c17512l.f34129l = c17512l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C17512l c17512lYandex = null;
        if (obj != null) {
            try {
                c17512lYandex = yandex(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c17512lYandex != null;
    }

    public final void crashlytics(C17512l c17512l, boolean z) {
        C17512l c17512l2;
        C17512l c17512l3;
        int i;
        if (z) {
            C17512l c17512l4 = c17512l.f34128l;
            c17512l4.f34129l = c17512l.f34129l;
            c17512l.f34129l.f34128l = c17512l4;
            c17512l.f34128l = null;
            c17512l.f34129l = null;
        }
        C17512l c17512l5 = c17512l.f34126l;
        C17512l c17512l6 = c17512l.f34123l;
        C17512l c17512l7 = c17512l.f34127l;
        int i2 = 0;
        if (c17512l5 == null || c17512l6 == null) {
            if (c17512l5 != null) {
                amazon(c17512l, c17512l5);
                c17512l.f34126l = null;
            } else if (c17512l6 != null) {
                amazon(c17512l, c17512l6);
                c17512l.f34123l = null;
            } else {
                amazon(c17512l, null);
            }
            loadAd(c17512l7, false);
            this.f23119l--;
            this.f23118l++;
            return;
        }
        if (c17512l5.f34130l > c17512l6.f34130l) {
            C17512l c17512l8 = c17512l5.f34123l;
            while (true) {
                C17512l c17512l9 = c17512l8;
                c17512l3 = c17512l5;
                c17512l5 = c17512l9;
                if (c17512l5 == null) {
                    break;
                } else {
                    c17512l8 = c17512l5.f34123l;
                }
            }
        } else {
            C17512l c17512l10 = c17512l6.f34126l;
            while (true) {
                c17512l2 = c17512l6;
                c17512l6 = c17512l10;
                if (c17512l6 == null) {
                    break;
                } else {
                    c17512l10 = c17512l6.f34126l;
                }
            }
            c17512l3 = c17512l2;
        }
        crashlytics(c17512l3, false);
        C17512l c17512l11 = c17512l.f34126l;
        if (c17512l11 != null) {
            i = c17512l11.f34130l;
            c17512l3.f34126l = c17512l11;
            c17512l11.f34127l = c17512l3;
            c17512l.f34126l = null;
        } else {
            i = 0;
        }
        C17512l c17512l12 = c17512l.f34123l;
        if (c17512l12 != null) {
            i2 = c17512l12.f34130l;
            c17512l3.f34123l = c17512l12;
            c17512l12.f34127l = c17512l3;
            c17512l.f34123l = null;
        }
        c17512l3.f34130l = Math.max(i, i2) + 1;
        amazon(c17512l, c17512l3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C4861l c4861l = this.f23114l;
        if (c4861l != null) {
            return c4861l;
        }
        C4861l c4861l2 = new C4861l(this, 0);
        this.f23114l = c4861l2;
        return c4861l2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C17512l c17512lYandex;
        if (obj != null) {
            try {
                c17512lYandex = yandex(obj, false);
            } catch (ClassCastException unused) {
                c17512lYandex = null;
            }
        } else {
            c17512lYandex = null;
        }
        if (c17512lYandex != null) {
            return c17512lYandex.f34125l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C4861l c4861l = this.f23115l;
        if (c4861l != null) {
            return c4861l;
        }
        C4861l c4861l2 = new C4861l(this, 1);
        this.f23115l = c4861l2;
        return c4861l2;
    }

    public final void loadAd(C17512l c17512l, boolean z) {
        while (c17512l != null) {
            C17512l c17512l2 = c17512l.f34126l;
            C17512l c17512l3 = c17512l.f34123l;
            int i = c17512l2 != null ? c17512l2.f34130l : 0;
            int i2 = c17512l3 != null ? c17512l3.f34130l : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C17512l c17512l4 = c17512l3.f34126l;
                C17512l c17512l5 = c17512l3.f34123l;
                int i4 = (c17512l4 != null ? c17512l4.f34130l : 0) - (c17512l5 != null ? c17512l5.f34130l : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    billing(c17512l3);
                }
                purchase(c17512l);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C17512l c17512l6 = c17512l2.f34126l;
                C17512l c17512l7 = c17512l2.f34123l;
                int i5 = (c17512l6 != null ? c17512l6.f34130l : 0) - (c17512l7 != null ? c17512l7.f34130l : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    purchase(c17512l2);
                }
                billing(c17512l);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c17512l.f34130l = i + 1;
                if (z) {
                    return;
                }
            } else {
                c17512l.f34130l = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c17512l = c17512l.f34127l;
        }
    }

    public final void purchase(C17512l c17512l) {
        C17512l c17512l2 = c17512l.f34126l;
        C17512l c17512l3 = c17512l.f34123l;
        C17512l c17512l4 = c17512l3.f34126l;
        C17512l c17512l5 = c17512l3.f34123l;
        c17512l.f34123l = c17512l4;
        if (c17512l4 != null) {
            c17512l4.f34127l = c17512l;
        }
        amazon(c17512l, c17512l3);
        c17512l3.f34126l = c17512l;
        c17512l.f34127l = c17512l3;
        int iMax = Math.max(c17512l2 != null ? c17512l2.f34130l : 0, c17512l4 != null ? c17512l4.f34130l : 0) + 1;
        c17512l.f34130l = iMax;
        c17512l3.f34130l = Math.max(iMax, c17512l5 != null ? c17512l5.f34130l : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            C6541l.subs("key == null");
            return null;
        }
        C17512l c17512lYandex = yandex(obj, true);
        Object obj3 = c17512lYandex.f34125l;
        c17512lYandex.f34125l = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C17512l c17512lYandex;
        if (obj != null) {
            try {
                c17512lYandex = yandex(obj, false);
            } catch (ClassCastException unused) {
                c17512lYandex = null;
            }
        } else {
            c17512lYandex = null;
        }
        if (c17512lYandex != null) {
            crashlytics(c17512lYandex, true);
        }
        if (c17512lYandex != null) {
            return c17512lYandex.f34125l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f23119l;
    }

    public final C17512l yandex(Object obj, boolean z) {
        int iCompareTo;
        C17512l c17512l;
        C17512l c17512l2;
        C17512l c17512l3;
        C17512l c17512l4;
        C17512l c17512l5;
        C17512l c17512l6;
        C17512l[] c17512lArr = this.f23116l;
        int iHashCode = obj.hashCode();
        int i = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i2 = ((i >>> 7) ^ i) ^ (i >>> 4);
        boolean z2 = true;
        int length = i2 & (c17512lArr.length - 1);
        C17512l c17512l7 = c17512lArr[length];
        C15696l c15696l = f23112l;
        C17512l c17512l8 = null;
        Comparator comparator = this.f23117l;
        byte b = 0;
        if (c17512l7 != null) {
            Comparable comparable = comparator == c15696l ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c17512l7.f34131l;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c17512l7;
                }
                C17512l c17512l9 = iCompareTo < 0 ? c17512l7.f34126l : c17512l7.f34123l;
                if (c17512l9 == null) {
                    break;
                }
                c17512l7 = c17512l9;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        C17512l c17512l10 = this.f23113l;
        if (c17512l7 != null) {
            C17512l c17512l11 = c17512l7;
            c17512l = new C17512l(c17512l11, obj, i2, c17512l10, c17512l10.f34128l);
            if (iCompareTo < 0) {
                c17512l11.f34126l = c17512l;
            } else {
                c17512l11.f34123l = c17512l;
            }
            loadAd(c17512l11, true);
        } else {
            if (comparator == c15696l && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c17512l = new C17512l(c17512l7, obj, i2, c17512l10, c17512l10.f34128l);
            c17512lArr[length] = c17512l;
        }
        int i3 = this.f23119l;
        this.f23119l = i3 + 1;
        if (i3 > this.f23120l) {
            C17512l[] c17512lArr2 = this.f23116l;
            int length2 = c17512lArr2.length;
            int i4 = length2 * 2;
            C17512l[] c17512lArr3 = new C17512l[i4];
            int i5 = 6;
            C12676l c12676l = new C12676l(b, i5);
            C12676l c12676l2 = new C12676l(b, i5);
            int i6 = 0;
            while (i6 < length2) {
                C17512l c17512l12 = c17512lArr2[i6];
                if (c17512l12 == null) {
                    z2 = z2;
                    c17512l3 = c17512l8;
                } else {
                    C17512l c17512l13 = c17512l8;
                    for (C17512l c17512l14 = c17512l12; c17512l14 != null; c17512l14 = c17512l14.f34126l) {
                        c17512l14.f34127l = c17512l13;
                        c17512l13 = c17512l14;
                    }
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (c17512l13 != null) {
                            C17512l c17512l15 = c17512l13.f34127l;
                            c17512l13.f34127l = c17512l8;
                            C17512l c17512l16 = c17512l13.f34123l;
                            while (true) {
                                C17512l c17512l17 = c17512l16;
                                c17512l2 = c17512l15;
                                c17512l15 = c17512l17;
                                if (c17512l15 == null) {
                                    break;
                                }
                                c17512l15.f34127l = c17512l2;
                                c17512l16 = c17512l15.f34126l;
                            }
                        } else {
                            C17512l c17512l18 = c17512l13;
                            c17512l13 = c17512l8;
                            c17512l2 = c17512l18;
                        }
                        if (c17512l13 == null) {
                            break;
                        }
                        if ((c17512l13.f34124l & length2) == 0) {
                            i7++;
                        } else {
                            i8++;
                        }
                        c17512l13 = c17512l2;
                        z2 = z2;
                        c17512l8 = null;
                    }
                    c12676l.loadAd = ((Integer.highestOneBit(i7) * 2) - 1) - i7;
                    c12676l.amazon = 0;
                    c12676l.crashlytics = 0;
                    C17512l c17512l19 = null;
                    c12676l.purchase = null;
                    c12676l2.loadAd = ((Integer.highestOneBit(i8) * 2) - 1) - i8;
                    c12676l2.amazon = 0;
                    c12676l2.crashlytics = 0;
                    c12676l2.purchase = null;
                    C17512l c17512l20 = null;
                    while (c17512l12 != null) {
                        c17512l12.f34127l = c17512l20;
                        C17512l c17512l21 = c17512l12;
                        c17512l12 = c17512l12.f34126l;
                        c17512l20 = c17512l21;
                    }
                    while (true) {
                        if (c17512l20 != null) {
                            C17512l c17512l22 = c17512l20.f34127l;
                            c17512l20.f34127l = c17512l19;
                            C17512l c17512l23 = c17512l20.f34123l;
                            while (true) {
                                c17512l6 = c17512l22;
                                c17512l22 = c17512l23;
                                if (c17512l22 == null) {
                                    break;
                                }
                                c17512l22.f34127l = c17512l6;
                                c17512l23 = c17512l22.f34126l;
                            }
                            C17512l c17512l24 = c17512l20;
                            c17512l20 = c17512l6;
                            c17512l19 = c17512l24;
                        }
                        if (c17512l19 == null) {
                            break;
                        }
                        if ((c17512l19.f34124l & length2) == 0) {
                            c12676l.yandex(c17512l19);
                        } else {
                            c12676l2.yandex(c17512l19);
                        }
                        c17512l19 = null;
                    }
                    if (i7 > 0) {
                        c17512l4 = (C17512l) c12676l.purchase;
                        if (c17512l4.f34127l != null) {
                            C18073l.admob();
                            return null;
                        }
                        c17512l3 = null;
                    } else {
                        c17512l3 = null;
                        c17512l4 = null;
                    }
                    c17512lArr3[i6] = c17512l4;
                    int i9 = i6 + length2;
                    if (i8 > 0) {
                        c17512l5 = (C17512l) c12676l2.purchase;
                        if (c17512l5.f34127l != null) {
                            C18073l.admob();
                            return c17512l3;
                        }
                    } else {
                        c17512l5 = c17512l3;
                    }
                    c17512lArr3[i9] = c17512l5;
                }
                i6++;
                z2 = z2;
                c17512l8 = c17512l3;
            }
            this.f23116l = c17512lArr3;
            this.f23120l = (i4 / 4) + (i4 / 2);
        }
        this.f23118l++;
        return c17512l;
    }
}
