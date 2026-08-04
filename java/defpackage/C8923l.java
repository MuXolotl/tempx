package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٌٜٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8923l extends AbstractC6005l implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f18389l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f18390l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object[] f18391l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C10227l f18392l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C8923l f18393l;

    public C8923l(Object[] objArr, int i, int i2, C8923l c8923l, C10227l c10227l) {
        this.f18391l = objArr;
        this.f18390l = i;
        this.f18389l = i2;
        this.f18393l = c8923l;
        this.f18392l = c10227l;
        ((AbstractList) this).modCount = ((AbstractList) c10227l).modCount;
    }

    @Override // defpackage.AbstractC6005l
    public final Object ad(int i) {
        applovin();
        premium();
        int i2 = this.f18389l;
        if (i >= 0 && i < i2) {
            return appmetrica(this.f18390l + i);
        }
        C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        applovin();
        premium();
        int i2 = this.f18389l;
        if (i < 0 || i > i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
        } else {
            signatures(this.f18390l + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        applovin();
        premium();
        int i2 = this.f18389l;
        if (i < 0 || i > i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        isVip(this.f18390l + i, collection, size);
        return size > 0;
    }

    public final void applovin() {
        if (this.f18392l.f20844l) {
            C3010l.mopub();
        }
    }

    public final Object appmetrica(int i) {
        Object objAppmetrica;
        ((AbstractList) this).modCount++;
        C8923l c8923l = this.f18393l;
        if (c8923l != null) {
            objAppmetrica = c8923l.appmetrica(i);
        } else {
            C10227l c10227l = C10227l.f20843l;
            objAppmetrica = this.f18392l.appmetrica(i);
        }
        this.f18389l--;
        return objAppmetrica;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        applovin();
        premium();
        inmobi(this.f18390l, this.f18389l);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        premium();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f18391l;
            int i = this.f18389l;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC8576l.yandex(objArr[this.f18390l + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        premium();
        int i2 = this.f18389l;
        if (i >= 0 && i < i2) {
            return this.f18391l[this.f18390l + i];
        }
        C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        premium();
        Object[] objArr = this.f18391l;
        int i = this.f18389l;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f18390l + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        premium();
        for (int i = 0; i < this.f18389l; i++) {
            if (AbstractC8576l.yandex(this.f18391l[this.f18390l + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final void inmobi(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C8923l c8923l = this.f18393l;
        if (c8923l != null) {
            c8923l.inmobi(i, i2);
        } else {
            C10227l c10227l = C10227l.f20843l;
            this.f18392l.inmobi(i, i2);
        }
        this.f18389l -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        premium();
        return this.f18389l == 0;
    }

    public final void isVip(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C10227l c10227l = this.f18392l;
        C8923l c8923l = this.f18393l;
        if (c8923l != null) {
            c8923l.isVip(i, collection, i2);
        } else {
            C10227l c10227l2 = C10227l.f20843l;
            c10227l.isVip(i, collection, i2);
        }
        this.f18391l = c10227l.f20846l;
        this.f18389l += i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        premium();
        for (int i = this.f18389l - 1; i >= 0; i--) {
            if (AbstractC8576l.yandex(this.f18391l[this.f18390l + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        premium();
        int i2 = this.f18389l;
        if (i >= 0 && i <= i2) {
            return new C13376l(this, i);
        }
        C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void premium() {
        if (((AbstractList) this.f18392l).modCount == ((AbstractList) this).modCount) {
            return;
        }
        C8339l.mopub();
    }

    @Override // defpackage.AbstractC6005l
    public final int pro() {
        premium();
        return this.f18389l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        applovin();
        premium();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            ad(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        applovin();
        premium();
        return m2438throws(this.f18390l, this.f18389l, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        applovin();
        premium();
        return m2438throws(this.f18390l, this.f18389l, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        applovin();
        premium();
        int i2 = this.f18389l;
        if (i < 0 || i >= i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.f18391l;
        int i3 = this.f18390l;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    public final void signatures(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C10227l c10227l = this.f18392l;
        C8923l c8923l = this.f18393l;
        if (c8923l != null) {
            c8923l.signatures(i, obj);
        } else {
            C10227l c10227l2 = C10227l.f20843l;
            c10227l.signatures(i, obj);
        }
        this.f18391l = c10227l.f20846l;
        this.f18389l++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC15918l.subs(i, i2, this.f18389l);
        return new C8923l(this.f18391l, this.f18390l + i, i2 - i, this, this.f18392l);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m2438throws(int i, int i2, Collection collection, boolean z) {
        int iM2902throws;
        C8923l c8923l = this.f18393l;
        if (c8923l != null) {
            iM2902throws = c8923l.m2438throws(i, i2, collection, z);
        } else {
            C10227l c10227l = C10227l.f20843l;
            iM2902throws = this.f18392l.m2902throws(i, i2, collection, z);
        }
        if (iM2902throws > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f18389l -= iM2902throws;
        return iM2902throws;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        premium();
        int length = objArr.length;
        int i = this.f18389l;
        Object[] objArr2 = this.f18391l;
        int i2 = this.f18390l;
        if (length < i) {
            return Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
        }
        AbstractC8669l.pro(0, i2, i + i2, objArr2, objArr);
        int i3 = this.f18389l;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        premium();
        return AbstractC13831l.yandex(this.f18391l, this.f18390l, this.f18389l, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        applovin();
        premium();
        signatures(this.f18390l + this.f18389l, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        premium();
        Object[] objArr = this.f18391l;
        int i = this.f18389l;
        int i2 = this.f18390l;
        return AbstractC8669l.m2419throws(i2, i + i2, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        applovin();
        premium();
        int size = collection.size();
        isVip(this.f18390l + this.f18389l, collection, size);
        return size > 0;
    }
}
