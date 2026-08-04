package defpackage;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٗؖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16901l extends AbstractC3984l {
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static Object m4208abstract(List list) {
        int size = list.size();
        if (size == 0) {
            C1759l.firebase("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        C8339l.metrica("List has more than one element.");
        return null;
    }

    public static final int applovin(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbSignature = AbstractC2812l.Signature("Position index ", i, " must be in range [");
        sbSignature.append(new C8934l(0, list.size(), 1));
        sbSignature.append("].");
        throw new IndexOutOfBoundsException(sbSignature.toString());
    }

    public static ArrayList appmetrica(int i, List list) {
        AbstractC17463l.purchase(i, i);
        if (!(list instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            Iterator itPurchase = !it.hasNext() ? C17255l.f33480l : AbstractC6900l.purchase(new C16571l(i, i, it, null));
            while (itPurchase.hasNext()) {
                arrayList.add((List) itPurchase.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public static List m4209break(int i, List list) {
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return C2580l.f5619l;
        }
        int size = list.size();
        if (i >= size) {
            return m4213const(list);
        }
        if (i == 1) {
            return Collections.singletonList(m4214continue(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static String m4210case(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i) throws IOException {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        int i2 = (i & 8) != 0 ? -1 : 5;
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        m4211catch(iterable, sb, charSequence2, str3, str4, i2, "...", function1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final void m4211catch(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1) throws IOException {
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                AbstractC15422l.yandex(appendable, obj, function1);
            }
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static Object m4212class(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public static List m4213const(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return AbstractC14055l.startapp(m4230l(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C2580l.f5619l;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static Object m4214continue(List list) {
        if (!list.isEmpty()) {
            return list.get(AbstractC14055l.smaato(list));
        }
        C1759l.firebase("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static ArrayList m4215default(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return m4218final(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC3984l.license(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static /* synthetic */ void m4216else(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i) throws IOException {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            function1 = null;
        }
        m4211catch(iterable, appendable, str4, str5, str6, -1, "...", function1);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static Object m4217extends(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static ArrayList m4218final(Object obj, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public static List m4219finally(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List listM4230l = m4230l(iterable);
            AbstractC3826l.tapsense(listM4230l);
            return listM4230l;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m4213const(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static Object m4220for(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public static Object m4221goto(ArrayList arrayList) {
        AbstractC8502l abstractC8502l = AbstractC4777l.f9804l;
        if (arrayList.isEmpty()) {
            C1759l.firebase("Collection is empty.");
            return null;
        }
        return arrayList.get(AbstractC4777l.f9804l.isPro(arrayList.size()));
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public static int[] m4222implements(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static Object m4223import(Iterable iterable) {
        if (iterable instanceof List) {
            return m4208abstract((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            C1759l.firebase("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        C8339l.metrica("Collection has more than one element.");
        return null;
    }

    public static boolean inmobi(Iterable iterable, Object obj) {
        int iIndexOf;
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                if (AbstractC8576l.yandex(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static Object m4224instanceof(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static ArrayList m4225interface(List list, Object obj) {
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && AbstractC8576l.yandex(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public static ArrayList m4226l(Iterable iterable, List list) {
        Iterator it = list.iterator();
        Iterator it2 = iterable.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC14055l.billing(list, 10), AbstractC14055l.billing(iterable, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C8195l(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public static Set m4227l(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m4235protected(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public static C14297l m4228l(List list) {
        return new C14297l(1, new C13802l(10, list));
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public static Set m4229l(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2200l.firebase(collection.size()));
                m4235protected(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m4235protected(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next());
            }
        }
        return C5746l.f12138l;
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public static final List m4230l(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m4235protected(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static Object m4231native(List list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        C1759l.firebase("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static ArrayList m4232new(Collection collection, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC3984l.license(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static List m4233package(int i, List list) {
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return m4213const(list);
        }
        int size = list.size() - i;
        if (size <= 0) {
            return C2580l.f5619l;
        }
        if (size == 1) {
            return Collections.singletonList(m4241switch(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final int premium(int i, List list) {
        if (i >= 0 && i <= AbstractC14055l.smaato(list)) {
            return AbstractC14055l.smaato(list) - i;
        }
        StringBuilder sbSignature = AbstractC2812l.Signature("Element index ", i, " must be in range [");
        sbSignature.append(new C8934l(0, AbstractC14055l.smaato(list), 1));
        sbSignature.append("].");
        throw new IndexOutOfBoundsException(sbSignature.toString());
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static Object m4234private(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public static final void m4235protected(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static Object m4236public(List list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public static long[] m4237return(AbstractList abstractList) {
        long[] jArr = new long[abstractList.size()];
        Iterator it = abstractList.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static ArrayList m4238static(Iterable iterable, Iterable iterable2) {
        if (iterable instanceof Collection) {
            return m4232new((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC3984l.license(arrayList, iterable);
        AbstractC3984l.license(arrayList, iterable2);
        return arrayList;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static ArrayList m4239strictfp(Collection collection) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static List m4240super(Collection collection) {
        if ((collection instanceof Collection) && collection.size() <= 1) {
            return m4213const(collection);
        }
        List listM4230l = m4230l(collection);
        Collections.reverse(listM4230l);
        return listM4230l;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static Object m4241switch(Iterable iterable) {
        if (iterable instanceof List) {
            return m4214continue((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            C1759l.firebase("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static List m4242synchronized(int i, List list) {
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("Requested element count ", i, " is less than zero."));
            return null;
        }
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return m4247try(list, size);
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public static List m4243this(Iterable iterable, Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List listM4230l = m4230l(iterable);
            AbstractC3826l.Signature(comparator, listM4230l);
            return listM4230l;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m4213const(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static LinkedHashSet m4244throw(Iterable iterable, Iterable iterable2) {
        Collection collectionM4213const = iterable2 instanceof Collection ? (Collection) iterable2 : m4213const(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionM4213const.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static List m4245throws(Iterable iterable) {
        return m4213const(m4227l(iterable));
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static byte[] m4246transient(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public static List m4247try(Iterable iterable, int i) {
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return C2580l.f5619l;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return m4213const(iterable);
            }
            if (i == 1) {
                return Collections.singletonList(m4248volatile(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return AbstractC14055l.startapp(arrayList);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static Object m4248volatile(Iterable iterable) {
        if (iterable instanceof List) {
            return m4231native((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        C1759l.firebase("Collection is empty.");
        return null;
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public static float[] m4249while(Collection collection) {
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }
}
