package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: lٌُٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C8833l extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC0629l f18138l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Set f18139l;

    public C8833l(Set set, InterfaceC0629l interfaceC0629l) {
        this.f18139l = set;
        this.f18138l = interfaceC0629l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        AbstractC12442l.admob(this.f18138l.apply(obj));
        return this.f18139l.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC12442l.admob(this.f18138l.apply(it.next()));
        }
        return this.f18139l.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f18139l;
        boolean z = set instanceof RandomAccess;
        InterfaceC0629l interfaceC0629l = this.f18138l;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            interfaceC0629l.getClass();
            while (it.hasNext()) {
                if (interfaceC0629l.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        interfaceC0629l.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!interfaceC0629l.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC11356l.firebase(list, interfaceC0629l, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC11356l.firebase(list, interfaceC0629l, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f18139l;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f18138l.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC5088l.purchase(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC5088l.admob(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f18139l.iterator();
        InterfaceC0629l interfaceC0629l = this.f18138l;
        AbstractC12442l.metrica(interfaceC0629l, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (interfaceC0629l.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f18139l.iterator();
        it.getClass();
        InterfaceC0629l interfaceC0629l = this.f18138l;
        interfaceC0629l.getClass();
        return new C3561l(it, interfaceC0629l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f18139l.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f18139l.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f18138l.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f18139l.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f18138l.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f18139l.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f18138l.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C3561l c3561l = (C3561l) it;
            if (!c3561l.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(c3561l.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C3561l c3561l = (C3561l) it;
            if (c3561l.hasNext()) {
                arrayList.add(c3561l.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
