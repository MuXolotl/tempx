package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lؚۦٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7654l {
    public final C7367l amazon;
    public final AbstractC14080l crashlytics;
    public final Object loadAd;
    public final Method purchase;
    public final AbstractC14080l yandex;

    public C7654l(AbstractC14080l abstractC14080l, Object obj, AbstractC14080l abstractC14080l2, C7367l c7367l, Class cls) {
        if (abstractC14080l == null) {
            C8339l.metrica("Null containingTypeDefaultInstance");
            throw null;
        }
        if (c7367l.f15279l == EnumC17998l.f35192l && abstractC14080l2 == null) {
            C8339l.metrica("Null messageDefaultInstance");
            throw null;
        }
        this.yandex = abstractC14080l;
        this.loadAd = obj;
        this.crashlytics = abstractC14080l2;
        this.amazon = c7367l;
        if (!InterfaceC1421l.class.isAssignableFrom(cls)) {
            this.purchase = null;
            return;
        }
        try {
            this.purchase = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            C18073l.Signature(AbstractC9361l.ad(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
            throw null;
        }
    }

    public final Object loadAd(Object obj) {
        return this.amazon.f15279l.f35194l == EnumC17173l.f33353l ? Integer.valueOf(((InterfaceC1421l) obj).yandex()) : obj;
    }

    public final Object yandex(Object obj) {
        if (this.amazon.f15279l.f35194l == EnumC17173l.f33353l) {
            Object[] objArr = {(Integer) obj};
            obj = null;
            try {
                return this.purchase.invoke(null, objArr);
            } catch (IllegalAccessException e) {
                C18073l.Signature("Couldn't use Java reflection to implement protocol message reflection.", e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                C18073l.Signature("Unexpected exception thrown by generated accessor method.", cause);
                return null;
            }
        }
        return obj;
    }
}
