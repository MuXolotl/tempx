package defpackage;

import android.util.Log;

/* JADX INFO: renamed from: lؘؚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7311l {
    public static final C18086l yandex = C18086l.yandex;

    public static final void crashlytics(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, String str) {
        loadAd(new C6611l(abstractComponentCallbacksC4411l, "Attempting to reuse fragment " + abstractComponentCallbacksC4411l + " with previous ID " + str));
        yandex(abstractComponentCallbacksC4411l).getClass();
    }

    public static void loadAd(C6611l c6611l) {
        if (C13734l.m3727volatile(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c6611l.f13848l.getClass().getName()), c6611l);
        }
    }

    public static C18086l yandex(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        while (abstractComponentCallbacksC4411l != null) {
            if (abstractComponentCallbacksC4411l.f8954l != null && abstractComponentCallbacksC4411l.f8984l) {
                abstractComponentCallbacksC4411l.admob();
            }
            abstractComponentCallbacksC4411l = abstractComponentCallbacksC4411l.f8989l;
        }
        return yandex;
    }
}
