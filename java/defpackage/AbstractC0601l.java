package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lْؑۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0601l implements InterfaceC13937l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C11155l f2039l = new C11155l("<v#(\\d+)>");

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static Method m651default(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class clsSubs;
        Method methodM651default;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodM653final = m653final(cls, str, clsArr, cls2);
        if (methodM653final != null) {
            return methodM653final;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodM651default = m651default(superclass, str, clsArr, cls2, z)) != null) {
            return methodM651default;
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            Method methodM651default2 = m651default(cls3, str, clsArr, cls2, z);
            if (methodM651default2 != null) {
                return methodM651default2;
            }
            if (z && (clsSubs = AbstractC16131l.subs(AbstractC1845l.amazon(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodM653final2 = m653final(clsSubs, str, clsArr, cls2);
                if (methodM653final2 != null) {
                    return methodM653final2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static void m652extends(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        int size;
        List listSubList;
        boolean zYandex = AbstractC8576l.yandex(AbstractC16901l.m4212class(arrayList2), AbstractC1753l.class);
        List list = arrayList2;
        if (zYandex) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        if (z2) {
            list = listSubList;
            size = list.size() - 1;
        } else {
            list = listSubList;
            size = list.size();
        }
        arrayList.addAll(list);
        int i = (size + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Integer.TYPE);
        }
        arrayList.add(z ? AbstractC1753l.class : Object.class);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static Method m653final(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC8576l.yandex(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            for (Method method : cls.getDeclaredMethods()) {
                if (AbstractC8576l.yandex(method.getName(), str) && AbstractC8576l.yandex(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public abstract Collection mo654case();

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final Method m655catch(String str, String str2) {
        Method methodM651default;
        if (str.equals("<init>")) {
            return null;
        }
        C10023l c10023lFirebase = AbstractC5592l.firebase(AbstractC1845l.amazon(mo1730private()), str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) c10023lFirebase.f20419l).toArray(new Class[0]);
        Class cls = (Class) c10023lFirebase.f20418l;
        Method methodM651default2 = m651default(mo660interface(), str, clsArr, cls, false);
        if (methodM651default2 != null) {
            return methodM651default2;
        }
        if (!mo660interface().isInterface() || (methodM651default = m651default(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodM651default;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public abstract C6084l mo656class(int i);

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public abstract InterfaceC10696l mo657continue(int i);

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final C6084l m658else(String str, String str2) {
        List list = (List) ((C11400l) ((C9539l) this).f19442l.getValue()).crashlytics.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3984l.license(arrayList, ((C1571l) it.next()).loadAd);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C6084l c6084l = (C6084l) obj;
            if (AbstractC8576l.yandex(c6084l.loadAd, str) && AbstractC8576l.yandex(AbstractC10392l.loadAd(c6084l, this), str2)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sbLicense = AbstractC14814l.license("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            sbLicense.append(this);
            throw new C3150l(sbLicense.toString());
        }
        if (arrayList2.size() <= 1) {
            return (C6084l) AbstractC16901l.m4208abstract(arrayList2);
        }
        StringBuilder sbLicense2 = AbstractC14814l.license("Property '", str, "' (JVM signature: ", str2, ") resolved in several methods in ");
        sbLicense2.append(this);
        throw new C3150l(sbLicense2.toString());
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final C8786l m659for(int i, String str) {
        C6084l c6084lMo656class = mo656class(i);
        if (c6084lMo656class == null) {
            return null;
        }
        if (c6084lMo656class.billing != null) {
            throw new C3150l(AbstractC0653l.ads(new StringBuilder("Local property "), c6084lMo656class.loadAd, " is an extension, which is not yet supported"));
        }
        C13698l c13698l = AbstractC15547l.startapp;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[36];
        return c13698l.m3679package(c6084lMo656class) ? new C8814l(this, str, null, c6084lMo656class) : new C8786l(this, str, null, c6084lMo656class);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public Class mo660interface() {
        Class cls = (Class) AbstractC1845l.crashlytics.get(mo1730private());
        return cls == null ? mo1730private() : cls;
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public abstract Collection mo661static(C3498l c3498l);

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public abstract Collection mo662switch(C3498l c3498l);

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final Method m663throw(String str, String str2, boolean z, boolean z2) {
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo1730private());
        }
        C10023l c10023lFirebase = AbstractC5592l.firebase(AbstractC1845l.amazon(mo1730private()), str2, true);
        m652extends(arrayList, (ArrayList) c10023lFirebase.f20419l, false, z2);
        return m651default(mo660interface(), str.concat("$default"), (Class[]) arrayList.toArray(new Class[0]), (Class) c10023lFirebase.f20418l, z);
    }
}
