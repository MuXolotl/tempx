package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lؕۛٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3644l {
    public static final C11140l yandex = new C11140l(29);

    public static final void amazon(AbstractC8237l abstractC8237l, InterfaceC18035l interfaceC18035l) {
        AbstractC8576l.yandex(interfaceC18035l.billing(), C16015l.amazon);
    }

    public static final boolean crashlytics(AbstractC8237l abstractC8237l, InterfaceC18035l interfaceC18035l) {
        if (abstractC8237l.yandex.loadAd) {
            return true;
        }
        List annotations = interfaceC18035l.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC15895l) {
                return true;
            }
        }
        return false;
    }

    public static final int loadAd(InterfaceC18035l interfaceC18035l, AbstractC8237l abstractC8237l, String str, String str2) {
        int iYandex = yandex(interfaceC18035l, abstractC8237l, str);
        if (iYandex != -3) {
            return iYandex;
        }
        throw new C14747l(interfaceC18035l.yandex() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final int yandex(InterfaceC18035l interfaceC18035l, AbstractC8237l abstractC8237l, String str) {
        amazon(abstractC8237l, interfaceC18035l);
        int iAmazon = interfaceC18035l.amazon(str);
        if (iAmazon != -3 || !abstractC8237l.yandex.isPro) {
            return iAmazon;
        }
        C3585l c3585l = abstractC8237l.crashlytics;
        C12242l c12242l = new C12242l(interfaceC18035l, abstractC8237l, 25);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c3585l.f7511l;
        Map map = (Map) concurrentHashMap.get(interfaceC18035l);
        C11140l c11140l = yandex;
        Object obj = map != null ? map.get(c11140l) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = c12242l.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC18035l);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC18035l, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c11140l, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }
}
