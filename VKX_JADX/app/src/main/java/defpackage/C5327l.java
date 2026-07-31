package defpackage;

/* JADX INFO: renamed from: lؘؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5327l {
    public final int crashlytics;
    public final C13654l loadAd;
    public final C13698l yandex;

    public C5327l(C13698l c13698l, C13654l c13654l, int i) {
        this.yandex = c13698l;
        this.loadAd = c13654l;
        this.crashlytics = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5327l)) {
            return false;
        }
        C5327l c5327l = (C5327l) obj;
        return AbstractC8576l.yandex(this.yandex, c5327l.yandex) && AbstractC8576l.yandex(this.loadAd, c5327l.loadAd) && this.crashlytics == c5327l.crashlytics;
    }

    public final int hashCode() {
        return ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientWithInformation(client=");
        sb.append(this.yandex);
        sb.append(", device=");
        sb.append(this.loadAd);
        sb.append(", protocolVersion=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }
}
