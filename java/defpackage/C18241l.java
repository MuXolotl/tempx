package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l٘۟ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18241l {
    public final HashMap loadAd;
    public final HashMap yandex = new HashMap();

    public C18241l(HashMap map) {
        this.loadAd = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC14812l enumC14812l = (EnumC14812l) entry.getValue();
            List arrayList = (List) this.yandex.get(enumC14812l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.yandex.put(enumC14812l, arrayList);
            }
            arrayList.add((C5854l) entry.getKey());
        }
    }

    public static void yandex(List list, InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C5854l c5854l = (C5854l) list.get(size);
                Method method = c5854l.loadAd;
                try {
                    int i = c5854l.yandex;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC3177l);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC3177l, enumC14812l);
                    }
                } catch (IllegalAccessException e) {
                    C11467l.metrica(e);
                    return;
                } catch (InvocationTargetException e2) {
                    C18073l.Signature("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
