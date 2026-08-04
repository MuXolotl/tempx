package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lِ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17635l implements List, InterfaceC4742l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f34317l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final List f34318l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34319l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f34320l;

    public /* synthetic */ C17635l(int i, int i2, int i3, List list) {
        this.f34319l = i3;
        this.f34318l = list;
        this.f34317l = i;
        this.f34320l = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f34319l;
        int i3 = this.f34317l;
        List list = this.f34318l;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.f34320l++;
                break;
            default:
                list.add(i + i3, obj);
                this.f34320l++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f34319l;
        int i3 = this.f34317l;
        List list = this.f34318l;
        switch (i2) {
            case 0:
                list.addAll(i + i3, collection);
                this.f34320l = collection.size() + this.f34320l;
                return collection.size() > 0;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.f34320l += size;
                return size > 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f34319l;
        List list = this.f34318l;
        int i2 = this.f34317l;
        switch (i) {
            case 0:
                int i3 = this.f34320l - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.f34320l = i2;
                break;
            default:
                int i4 = this.f34320l - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.f34320l = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f34319l;
        List list = this.f34318l;
        int i2 = this.f34317l;
        switch (i) {
            case 0:
                int i3 = this.f34320l;
                while (i2 < i3) {
                    if (AbstractC8576l.yandex(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.f34320l;
                while (i2 < i4) {
                    if (AbstractC8576l.yandex(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f34319l) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f34319l;
        int i3 = this.f34317l;
        List list = this.f34318l;
        switch (i2) {
            case 0:
                AbstractC3626l.yandex(i, this);
                break;
            default:
                AbstractC13681l.yandex(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f34319l;
        List list = this.f34318l;
        int i2 = this.f34317l;
        switch (i) {
            case 0:
                int i3 = this.f34320l;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (AbstractC8576l.yandex(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.f34320l;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (AbstractC8576l.yandex(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f34319l) {
            case 0:
                return this.f34320l == this.f34317l;
            default:
                return this.f34320l == this.f34317l;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f34319l) {
            case 0:
                return new C7531l(0, 0, this);
            default:
                return new C7531l(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f34319l;
        List list = this.f34318l;
        int i2 = this.f34317l;
        switch (i) {
            case 0:
                int i3 = this.f34320l - 1;
                if (i2 > i3) {
                    return -1;
                }
                while (!AbstractC8576l.yandex(list.get(i3), obj)) {
                    if (i3 == i2) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i2;
            default:
                int i4 = this.f34320l - 1;
                if (i2 > i4) {
                    return -1;
                }
                while (!AbstractC8576l.yandex(list.get(i4), obj)) {
                    if (i4 == i2) {
                        return -1;
                    }
                    i4--;
                }
                return i4 - i2;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f34319l) {
            case 0:
                return new C7531l(0, 0, this);
            default:
                return new C7531l(0, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f34319l;
        int i2 = this.f34317l;
        List list = this.f34318l;
        switch (i) {
            case 0:
                int i3 = this.f34320l;
                while (i2 < i3) {
                    if (AbstractC8576l.yandex(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f34320l--;
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.f34320l;
                while (i2 < i4) {
                    if (AbstractC8576l.yandex(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f34320l--;
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f34319l) {
            case 0:
                int i = this.f34320l;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.f34320l;
            default:
                int i2 = this.f34320l;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.f34320l;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f34319l;
        int i2 = this.f34317l;
        List list = this.f34318l;
        switch (i) {
            case 0:
                int i3 = this.f34320l;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.f34320l--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                return i3 != this.f34320l;
            default:
                int i5 = this.f34320l;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.f34320l--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                return i5 != this.f34320l;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f34319l;
        int i3 = this.f34317l;
        List list = this.f34318l;
        switch (i2) {
            case 0:
                AbstractC3626l.yandex(i, this);
                break;
            default:
                AbstractC13681l.yandex(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.f34319l) {
            case 0:
                i = this.f34320l;
                i2 = this.f34317l;
                break;
            default:
                i = this.f34320l;
                i2 = this.f34317l;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f34319l) {
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
        switch (this.f34319l) {
            case 0:
                break;
        }
        return AbstractC18648l.billing(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f34319l) {
            case 0:
                break;
        }
        return AbstractC18648l.mopub(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f34319l) {
            case 0:
                return new C7531l(i, 0, this);
            default:
                return new C7531l(i, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f34319l;
        List list = this.f34318l;
        switch (i) {
            case 0:
                int i2 = this.f34320l;
                this.f34320l = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.f34320l;
                this.f34320l = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f34319l;
        List list = this.f34318l;
        switch (i) {
            case 0:
                list.addAll(this.f34320l, collection);
                this.f34320l = collection.size() + this.f34320l;
                return collection.size() > 0;
            default:
                list.addAll(this.f34320l, collection);
                int size = collection.size();
                this.f34320l += size;
                return size > 0;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f34319l;
        int i3 = this.f34317l;
        List list = this.f34318l;
        switch (i2) {
            case 0:
                AbstractC3626l.yandex(i, this);
                Object objRemove = list.remove(i + i3);
                this.f34320l--;
                return objRemove;
            default:
                AbstractC13681l.yandex(i, this);
                Object objRemove2 = list.remove(i + i3);
                this.f34320l--;
                return objRemove2;
        }
    }
}
