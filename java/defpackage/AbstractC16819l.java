package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: lٗؐٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16819l {
    public final Unsafe yandex;

    public AbstractC16819l(Unsafe unsafe) {
        this.yandex = unsafe;
    }

    public boolean adcel() {
        Unsafe unsafe = this.yandex;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            AbstractC0357l.yandex(th);
            return false;
        }
    }

    public final Object admob(long j, Object obj) {
        return this.yandex.getObject(obj, j);
    }

    public abstract boolean ads();

    public abstract double amazon(long j, Object obj);

    public final int billing(long j, Object obj) {
        return this.yandex.getInt(obj, j);
    }

    public abstract boolean crashlytics(long j, Object obj);

    public abstract void firebase(Object obj, long j, byte b);

    public abstract void isPro(Object obj, long j, boolean z);

    public final int loadAd(Class cls) {
        return this.yandex.arrayIndexScale(cls);
    }

    public final void metrica(long j, long j2, Object obj) {
        this.yandex.putLong(obj, j, j2);
    }

    public final long mopub(long j, Object obj) {
        return this.yandex.getLong(obj, j);
    }

    public abstract float purchase(long j, Object obj);

    public abstract void remoteconfig(Object obj, long j, float f);

    public abstract void smaato(Object obj, long j, double d);

    public final void startapp(long j, Object obj, Object obj2) {
        this.yandex.putObject(obj, j, obj2);
    }

    public final long subs(Field field) {
        return this.yandex.objectFieldOffset(field);
    }

    public final void vip(long j, Object obj, int i) {
        this.yandex.putInt(obj, j, i);
    }

    public final int yandex(Class cls) {
        return this.yandex.arrayBaseOffset(cls);
    }
}
