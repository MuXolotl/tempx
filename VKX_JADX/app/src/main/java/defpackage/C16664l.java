package defpackage;

import android.text.TextUtils;

/* JADX INFO: renamed from: lٖ۟ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16664l {
    public final boolean crashlytics;
    public final boolean loadAd;
    public final String yandex;

    public C16664l(String str, boolean z, boolean z2) {
        this.yandex = str;
        this.loadAd = z;
        this.crashlytics = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C16664l.class) {
            C16664l c16664l = (C16664l) obj;
            if (TextUtils.equals(this.yandex, c16664l.yandex) && this.loadAd == c16664l.loadAd && this.crashlytics == c16664l.crashlytics) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC12589l.advert(31, 31, this.yandex) + (this.loadAd ? 1231 : 1237)) * 31) + (this.crashlytics ? 1231 : 1237);
    }
}
