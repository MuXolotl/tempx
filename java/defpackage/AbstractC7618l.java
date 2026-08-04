package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: lَؚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7618l {
    public static Paint crashlytics;
    public static final C1579l loadAd;
    public static final AbstractC2133l yandex;

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    static {
        Trace.beginSection("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            yandex = new C16407l();
        } else if (i >= 29) {
            yandex = new C9064l();
        } else if (i >= 28) {
            yandex = new C6488l();
        } else if (i >= 26) {
            yandex = new C6241l();
        } else if (i < 24) {
            yandex = new C0091l();
        } else {
            Method method = C17269l.amazon;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                yandex = new C17269l();
            } else {
                yandex = new C0091l();
            }
        }
        loadAd = new C1579l(16);
        crashlytics = null;
        Trace.endSection();
    }

    public static Font amazon(Typeface typeface) {
        if (crashlytics == null) {
            crashlytics = new Paint();
        }
        crashlytics.setTextSize(10.0f);
        crashlytics.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, crashlytics);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    public static Typeface crashlytics(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static String loadAd(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface yandex(Context context, InterfaceC9684l interfaceC9684l, Resources resources, int i, String str, int i2, int i3, AbstractC16763l abstractC16763l, boolean z) {
        Typeface typefaceCrashlytics;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 9;
        int i5 = -3;
        if (interfaceC9684l instanceof C7919l) {
            C7919l c7919l = (C7919l) interfaceC9684l;
            String str2 = c7919l.amazon;
            typefaceCrashlytics = null;
            int i6 = 1;
            int i7 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = crashlytics(str2)) == null) {
                ArrayList arrayList = c7919l.yandex;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i9 = 0;
                                while (true) {
                                    if (i9 < arrayList.size()) {
                                        C17129l c17129l = (C17129l) arrayList.get(i9);
                                        if (i9 == arrayList.size() - 1 && TextUtils.isEmpty(c17129l.billing)) {
                                            customFallbackBuilder.setSystemFallback(c17129l.purchase);
                                        } else {
                                            String str3 = c17129l.purchase;
                                            String str4 = c17129l.billing;
                                            Font fontAmazon = amazon(crashlytics(str3));
                                            if (fontAmazon == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + c17129l.purchase + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = new FontFamily.Builder(fontAmazon).build();
                                                } else {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(AbstractC16491l.yandex(fontAmazon).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i9++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (crashlytics(((C17129l) arrayList.get(i8)).purchase) != null) {
                                i8++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = crashlytics(((C17129l) arrayList.get(0)).purchase);
            }
            if (typefaceBuild != null) {
                if (abstractC16763l != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC10311l(abstractC16763l, typefaceBuild, i4));
                }
                loadAd.crashlytics(loadAd(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            boolean z2 = !z ? abstractC16763l != null : c7919l.crashlytics != 0;
            int i10 = z ? c7919l.loadAd : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C10685l c10685l = new C10685l();
            c10685l.f21690l = abstractC16763l;
            ArrayList arrayList2 = c7919l.yandex;
            ExecutorC14538l executorC14538l = new ExecutorC14538l(handler);
            C3797l c3797l = new C3797l(c10685l, executorC14538l, i4);
            int i11 = 6;
            if (!z2) {
                String strYandex = AbstractC8202l.yandex(i3, arrayList2);
                Typeface typeface = (Typeface) AbstractC8202l.yandex.loadAd(strYandex);
                if (typeface != null) {
                    executorC14538l.execute(new RunnableC9929l(c10685l, typeface, i11));
                    typefaceCrashlytics = typeface;
                } else {
                    C3789l c3789l = new C3789l(i6, c3797l);
                    synchronized (AbstractC8202l.crashlytics) {
                        try {
                            C5128l c5128l = AbstractC8202l.amazon;
                            ArrayList arrayList3 = (ArrayList) c5128l.get(strYandex);
                            if (arrayList3 != null) {
                                arrayList3.add(c3789l);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(c3789l);
                                c5128l.put(strYandex, arrayList4);
                                CallableC6529l callableC6529l = new CallableC6529l(strYandex, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC8202l.loadAd;
                                C3789l c3789l2 = new C3789l(2, strYandex);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC7706l runnableC7706l = new RunnableC7706l();
                                runnableC7706l.f16181l = callableC6529l;
                                runnableC7706l.f16180l = c3789l2;
                                runnableC7706l.f16183l = handler2;
                                threadPoolExecutor.execute(runnableC7706l);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    C8339l.metrica("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                C17129l c17129l2 = (C17129l) arrayList2.get(0);
                C1579l c1579l = AbstractC8202l.yandex;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{c17129l2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strYandex2 = AbstractC8202l.yandex(i3, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) AbstractC8202l.yandex.loadAd(strYandex2);
                if (typeface2 != null) {
                    executorC14538l.execute(new RunnableC9929l(c10685l, typeface2, i11));
                    typefaceCrashlytics = typeface2;
                } else if (i10 == -1) {
                    Object[] objArr = {c17129l2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    C11253l c11253lLoadAd = AbstractC8202l.loadAd(strYandex2, context, DesugarCollections.unmodifiableList(arrayList6), i3);
                    c3797l.m1426package(c11253lLoadAd);
                    typefaceCrashlytics = c11253lLoadAd.yandex;
                } else {
                    try {
                        try {
                            try {
                                C11253l c11253l = (C11253l) AbstractC8202l.loadAd.submit(new CallableC6529l(strYandex2, context, c17129l2, i3, 0)).get(i10, TimeUnit.MILLISECONDS);
                                c3797l.m1426package(c11253l);
                                typefaceCrashlytics = c11253l.yandex;
                            } catch (ExecutionException e) {
                                throw new RuntimeException(e);
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e2) {
                            throw e2;
                        }
                    } catch (InterruptedException unused3) {
                        ((ExecutorC14538l) c3797l.f7902l).execute(new RunnableC16326l((C10685l) c3797l.f7903l, i5, i7));
                    }
                }
            }
        } else {
            typefaceCrashlytics = yandex.crashlytics(context, (C16926l) interfaceC9684l, resources, i3);
            if (abstractC16763l != null) {
                if (typefaceCrashlytics != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC10311l(abstractC16763l, typefaceCrashlytics, i4));
                } else {
                    abstractC16763l.amazon(-3);
                }
            }
        }
        if (typefaceCrashlytics != null) {
            loadAd.crashlytics(loadAd(resources, i, str, i2, i3), typefaceCrashlytics);
        }
        return typefaceCrashlytics;
    }
}
