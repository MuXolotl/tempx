package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lؒٙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1126l implements InvocationHandler {
    public final C8688l amazon;
    public final C8688l crashlytics;
    public final Map loadAd;
    public final List purchase;
    public final Class yandex;

    public C1126l(Class cls, Map map, C8688l c8688l, C8688l c8688l2, List list) {
        this.yandex = cls;
        this.loadAd = map;
        this.crashlytics = c8688l;
        this.amazon = c8688l2;
        this.purchase = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zEquals;
        boolean z;
        InterfaceC1388l interfaceC1388lBilling;
        String name = method.getName();
        Class cls = this.yandex;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.amazon.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.crashlytics.getValue();
            }
        }
        boolean zYandex = AbstractC8576l.yandex(name, "equals");
        Map map = this.loadAd;
        boolean z2 = false;
        if (!zYandex || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(AbstractC8669l.m2415super(objArr));
            sb.append(')');
            throw new C3150l(sb.toString());
        }
        Object objM2401default = AbstractC8669l.m2401default(objArr);
        Annotation annotation = objM2401default instanceof Annotation ? (Annotation) objM2401default : null;
        if (AbstractC8576l.yandex((annotation == null || (interfaceC1388lBilling = AbstractC16131l.billing(annotation)) == null) ? null : ((InterfaceC13937l) interfaceC1388lBilling).mo1730private(), cls)) {
            List list = this.purchase;
            if (list != null && list.isEmpty()) {
                z = true;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                Method method2 = (Method) it.next();
                Object obj2 = map.get(method2.getName());
                Object objInvoke = method2.invoke(objM2401default, null);
                if (obj2 instanceof boolean[]) {
                    zEquals = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    zEquals = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    zEquals = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    zEquals = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    zEquals = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    zEquals = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    zEquals = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    zEquals = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else {
                    zEquals = obj2 instanceof Object[] ? Arrays.equals((Object[]) obj2, (Object[]) objInvoke) : AbstractC8576l.yandex(obj2, objInvoke);
                }
                if (!zEquals) {
                    z = false;
                    break;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
