package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lٍَۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9905l {
    public static final InterfaceC14029l[] yandex = new InterfaceC14029l[0];
    public static final Object loadAd = new Object();

    public static LinkedHashSet admob(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2200l.firebase(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static LinkedHashSet amazon(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2200l.firebase(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && AbstractC8576l.yandex(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set billing(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2200l.firebase(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static final boolean crashlytics(InterfaceC6272l interfaceC6272l) {
        return interfaceC6272l.admob();
    }

    public static List loadAd(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
    }

    public static LinkedHashSet mopub(Set set, Iterable iterable) {
        int size;
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2200l.firebase(size));
        linkedHashSet.addAll(set);
        AbstractC3984l.license(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static Set purchase(Set set, Iterable iterable) {
        Collection<?> collectionM4213const = iterable instanceof Collection ? (Collection) iterable : AbstractC16901l.m4213const(iterable);
        if (collectionM4213const.isEmpty()) {
            return AbstractC16901l.m4229l(set);
        }
        if (!(collectionM4213const instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM4213const);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionM4213const).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static String subs(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strAds;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strAds = "null";
            } else {
                try {
                    strAds = obj.toString();
                } catch (Exception e) {
                    String strPro = AbstractC9361l.pro(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strPro), (Throwable) e);
                    strAds = AbstractC14814l.ads("<", strPro, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strAds;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static C4344l yandex(C4344l c4344l) {
        C17963l c17963l = c4344l.f8870l;
        c17963l.crashlytics();
        return c17963l.f34966l > 0 ? c4344l : C4344l.f8869l;
    }
}
