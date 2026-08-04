package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* JADX INFO: renamed from: lؑؑٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0022l {
    public final String crashlytics;
    public final boolean loadAd;
    public final String yandex;

    public C0022l(String str, String str2) {
        AbstractC1051l.mopub(str, "The log tag cannot be null or empty.");
        this.yandex = str;
        this.crashlytics = str2;
        this.loadAd = str.length() <= 23;
    }

    public final String amazon(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.crashlytics;
        String strSignature = TextUtils.isEmpty(str2) ? "" : AbstractC15560l.Signature("[", str2, "] ");
        return !TextUtils.isEmpty(strSignature) ? strSignature.concat(str) : str;
    }

    public final void crashlytics(Object... objArr) {
        Log.e(this.yandex, amazon("Bundle is null", objArr));
    }

    public final void loadAd(String str, Object... objArr) {
        if (Build.TYPE.equals("user") || !this.loadAd) {
            return;
        }
        String str2 = this.yandex;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, amazon(str, objArr));
        }
    }

    public final void yandex(Exception exc, String str, Object... objArr) {
        if (Build.TYPE.equals("user") || !this.loadAd) {
            return;
        }
        String str2 = this.yandex;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, amazon(str, objArr), exc);
        }
    }
}
