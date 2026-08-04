package defpackage;

/* JADX INFO: renamed from: lََۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10507l {
    public static final C10507l crashlytics = new C10507l("_EMPTY_", C4167l.yandex);
    public final AbstractC18643l loadAd;
    public final String yandex;

    public C10507l(String str, AbstractC18643l abstractC18643l) {
        this.yandex = str;
        this.loadAd = abstractC18643l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10507l)) {
            return false;
        }
        C10507l c10507l = (C10507l) obj;
        return this.yandex.equals(c10507l.yandex) && AbstractC8576l.yandex(this.loadAd, c10507l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "PlaybackItem(id=" + this.yandex + ", data=" + this.loadAd + ')';
    }
}
