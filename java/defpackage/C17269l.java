package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: renamed from: lٗٝؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17269l extends AbstractC2133l {
    public static final Method amazon;
    public static final Constructor crashlytics;
    public static final Class loadAd;
    public static final Method purchase;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        crashlytics = constructor;
        loadAd = cls;
        amazon = method2;
        purchase = method;
    }

    public static Typeface firebase(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) loadAd, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) purchase.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean isPro(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) amazon.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.AbstractC2133l
    public final Typeface amazon(Context context, C5882l[] c5882lArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = crashlytics.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C5128l c5128l = new C5128l(0);
            for (C5882l c5882l : c5882lArr) {
                Uri uri = c5882l.yandex;
                ByteBuffer byteBufferPurchase = (ByteBuffer) c5128l.get(uri);
                if (byteBufferPurchase == null) {
                    byteBufferPurchase = AbstractC1383l.purchase(context, uri);
                    c5128l.put(uri, byteBufferPurchase);
                }
                if (byteBufferPurchase != null && isPro(objNewInstance, byteBufferPurchase, c5882l.loadAd, c5882l.crashlytics, c5882l.amazon)) {
                }
            }
            Typeface typefaceFirebase = firebase(objNewInstance);
            if (typefaceFirebase != null) {
                return Typeface.create(typefaceFirebase, i);
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC2133l
    public final Typeface crashlytics(Context context, C16926l c16926l, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = crashlytics.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (C11221l c11221l : c16926l.yandex) {
                int i2 = c11221l.billing;
                File fileCrashlytics = AbstractC1383l.crashlytics(context);
                if (fileCrashlytics != null) {
                    try {
                        if (AbstractC1383l.yandex(fileCrashlytics, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileCrashlytics);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                            fileCrashlytics.delete();
                        } else {
                            fileCrashlytics.delete();
                        }
                        if (map != null && isPro(objNewInstance, map, c11221l.purchase, c11221l.loadAd, c11221l.crashlytics)) {
                        }
                    } catch (Throwable th3) {
                        fileCrashlytics.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return firebase(objNewInstance);
        }
        return null;
    }
}
