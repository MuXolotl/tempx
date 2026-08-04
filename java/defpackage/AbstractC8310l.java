package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: lً۠ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8310l {
    public static final C10038l yandex = new C10038l(9);

    static {
        try {
            Iterator it = Arrays.asList(new C13456l()).iterator();
            while (it.hasNext()) {
                ((C13456l) it.next()).getClass();
                C8688l c8688l = AbstractC15030l.yandex;
                C10038l c10038l = yandex;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c10038l.f20463l;
                if (linkedHashMap.containsKey(100)) {
                    C8339l.metrica("Provider with priority 100 already registered. Every registered provider should have unique priority.");
                    return;
                } else {
                    if (((C8688l) c10038l.f20462l).yandex()) {
                        C8339l.smaato("Cannot register provider after `getRegisteredProviders` was called");
                        return;
                    }
                    linkedHashMap.put(100, c8688l);
                }
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
