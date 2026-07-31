package defpackage;

import androidx.car.app.model.Alert;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lُۚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11315l extends AbstractC6005l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Object[] f22808l = new Object[0];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f22809l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f22810l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f22811l;

    public C11315l(int i) {
        this.f22810l = new Object[16];
    }

    @Override // defpackage.AbstractC6005l
    public final Object ad(int i) {
        int i2 = this.f22809l;
        if (i < 0 || i >= i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == AbstractC14055l.smaato(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m3057package();
        int iM3058throws = m3058throws(this.f22811l + i);
        Object[] objArr = this.f22810l;
        Object obj = objArr[iM3058throws];
        int i3 = this.f22809l >> 1;
        int i4 = this.f22811l;
        if (i < i3) {
            if (iM3058throws >= i4) {
                AbstractC8669l.pro(i4 + 1, i4, iM3058throws, objArr, objArr);
            } else {
                AbstractC8669l.pro(1, 0, iM3058throws, objArr, objArr);
                Object[] objArr2 = this.f22810l;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f22811l;
                AbstractC8669l.pro(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f22810l;
            int i6 = this.f22811l;
            objArr3[i6] = null;
            this.f22811l = premium(i6);
        } else {
            int iM3058throws2 = m3058throws(AbstractC14055l.smaato(this) + i4);
            Object[] objArr4 = this.f22810l;
            if (iM3058throws <= iM3058throws2) {
                AbstractC8669l.pro(iM3058throws, iM3058throws + 1, iM3058throws2 + 1, objArr4, objArr4);
            } else {
                AbstractC8669l.pro(iM3058throws, iM3058throws + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f22810l;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC8669l.pro(0, 1, iM3058throws2 + 1, objArr5, objArr5);
            }
            this.f22810l[iM3058throws2] = null;
        }
        this.f22809l--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f22809l;
        if (i < 0 || i > i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m3057package();
        isVip(this.f22809l + 1);
        int iM3058throws = m3058throws(this.f22811l + i);
        int i3 = this.f22809l;
        int i4 = (i3 + 1) >> 1;
        int i5 = this.f22811l;
        if (i < i4) {
            int length = iM3058throws == 0 ? this.f22810l.length - 1 : iM3058throws - 1;
            int length2 = i5 == 0 ? this.f22810l.length - 1 : i5 - 1;
            Object[] objArr = this.f22810l;
            if (length >= i5) {
                objArr[length2] = objArr[i5];
                AbstractC8669l.pro(i5, i5 + 1, length + 1, objArr, objArr);
            } else {
                AbstractC8669l.pro(i5 - 1, i5, objArr.length, objArr, objArr);
                Object[] objArr2 = this.f22810l;
                objArr2[objArr2.length - 1] = objArr2[0];
                AbstractC8669l.pro(0, 1, length + 1, objArr2, objArr2);
            }
            this.f22810l[length] = obj;
            this.f22811l = length2;
        } else {
            int iM3058throws2 = m3058throws(i3 + i5);
            Object[] objArr3 = this.f22810l;
            if (iM3058throws < iM3058throws2) {
                AbstractC8669l.pro(iM3058throws + 1, iM3058throws, iM3058throws2, objArr3, objArr3);
            } else {
                AbstractC8669l.pro(1, 0, iM3058throws2, objArr3, objArr3);
                Object[] objArr4 = this.f22810l;
                objArr4[0] = objArr4[objArr4.length - 1];
                AbstractC8669l.pro(iM3058throws + 1, iM3058throws, objArr4.length - 1, objArr4, objArr4);
            }
            this.f22810l[iM3058throws] = obj;
        }
        this.f22809l++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f22809l;
        if (i < 0 || i > i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f22809l) {
            return addAll(collection);
        }
        m3057package();
        isVip(collection.size() + this.f22809l);
        int iM3058throws = m3058throws(this.f22809l + this.f22811l);
        int iM3058throws2 = m3058throws(this.f22811l + i);
        int size = collection.size();
        if (i >= ((this.f22809l + 1) >> 1)) {
            int i3 = iM3058throws2 + size;
            Object[] objArr = this.f22810l;
            if (iM3058throws2 < iM3058throws) {
                int i4 = size + iM3058throws;
                if (i4 <= objArr.length) {
                    AbstractC8669l.pro(i3, iM3058throws2, iM3058throws, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    AbstractC8669l.pro(i3 - objArr.length, iM3058throws2, iM3058throws, objArr, objArr);
                } else {
                    int length = iM3058throws - (i4 - objArr.length);
                    AbstractC8669l.pro(0, length, iM3058throws, objArr, objArr);
                    Object[] objArr2 = this.f22810l;
                    AbstractC8669l.pro(i3, iM3058throws2, length, objArr2, objArr2);
                }
            } else {
                AbstractC8669l.pro(size, 0, iM3058throws, objArr, objArr);
                Object[] objArr3 = this.f22810l;
                if (i3 >= objArr3.length) {
                    AbstractC8669l.pro(i3 - objArr3.length, iM3058throws2, objArr3.length, objArr3, objArr3);
                } else {
                    AbstractC8669l.pro(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.f22810l;
                    AbstractC8669l.pro(i3, iM3058throws2, objArr4.length - size, objArr4, objArr4);
                }
            }
            advert(iM3058throws2, collection);
            return true;
        }
        int i5 = this.f22811l;
        int length2 = i5 - size;
        Object[] objArr5 = this.f22810l;
        if (iM3058throws2 < i5) {
            AbstractC8669l.pro(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.f22810l;
            if (size >= iM3058throws2) {
                AbstractC8669l.pro(objArr6.length - size, 0, iM3058throws2, objArr6, objArr6);
            } else {
                AbstractC8669l.pro(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.f22810l;
                AbstractC8669l.pro(0, size, iM3058throws2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            AbstractC8669l.pro(length2, i5, iM3058throws2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iM3058throws2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                AbstractC8669l.pro(length2, i5, iM3058throws2, objArr5, objArr5);
            } else {
                AbstractC8669l.pro(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.f22810l;
                AbstractC8669l.pro(0, this.f22811l + length3, iM3058throws2, objArr8, objArr8);
            }
        }
        this.f22811l = length2;
        advert(appmetrica(iM3058throws2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m3057package();
        isVip(this.f22809l + 1);
        int length = this.f22811l;
        if (length == 0) {
            length = this.f22810l.length;
        }
        int i = length - 1;
        this.f22811l = i;
        this.f22810l[i] = obj;
        this.f22809l++;
    }

    public final void addLast(Object obj) {
        m3057package();
        isVip(pro() + 1);
        this.f22810l[m3058throws(pro() + this.f22811l)] = obj;
        this.f22809l = pro() + 1;
    }

    public final void advert(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f22810l.length;
        while (i < length && it.hasNext()) {
            this.f22810l[i] = it.next();
            i++;
        }
        int i2 = this.f22811l;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f22810l[i3] = it.next();
        }
        this.f22809l = collection.size() + this.f22809l;
    }

    public final Object applovin() {
        if (isEmpty()) {
            return null;
        }
        return this.f22810l[m3058throws(AbstractC14055l.smaato(this) + this.f22811l)];
    }

    public final int appmetrica(int i) {
        return i < 0 ? i + this.f22810l.length : i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m3057package();
            inmobi(this.f22811l, m3058throws(pro() + this.f22811l));
        }
        this.f22811l = 0;
        this.f22809l = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f22810l[this.f22811l];
        }
        C1759l.firebase("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iPro = pro();
        if (i >= 0 && i < iPro) {
            return this.f22810l[m3058throws(this.f22811l + i)];
        }
        C18262l.adcel(AbstractC12589l.premium(i, iPro, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM3058throws = m3058throws(pro() + this.f22811l);
        int length = this.f22811l;
        if (length < iM3058throws) {
            while (length < iM3058throws) {
                if (AbstractC8576l.yandex(obj, this.f22810l[length])) {
                    i = this.f22811l;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f22811l) < iM3058throws) {
            return -1;
        }
        int length2 = this.f22810l.length;
        while (length < length2) {
            if (AbstractC8576l.yandex(obj, this.f22810l[length])) {
                i = this.f22811l;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM3058throws; i2++) {
            if (AbstractC8576l.yandex(obj, this.f22810l[i2])) {
                length = i2 + this.f22810l.length;
                i = this.f22811l;
            }
        }
        return -1;
        return length - i;
    }

    public final void inmobi(int i, int i2) {
        Object[] objArr = this.f22810l;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.f22810l, 0, i2, (Object) null);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return pro() == 0;
    }

    public final void isVip(int i) {
        if (i < 0) {
            C8339l.smaato("Deque is too big.");
            return;
        }
        Object[] objArr = this.f22810l;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f22808l) {
            if (i < 10) {
                i = 10;
            }
            this.f22810l = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Alert.DURATION_SHOW_INDEFINITELY : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC8669l.pro(0, this.f22811l, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f22810l;
        int length2 = objArr3.length;
        int i3 = this.f22811l;
        AbstractC8669l.pro(length2 - i3, 0, i3, objArr3, objArr2);
        this.f22811l = 0;
        this.f22810l = objArr2;
    }

    public final Object last() {
        if (isEmpty()) {
            C1759l.firebase("ArrayDeque is empty.");
            return null;
        }
        return this.f22810l[m3058throws(AbstractC14055l.smaato(this) + this.f22811l)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iM3058throws = m3058throws(pro() + this.f22811l);
        int i2 = this.f22811l;
        if (i2 < iM3058throws) {
            length = iM3058throws - 1;
            if (i2 <= length) {
                while (!AbstractC8576l.yandex(obj, this.f22810l[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f22811l;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f22811l >= iM3058throws) {
            do {
                iM3058throws--;
                objArr = this.f22810l;
                if (-1 >= iM3058throws) {
                    length = objArr.length - 1;
                    int i3 = this.f22811l;
                    if (i3 <= length) {
                        while (!AbstractC8576l.yandex(obj, this.f22810l[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f22811l;
                    }
                }
                return length - i;
            } while (!AbstractC8576l.yandex(obj, objArr[iM3058throws]));
            length = iM3058throws + this.f22810l.length;
            i = this.f22811l;
            return length - i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m3057package() {
        ((AbstractList) this).modCount++;
    }

    public final int premium(int i) {
        if (i == this.f22810l.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // defpackage.AbstractC6005l
    public final int pro() {
        return this.f22809l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        ad(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM3058throws;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f22810l.length != 0) {
            int iM3058throws2 = m3058throws(pro() + this.f22811l);
            int i = this.f22811l;
            if (i < iM3058throws2) {
                iM3058throws = i;
                while (true) {
                    objArr = this.f22810l;
                    if (i >= iM3058throws2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f22810l[iM3058throws] = obj;
                        iM3058throws++;
                    }
                    i++;
                }
                Arrays.fill(objArr, iM3058throws, iM3058throws2, (Object) null);
            } else {
                int length = this.f22810l.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f22810l;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f22810l[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM3058throws = m3058throws(i2);
                for (int i3 = 0; i3 < iM3058throws2; i3++) {
                    Object[] objArr3 = this.f22810l;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f22810l[iM3058throws] = obj3;
                        iM3058throws = premium(iM3058throws);
                    }
                }
                z = z2;
            }
            if (z) {
                m3057package();
                this.f22809l = appmetrica(iM3058throws - this.f22811l);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            C1759l.firebase("ArrayDeque is empty.");
            return null;
        }
        m3057package();
        Object[] objArr = this.f22810l;
        int i = this.f22811l;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f22811l = premium(i);
        this.f22809l = pro() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            C1759l.firebase("ArrayDeque is empty.");
            return null;
        }
        m3057package();
        int iM3058throws = m3058throws(AbstractC14055l.smaato(this) + this.f22811l);
        Object[] objArr = this.f22810l;
        Object obj = objArr[iM3058throws];
        objArr[iM3058throws] = null;
        this.f22809l = pro() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC15918l.subs(i, i2, this.f22809l);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f22809l) {
            clear();
            return;
        }
        if (i3 == 1) {
            ad(i);
            return;
        }
        m3057package();
        int i4 = this.f22809l - i2;
        int i5 = this.f22811l;
        if (i < i4) {
            int iM3058throws = m3058throws((i - 1) + i5);
            int iM3058throws2 = m3058throws(this.f22811l + (i2 - 1));
            while (i > 0) {
                int i6 = iM3058throws + 1;
                int iMin = Math.min(i, Math.min(i6, iM3058throws2 + 1));
                Object[] objArr = this.f22810l;
                int i7 = iM3058throws2 - iMin;
                int i8 = iM3058throws - iMin;
                AbstractC8669l.pro(i7 + 1, i8 + 1, i6, objArr, objArr);
                iM3058throws = appmetrica(i8);
                iM3058throws2 = appmetrica(i7);
                i -= iMin;
            }
            int iM3058throws3 = m3058throws(this.f22811l + i3);
            inmobi(this.f22811l, iM3058throws3);
            this.f22811l = iM3058throws3;
        } else {
            int iM3058throws4 = m3058throws(i5 + i2);
            int iM3058throws5 = m3058throws(this.f22811l + i);
            int i9 = this.f22809l;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f22810l;
                i2 = Math.min(i9, Math.min(objArr2.length - iM3058throws4, objArr2.length - iM3058throws5));
                Object[] objArr3 = this.f22810l;
                int i10 = iM3058throws4 + i2;
                AbstractC8669l.pro(iM3058throws5, iM3058throws4, i10, objArr3, objArr3);
                iM3058throws4 = m3058throws(i10);
                iM3058throws5 = m3058throws(iM3058throws5 + i2);
            }
            int iM3058throws6 = m3058throws(this.f22809l + this.f22811l);
            inmobi(appmetrica(iM3058throws6 - i3), iM3058throws6);
        }
        this.f22809l -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM3058throws;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f22810l.length != 0) {
            int iM3058throws2 = m3058throws(pro() + this.f22811l);
            int i = this.f22811l;
            if (i < iM3058throws2) {
                iM3058throws = i;
                while (true) {
                    objArr = this.f22810l;
                    if (i >= iM3058throws2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f22810l[iM3058throws] = obj;
                        iM3058throws++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, iM3058throws, iM3058throws2, (Object) null);
            } else {
                int length = this.f22810l.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f22810l;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f22810l[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM3058throws = m3058throws(i2);
                for (int i3 = 0; i3 < iM3058throws2; i3++) {
                    Object[] objArr3 = this.f22810l;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f22810l[iM3058throws] = obj3;
                        iM3058throws = premium(iM3058throws);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m3057package();
                this.f22809l = appmetrica(iM3058throws - this.f22811l);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iPro = pro();
        if (i < 0 || i >= iPro) {
            C18262l.adcel(AbstractC12589l.premium(i, iPro, "index: ", ", size: "));
            return null;
        }
        int iM3058throws = m3058throws(this.f22811l + i);
        Object[] objArr = this.f22810l;
        Object obj2 = objArr[iM3058throws];
        objArr[iM3058throws] = obj;
        return obj2;
    }

    public final Object signatures() {
        if (isEmpty()) {
            return null;
        }
        return this.f22810l[this.f22811l];
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m3058throws(int i) {
        Object[] objArr = this.f22810l;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f22809l;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iM3058throws = m3058throws(this.f22809l + this.f22811l);
        int i2 = this.f22811l;
        if (i2 < iM3058throws) {
            AbstractC8669l.signatures(i2, iM3058throws, 2, this.f22810l, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f22810l;
            AbstractC8669l.pro(0, this.f22811l, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f22810l;
            AbstractC8669l.pro(objArr3.length - this.f22811l, 0, iM3058throws, objArr3, objArr);
        }
        int i3 = this.f22809l;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public C11315l() {
        this.f22810l = f22808l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[pro()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        m3057package();
        isVip(collection.size() + pro());
        advert(m3058throws(pro() + this.f22811l), collection);
        return true;
    }
}
