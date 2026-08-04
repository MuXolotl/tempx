package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lَْۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10268l extends AbstractList implements RandomAccess, InterfaceC0400l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C10268l f20901l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Object[] f20902l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f20903l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f20904l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f20905l;

    static {
        Object[] objArr = new Object[0];
        f20902l = objArr;
        f20901l = new C10268l(objArr, 0, false);
    }

    public C10268l(Object[] objArr, int i, boolean z) {
        this.f20905l = z;
        this.f20904l = objArr;
        this.f20903l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        billing();
        if (i < 0 || i > (i2 = this.f20903l)) {
            C11983l.mopub(this.f20903l, AbstractC2812l.Signature("Index:", i, ", Size:"));
            return;
        }
        Object[] objArr = this.f20904l;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC15560l.vip(objArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f20904l, 0, objArr2, 0, i);
            System.arraycopy(this.f20904l, i, objArr2, i + 1, this.f20903l - i);
            this.f20904l = objArr2;
        }
        this.f20904l[i] = obj;
        this.f20903l++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        billing();
        return super.addAll(collection);
    }

    public final void amazon(int i) {
        if (i < 0 || i >= this.f20903l) {
            C11983l.mopub(this.f20903l, AbstractC2812l.Signature("Index:", i, ", Size:"));
        }
    }

    public final void billing() {
        if (this.f20905l) {
            return;
        }
        C3010l.mopub();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        billing();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        amazon(i);
        return this.f20904l[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public final C10268l mopub(int i) {
        if (i >= this.f20903l) {
            return new C10268l(i == 0 ? f20902l : Arrays.copyOf(this.f20904l, i), this.f20903l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        billing();
        amazon(i);
        Object[] objArr = this.f20904l;
        Object obj = objArr[i];
        int i2 = this.f20903l;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f20903l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        billing();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        billing();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        billing();
        amazon(i);
        Object[] objArr = this.f20904l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20903l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        billing();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        billing();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        billing();
        int i = this.f20903l;
        Object[] objArr = this.f20904l;
        if (i == objArr.length) {
            this.f20904l = Arrays.copyOf(this.f20904l, AbstractC15560l.vip(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f20904l;
        int i2 = this.f20903l;
        this.f20903l = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
