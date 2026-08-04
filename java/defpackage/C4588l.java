package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lۣؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4588l implements List, InterfaceC4742l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f9321l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9322l;

    public /* synthetic */ C4588l(int i, Object obj) {
        this.f9322l = i;
        this.f9321l = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f9322l;
        Object obj2 = this.f9321l;
        switch (i3) {
            case 0:
                C12463l c12463l = (C12463l) obj2;
                if (i < 0 || i > (i2 = c12463l.loadAd)) {
                    StringBuilder sbSignature = AbstractC2812l.Signature("Index ", i, " must be in 0..");
                    sbSignature.append(c12463l.loadAd);
                    AbstractC13082l.amazon(sbSignature.toString());
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = c12463l.yandex;
                if (objArr.length < i4) {
                    c12463l.metrica(i4, objArr);
                }
                Object[] objArr2 = c12463l.yandex;
                int i5 = c12463l.loadAd;
                if (i != i5) {
                    AbstractC8669l.pro(i + 1, i, i5, objArr2, objArr2);
                }
                objArr2[i] = obj;
                c12463l.loadAd++;
                return;
            default:
                ((C17893l) obj2).loadAd(i, obj);
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f9322l;
        Object obj = this.f9321l;
        switch (i) {
            case 0:
                C12463l c12463l = (C12463l) obj;
                int i2 = c12463l.loadAd;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c12463l.yandex(it.next());
                }
                return i2 != c12463l.loadAd;
            default:
                C17893l c17893l = (C17893l) obj;
                return c17893l.mopub(c17893l.f34846l, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f9322l;
        Object obj = this.f9321l;
        switch (i) {
            case 0:
                ((C12463l) obj).billing();
                break;
            default:
                ((C17893l) obj).isPro();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f9322l;
        Object obj2 = this.f9321l;
        switch (i) {
            case 0:
                return ((C12463l) obj2).subs(obj) >= 0;
            default:
                return ((C17893l) obj2).firebase(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f9322l;
        Object obj = this.f9321l;
        switch (i) {
            case 0:
                C12463l c12463l = (C12463l) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (c12463l.subs(it.next()) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                C17893l c17893l = (C17893l) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c17893l.firebase(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f9322l;
        Object obj = this.f9321l;
        switch (i2) {
            case 0:
                AbstractC3626l.yandex(i, this);
                return ((C12463l) obj).admob(i);
            default:
                AbstractC13681l.yandex(i, this);
                return ((C17893l) obj).f34848l[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f9322l;
        Object obj2 = this.f9321l;
        switch (i) {
            case 0:
                return ((C12463l) obj2).subs(obj);
            default:
                return ((C17893l) obj2).smaato(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f9322l;
        Object obj = this.f9321l;
        switch (i) {
            case 0:
                return ((C12463l) obj).isPro();
            default:
                return ((C17893l) obj).f34846l == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9322l) {
            case 0:
                return new C7531l(0, 0, this);
            default:
                return new C7531l(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.f9322l;
        Object obj2 = this.f9321l;
        switch (i2) {
            case 0:
                C12463l c12463l = (C12463l) obj2;
                Object[] objArr = c12463l.yandex;
                int i3 = c12463l.loadAd;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                C17893l c17893l = (C17893l) obj2;
                Object[] objArr2 = c17893l.f34848l;
                for (int i4 = c17893l.f34846l - 1; i4 >= 0; i4--) {
                    if (AbstractC8576l.yandex(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f9322l) {
            case 0:
                return new C7531l(0, 0, this);
            default:
                return new C7531l(0, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f9322l;
        Object obj = this.f9321l;
        switch (i2) {
            case 0:
                AbstractC3626l.yandex(i, this);
                return ((C12463l) obj).remoteconfig(i);
            default:
                AbstractC13681l.yandex(i, this);
                return ((C17893l) obj).vip(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f9322l;
        Object obj = this.f9321l;
        switch (i) {
            case 0:
                C12463l c12463l = (C12463l) obj;
                int i2 = c12463l.loadAd;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c12463l.smaato(it.next());
                }
                return i2 != c12463l.loadAd;
            default:
                C17893l c17893l = (C17893l) obj;
                if (!collection.isEmpty()) {
                    int i3 = c17893l.f34846l;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        c17893l.remoteconfig(it2.next());
                    }
                    if (i3 != c17893l.f34846l) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f9322l;
        Object obj = this.f9321l;
        switch (i) {
            case 0:
                C12463l c12463l = (C12463l) obj;
                int i2 = c12463l.loadAd;
                Object[] objArr = c12463l.yandex;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        c12463l.remoteconfig(i3);
                    }
                }
                return i2 != c12463l.loadAd;
            default:
                C17893l c17893l = (C17893l) obj;
                int i4 = c17893l.f34846l;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(c17893l.f34848l[i5])) {
                        c17893l.vip(i5);
                    }
                }
                return i4 != c17893l.f34846l;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f9322l;
        Object obj2 = this.f9321l;
        switch (i2) {
            case 0:
                AbstractC3626l.yandex(i, this);
                return ((C12463l) obj2).startapp(i, obj);
            default:
                AbstractC13681l.yandex(i, this);
                Object[] objArr = ((C17893l) obj2).f34848l;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.f9322l;
        Object obj = this.f9321l;
        switch (i) {
            case 0:
                return ((C12463l) obj).loadAd;
            default:
                return ((C17893l) obj).f34846l;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f9322l) {
            case 0:
                AbstractC3626l.loadAd(i, i2, this);
                return new C17635l(i, i2, 0, this);
            default:
                AbstractC13681l.loadAd(i, i2, this);
                return new C17635l(i, i2, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f9322l) {
            case 0:
                break;
        }
        return AbstractC18648l.billing(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f9322l) {
            case 0:
                break;
        }
        return AbstractC18648l.mopub(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f9322l) {
            case 0:
                return new C7531l(i, 0, this);
            default:
                return new C7531l(i, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f9322l;
        Object obj2 = this.f9321l;
        switch (i) {
            case 0:
                return ((C12463l) obj2).smaato(obj);
            default:
                return ((C17893l) obj2).remoteconfig(obj);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f9322l;
        Object obj = this.f9321l;
        switch (i2) {
            case 0:
                return ((C12463l) obj).amazon(i, collection);
            default:
                return ((C17893l) obj).mopub(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f9322l;
        Object obj2 = this.f9321l;
        switch (i) {
            case 0:
                ((C12463l) obj2).yandex(obj);
                break;
            default:
                ((C17893l) obj2).crashlytics(obj);
                break;
        }
        return true;
    }
}
