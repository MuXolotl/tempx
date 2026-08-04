package defpackage;

import android.content.pm.PackageManager;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;

/* JADX INFO: renamed from: lؖ۠ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4444l {
    public static final C4444l crashlytics = new C4444l(new HashMap());
    public final HashMap loadAd = new HashMap();
    public final boolean yandex = true;

    public C4444l(HashMap map) {
    }

    public final boolean yandex(C3185l c3185l) {
        int i = c3185l.crashlytics;
        String str = c3185l.loadAd;
        if (Log.isLoggable("CarApp.Val", 3)) {
            Log.d("CarApp.Val", "Evaluating " + c3185l);
        }
        if (this.yandex) {
            if (Log.isLoggable("CarApp.Val", 3)) {
                Log.d("CarApp.Val", "Accepted - Validator disabled, all hosts allowed");
            }
            return true;
        }
        HashMap map = this.loadAd;
        Pair pair = (Pair) map.get(str);
        Boolean bool = null;
        if (pair != null && ((Integer) pair.first).intValue() == i) {
            bool = (Boolean) pair.second;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Log.d("CarApp.Val", "PackageManager is null. Package info cannot be found for package " + str);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("CarApp.Val", "Package " + str + " not found", e);
        }
        Log.w("CarApp.Val", "Rejected - package name " + str + " not found");
        map.put(str, Pair.create(Integer.valueOf(i), false));
        return false;
    }
}
