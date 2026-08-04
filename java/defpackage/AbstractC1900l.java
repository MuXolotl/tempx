package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: lۣؓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1900l {
    public static final boolean amazon;
    public static final long billing;
    public static final AbstractC11402l crashlytics;
    public static final Class loadAd;
    public static final boolean mopub;
    public static final boolean purchase;
    public static final Unsafe yandex;

    static {
        Unsafe unsafeIsPro = isPro();
        yandex = unsafeIsPro;
        loadAd = AbstractC10330l.yandex;
        boolean zBilling = billing(Long.TYPE);
        boolean zBilling2 = billing(Integer.TYPE);
        boolean z = true;
        int i = 0;
        AbstractC11402l c17245l = null;
        if (unsafeIsPro != null) {
            if (!AbstractC10330l.yandex()) {
                c17245l = new C17245l(unsafeIsPro);
            } else if (zBilling) {
                c17245l = new C13078l(unsafeIsPro, z ? 1 : 0);
            } else if (zBilling2) {
                c17245l = new C13078l(unsafeIsPro, i);
            }
        }
        crashlytics = c17245l;
        amazon = c17245l == null ? false : c17245l.subscription();
        purchase = c17245l == null ? false : c17245l.ads();
        billing = crashlytics(byte[].class);
        crashlytics(boolean[].class);
        amazon(boolean[].class);
        crashlytics(int[].class);
        amazon(int[].class);
        crashlytics(long[].class);
        amazon(long[].class);
        crashlytics(float[].class);
        amazon(float[].class);
        crashlytics(double[].class);
        amazon(double[].class);
        crashlytics(Object[].class);
        amazon(Object[].class);
        Field fieldPurchase = purchase();
        if (fieldPurchase != null && c17245l != null) {
            c17245l.isPro(fieldPurchase);
        }
        mopub = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static byte admob(long j, Object obj) {
        return (byte) ((crashlytics.mopub((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static void amazon(Class cls) {
        if (purchase) {
            crashlytics.loadAd(cls);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean billing(Class cls) {
        if (!AbstractC10330l.yandex()) {
            return false;
        }
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

    public static int crashlytics(Class cls) {
        if (purchase) {
            return crashlytics.yandex(cls);
        }
        return -1;
    }

    public static void firebase(byte[] bArr, long j, byte b) {
        crashlytics.smaato(bArr, billing + j, b);
    }

    public static Unsafe isPro() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4501l());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object loadAd(Class cls) {
        try {
            return yandex.allocateInstance(cls);
        } catch (InstantiationException e) {
            C11983l.ads(e);
            return null;
        }
    }

    public static void metrica(long j, long j2, Object obj) {
        crashlytics.startapp(j, j2, obj);
    }

    public static byte mopub(long j, byte[] bArr) {
        return crashlytics.amazon(billing + j, bArr);
    }

    public static Field purchase() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC10330l.yandex()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static void remoteconfig(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        vip(j2, obj, ((255 & b) << i) | (crashlytics.mopub(j2, obj) & (~(255 << i))));
    }

    public static void smaato(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iMopub = crashlytics.mopub(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        vip(j2, obj, ((255 & b) << i) | (iMopub & (~(255 << i))));
    }

    public static void startapp(long j, Object obj, Object obj2) {
        crashlytics.adcel(j, obj, obj2);
    }

    public static byte subs(long j, Object obj) {
        return (byte) ((crashlytics.mopub((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static void vip(long j, Object obj, int i) {
        crashlytics.metrica(j, obj, i);
    }

    public static void yandex(Throwable th) {
        Logger.getLogger(AbstractC1900l.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }
}
