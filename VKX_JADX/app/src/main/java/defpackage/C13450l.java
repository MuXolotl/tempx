package defpackage;

/* JADX INFO: renamed from: lْ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13450l {
    public final C14473l crashlytics;
    public final C14115l loadAd;
    public final String yandex;

    public C13450l(String str, C14115l c14115l, C14473l c14473l) {
        this.yandex = str;
        this.loadAd = c14115l;
        this.crashlytics = c14473l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13450l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C13450l c13450l = (C13450l) obj;
        return AbstractC8576l.yandex(this.yandex, c13450l.yandex) && AbstractC8576l.yandex(this.crashlytics, c13450l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (this.yandex.hashCode() * 31);
    }
}
