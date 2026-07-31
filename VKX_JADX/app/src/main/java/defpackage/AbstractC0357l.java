package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: lِٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0357l {
    public static final boolean amazon;
    public static final long billing;
    public static final AbstractC16819l crashlytics;
    public static final Class loadAd;
    public static final boolean mopub;
    public static final boolean purchase;
    public static final Unsafe yandex;

    static {
        Unsafe unsafeSubs = subs();
        yandex = unsafeSubs;
        loadAd = AbstractC16910l.yandex;
        boolean zAdmob = admob(Long.TYPE);
        boolean zAdmob2 = admob(Integer.TYPE);
        boolean z = true;
        int i = 0;
        AbstractC16819l c18506l = null;
        if (unsafeSubs != null) {
            if (!AbstractC16910l.yandex()) {
                c18506l = new C18506l(unsafeSubs);
            } else if (zAdmob) {
                c18506l = new C9406l(unsafeSubs, z ? 1 : 0);
            } else if (zAdmob2) {
                c18506l = new C9406l(unsafeSubs, i);
            }
        }
        crashlytics = c18506l;
        amazon = c18506l == null ? false : c18506l.ads();
        purchase = c18506l == null ? false : c18506l.adcel();
        billing = purchase(byte[].class);
        purchase(boolean[].class);
        billing(boolean[].class);
        purchase(int[].class);
        billing(int[].class);
        purchase(long[].class);
        billing(long[].class);
        purchase(float[].class);
        billing(float[].class);
        purchase(double[].class);
        billing(double[].class);
        purchase(Object[].class);
        billing(Object[].class);
        Field fieldMopub = mopub();
        if (fieldMopub != null && c18506l != null) {
            c18506l.subs(fieldMopub);
        }
        mopub = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean admob(Class cls) {
        if (!AbstractC16910l.yandex()) {
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

    public static Object amazon(Class cls) {
        try {
            return yandex.allocateInstance(cls);
        } catch (InstantiationException e) {
            C11983l.ads(e);
            return null;
        }
    }

    public static void billing(Class cls) {
        if (purchase) {
            crashlytics.loadAd(cls);
        }
    }

    public static boolean crashlytics(long j, Object obj) {
        return ((byte) ((crashlytics.billing((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static void firebase(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iBilling = crashlytics.billing(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        remoteconfig(j2, obj, ((255 & b) << i) | (iBilling & (~(255 << i))));
    }

    public static void isPro(byte[] bArr, long j, byte b) {
        crashlytics.firebase(bArr, billing + j, b);
    }

    public static boolean loadAd(long j, Object obj) {
        return ((byte) ((crashlytics.billing((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static void metrica(long j, Object obj, Object obj2) {
        crashlytics.startapp(j, obj, obj2);
    }

    public static Field mopub() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC16910l.yandex()) {
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

    public static int purchase(Class cls) {
        if (purchase) {
            return crashlytics.yandex(cls);
        }
        return -1;
    }

    public static void remoteconfig(long j, Object obj, int i) {
        crashlytics.vip(j, obj, i);
    }

    public static void smaato(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        remoteconfig(j2, obj, ((255 & b) << i) | (crashlytics.billing(j2, obj) & (~(255 << i))));
    }

    public static Unsafe subs() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C6927l());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void vip(long j, long j2, Object obj) {
        crashlytics.metrica(j, j2, obj);
    }

    public static void yandex(Throwable th) {
        Logger.getLogger(AbstractC0357l.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
