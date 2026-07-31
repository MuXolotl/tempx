package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: lٜؒٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1186l extends AbstractC5511l implements List, RandomAccess, j$.util.List {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C9258l f3181l = new C9258l(C13708l.f26763l, 0);

    public static AbstractC1186l Signature(Collection collection) {
        if (!(collection instanceof AbstractC5511l)) {
            Object[] array = collection.toArray();
            AbstractC13743l.yandex(array.length, array);
            return vip(array.length, array);
        }
        AbstractC1186l abstractC1186lAmazon = ((AbstractC5511l) collection).amazon();
        if (!abstractC1186lAmazon.smaato()) {
            return abstractC1186lAmazon;
        }
        Object[] array2 = abstractC1186lAmazon.toArray(AbstractC5511l.f11780l);
        return vip(array2.length, array2);
    }

    public static C16971l ads(int i) {
        AbstractC12832l.loadAd(i, "expectedSize");
        return new C16971l(i);
    }

    public static C13708l advert(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        AbstractC13743l.yandex(5, objArr);
        return vip(5, objArr);
    }

    public static C13708l appmetrica(Comparator comparator, List list) {
        comparator.getClass();
        if (!AbstractC2812l.advert(list)) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        AbstractC13743l.yandex(array.length, array);
        Arrays.sort(array, comparator);
        return vip(array.length, array);
    }

    public static C13708l isVip(Object obj) {
        Object[] objArr = {obj};
        AbstractC13743l.yandex(1, objArr);
        return vip(1, objArr);
    }

    public static C16971l metrica() {
        return new C16971l(4);
    }

    public static C13708l premium(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        AbstractC12442l.subs(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        AbstractC13743l.yandex(length, objArr2);
        return vip(length, objArr2);
    }

    public static C13708l pro(Object[] objArr) {
        if (objArr.length == 0) {
            return C13708l.f26763l;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC13743l.yandex(objArr2.length, objArr2);
        return vip(objArr2.length, objArr2);
    }

    public static C13708l signatures(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC13743l.yandex(2, objArr);
        return vip(2, objArr);
    }

    public static AbstractC1186l tapsense(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return Signature((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C13708l.f26763l;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return isVip(next);
        }
        C16971l c16971l = new C16971l(4);
        c16971l.crashlytics(next);
        while (it.hasNext()) {
            c16971l.crashlytics(it.next());
        }
        return c16971l.mopub();
    }

    public static C13708l vip(int i, Object[] objArr) {
        return i == 0 ? C13708l.f26763l : new C13708l(i, objArr);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final C9258l listIterator(int i) {
        AbstractC12442l.startapp(i, size());
        return isEmpty() ? f3181l : new C9258l(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public AbstractC1186l applovin() {
        return size() <= 1 ? this : new C4774l(this);
    }

    @Override // defpackage.AbstractC5511l
    public int billing(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && AbstractC7000l.loadAd(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (AbstractC7000l.loadAd(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: inmobi, reason: merged with bridge method [inline-methods] */
    public AbstractC1186l subList(int i, int i2) {
        AbstractC12442l.adcel(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? C13708l.f26763l : new C1729l(this, i, i3);
    }

    @Override // defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC5511l
    /* JADX INFO: renamed from: remoteconfig */
    public final AbstractC10199l iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        j$.util.List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        j$.util.List.CC.$default$sort(this, comparator);
    }

    @Override // defpackage.AbstractC5511l
    public final AbstractC1186l amazon() {
        return this;
    }
}
