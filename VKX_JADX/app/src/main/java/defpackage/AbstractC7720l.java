package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lًؙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7720l {
    public static C5197l subscription;
    public static final C15578l yandex = new C15578l(665120949, false, new C10272l(18));
    public static final C15578l loadAd = new C15578l(1775959061, false, new C10272l(27));
    public static final C15578l crashlytics = new C15578l(-1184022757, false, new C1104l(10));
    public static final C15578l amazon = new C15578l(2141322025, false, new C1104l(11));
    public static final C15578l purchase = new C15578l(-213017744, false, new C1104l(12));
    public static final C15578l billing = new C15578l(-1516724185, false, new C1104l(13));
    public static final C15578l mopub = new C15578l(1913989392, false, new C1104l(14));
    public static final C15578l admob = new C15578l(1731967226, false, new C10272l(19));
    public static final C15578l subs = new C15578l(231062679, false, new C10272l(20));
    public static final C15578l isPro = new C15578l(335272419, false, new C10272l(21));
    public static final C15578l firebase = new C15578l(1075014208, false, new C10272l(22));
    public static final C15578l smaato = new C15578l(1378075342, false, new C1104l(15));
    public static final C15578l remoteconfig = new C15578l(-1037365331, false, new C1104l(16));
    public static final C15578l vip = new C15578l(1196053176, false, new C10272l(23));
    public static final C15578l metrica = new C15578l(-304851371, false, new C10272l(24));
    public static final C15578l startapp = new C15578l(-200641631, false, new C10272l(25));
    public static final C15578l adcel = new C15578l(539100158, false, new C10272l(26));
    public static final C15578l ads = new C15578l(842161292, false, new C1104l(17));

    public static final void admob(EditorInfo editorInfo, CharSequence charSequence, long j, C14966l c14966l) {
        int i;
        int i2;
        int i3 = c14966l.purchase;
        int i4 = c14966l.amazon;
        boolean z = c14966l.yandex;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                C8339l.smaato("invalid ImeAction");
                return;
            }
        }
        editorInfo.imeOptions = i;
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC11965l.advert(editorInfo, c14966l.billing);
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= RecyclerView.UNDEFINED_DURATION;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else {
            i2 = 17;
            if (i4 != 5) {
                if (i4 == 6) {
                    i2 = 33;
                } else if (i4 == 7) {
                    i2 = 129;
                } else if (i4 == 8) {
                    i2 = 18;
                } else if (i4 == 9) {
                    i2 = 8194;
                } else if (i4 == 10) {
                    i2 = 145;
                } else if (i4 == 11) {
                    i2 = 113;
                } else if (i4 == 12) {
                    i2 = 97;
                } else if (i4 == 13) {
                    i2 = 49;
                } else if (i4 == 14) {
                    i2 = 65;
                } else if (i4 == 15) {
                    i2 = 81;
                } else if (i4 == 16) {
                    i2 = 177;
                } else if (i4 == 17) {
                    i2 = 193;
                } else if (i4 == 18) {
                    i2 = 4;
                } else {
                    i2 = 20;
                    if (i4 != 19) {
                        if (i4 == 20) {
                            i2 = 36;
                        } else if (i4 == 21) {
                            i2 = 4098;
                        } else if (i4 == 22) {
                            i2 = 12290;
                        } else if (i4 == 23) {
                            i2 = 8210;
                        } else if (i4 == 24) {
                            i2 = 4114;
                        } else {
                            if (i4 != 25) {
                                C8339l.smaato("Invalid Keyboard Type");
                                return;
                            }
                            i2 = 12306;
                        }
                    }
                }
            }
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 15) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (c14966l.purchase == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 15) == 1) {
            int i6 = c14966l.loadAd;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (c14966l.crashlytics) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = C12814l.crashlytics;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        AbstractC0170l.billing(editorInfo, charSequence);
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC12020l.yandex || i4 == 7 || i4 == 10 || i4 == 8 || i4 == 23 || i4 == 24 || i4 == 25) {
            AbstractC0170l.mopub(editorInfo, false);
        } else {
            AbstractC0170l.mopub(editorInfo, true);
            AbstractC5917l.m1875volatile(editorInfo);
        }
    }

    public static Executor amazon(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? AbstractC13950l.tapsense(context) : new ExecutorC10608l(new Handler(context.getMainLooper()), 0);
    }

    public static void billing(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                C8339l.metrica(AbstractC0653l.ads(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof AbstractActivityC16046l) {
            ((AbstractActivityC16046l) activity).getClass();
        }
        activity.requestPermissions(strArr, i);
    }

    public static ColorStateList crashlytics(Context context, int i) {
        ColorStateList colorStateListYandex;
        ColorStateList colorStateList;
        C5337l c5337l;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C9036l c9036l = new C9036l(resources, theme);
        synchronized (AbstractC7525l.crashlytics) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC7525l.loadAd.get(c9036l);
                colorStateListYandex = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c5337l = (C5337l) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (c5337l.loadAd.equals(resources.getConfiguration())) {
                        if (theme != null || c5337l.crashlytics != 0) {
                            if (theme == null || c5337l.crashlytics != theme.hashCode()) {
                            }
                        }
                        colorStateList = c5337l.yandex;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC7525l.yandex;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListYandex = AbstractC3053l.yandex(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListYandex == null) {
            return resources.getColorStateList(i, theme);
        }
        AbstractC7525l.yandex(c9036l, i, colorStateListYandex, theme);
        return colorStateListYandex;
    }

    public static int loadAd(Context context, String str) {
        boolean zCrashlytics;
        AbstractC5646l.metrica(str, "permission must be non-null");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        C7406l c7406l = new C7406l(context);
        if (i >= 24) {
            zCrashlytics = AbstractC11965l.crashlytics(c7406l.yandex);
        } else {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i2 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                num.getClass();
                zCrashlytics = ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i2), packageName)).intValue() == 0;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        return zCrashlytics ? 0 : -1;
    }

    public static void mopub(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC5941l.m1915while(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static final C5197l purchase() {
        C5197l c5197l = subscription;
        if (c5197l != null) {
            return c5197l;
        }
        C10943l c10943l = new C10943l("Rounded.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC8192l.yandex;
        C8990l c8990l = new C8990l(C9735l.loadAd);
        C15659l c15659l = new C15659l();
        c15659l.billing(12.0f, 8.0f);
        c15659l.loadAd(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c15659l.mopub(-0.9f, -2.0f, -2.0f, -2.0f);
        c15659l.mopub(-2.0f, 0.9f, -2.0f, 2.0f);
        c15659l.mopub(0.9f, 2.0f, 2.0f, 2.0f);
        c15659l.yandex();
        c15659l.billing(12.0f, 10.0f);
        c15659l.loadAd(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        c15659l.mopub(0.9f, 2.0f, 2.0f, 2.0f);
        c15659l.mopub(2.0f, -0.9f, 2.0f, -2.0f);
        c15659l.mopub(-0.9f, -2.0f, -2.0f, -2.0f);
        c15659l.yandex();
        c15659l.billing(12.0f, 16.0f);
        c15659l.loadAd(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        c15659l.mopub(0.9f, 2.0f, 2.0f, 2.0f);
        c15659l.mopub(2.0f, -0.9f, 2.0f, -2.0f);
        c15659l.mopub(-0.9f, -2.0f, -2.0f, -2.0f);
        c15659l.yandex();
        C10943l.yandex(c10943l, c15659l.f30611l, c8990l);
        C5197l c5197lLoadAd = c10943l.loadAd();
        subscription = c5197lLoadAd;
        return c5197lLoadAd;
    }

    public static final void yandex(InterfaceC6984l interfaceC6984l, InterfaceC6984l interfaceC6984l2) {
        for (Map.Entry entry : interfaceC6984l2.mopub()) {
            interfaceC6984l.mo199class((String) entry.getKey(), (List) entry.getValue());
        }
    }
}
