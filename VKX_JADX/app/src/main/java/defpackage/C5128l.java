package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: lّؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C5128l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f11161l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f11162l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int[] f11163l;

    public C5128l(int i) {
        this.f11163l = i == 0 ? AbstractC4918l.yandex : new int[i];
        this.f11162l = i == 0 ? AbstractC4918l.crashlytics : new Object[i << 1];
    }

    public final Object admob(int i, Object obj) {
        if (i < 0 || i >= this.f11161l) {
            AbstractC13082l.crashlytics("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f11162l;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int amazon(Object obj) {
        return obj == null ? purchase() : crashlytics(obj.hashCode(), obj);
    }

    public final Object billing(int i) {
        if (i >= 0 && i < this.f11161l) {
            return this.f11162l[i << 1];
        }
        AbstractC13082l.crashlytics("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final void clear() {
        if (this.f11161l > 0) {
            this.f11163l = AbstractC4918l.yandex;
            this.f11162l = AbstractC4918l.crashlytics;
            this.f11161l = 0;
        }
        if (this.f11161l <= 0) {
            return;
        }
        C8339l.mopub();
    }

    public boolean containsKey(Object obj) {
        return amazon(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return yandex(obj) >= 0;
    }

    public final int crashlytics(int i, Object obj) {
        int i2 = this.f11161l;
        if (i2 == 0) {
            return -1;
        }
        int iLoadAd = AbstractC4918l.loadAd(i2, i, this.f11163l);
        if (iLoadAd < 0 || AbstractC8576l.yandex(obj, this.f11162l[iLoadAd << 1])) {
            return iLoadAd;
        }
        int i3 = iLoadAd + 1;
        while (i3 < i2 && this.f11163l[i3] == i) {
            if (AbstractC8576l.yandex(obj, this.f11162l[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iLoadAd - 1; i4 >= 0 && this.f11163l[i4] == i; i4--) {
            if (AbstractC8576l.yandex(obj, this.f11162l[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C5128l) {
                int i = this.f11161l;
                if (i != ((C5128l) obj).f11161l) {
                    return false;
                }
                C5128l c5128l = (C5128l) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objBilling = billing(i2);
                    Object objSubs = subs(i2);
                    Object obj2 = c5128l.get(objBilling);
                    if (objSubs == null) {
                        if (obj2 != null || !c5128l.containsKey(objBilling)) {
                            return false;
                        }
                    } else if (!objSubs.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f11161l != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f11161l;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objBilling2 = billing(i4);
                Object objSubs2 = subs(i4);
                Object obj3 = ((Map) obj).get(objBilling2);
                if (objSubs2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objBilling2)) {
                        return false;
                    }
                } else if (!objSubs2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iAmazon = amazon(obj);
        if (iAmazon >= 0) {
            return this.f11162l[(iAmazon << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iAmazon = amazon(obj);
        return iAmazon >= 0 ? this.f11162l[(iAmazon << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f11163l;
        Object[] objArr = this.f11162l;
        int i = this.f11161l;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f11161l <= 0;
    }

    public final void loadAd(int i) {
        int i2 = this.f11161l;
        int[] iArr = this.f11163l;
        if (iArr.length < i) {
            this.f11163l = Arrays.copyOf(iArr, i);
            this.f11162l = Arrays.copyOf(this.f11162l, i * 2);
        }
        if (this.f11161l == i2) {
            return;
        }
        C8339l.mopub();
    }

    public final Object mopub(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f11161l)) {
            AbstractC13082l.crashlytics("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f11162l;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f11163l;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC8669l.ad(i, i5, iArr, iArr, i2);
                Object[] objArr2 = this.f11162l;
                AbstractC8669l.pro(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f11162l;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f11163l = Arrays.copyOf(iArr, i7);
            this.f11162l = Arrays.copyOf(this.f11162l, i7 << 1);
            if (i2 != this.f11161l) {
                C8339l.mopub();
                return null;
            }
            if (i > 0) {
                AbstractC8669l.ad(0, 0, iArr, this.f11163l, i);
                AbstractC8669l.pro(0, 0, i3, objArr, this.f11162l);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC8669l.ad(i, i8, iArr, this.f11163l, i2);
                AbstractC8669l.pro(i3, i8 << 1, i2 << 1, objArr, this.f11162l);
            }
        }
        if (i2 == this.f11161l) {
            this.f11161l = i4;
            return obj;
        }
        C8339l.mopub();
        return null;
    }

    public final int purchase() {
        int i = this.f11161l;
        if (i == 0) {
            return -1;
        }
        int iLoadAd = AbstractC4918l.loadAd(i, 0, this.f11163l);
        if (iLoadAd < 0 || this.f11162l[iLoadAd << 1] == null) {
            return iLoadAd;
        }
        int i2 = iLoadAd + 1;
        while (i2 < i && this.f11163l[i2] == 0) {
            if (this.f11162l[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iLoadAd - 1; i3 >= 0 && this.f11163l[i3] == 0; i3--) {
            if (this.f11162l[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f11161l;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iCrashlytics = obj != null ? crashlytics(iHashCode, obj) : purchase();
        if (iCrashlytics >= 0) {
            int i2 = (iCrashlytics << 1) + 1;
            Object[] objArr = this.f11162l;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iCrashlytics;
        int[] iArr = this.f11163l;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f11163l = Arrays.copyOf(iArr, i4);
            this.f11162l = Arrays.copyOf(this.f11162l, i4 << 1);
            if (i != this.f11161l) {
                C8339l.mopub();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f11163l;
            int i5 = i3 + 1;
            AbstractC8669l.ad(i5, i3, iArr2, iArr2, i);
            Object[] objArr2 = this.f11162l;
            AbstractC8669l.pro(i5 << 1, i3 << 1, this.f11161l << 1, objArr2, objArr2);
        }
        int i6 = this.f11161l;
        if (i == i6) {
            int[] iArr3 = this.f11163l;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f11162l;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f11161l = i6 + 1;
                return null;
            }
        }
        C8339l.mopub();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iAmazon = amazon(obj);
        if (iAmazon < 0 || !AbstractC8576l.yandex(obj2, subs(iAmazon))) {
            return false;
        }
        mopub(iAmazon);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iAmazon = amazon(obj);
        if (iAmazon < 0 || !AbstractC8576l.yandex(obj2, subs(iAmazon))) {
            return false;
        }
        admob(iAmazon, obj3);
        return true;
    }

    public final int size() {
        return this.f11161l;
    }

    public final Object subs(int i) {
        if (i >= 0 && i < this.f11161l) {
            return this.f11162l[(i << 1) + 1];
        }
        AbstractC13082l.crashlytics("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11161l * 28);
        sb.append('{');
        int i = this.f11161l;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objBilling = billing(i2);
            if (objBilling != sb) {
                sb.append(objBilling);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objSubs = subs(i2);
            if (objSubs != sb) {
                sb.append(objSubs);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int yandex(Object obj) {
        int i = this.f11161l * 2;
        Object[] objArr = this.f11162l;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public Object remove(Object obj) {
        int iAmazon = amazon(obj);
        if (iAmazon >= 0) {
            return mopub(iAmazon);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iAmazon = amazon(obj);
        if (iAmazon >= 0) {
            return admob(iAmazon, obj2);
        }
        return null;
    }
}
