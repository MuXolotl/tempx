package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lْ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17893l implements RandomAccess {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f34846l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C4588l f34847l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object[] f34848l;

    public C17893l(int i, Object[] objArr) {
        this.f34848l = objArr;
        this.f34846l = i;
    }

    public final List admob() {
        C4588l c4588l = this.f34847l;
        if (c4588l != null) {
            return c4588l;
        }
        C4588l c4588l2 = new C4588l(1, this);
        this.f34847l = c4588l2;
        return c4588l2;
    }

    public final void amazon(int i, C17893l c17893l) {
        int i2 = c17893l.f34846l;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f34846l + i2;
        if (this.f34848l.length < i3) {
            startapp(i3);
        }
        Object[] objArr = this.f34848l;
        int i4 = this.f34846l;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(c17893l.f34848l, 0, objArr, i, i2);
        this.f34846l += i2;
    }

    public final void billing(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f34846l + size;
        if (this.f34848l.length < i2) {
            startapp(i2);
        }
        Object[] objArr = this.f34848l;
        int i3 = this.f34846l;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f34846l += size;
    }

    public final void crashlytics(Object obj) {
        int i = this.f34846l + 1;
        if (this.f34848l.length < i) {
            startapp(i);
        }
        Object[] objArr = this.f34848l;
        int i2 = this.f34846l;
        objArr[i2] = obj;
        this.f34846l = i2 + 1;
    }

    public final boolean firebase(Object obj) {
        int i = this.f34846l - 1;
        if (i >= 0) {
            for (int i2 = 0; !AbstractC8576l.yandex(this.f34848l[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void isPro() {
        Object[] objArr = this.f34848l;
        int i = this.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f34846l = 0;
    }

    public final void loadAd(int i, Object obj) {
        int i2 = this.f34846l + 1;
        if (this.f34848l.length < i2) {
            startapp(i2);
        }
        Object[] objArr = this.f34848l;
        int i3 = this.f34846l;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f34846l++;
    }

    public final void metrica(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f34846l;
            if (i2 < i3) {
                Object[] objArr = this.f34848l;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f34846l;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f34848l[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f34846l = i5;
        }
    }

    public final boolean mopub(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f34846l + size;
        if (this.f34848l.length < i3) {
            startapp(i3);
        }
        Object[] objArr = this.f34848l;
        int i4 = this.f34846l;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f34846l += size;
        return true;
    }

    public final boolean remoteconfig(Object obj) {
        int iSmaato = smaato(obj);
        if (iSmaato < 0) {
            return false;
        }
        vip(iSmaato);
        return true;
    }

    public final int smaato(Object obj) {
        Object[] objArr = this.f34848l;
        int i = this.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            if (AbstractC8576l.yandex(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final void startapp(int i) {
        Object[] objArr = this.f34848l;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f34848l = objArr2;
    }

    public final Object vip(int i) {
        Object[] objArr = this.f34848l;
        Object obj = objArr[i];
        int i2 = this.f34846l;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f34846l - 1;
        this.f34846l = i4;
        objArr[i4] = null;
        return obj;
    }
}
