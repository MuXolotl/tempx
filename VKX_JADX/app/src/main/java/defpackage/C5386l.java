package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lؘؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5386l implements Set {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C11154l f11532l;

    public C5386l(C11154l c11154l) {
        this.f11532l = c11154l;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f11532l.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11532l.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f11532l.isPro(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C11154l c11154l = this.f11532l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return c11154l.f11161l == set.size() && c11154l.isPro(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C11154l c11154l = this.f11532l;
        int iHashCode = 0;
        for (int i = c11154l.f11161l - 1; i >= 0; i--) {
            Object objBilling = c11154l.billing(i);
            iHashCode += objBilling == null ? 0 : objBilling.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f11532l.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C11786l(this.f11532l, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C11154l c11154l = this.f11532l;
        int iAmazon = c11154l.amazon(obj);
        if (iAmazon < 0) {
            return false;
        }
        c11154l.mopub(iAmazon);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f11532l.firebase(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C11154l c11154l = this.f11532l;
        int i = c11154l.f11161l;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c11154l.billing(i2))) {
                c11154l.mopub(i2);
            }
        }
        return i != c11154l.f11161l;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f11532l.f11161l;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C11154l c11154l = this.f11532l;
        int i = c11154l.f11161l;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c11154l.billing(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C11154l c11154l = this.f11532l;
        int i = c11154l.f11161l;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c11154l.billing(i2);
        }
        return objArr;
    }
}
