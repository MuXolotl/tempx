package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lؚۜؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7525l {
    public static final ThreadLocal yandex = new ThreadLocal();
    public static final WeakHashMap loadAd = new WeakHashMap(0);
    public static final Object crashlytics = new Object();

    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    public static Typeface crashlytics(Context context, int i, TypedValue typedValue, int i2, AbstractC16763l abstractC16763l, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceYandex = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C1579l c1579l = AbstractC7618l.loadAd;
            Typeface typeface = (Typeface) c1579l.loadAd(AbstractC7618l.loadAd(resources, i, string, i3, i2));
            int i4 = 9;
            if (typeface != null) {
                if (abstractC16763l != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC10311l(abstractC16763l, typeface, i4));
                }
                typefaceYandex = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC9684l interfaceC9684lMopub = AbstractC7076l.mopub(resources.getXml(i), resources);
                        if (interfaceC9684lMopub == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC16763l != null) {
                                abstractC16763l.amazon(-3);
                            }
                        } else {
                            typefaceYandex = AbstractC7618l.yandex(context, interfaceC9684lMopub, resources, i, string, typedValue.assetCookie, i2, abstractC16763l, z);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceBilling = AbstractC7618l.yandex.billing(context, resources, i, string, i2);
                        if (typefaceBilling != null) {
                            c1579l.crashlytics(AbstractC7618l.loadAd(resources, i, string, i5, i2), typefaceBilling);
                        }
                        if (abstractC16763l != null) {
                            if (typefaceBilling != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC10311l(abstractC16763l, typefaceBilling, i4));
                            } else {
                                abstractC16763l.amazon(-3);
                            }
                        }
                        typefaceYandex = typefaceBilling;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (abstractC16763l != null) {
                        abstractC16763l.amazon(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (abstractC16763l != null) {
                        abstractC16763l.amazon(-3);
                    }
                }
            }
        } else if (abstractC16763l != null) {
            abstractC16763l.amazon(-3);
        }
        if (typefaceYandex != null || abstractC16763l != null || z2) {
            return typefaceYandex;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    public static Typeface loadAd(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return crashlytics(context, i, new TypedValue(), 0, null, false, false);
    }

    public static void yandex(C9036l c9036l, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (crashlytics) {
            try {
                WeakHashMap weakHashMap = loadAd;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c9036l);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c9036l, sparseArray);
                }
                sparseArray.append(i, new C5337l(colorStateList, c9036l.yandex.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
