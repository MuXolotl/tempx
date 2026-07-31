package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lَٛٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10409l {
    public static final InterfaceC17242l admob(InterfaceC17242l interfaceC17242l, int i) {
        return interfaceC17242l.premium(new C15274l(i));
    }

    public static String amazon(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static short billing(int i) {
        return (short) ((i - (((short) (62209 * i)) * 3329)) >> 16);
    }

    public static C10328l crashlytics() {
        return (C10328l) C10328l.purchase.getValue();
    }

    public static final Field loadAd(Class cls) {
        Field field;
        Field fieldLoadAd;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (AbstractC8576l.yandex(field.getName(), "ucp") && field.getType().getSimpleName().equals("URLClassPath")) {
                break;
            }
            i++;
        }
        if (field != null) {
            return field;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || (fieldLoadAd = loadAd(superclass)) == null) {
            return null;
        }
        return fieldLoadAd;
    }

    public static final ArrayList mopub(ClassLoader classLoader) throws IOException {
        ArrayList arrayListYandex = new C7327l(classLoader).yandex();
        ArrayList<String> arrayList = new ArrayList(AbstractC14055l.billing(arrayListYandex, 10));
        Iterator it = arrayListYandex.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).replace('.', '/'));
        }
        HashSet hashSet = new HashSet();
        for (String str : arrayList) {
            List listM3323finally = AbstractC12024l.m3323finally(str, new char[]{'/'});
            C8934l c8934l = new C8934l(1, listM3323finally.size(), 1);
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(c8934l, 10));
            Iterator it2 = c8934l.iterator();
            while (true) {
                C16991l c16991l = (C16991l) it2;
                if (c16991l.f33123l) {
                    arrayList2.add(AbstractC16901l.m4210case(listM3323finally.subList(0, c16991l.nextInt()), "/", null, null, null, 62));
                }
            }
            AbstractC3984l.license(hashSet, AbstractC16901l.m4218final(str, arrayList2));
        }
        ArrayList arrayListM4218final = AbstractC16901l.m4218final("", AbstractC16901l.m4243this(hashSet, new C13617l(11)));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayListM4218final.iterator();
        while (it3.hasNext()) {
            Enumeration<URL> resources = classLoader.getResources((String) it3.next());
            AbstractC3984l.license(arrayList3, resources != null ? Collections.list(resources) : C2580l.f5619l);
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (hashSet2.add(AbstractC12024l.m3351while(((URL) obj).getPath(), '!'))) {
                arrayList4.add(obj);
            }
        }
        return arrayList4;
    }

    public static final InterfaceC17242l purchase(InterfaceC17242l interfaceC17242l) {
        return interfaceC17242l.premium(new C11056l());
    }

    public static final Set yandex(ClassLoader classLoader) {
        Method method;
        ClassLoader parent = classLoader.getParent();
        Set setYandex = parent != null ? yandex(parent) : C5746l.f12138l;
        if (classLoader instanceof URLClassLoader) {
            return AbstractC9905l.mopub(AbstractC16901l.m4229l(AbstractC8669l.m2420volatile(((URLClassLoader) classLoader).getURLs())), setYandex);
        }
        Iterable iterableMopub = null;
        try {
            try {
                Field fieldLoadAd = loadAd(classLoader.getClass());
                if (fieldLoadAd != null) {
                    fieldLoadAd.setAccessible(true);
                    Object obj = fieldLoadAd.get(classLoader);
                    if (obj != null && (method = obj.getClass().getMethod("getURLs", null)) != null) {
                        method.setAccessible(true);
                        URL[] urlArr = (URL[]) method.invoke(obj, null);
                        if (urlArr != null) {
                            iterableMopub = AbstractC8669l.m2415super(urlArr);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            iterableMopub = mopub(classLoader);
        }
        return iterableMopub == null ? setYandex : AbstractC9905l.mopub(setYandex, iterableMopub);
    }
}
