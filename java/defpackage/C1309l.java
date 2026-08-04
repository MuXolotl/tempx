package defpackage;

/* JADX INFO: renamed from: lؒۙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1309l {
    public final String loadAd;
    public final String yandex;

    public C1309l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1309l.class != obj.getClass()) {
            return false;
        }
        C1309l c1309l = (C1309l) obj;
        return AbstractC8576l.yandex(this.yandex, c1309l.yandex) && AbstractC8576l.yandex(this.loadAd, c1309l.loadAd);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        return AbstractC5020l.inmobi(1) + ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + 1237) * 31);
    }
}
