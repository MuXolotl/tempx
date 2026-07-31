package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٍَؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9446l {
    protected int memoizedHashCode;

    public static void yandex(List list, List list2) {
        Charset charset = AbstractC6320l.yandex;
        if (list instanceof InterfaceC16123l) {
            list2.addAll(list);
            return;
        }
        if (list2 instanceof ArrayList) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size = list2.size();
        for (Object obj : list) {
            if (obj == null) {
                String str = "Element at index " + (list2.size() - size) + " is null.";
                for (int size2 = list2.size() - 1; size2 >= size; size2--) {
                    list2.remove(size2);
                }
                C6541l.subs(str);
                return;
            }
            list2.add(obj);
        }
    }

    public abstract int loadAd(InterfaceC9608l interfaceC9608l);
}
