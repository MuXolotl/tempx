package defpackage;

/* JADX INFO: renamed from: lًۢ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8344l implements InterfaceC11609l {
    public final String crashlytics;
    public final int loadAd;
    public final String yandex;

    public C8344l(String str, int i, String str2) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8344l)) {
            return false;
        }
        C8344l c8344l = (C8344l) obj;
        return AbstractC8576l.yandex(this.yandex, c8344l.yandex) && this.loadAd == c8344l.loadAd && AbstractC8576l.yandex(this.crashlytics, c8344l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex.hashCode() * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Present(uid=");
        sb.append(this.yandex);
        sb.append(", size=");
        sb.append(this.loadAd);
        sb.append(", name=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
