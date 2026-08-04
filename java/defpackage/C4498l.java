package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4498l {
    public static final C4498l crashlytics = new C4498l();
    public final HashMap yandex = new HashMap();
    public final HashMap loadAd = new HashMap();

    public static void loadAd(HashMap map, C5854l c5854l, EnumC14812l enumC14812l, Class cls) {
        EnumC14812l enumC14812l2 = (EnumC14812l) map.get(c5854l);
        if (enumC14812l2 == null || enumC14812l == enumC14812l2) {
            if (enumC14812l2 == null) {
                map.put(c5854l, enumC14812l);
            }
        } else {
            String name = c5854l.loadAd.getName();
            String name2 = cls.getName();
            C8339l.metrica(AbstractC9361l.ad(AbstractC14814l.license("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(enumC14812l2), ", new value ", String.valueOf(enumC14812l)));
        }
    }

    public final C18241l yandex(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.yandex;
        if (superclass != null) {
            C18241l c18241lYandex = (C18241l) map2.get(superclass);
            if (c18241lYandex == null) {
                c18241lYandex = yandex(superclass, null);
            }
            map.putAll(c18241lYandex.loadAd);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C18241l c18241lYandex2 = (C18241l) map2.get(cls2);
            if (c18241lYandex2 == null) {
                c18241lYandex2 = yandex(cls2, null);
            }
            for (Map.Entry entry : c18241lYandex2.loadAd.entrySet()) {
                loadAd(map, (C5854l) entry.getKey(), (EnumC14812l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC16020l interfaceC16020l = (InterfaceC16020l) method.getAnnotation(InterfaceC16020l.class);
            if (interfaceC16020l != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC3177l.class.isAssignableFrom(parameterTypes[0])) {
                        C8339l.metrica("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                EnumC14812l enumC14812lValue = interfaceC16020l.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC14812l.class.isAssignableFrom(parameterTypes[1])) {
                        C8339l.metrica("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (enumC14812lValue != EnumC14812l.ON_ANY) {
                        C8339l.metrica("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    C8339l.metrica("cannot have more than 2 params");
                    return null;
                }
                loadAd(map, new C5854l(i, method), enumC14812lValue, cls);
                z = true;
            }
        }
        C18241l c18241l = new C18241l(map);
        map2.put(cls, c18241l);
        this.loadAd.put(cls, Boolean.valueOf(z));
        return c18241l;
    }
}
