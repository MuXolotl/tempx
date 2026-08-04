package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lَُؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10220l implements Collection {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C11154l f20834l;

    public C10220l(C11154l c11154l) {
        this.f20834l = c11154l;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f20834l.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20834l.yandex(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f20834l.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C11786l(this.f20834l, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C11154l c11154l = this.f20834l;
        int iYandex = c11154l.yandex(obj);
        if (iYandex < 0) {
            return false;
        }
        c11154l.mopub(iYandex);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C11154l c11154l = this.f20834l;
        int i = c11154l.f11161l;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c11154l.subs(i2))) {
                c11154l.mopub(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C11154l c11154l = this.f20834l;
        int i = c11154l.f11161l;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c11154l.subs(i2))) {
                c11154l.mopub(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f20834l.f11161l;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C11154l c11154l = this.f20834l;
        int i = c11154l.f11161l;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c11154l.subs(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C11154l c11154l = this.f20834l;
        int i = c11154l.f11161l;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c11154l.subs(i2);
        }
        return objArr;
    }
}
