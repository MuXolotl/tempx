package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: lؖٙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4208l {
    public static final Method loadAd;
    public static final Method yandex;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i];
            if (AbstractC8576l.yandex(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (AbstractC8576l.yandex(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i++;
        }
        yandex = method2;
        for (Method method3 : methods) {
            if (AbstractC8576l.yandex(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        loadAd = method;
    }
}
