package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؘ۠ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6016l {
    public static final Pattern amazon = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public C6016l(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !amazon.matcher(strSubstring).matches()) {
            C8339l.metrica(AbstractC15560l.Signature("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.yandex = strSubstring;
        this.loadAd = str;
        this.crashlytics = AbstractC9361l.pro(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6016l)) {
            return false;
        }
        C6016l c6016l = (C6016l) obj;
        return this.yandex.equals(c6016l.yandex) && this.loadAd.equals(c6016l.loadAd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.loadAd, this.yandex});
    }
}
