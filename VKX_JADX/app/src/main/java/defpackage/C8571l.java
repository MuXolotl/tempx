package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lٌؗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8571l extends AbstractC6441l implements InterfaceC11977l {
    public final Object yandex;

    public C8571l(Object obj) {
        this.yandex = obj;
    }

    public final InterfaceC8657l billing() {
        C3797l c3797l = AbstractC15684l.loadAd;
        Object obj = this.yandex;
        Class cls = null;
        if (c3797l == null) {
            Class<?> cls2 = obj.getClass();
            int i = 27;
            try {
                c3797l = new C3797l(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null), i);
            } catch (NoSuchMethodException unused) {
                c3797l = new C3797l(cls, cls, i);
            }
            AbstractC15684l.loadAd = c3797l;
        }
        Method method = (Method) c3797l.f7903l;
        cls = method != null ? (Class) method.invoke(obj, null) : null;
        if (cls != null) {
            return new C5637l(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // defpackage.AbstractC6441l
    public final Member yandex() {
        C3797l c3797l = AbstractC15684l.loadAd;
        Object obj = this.yandex;
        Method method = null;
        if (c3797l == null) {
            Class<?> cls = obj.getClass();
            int i = 27;
            try {
                c3797l = new C3797l(cls.getMethod("getType", null), cls.getMethod("getAccessor", null), i);
            } catch (NoSuchMethodException unused) {
                c3797l = new C3797l(method, method, i);
            }
            AbstractC15684l.loadAd = c3797l;
        }
        Method method2 = (Method) c3797l.f7902l;
        method = method2 != null ? (Method) method2.invoke(obj, null) : null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }
}
