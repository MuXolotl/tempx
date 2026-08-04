package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lؒؕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C0819l extends AbstractCollection implements List {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C0819l f2456l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Collection f2457l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f2458l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C14164l f2459l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Collection f2460l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C14164l f2461l;

    public C0819l(C14164l c14164l, Object obj, List list, C0819l c0819l) {
        this.f2461l = c14164l;
        this.f2459l = c14164l;
        this.f2458l = obj;
        this.f2457l = list;
        this.f2456l = c0819l;
        this.f2460l = c0819l == null ? null : c0819l.f2457l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        billing();
        boolean zIsEmpty = this.f2457l.isEmpty();
        boolean zAdd = this.f2457l.add(obj);
        if (!zAdd || !zIsEmpty) {
            return zAdd;
        }
        amazon();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f2457l).addAll(i, collection);
        if (zAddAll) {
            this.f2457l.size();
            if (size == 0) {
                amazon();
                return true;
            }
        }
        return zAddAll;
    }

    public final void amazon() {
        C0819l c0819l = this.f2456l;
        if (c0819l != null) {
            c0819l.amazon();
            return;
        }
        this.f2459l.f27696l.put(this.f2458l, this.f2457l);
    }

    public final void billing() {
        C0819l c0819l = this.f2456l;
        if (c0819l != null) {
            c0819l.billing();
            if (c0819l.f2457l == this.f2460l) {
                return;
            }
            C8339l.mopub();
            return;
        }
        if (this.f2457l.isEmpty()) {
            Collection collection = (Collection) this.f2459l.f27696l.get(this.f2458l);
            if (collection != null) {
                this.f2457l = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (size() == 0) {
            return;
        }
        this.f2457l.clear();
        mopub();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        billing();
        return this.f2457l.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        billing();
        return this.f2457l.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        billing();
        return this.f2457l.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        billing();
        return ((List) this.f2457l).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        billing();
        return this.f2457l.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        billing();
        return ((List) this.f2457l).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        billing();
        return new C11506l(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        billing();
        return ((List) this.f2457l).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        billing();
        return new C3679l(this);
    }

    public final void mopub() {
        C0819l c0819l = this.f2456l;
        if (c0819l != null) {
            c0819l.mopub();
        } else if (this.f2457l.isEmpty()) {
            this.f2459l.f27696l.remove(this.f2458l);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        billing();
        Object objRemove = ((List) this.f2457l).remove(i);
        mopub();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        size();
        boolean zRemoveAll = this.f2457l.removeAll(collection);
        if (zRemoveAll) {
            this.f2457l.size();
            mopub();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        size();
        boolean zRetainAll = this.f2457l.retainAll(collection);
        if (zRetainAll) {
            this.f2457l.size();
            mopub();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        billing();
        return ((List) this.f2457l).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        billing();
        return this.f2457l.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        billing();
        List listSubList = ((List) this.f2457l).subList(i, i2);
        C0819l c0819l = this.f2456l;
        if (c0819l == null) {
            c0819l = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.f2458l;
        C14164l c14164l = this.f2461l;
        return z ? new C9209l(c14164l, obj, listSubList, c0819l) : new C0819l(c14164l, obj, listSubList, c0819l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        billing();
        return this.f2457l.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        billing();
        return new C3679l(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        billing();
        boolean zRemove = this.f2457l.remove(obj);
        if (zRemove) {
            mopub();
        }
        return zRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        billing();
        boolean zIsEmpty = this.f2457l.isEmpty();
        ((List) this.f2457l).add(i, obj);
        if (zIsEmpty) {
            amazon();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f2457l.addAll(collection);
        if (zAddAll) {
            this.f2457l.size();
            if (size == 0) {
                amazon();
                return true;
            }
        }
        return zAddAll;
    }
}
