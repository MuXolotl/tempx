package defpackage;

/* JADX INFO: renamed from: lٕؖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4139l {
    public final /* synthetic */ C3528l crashlytics;
    public int loadAd;
    public final Object yandex;

    public C4139l(C3528l c3528l, int i) {
        this.crashlytics = c3528l;
        this.yandex = c3528l.yandex[i];
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4139l) {
            C4139l c4139l = (C4139l) obj;
            if (yandex() == c4139l.yandex() && AbstractC7000l.loadAd(this.yandex, c4139l.yandex)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.yandex;
        return yandex() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.yandex);
        int iYandex = yandex();
        if (iYandex == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iYandex;
    }

    public final int yandex() {
        int i = this.loadAd;
        Object obj = this.yandex;
        C3528l c3528l = this.crashlytics;
        if (i == -1 || i >= c3528l.crashlytics || !AbstractC7000l.loadAd(obj, c3528l.yandex[i])) {
            this.loadAd = c3528l.crashlytics(obj);
        }
        int i2 = this.loadAd;
        if (i2 == -1) {
            return 0;
        }
        return c3528l.loadAd[i2];
    }
}
