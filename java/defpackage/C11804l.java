package defpackage;

/* JADX INFO: renamed from: lِِْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11804l {
    public final C13177l crashlytics;
    public final C7190l loadAd;
    public final Object yandex;

    public C11804l(Object obj, C7190l c7190l, C13177l c13177l) {
        this.yandex = obj;
        this.loadAd = c7190l;
        this.crashlytics = c13177l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11804l)) {
            return false;
        }
        C11804l c11804l = (C11804l) obj;
        C7190l c7190l = c11804l.loadAd;
        C7190l c7190l2 = this.loadAd;
        return AbstractC8576l.yandex(c7190l2, c7190l) && c7190l2.yandex(this.yandex, c11804l.yandex) && AbstractC8576l.yandex(this.crashlytics, c11804l.crashlytics);
    }

    public final int hashCode() {
        C7190l c7190l = this.loadAd;
        return this.crashlytics.hashCode() + ((c7190l.loadAd(this.yandex) + (c7190l.hashCode() * 31)) * 31);
    }
}
