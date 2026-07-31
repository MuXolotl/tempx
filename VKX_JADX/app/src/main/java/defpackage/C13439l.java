package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: lْٗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13439l {
    public static final C5128l loadAd = new C5128l(0);
    public final /* synthetic */ C13734l yandex;

    public C13439l(C13734l c13734l) {
        this.yandex = c13734l;
    }

    public static Class crashlytics(ClassLoader classLoader, String str) {
        try {
            return loadAd(classLoader, str);
        } catch (ClassCastException e) {
            throw new C6451l(4, AbstractC15560l.Signature("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C6451l(4, AbstractC15560l.Signature("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public static Class loadAd(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C5128l c5128l = loadAd;
        C5128l c5128l2 = (C5128l) c5128l.get(classLoader);
        if (c5128l2 == null) {
            c5128l2 = new C5128l(0);
            c5128l.put(classLoader, c5128l2);
        }
        Class cls = (Class) c5128l2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c5128l2.put(str, cls2);
        return cls2;
    }

    public final AbstractComponentCallbacksC4411l yandex(String str) {
        try {
            return (AbstractComponentCallbacksC4411l) crashlytics(this.yandex.pro.f13181l.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C6451l(4, AbstractC15560l.Signature("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C6451l(4, AbstractC15560l.Signature("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C6451l(4, AbstractC15560l.Signature("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C6451l(4, AbstractC15560l.Signature("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
