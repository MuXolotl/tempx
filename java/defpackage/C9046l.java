package defpackage;

/* JADX INFO: renamed from: lٌۛٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9046l {
    public final Long loadAd;
    public final String yandex;

    public C9046l(String str, Long l) {
        this.yandex = str;
        this.loadAd = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9046l)) {
            return false;
        }
        C9046l c9046l = (C9046l) obj;
        return this.yandex.equals(c9046l.yandex) && this.loadAd.equals(c9046l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.yandex + ", value=" + this.loadAd + ')';
    }
}
