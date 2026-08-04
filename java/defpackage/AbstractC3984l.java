package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3984l extends AbstractC3826l {
    public static void ad(List list, Function1 function1) {
        int iSmaato;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC2356l) && !(list instanceof InterfaceC5461l)) {
                AbstractC9464l.vip(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int iSmaato2 = AbstractC14055l.smaato(list);
        int i = 0;
        if (iSmaato2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iSmaato2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iSmaato = AbstractC14055l.smaato(list))) {
            return;
        }
        while (true) {
            list.remove(iSmaato);
            if (iSmaato == i) {
                return;
            } else {
                iSmaato--;
            }
        }
    }

    public static void advert(List list) {
        if (list.isEmpty()) {
            C1759l.firebase("List is empty.");
        } else {
            list.remove(0);
        }
    }

    public static Object isVip(List list) {
        if (!list.isEmpty()) {
            return list.remove(AbstractC14055l.smaato(list));
        }
        C1759l.firebase("List is empty.");
        return null;
    }

    public static void license(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void pro(List list, Object[] objArr) {
        list.addAll(Arrays.asList(objArr));
    }

    public static Object signatures(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(AbstractC14055l.smaato(abstractList));
    }
}
