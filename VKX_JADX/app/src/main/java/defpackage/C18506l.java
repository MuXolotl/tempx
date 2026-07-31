package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: lۖۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18506l extends AbstractC16819l {
    @Override // defpackage.AbstractC16819l
    public final boolean adcel() {
        if (!super.adcel()) {
            return false;
        }
        try {
            Class<?> cls = this.yandex.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            AbstractC0357l.yandex(th);
            return false;
        }
    }

    @Override // defpackage.AbstractC16819l
    public final boolean ads() {
        Unsafe unsafe = this.yandex;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC0357l.mopub() != null) {
                    try {
                        Class<?> cls3 = this.yandex.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        AbstractC0357l.yandex(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                AbstractC0357l.yandex(th2);
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC16819l
    public final double amazon(long j, Object obj) {
        return this.yandex.getDouble(obj, j);
    }

    @Override // defpackage.AbstractC16819l
    public final boolean crashlytics(long j, Object obj) {
        return this.yandex.getBoolean(obj, j);
    }

    @Override // defpackage.AbstractC16819l
    public final void firebase(Object obj, long j, byte b) {
        this.yandex.putByte(obj, j, b);
    }

    @Override // defpackage.AbstractC16819l
    public final void isPro(Object obj, long j, boolean z) {
        this.yandex.putBoolean(obj, j, z);
    }

    @Override // defpackage.AbstractC16819l
    public final float purchase(long j, Object obj) {
        return this.yandex.getFloat(obj, j);
    }

    @Override // defpackage.AbstractC16819l
    public final void remoteconfig(Object obj, long j, float f) {
        this.yandex.putFloat(obj, j, f);
    }

    @Override // defpackage.AbstractC16819l
    public final void smaato(Object obj, long j, double d) {
        this.yandex.putDouble(obj, j, d);
    }
}
