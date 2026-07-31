package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lًۖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8202l {
    public static final C5128l amazon;
    public static final Object crashlytics;
    public static final ThreadPoolExecutor loadAd;
    public static final C1579l yandex = new C1579l(16);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC12626l(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        loadAd = threadPoolExecutor;
        crashlytics = new Object();
        amazon = new C5128l(0);
    }

    public static C11253l loadAd(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceAmazon;
        C1579l c1579l = yandex;
        Trace.beginSection("getFontSync");
        try {
            Typeface typeface = (Typeface) c1579l.loadAd(str);
            if (typeface != null) {
                C11253l c11253l = new C11253l(typeface);
                Trace.endSection();
                return c11253l;
            }
            try {
                C17368l c17368lYandex = AbstractC16813l.yandex(context, list);
                List list2 = c17368lYandex.loadAd;
                int i3 = c17368lYandex.yandex;
                if (i3 == 0) {
                    C5882l[] c5882lArr = (C5882l[]) list2.get(0);
                    if (c5882lArr == null || c5882lArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = c5882lArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = c5882lArr[i4].billing;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    C11253l c11253l2 = new C11253l(i2);
                    Trace.endSection();
                    return c11253l2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    C5882l[] c5882lArr2 = (C5882l[]) list2.get(0);
                    AbstractC2133l abstractC2133l = AbstractC7618l.yandex;
                    Trace.beginSection("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceAmazon = AbstractC7618l.yandex.amazon(context, c5882lArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    AbstractC2133l abstractC2133l2 = AbstractC7618l.yandex;
                    Trace.beginSection("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceAmazon = AbstractC7618l.yandex.purchase(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceAmazon == null) {
                    C11253l c11253l3 = new C11253l(-3);
                    Trace.endSection();
                    return c11253l3;
                }
                c1579l.crashlytics(str, typefaceAmazon);
                C11253l c11253l4 = new C11253l(typefaceAmazon);
                Trace.endSection();
                return c11253l4;
            } catch (PackageManager.NameNotFoundException unused) {
                C11253l c11253l5 = new C11253l(-1);
                Trace.endSection();
                return c11253l5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public static String yandex(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C17129l) list.get(i2)).mopub);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
