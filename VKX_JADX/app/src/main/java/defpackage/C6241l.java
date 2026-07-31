package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lَؙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C6241l extends C0091l {
    public final Constructor admob;
    public final Method firebase;
    public final Method isPro;
    public final Class mopub;
    public final Method remoteconfig;
    public final Method smaato;
    public final Method subs;

    public C6241l() throws NoSuchMethodException {
        Method methodStartapp;
        Constructor<?> constructor;
        Method methodMetrica;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodMetrica = metrica(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodStartapp = startapp(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodStartapp = null;
            constructor = null;
            methodMetrica = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.mopub = cls;
        this.admob = constructor;
        this.subs = methodMetrica;
        this.isPro = method;
        this.firebase = method2;
        this.smaato = method3;
        this.remoteconfig = methodStartapp;
    }

    public static Method metrica(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    @Override // defpackage.C0091l, defpackage.AbstractC2133l
    public final Typeface amazon(Context context, C5882l[] c5882lArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceRemoteconfig;
        boolean zBooleanValue;
        if (c5882lArr.length >= 1) {
            Method method = this.subs;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (C5882l c5882l : c5882lArr) {
                        if (c5882l.billing == 0) {
                            Uri uri = c5882l.yandex;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC1383l.purchase(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.admob.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c5882lArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.smaato;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!vip(objNewInstance) || (typefaceRemoteconfig = remoteconfig(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceRemoteconfig, i);
                            }
                            C5882l c5882l2 = c5882lArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c5882l2.yandex);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.isPro.invoke(objNewInstance, byteBuffer, Integer.valueOf(c5882l2.loadAd), null, Integer.valueOf(c5882l2.crashlytics), Integer.valueOf(c5882l2.amazon ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    C5882l c5882lMopub = AbstractC2133l.mopub(c5882lArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c5882lMopub.yandex, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c5882lMopub.crashlytics).setItalic(c5882lMopub.amazon).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC2133l
    public final Typeface billing(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.subs;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.billing(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.admob.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!smaato(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.smaato.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (vip(objNewInstance)) {
                return remoteconfig(objNewInstance);
            }
        }
        return null;
    }

    @Override // defpackage.C0091l, defpackage.AbstractC2133l
    public final Typeface crashlytics(Context context, C16926l c16926l, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.subs;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.crashlytics(context, c16926l, resources, i);
        }
        try {
            objNewInstance = this.admob.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C11221l[] c11221lArr = c16926l.yandex;
            int length = c11221lArr.length;
            int i2 = 0;
            while (i2 < length) {
                C11221l c11221l = c11221lArr[i2];
                String str = c11221l.yandex;
                int i3 = c11221l.purchase;
                int i4 = c11221l.loadAd;
                boolean z = c11221l.crashlytics;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c11221l.amazon);
                C6241l c6241l = this;
                Context context2 = context;
                if (c6241l.smaato(context2, objNewInstance, str, i3, i4, z ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    i2++;
                    this = c6241l;
                    context = context2;
                } else {
                    try {
                        c6241l.smaato.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            C6241l c6241l2 = this;
            if (c6241l2.vip(objNewInstance)) {
                return c6241l2.remoteconfig(objNewInstance);
            }
        }
        return null;
    }

    public Typeface remoteconfig(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.mopub, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.remoteconfig.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean smaato(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.subs.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method startapp(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final boolean vip(Object obj) {
        try {
            return ((Boolean) this.firebase.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
