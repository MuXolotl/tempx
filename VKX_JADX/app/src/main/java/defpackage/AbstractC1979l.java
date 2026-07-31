package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lؓٝؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1979l extends AbstractCollection {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC1979l f4492l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Collection f4493l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f4494l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2168l f4495l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Collection f4496l;

    public AbstractC1979l(AbstractC2168l abstractC2168l, Object obj, Collection collection, AbstractC1979l abstractC1979l) {
        this.f4495l = abstractC2168l;
        this.f4494l = obj;
        this.f4493l = collection;
        this.f4492l = abstractC1979l;
        this.f4496l = abstractC1979l == null ? null : abstractC1979l.f4493l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        billing();
        boolean zIsEmpty = this.f4493l.isEmpty();
        boolean zAdd = this.f4493l.add(obj);
        if (zAdd) {
            this.f4495l.f4809l++;
            if (zIsEmpty) {
                amazon();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f4493l.addAll(collection);
        if (zAddAll) {
            this.f4495l.f4809l += this.f4493l.size() - size;
            if (size == 0) {
                amazon();
            }
        }
        return zAddAll;
    }

    public final void amazon() {
        AbstractC1979l abstractC1979l = this.f4492l;
        if (abstractC1979l != null) {
            abstractC1979l.amazon();
        } else {
            this.f4495l.f4808l.put(this.f4494l, this.f4493l);
        }
    }

    public final void billing() {
        Collection collection;
        AbstractC1979l abstractC1979l = this.f4492l;
        if (abstractC1979l != null) {
            abstractC1979l.billing();
            if (abstractC1979l.f4493l == this.f4496l) {
                return;
            }
            C8339l.mopub();
            return;
        }
        if (!this.f4493l.isEmpty() || (collection = (Collection) this.f4495l.f4808l.get(this.f4494l)) == null) {
            return;
        }
        this.f4493l = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f4493l.clear();
        this.f4495l.f4809l -= size;
        mopub();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        billing();
        return this.f4493l.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        billing();
        return this.f4493l.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        billing();
        return this.f4493l.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        billing();
        return this.f4493l.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        billing();
        return new C11506l(this);
    }

    public final void mopub() {
        AbstractC1979l abstractC1979l = this.f4492l;
        if (abstractC1979l != null) {
            abstractC1979l.mopub();
        } else if (this.f4493l.isEmpty()) {
            this.f4495l.f4808l.remove(this.f4494l);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        billing();
        boolean zRemove = this.f4493l.remove(obj);
        if (zRemove) {
            this.f4495l.f4809l--;
            mopub();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f4493l.removeAll(collection);
        if (zRemoveAll) {
            this.f4495l.f4809l += this.f4493l.size() - size;
            mopub();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f4493l.retainAll(collection);
        if (zRetainAll) {
            this.f4495l.f4809l += this.f4493l.size() - size;
            mopub();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        billing();
        return this.f4493l.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        billing();
        return this.f4493l.toString();
    }
}
