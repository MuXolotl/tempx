package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lؓٝٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC1988l implements Callable {
    public final /* synthetic */ Object amazon;
    public final /* synthetic */ String crashlytics;
    public final /* synthetic */ SharedPreferences loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ CallableC1988l(SharedPreferences sharedPreferences, String str, Object obj, int i) {
        this.yandex = i;
        this.loadAd = sharedPreferences;
        this.crashlytics = str;
        this.amazon = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i = this.yandex;
        Object obj = this.amazon;
        String str = this.crashlytics;
        SharedPreferences sharedPreferences = this.loadAd;
        switch (i) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            default:
                return sharedPreferences.getString(str, (String) obj);
        }
    }
}
