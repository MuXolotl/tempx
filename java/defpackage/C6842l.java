package defpackage;

import android.app.Notification;

/* JADX INFO: renamed from: lؙۣؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6842l {
    public final Notification crashlytics;
    public final int loadAd;
    public final int yandex;

    public C6842l(int i, Notification notification, int i2) {
        this.yandex = i;
        this.crashlytics = notification;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6842l.class != obj.getClass()) {
            return false;
        }
        C6842l c6842l = (C6842l) obj;
        if (this.yandex == c6842l.yandex && this.loadAd == c6842l.loadAd) {
            return this.crashlytics.equals(c6842l.crashlytics);
        }
        return false;
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.yandex + ", mForegroundServiceType=" + this.loadAd + ", mNotification=" + this.crashlytics + '}';
    }
}
