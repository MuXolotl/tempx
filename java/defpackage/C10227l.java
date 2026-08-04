package defpackage;

import androidx.car.app.model.Alert;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lَُۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10227l extends AbstractC6005l implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C10227l f20843l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f20844l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f20845l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object[] f20846l;

    static {
        C10227l c10227l = new C10227l(0);
        c10227l.f20844l = true;
        f20843l = c10227l;
    }

    public C10227l(int i) {
        if (i >= 0) {
            this.f20846l = new Object[i];
        } else {
            C8339l.metrica("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // defpackage.AbstractC6005l
    public final Object ad(int i) {
        premium();
        int i2 = this.f20845l;
        if (i >= 0 && i < i2) {
            return appmetrica(i);
        }
        C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        premium();
        int i2 = this.f20845l;
        if (i < 0 || i > i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        applovin(i, 1);
        this.f20846l[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        premium();
        int i2 = this.f20845l;
        if (i < 0 || i > i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        isVip(i, collection, size);
        return size > 0;
    }

    public final void applovin(int i, int i2) {
        int i3 = this.f20845l + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f20846l;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Alert.DURATION_SHOW_INDEFINITELY : 2147483639;
            }
            this.f20846l = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f20846l;
        AbstractC8669l.pro(i + i2, i, this.f20845l, objArr2, objArr2);
        this.f20845l += i2;
    }

    public final Object appmetrica(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f20846l;
        Object obj = objArr[i];
        AbstractC8669l.pro(i, i + 1, this.f20845l, objArr, objArr);
        Object[] objArr2 = this.f20846l;
        int i2 = this.f20845l;
        objArr2[i2 - 1] = null;
        this.f20845l = i2 - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        premium();
        inmobi(0, this.f20845l);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f20846l;
            int i = this.f20845l;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC8576l.yandex(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f20845l;
        if (i >= 0 && i < i2) {
            return this.f20846l[i];
        }
        C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f20846l;
        int i = this.f20845l;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f20845l; i++) {
            if (AbstractC8576l.yandex(this.f20846l[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final void inmobi(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f20846l;
        AbstractC8669l.pro(i, i + i2, this.f20845l, objArr, objArr);
        Object[] objArr2 = this.f20846l;
        int i3 = this.f20845l;
        AbstractC13831l.amazon(i3 - i2, i3, objArr2);
        this.f20845l -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f20845l == 0;
    }

    public final void isVip(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        applovin(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f20846l[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f20845l - 1; i >= 0; i--) {
            if (AbstractC8576l.yandex(this.f20846l[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f20845l;
        if (i >= 0 && i <= i2) {
            return new C13376l(this, i);
        }
        C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void premium() {
        if (this.f20844l) {
            C3010l.mopub();
        }
    }

    @Override // defpackage.AbstractC6005l
    public final int pro() {
        return this.f20845l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        premium();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            ad(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        premium();
        return m2902throws(0, this.f20845l, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        premium();
        return m2902throws(0, this.f20845l, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        premium();
        int i2 = this.f20845l;
        if (i < 0 || i >= i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.f20846l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void signatures(int i, Object obj) {
        ((AbstractList) this).modCount++;
        applovin(i, 1);
        this.f20846l[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC15918l.subs(i, i2, this.f20845l);
        return new C8923l(this.f20846l, i, i2 - i, null, this);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m2902throws(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.f20846l;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.f20846l;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        AbstractC8669l.pro(i + i4, i2 + i, this.f20845l, objArr, objArr);
        Object[] objArr3 = this.f20846l;
        int i7 = this.f20845l;
        AbstractC13831l.amazon(i7 - i6, i7, objArr3);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f20845l -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f20845l;
        Object[] objArr2 = this.f20846l;
        if (length < i) {
            return Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
        }
        AbstractC8669l.pro(0, 0, i, objArr2, objArr);
        int i2 = this.f20845l;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC13831l.yandex(this.f20846l, 0, this.f20845l, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC8669l.m2419throws(0, this.f20845l, this.f20846l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        premium();
        int size = collection.size();
        isVip(this.f20845l, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        premium();
        int i = this.f20845l;
        ((AbstractList) this).modCount++;
        applovin(i, 1);
        this.f20846l[i] = obj;
        return true;
    }
}
