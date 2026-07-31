package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: lؒۤؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1443l {
    public static final HashMap yandex = new HashMap();
    public static final HashMap loadAd = new HashMap();

    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:69:0x0102  */
    /* JADX WARN: Code duplicated, block: B:72:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x010b  */
    /* JADX WARN: Code duplicated, block: B:77:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int loadAd(Class cls) {
        Constructor declaredConstructor;
        boolean zBooleanValue;
        int i;
        boolean z;
        HashMap map = yandex;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r5 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r5 != null ? r5.getName() : "";
                if (name.length() != 0) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String strConcat = AbstractC16648l.advert(canonicalName, ".", "_", false).concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + "." + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                C11467l.metrica(e);
                return 0;
            }
            HashMap map2 = loadAd;
            if (declaredConstructor != null) {
                map2.put(cls, Collections.singletonList(declaredConstructor));
            } else {
                C4498l c4498l = C4498l.crashlytics;
                HashMap map3 = c4498l.loadAd;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC16020l) declaredMethods[i3].getAnnotation(InterfaceC16020l.class)) != null) {
                                c4498l.yandex(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (!(superclass != null && InterfaceC1711l.class.isAssignableFrom(superclass))) {
                        for (Class<?> cls2 : cls.getInterfaces()) {
                            if (cls2 == null && InterfaceC1711l.class.isAssignableFrom(cls2)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (loadAd(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) map2.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    } else if (loadAd(superclass) != 1) {
                        arrayList = new ArrayList((Collection) map2.get(superclass));
                        while (i < r8) {
                            if (cls2 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (loadAd(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) map2.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i2 = 2;
        }
        map.put(cls, Integer.valueOf(i2));
        return i2;
    }

    public static void yandex(Constructor constructor, InterfaceC1711l interfaceC1711l) {
        try {
            if (constructor.newInstance(interfaceC1711l) == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e) {
            C11467l.metrica(e);
        } catch (InstantiationException e2) {
            C11467l.metrica(e2);
        } catch (InvocationTargetException e3) {
            C11467l.metrica(e3);
        }
    }
}
