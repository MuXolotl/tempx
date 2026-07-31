package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٍۦۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9961l {
    public static C17646l crashlytics;
    public final ArrayList loadAd = new ArrayList();
    public final Context yandex;

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public C9961l(Context context) {
        this.yandex = context;
    }

    public static C9961l amazon(Context context) {
        loadAd();
        if (crashlytics == null) {
            crashlytics = new C17646l(context.getApplicationContext());
        }
        ArrayList arrayList = crashlytics.admob;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                C9961l c9961l = new C9961l(context);
                arrayList.add(new WeakReference(c9961l));
                return c9961l;
            }
            C9961l c9961l2 = (C9961l) ((WeakReference) arrayList.get(size)).get();
            if (c9961l2 == null) {
                arrayList.remove(size);
            } else if (c9961l2.yandex == context) {
                return c9961l2;
            }
        }
    }

    public static void billing(C1536l c1536l) {
        loadAd();
        C3288l c3288l = crashlytics().ads;
        if (c3288l == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        AbstractC5917l.m1870private(c3288l.f7032l, c1536l != null ? AbstractC5917l.m1873throw(c1536l) : null);
    }

    public static C17646l crashlytics() {
        C17646l c17646l = crashlytics;
        if (c17646l != null) {
            return c17646l;
        }
        C8339l.smaato("getGlobalRouter cannot be called when sGlobal is null");
        return null;
    }

    public static void loadAd() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        C8339l.smaato("The media router service must only be accessed on the application's main thread.");
    }

    public static void mopub(int i) {
        if (i < 0 || i > 3) {
            C8339l.metrica("Unsupported reason to unselect route");
            return;
        }
        loadAd();
        C17646l c17646lCrashlytics = crashlytics();
        C12736l c12736lCrashlytics = c17646lCrashlytics.crashlytics();
        if (c17646lCrashlytics.mopub() != c12736lCrashlytics) {
            c17646lCrashlytics.isPro(c12736lCrashlytics, i, true);
        }
    }

    public final void purchase(AbstractC2660l abstractC2660l) {
        if (abstractC2660l == null) {
            C8339l.metrica("callback must not be null");
            return;
        }
        loadAd();
        ArrayList arrayList = this.loadAd;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((C11179l) arrayList.get(i)).loadAd == abstractC2660l) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            crashlytics().smaato();
        }
    }

    public final void yandex(C16710l c16710l, AbstractC2660l abstractC2660l, int i) {
        C11179l c11179l;
        C16710l c16710l2;
        if (abstractC2660l == null) {
            C8339l.metrica("callback must not be null");
            return;
        }
        loadAd();
        ArrayList arrayList = this.loadAd;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C11179l) arrayList.get(i2)).loadAd == abstractC2660l) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            c11179l = new C11179l(this, abstractC2660l);
            arrayList.add(c11179l);
        } else {
            c11179l = (C11179l) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != c11179l.amazon) {
            c11179l.amazon = i;
            z = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        c11179l.purchase = jElapsedRealtime;
        C16710l c16710l3 = c11179l.crashlytics;
        c16710l3.yandex();
        c16710l.yandex();
        if (c16710l3.loadAd.containsAll(c16710l.loadAd)) {
            z2 = z;
        } else {
            C16710l c16710l4 = c11179l.crashlytics;
            if (c16710l4 == null) {
                C8339l.metrica("selector must not be null");
                return;
            }
            c16710l4.yandex();
            ArrayList<String> arrayList2 = !c16710l4.loadAd.isEmpty() ? new ArrayList<>(c16710l4.loadAd) : null;
            ArrayList<String> arrayListLoadAd = c16710l.loadAd();
            if (!arrayListLoadAd.isEmpty()) {
                for (String str : arrayListLoadAd) {
                    if (str == null) {
                        C8339l.metrica("category must not be null");
                        return;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                c16710l2 = C16710l.crashlytics;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                c16710l2 = new C16710l(bundle, arrayList2);
            }
            c11179l.crashlytics = c16710l2;
        }
        if (z2) {
            crashlytics().smaato();
        }
    }
}
