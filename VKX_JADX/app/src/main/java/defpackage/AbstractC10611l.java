package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: lَ۠ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10611l {
    public static final boolean amazon;
    public static final long billing;
    public static final AbstractC6809l crashlytics;
    public static final Class loadAd;
    public static final boolean mopub;
    public static final boolean purchase;
    public static final Unsafe yandex;

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        char c;
        boolean z;
        AbstractC6809l abstractC6809l;
        Unsafe unsafeSubs = subs();
        yandex = unsafeSubs;
        int i = AbstractC13973l.yandex;
        loadAd = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zMetrica = metrica(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean zMetrica2 = metrica(cls2);
        AbstractC6809l c7593l = null;
        if (unsafeSubs != null) {
            if (zMetrica) {
                c7593l = new C10232l(unsafeSubs);
            } else if (zMetrica2) {
                c7593l = new C7593l(unsafeSubs);
            }
        }
        crashlytics = c7593l;
        boolean z2 = false;
        if (c7593l == null) {
            c = 0;
        } else {
            try {
                Class<?> cls3 = c7593l.yandex.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (loadAd() == null) {
                    c = 0;
                } else {
                    c = 0;
                    z2 = true;
                }
            } catch (Throwable th) {
                c = 0;
                Logger.getLogger(AbstractC10611l.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                z2 = false;
            }
        }
        amazon = z2;
        AbstractC6809l abstractC6809l2 = crashlytics;
        if (abstractC6809l2 == null) {
            z = c;
        } else {
            try {
                Class<?> cls4 = abstractC6809l2.yandex.getClass();
                Class<?>[] clsArr = new Class[1];
                clsArr[c] = Field.class;
                cls4.getMethod("objectFieldOffset", clsArr);
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[c] = Class.class;
                cls4.getMethod("arrayBaseOffset", clsArr2);
                Class<?>[] clsArr3 = new Class[1];
                clsArr3[c] = Class.class;
                cls4.getMethod("arrayIndexScale", clsArr3);
                Class<?>[] clsArr4 = new Class[2];
                clsArr4[c] = Object.class;
                clsArr4[1] = cls;
                cls4.getMethod("getInt", clsArr4);
                Class<?>[] clsArr5 = new Class[3];
                clsArr5[c] = Object.class;
                clsArr5[1] = cls;
                clsArr5[2] = cls2;
                cls4.getMethod("putInt", clsArr5);
                Class<?>[] clsArr6 = new Class[2];
                clsArr6[c] = Object.class;
                clsArr6[1] = cls;
                cls4.getMethod("getLong", clsArr6);
                Class<?>[] clsArr7 = new Class[3];
                clsArr7[c] = Object.class;
                clsArr7[1] = cls;
                clsArr7[2] = cls;
                cls4.getMethod("putLong", clsArr7);
                Class<?>[] clsArr8 = new Class[2];
                clsArr8[c] = Object.class;
                clsArr8[1] = cls;
                cls4.getMethod("getObject", clsArr8);
                Class<?>[] clsArr9 = new Class[3];
                clsArr9[c] = Object.class;
                clsArr9[1] = cls;
                clsArr9[2] = Object.class;
                cls4.getMethod("putObject", clsArr9);
                z = 1;
            } catch (Throwable th2) {
                Logger.getLogger(AbstractC10611l.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = c;
            }
        }
        purchase = z;
        billing = startapp(byte[].class);
        startapp(boolean[].class);
        yandex(boolean[].class);
        startapp(int[].class);
        yandex(int[].class);
        startapp(long[].class);
        yandex(long[].class);
        startapp(float[].class);
        yandex(float[].class);
        startapp(double[].class);
        yandex(double[].class);
        startapp(Object[].class);
        yandex(Object[].class);
        Field fieldLoadAd = loadAd();
        if (fieldLoadAd != null && (abstractC6809l = crashlytics) != null) {
            abstractC6809l.yandex.objectFieldOffset(fieldLoadAd);
        }
        mopub = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN ? c : 1;
    }

    public static Object admob(long j, Object obj) {
        return crashlytics.yandex.getObject(obj, j);
    }

    public static void amazon(Object obj, long j, byte b) {
        AbstractC6809l abstractC6809l = crashlytics;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        abstractC6809l.yandex.putInt(obj, j2, ((255 & b) << i) | (abstractC6809l.yandex.getInt(obj, j2) & (~(255 << i))));
    }

    public static long billing(long j, Object obj) {
        return crashlytics.yandex.getLong(obj, j);
    }

    public static void crashlytics(Object obj, long j, byte b) {
        AbstractC6809l abstractC6809l = crashlytics;
        long j2 = (-4) & j;
        int i = abstractC6809l.yandex.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        abstractC6809l.yandex.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    public static void firebase(long j, long j2, Object obj) {
        crashlytics.yandex.putLong(obj, j, j2);
    }

    public static void isPro(long j, Object obj, int i) {
        crashlytics.yandex.putInt(obj, j, i);
    }

    public static Field loadAd() {
        Field declaredField;
        Field declaredField2;
        int i = AbstractC13973l.yandex;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean metrica(Class cls) {
        int i = AbstractC13973l.yandex;
        try {
            Class cls2 = loadAd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object mopub(Class cls) {
        try {
            return yandex.allocateInstance(cls);
        } catch (InstantiationException e) {
            C11983l.ads(e);
            return null;
        }
    }

    public static int purchase(long j, Object obj) {
        return crashlytics.yandex.getInt(obj, j);
    }

    public static /* bridge */ /* synthetic */ boolean remoteconfig(long j, Object obj) {
        return ((byte) ((crashlytics.yandex.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static void smaato(long j, Object obj, Object obj2) {
        crashlytics.yandex.putObject(obj, j, obj2);
    }

    public static int startapp(Class cls) {
        if (purchase) {
            return crashlytics.yandex.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe subs() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C5414l());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ boolean vip(long j, Object obj) {
        return ((byte) ((crashlytics.yandex.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static void yandex(Class cls) {
        if (purchase) {
            crashlytics.yandex.arrayIndexScale(cls);
        }
    }
}
