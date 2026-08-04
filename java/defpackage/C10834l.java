package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lُۣؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10834l implements Collection, Set, InterfaceC5461l, InterfaceC5281l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f21897l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f21898l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int[] f21899l;

    public C10834l(int i) {
        this.f21899l = AbstractC4918l.yandex;
        this.f21898l = AbstractC4918l.crashlytics;
        if (i > 0) {
            this.f21899l = new int[i];
            this.f21898l = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iMopub;
        int i2 = this.f21897l;
        if (obj == null) {
            iMopub = AbstractC3700l.mopub(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iMopub = AbstractC3700l.mopub(this, obj, iHashCode);
        }
        if (iMopub >= 0) {
            return false;
        }
        int i3 = ~iMopub;
        int[] iArr = this.f21899l;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f21898l;
            int[] iArr2 = new int[i4];
            this.f21899l = iArr2;
            this.f21898l = new Object[i4];
            if (i2 != this.f21897l) {
                C8339l.mopub();
                return false;
            }
            if (iArr2.length != 0) {
                AbstractC8669l.premium(0, iArr.length, iArr, iArr2, 6);
                AbstractC8669l.signatures(0, objArr.length, 6, objArr, this.f21898l);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f21899l;
            int i5 = i3 + 1;
            AbstractC8669l.ad(i5, i3, iArr3, iArr3, i2);
            Object[] objArr2 = this.f21898l;
            AbstractC8669l.pro(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.f21897l;
        if (i2 == i6) {
            int[] iArr4 = this.f21899l;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f21898l[i3] = obj;
                this.f21897l = i6 + 1;
                return true;
            }
        }
        C8339l.mopub();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f21897l;
        int i = this.f21897l;
        int[] iArr = this.f21899l;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f21898l;
            int[] iArr2 = new int[size];
            this.f21899l = iArr2;
            this.f21898l = new Object[size];
            if (i > 0) {
                AbstractC8669l.premium(0, i, iArr, iArr2, 6);
                AbstractC8669l.signatures(0, this.f21897l, 6, objArr, this.f21898l);
            }
        }
        if (this.f21897l != i) {
            C8339l.mopub();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object amazon(int i) {
        int i2 = this.f21897l;
        Object[] objArr = this.f21898l;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f21899l;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC8669l.ad(i, i4, iArr, iArr, i2);
                Object[] objArr2 = this.f21898l;
                AbstractC8669l.pro(i, i4, i2, objArr2, objArr2);
            }
            this.f21898l[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f21899l = iArr2;
            this.f21898l = new Object[i5];
            if (i > 0) {
                AbstractC8669l.premium(0, i, iArr, iArr2, 6);
                AbstractC8669l.signatures(0, i, 6, objArr, this.f21898l);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC8669l.ad(i, i6, iArr, this.f21899l, i2);
                AbstractC8669l.pro(i, i6, i2, objArr, this.f21898l);
            }
        }
        if (i2 == this.f21897l) {
            this.f21897l = i3;
            return obj;
        }
        C8339l.mopub();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f21897l != 0) {
            this.f21899l = AbstractC4918l.yandex;
            this.f21898l = AbstractC4918l.crashlytics;
            this.f21897l = 0;
        }
        if (this.f21897l == 0) {
            return;
        }
        C8339l.mopub();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC3700l.mopub(this, null, 0) : AbstractC3700l.mopub(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f21897l != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f21897l;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f21898l[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f21899l;
        int i = this.f21897l;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f21897l <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C11786l(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iMopub = obj == null ? AbstractC3700l.mopub(this, null, 0) : AbstractC3700l.mopub(this, obj, obj.hashCode());
        if (iMopub < 0) {
            return false;
        }
        amazon(iMopub);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f21897l - 1; -1 < i; i--) {
            if (!AbstractC16901l.inmobi(collection, this.f21898l[i])) {
                amazon(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f21897l;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int i = this.f21897l;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC8669l.pro(0, 0, this.f21897l, this.f21898l, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21897l * 14);
        sb.append('{');
        int i = this.f21897l;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f21898l[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC8669l.m2419throws(0, this.f21897l, this.f21898l);
    }
}
