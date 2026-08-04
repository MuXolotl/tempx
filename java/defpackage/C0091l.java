package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lؑؕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C0091l extends AbstractC2133l {
    public static Method amazon = null;
    public static boolean billing = false;
    public static Constructor crashlytics;
    public static Class loadAd;
    public static Method purchase;

    public static void firebase() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (billing) {
            return;
        }
        billing = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        crashlytics = constructor;
        loadAd = cls;
        amazon = method2;
        purchase = method;
    }

    public static boolean isPro(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        firebase();
        try {
            return ((Boolean) amazon.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            C11467l.metrica(e);
            return false;
        }
    }

    @Override // defpackage.AbstractC2133l
    public Typeface amazon(Context context, C5882l[] c5882lArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (c5882lArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(AbstractC2133l.mopub(c5882lArr, i).yandex, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (ErrnoException unused) {
                        }
                        if (file != null && file.canRead()) {
                            Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile2;
                        }
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            File fileCrashlytics = AbstractC1383l.crashlytics(context);
                            if (fileCrashlytics == null) {
                                typefaceCreateFromFile = null;
                            } else {
                                try {
                                    if (AbstractC1383l.loadAd(fileCrashlytics, fileInputStream)) {
                                        typefaceCreateFromFile = Typeface.createFromFile(fileCrashlytics.getPath());
                                        fileCrashlytics.delete();
                                    } else {
                                        fileCrashlytics.delete();
                                        typefaceCreateFromFile = null;
                                    }
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    fileCrashlytics.delete();
                                    throw th;
                                }
                            }
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile;
                        } catch (Throwable th2) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC2133l
    public Typeface crashlytics(Context context, C16926l c16926l, Resources resources, int i) throws NoSuchMethodException {
        firebase();
        try {
            Object objNewInstance = crashlytics.newInstance(null);
            for (C11221l c11221l : c16926l.yandex) {
                File fileCrashlytics = AbstractC1383l.crashlytics(context);
                if (fileCrashlytics == null) {
                    return null;
                }
                try {
                    if (!AbstractC1383l.yandex(fileCrashlytics, resources, c11221l.billing)) {
                        return null;
                    }
                    if (!isPro(objNewInstance, fileCrashlytics.getPath(), c11221l.loadAd, c11221l.crashlytics)) {
                        return null;
                    }
                    fileCrashlytics.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileCrashlytics.delete();
                }
            }
            firebase();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) loadAd, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) purchase.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                C11467l.metrica(e);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            C11467l.metrica(e2);
            return null;
        }
    }
}
