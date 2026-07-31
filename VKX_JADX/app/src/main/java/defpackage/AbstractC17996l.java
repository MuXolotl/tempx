package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؙ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17996l {
    public static final List yandex = AbstractC14055l.remoteconfig(Application.class, C1453l.class);
    public static final List loadAd = Collections.singletonList(C1453l.class);

    public static final AbstractC4350l loadAd(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC4350l) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            C18073l.Signature(AbstractC0653l.startapp(cls, "Failed to access "), e);
            return null;
        } catch (InstantiationException e2) {
            C18073l.Signature(AbstractC14814l.metrica(cls, "A ", " cannot be instantiated."), e2);
            return null;
        } catch (InvocationTargetException e3) {
            C18073l.Signature(AbstractC0653l.startapp(cls, "An exception happened in constructor of "), e3.getCause());
            return null;
        }
    }

    public static final Constructor yandex(Class cls, List list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List listM2415super = AbstractC8669l.m2415super(constructor.getParameterTypes());
            if (list.equals(listM2415super)) {
                return constructor;
            }
            if (list.size() == listM2415super.size() && listM2415super.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
