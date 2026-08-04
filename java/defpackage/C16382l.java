package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lَٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16382l {
    public static C16382l crashlytics;
    public static final Pattern loadAd = Pattern.compile("\\AA[\\w-]{38}\\z");
    public final C16367l yandex;

    public C16382l(C16367l c16367l) {
        this.yandex = c16367l;
    }

    public final boolean yandex(C16745l c16745l) {
        if (TextUtils.isEmpty(c16745l.crashlytics)) {
            return true;
        }
        long j = c16745l.billing + c16745l.purchase;
        this.yandex.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
