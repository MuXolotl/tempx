package defpackage;

/* JADX INFO: renamed from: lؗۢۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5232l {
    public volatile AbstractC8481l crashlytics;
    public volatile AbstractC8481l loadAd;
    public volatile AbstractC8481l yandex;

    public abstract AbstractC8481l amazon();

    public abstract AbstractC8481l billing();

    public final boolean crashlytics(String str) {
        if (this.yandex == null) {
            synchronized (this) {
                try {
                    if (this.yandex == null) {
                        this.yandex = billing();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.yandex.contains(str);
    }

    public final boolean loadAd(String str) {
        if (this.loadAd == null) {
            synchronized (this) {
                try {
                    if (this.loadAd == null) {
                        this.loadAd = purchase();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.loadAd.contains(str);
    }

    public abstract AbstractC8481l purchase();

    public final boolean yandex(String str) {
        if (this.crashlytics == null) {
            synchronized (this) {
                try {
                    if (this.crashlytics == null) {
                        this.crashlytics = amazon();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.crashlytics.contains(str);
    }
}
