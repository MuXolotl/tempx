package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;

/* JADX INFO: renamed from: lَّٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15590l implements List, InterfaceC4742l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f30438l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f30439l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11362l f30440l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f30441l;

    public C15590l(C11362l c11362l, int i, int i2) {
        this.f30440l = c11362l;
        this.f30439l = i;
        this.f30438l = ((C1713l) AbstractC9620l.admob(c11362l.f22912l)).purchase;
        this.f30441l = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        amazon();
        int i = this.f30439l + this.f30441l;
        C11362l c11362l = this.f30440l;
        c11362l.add(i, obj);
        this.f30441l++;
        this.f30438l = ((C1713l) AbstractC9620l.admob(c11362l.f22912l)).purchase;
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        amazon();
        int i2 = i + this.f30439l;
        C11362l c11362l = this.f30440l;
        boolean zAddAll = c11362l.addAll(i2, collection);
        if (zAddAll) {
            this.f30441l = collection.size() + this.f30441l;
            this.f30438l = ((C1713l) AbstractC9620l.admob(c11362l.f22912l)).purchase;
        }
        return zAddAll;
    }

    public final void amazon() {
        if (((C1713l) AbstractC9620l.admob(this.f30440l.f22912l)).purchase == this.f30438l) {
            return;
        }
        C8339l.mopub();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        AbstractC5030l abstractC5030l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zAmazon;
        if (this.f30441l > 0) {
            amazon();
            C11362l c11362l = this.f30440l;
            int i2 = this.f30439l;
            int i3 = this.f30441l + i2;
            do {
                synchronized (AbstractC18263l.yandex) {
                    C1713l c1713l = (C1713l) AbstractC9620l.admob(c11362l.f22912l);
                    i = c1713l.amazon;
                    abstractC5030l = c1713l.crashlytics;
                    Unit unit = Unit.INSTANCE;
                }
                C0266l c0266lSignatures = abstractC5030l.signatures();
                c0266lSignatures.subList(i2, i3).clear();
                AbstractC5030l abstractC5030lAdvert = c0266lSignatures.advert();
                if (AbstractC8576l.yandex(abstractC5030lAdvert, abstractC5030l)) {
                    break;
                }
                C1713l c1713l2 = c11362l.f22912l;
                synchronized (AbstractC9620l.crashlytics) {
                    abstractC18620lIsPro = AbstractC9620l.isPro();
                    zAmazon = AbstractC18263l.amazon((C1713l) AbstractC9620l.ad(c1713l2, c11362l, abstractC18620lIsPro), i, abstractC5030lAdvert, true);
                }
                AbstractC9620l.metrica(abstractC18620lIsPro, c11362l);
            } while (!zAmazon);
            this.f30441l = 0;
            this.f30438l = ((C1713l) AbstractC9620l.admob(this.f30440l.f22912l)).purchase;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        amazon();
        AbstractC18263l.crashlytics(i, this.f30441l);
        return this.f30440l.get(this.f30439l + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        amazon();
        int i = this.f30441l;
        int i2 = this.f30439l;
        Iterator it = AbstractC8576l.adcel(i2, i + i2).iterator();
        do {
            C16991l c16991l = (C16991l) it;
            if (!c16991l.f33123l) {
                return -1;
            }
            iNextInt = c16991l.nextInt();
        } while (!AbstractC8576l.yandex(obj, this.f30440l.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f30441l == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        amazon();
        int i = this.f30441l;
        int i2 = this.f30439l;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (AbstractC8576l.yandex(obj, this.f30440l.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        amazon();
        C9987l c9987l = new C9987l();
        c9987l.f20387l = i - 1;
        return new C8772l(c9987l, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        amazon();
        int i2 = this.f30439l + i;
        C11362l c11362l = this.f30440l;
        Object objRemove = c11362l.remove(i2);
        this.f30441l--;
        this.f30438l = ((C1713l) AbstractC9620l.admob(c11362l.f22912l)).purchase;
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        AbstractC5030l abstractC5030l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zAmazon;
        amazon();
        C11362l c11362l = this.f30440l;
        int i2 = this.f30439l;
        int i3 = this.f30441l + i2;
        int size = c11362l.size();
        do {
            synchronized (AbstractC18263l.yandex) {
                C1713l c1713l = (C1713l) AbstractC9620l.admob(c11362l.f22912l);
                i = c1713l.amazon;
                abstractC5030l = c1713l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            C0266l c0266lSignatures = abstractC5030l.signatures();
            c0266lSignatures.subList(i2, i3).retainAll(collection);
            AbstractC5030l abstractC5030lAdvert = c0266lSignatures.advert();
            if (AbstractC8576l.yandex(abstractC5030lAdvert, abstractC5030l)) {
                break;
            }
            C1713l c1713l2 = c11362l.f22912l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zAmazon = AbstractC18263l.amazon((C1713l) AbstractC9620l.ad(c1713l2, c11362l, abstractC18620lIsPro), i, abstractC5030lAdvert, true);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, c11362l);
        } while (!zAmazon);
        int size2 = size - c11362l.size();
        if (size2 > 0) {
            this.f30438l = ((C1713l) AbstractC9620l.admob(this.f30440l.f22912l)).purchase;
            this.f30441l -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        AbstractC18263l.crashlytics(i, this.f30441l);
        amazon();
        int i2 = i + this.f30439l;
        C11362l c11362l = this.f30440l;
        Object obj2 = c11362l.set(i2, obj);
        this.f30438l = ((C1713l) AbstractC9620l.admob(c11362l.f22912l)).purchase;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f30441l;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.f30441l) {
            AbstractC5363l.yandex("fromIndex or toIndex are out of bounds");
        }
        amazon();
        int i3 = this.f30439l;
        return new C15590l(this.f30440l, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC18648l.billing(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC18648l.mopub(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        amazon();
        int i2 = this.f30439l + i;
        C11362l c11362l = this.f30440l;
        c11362l.add(i2, obj);
        this.f30441l++;
        this.f30438l = ((C1713l) AbstractC9620l.admob(c11362l.f22912l)).purchase;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f30441l, collection);
    }
}
