package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lًّ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12463l {
    public C4588l crashlytics;
    public int loadAd;
    public Object[] yandex;

    public C12463l(int i) {
        this.yandex = i == 0 ? AbstractC3626l.yandex : new Object[i];
    }

    public final void adcel(int i) {
        StringBuilder sbSignature = AbstractC2812l.Signature("Index ", i, " must be in 0..");
        sbSignature.append(this.loadAd - 1);
        AbstractC13082l.amazon(sbSignature.toString());
        throw null;
    }

    public final Object admob(int i) {
        if (i >= 0 && i < this.loadAd) {
            return this.yandex[i];
        }
        adcel(i);
        throw null;
    }

    public final boolean amazon(int i, Collection collection) {
        if (i < 0 || i > this.loadAd) {
            StringBuilder sbSignature = AbstractC2812l.Signature("Index ", i, " must be in 0..");
            sbSignature.append(this.loadAd);
            AbstractC13082l.amazon(sbSignature.toString());
            throw null;
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size() + this.loadAd;
        Object[] objArr = this.yandex;
        if (objArr.length < size) {
            metrica(size, objArr);
        }
        Object[] objArr2 = this.yandex;
        if (i != this.loadAd) {
            AbstractC8669l.pro(collection.size() + i, i, this.loadAd, objArr2, objArr2);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        this.loadAd = collection.size() + this.loadAd;
        return true;
    }

    public final void billing() {
        Arrays.fill(this.yandex, 0, this.loadAd, (Object) null);
        this.loadAd = 0;
    }

    public final void crashlytics(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.loadAd;
        int size = list.size() + i;
        Object[] objArr = this.yandex;
        if (objArr.length < size) {
            metrica(size, objArr);
        }
        Object[] objArr2 = this.yandex;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.loadAd = list.size() + this.loadAd;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12463l) {
            C12463l c12463l = (C12463l) obj;
            int i = c12463l.loadAd;
            int i2 = this.loadAd;
            if (i == i2) {
                Object[] objArr = this.yandex;
                Object[] objArr2 = c12463l.yandex;
                C8934l c8934lAdcel = AbstractC8576l.adcel(0, i2);
                int i3 = c8934lAdcel.f15488l;
                int i4 = c8934lAdcel.f15487l;
                if (i3 > i4) {
                    return true;
                }
                while (AbstractC8576l.yandex(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean firebase() {
        return this.loadAd != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.yandex;
        int i = this.loadAd;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean isPro() {
        return this.loadAd == 0;
    }

    public final void loadAd(C12463l c12463l) {
        if (c12463l.isPro()) {
            return;
        }
        int i = this.loadAd + c12463l.loadAd;
        Object[] objArr = this.yandex;
        if (objArr.length < i) {
            metrica(i, objArr);
        }
        AbstractC8669l.pro(this.loadAd, 0, c12463l.loadAd, c12463l.yandex, this.yandex);
        this.loadAd += c12463l.loadAd;
    }

    public final void metrica(int i, Object[] objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.yandex = objArr2;
    }

    public final Object mopub() {
        if (!isPro()) {
            return this.yandex[0];
        }
        AbstractC13082l.purchase("ObjectList is empty.");
        throw null;
    }

    public final C4588l purchase() {
        C4588l c4588l = this.crashlytics;
        if (c4588l != null) {
            return c4588l;
        }
        C4588l c4588l2 = new C4588l(0, this);
        this.crashlytics = c4588l2;
        return c4588l2;
    }

    public final Object remoteconfig(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.loadAd)) {
            adcel(i);
            throw null;
        }
        Object[] objArr = this.yandex;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            AbstractC8669l.pro(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.loadAd - 1;
        this.loadAd = i3;
        objArr[i3] = null;
        return obj;
    }

    public final boolean smaato(Object obj) {
        int iSubs = subs(obj);
        if (iSubs < 0) {
            return false;
        }
        remoteconfig(iSubs);
        return true;
    }

    public final Object startapp(int i, Object obj) {
        if (i < 0 || i >= this.loadAd) {
            adcel(i);
            throw null;
        }
        Object[] objArr = this.yandex;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final int subs(Object obj) {
        Object[] objArr = this.yandex;
        int i = 0;
        if (obj == null) {
            int i2 = this.loadAd;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.loadAd;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.yandex;
        int i = this.loadAd;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final void vip(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.loadAd) || i2 < 0 || i2 > i3) {
            StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "Start (", ") and end (", ") must be in 0..");
            sbSubscription.append(this.loadAd);
            AbstractC13082l.amazon(sbSubscription.toString());
            throw null;
        }
        if (i2 < i) {
            AbstractC13082l.crashlytics("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.yandex;
                AbstractC8669l.pro(i, i2, i3, objArr, objArr);
            }
            int i4 = this.loadAd;
            int i5 = i4 - (i2 - i);
            Arrays.fill(this.yandex, i5, i4, (Object) null);
            this.loadAd = i5;
        }
    }

    public final void yandex(Object obj) {
        int i = this.loadAd + 1;
        Object[] objArr = this.yandex;
        if (objArr.length < i) {
            metrica(i, objArr);
        }
        Object[] objArr2 = this.yandex;
        int i2 = this.loadAd;
        objArr2[i2] = obj;
        this.loadAd = i2 + 1;
    }

    public /* synthetic */ C12463l() {
        this(16);
    }
}
